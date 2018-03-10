package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SwmsApproval implements Serializable {
    /**
     * 流程uid
     *
     * @mbg.generated
     */
    private String approvalUid;

    /**
     * 流程模板uid
     *
     * @mbg.generated
     */
    private String templateUid;

    /**
     * 对应业务数据uid
     *
     * @mbg.generated
     */
    private String dataUid;

    /**
     * 审批步骤
     *
     * @mbg.generated
     */
    private Integer approvalStep;

    /**
     * 审批类型：1、职务，2、个人
     *
     * @mbg.generated
     */
    private String approvalType;

    /**
     * 审核人职务编码
     *
     * @mbg.generated
     */
    private Integer postId;

    /**
     * 审批人职务名称
     *
     * @mbg.generated
     */
    private String postName;

    /**
     * 教师ID（审批人id），对应用户中心老师表id
     *
     * @mbg.generated
     */
    private Integer teacherId;

    /**
     * 教师姓名（审批人名称）
     *
     * @mbg.generated
     */
    private String teacherName;

    /**
     * 审批状态：0-待审批，1-已通过，2-已拒绝
     *
     * @mbg.generated
     */
    private String approvalStatus;

    /**
     * 审批意见
     *
     * @mbg.generated
     */
    private String approvalOpinion;

    /**
     * 审批时间
     *
     * @mbg.generated
     */
    private Date approvalTime;

    /**
     * 审批页面地址，对应权限管理-菜单配置-有审批流程的审批页面地址
     *
     * @mbg.generated
     */
    private String approvalUri;

    /**
     * 创建人
     *
     * @mbg.generated
     */
    private String creator;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Long ctime;

    /**
     * 描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     *  状态：    0.锁定 1.正常(默认)：用于逻辑删除
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 学校编码：学校数据隔离
     *
     * @mbg.generated
     */
    private String schoolCode;

    private static final long serialVersionUID = 1L;

    public String getApprovalUid() {
        return approvalUid;
    }

    public void setApprovalUid(String approvalUid) {
        this.approvalUid = approvalUid;
    }

    public String getTemplateUid() {
        return templateUid;
    }

    public void setTemplateUid(String templateUid) {
        this.templateUid = templateUid;
    }

    public String getDataUid() {
        return dataUid;
    }

    public void setDataUid(String dataUid) {
        this.dataUid = dataUid;
    }

    public Integer getApprovalStep() {
        return approvalStep;
    }

    public void setApprovalStep(Integer approvalStep) {
        this.approvalStep = approvalStep;
    }

    public String getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(String approvalType) {
        this.approvalType = approvalType;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovalOpinion() {
        return approvalOpinion;
    }

    public void setApprovalOpinion(String approvalOpinion) {
        this.approvalOpinion = approvalOpinion;
    }

    public Date getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(Date approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getApprovalUri() {
        return approvalUri;
    }

    public void setApprovalUri(String approvalUri) {
        this.approvalUri = approvalUri;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Long getCtime() {
        return ctime;
    }

    public void setCtime(Long ctime) {
        this.ctime = ctime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", approvalUid=").append(approvalUid);
        sb.append(", templateUid=").append(templateUid);
        sb.append(", dataUid=").append(dataUid);
        sb.append(", approvalStep=").append(approvalStep);
        sb.append(", approvalType=").append(approvalType);
        sb.append(", postId=").append(postId);
        sb.append(", postName=").append(postName);
        sb.append(", teacherId=").append(teacherId);
        sb.append(", teacherName=").append(teacherName);
        sb.append(", approvalStatus=").append(approvalStatus);
        sb.append(", approvalOpinion=").append(approvalOpinion);
        sb.append(", approvalTime=").append(approvalTime);
        sb.append(", approvalUri=").append(approvalUri);
        sb.append(", creator=").append(creator);
        sb.append(", ctime=").append(ctime);
        sb.append(", description=").append(description);
        sb.append(", status=").append(status);
        sb.append(", schoolCode=").append(schoolCode);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SwmsApproval other = (SwmsApproval) that;
        return (this.getApprovalUid() == null ? other.getApprovalUid() == null : this.getApprovalUid().equals(other.getApprovalUid()))
            && (this.getTemplateUid() == null ? other.getTemplateUid() == null : this.getTemplateUid().equals(other.getTemplateUid()))
            && (this.getDataUid() == null ? other.getDataUid() == null : this.getDataUid().equals(other.getDataUid()))
            && (this.getApprovalStep() == null ? other.getApprovalStep() == null : this.getApprovalStep().equals(other.getApprovalStep()))
            && (this.getApprovalType() == null ? other.getApprovalType() == null : this.getApprovalType().equals(other.getApprovalType()))
            && (this.getPostId() == null ? other.getPostId() == null : this.getPostId().equals(other.getPostId()))
            && (this.getPostName() == null ? other.getPostName() == null : this.getPostName().equals(other.getPostName()))
            && (this.getTeacherId() == null ? other.getTeacherId() == null : this.getTeacherId().equals(other.getTeacherId()))
            && (this.getTeacherName() == null ? other.getTeacherName() == null : this.getTeacherName().equals(other.getTeacherName()))
            && (this.getApprovalStatus() == null ? other.getApprovalStatus() == null : this.getApprovalStatus().equals(other.getApprovalStatus()))
            && (this.getApprovalOpinion() == null ? other.getApprovalOpinion() == null : this.getApprovalOpinion().equals(other.getApprovalOpinion()))
            && (this.getApprovalTime() == null ? other.getApprovalTime() == null : this.getApprovalTime().equals(other.getApprovalTime()))
            && (this.getApprovalUri() == null ? other.getApprovalUri() == null : this.getApprovalUri().equals(other.getApprovalUri()))
            && (this.getCreator() == null ? other.getCreator() == null : this.getCreator().equals(other.getCreator()))
            && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals(other.getCtime()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSchoolCode() == null ? other.getSchoolCode() == null : this.getSchoolCode().equals(other.getSchoolCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApprovalUid() == null) ? 0 : getApprovalUid().hashCode());
        result = prime * result + ((getTemplateUid() == null) ? 0 : getTemplateUid().hashCode());
        result = prime * result + ((getDataUid() == null) ? 0 : getDataUid().hashCode());
        result = prime * result + ((getApprovalStep() == null) ? 0 : getApprovalStep().hashCode());
        result = prime * result + ((getApprovalType() == null) ? 0 : getApprovalType().hashCode());
        result = prime * result + ((getPostId() == null) ? 0 : getPostId().hashCode());
        result = prime * result + ((getPostName() == null) ? 0 : getPostName().hashCode());
        result = prime * result + ((getTeacherId() == null) ? 0 : getTeacherId().hashCode());
        result = prime * result + ((getTeacherName() == null) ? 0 : getTeacherName().hashCode());
        result = prime * result + ((getApprovalStatus() == null) ? 0 : getApprovalStatus().hashCode());
        result = prime * result + ((getApprovalOpinion() == null) ? 0 : getApprovalOpinion().hashCode());
        result = prime * result + ((getApprovalTime() == null) ? 0 : getApprovalTime().hashCode());
        result = prime * result + ((getApprovalUri() == null) ? 0 : getApprovalUri().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}