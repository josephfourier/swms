package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsAllowanceMapper;
import com.thinkjoy.swms.dao.entity.SwmsAllowance;
import com.thinkjoy.swms.dao.entity.SwmsAllowanceExample;
import com.thinkjoy.swms.rpc.api.SwmsAllowanceService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsAllowanceService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsAllowanceServiceImpl extends BaseServiceImpl<SwmsAllowanceMapper, SwmsAllowance, SwmsAllowanceExample> implements SwmsAllowanceService {

    @Autowired
    SwmsAllowanceMapper swmsAllowanceMapper;

}