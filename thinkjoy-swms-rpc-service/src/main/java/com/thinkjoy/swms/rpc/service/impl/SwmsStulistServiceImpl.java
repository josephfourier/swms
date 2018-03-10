package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsStulistMapper;
import com.thinkjoy.swms.dao.entity.SwmsStulist;
import com.thinkjoy.swms.dao.entity.SwmsStulistExample;
import com.thinkjoy.swms.rpc.api.SwmsStulistService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsStulistService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsStulistServiceImpl extends BaseServiceImpl<SwmsStulistMapper, SwmsStulist, SwmsStulistExample> implements SwmsStulistService {

    @Autowired
    SwmsStulistMapper swmsStulistMapper;

}