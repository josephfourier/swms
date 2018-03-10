package com.thinkjoy.swms.server.controller;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.ams.dao.model.AmsApp;
import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.ams.rpc.api.AmsAppService;
import com.thinkjoy.common.base.BaseConstants;
import com.thinkjoy.swms.common.base.SwmsResult;
import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.server.security.TokenUtils;
import com.thinkjoy.ucenter.dao.model.UcenterDictValues;
import com.thinkjoy.ucenter.dao.model.UcenterDictValuesExample;
import com.thinkjoy.ucenter.dao.model.ucenterDto.BusInfo;
import com.thinkjoy.ucenter.dao.model.ucenterDto.DepartmentInfo;
import com.thinkjoy.ucenter.dao.model.ucenterDto.UcenterTeacherDto;
import com.thinkjoy.ucenter.rpc.api.UcenterDepartmentBusService;
import com.thinkjoy.ucenter.rpc.api.UcenterDictValuesService;
import com.thinkjoy.ucenter.rpc.api.UcenterTeacherService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * 获取用户权限菜单
 *
 * @author Miracle.wang
 * @date 18/3/1
 */
@RestController
@Slf4j
@RequestMapping("/manage")
public class SwmsDataScopePermsController {

    @Inject
    UcenterTeacherService ucenterTeacherService;

    @Inject
    UcenterDepartmentBusService ucenterDepartmentBusService;

    @Inject
    UcenterDictValuesService ucenterDictValuesService;

    @Inject
    AmsAppService amsAppService;

    @GetMapping(value = "/dataScopePerms")
    @ApiOperation(value = "dataScopePerms", notes = "账户权限列表")
    //@SwmsRequiresPerms("swms:datascopeperms:read")
    public Object dataScopePerms(HttpServletRequest request) {
        OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);

        AmsApp appId = amsAppService.getIsPersonalByClientId(oauthAccessToken.getClientId());

        HashMap<String, Object> params = new HashMap<>();
        params.put("relationCode", oauthAccessToken.getRelationCode());
        params.put("appId", appId.getAppId());
        //只查老师的信息
        params.put("usertypeId", BaseConstants.UserType.TEACHER);



        //获取教师等级字典
        UcenterDictValuesExample ucenterDictValuesExample = new UcenterDictValuesExample();
        ucenterDictValuesExample.createCriteria()
                .andDictCodeEqualTo(BaseConstants.Dict.TEACHERLEVEl);
        List<UcenterDictValues> ucenterDictValues = ucenterDictValuesService.selectByExample(ucenterDictValuesExample);

        //获取权限范围
        List<UcenterTeacherDto> ucenterTeacherDtos = ucenterTeacherService.selectDataScopeUcenterTeacherInfoByAppIdAndRelationCode(params);
        HashMap<String, String> params1 = new HashMap<>();
        for (UcenterTeacherDto u : ucenterTeacherDtos) {
            for (DepartmentInfo d : u.getDepartmentInfos()) {
                //获取等级名称
                for (UcenterDictValues dictValues : ucenterDictValues) {
                    if (d.getTeacherLevel().equals(dictValues.getValueKey())) {
                        d.setTeacherLevelName(dictValues.getValueName());
                    }
                }
                //获取权限范围名称
                if (d.getTeacherLevel() != null && !d.getTeacherLevel().equals(BaseConstants.PostLevel.YIJI) && d.getDepartmentId() != null) {
                    params1.put("departmentId", String.valueOf(d.getDepartmentId()));
                    params1.put("teacherLevel", d.getTeacherLevel());
                    List<BusInfo> busInfos = ucenterDepartmentBusService.selectBusInfoByBusIdAndTeacherLevel(params1);
                    d.setBusInfoes(busInfos);
                }
            }
        }

        return new SwmsResult(SwmsResultConstant.SUCCESS, ucenterTeacherDtos);
    }

}
