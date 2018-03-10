package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsStuidcardMapper;
import com.thinkjoy.swms.dao.entity.SwmsStuidcard;
import com.thinkjoy.swms.dao.entity.SwmsStuidcardExample;
import com.thinkjoy.swms.rpc.api.SwmsStuidcardService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsStuidcardService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsStuidcardServiceImpl extends BaseServiceImpl<SwmsStuidcardMapper, SwmsStuidcard, SwmsStuidcardExample> implements SwmsStuidcardService {

    @Autowired
    SwmsStuidcardMapper swmsStuidcardMapper;

}