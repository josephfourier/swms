package com.thinkjoy.swms.server.controller;


import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.swms.common.base.SwmsResult;
import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.dao.entity.SwmsAllowance;
import com.thinkjoy.swms.dao.entity.SwmsAllowanceExample;
import com.thinkjoy.swms.rpc.api.SwmsAllowanceService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 仅供演示
 * <p/>
 * 1.应用系统管理
 * 基本信息维护时，添加身份配置：“适用身份”（老师，学生，家长，教育机构） 前端控制器
 * </p>
 *
 * @author Miracle.wang
 * @since 2018-02-11
 */
@RestController
@RequestMapping("/manage")
@Slf4j
public class DemoController {

    @Inject
    SwmsAllowanceService swmsAllowanceService;

    @GetMapping(value = "/demo/{id}")
    @ApiOperation(value = "count", notes = "测试样板")
    public Object count(@PathVariable("id") int id) {
        log.info("利用lombok 和 logback 输出了应用信息!");

        long begin = System.currentTimeMillis();
        int i = swmsAllowanceService.countByExample(new SwmsAllowanceExample());
        long end = System.currentTimeMillis();
        log.info("调用count1供花费: " + (end - begin));

        List<SwmsAllowance> swmsAllowances = swmsAllowanceService.selectByExampleForOffsetPage(new SwmsAllowanceExample(), 0, 11);

        return new SwmsResult(SwmsResultConstant.SUCCESS, i);
    }



}

