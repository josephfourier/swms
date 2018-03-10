package com.thinkjoy.swms.server.controller;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.swms.common.base.BaseController;
import com.thinkjoy.swms.rpc.api.SwmsStudentHonoraryService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * SwmsStudentHonoraryController
* @author Miracle.wang
* @date 2018/3/5
 */
@RestController
@RequestMapping("/manage")
@Api(value = "SwmsStudentHonorary控制器", description = "SwmsStudentHonorary管理")
@Slf4j
public class SwmsStudentHonoraryController extends BaseController {

   @Inject
   SwmsStudentHonoraryService swmsStudentHonoraryService;
}