package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.Date;

public class SwmsNoticeRead implements Serializable {
    /**
     * 阅读记录uid
     *
     * @mbg.generated
     */
    private String readUid;

    /**
     * 通知uid
     *
     * @mbg.generated
     */
    private String noticeUid;

    /**
     * 用户类型
            1:学生
            2:家长
            3:教师
            4:教育机构
     *
     * @mbg.generated
     */
    private Integer usertypeId;

    /**
     * 阅读用户id
     *
     * @mbg.generated
     */
    private Integer readuserId;

    /**
     * 阅读时间
     *
     * @mbg.generated
     */
    private Date readTime;

    /**
     * 学校编码,学校数据隔离
     *
     * @mbg.generated
     */
    private String schoolCode;

    private static final long serialVersionUID = 1L;

    public String getReadUid() {
        return readUid;
    }

    public void setReadUid(String readUid) {
        this.readUid = readUid;
    }

    public String getNoticeUid() {
        return noticeUid;
    }

    public void setNoticeUid(String noticeUid) {
        this.noticeUid = noticeUid;
    }

    public Integer getUsertypeId() {
        return usertypeId;
    }

    public void setUsertypeId(Integer usertypeId) {
        this.usertypeId = usertypeId;
    }

    public Integer getReaduserId() {
        return readuserId;
    }

    public void setReaduserId(Integer readuserId) {
        this.readuserId = readuserId;
    }

    public Date getReadTime() {
        return readTime;
    }

    public void setReadTime(Date readTime) {
        this.readTime = readTime;
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
        sb.append(", readUid=").append(readUid);
        sb.append(", noticeUid=").append(noticeUid);
        sb.append(", usertypeId=").append(usertypeId);
        sb.append(", readuserId=").append(readuserId);
        sb.append(", readTime=").append(readTime);
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
        SwmsNoticeRead other = (SwmsNoticeRead) that;
        return (this.getReadUid() == null ? other.getReadUid() == null : this.getReadUid().equals(other.getReadUid()))
            && (this.getNoticeUid() == null ? other.getNoticeUid() == null : this.getNoticeUid().equals(other.getNoticeUid()))
            && (this.getUsertypeId() == null ? other.getUsertypeId() == null : this.getUsertypeId().equals(other.getUsertypeId()))
            && (this.getReaduserId() == null ? other.getReaduserId() == null : this.getReaduserId().equals(other.getReaduserId()))
            && (this.getReadTime() == null ? other.getReadTime() == null : this.getReadTime().equals(other.getReadTime()))
            && (this.getSchoolCode() == null ? other.getSchoolCode() == null : this.getSchoolCode().equals(other.getSchoolCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getReadUid() == null) ? 0 : getReadUid().hashCode());
        result = prime * result + ((getNoticeUid() == null) ? 0 : getNoticeUid().hashCode());
        result = prime * result + ((getUsertypeId() == null) ? 0 : getUsertypeId().hashCode());
        result = prime * result + ((getReaduserId() == null) ? 0 : getReaduserId().hashCode());
        result = prime * result + ((getReadTime() == null) ? 0 : getReadTime().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}