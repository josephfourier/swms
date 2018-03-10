package com.thinkjoy.swms.rpc.service.impl;

import com.reger.dubbo.annotation.Inject;
import com.thinkjoy.ams.dao.model.OauthAccessToken;
import com.thinkjoy.common.annotation.BaseService;
import com.thinkjoy.common.base.BaseConstants;
import com.thinkjoy.swms.common.base.BaseServiceImpl;
import com.thinkjoy.swms.common.constants.SwmsConstants;
import com.thinkjoy.swms.dao.entity.SwmsApproval;
import com.thinkjoy.swms.dao.entity.SwmsApprovalExample;
import com.thinkjoy.swms.dao.entity.SwmsApprovalTemplate;
import com.thinkjoy.swms.dao.entity.SwmsApprovalTemplateExample;
import com.thinkjoy.swms.dao.mapper.SwmsApprovalMapper;
import com.thinkjoy.swms.rpc.api.SwmsApprovalService;
import com.thinkjoy.swms.rpc.api.SwmsApprovalTemplateService;
import com.thinkjoy.ucenter.dao.model.UcenterPost;
import com.thinkjoy.ucenter.dao.model.UcenterStudent;
import com.thinkjoy.ucenter.dao.model.UcenterStudentExample;
import com.thinkjoy.ucenter.dao.model.UcenterTeacher;
import com.thinkjoy.ucenter.rpc.api.UcenterPostService;
import com.thinkjoy.ucenter.rpc.api.UcenterStudentService;
import com.thinkjoy.ucenter.rpc.api.UcenterTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* SwmsApprovalService实现
* @author Miracle.wang
* @date 2018/3/6
*/
@Service
@Transactional(rollbackFor = Exception.class)
@BaseService
@Slf4j
public class SwmsApprovalServiceImpl extends BaseServiceImpl<SwmsApprovalMapper, SwmsApproval, SwmsApprovalExample> implements SwmsApprovalService {

    @Autowired
    SwmsApprovalMapper swmsApprovalMapper;
    @Inject
    private SwmsApprovalTemplateService swmsApprovalTemplateService;
    @Inject
    private UcenterTeacherService ucenterTeacherService;
    @Inject
    private UcenterPostService ucenterPostService;
    @Inject
    private UcenterStudentService ucenterStudentService;

    /**
     * 初始化审批流程信息
     * @param permissionId
     * @param oauthAccessToken
     * @return
     */
    @Override
    public Map initSwmsApproval(Integer permissionId, OauthAccessToken oauthAccessToken) {
        Map<String,Object> map=new HashMap<>();
        //1、查询流程对应的模板数据
        SwmsApprovalTemplateExample swmsApprovalTemplateExample=new SwmsApprovalTemplateExample();
        swmsApprovalTemplateExample.createCriteria().andPermissionIdEqualTo(permissionId).andSchoolCodeEqualTo(oauthAccessToken.getRelationCode());
        List<SwmsApprovalTemplate> swmsApprovalTemplateList=swmsApprovalTemplateService.selectByExample(swmsApprovalTemplateExample);
        map.put("initSwmsApproval",swmsApprovalTemplateList);
        //2、查询第一步审批流程数据
        SwmsApprovalTemplate firstSwmsApprovalTemplate=null;
        for(SwmsApprovalTemplate swmsApprovalTemplate : swmsApprovalTemplateList){
            if(swmsApprovalTemplate.getApprovalStep()== SwmsConstants.ApprovalSetp.FIRST_SETP){
                firstSwmsApprovalTemplate=swmsApprovalTemplate;
                break;
            }
        }
        //3、如果步骤审批类型是职位，需要初始化第一步审批流程审批人列表
        List<UcenterTeacher> ucenterTeacherList=null;
        if(firstSwmsApprovalTemplate.getApprovalType().equals(SwmsConstants.ApprovalType.POST)){
            UcenterPost ucenterPost=ucenterPostService.selectByPrimaryKey(firstSwmsApprovalTemplate.getPostId());
            //根据 职位查询老师列表
            HashMap<String,Object> params= new HashMap<>();
            params.put("postId",ucenterPost.getPostId());
            params.put("teacherLevel",ucenterPost.getTeacherLevel());
            params.put("schoolCode",oauthAccessToken.getRelationCode());

            if(oauthAccessToken.getUsertypeId().intValue()==BaseConstants.UserType.STUDENT){//学生流程初始化
                UcenterStudentExample ucenterStudentExample=new UcenterStudentExample();
                ucenterStudentExample.createCriteria().andUserIdEqualTo(oauthAccessToken.getUserId());
                UcenterStudent ucenterStudent=ucenterStudentService.selectFirstByExample(ucenterStudentExample);
                if(ucenterPost.getTeacherLevel().equals(BaseConstants.PostLevel.ERJI)){//三级（班级）
                    params.put("facultyCode",ucenterStudent.getFacultyCode());
                    ucenterTeacherList=ucenterTeacherService.selectUcenterTeacherByPostId(params);
                }else if(ucenterPost.getTeacherLevel().equals(BaseConstants.PostLevel.SANJI)){//二级（院系、部级）
                    params.put("classId",ucenterStudent.getClassId());
                    ucenterTeacherList=ucenterTeacherService.selectUcenterTeacherByPostId(params);
                }else{//一级（院系、部级）或其他
                    ucenterTeacherList=ucenterTeacherService.selectUcenterTeacherByPostId(params);
                }
            }else if(oauthAccessToken.getUsertypeId().intValue()==BaseConstants.UserType.TEACHER){//老师流程初始化
                ucenterTeacherList=ucenterTeacherService.selectUcenterTeacherByPostId(params);
            }

        }
        //通过流程步骤作为key，保存审批人列表
        map.put(firstSwmsApprovalTemplate.getApprovalStep().toString(),ucenterTeacherList);
        return map;
    }
}