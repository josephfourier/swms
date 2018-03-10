package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsStufileListMapper;
import com.thinkjoy.swms.dao.entity.SwmsStufileList;
import com.thinkjoy.swms.dao.entity.SwmsStufileListExample;
import com.thinkjoy.swms.rpc.api.SwmsStufileListService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsStufileListService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsStufileListServiceImpl extends BaseServiceImpl<SwmsStufileListMapper, SwmsStufileList, SwmsStufileListExample> implements SwmsStufileListService {

    @Autowired
    SwmsStufileListMapper swmsStufileListMapper;

}