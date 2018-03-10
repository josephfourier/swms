package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsPunishMapper;
import com.thinkjoy.swms.dao.entity.SwmsPunish;
import com.thinkjoy.swms.dao.entity.SwmsPunishExample;
import com.thinkjoy.swms.rpc.api.SwmsPunishService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsPunishService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsPunishServiceImpl extends BaseServiceImpl<SwmsPunishMapper, SwmsPunish, SwmsPunishExample> implements SwmsPunishService {

    @Autowired
    SwmsPunishMapper swmsPunishMapper;

}