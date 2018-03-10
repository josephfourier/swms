package com.thinkjoy.swms.rpc.api;

import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.swms.common.base.BaseService;
import com.thinkjoy.swms.dao.entity.SwmsApproval;
import com.thinkjoy.swms.dao.entity.SwmsApprovalExample;

import java.util.Map;

/**
* SwmsApprovalService接口
* @author Miracle.wang
* @date 2018/3/6
*/
public interface SwmsApprovalService extends BaseService<SwmsApproval, SwmsApprovalExample> {
    public Map initSwmsApproval(Integer permissionId,OauthAccessToken oauthAccessToken);

}