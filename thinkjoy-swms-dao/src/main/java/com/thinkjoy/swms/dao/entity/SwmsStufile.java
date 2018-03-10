package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SwmsStufile implements Serializable {
    /**
     * 档案uid
     *
     * @mbg.generated
     */
    private String stufileUid;

    /**
     * 学生ID，对应用户中心学生表id
     *
     * @mbg.generated
     */
    private Integer studentId;

    /**
     * 档案编号
     *
     * @mbg.generated
     */
    private String stufileNo;

    /**
     * 接收人
     *
     * @mbg.generated
     */
    private String recipient;

    /**
     * 建档日期
     *
     * @mbg.generated
     */
    private Date stufileDate;

    /**
     * 档案说明
     *
     * @mbg.generated
     */
    private String stufileDescription;

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
     * 学校编码,学校数据隔离
     *
     * @mbg.generated
     */
    private String schoolCode;

    private static final long serialVersionUID = 1L;

    public String getStufileUid() {
        return stufileUid;
    }

    public void setStufileUid(String stufileUid) {
        this.stufileUid = stufileUid;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStufileNo() {
        return stufileNo;
    }

    public void setStufileNo(String stufileNo) {
        this.stufileNo = stufileNo;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Date getStufileDate() {
        return stufileDate;
    }

    public void setStufileDate(Date stufileDate) {
        this.stufileDate = stufileDate;
    }

    public String getStufileDescription() {
        return stufileDescription;
    }

    public void setStufileDescription(String stufileDescription) {
        this.stufileDescription = stufileDescription;
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
        sb.append(", stufileUid=").append(stufileUid);
        sb.append(", studentId=").append(studentId);
        sb.append(", stufileNo=").append(stufileNo);
        sb.append(", recipient=").append(recipient);
        sb.append(", stufileDate=").append(stufileDate);
        sb.append(", stufileDescription=").append(stufileDescription);
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
        SwmsStufile other = (SwmsStufile) that;
        return (this.getStufileUid() == null ? other.getStufileUid() == null : this.getStufileUid().equals(other.getStufileUid()))
            && (this.getStudentId() == null ? other.getStudentId() == null : this.getStudentId().equals(other.getStudentId()))
            && (this.getStufileNo() == null ? other.getStufileNo() == null : this.getStufileNo().equals(other.getStufileNo()))
            && (this.getRecipient() == null ? other.getRecipient() == null : this.getRecipient().equals(other.getRecipient()))
            && (this.getStufileDate() == null ? other.getStufileDate() == null : this.getStufileDate().equals(other.getStufileDate()))
            && (this.getStufileDescription() == null ? other.getStufileDescription() == null : this.getStufileDescription().equals(other.getStufileDescription()))
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
        result = prime * result + ((getStufileUid() == null) ? 0 : getStufileUid().hashCode());
        result = prime * result + ((getStudentId() == null) ? 0 : getStudentId().hashCode());
        result = prime * result + ((getStufileNo() == null) ? 0 : getStufileNo().hashCode());
        result = prime * result + ((getRecipient() == null) ? 0 : getRecipient().hashCode());
        result = prime * result + ((getStufileDate() == null) ? 0 : getStufileDate().hashCode());
        result = prime * result + ((getStufileDescription() == null) ? 0 : getStufileDescription().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}