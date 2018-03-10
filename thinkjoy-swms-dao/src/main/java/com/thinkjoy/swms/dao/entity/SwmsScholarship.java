package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SwmsScholarship implements Serializable {
    /**
     * 奖学金uid
     *
     * @mbg.generated
     */
    private String scholarshipUid;

    /**
     * 奖学金设置uid
     *
     * @mbg.generated
     */
    private String scholarshipsettingUid;

    /**
     * 学生ID，对应用户中心学生表id
     *
     * @mbg.generated
     */
    private Integer studentId;

    /**
     * 申请日期
     *
     * @mbg.generated
     */
    private Date applyDate;

    /**
     * 申请年份
     *
     * @mbg.generated
     */
    private Integer applyYear;

    /**
     * 申请原因
     *
     * @mbg.generated
     */
    private String applyReson;

    /**
     * 申请状态：审批状态：0-待审批，1-已通过，2-已拒绝，3-审批中
     *
     * @mbg.generated
     */
    private String dataStatus;

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
     *  状态：    0.锁定 1.正常(默认):用于逻辑删除
     *
     * @mbg.generated
     */
    private String status;

    /**
     * 学校编码,学校数据隔离
     *
     * @mbg.generated
     */
    private String schoolCode;

    private static final long serialVersionUID = 1L;

    public String getScholarshipUid() {
        return scholarshipUid;
    }

    public void setScholarshipUid(String scholarshipUid) {
        this.scholarshipUid = scholarshipUid;
    }

    public String getScholarshipsettingUid() {
        return scholarshipsettingUid;
    }

    public void setScholarshipsettingUid(String scholarshipsettingUid) {
        this.scholarshipsettingUid = scholarshipsettingUid;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Integer getApplyYear() {
        return applyYear;
    }

    public void setApplyYear(Integer applyYear) {
        this.applyYear = applyYear;
    }

    public String getApplyReson() {
        return applyReson;
    }

    public void setApplyReson(String applyReson) {
        this.applyReson = applyReson;
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus;
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
        sb.append(", scholarshipUid=").append(scholarshipUid);
        sb.append(", scholarshipsettingUid=").append(scholarshipsettingUid);
        sb.append(", studentId=").append(studentId);
        sb.append(", applyDate=").append(applyDate);
        sb.append(", applyYear=").append(applyYear);
        sb.append(", applyReson=").append(applyReson);
        sb.append(", dataStatus=").append(dataStatus);
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
        SwmsScholarship other = (SwmsScholarship) that;
        return (this.getScholarshipUid() == null ? other.getScholarshipUid() == null : this.getScholarshipUid().equals(other.getScholarshipUid()))
            && (this.getScholarshipsettingUid() == null ? other.getScholarshipsettingUid() == null : this.getScholarshipsettingUid().equals(other.getScholarshipsettingUid()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getApplyDate() == null ? other.getApplyDate() == null : this.getApplyDate().equals(other.getApplyDate()))
            && (this.getApplyYear() == null ? other.getApplyYear() == null : this.getApplyYear().equals(other.getApplyYear()))
            && (this.getApplyReson() == null ? other.getApplyReson() == null : this.getApplyReson().equals(other.getApplyReson()))
            && (this.getDataStatus() == null ? other.getDataStatus() == null : this.getDataStatus().equals(other.getDataStatus()))
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
        result = prime * result + ((getScholarshipUid() == null) ? 0 : getScholarshipUid().hashCode());
        result = prime * result + ((getScholarshipsettingUid() == null) ? 0 : getScholarshipsettingUid().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getApplyDate() == null) ? 0 : getApplyDate().hashCode());
        result = prime * result + ((getApplyYear() == null) ? 0 : getApplyYear().hashCode());
        result = prime * result + ((getApplyReson() == null) ? 0 : getApplyReson().hashCode());
        result = prime * result + ((getDataStatus() == null) ? 0 : getDataStatus().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}