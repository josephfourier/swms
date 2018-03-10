package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsPunishSettingMapper;
import com.thinkjoy.swms.dao.entity.SwmsPunishSetting;
import com.thinkjoy.swms.dao.entity.SwmsPunishSettingExample;
import com.thinkjoy.swms.rpc.api.SwmsPunishSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsPunishSettingService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsPunishSettingServiceImpl extends BaseServiceImpl<SwmsPunishSettingMapper, SwmsPunishSetting, SwmsPunishSettingExample> implements SwmsPunishSettingService {

    @Autowired
    SwmsPunishSettingMapper swmsPunishSettingMapper;

}