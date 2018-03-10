package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsInsuranceMapper;
import com.thinkjoy.swms.dao.entity.SwmsInsurance;
import com.thinkjoy.swms.dao.entity.SwmsInsuranceExample;
import com.thinkjoy.swms.rpc.api.SwmsInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsInsuranceService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsInsuranceServiceImpl extends BaseServiceImpl<SwmsInsuranceMapper, SwmsInsurance, SwmsInsuranceExample> implements SwmsInsuranceService {

    @Autowired
    SwmsInsuranceMapper swmsInsuranceMapper;

}