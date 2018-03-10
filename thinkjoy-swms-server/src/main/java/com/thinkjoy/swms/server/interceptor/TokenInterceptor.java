package com.thinkjoy.swms.server.interceptor;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.ams.dao.model.AmsApppermission;
import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.swms.common.annotation.SwmsRequiresPerms;
import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.rpc.api.SwmsMenusService;
import com.thinkjoy.swms.server.exception.InvalidTokenException;
import com.thinkjoy.swms.server.exception.NoAuthorityException;
import com.thinkjoy.swms.server.security.TokenUtils;
import com.thinkjoy.swms.server.security.UserPermsChecker;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author wangcheng
 * @date 18/3/2
 */
@Slf4j
public class TokenInterceptor extends HandlerInterceptorAdapter {

    @Inject
    private SwmsMenusService menusService;

    @Autowired
    UserPermsChecker userPermsChecker;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);

        Set<String> permissions = new HashSet<>();
        Set<String> roles = new HashSet<>();

        boolean b = false;
        if (oauthAccessToken != null) {

            HandlerMethod handlerMethod = (HandlerMethod) handler;

            SwmsRequiresPerms methodAnnotation = handlerMethod.getMethodAnnotation(SwmsRequiresPerms.class);

            if (!StringUtils.isEmpty(methodAnnotation)) {
                String[] value = methodAnnotation.value();

                if (StringUtils.isEmpty(value)){
                    return !b;
                }
                List<AmsApppermission> appPerms = menusService.getAppPerms(oauthAccessToken);

                //抽取角色和权限
                extractPermission(appPerms, permissions);
                b = userPermsChecker.hasPerms(value, permissions, false);

                if (!b) {
                    throw new NoAuthorityException(SwmsResultConstant.NO_AUTH);
                }
            } else {
                return !b;
            }


        } else {
            throw new InvalidTokenException(SwmsResultConstant.INVALID_TOKEN);
        }

        return b;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }

    public void extractPermission(List<AmsApppermission> apppermissions, Set<String> permissions) {
        if (CollectionUtils.isNotEmpty(apppermissions)) {
            for (AmsApppermission amsApppermission : apppermissions) {
                if (org.apache.commons.lang.StringUtils.isNotBlank(amsApppermission.getPermissionValue())) {
                    permissions.add(amsApppermission.getPermissionValue());
                }
            }
        }
    }
}
