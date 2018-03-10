package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsScholarshipMapper;
import com.thinkjoy.swms.dao.entity.SwmsScholarship;
import com.thinkjoy.swms.dao.entity.SwmsScholarshipExample;
import com.thinkjoy.swms.rpc.api.SwmsScholarshipService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsScholarshipService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsScholarshipServiceImpl extends BaseServiceImpl<SwmsScholarshipMapper, SwmsScholarship, SwmsScholarshipExample> implements SwmsScholarshipService {

    @Autowired
    SwmsScholarshipMapper swmsScholarshipMapper;

}