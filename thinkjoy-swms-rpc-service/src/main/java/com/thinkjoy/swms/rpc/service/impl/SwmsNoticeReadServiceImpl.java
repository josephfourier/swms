package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsNoticeReadMapper;
import com.thinkjoy.swms.dao.entity.SwmsNoticeRead;
import com.thinkjoy.swms.dao.entity.SwmsNoticeReadExample;
import com.thinkjoy.swms.rpc.api.SwmsNoticeReadService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsNoticeReadService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsNoticeReadServiceImpl extends BaseServiceImpl<SwmsNoticeReadMapper, SwmsNoticeRead, SwmsNoticeReadExample> implements SwmsNoticeReadService {

    @Autowired
    SwmsNoticeReadMapper swmsNoticeReadMapper;

}