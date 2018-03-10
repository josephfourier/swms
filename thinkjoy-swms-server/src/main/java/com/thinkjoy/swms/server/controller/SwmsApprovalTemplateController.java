package com.thinkjoy.swms.server.controller;

import com.thinkjoy.ams.dao.model.AmsApp;
import com.thinkjoy.ams.dao.model.AmsApppermission;
import com.thinkjoy.ams.dao.model.AmsApppermissionExample;
import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.ams.rpc.api.AmsAppService;
import com.thinkjoy.ams.rpc.api.AmsApppermissionService;
import com.thinkjoy.common.util.PropertiesUtil;
import com.thinkjoy.common.util.StringUtil;
import com.thinkjoy.common.util.UUIDTool;
import com.thinkjoy.exception.BusindessException;
import com.thinkjoy.swms.common.annotation.SwmsRequiresPerms;
import com.thinkjoy.swms.common.base.BaseController;
import com.thinkjoy.swms.common.base.SwmsResult;
import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.dao.entity.SwmsApprovalTemplate;
import com.thinkjoy.swms.dao.entity.SwmsApprovalTemplateExample;
import com.thinkjoy.swms.server.security.TokenUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.swms.rpc.api.SwmsApprovalTemplateService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * SwmsApprovalTemplateController
 * @author Miracle.wang
 * @date 2018/3/5
 */
@RestController
@RequestMapping("/manage/approvalTemplate")
@Api(value = "SwmsApprovalTemplate控制器", description = "SwmsApprovalTemplate管理")
@Slf4j
public class SwmsApprovalTemplateController extends BaseController {

   @Inject
   private SwmsApprovalTemplateService swmsApprovalTemplateService;
   @Inject
   private AmsApppermissionService amsApppermissionService;
   @Inject
   private AmsAppService amsAppService;

   /**
    * 查询流程审批菜单列表
    * @return
    */
   @ApiOperation("审批流程列表")
//   @RequestMapping(value="approval-process", method = RequestMethod.GET)
   @GetMapping("approvalProcess")
   public Object ApprovalProcess(){
      String appId = PropertiesUtil.getInstance().getProperties().getProperty("thinkjoy.web.appID");
      if (StringUtils.isBlank(appId)) {
         log.error("zk中没有配置thinkjoy.web.appID");
         throw new BusindessException("zk中没有配置thinkjoy.web.appID!");
      }

      AmsApp curApp = amsAppService.getIsPersonalByClientId(appId);
      AmsApppermissionExample amsApppermissionExample=new AmsApppermissionExample();
      amsApppermissionExample.createCriteria().andSystemIdEqualTo(curApp.getAppId()).andIsApprovalEqualTo(true).andStatusEqualTo((byte) 1);
      List<AmsApppermission> amsApppermissionList=amsApppermissionService.selectByExample(amsApppermissionExample);
      return new SwmsResult(SwmsResultConstant.SUCCESS,amsApppermissionList);
   }



   @ApiOperation("审批流程模板列表")
//   @RequestMapping(value="approvalTemplate",method=RequestMethod.GET)
   @GetMapping("{permissionId}")
   public Object list(HttpServletRequest request,
                      @PathVariable("permissionId")int permissionId){

       if (permissionId>0) {
           log.error("审批流程id不能为空");
           return new SwmsResult(SwmsResultConstant.NULL_ERROR,null);
       }

      OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);

      SwmsApprovalTemplateExample swmsApprovalTemplateExample=new SwmsApprovalTemplateExample();
      swmsApprovalTemplateExample.createCriteria().andPermissionIdEqualTo(permissionId).andSchoolCodeEqualTo(oauthAccessToken.getRelationCode());

      List<SwmsApprovalTemplate> swmsApprovalTemplateList=swmsApprovalTemplateService.selectByExample(swmsApprovalTemplateExample);
      return new SwmsResult(SwmsResultConstant.SUCCESS,swmsApprovalTemplateList);
   }

   /**
    * 保存审批流程
    * @param request
    * @param swmsApprovalTemplate
    * @return
    */
   @ApiOperation("审批流程模板步骤保存")
//   @RequestMapping(value="approvalTemplate",method=RequestMethod.POST)
   @PostMapping
   public Object create(HttpServletRequest request, @RequestBody SwmsApprovalTemplate swmsApprovalTemplate){
      OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);
      swmsApprovalTemplate.setTemplateUid(UUIDTool.getUUID());

      //添加创建人信息
      swmsApprovalTemplate.setCreator(oauthAccessToken.getUsername());
      swmsApprovalTemplate.setCtime(System.currentTimeMillis());
      swmsApprovalTemplate.setSchoolCode(oauthAccessToken.getRelationCode());
      swmsApprovalTemplateService.insertSelective(swmsApprovalTemplate);

      return new SwmsResult(SwmsResultConstant.SUCCESS,swmsApprovalTemplate);
   }



   @ApiOperation("审批流程模板步骤修改")
//   @RequestMapping(value="approvalTemplate",method=RequestMethod.PUT)
   @PutMapping
   public Object update(HttpServletRequest request, @RequestBody SwmsApprovalTemplate swmsApprovalTemplate){
      OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);
      //添加创建人信息
      swmsApprovalTemplate.setCreator(oauthAccessToken.getUsername());
      swmsApprovalTemplate.setCtime(System.currentTimeMillis());
      swmsApprovalTemplate.setSchoolCode(oauthAccessToken.getRelationCode());
      swmsApprovalTemplateService.updateByPrimaryKey(swmsApprovalTemplate);

      return new SwmsResult(SwmsResultConstant.SUCCESS,swmsApprovalTemplate);
   }


   @ApiOperation("审批流程模板步骤删除")
//      @RequestMapping(value="approvalTemplate",method=RequestMethod.DELETE)
   @DeleteMapping("{template_uid}")
   public Object delete(@PathVariable("template_uid")String template_uid){
       if (StringUtils.isBlank(template_uid)) {
           log.error("审批流程步骤id不能为空");
           return new SwmsResult(SwmsResultConstant.NULL_ERROR,null);
       }

      swmsApprovalTemplateService.deleteByPrimaryKey(template_uid);
      return new SwmsResult(SwmsResultConstant.SUCCESS, null);
   }
}