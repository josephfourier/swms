package com.thinkjoy.swms.server.controller;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.swms.common.base.BaseController;
import com.thinkjoy.swms.rpc.api.SwmsClassHonoraryService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * SwmsClassHonoraryController
* @author Miracle.wang
* @date 2018/3/5
 */
@RestController
@RequestMapping("/manage")
@Api(value = "SwmsClassHonorary控制器", description = "SwmsClassHonorary管理")
@Slf4j
public class SwmsClassHonoraryController extends BaseController {

   @Inject
   SwmsClassHonoraryService swmsClassHonoraryService;
}