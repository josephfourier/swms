package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsClassHonoraryMapper;
import com.thinkjoy.swms.dao.entity.SwmsClassHonorary;
import com.thinkjoy.swms.dao.entity.SwmsClassHonoraryExample;
import com.thinkjoy.swms.rpc.api.SwmsClassHonoraryService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsClassHonoraryService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsClassHonoraryServiceImpl extends BaseServiceImpl<SwmsClassHonoraryMapper, SwmsClassHonorary, SwmsClassHonoraryExample> implements SwmsClassHonoraryService {

    @Autowired
    SwmsClassHonoraryMapper swmsClassHonoraryMapper;

}