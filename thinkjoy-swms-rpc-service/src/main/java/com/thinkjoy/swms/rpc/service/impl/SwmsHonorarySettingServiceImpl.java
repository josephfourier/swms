package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsHonorarySettingMapper;
import com.thinkjoy.swms.dao.entity.SwmsHonorarySetting;
import com.thinkjoy.swms.dao.entity.SwmsHonorarySettingExample;
import com.thinkjoy.swms.rpc.api.SwmsHonorarySettingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsHonorarySettingService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsHonorarySettingServiceImpl extends BaseServiceImpl<SwmsHonorarySettingMapper, SwmsHonorarySetting, SwmsHonorarySettingExample> implements SwmsHonorarySettingService {

    @Autowired
    SwmsHonorarySettingMapper swmsHonorarySettingMapper;

}