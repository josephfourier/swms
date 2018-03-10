package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SwmsAllowanceSetting implements Serializable {
    /**
     * 困难部署设置uid
     *
     * @mbg.generated
     */
    private String allsettingUid;

    /**
     * 困难补助名称
     *
     * @mbg.generated
     */
    private String allowanceName;

    /**
     * 名额限制,计量单位：人
     *
     * @mbg.generated
     */
    private Integer numberLimit;

    /**
     * 金额,计量单位：元
     *
     * @mbg.generated
     */
    private Integer money;

    /**
     * 发放方式,字典 1-每学期，2-每月，3-每年
     *
     * @mbg.generated
     */
    private String grantWay;

    /**
     * 发放对象
     *
     * @mbg.generated
     */
    private String grantObject;

    /**
     * 资金来源
     *
     * @mbg.generated
     */
    private String fundsSource;

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

    public String getAllsettingUid() {
        return allsettingUid;
    }

    public void setAllsettingUid(String allsettingUid) {
        this.allsettingUid = allsettingUid;
    }

    public String getAllowanceName() {
        return allowanceName;
    }

    public void setAllowanceName(String allowanceName) {
        this.allowanceName = allowanceName;
    }

    public Integer getNumberLimit() {
        return numberLimit;
    }

    public void setNumberLimit(Integer numberLimit) {
        this.numberLimit = numberLimit;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getGrantWay() {
        return grantWay;
    }

    public void setGrantWay(String grantWay) {
        this.grantWay = grantWay;
    }

    public String getGrantObject() {
        return grantObject;
    }

    public void setGrantObject(String grantObject) {
        this.grantObject = grantObject;
    }

    public String getFundsSource() {
        return fundsSource;
    }

    public void setFundsSource(String fundsSource) {
        this.fundsSource = fundsSource;
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
        sb.append(", allsettingUid=").append(allsettingUid);
        sb.append(", allowanceName=").append(allowanceName);
        sb.append(", numberLimit=").append(numberLimit);
        sb.append(", money=").append(money);
        sb.append(", grantWay=").append(grantWay);
        sb.append(", grantObject=").append(grantObject);
        sb.append(", fundsSource=").append(fundsSource);
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
        SwmsAllowanceSetting other = (SwmsAllowanceSetting) that;
        return (this.getAllsettingUid() == null ? other.getAllsettingUid() == null : this.getAllsettingUid().equals(other.getAllsettingUid()))
            && (this.getAllowanceName() == null ? other.getAllowanceName() == null : this.getAllowanceName().equals(other.getAllowanceName()))
            && (this.getNumberLimit() == null ? other.getNumberLimit() == null : this.getNumberLimit().equals(other.getNumberLimit()))
            && (this.getMoney() == null ? other.getMoney() == null : this.getMoney().equals(other.getMoney()))
            && (this.getGrantWay() == null ? other.getGrantWay() == null : this.getGrantWay().equals(other.getGrantWay()))
            && (this.getGrantObject() == null ? other.getGrantObject() == null : this.getGrantObject().equals(other.getGrantObject()))
            && (this.getFundsSource() == null ? other.getFundsSource() == null : this.getFundsSource().equals(other.getFundsSource()))
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
        result = prime * result + ((getAllsettingUid() == null) ? 0 : getAllsettingUid().hashCode());
        result = prime * result + ((getAllowanceName() == null) ? 0 : getAllowanceName().hashCode());
        result = prime * result + ((getNumberLimit() == null) ? 0 : getNumberLimit().hashCode());
        result = prime * result + ((getMoney() == null) ? 0 : getMoney().hashCode());
        result = prime * result + ((getGrantWay() == null) ? 0 : getGrantWay().hashCode());
        result = prime * result + ((getGrantObject() == null) ? 0 : getGrantObject().hashCode());
        result = prime * result + ((getFundsSource() == null) ? 0 : getFundsSource().hashCode());
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