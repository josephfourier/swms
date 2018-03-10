package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SwmsHonorarySetting implements Serializable {
    /**
     * 荣誉称号设置uid
     *
     * @mbg.generated
     */
    private String honorarysettingUid;

    /**
     * 荣誉称号名称
     *
     * @mbg.generated
     */
    private String honoraryName;

    /**
     * 荣誉称号类别:字典表：1-院级，2-班级，3-个人
     *
     * @mbg.generated
     */
    private String honoraryCategory;

    /**
     * 荣誉称号简介
     *
     * @mbg.generated
     */
    private String honoraryIntroduction;

    /**
     * 人数限制,计量单位：个
     *
     * @mbg.generated
     */
    private Integer numberLimit;

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
     * 开放申请：0-不开放，1-开放
     *
     * @mbg.generated
     */
    private String isOpen;

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

    public String getHonorarysettingUid() {
        return honorarysettingUid;
    }

    public void setHonorarysettingUid(String honorarysettingUid) {
        this.honorarysettingUid = honorarysettingUid;
    }

    public String getHonoraryName() {
        return honoraryName;
    }

    public void setHonoraryName(String honoraryName) {
        this.honoraryName = honoraryName;
    }

    public String getHonoraryCategory() {
        return honoraryCategory;
    }

    public void setHonoraryCategory(String honoraryCategory) {
        this.honoraryCategory = honoraryCategory;
    }

    public String getHonoraryIntroduction() {
        return honoraryIntroduction;
    }

    public void setHonoraryIntroduction(String honoraryIntroduction) {
        this.honoraryIntroduction = honoraryIntroduction;
    }

    public Integer getNumberLimit() {
        return numberLimit;
    }

    public void setNumberLimit(Integer numberLimit) {
        this.numberLimit = numberLimit;
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

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
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
        sb.append(", honorarysettingUid=").append(honorarysettingUid);
        sb.append(", honoraryName=").append(honoraryName);
        sb.append(", honoraryCategory=").append(honoraryCategory);
        sb.append(", honoraryIntroduction=").append(honoraryIntroduction);
        sb.append(", numberLimit=").append(numberLimit);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", isOpen=").append(isOpen);
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
        SwmsHonorarySetting other = (SwmsHonorarySetting) that;
        return (this.getHonorarysettingUid() == null ? other.getHonorarysettingUid() == null : this.getHonorarysettingUid().equals(other.getHonorarysettingUid()))
            && (this.getHonoraryName() == null ? other.getHonoraryName() == null : this.getHonoraryName().equals(other.getHonoraryName()))
            && (this.getHonoraryCategory() == null ? other.getHonoraryCategory() == null : this.getHonoraryCategory().equals(other.getHonoraryCategory()))
            && (this.getHonoraryIntroduction() == null ? other.getHonoraryIntroduction() == null : this.getHonoraryIntroduction().equals(other.getHonoraryIntroduction()))
            && (this.getNumberLimit() == null ? other.getNumberLimit() == null : this.getNumberLimit().equals(other.getNumberLimit()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getIsOpen() == null ? other.getIsOpen() == null : this.getIsOpen().equals(other.getIsOpen()))
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
        result = prime * result + ((getHonorarysettingUid() == null) ? 0 : getHonorarysettingUid().hashCode());
        result = prime * result + ((getHonoraryName() == null) ? 0 : getHonoraryName().hashCode());
        result = prime * result + ((getHonoraryCategory() == null) ? 0 : getHonoraryCategory().hashCode());
        result = prime * result + ((getHonoraryIntroduction() == null) ? 0 : getHonoraryIntroduction().hashCode());
        result = prime * result + ((getNumberLimit() == null) ? 0 : getNumberLimit().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getIsOpen() == null) ? 0 : getIsOpen().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}