package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;

public class SwmsInsuranceSetting implements Serializable {
    /**
     * 保险理赔设置uid
     *
     * @mbg.generated
     */
    private String inssettingUid;

    /**
     * 保险名称
     *
     * @mbg.generated
     */
    private String insuranceName;

    /**
     * 保险公司
     *
     * @mbg.generated
     */
    private String insuranceCompany;

    /**
     * 险种类别,根据实际情况考虑是否需要使用字典表
     *
     * @mbg.generated
     */
    private String insuranceCategory;

    /**
     * 保险期限（一位小数），计量单位：年
     *
     * @mbg.generated
     */
    private Double insuranceLimit;

    /**
     * 保险费用,计量单位：元
     *
     * @mbg.generated
     */
    private Integer insuranceCost;

    /**
     * 详细条款
     *
     * @mbg.generated
     */
    private String detailedTerms;

    /**
     * 保险责任
     *
     * @mbg.generated
     */
    private String insuranceLiability;

    /**
     * 开放申请：0-不开放，1-开放
     *
     * @mbg.generated
     */
    private String isOpen;

    /**
     * 在线支付：1-开启，0-关闭
     *
     * @mbg.generated
     */
    private String isPay;

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

    public String getInssettingUid() {
        return inssettingUid;
    }

    public void setInssettingUid(String inssettingUid) {
        this.inssettingUid = inssettingUid;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String insuranceCompany) {
        this.insuranceCompany = insuranceCompany;
    }

    public String getInsuranceCategory() {
        return insuranceCategory;
    }

    public void setInsuranceCategory(String insuranceCategory) {
        this.insuranceCategory = insuranceCategory;
    }

    public Double getInsuranceLimit() {
        return insuranceLimit;
    }

    public void setInsuranceLimit(Double insuranceLimit) {
        this.insuranceLimit = insuranceLimit;
    }

    public Integer getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(Integer insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public String getDetailedTerms() {
        return detailedTerms;
    }

    public void setDetailedTerms(String detailedTerms) {
        this.detailedTerms = detailedTerms;
    }

    public String getInsuranceLiability() {
        return insuranceLiability;
    }

    public void setInsuranceLiability(String insuranceLiability) {
        this.insuranceLiability = insuranceLiability;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay;
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
        sb.append(", inssettingUid=").append(inssettingUid);
        sb.append(", insuranceName=").append(insuranceName);
        sb.append(", insuranceCompany=").append(insuranceCompany);
        sb.append(", insuranceCategory=").append(insuranceCategory);
        sb.append(", insuranceLimit=").append(insuranceLimit);
        sb.append(", insuranceCost=").append(insuranceCost);
        sb.append(", detailedTerms=").append(detailedTerms);
        sb.append(", insuranceLiability=").append(insuranceLiability);
        sb.append(", isOpen=").append(isOpen);
        sb.append(", isPay=").append(isPay);
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
        SwmsInsuranceSetting other = (SwmsInsuranceSetting) that;
        return (this.getInssettingUid() == null ? other.getInssettingUid() == null : this.getInssettingUid().equals(other.getInssettingUid()))
            && (this.getInsuranceName() == null ? other.getInsuranceName() == null : this.getInsuranceName().equals(other.getInsuranceName()))
            && (this.getInsuranceCompany() == null ? other.getInsuranceCompany() == null : this.getInsuranceCompany().equals(other.getInsuranceCompany()))
            && (this.getInsuranceCategory() == null ? other.getInsuranceCategory() == null : this.getInsuranceCategory().equals(other.getInsuranceCategory()))
            && (this.getInsuranceLimit() == null ? other.getInsuranceLimit() == null : this.getInsuranceLimit().equals(other.getInsuranceLimit()))
            && (this.getInsuranceCost() == null ? other.getInsuranceCost() == null : this.getInsuranceCost().equals(other.getInsuranceCost()))
            && (this.getDetailedTerms() == null ? other.getDetailedTerms() == null : this.getDetailedTerms().equals(other.getDetailedTerms()))
            && (this.getInsuranceLiability() == null ? other.getInsuranceLiability() == null : this.getInsuranceLiability().equals(other.getInsuranceLiability()))
            && (this.getIsOpen() == null ? other.getIsOpen() == null : this.getIsOpen().equals(other.getIsOpen()))
            && (this.getIsPay() == null ? other.getIsPay() == null : this.getIsPay().equals(other.getIsPay()))
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
        result = prime * result + ((getInssettingUid() == null) ? 0 : getInssettingUid().hashCode());
        result = prime * result + ((getInsuranceName() == null) ? 0 : getInsuranceName().hashCode());
        result = prime * result + ((getInsuranceCompany() == null) ? 0 : getInsuranceCompany().hashCode());
        result = prime * result + ((getInsuranceCategory() == null) ? 0 : getInsuranceCategory().hashCode());
        result = prime * result + ((getInsuranceLimit() == null) ? 0 : getInsuranceLimit().hashCode());
        result = prime * result + ((getInsuranceCost() == null) ? 0 : getInsuranceCost().hashCode());
        result = prime * result + ((getDetailedTerms() == null) ? 0 : getDetailedTerms().hashCode());
        result = prime * result + ((getInsuranceLiability() == null) ? 0 : getInsuranceLiability().hashCode());
        result = prime * result + ((getIsOpen() == null) ? 0 : getIsOpen().hashCode());
        result = prime * result + ((getIsPay() == null) ? 0 : getIsPay().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}