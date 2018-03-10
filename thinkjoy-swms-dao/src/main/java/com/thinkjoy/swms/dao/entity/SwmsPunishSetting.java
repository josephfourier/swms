package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;

public class SwmsPunishSetting implements Serializable {
    /**
     * 违纪处分设置uid
     *
     * @mbg.generated
     */
    private String punishsettingUid;

    /**
     * 类型名称
     *
     * @mbg.generated
     */
    private String punishName;

    /**
     * 类型说明
     *
     * @mbg.generated
     */
    private String punishtDescription;

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

    public String getPunishsettingUid() {
        return punishsettingUid;
    }

    public void setPunishsettingUid(String punishsettingUid) {
        this.punishsettingUid = punishsettingUid;
    }

    public String getPunishName() {
        return punishName;
    }

    public void setPunishName(String punishName) {
        this.punishName = punishName;
    }

    public String getPunishtDescription() {
        return punishtDescription;
    }

    public void setPunishtDescription(String punishtDescription) {
        this.punishtDescription = punishtDescription;
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
        sb.append(", punishsettingUid=").append(punishsettingUid);
        sb.append(", punishName=").append(punishName);
        sb.append(", punishtDescription=").append(punishtDescription);
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
        SwmsPunishSetting other = (SwmsPunishSetting) that;
        return (this.getPunishsettingUid() == null ? other.getPunishsettingUid() == null : this.getPunishsettingUid().equals(other.getPunishsettingUid()))
            && (this.getPunishName() == null ? other.getPunishName() == null : this.getPunishName().equals(other.getPunishName()))
            && (this.getPunishtDescription() == null ? other.getPunishtDescription() == null : this.getPunishtDescription().equals(other.getPunishtDescription()))
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
        result = prime * result + ((getPunishsettingUid() == null) ? 0 : getPunishsettingUid().hashCode());
        result = prime * result + ((getPunishName() == null) ? 0 : getPunishName().hashCode());
        result = prime * result + ((getPunishtDescription() == null) ? 0 : getPunishtDescription().hashCode());
        result = prime * result + ((getCreator() == null) ? 0 : getCreator().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSchoolCode() == null) ? 0 : getSchoolCode().hashCode());
        return result;
    }
}