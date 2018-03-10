package com.thinkjoy.swms.rpc.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.ams.dao.model.*;
import com.thinkjoy.ams.rpc.api.AmsAppService;
import com.thinkjoy.ams.rpc.api.AmsApppermissionService;
import com.thinkjoy.ams.rpc.api.AmsApproleService;
import com.thinkjoy.common.base.BaseConstants;
import com.thinkjoy.exception.BusindessException;
import com.thinkjoy.swms.rpc.api.SwmsMenusService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wangcheng
 * @date 18/3/5
 */
@Slf4j
@Service
@Transactional(rollbackFor = Exception.class)
public class SwmsMenusServiceImpl implements SwmsMenusService {
    @Inject
    private AmsAppService amsAppService;

    @Inject
    private AmsApproleService amsApproleService;

    @Inject
    private AmsApppermissionService amsApppermissionService;

    @Override
    public List<AmsApppermission> getAppPerms(OauthAccessToken oauthAccessToken) {

        String perpersonalization = oauthAccessToken.getPerPersonalization();
        String userType = String.valueOf(oauthAccessToken.getUsertypeId());
        String relationCode = oauthAccessToken.getRelationCode();
        String userId = String.valueOf(oauthAccessToken.getUserId());
        String appId = oauthAccessToken.getClientId();

        Set<String> permissions = new HashSet<>();
        Set<String> roles = new HashSet<>();

        //①首先判断当前应用是否是个性化
        //  1,是个性化应用,则判断个性化角色是否开启
        //      a,是个性化角色,则在个性化角色表中加载权限
        //      b,不是个性化角色,则表示没有进行个性化角色配置,或者根本就没有该应用的个性化角色
        //      注:如果是个性化角色,则一定是选择了该应用对应的个性化角色,注意是对应,表示个性化角色不存在不选应用这种情况,
        //         如果存在,在分配权限页面的应用于角色树中也不会显示出来,所以个性化角色只对应单独应用,不存在默认的个性化配置
        //  2,不是个性化应用,则直接在ams_approle中查找角色
        //      a,ams_approle中有该应用的非个性化角色,表示对于非个性化应用,单独进行权限配置(表示所有有该应用的用户都有该角色)
        //      b,ams_approle中没有该应用的非个性化角色,表示没有进行单独配置,查看是否有没有配置应用的非个性化角色(所有应用的权限都在该角色中)
        //②加载角色到shiro中
        //③加载权限到shiro中


        List<AmsApprole> amsApproles = null;
        AmsApp curApp = amsAppService.getIsPersonalByClientId(appId);

        List<AmsApppermission> amsApppermissions;
        if (StringUtils.isBlank(curApp.getIsPersonalization())) {
            log.error("获取应用个性化标志失败");
            throw new BusindessException("获取应用个性化标志失败!");
        } else {
            if (BaseConstants.PerPersonal.YES.equals(curApp.getIsPersonalization())) {
                if (BaseConstants.PerPersonal.YES.equals(perpersonalization)) {
                    HashMap<String, Object> params = new HashMap<>();
                    params.put("appId", curApp.getAppId());
                    //params.put("appId", 10);
                    params.put("userId", userId);
                    params.put("usertypeId", userType);
                    params.put("relationCode", relationCode);
                    amsApproles = amsApproleService.getAmsApproleByIdentityAndAppId(params);
                } else {
                    //一定没有权限
                }
            } else {
                //非个性化应用的角色权限,可以单独为每个应用配置,
                //也可以使用一个不关联应用的角色,该角色可以关联所有可用的权限
                AmsApproleExample amsApproleExample = new AmsApproleExample();
                amsApproleExample.createCriteria()
                        .andRelationCodeEqualTo(relationCode)
                        .andUsertypeIdEqualTo(Integer.parseInt(userType))
                        .andStatusEqualTo(BaseConstants.Status.NORMAL)
                        .andAppIdEqualTo(curApp.getAppId())
                        //.andAppIdEqualTo(10)
                        .andPerPersonalizationEqualTo(curApp.getIsPersonalization());
                amsApproles = amsApproleService.selectByExample(amsApproleExample);

                if (CollectionUtils.isEmpty(amsApproles)) {
                    amsApproleExample.clear();
                    amsApproleExample.createCriteria()
                            .andRelationCodeEqualTo(relationCode)
                            .andUsertypeIdEqualTo(Integer.parseInt(userType))
                            .andStatusEqualTo(BaseConstants.Status.NORMAL)
                            .andPerPersonalizationEqualTo(curApp.getIsPersonalization());
                    amsApproles = amsApproleService.selectByExample(amsApproleExample);
                }
            }

            //抽取角色和权限
            amsApppermissions = extractRole(amsApproles, roles, false);

        }

        return amsApppermissions;
    }

    public List<AmsApppermission> extractRole(List<AmsApprole> amsApproles, Set<String> roles, Boolean cached) {
        Set<Integer> ids = new HashSet<>();
        if (!CollectionUtils.isEmpty(amsApproles)) {
            for (AmsApprole approle : amsApproles) {
                ids.add(approle.getApproleId());
                if (StringUtils.isNotBlank(approle.getApproleName())) {
                    roles.add(approle.getApproleName());
                }
            }
        }

        List<AmsApppermission> appPermissions = null;
        if (!ids.isEmpty() && !cached) {
            appPermissions = amsApppermissionService.getAppPermissionsByApproleId(ids);
        }
        return appPermissions;
    }
}
