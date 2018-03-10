package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsFacultyHonoraryMapper;
import com.thinkjoy.swms.dao.entity.SwmsFacultyHonorary;
import com.thinkjoy.swms.dao.entity.SwmsFacultyHonoraryExample;
import com.thinkjoy.swms.rpc.api.SwmsFacultyHonoraryService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsFacultyHonoraryService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsFacultyHonoraryServiceImpl extends BaseServiceImpl<SwmsFacultyHonoraryMapper, SwmsFacultyHonorary, SwmsFacultyHonoraryExample> implements SwmsFacultyHonoraryService {

    @Autowired
    SwmsFacultyHonoraryMapper swmsFacultyHonoraryMapper;

}