package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsScholarshipSettingMapper;
import com.thinkjoy.swms.dao.entity.SwmsScholarshipSetting;
import com.thinkjoy.swms.dao.entity.SwmsScholarshipSettingExample;
import com.thinkjoy.swms.rpc.api.SwmsScholarshipSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsScholarshipSettingService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsScholarshipSettingServiceImpl extends BaseServiceImpl<SwmsScholarshipSettingMapper, SwmsScholarshipSetting, SwmsScholarshipSettingExample> implements SwmsScholarshipSettingService {

    @Autowired
    SwmsScholarshipSettingMapper swmsScholarshipSettingMapper;

}