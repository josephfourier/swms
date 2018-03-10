package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SwmsStufileListExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SwmsStufileListExample() {
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

        public Criteria andListUidIsNull() {
            addCriterion("list_uid is null");
            return (Criteria) this;
        }

        public Criteria andListUidIsNotNull() {
            addCriterion("list_uid is not null");
            return (Criteria) this;
        }

        public Criteria andListUidEqualTo(String value) {
            addCriterion("list_uid =", value, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidNotEqualTo(String value) {
            addCriterion("list_uid <>", value, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidGreaterThan(String value) {
            addCriterion("list_uid >", value, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidGreaterThanOrEqualTo(String value) {
            addCriterion("list_uid >=", value, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidLessThan(String value) {
            addCriterion("list_uid <", value, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidLessThanOrEqualTo(String value) {
            addCriterion("list_uid <=", value, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidLike(String value) {
            addCriterion("list_uid like", value, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidNotLike(String value) {
            addCriterion("list_uid not like", value, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidIn(List<String> values) {
            addCriterion("list_uid in", values, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidNotIn(List<String> values) {
            addCriterion("list_uid not in", values, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidBetween(String value1, String value2) {
            addCriterion("list_uid between", value1, value2, "listUid");
            return (Criteria) this;
        }

        public Criteria andListUidNotBetween(String value1, String value2) {
            addCriterion("list_uid not between", value1, value2, "listUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidIsNull() {
            addCriterion("stufilesetting_uid is null");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidIsNotNull() {
            addCriterion("stufilesetting_uid is not null");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidEqualTo(String value) {
            addCriterion("stufilesetting_uid =", value, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidNotEqualTo(String value) {
            addCriterion("stufilesetting_uid <>", value, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidGreaterThan(String value) {
            addCriterion("stufilesetting_uid >", value, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidGreaterThanOrEqualTo(String value) {
            addCriterion("stufilesetting_uid >=", value, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidLessThan(String value) {
            addCriterion("stufilesetting_uid <", value, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidLessThanOrEqualTo(String value) {
            addCriterion("stufilesetting_uid <=", value, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidLike(String value) {
            addCriterion("stufilesetting_uid like", value, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidNotLike(String value) {
            addCriterion("stufilesetting_uid not like", value, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidIn(List<String> values) {
            addCriterion("stufilesetting_uid in", values, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidNotIn(List<String> values) {
            addCriterion("stufilesetting_uid not in", values, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidBetween(String value1, String value2) {
            addCriterion("stufilesetting_uid between", value1, value2, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufilesettingUidNotBetween(String value1, String value2) {
            addCriterion("stufilesetting_uid not between", value1, value2, "stufilesettingUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidIsNull() {
            addCriterion("stufile_uid is null");
            return (Criteria) this;
        }

        public Criteria andStufileUidIsNotNull() {
            addCriterion("stufile_uid is not null");
            return (Criteria) this;
        }

        public Criteria andStufileUidEqualTo(String value) {
            addCriterion("stufile_uid =", value, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidNotEqualTo(String value) {
            addCriterion("stufile_uid <>", value, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidGreaterThan(String value) {
            addCriterion("stufile_uid >", value, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidGreaterThanOrEqualTo(String value) {
            addCriterion("stufile_uid >=", value, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidLessThan(String value) {
            addCriterion("stufile_uid <", value, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidLessThanOrEqualTo(String value) {
            addCriterion("stufile_uid <=", value, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidLike(String value) {
            addCriterion("stufile_uid like", value, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidNotLike(String value) {
            addCriterion("stufile_uid not like", value, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidIn(List<String> values) {
            addCriterion("stufile_uid in", values, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidNotIn(List<String> values) {
            addCriterion("stufile_uid not in", values, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidBetween(String value1, String value2) {
            addCriterion("stufile_uid between", value1, value2, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufileUidNotBetween(String value1, String value2) {
            addCriterion("stufile_uid not between", value1, value2, "stufileUid");
            return (Criteria) this;
        }

        public Criteria andStufilePathIsNull() {
            addCriterion("stufile_path is null");
            return (Criteria) this;
        }

        public Criteria andStufilePathIsNotNull() {
            addCriterion("stufile_path is not null");
            return (Criteria) this;
        }

        public Criteria andStufilePathEqualTo(String value) {
            addCriterion("stufile_path =", value, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathNotEqualTo(String value) {
            addCriterion("stufile_path <>", value, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathGreaterThan(String value) {
            addCriterion("stufile_path >", value, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathGreaterThanOrEqualTo(String value) {
            addCriterion("stufile_path >=", value, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathLessThan(String value) {
            addCriterion("stufile_path <", value, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathLessThanOrEqualTo(String value) {
            addCriterion("stufile_path <=", value, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathLike(String value) {
            addCriterion("stufile_path like", value, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathNotLike(String value) {
            addCriterion("stufile_path not like", value, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathIn(List<String> values) {
            addCriterion("stufile_path in", values, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathNotIn(List<String> values) {
            addCriterion("stufile_path not in", values, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathBetween(String value1, String value2) {
            addCriterion("stufile_path between", value1, value2, "stufilePath");
            return (Criteria) this;
        }

        public Criteria andStufilePathNotBetween(String value1, String value2) {
            addCriterion("stufile_path not between", value1, value2, "stufilePath");
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