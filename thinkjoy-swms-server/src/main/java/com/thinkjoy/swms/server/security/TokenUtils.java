package com.thinkjoy.swms.server.security;

import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.common.util.PropertiesUtil;
import com.thinkjoy.common.util.RedisUtil;
import com.thinkjoy.oauth.client.util.SerializableUtil;
import com.thinkjoy.swms.common.constants.SwmsConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangcheng on 18/3/2.
 */
@Slf4j
public class TokenUtils {

    /**
     * 获取当前用户对应token
     * @param request
     * @return
     */
    public static OauthAccessToken obtainCurrentToken(HttpServletRequest request) {

        String appId = PropertiesUtil.getInstance().getProperties().getProperty("thinkjoy.web.appID");
        if(StringUtils.isEmpty(appId)){
            log.error("zk中没有配置thinkjoy.web.appID");
        }
        //获取请求头中的token作为sessionid
        String token = request.getHeader(SwmsConstants.AUTHORIZATION);

        OauthAccessToken oauthAccessToken = null;
        if (StringUtils.isEmpty(token)) {
            return null;
        } else {
            String s = RedisUtil.get(SwmsConstants.THINKJOY_OAUTH_SERVER_TOKEN + "_" + token);
            if (!StringUtils.isEmpty(s)) {
                String s1 = RedisUtil.get(SwmsConstants.THINKJOY_OAUTH_SERVER_SESSION_ID + "_" + s);
                if (StringUtils.isEmpty(s1)) {
                    return null;
                }
                oauthAccessToken = SerializableUtil.protostuff_deserialize(s1, OauthAccessToken.class);
                if (oauthAccessToken == null) {
                    return null;
                }else {
                    oauthAccessToken.setClientId(appId);
                }
            }
        }

        return oauthAccessToken;
    }

    /**
     * 校验token
     * @param request
     * @return
     */
    public static boolean verifyToken(HttpServletRequest request) {
        //获取请求头中的token作为sessionid
        String token = request.getHeader(SwmsConstants.AUTHORIZATION);

        if (StringUtils.isEmpty(token)) {
            return false;
        } else {
            String s = RedisUtil.get(SwmsConstants.THINKJOY_OAUTH_SERVER_TOKEN + "_" + token);
            if (StringUtils.isEmpty(s)) {
                return false;
            } else {
                String s1 = RedisUtil.get(SwmsConstants.THINKJOY_OAUTH_SERVER_SESSION_ID + "_" + s);
                if (StringUtils.isEmpty(s1)) {
                    return false;
                }
            }
        }
        return true;
    }
}
