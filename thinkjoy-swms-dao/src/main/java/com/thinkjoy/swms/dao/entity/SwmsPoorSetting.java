package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SwmsPoorSetting implements Serializable {
    /**
     * 困难生设置uid
     *
     * @mbg.generated
     */
    private String poorsettingUid;

    /**
     * 申请年份
     *
     * @mbg.generated
     */
    private Integer applyYear;

    /**
     * 申请说明
     *
     * @mbg.generated
     */
    private String applyDescription;

    /**
     * 申请开始日期
     *
     * @mbg.generated
     */
    private Date startDate;

    /**
     * 申请截止日期
     *
     * @mbg.generated
     */
    private Date endDate;

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

    public String getPoorsettingUid() {
        return poorsettingUid;
    }

    public void setPoorsettingUid(String poorsettingUid) {
        this.poorsettingUid = poorsettingUid;
    }

    public Integer getApplyYear() {
        return applyYear;
    }

    public void setApplyYear(Integer applyYear) {
        this.applyYear = applyYear;
    }

    public String getApplyDescription() {
        return applyDescription;
    }

    public void setApplyDescription(String applyDescription) {
        this.applyDescription = applyDescription;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
        sb.append(", poorsettingUid=").append(poorsettingUid);
        sb.append(", applyYear=").append(applyYear);
        sb.append(", applyDescription=").append(applyDescription);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
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
        SwmsPoorSetting other = (SwmsPoorSetting) that;
        return (this.getPoorsettingUid() == null ? other.getPoorsettingUid() == null : this.getPoorsettingUid().equals(other.getPoorsettingUid()))
            && (this.getApplyYear() == null ? other.getApplyYear() == null : this.getApplyYear().equals(other.getApplyYear()))
            && (this.getApplyDescription() == null ? other.getApplyDescription() == null : this.getApplyDescription().equals(other.getApplyDescription()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
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
        result = prime * result + ((getPoorsettingUid() == null) ? 0 : getPoorsettingUid().hashCode());
        result = prime * result + ((getApplyYear() == null) ? 0 : getApplyYear().hashCode());
        result = prime * result + ((getApplyDescription() == null) ? 0 : getApplyDescription().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}