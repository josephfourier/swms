package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SwmsPunishSettingExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SwmsPunishSettingExample() {
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

        public Criteria andPunishsettingUidIsNull() {
            addCriterion("punishsetting_uid is null");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidIsNotNull() {
            addCriterion("punishsetting_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidEqualTo(String value) {
            addCriterion("punishsetting_uid =", value, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidNotEqualTo(String value) {
            addCriterion("punishsetting_uid <>", value, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidGreaterThan(String value) {
            addCriterion("punishsetting_uid >", value, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidGreaterThanOrEqualTo(String value) {
            addCriterion("punishsetting_uid >=", value, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidLessThan(String value) {
            addCriterion("punishsetting_uid <", value, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidLessThanOrEqualTo(String value) {
            addCriterion("punishsetting_uid <=", value, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidLike(String value) {
            addCriterion("punishsetting_uid like", value, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidNotLike(String value) {
            addCriterion("punishsetting_uid not like", value, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidIn(List<String> values) {
            addCriterion("punishsetting_uid in", values, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidNotIn(List<String> values) {
            addCriterion("punishsetting_uid not in", values, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidBetween(String value1, String value2) {
            addCriterion("punishsetting_uid between", value1, value2, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishsettingUidNotBetween(String value1, String value2) {
            addCriterion("punishsetting_uid not between", value1, value2, "punishsettingUid");
            return (Criteria) this;
        }

        public Criteria andPunishNameIsNull() {
            addCriterion("punish_name is null");
            return (Criteria) this;
        }

        public Criteria andPunishNameIsNotNull() {
            addCriterion("punish_name is not null");
            return (Criteria) this;
        }

        public Criteria andPunishNameEqualTo(String value) {
            addCriterion("punish_name =", value, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameNotEqualTo(String value) {
            addCriterion("punish_name <>", value, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameGreaterThan(String value) {
            addCriterion("punish_name >", value, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameGreaterThanOrEqualTo(String value) {
            addCriterion("punish_name >=", value, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameLessThan(String value) {
            addCriterion("punish_name <", value, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameLessThanOrEqualTo(String value) {
            addCriterion("punish_name <=", value, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameLike(String value) {
            addCriterion("punish_name like", value, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameNotLike(String value) {
            addCriterion("punish_name not like", value, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameIn(List<String> values) {
            addCriterion("punish_name in", values, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameNotIn(List<String> values) {
            addCriterion("punish_name not in", values, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameBetween(String value1, String value2) {
            addCriterion("punish_name between", value1, value2, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishNameNotBetween(String value1, String value2) {
            addCriterion("punish_name not between", value1, value2, "punishName");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionIsNull() {
            addCriterion("punisht_description is null");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionIsNotNull() {
            addCriterion("punisht_description is not null");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionEqualTo(String value) {
            addCriterion("punisht_description =", value, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionNotEqualTo(String value) {
            addCriterion("punisht_description <>", value, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionGreaterThan(String value) {
            addCriterion("punisht_description >", value, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("punisht_description >=", value, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionLessThan(String value) {
            addCriterion("punisht_description <", value, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionLessThanOrEqualTo(String value) {
            addCriterion("punisht_description <=", value, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionLike(String value) {
            addCriterion("punisht_description like", value, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionNotLike(String value) {
            addCriterion("punisht_description not like", value, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionIn(List<String> values) {
            addCriterion("punisht_description in", values, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionNotIn(List<String> values) {
            addCriterion("punisht_description not in", values, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionBetween(String value1, String value2) {
            addCriterion("punisht_description between", value1, value2, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andPunishtDescriptionNotBetween(String value1, String value2) {
            addCriterion("punisht_description not between", value1, value2, "punishtDescription");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("creator like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("creator not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Long value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Long value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Long value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Long value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Long value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Long value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Long> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Long> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Long value1, Long value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Long value1, Long value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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