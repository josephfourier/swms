package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsStayholidayMapper;
import com.thinkjoy.swms.dao.entity.SwmsStayholiday;
import com.thinkjoy.swms.dao.entity.SwmsStayholidayExample;
import com.thinkjoy.swms.rpc.api.SwmsStayholidayService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsStayholidayService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsStayholidayServiceImpl extends BaseServiceImpl<SwmsStayholidayMapper, SwmsStayholiday, SwmsStayholidayExample> implements SwmsStayholidayService {

    @Autowired
    SwmsStayholidayMapper swmsStayholidayMapper;

}