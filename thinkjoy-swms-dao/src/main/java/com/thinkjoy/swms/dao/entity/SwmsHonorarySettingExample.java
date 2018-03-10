package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SwmsHonorarySettingExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SwmsHonorarySettingExample() {
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

        public Criteria andHonorarysettingUidIsNull() {
            addCriterion("honorarysetting_uid is null");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidIsNotNull() {
            addCriterion("honorarysetting_uid is not null");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidEqualTo(String value) {
            addCriterion("honorarysetting_uid =", value, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidNotEqualTo(String value) {
            addCriterion("honorarysetting_uid <>", value, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidGreaterThan(String value) {
            addCriterion("honorarysetting_uid >", value, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidGreaterThanOrEqualTo(String value) {
            addCriterion("honorarysetting_uid >=", value, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidLessThan(String value) {
            addCriterion("honorarysetting_uid <", value, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidLessThanOrEqualTo(String value) {
            addCriterion("honorarysetting_uid <=", value, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidLike(String value) {
            addCriterion("honorarysetting_uid like", value, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidNotLike(String value) {
            addCriterion("honorarysetting_uid not like", value, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidIn(List<String> values) {
            addCriterion("honorarysetting_uid in", values, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidNotIn(List<String> values) {
            addCriterion("honorarysetting_uid not in", values, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidBetween(String value1, String value2) {
            addCriterion("honorarysetting_uid between", value1, value2, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonorarysettingUidNotBetween(String value1, String value2) {
            addCriterion("honorarysetting_uid not between", value1, value2, "honorarysettingUid");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameIsNull() {
            addCriterion("honorary_name is null");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameIsNotNull() {
            addCriterion("honorary_name is not null");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameEqualTo(String value) {
            addCriterion("honorary_name =", value, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameNotEqualTo(String value) {
            addCriterion("honorary_name <>", value, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameGreaterThan(String value) {
            addCriterion("honorary_name >", value, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameGreaterThanOrEqualTo(String value) {
            addCriterion("honorary_name >=", value, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameLessThan(String value) {
            addCriterion("honorary_name <", value, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameLessThanOrEqualTo(String value) {
            addCriterion("honorary_name <=", value, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameLike(String value) {
            addCriterion("honorary_name like", value, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameNotLike(String value) {
            addCriterion("honorary_name not like", value, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameIn(List<String> values) {
            addCriterion("honorary_name in", values, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameNotIn(List<String> values) {
            addCriterion("honorary_name not in", values, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameBetween(String value1, String value2) {
            addCriterion("honorary_name between", value1, value2, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryNameNotBetween(String value1, String value2) {
            addCriterion("honorary_name not between", value1, value2, "honoraryName");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryIsNull() {
            addCriterion("honorary_category is null");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryIsNotNull() {
            addCriterion("honorary_category is not null");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryEqualTo(String value) {
            addCriterion("honorary_category =", value, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryNotEqualTo(String value) {
            addCriterion("honorary_category <>", value, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryGreaterThan(String value) {
            addCriterion("honorary_category >", value, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("honorary_category >=", value, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryLessThan(String value) {
            addCriterion("honorary_category <", value, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryLessThanOrEqualTo(String value) {
            addCriterion("honorary_category <=", value, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryLike(String value) {
            addCriterion("honorary_category like", value, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryNotLike(String value) {
            addCriterion("honorary_category not like", value, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryIn(List<String> values) {
            addCriterion("honorary_category in", values, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryNotIn(List<String> values) {
            addCriterion("honorary_category not in", values, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryBetween(String value1, String value2) {
            addCriterion("honorary_category between", value1, value2, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryCategoryNotBetween(String value1, String value2) {
            addCriterion("honorary_category not between", value1, value2, "honoraryCategory");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionIsNull() {
            addCriterion("honorary_introduction is null");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionIsNotNull() {
            addCriterion("honorary_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionEqualTo(String value) {
            addCriterion("honorary_introduction =", value, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionNotEqualTo(String value) {
            addCriterion("honorary_introduction <>", value, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionGreaterThan(String value) {
            addCriterion("honorary_introduction >", value, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("honorary_introduction >=", value, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionLessThan(String value) {
            addCriterion("honorary_introduction <", value, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionLessThanOrEqualTo(String value) {
            addCriterion("honorary_introduction <=", value, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionLike(String value) {
            addCriterion("honorary_introduction like", value, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionNotLike(String value) {
            addCriterion("honorary_introduction not like", value, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionIn(List<String> values) {
            addCriterion("honorary_introduction in", values, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionNotIn(List<String> values) {
            addCriterion("honorary_introduction not in", values, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionBetween(String value1, String value2) {
            addCriterion("honorary_introduction between", value1, value2, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andHonoraryIntroductionNotBetween(String value1, String value2) {
            addCriterion("honorary_introduction not between", value1, value2, "honoraryIntroduction");
            return (Criteria) this;
        }

        public Criteria andNumberLimitIsNull() {
            addCriterion("number_limit is null");
            return (Criteria) this;
        }

        public Criteria andNumberLimitIsNotNull() {
            addCriterion("number_limit is not null");
            return (Criteria) this;
        }

        public Criteria andNumberLimitEqualTo(Integer value) {
            addCriterion("number_limit =", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitNotEqualTo(Integer value) {
            addCriterion("number_limit <>", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitGreaterThan(Integer value) {
            addCriterion("number_limit >", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("number_limit >=", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitLessThan(Integer value) {
            addCriterion("number_limit <", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitLessThanOrEqualTo(Integer value) {
            addCriterion("number_limit <=", value, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitIn(List<Integer> values) {
            addCriterion("number_limit in", values, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitNotIn(List<Integer> values) {
            addCriterion("number_limit not in", values, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitBetween(Integer value1, Integer value2) {
            addCriterion("number_limit between", value1, value2, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andNumberLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("number_limit not between", value1, value2, "numberLimit");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_date not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(String value) {
            addCriterion("is_open =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(String value) {
            addCriterion("is_open <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(String value) {
            addCriterion("is_open >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(String value) {
            addCriterion("is_open >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(String value) {
            addCriterion("is_open <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(String value) {
            addCriterion("is_open <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLike(String value) {
            addCriterion("is_open like", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotLike(String value) {
            addCriterion("is_open not like", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<String> values) {
            addCriterion("is_open in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<String> values) {
            addCriterion("is_open not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(String value1, String value2) {
            addCriterion("is_open between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(String value1, String value2) {
            addCriterion("is_open not between", value1, value2, "isOpen");
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