package com.thinkjoy.swms.dao.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SwmsInsuranceSettingExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public SwmsInsuranceSettingExample() {
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

        public Criteria andInssettingUidIsNull() {
            addCriterion("inssetting_uid is null");
            return (Criteria) this;
        }

        public Criteria andInssettingUidIsNotNull() {
            addCriterion("inssetting_uid is not null");
            return (Criteria) this;
        }

        public Criteria andInssettingUidEqualTo(String value) {
            addCriterion("inssetting_uid =", value, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidNotEqualTo(String value) {
            addCriterion("inssetting_uid <>", value, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidGreaterThan(String value) {
            addCriterion("inssetting_uid >", value, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidGreaterThanOrEqualTo(String value) {
            addCriterion("inssetting_uid >=", value, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidLessThan(String value) {
            addCriterion("inssetting_uid <", value, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidLessThanOrEqualTo(String value) {
            addCriterion("inssetting_uid <=", value, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidLike(String value) {
            addCriterion("inssetting_uid like", value, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidNotLike(String value) {
            addCriterion("inssetting_uid not like", value, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidIn(List<String> values) {
            addCriterion("inssetting_uid in", values, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidNotIn(List<String> values) {
            addCriterion("inssetting_uid not in", values, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidBetween(String value1, String value2) {
            addCriterion("inssetting_uid between", value1, value2, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInssettingUidNotBetween(String value1, String value2) {
            addCriterion("inssetting_uid not between", value1, value2, "inssettingUid");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNull() {
            addCriterion("insurance_name is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIsNotNull() {
            addCriterion("insurance_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameEqualTo(String value) {
            addCriterion("insurance_name =", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotEqualTo(String value) {
            addCriterion("insurance_name <>", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThan(String value) {
            addCriterion("insurance_name >", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_name >=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThan(String value) {
            addCriterion("insurance_name <", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLessThanOrEqualTo(String value) {
            addCriterion("insurance_name <=", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameLike(String value) {
            addCriterion("insurance_name like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotLike(String value) {
            addCriterion("insurance_name not like", value, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameIn(List<String> values) {
            addCriterion("insurance_name in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotIn(List<String> values) {
            addCriterion("insurance_name not in", values, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameBetween(String value1, String value2) {
            addCriterion("insurance_name between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceNameNotBetween(String value1, String value2) {
            addCriterion("insurance_name not between", value1, value2, "insuranceName");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIsNull() {
            addCriterion("insurance_company is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIsNotNull() {
            addCriterion("insurance_company is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyEqualTo(String value) {
            addCriterion("insurance_company =", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNotEqualTo(String value) {
            addCriterion("insurance_company <>", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyGreaterThan(String value) {
            addCriterion("insurance_company >", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_company >=", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyLessThan(String value) {
            addCriterion("insurance_company <", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyLessThanOrEqualTo(String value) {
            addCriterion("insurance_company <=", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyLike(String value) {
            addCriterion("insurance_company like", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNotLike(String value) {
            addCriterion("insurance_company not like", value, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyIn(List<String> values) {
            addCriterion("insurance_company in", values, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNotIn(List<String> values) {
            addCriterion("insurance_company not in", values, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyBetween(String value1, String value2) {
            addCriterion("insurance_company between", value1, value2, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCompanyNotBetween(String value1, String value2) {
            addCriterion("insurance_company not between", value1, value2, "insuranceCompany");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryIsNull() {
            addCriterion("insurance_category is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryIsNotNull() {
            addCriterion("insurance_category is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryEqualTo(String value) {
            addCriterion("insurance_category =", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotEqualTo(String value) {
            addCriterion("insurance_category <>", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryGreaterThan(String value) {
            addCriterion("insurance_category >", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_category >=", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryLessThan(String value) {
            addCriterion("insurance_category <", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryLessThanOrEqualTo(String value) {
            addCriterion("insurance_category <=", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryLike(String value) {
            addCriterion("insurance_category like", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotLike(String value) {
            addCriterion("insurance_category not like", value, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryIn(List<String> values) {
            addCriterion("insurance_category in", values, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotIn(List<String> values) {
            addCriterion("insurance_category not in", values, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryBetween(String value1, String value2) {
            addCriterion("insurance_category between", value1, value2, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceCategoryNotBetween(String value1, String value2) {
            addCriterion("insurance_category not between", value1, value2, "insuranceCategory");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitIsNull() {
            addCriterion("insurance_limit is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitIsNotNull() {
            addCriterion("insurance_limit is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitEqualTo(Double value) {
            addCriterion("insurance_limit =", value, "insuranceLimit");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitNotEqualTo(Double value) {
            addCriterion("insurance_limit <>", value, "insuranceLimit");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitGreaterThan(Double value) {
            addCriterion("insurance_limit >", value, "insuranceLimit");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitGreaterThanOrEqualTo(Double value) {
            addCriterion("insurance_limit >=", value, "insuranceLimit");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitLessThan(Double value) {
            addCriterion("insurance_limit <", value, "insuranceLimit");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitLessThanOrEqualTo(Double value) {
            addCriterion("insurance_limit <=", value, "insuranceLimit");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitIn(List<Double> values) {
            addCriterion("insurance_limit in", values, "insuranceLimit");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitNotIn(List<Double> values) {
            addCriterion("insurance_limit not in", values, "insuranceLimit");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitBetween(Double value1, Double value2) {
            addCriterion("insurance_limit between", value1, value2, "insuranceLimit");
            return (Criteria) this;
        }

        public Criteria andInsuranceLimitNotBetween(Double value1, Double value2) {
            addCriterion("insurance_limit not between", value1, value2, "insuranceLimit");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNull() {
            addCriterion("insurance_cost is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNotNull() {
            addCriterion("insurance_cost is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostEqualTo(Integer value) {
            addCriterion("insurance_cost =", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotEqualTo(Integer value) {
            addCriterion("insurance_cost <>", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThan(Integer value) {
            addCriterion("insurance_cost >", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThanOrEqualTo(Integer value) {
            addCriterion("insurance_cost >=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThan(Integer value) {
            addCriterion("insurance_cost <", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThanOrEqualTo(Integer value) {
            addCriterion("insurance_cost <=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIn(List<Integer> values) {
            addCriterion("insurance_cost in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotIn(List<Integer> values) {
            addCriterion("insurance_cost not in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostBetween(Integer value1, Integer value2) {
            addCriterion("insurance_cost between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotBetween(Integer value1, Integer value2) {
            addCriterion("insurance_cost not between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsIsNull() {
            addCriterion("detailed_terms is null");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsIsNotNull() {
            addCriterion("detailed_terms is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsEqualTo(String value) {
            addCriterion("detailed_terms =", value, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsNotEqualTo(String value) {
            addCriterion("detailed_terms <>", value, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsGreaterThan(String value) {
            addCriterion("detailed_terms >", value, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsGreaterThanOrEqualTo(String value) {
            addCriterion("detailed_terms >=", value, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsLessThan(String value) {
            addCriterion("detailed_terms <", value, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsLessThanOrEqualTo(String value) {
            addCriterion("detailed_terms <=", value, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsLike(String value) {
            addCriterion("detailed_terms like", value, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsNotLike(String value) {
            addCriterion("detailed_terms not like", value, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsIn(List<String> values) {
            addCriterion("detailed_terms in", values, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsNotIn(List<String> values) {
            addCriterion("detailed_terms not in", values, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsBetween(String value1, String value2) {
            addCriterion("detailed_terms between", value1, value2, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andDetailedTermsNotBetween(String value1, String value2) {
            addCriterion("detailed_terms not between", value1, value2, "detailedTerms");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityIsNull() {
            addCriterion("insurance_liability is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityIsNotNull() {
            addCriterion("insurance_liability is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityEqualTo(String value) {
            addCriterion("insurance_liability =", value, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityNotEqualTo(String value) {
            addCriterion("insurance_liability <>", value, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityGreaterThan(String value) {
            addCriterion("insurance_liability >", value, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_liability >=", value, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityLessThan(String value) {
            addCriterion("insurance_liability <", value, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityLessThanOrEqualTo(String value) {
            addCriterion("insurance_liability <=", value, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityLike(String value) {
            addCriterion("insurance_liability like", value, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityNotLike(String value) {
            addCriterion("insurance_liability not like", value, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityIn(List<String> values) {
            addCriterion("insurance_liability in", values, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityNotIn(List<String> values) {
            addCriterion("insurance_liability not in", values, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityBetween(String value1, String value2) {
            addCriterion("insurance_liability between", value1, value2, "insuranceLiability");
            return (Criteria) this;
        }

        public Criteria andInsuranceLiabilityNotBetween(String value1, String value2) {
            addCriterion("insurance_liability not between", value1, value2, "insuranceLiability");
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

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(String value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(String value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(String value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(String value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(String value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(String value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLike(String value) {
            addCriterion("is_pay like", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotLike(String value) {
            addCriterion("is_pay not like", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<String> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<String> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(String value1, String value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(String value1, String value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
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