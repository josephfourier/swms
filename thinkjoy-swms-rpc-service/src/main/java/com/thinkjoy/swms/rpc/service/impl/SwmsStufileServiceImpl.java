package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsStufileMapper;
import com.thinkjoy.swms.dao.entity.SwmsStufile;
import com.thinkjoy.swms.dao.entity.SwmsStufileExample;
import com.thinkjoy.swms.rpc.api.SwmsStufileService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsStufileService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsStufileServiceImpl extends BaseServiceImpl<SwmsStufileMapper, SwmsStufile, SwmsStufileExample> implements SwmsStufileService {

    @Autowired
    SwmsStufileMapper swmsStufileMapper;

}