package com.thinkjoy.swms.server.security;

import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.common.base.BaseConstants;
import com.thinkjoy.common.util.SpringContextUtil;
import com.thinkjoy.ucenter.dao.model.UcenterClass;
import com.thinkjoy.ucenter.dao.model.UcenterClassExample;
import com.thinkjoy.ucenter.dao.model.UcenterFaculty;
import com.thinkjoy.ucenter.dao.model.UcenterFacultyExample;
import com.thinkjoy.ucenter.dao.model.ucenterDto.BusInfo;
import com.thinkjoy.ucenter.dao.model.ucenterDto.DepartmentInfo;
import com.thinkjoy.ucenter.dao.model.ucenterDto.UcenterTeacherDto;
import com.thinkjoy.ucenter.rpc.api.UcenterClassService;
import com.thinkjoy.ucenter.rpc.api.UcenterFacultyService;
import com.thinkjoy.ucenter.rpc.api.UcenterTeacherService;
import org.apache.commons.collections.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

/**
 * Created on 18/3/7.
 *
 * @author wangcheng
 */
public class DataScopeUtils {

    public static UcenterTeacherDto acquireCurrentDataScope(HttpServletRequest request) {
        UcenterTeacherService ucenterTeacherService = (UcenterTeacherService) SpringContextUtil
                .getBean("ucenterTeacherService");

        OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);

        HashMap<String, Object> params = new HashMap<>();
        params.put("relationCode", oauthAccessToken.getRelationCode());
        params.put("appId", oauthAccessToken.getClientId());
        params.put("userId", oauthAccessToken.getUserId());
        //只查老师的信息
        params.put("usertypeId", BaseConstants.UserType.TEACHER);

        List<UcenterTeacherDto> ucenterTeacherDtos = ucenterTeacherService.selectDataScopeUcenterTeacherInfoByAppIdAndRelationCode(params);

        if (CollectionUtils.isNotEmpty(ucenterTeacherDtos)) {
            return ucenterTeacherDtos.get(0);
        }
        return null;
    }


    /**
     * 获取所有院系
     */
    public static Set<Integer> obtainAllClassId(UcenterTeacherDto ucenterTeacherDto) {
        UcenterFacultyService ucenterFacultyService =
                (UcenterFacultyService) SpringContextUtil.getBean("ucenterFacultyService");
        UcenterClassService ucenterClassService =
                (UcenterClassService) SpringContextUtil.getBean("ucenterFacultyService");

        List<UcenterClass> ucenterClasses = new ArrayList<>();
        Set<Integer> classIds = new HashSet<>();
        if (ucenterTeacherDto != null) {
            for (DepartmentInfo d : ucenterTeacherDto.getDepartmentInfos()) {
                List<BusInfo> busInfoes = d.getBusInfoes();
                if (CollectionUtils.isNotEmpty(busInfoes)) {
                    List<String> facultyCodes = new ArrayList<>();
                    for (BusInfo b : busInfoes) {
                        //获取权限范围名称
                        if (d.getTeacherLevel() != null
                                && !d.getTeacherLevel().equals(BaseConstants.PostLevel.ERJI)) {

                            UcenterFacultyExample ucenterFacultyExample = new UcenterFacultyExample();
                            ucenterFacultyExample.createCriteria()
                                    .andFacultyIdEqualTo(Integer.valueOf(b.getBusId()));
                            UcenterFaculty ucenterFaculty = ucenterFacultyService.selectFirstByExample(ucenterFacultyExample);
                            facultyCodes.add(ucenterFaculty.getFacultyCode());

                            UcenterClassExample ucenterClassExample = new UcenterClassExample();
                            ucenterClassExample.createCriteria()
                                    .andSpecialtyCodeIn(facultyCodes);
                            ucenterClasses = ucenterClassService.selectByExample(ucenterClassExample);

                            for (UcenterClass uc : ucenterClasses) {
                                classIds.add(uc.getClassId());
                            }

                        } else if (d.getTeacherLevel() != null
                                && !d.getTeacherLevel().equals(BaseConstants.PostLevel.SANJI)) {
                            classIds.add(Integer.valueOf(b.getBusId()));
                        }
                    }
                }
            }

        }
        return classIds;
    }
}
