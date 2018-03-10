package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SwmsStufileExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SwmsStufileExample() {
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

        public Criteria andStufileNoIsNull() {
            addCriterion("stufile_no is null");
            return (Criteria) this;
        }

        public Criteria andStufileNoIsNotNull() {
            addCriterion("stufile_no is not null");
            return (Criteria) this;
        }

        public Criteria andStufileNoEqualTo(String value) {
            addCriterion("stufile_no =", value, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoNotEqualTo(String value) {
            addCriterion("stufile_no <>", value, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoGreaterThan(String value) {
            addCriterion("stufile_no >", value, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoGreaterThanOrEqualTo(String value) {
            addCriterion("stufile_no >=", value, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoLessThan(String value) {
            addCriterion("stufile_no <", value, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoLessThanOrEqualTo(String value) {
            addCriterion("stufile_no <=", value, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoLike(String value) {
            addCriterion("stufile_no like", value, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoNotLike(String value) {
            addCriterion("stufile_no not like", value, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoIn(List<String> values) {
            addCriterion("stufile_no in", values, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoNotIn(List<String> values) {
            addCriterion("stufile_no not in", values, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoBetween(String value1, String value2) {
            addCriterion("stufile_no between", value1, value2, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andStufileNoNotBetween(String value1, String value2) {
            addCriterion("stufile_no not between", value1, value2, "stufileNo");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNull() {
            addCriterion("recipient is null");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNotNull() {
            addCriterion("recipient is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientEqualTo(String value) {
            addCriterion("recipient =", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotEqualTo(String value) {
            addCriterion("recipient <>", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThan(String value) {
            addCriterion("recipient >", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThanOrEqualTo(String value) {
            addCriterion("recipient >=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThan(String value) {
            addCriterion("recipient <", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThanOrEqualTo(String value) {
            addCriterion("recipient <=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLike(String value) {
            addCriterion("recipient like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotLike(String value) {
            addCriterion("recipient not like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientIn(List<String> values) {
            addCriterion("recipient in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotIn(List<String> values) {
            addCriterion("recipient not in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientBetween(String value1, String value2) {
            addCriterion("recipient between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotBetween(String value1, String value2) {
            addCriterion("recipient not between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andStufileDateIsNull() {
            addCriterion("stufile_date is null");
            return (Criteria) this;
        }

        public Criteria andStufileDateIsNotNull() {
            addCriterion("stufile_date is not null");
            return (Criteria) this;
        }

        public Criteria andStufileDateEqualTo(Date value) {
            addCriterionForJDBCDate("stufile_date =", value, "stufileDate");
            return (Criteria) this;
        }

        public Criteria andStufileDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("stufile_date <>", value, "stufileDate");
            return (Criteria) this;
        }

        public Criteria andStufileDateGreaterThan(Date value) {
            addCriterionForJDBCDate("stufile_date >", value, "stufileDate");
            return (Criteria) this;
        }

        public Criteria andStufileDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stufile_date >=", value, "stufileDate");
            return (Criteria) this;
        }

        public Criteria andStufileDateLessThan(Date value) {
            addCriterionForJDBCDate("stufile_date <", value, "stufileDate");
            return (Criteria) this;
        }

        public Criteria andStufileDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("stufile_date <=", value, "stufileDate");
            return (Criteria) this;
        }

        public Criteria andStufileDateIn(List<Date> values) {
            addCriterionForJDBCDate("stufile_date in", values, "stufileDate");
            return (Criteria) this;
        }

        public Criteria andStufileDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("stufile_date not in", values, "stufileDate");
            return (Criteria) this;
        }

        public Criteria andStufileDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stufile_date between", value1, value2, "stufileDate");
            return (Criteria) this;
        }

        public Criteria andStufileDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("stufile_date not between", value1, value2, "stufileDate");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionIsNull() {
            addCriterion("stufile_description is null");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionIsNotNull() {
            addCriterion("stufile_description is not null");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionEqualTo(String value) {
            addCriterion("stufile_description =", value, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionNotEqualTo(String value) {
            addCriterion("stufile_description <>", value, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionGreaterThan(String value) {
            addCriterion("stufile_description >", value, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("stufile_description >=", value, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionLessThan(String value) {
            addCriterion("stufile_description <", value, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionLessThanOrEqualTo(String value) {
            addCriterion("stufile_description <=", value, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionLike(String value) {
            addCriterion("stufile_description like", value, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionNotLike(String value) {
            addCriterion("stufile_description not like", value, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionIn(List<String> values) {
            addCriterion("stufile_description in", values, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionNotIn(List<String> values) {
            addCriterion("stufile_description not in", values, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionBetween(String value1, String value2) {
            addCriterion("stufile_description between", value1, value2, "stufileDescription");
            return (Criteria) this;
        }

        public Criteria andStufileDescriptionNotBetween(String value1, String value2) {
            addCriterion("stufile_description not between", value1, value2, "stufileDescription");
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