package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsInsuranceOrderMapper;
import com.thinkjoy.swms.dao.entity.SwmsInsuranceOrder;
import com.thinkjoy.swms.dao.entity.SwmsInsuranceOrderExample;
import com.thinkjoy.swms.rpc.api.SwmsInsuranceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsInsuranceOrderService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsInsuranceOrderServiceImpl extends BaseServiceImpl<SwmsInsuranceOrderMapper, SwmsInsuranceOrder, SwmsInsuranceOrderExample> implements SwmsInsuranceOrderService {

    @Autowired
    SwmsInsuranceOrderMapper swmsInsuranceOrderMapper;

}