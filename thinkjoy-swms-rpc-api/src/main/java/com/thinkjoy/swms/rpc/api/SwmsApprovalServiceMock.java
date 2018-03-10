package com.thinkjoy.swms.rpc.api;

import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.swms.common.base.BaseServiceMock;
import com.thinkjoy.swms.dao.entity.SwmsApproval;
import com.thinkjoy.swms.dao.entity.SwmsApprovalExample;
import com.thinkjoy.swms.dao.mapper.SwmsApprovalMapper;

import java.util.Map;

/**
* 降级实现SwmsApprovalService接口
* @author Miracle.wang
* @date 2018/3/6
*/
public class SwmsApprovalServiceMock extends BaseServiceMock<SwmsApprovalMapper, SwmsApproval, SwmsApprovalExample> implements SwmsApprovalService {


    @Override
    public Map initSwmsApproval(Integer permissionId, OauthAccessToken oauthAccessToken) {
        return null;
    }
}
