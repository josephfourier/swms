package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsWorkstudySettingMapper;
import com.thinkjoy.swms.dao.entity.SwmsWorkstudySetting;
import com.thinkjoy.swms.dao.entity.SwmsWorkstudySettingExample;
import com.thinkjoy.swms.rpc.api.SwmsWorkstudySettingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsWorkstudySettingService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsWorkstudySettingServiceImpl extends BaseServiceImpl<SwmsWorkstudySettingMapper, SwmsWorkstudySetting, SwmsWorkstudySettingExample> implements SwmsWorkstudySettingService {

    @Autowired
    SwmsWorkstudySettingMapper swmsWorkstudySettingMapper;

}