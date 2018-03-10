package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsInsuranceSettingMapper;
import com.thinkjoy.swms.dao.entity.SwmsInsuranceSetting;
import com.thinkjoy.swms.dao.entity.SwmsInsuranceSettingExample;
import com.thinkjoy.swms.rpc.api.SwmsInsuranceSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsInsuranceSettingService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsInsuranceSettingServiceImpl extends BaseServiceImpl<SwmsInsuranceSettingMapper, SwmsInsuranceSetting, SwmsInsuranceSettingExample> implements SwmsInsuranceSettingService {

    @Autowired
    SwmsInsuranceSettingMapper swmsInsuranceSettingMapper;

}