package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsStufileSettingMapper;
import com.thinkjoy.swms.dao.entity.SwmsStufileSetting;
import com.thinkjoy.swms.dao.entity.SwmsStufileSettingExample;
import com.thinkjoy.swms.rpc.api.SwmsStufileSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsStufileSettingService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsStufileSettingServiceImpl extends BaseServiceImpl<SwmsStufileSettingMapper, SwmsStufileSetting, SwmsStufileSettingExample> implements SwmsStufileSettingService {

    @Autowired
    SwmsStufileSettingMapper swmsStufileSettingMapper;

}