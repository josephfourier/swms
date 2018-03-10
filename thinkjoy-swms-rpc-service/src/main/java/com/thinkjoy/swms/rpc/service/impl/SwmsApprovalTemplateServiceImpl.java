package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsApprovalTemplateMapper;
import com.thinkjoy.swms.dao.entity.SwmsApprovalTemplate;
import com.thinkjoy.swms.dao.entity.SwmsApprovalTemplateExample;
import com.thinkjoy.swms.rpc.api.SwmsApprovalTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsApprovalTemplateService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsApprovalTemplateServiceImpl extends BaseServiceImpl<SwmsApprovalTemplateMapper, SwmsApprovalTemplate, SwmsApprovalTemplateExample> implements SwmsApprovalTemplateService {

    @Autowired
    SwmsApprovalTemplateMapper swmsApprovalTemplateMapper;

}