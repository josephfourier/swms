package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;

public class SwmsStufileList implements Serializable {
    /**
     * 材料uid
     *
     * @mbg.generated
     */
    private String listUid;

    /**
     * 档案设置uid
     *
     * @mbg.generated
     */
    private String stufilesettingUid;

    /**
     * 档案uid
     *
     * @mbg.generated
     */
    private String stufileUid;

    /**
     * 附件地址
     *
     * @mbg.generated
     */
    private String stufilePath;

    private static final long serialVersionUID = 1L;

    public String getListUid() {
        return listUid;
    }

    public void setListUid(String listUid) {
        this.listUid = listUid;
    }

    public String getStufilesettingUid() {
        return stufilesettingUid;
    }

    public void setStufilesettingUid(String stufilesettingUid) {
        this.stufilesettingUid = stufilesettingUid;
    }

    public String getStufileUid() {
        return stufileUid;
    }

    public void setStufileUid(String stufileUid) {
        this.stufileUid = stufileUid;
    }

    public String getStufilePath() {
        return stufilePath;
    }

    public void setStufilePath(String stufilePath) {
        this.stufilePath = stufilePath;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", listUid=").append(listUid);
        sb.append(", stufilesettingUid=").append(stufilesettingUid);
        sb.append(", stufileUid=").append(stufileUid);
        sb.append(", stufilePath=").append(stufilePath);
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
        SwmsStufileList other = (SwmsStufileList) that;
        return (this.getListUid() == null ? other.getListUid() == null : this.getListUid().equals(other.getListUid()))
            && (this.getStufilesettingUid() == null ? other.getStufilesettingUid() == null : this.getStufilesettingUid().equals(other.getStufilesettingUid()))
            && (this.getStufileUid() == null ? other.getStufileUid() == null : this.getStufileUid().equals(other.getStufileUid()))
            && (this.getStufilePath() == null ? other.getStufilePath() == null : this.getStufilePath().equals(other.getStufilePath()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getListUid() == null) ? 0 : getListUid().hashCode());
        result = prime * result + ((getStufilesettingUid() == null) ? 0 : getStufilesettingUid().hashCode());
        result = prime * result + ((getStufileUid() == null) ? 0 : getStufileUid().hashCode());
        result = prime * result + ((getStufilePath() == null) ? 0 : getStufilePath().hashCode());
        return result;
    }
}