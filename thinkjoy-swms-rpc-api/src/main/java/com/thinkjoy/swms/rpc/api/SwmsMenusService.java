package com.thinkjoy.swms.rpc.api;

import com.thinkjoy.ams.dao.model.AmsApppermission;
import com.thinkjoy.ams.dao.model.OauthAccessToken;

import java.util.List;

/**
 * @author wangcheng
 * @date 18/3/5
 */
public interface SwmsMenusService {
    List<AmsApppermission> getAppPerms(OauthAccessToken oauthAccessToken);
}
