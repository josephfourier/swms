package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;

public class SwmsNotice implements Serializable {
    /**
     * 通知uid
     *
     * @mbg.generated
     */
    private String noticeUid;

    /**
     * 通知分类：1、助学金、2、学费减免
     *
     * @mbg.generated
     */
    private String functionClass;

    /**
     * 文件名称/通知标题
     *
     * @mbg.generated
     */
    private String fileName;

    /**
     * 文件存在地址
     *
     * @mbg.generated
     */
    private String filePath;

    /**
     * 通知内容
     *
     * @mbg.generated
     */
    private String noticeContent;

    /**
     * 开放阅读：0-不开放，1-开放
     *
     * @mbg.generated
     */
    private String isOpen;

    /**
     * 查看类型：1-全部可见，2-部分可见
     *
     * @mbg.generated
     */
    private String readType;

    /**
     * 查看范围：除学生外，对应用户中心职务表，多个用逗号“,”隔开,存放职务id
            例如：班主任，辅导员，院系主任，院系副主任，校长，副校长等
            学生：定义一个学生类型常量   0-学生(需要是数字类型)
     *
     * @mbg.generated
     */
    private String readScope;

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

    public String getNoticeUid() {
        return noticeUid;
    }

    public void setNoticeUid(String noticeUid) {
        this.noticeUid = noticeUid;
    }

    public String getFunctionClass() {
        return functionClass;
    }

    public void setFunctionClass(String functionClass) {
        this.functionClass = functionClass;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public String getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(String isOpen) {
        this.isOpen = isOpen;
    }

    public String getReadType() {
        return readType;
    }

    public void setReadType(String readType) {
        this.readType = readType;
    }

    public String getReadScope() {
        return readScope;
    }

    public void setReadScope(String readScope) {
        this.readScope = readScope;
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
        sb.append(", noticeUid=").append(noticeUid);
        sb.append(", functionClass=").append(functionClass);
        sb.append(", fileName=").append(fileName);
        sb.append(", filePath=").append(filePath);
        sb.append(", noticeContent=").append(noticeContent);
        sb.append(", isOpen=").append(isOpen);
        sb.append(", readType=").append(readType);
        sb.append(", readScope=").append(readScope);
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
        SwmsNotice other = (SwmsNotice) that;
        return (this.getNoticeUid() == null ? other.getNoticeUid() == null : this.getNoticeUid().equals(other.getNoticeUid()))
            && (this.getFunctionClass() == null ? other.getFunctionClass() == null : this.getFunctionClass().equals(other.getFunctionClass()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getFilePath() == null ? other.getFilePath() == null : this.getFilePath().equals(other.getFilePath()))
            && (this.getNoticeContent() == null ? other.getNoticeContent() == null : this.getNoticeContent().equals(other.getNoticeContent()))
            && (this.getIsOpen() == null ? other.getIsOpen() == null : this.getIsOpen().equals(other.getIsOpen()))
            && (this.getReadType() == null ? other.getReadType() == null : this.getReadType().equals(other.getReadType()))
            && (this.getReadScope() == null ? other.getReadScope() == null : this.getReadScope().equals(other.getReadScope()))
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
        result = prime * result + ((getNoticeUid() == null) ? 0 : getNoticeUid().hashCode());
        result = prime * result + ((getFunctionClass() == null) ? 0 : getFunctionClass().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getFilePath() == null) ? 0 : getFilePath().hashCode());
        result = prime * result + ((getNoticeContent() == null) ? 0 : getNoticeContent().hashCode());
        result = prime * result + ((getIsOpen() == null) ? 0 : getIsOpen().hashCode());
        result = prime * result + ((getReadType() == null) ? 0 : getReadType().hashCode());
        result = prime * result + ((getReadScope() == null) ? 0 : getReadScope().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}