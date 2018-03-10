package com.thinkjoy.swms.server.controller;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.common.base.BaseConstants;
import com.thinkjoy.swms.common.base.SwmsResult;
import com.thinkjoy.swms.common.base.SwmsResultConstant;
import com.thinkjoy.swms.server.security.TokenUtils;
import com.thinkjoy.ucenter.dao.model.*;
import com.thinkjoy.ucenter.rpc.api.UcenterDictValuesService;
import com.thinkjoy.ucenter.rpc.api.UcenterPostService;
import com.thinkjoy.ucenter.rpc.api.UcenterTeacherService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;

/**
 * 通用接口，例如字典
 * Created by xufei on 2018/3/2.
 */
@RestController
@Slf4j
@Api(value = "通用接口控制器", description = "通用接口管理")
@RequestMapping("/manage/common")
public class SwmsCommonController {
    @Inject
    private UcenterDictValuesService ucenterDictValuesService;
    @Inject
    private UcenterPostService ucenterPostService;
    @Inject
    private UcenterTeacherService ucenterTeacherService;

    /**
     * 根据字典code，查询字典
     * @param dictcode
     * @return
     */
    @ApiOperation("字段表管理列表")
//    @RequestMapping(value="dict/{dictcode}", method = RequestMethod.GET)
    @GetMapping("dict/{dictcode}")
    public Object dict(@PathVariable("dictcode") String dictcode){
        UcenterDictValuesExample ucenterDictValuesExample = new UcenterDictValuesExample();
        ucenterDictValuesExample.createCriteria().andDictCodeEqualTo(dictcode).andStatusEqualTo(BaseConstants.Status.NORMAL);
        List<UcenterDictValues> ucenterDictValues = ucenterDictValuesService.selectByExample(ucenterDictValuesExample);
        return  new SwmsResult(SwmsResultConstant.SUCCESS,ucenterDictValues);
    }

    /**
     * 根据职务级别获取职务列表
     * @param teacherLevel
     * @return
     */
    @ApiOperation("职务列表")
//    @RequestMapping(value="ucenterPost/{teacherLevel}",method = RequestMethod.GET)
    @GetMapping("ucenterPost/{teacherLevel}")
    public Object ucenterPost(HttpServletRequest request,@PathVariable("teacherLevel") String teacherLevel){
        OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);

        UcenterPostExample ucenterPostExample=new UcenterPostExample();
        ucenterPostExample.createCriteria().andTeacherLevelEqualTo(teacherLevel).andSchoolCodeEqualTo(oauthAccessToken.getRelationCode()).andStatusEqualTo(BaseConstants.Status.NORMAL);
        List<UcenterPost> ucenterPostList=ucenterPostService.selectByExample(ucenterPostExample);
        return  new SwmsResult(SwmsResultConstant.SUCCESS,ucenterPostList);
    }

    /**
     * 根据职务查询老师
     * @param postId
     * @return
     */
    @ApiOperation("老师列表")
//    @RequestMapping(value="ucenterTeacher/{postId}",method = RequestMethod.GET)
    @GetMapping("ucenterTeacher/{postId}")
    public Object ucenterTeacher(HttpServletRequest request,@PathVariable("postId")Integer postId){
        OauthAccessToken oauthAccessToken = TokenUtils.obtainCurrentToken(request);

        HashMap<String,Object> params= new HashMap<>();
        params.put("postId",postId);
        params.put("schoolCode",oauthAccessToken.getRelationCode());
        List<UcenterTeacher> ucenterTeacherList=ucenterTeacherService.selectUcenterTeacherByPostId(params);
        return  new SwmsResult(SwmsResultConstant.SUCCESS,ucenterTeacherList);
    }
}
