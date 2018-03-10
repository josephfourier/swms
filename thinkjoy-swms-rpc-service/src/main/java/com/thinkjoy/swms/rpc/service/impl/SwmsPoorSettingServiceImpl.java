package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsPoorSettingMapper;
import com.thinkjoy.swms.dao.entity.SwmsPoorSetting;
import com.thinkjoy.swms.dao.entity.SwmsPoorSettingExample;
import com.thinkjoy.swms.rpc.api.SwmsPoorSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsPoorSettingService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsPoorSettingServiceImpl extends BaseServiceImpl<SwmsPoorSettingMapper, SwmsPoorSetting, SwmsPoorSettingExample> implements SwmsPoorSettingService {

    @Autowired
    SwmsPoorSettingMapper swmsPoorSettingMapper;

}