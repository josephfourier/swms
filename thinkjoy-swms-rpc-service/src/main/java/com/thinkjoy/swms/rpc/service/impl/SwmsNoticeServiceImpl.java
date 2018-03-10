package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsNoticeMapper;
import com.thinkjoy.swms.dao.entity.SwmsNotice;
import com.thinkjoy.swms.dao.entity.SwmsNoticeExample;
import com.thinkjoy.swms.rpc.api.SwmsNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsNoticeService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsNoticeServiceImpl extends BaseServiceImpl<SwmsNoticeMapper, SwmsNotice, SwmsNoticeExample> implements SwmsNoticeService {

    @Autowired
    SwmsNoticeMapper swmsNoticeMapper;

}