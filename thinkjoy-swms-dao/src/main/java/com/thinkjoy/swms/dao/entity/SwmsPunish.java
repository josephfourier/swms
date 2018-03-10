package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SwmsPunish implements Serializable {
    /**
     * 违纪处分uid
     *
     * @mbg.generated
     */
    private String punishUid;

    /**
     * 违纪处分设置uid
     *
     * @mbg.generated
     */
    private String punishsettingUid;

    /**
     * 学生ID，对应用户中心学生表id
     *
     * @mbg.generated
     */
    private Integer studentId;

    /**
     * 处分日期
     *
     * @mbg.generated
     */
    private Date punishDate;

    /**
     * 处分年份
     *
     * @mbg.generated
     */
    private Integer punishYear;

    /**
     * 处分说明
     *
     * @mbg.generated
     */
    private String punishDescription;

    /**
     * 撤销日期
     *
     * @mbg.generated
     */
    private Date cancelDate;

    /**
     * 处分状态:1-已生效，2-已撤销
     *
     * @mbg.generated
     */
    private String punishStatus;

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

    public String getPunishUid() {
        return punishUid;
    }

    public void setPunishUid(String punishUid) {
        this.punishUid = punishUid;
    }

    public String getPunishsettingUid() {
        return punishsettingUid;
    }

    public void setPunishsettingUid(String punishsettingUid) {
        this.punishsettingUid = punishsettingUid;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Date getPunishDate() {
        return punishDate;
    }

    public void setPunishDate(Date punishDate) {
        this.punishDate = punishDate;
    }

    public Integer getPunishYear() {
        return punishYear;
    }

    public void setPunishYear(Integer punishYear) {
        this.punishYear = punishYear;
    }

    public String getPunishDescription() {
        return punishDescription;
    }

    public void setPunishDescription(String punishDescription) {
        this.punishDescription = punishDescription;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getPunishStatus() {
        return punishStatus;
    }

    public void setPunishStatus(String punishStatus) {
        this.punishStatus = punishStatus;
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
        sb.append(", punishUid=").append(punishUid);
        sb.append(", punishsettingUid=").append(punishsettingUid);
        sb.append(", studentId=").append(studentId);
        sb.append(", punishDate=").append(punishDate);
        sb.append(", punishYear=").append(punishYear);
        sb.append(", punishDescription=").append(punishDescription);
        sb.append(", cancelDate=").append(cancelDate);
        sb.append(", punishStatus=").append(punishStatus);
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
        SwmsPunish other = (SwmsPunish) that;
        return (this.getPunishUid() == null ? other.getPunishUid() == null : this.getPunishUid().equals(other.getPunishUid()))
            && (this.getPunishsettingUid() == null ? other.getPunishsettingUid() == null : this.getPunishsettingUid().equals(other.getPunishsettingUid()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getPunishDate() == null ? other.getPunishDate() == null : this.getPunishDate().equals(other.getPunishDate()))
            && (this.getPunishYear() == null ? other.getPunishYear() == null : this.getPunishYear().equals(other.getPunishYear()))
            && (this.getPunishDescription() == null ? other.getPunishDescription() == null : this.getPunishDescription().equals(other.getPunishDescription()))
            && (this.getCancelDate() == null ? other.getCancelDate() == null : this.getCancelDate().equals(other.getCancelDate()))
            && (this.getPunishStatus() == null ? other.getPunishStatus() == null : this.getPunishStatus().equals(other.getPunishStatus()))
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
        result = prime * result + ((getPunishUid() == null) ? 0 : getPunishUid().hashCode());
        result = prime * result + ((getPunishsettingUid() == null) ? 0 : getPunishsettingUid().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getPunishDate() == null) ? 0 : getPunishDate().hashCode());
        result = prime * result + ((getPunishYear() == null) ? 0 : getPunishYear().hashCode());
        result = prime * result + ((getPunishDescription() == null) ? 0 : getPunishDescription().hashCode());
        result = prime * result + ((getCancelDate() == null) ? 0 : getCancelDate().hashCode());
        result = prime * result + ((getPunishStatus() == null) ? 0 : getPunishStatus().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}