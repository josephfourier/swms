package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SwmsNoticeReadExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SwmsNoticeReadExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andReadUidIsNull() {
            addCriterion("read_uid is null");
            return (Criteria) this;
        }

        public Criteria andReadUidIsNotNull() {
            addCriterion("read_uid is not null");
            return (Criteria) this;
        }

        public Criteria andReadUidEqualTo(String value) {
            addCriterion("read_uid =", value, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidNotEqualTo(String value) {
            addCriterion("read_uid <>", value, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidGreaterThan(String value) {
            addCriterion("read_uid >", value, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidGreaterThanOrEqualTo(String value) {
            addCriterion("read_uid >=", value, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidLessThan(String value) {
            addCriterion("read_uid <", value, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidLessThanOrEqualTo(String value) {
            addCriterion("read_uid <=", value, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidLike(String value) {
            addCriterion("read_uid like", value, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidNotLike(String value) {
            addCriterion("read_uid not like", value, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidIn(List<String> values) {
            addCriterion("read_uid in", values, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidNotIn(List<String> values) {
            addCriterion("read_uid not in", values, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidBetween(String value1, String value2) {
            addCriterion("read_uid between", value1, value2, "readUid");
            return (Criteria) this;
        }

        public Criteria andReadUidNotBetween(String value1, String value2) {
            addCriterion("read_uid not between", value1, value2, "readUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidIsNull() {
            addCriterion("notice_uid is null");
            return (Criteria) this;
        }

        public Criteria andNoticeUidIsNotNull() {
            addCriterion("notice_uid is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeUidEqualTo(String value) {
            addCriterion("notice_uid =", value, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidNotEqualTo(String value) {
            addCriterion("notice_uid <>", value, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidGreaterThan(String value) {
            addCriterion("notice_uid >", value, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidGreaterThanOrEqualTo(String value) {
            addCriterion("notice_uid >=", value, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidLessThan(String value) {
            addCriterion("notice_uid <", value, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidLessThanOrEqualTo(String value) {
            addCriterion("notice_uid <=", value, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidLike(String value) {
            addCriterion("notice_uid like", value, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidNotLike(String value) {
            addCriterion("notice_uid not like", value, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidIn(List<String> values) {
            addCriterion("notice_uid in", values, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidNotIn(List<String> values) {
            addCriterion("notice_uid not in", values, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidBetween(String value1, String value2) {
            addCriterion("notice_uid between", value1, value2, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andNoticeUidNotBetween(String value1, String value2) {
            addCriterion("notice_uid not between", value1, value2, "noticeUid");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdIsNull() {
            addCriterion("usertype_id is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdIsNotNull() {
            addCriterion("usertype_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdEqualTo(Integer value) {
            addCriterion("usertype_id =", value, "usertypeId");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdNotEqualTo(Integer value) {
            addCriterion("usertype_id <>", value, "usertypeId");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdGreaterThan(Integer value) {
            addCriterion("usertype_id >", value, "usertypeId");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("usertype_id >=", value, "usertypeId");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdLessThan(Integer value) {
            addCriterion("usertype_id <", value, "usertypeId");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("usertype_id <=", value, "usertypeId");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdIn(List<Integer> values) {
            addCriterion("usertype_id in", values, "usertypeId");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdNotIn(List<Integer> values) {
            addCriterion("usertype_id not in", values, "usertypeId");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdBetween(Integer value1, Integer value2) {
            addCriterion("usertype_id between", value1, value2, "usertypeId");
            return (Criteria) this;
        }

        public Criteria andUsertypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("usertype_id not between", value1, value2, "usertypeId");
            return (Criteria) this;
        }

        public Criteria andReaduserIdIsNull() {
            addCriterion("readuser_id is null");
            return (Criteria) this;
        }

        public Criteria andReaduserIdIsNotNull() {
            addCriterion("readuser_id is not null");
            return (Criteria) this;
        }

        public Criteria andReaduserIdEqualTo(Integer value) {
            addCriterion("readuser_id =", value, "readuserId");
            return (Criteria) this;
        }

        public Criteria andReaduserIdNotEqualTo(Integer value) {
            addCriterion("readuser_id <>", value, "readuserId");
            return (Criteria) this;
        }

        public Criteria andReaduserIdGreaterThan(Integer value) {
            addCriterion("readuser_id >", value, "readuserId");
            return (Criteria) this;
        }

        public Criteria andReaduserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("readuser_id >=", value, "readuserId");
            return (Criteria) this;
        }

        public Criteria andReaduserIdLessThan(Integer value) {
            addCriterion("readuser_id <", value, "readuserId");
            return (Criteria) this;
        }

        public Criteria andReaduserIdLessThanOrEqualTo(Integer value) {
            addCriterion("readuser_id <=", value, "readuserId");
            return (Criteria) this;
        }

        public Criteria andReaduserIdIn(List<Integer> values) {
            addCriterion("readuser_id in", values, "readuserId");
            return (Criteria) this;
        }

        public Criteria andReaduserIdNotIn(List<Integer> values) {
            addCriterion("readuser_id not in", values, "readuserId");
            return (Criteria) this;
        }

        public Criteria andReaduserIdBetween(Integer value1, Integer value2) {
            addCriterion("readuser_id between", value1, value2, "readuserId");
            return (Criteria) this;
        }

        public Criteria andReaduserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("readuser_id not between", value1, value2, "readuserId");
            return (Criteria) this;
        }

        public Criteria andReadTimeIsNull() {
            addCriterion("read_time is null");
            return (Criteria) this;
        }

        public Criteria andReadTimeIsNotNull() {
            addCriterion("read_time is not null");
            return (Criteria) this;
        }

        public Criteria andReadTimeEqualTo(Date value) {
            addCriterion("read_time =", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeNotEqualTo(Date value) {
            addCriterion("read_time <>", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeGreaterThan(Date value) {
            addCriterion("read_time >", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("read_time >=", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeLessThan(Date value) {
            addCriterion("read_time <", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeLessThanOrEqualTo(Date value) {
            addCriterion("read_time <=", value, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeIn(List<Date> values) {
            addCriterion("read_time in", values, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeNotIn(List<Date> values) {
            addCriterion("read_time not in", values, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeBetween(Date value1, Date value2) {
            addCriterion("read_time between", value1, value2, "readTime");
            return (Criteria) this;
        }

        public Criteria andReadTimeNotBetween(Date value1, Date value2) {
            addCriterion("read_time not between", value1, value2, "readTime");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIsNull() {
            addCriterion("school_code is null");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIsNotNull() {
            addCriterion("school_code is not null");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeEqualTo(String value) {
            addCriterion("school_code =", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotEqualTo(String value) {
            addCriterion("school_code <>", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeGreaterThan(String value) {
            addCriterion("school_code >", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeGreaterThanOrEqualTo(String value) {
            addCriterion("school_code >=", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLessThan(String value) {
            addCriterion("school_code <", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLessThanOrEqualTo(String value) {
            addCriterion("school_code <=", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeLike(String value) {
            addCriterion("school_code like", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotLike(String value) {
            addCriterion("school_code not like", value, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeIn(List<String> values) {
            addCriterion("school_code in", values, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotIn(List<String> values) {
            addCriterion("school_code not in", values, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeBetween(String value1, String value2) {
            addCriterion("school_code between", value1, value2, "schoolCode");
            return (Criteria) this;
        }

        public Criteria andSchoolCodeNotBetween(String value1, String value2) {
            addCriterion("school_code not between", value1, value2, "schoolCode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}