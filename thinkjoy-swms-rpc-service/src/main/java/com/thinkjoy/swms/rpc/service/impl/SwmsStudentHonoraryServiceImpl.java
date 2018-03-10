package com.thinkjoy.swms.rpc.service.impl;

import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.dao.mapper.SwmsStudentHonoraryMapper;
import com.thinkjoy.swms.dao.entity.SwmsStudentHonorary;
import com.thinkjoy.swms.dao.entity.SwmsStudentHonoraryExample;
import com.thinkjoy.swms.rpc.api.SwmsStudentHonoraryService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

/**
* SwmsStudentHonoraryService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsStudentHonoraryServiceImpl extends BaseServiceImpl<SwmsStudentHonoraryMapper, SwmsStudentHonorary, SwmsStudentHonoraryExample> implements SwmsStudentHonoraryService {

    @Autowired
    SwmsStudentHonoraryMapper swmsStudentHonoraryMapper;

}