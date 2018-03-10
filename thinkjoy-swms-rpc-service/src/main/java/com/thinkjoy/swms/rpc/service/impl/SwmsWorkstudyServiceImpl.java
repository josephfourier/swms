package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsWorkstudyMapper;
import com.thinkjoy.swms.dao.entity.SwmsWorkstudy;
import com.thinkjoy.swms.dao.entity.SwmsWorkstudyExample;
import com.thinkjoy.swms.rpc.api.SwmsWorkstudyService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsWorkstudyService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsWorkstudyServiceImpl extends BaseServiceImpl<SwmsWorkstudyMapper, SwmsWorkstudy, SwmsWorkstudyExample> implements SwmsWorkstudyService {

    @Autowired
    SwmsWorkstudyMapper swmsWorkstudyMapper;

}