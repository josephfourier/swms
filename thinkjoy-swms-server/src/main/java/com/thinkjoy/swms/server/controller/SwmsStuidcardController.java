package com.thinkjoy.swms.server.controller;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.common.base.BaseConstants;
import com.thinkjoy.swms.common.base.BaseController;
import com.thinkjoy.swms.common.base.SwmsResult;
import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.dao.entity.SwmsStuidcard;
import com.thinkjoy.swms.dao.entity.SwmsStuidcardExample;
import com.thinkjoy.swms.rpc.api.SwmsApprovalService;
import com.thinkjoy.swms.rpc.api.SwmsStuidcardService;
import com.thinkjoy.swms.server.security.TokenUtils;
import com.thinkjoy.ucenter.dao.model.UcenterStudent;
import com.thinkjoy.ucenter.dao.model.UcenterStudentExample;
import com.thinkjoy.ucenter.rpc.api.UcenterStudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * SwmsStuidcardController
* @author Miracle.wang
* @date 2018/3/5
 */
@RestController
@RequestMapping("/manage/swmsStuidcard")
@Api(value = "SwmsStuidcard控制器", description = "SwmsStuidcard管理")
@Slf4j
public class SwmsStuidcardController extends BaseController {

   @Inject
   SwmsStuidcardService swmsStuidcardService;
   @Inject
   UcenterStudentService studentService;

   @ApiOperation("学生证补办查询")
   @GetMapping
   public Object  SwmsStuidcard(HttpServletRequest request){
      //1、查询业务数据 学生基本信息
      OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);
      Integer userId=oauthAccessToken.getUserId();
      UcenterStudentExample ucenterStudentExample=new UcenterStudentExample();
      ucenterStudentExample.createCriteria().andUserIdEqualTo(userId).andSchoolCodeEqualTo(oauthAccessToken.getRelationCode()).andStatusEqualTo(BaseConstants.Status.NORMAL);
      UcenterStudent ucenterStudent=studentService.selectFirstByExample(ucenterStudentExample);
      //2、根据学生id最新一条学生证补办数据（按添加时间降序，取第一条）
      SwmsStuidcardExample swmsStuidcardExample=new SwmsStuidcardExample();
      swmsStuidcardExample.createCriteria().andStudentIdEqualTo(ucenterStudent.getStudentId());
      swmsStuidcardExample.setOrderByClause("ctime desc");
      SwmsStuidcard swmsStuidcard=swmsStuidcardService.selectFirstByExample(swmsStuidcardExample);

      Map<String,Object> map=new HashMap<>();
      map.put("ucenterStudent",ucenterStudent);
      map.put("swmsStuidcard",swmsStuidcard);

      return new SwmsResult(SwmsResultConstant.SUCCESS,map);
   }


   /**
    * 保存
    * @param request
    * @param swmsStuidcard
    * @return
    */
   @PostMapping
   public Object  SwmsStuidcard(HttpServletRequest request,SwmsStuidcard swmsStuidcard){
      OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);
      swmsStuidcard.setCreator(oauthAccessToken.getUsername());
      swmsStuidcard.setCtime(System.currentTimeMillis());
      swmsStuidcard.setSchoolCode(oauthAccessToken.getRelationCode());
      swmsStuidcardService.insert(swmsStuidcard);
      return new SwmsResult(SwmsResultConstant.SUCCESS,null);
   }

}