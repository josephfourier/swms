package com.thinkjoy.swms.server.controller;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.swms.common.base.BaseController;
import com.thinkjoy.swms.common.base.SwmsResult;
import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.dao.entity.SwmsApproval;
import com.thinkjoy.swms.dao.entity.SwmsApprovalExample;
import com.thinkjoy.swms.rpc.api.SwmsApprovalService;
import com.thinkjoy.swms.server.security.TokenUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


/**
 * SwmsApprovalController
* @author Miracle.wang
* @date 2018/3/5
 */
@RestController
@RequestMapping("/manage/swmsApproval")
@Api(value = "SwmsApproval控制器", description = "SwmsApproval管理")
@Slf4j
public class SwmsApprovalController extends BaseController {

   @Inject
   SwmsApprovalService swmsApprovalService;


   @ApiOperation("审批流程初始化")
   @GetMapping("initSwmsApproval/{permissionId}")
   public Object initSwmsApproval(HttpServletRequest request, @PathVariable("permissionId") int permissionId){
      if (permissionId<=0) {
         log.error("审批流程id不能为空");
         return new SwmsResult(SwmsResultConstant.NULL_ERROR,null);
      }
      OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);

      Map map=swmsApprovalService.initSwmsApproval(permissionId,oauthAccessToken);
      return  new SwmsResult(SwmsResultConstant.SUCCESS,map);
   }

   @ApiOperation("审批流程查询")
   @GetMapping("{dataUid}")
   public Object SwmsApproval(HttpServletRequest request, @PathVariable("dataUid") String dataUid){
      SwmsApprovalExample swmsApprovalExample=new SwmsApprovalExample();
      swmsApprovalExample.createCriteria().andDataUidEqualTo(dataUid);
      List<SwmsApproval> swmsApprovalList=swmsApprovalService.selectByExample(swmsApprovalExample);
      return  new SwmsResult(SwmsResultConstant.SUCCESS,swmsApprovalList);
   }
}