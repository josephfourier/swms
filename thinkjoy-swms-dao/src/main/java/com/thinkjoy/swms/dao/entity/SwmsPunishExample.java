package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SwmsPunishExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SwmsPunishExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPunishUidIsNull() {
            addCriterion("punish_uid is null");
            return (Criteria) this;
        }

        public Criteria andPunishUidIsNotNull() {
            addCriterion("punish_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPunishUidEqualTo(String value) {
            addCriterion("punish_uid =", value, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidNotEqualTo(String value) {
            addCriterion("punish_uid <>", value, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidGreaterThan(String value) {
            addCriterion("punish_uid >", value, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidGreaterThanOrEqualTo(String value) {
            addCriterion("punish_uid >=", value, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidLessThan(String value) {
            addCriterion("punish_uid <", value, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidLessThanOrEqualTo(String value) {
            addCriterion("punish_uid <=", value, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidLike(String value) {
            addCriterion("punish_uid like", value, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidNotLike(String value) {
            addCriterion("punish_uid not like", value, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidIn(List<String> values) {
            addCriterion("punish_uid in", values, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidNotIn(List<String> values) {
            addCriterion("punish_uid not in", values, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidBetween(String value1, String value2) {
            addCriterion("punish_uid between", value1, value2, "punishUid");
            return (Criteria) this;
        }

        public Criteria andPunishUidNotBetween(String value1, String value2) {
            addCriterion("punish_uid not between", value1, value2, "punishUid");
            return (Criteria) this;
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

        public Criteria andStudentIdIsNull() {
            addCriterion("student_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentIdIsNotNull() {
            addCriterion("student_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentIdEqualTo(Integer value) {
            addCriterion("student_id =", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotEqualTo(Integer value) {
            addCriterion("student_id <>", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThan(Integer value) {
            addCriterion("student_id >", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_id >=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThan(Integer value) {
            addCriterion("student_id <", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdLessThanOrEqualTo(Integer value) {
            addCriterion("student_id <=", value, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdIn(List<Integer> values) {
            addCriterion("student_id in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotIn(List<Integer> values) {
            addCriterion("student_id not in", values, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdBetween(Integer value1, Integer value2) {
            addCriterion("student_id between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andStudentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("student_id not between", value1, value2, "studentId");
            return (Criteria) this;
        }

        public Criteria andPunishDateIsNull() {
            addCriterion("punish_date is null");
            return (Criteria) this;
        }

        public Criteria andPunishDateIsNotNull() {
            addCriterion("punish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPunishDateEqualTo(Date value) {
            addCriterionForJDBCDate("punish_date =", value, "punishDate");
            return (Criteria) this;
        }

        public Criteria andPunishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("punish_date <>", value, "punishDate");
            return (Criteria) this;
        }

        public Criteria andPunishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("punish_date >", value, "punishDate");
            return (Criteria) this;
        }

        public Criteria andPunishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("punish_date >=", value, "punishDate");
            return (Criteria) this;
        }

        public Criteria andPunishDateLessThan(Date value) {
            addCriterionForJDBCDate("punish_date <", value, "punishDate");
            return (Criteria) this;
        }

        public Criteria andPunishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("punish_date <=", value, "punishDate");
            return (Criteria) this;
        }

        public Criteria andPunishDateIn(List<Date> values) {
            addCriterionForJDBCDate("punish_date in", values, "punishDate");
            return (Criteria) this;
        }

        public Criteria andPunishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("punish_date not in", values, "punishDate");
            return (Criteria) this;
        }

        public Criteria andPunishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("punish_date between", value1, value2, "punishDate");
            return (Criteria) this;
        }

        public Criteria andPunishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("punish_date not between", value1, value2, "punishDate");
            return (Criteria) this;
        }

        public Criteria andPunishYearIsNull() {
            addCriterion("punish_year is null");
            return (Criteria) this;
        }

        public Criteria andPunishYearIsNotNull() {
            addCriterion("punish_year is not null");
            return (Criteria) this;
        }

        public Criteria andPunishYearEqualTo(Integer value) {
            addCriterion("punish_year =", value, "punishYear");
            return (Criteria) this;
        }

        public Criteria andPunishYearNotEqualTo(Integer value) {
            addCriterion("punish_year <>", value, "punishYear");
            return (Criteria) this;
        }

        public Criteria andPunishYearGreaterThan(Integer value) {
            addCriterion("punish_year >", value, "punishYear");
            return (Criteria) this;
        }

        public Criteria andPunishYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("punish_year >=", value, "punishYear");
            return (Criteria) this;
        }

        public Criteria andPunishYearLessThan(Integer value) {
            addCriterion("punish_year <", value, "punishYear");
            return (Criteria) this;
        }

        public Criteria andPunishYearLessThanOrEqualTo(Integer value) {
            addCriterion("punish_year <=", value, "punishYear");
            return (Criteria) this;
        }

        public Criteria andPunishYearIn(List<Integer> values) {
            addCriterion("punish_year in", values, "punishYear");
            return (Criteria) this;
        }

        public Criteria andPunishYearNotIn(List<Integer> values) {
            addCriterion("punish_year not in", values, "punishYear");
            return (Criteria) this;
        }

        public Criteria andPunishYearBetween(Integer value1, Integer value2) {
            addCriterion("punish_year between", value1, value2, "punishYear");
            return (Criteria) this;
        }

        public Criteria andPunishYearNotBetween(Integer value1, Integer value2) {
            addCriterion("punish_year not between", value1, value2, "punishYear");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionIsNull() {
            addCriterion("punish_description is null");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionIsNotNull() {
            addCriterion("punish_description is not null");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionEqualTo(String value) {
            addCriterion("punish_description =", value, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionNotEqualTo(String value) {
            addCriterion("punish_description <>", value, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionGreaterThan(String value) {
            addCriterion("punish_description >", value, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("punish_description >=", value, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionLessThan(String value) {
            addCriterion("punish_description <", value, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionLessThanOrEqualTo(String value) {
            addCriterion("punish_description <=", value, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionLike(String value) {
            addCriterion("punish_description like", value, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionNotLike(String value) {
            addCriterion("punish_description not like", value, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionIn(List<String> values) {
            addCriterion("punish_description in", values, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionNotIn(List<String> values) {
            addCriterion("punish_description not in", values, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionBetween(String value1, String value2) {
            addCriterion("punish_description between", value1, value2, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andPunishDescriptionNotBetween(String value1, String value2) {
            addCriterion("punish_description not between", value1, value2, "punishDescription");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNull() {
            addCriterion("cancel_date is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("cancel_date is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterionForJDBCDate("cancel_date =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("cancel_date <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterionForJDBCDate("cancel_date >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cancel_date >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterionForJDBCDate("cancel_date <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cancel_date <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterionForJDBCDate("cancel_date in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("cancel_date not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cancel_date between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cancel_date not between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andPunishStatusIsNull() {
            addCriterion("punish_status is null");
            return (Criteria) this;
        }

        public Criteria andPunishStatusIsNotNull() {
            addCriterion("punish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPunishStatusEqualTo(String value) {
            addCriterion("punish_status =", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusNotEqualTo(String value) {
            addCriterion("punish_status <>", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusGreaterThan(String value) {
            addCriterion("punish_status >", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusGreaterThanOrEqualTo(String value) {
            addCriterion("punish_status >=", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusLessThan(String value) {
            addCriterion("punish_status <", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusLessThanOrEqualTo(String value) {
            addCriterion("punish_status <=", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusLike(String value) {
            addCriterion("punish_status like", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusNotLike(String value) {
            addCriterion("punish_status not like", value, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusIn(List<String> values) {
            addCriterion("punish_status in", values, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusNotIn(List<String> values) {
            addCriterion("punish_status not in", values, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusBetween(String value1, String value2) {
            addCriterion("punish_status between", value1, value2, "punishStatus");
            return (Criteria) this;
        }

        public Criteria andPunishStatusNotBetween(String value1, String value2) {
            addCriterion("punish_status not between", value1, value2, "punishStatus");
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