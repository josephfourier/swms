package com.thinkjoy.swms.server.controller;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.swms.common.base.BaseController;
import com.thinkjoy.swms.rpc.api.SwmsStulistService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * SwmsStulistController
* @author Miracle.wang
* @date 2018/3/5
 */
@RestController
@RequestMapping("/manage")
@Api(value = "SwmsStulist控制器", description = "SwmsStulist管理")
@Slf4j
public class SwmsStulistController extends BaseController {

   @Inject
   SwmsStulistService swmsStulistService;
}