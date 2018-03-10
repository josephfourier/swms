package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SwmsWorkstudySetting implements Serializable {
    /**
     * 勤工助学设置uid
     *
     * @mbg.generated
     */
    private String worksettingUid;

    /**
     * 专业ID，对应用户中心专业表id
     *
     * @mbg.generated
     */
    private Integer specialtyId;

    /**
     * 岗位名称
     *
     * @mbg.generated
     */
    private String postName;

    /**
     * 名额限制,计量单位：人
     *
     * @mbg.generated
     */
    private Integer numberLimit;

    /**
     * 薪资待遇
     *
     * @mbg.generated
     */
    private Integer salary;

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
     * 岗位说明
     *
     * @mbg.generated
     */
    private String postDescription;

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

    public String getWorksettingUid() {
        return worksettingUid;
    }

    public void setWorksettingUid(String worksettingUid) {
        this.worksettingUid = worksettingUid;
    }

    public Integer getSpecialtyId() {
        return specialtyId;
    }

    public void setSpecialtyId(Integer specialtyId) {
        this.specialtyId = specialtyId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public Integer getNumberLimit() {
        return numberLimit;
    }

    public void setNumberLimit(Integer numberLimit) {
        this.numberLimit = numberLimit;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
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

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
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
        sb.append(", worksettingUid=").append(worksettingUid);
        sb.append(", specialtyId=").append(specialtyId);
        sb.append(", postName=").append(postName);
        sb.append(", numberLimit=").append(numberLimit);
        sb.append(", salary=").append(salary);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", isOpen=").append(isOpen);
        sb.append(", postDescription=").append(postDescription);
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
        SwmsWorkstudySetting other = (SwmsWorkstudySetting) that;
        return (this.getWorksettingUid() == null ? other.getWorksettingUid() == null : this.getWorksettingUid().equals(other.getWorksettingUid()))
            && (this.getSpecialtyId() == null ? other.getSpecialtyId() == null : this.getSpecialtyId().equals(other.getSpecialtyId()))
            && (this.getPostName() == null ? other.getPostName() == null : this.getPostName().equals(other.getPostName()))
            && (this.getNumberLimit() == null ? other.getNumberLimit() == null : this.getNumberLimit().equals(other.getNumberLimit()))
            && (this.getSalary() == null ? other.getSalary() == null : this.getSalary().equals(other.getSalary()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getIsOpen() == null ? other.getIsOpen() == null : this.getIsOpen().equals(other.getIsOpen()))
            && (this.getPostDescription() == null ? other.getPostDescription() == null : this.getPostDescription().equals(other.getPostDescription()))
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
        result = prime * result + ((getWorksettingUid() == null) ? 0 : getWorksettingUid().hashCode());
        result = prime * result + ((getSpecialtyId() == null) ? 0 : getSpecialtyId().hashCode());
        result = prime * result + ((getPostName() == null) ? 0 : getPostName().hashCode());
        result = prime * result + ((getNumberLimit() == null) ? 0 : getNumberLimit().hashCode());
        result = prime * result + ((getSalary() == null) ? 0 : getSalary().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getIsOpen() == null) ? 0 : getIsOpen().hashCode());
        result = prime * result + ((getPostDescription() == null) ? 0 : getPostDescription().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}