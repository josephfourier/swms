package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsAllowanceSettingMapper;
import com.thinkjoy.swms.dao.entity.SwmsAllowanceSetting;
import com.thinkjoy.swms.dao.entity.SwmsAllowanceSettingExample;
import com.thinkjoy.swms.rpc.api.SwmsAllowanceSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsAllowanceSettingService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsAllowanceSettingServiceImpl extends BaseServiceImpl<SwmsAllowanceSettingMapper, SwmsAllowanceSetting, SwmsAllowanceSettingExample> implements SwmsAllowanceSettingService {

    @Autowired
    SwmsAllowanceSettingMapper swmsAllowanceSettingMapper;

}