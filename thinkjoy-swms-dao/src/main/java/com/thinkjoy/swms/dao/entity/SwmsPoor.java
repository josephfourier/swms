package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SwmsPoor implements Serializable {
    /**
     * 困难生管理uid
     *
     * @mbg.generated
     */
    private String poorUid;

    /**
     * 困难生设置uid
     *
     * @mbg.generated
     */
    private String poorsettingUid;

    /**
     * 学生ID，对应用户中心学生表id
     *
     * @mbg.generated
     */
    private Integer studentId;

    /**
     * 家庭总人口,计量单位：人
     *
     * @mbg.generated
     */
    private Integer totalPopulation;

    /**
     * 家庭年收入,计量单位：元
     *
     * @mbg.generated
     */
    private Integer annualIncome;

    /**
     * 人均月收入,计量单位：元
     *
     * @mbg.generated
     */
    private Integer pcmIncome;

    /**
     * 家庭困难类型:字典类型：1-单亲、2-孤儿、3-军烈属、4-自然灾害、5-父母患重病、6-父母双下岗、7-残疾人家庭、99-其它
            多选通过“,”隔开保存
     *
     * @mbg.generated
     */
    private String poorType;

    /**
     * 家庭困难情况
     *
     * @mbg.generated
     */
    private String poorDescription;

    /**
     * 曾受资助情况
     *
     * @mbg.generated
     */
    private String receivedFunding;

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

    public String getPoorUid() {
        return poorUid;
    }

    public void setPoorUid(String poorUid) {
        this.poorUid = poorUid;
    }

    public String getPoorsettingUid() {
        return poorsettingUid;
    }

    public void setPoorsettingUid(String poorsettingUid) {
        this.poorsettingUid = poorsettingUid;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getTotalPopulation() {
        return totalPopulation;
    }

    public void setTotalPopulation(Integer totalPopulation) {
        this.totalPopulation = totalPopulation;
    }

    public Integer getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Integer annualIncome) {
        this.annualIncome = annualIncome;
    }

    public Integer getPcmIncome() {
        return pcmIncome;
    }

    public void setPcmIncome(Integer pcmIncome) {
        this.pcmIncome = pcmIncome;
    }

    public String getPoorType() {
        return poorType;
    }

    public void setPoorType(String poorType) {
        this.poorType = poorType;
    }

    public String getPoorDescription() {
        return poorDescription;
    }

    public void setPoorDescription(String poorDescription) {
        this.poorDescription = poorDescription;
    }

    public String getReceivedFunding() {
        return receivedFunding;
    }

    public void setReceivedFunding(String receivedFunding) {
        this.receivedFunding = receivedFunding;
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
        sb.append(", poorUid=").append(poorUid);
        sb.append(", poorsettingUid=").append(poorsettingUid);
        sb.append(", studentId=").append(studentId);
        sb.append(", totalPopulation=").append(totalPopulation);
        sb.append(", annualIncome=").append(annualIncome);
        sb.append(", pcmIncome=").append(pcmIncome);
        sb.append(", poorType=").append(poorType);
        sb.append(", poorDescription=").append(poorDescription);
        sb.append(", receivedFunding=").append(receivedFunding);
        sb.append(", applyDate=").append(applyDate);
        sb.append(", applyYear=").append(applyYear);
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
        SwmsPoor other = (SwmsPoor) that;
        return (this.getPoorUid() == null ? other.getPoorUid() == null : this.getPoorUid().equals(other.getPoorUid()))
            && (this.getPoorsettingUid() == null ? other.getPoorsettingUid() == null : this.getPoorsettingUid().equals(other.getPoorsettingUid()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getTotalPopulation() == null ? other.getTotalPopulation() == null : this.getTotalPopulation().equals(other.getTotalPopulation()))
            && (this.getAnnualIncome() == null ? other.getAnnualIncome() == null : this.getAnnualIncome().equals(other.getAnnualIncome()))
            && (this.getPcmIncome() == null ? other.getPcmIncome() == null : this.getPcmIncome().equals(other.getPcmIncome()))
            && (this.getPoorType() == null ? other.getPoorType() == null : this.getPoorType().equals(other.getPoorType()))
            && (this.getPoorDescription() == null ? other.getPoorDescription() == null : this.getPoorDescription().equals(other.getPoorDescription()))
            && (this.getReceivedFunding() == null ? other.getReceivedFunding() == null : this.getReceivedFunding().equals(other.getReceivedFunding()))
            && (this.getApplyDate() == null ? other.getApplyDate() == null : this.getApplyDate().equals(other.getApplyDate()))
            && (this.getApplyYear() == null ? other.getApplyYear() == null : this.getApplyYear().equals(other.getApplyYear()))
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
        result = prime * result + ((getPoorUid() == null) ? 0 : getPoorUid().hashCode());
        result = prime * result + ((getPoorsettingUid() == null) ? 0 : getPoorsettingUid().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getTotalPopulation() == null) ? 0 : getTotalPopulation().hashCode());
        result = prime * result + ((getAnnualIncome() == null) ? 0 : getAnnualIncome().hashCode());
        result = prime * result + ((getPcmIncome() == null) ? 0 : getPcmIncome().hashCode());
        result = prime * result + ((getPoorType() == null) ? 0 : getPoorType().hashCode());
        result = prime * result + ((getPoorDescription() == null) ? 0 : getPoorDescription().hashCode());
        result = prime * result + ((getReceivedFunding() == null) ? 0 : getReceivedFunding().hashCode());
        result = prime * result + ((getApplyDate() == null) ? 0 : getApplyDate().hashCode());
        result = prime * result + ((getApplyYear() == null) ? 0 : getApplyYear().hashCode());
        result = prime * result + ((getDataStatus() == null) ? 0 : getDataStatus().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}