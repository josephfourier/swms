package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsPoorMapper;
import com.thinkjoy.swms.dao.entity.SwmsPoor;
import com.thinkjoy.swms.dao.entity.SwmsPoorExample;
import com.thinkjoy.swms.rpc.api.SwmsPoorService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsPoorService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsPoorServiceImpl extends BaseServiceImpl<SwmsPoorMapper, SwmsPoor, SwmsPoorExample> implements SwmsPoorService {

    @Autowired
    SwmsPoorMapper swmsPoorMapper;

}