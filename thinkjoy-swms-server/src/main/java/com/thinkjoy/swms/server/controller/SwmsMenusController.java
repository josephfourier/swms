package com.thinkjoy.swms.server.controller;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.ams.dao.model.AmsApppermission;
import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.swms.common.annotation.SwmsRequiresPerms;
import com.thinkjoy.swms.common.base.SwmsResult;
import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.rpc.api.SwmsMenusService;
import com.thinkjoy.swms.rpc.api.SwmsNoticeService;
import com.thinkjoy.swms.server.security.TokenUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
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
public class SwmsMenusController {

    @Inject
    private SwmsMenusService menusService;

    @Inject
    SwmsNoticeService noticeService;


    @RequestMapping(value = "/menus", method = RequestMethod.GET)
    @SwmsRequiresPerms("swms:permission:read")
    public Object getMenus(HttpServletRequest request) {
        OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);

        List<AmsApppermission> appPerms = menusService.getAppPerms(oauthAccessToken);
        return new SwmsResult(SwmsResultConstant.SUCCESS, appPerms);
    }

}
