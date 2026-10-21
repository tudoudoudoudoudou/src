package com.gingkoo.rpt.dbsvr.server.bean;

import java.util.ArrayList;
import java.util.List;

public class OdsXlsTbBranchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsXlsTbBranchExample() {
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

    protected abstract static class GeneratedCriteria {
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

        public Criteria andDepartIdIsNull() {
            addCriterion("DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("DEPART_ID =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("DEPART_ID <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("DEPART_ID >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_ID >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("DEPART_ID <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("DEPART_ID <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("DEPART_ID like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("DEPART_ID not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("DEPART_ID in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("DEPART_ID not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("DEPART_ID between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("DEPART_ID not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdIsNull() {
            addCriterion("PDEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andPdepartIdIsNotNull() {
            addCriterion("PDEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPdepartIdEqualTo(String value) {
            addCriterion("PDEPART_ID =", value, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdNotEqualTo(String value) {
            addCriterion("PDEPART_ID <>", value, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdGreaterThan(String value) {
            addCriterion("PDEPART_ID >", value, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("PDEPART_ID >=", value, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdLessThan(String value) {
            addCriterion("PDEPART_ID <", value, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdLessThanOrEqualTo(String value) {
            addCriterion("PDEPART_ID <=", value, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdLike(String value) {
            addCriterion("PDEPART_ID like", value, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdNotLike(String value) {
            addCriterion("PDEPART_ID not like", value, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdIn(List<String> values) {
            addCriterion("PDEPART_ID in", values, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdNotIn(List<String> values) {
            addCriterion("PDEPART_ID not in", values, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdBetween(String value1, String value2) {
            addCriterion("PDEPART_ID between", value1, value2, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andPdepartIdNotBetween(String value1, String value2) {
            addCriterion("PDEPART_ID not between", value1, value2, "pdepartId");
            return (Criteria) this;
        }

        public Criteria andDepartCodeIsNull() {
            addCriterion("DEPART_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDepartCodeIsNotNull() {
            addCriterion("DEPART_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDepartCodeEqualTo(String value) {
            addCriterion("DEPART_CODE =", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotEqualTo(String value) {
            addCriterion("DEPART_CODE <>", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeGreaterThan(String value) {
            addCriterion("DEPART_CODE >", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_CODE >=", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeLessThan(String value) {
            addCriterion("DEPART_CODE <", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPART_CODE <=", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeLike(String value) {
            addCriterion("DEPART_CODE like", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotLike(String value) {
            addCriterion("DEPART_CODE not like", value, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeIn(List<String> values) {
            addCriterion("DEPART_CODE in", values, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotIn(List<String> values) {
            addCriterion("DEPART_CODE not in", values, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeBetween(String value1, String value2) {
            addCriterion("DEPART_CODE between", value1, value2, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartCodeNotBetween(String value1, String value2) {
            addCriterion("DEPART_CODE not between", value1, value2, "departCode");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNull() {
            addCriterion("DEPART_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDepartNameIsNotNull() {
            addCriterion("DEPART_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDepartNameEqualTo(String value) {
            addCriterion("DEPART_NAME =", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotEqualTo(String value) {
            addCriterion("DEPART_NAME <>", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThan(String value) {
            addCriterion("DEPART_NAME >", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_NAME >=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThan(String value) {
            addCriterion("DEPART_NAME <", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLessThanOrEqualTo(String value) {
            addCriterion("DEPART_NAME <=", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameLike(String value) {
            addCriterion("DEPART_NAME like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotLike(String value) {
            addCriterion("DEPART_NAME not like", value, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameIn(List<String> values) {
            addCriterion("DEPART_NAME in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotIn(List<String> values) {
            addCriterion("DEPART_NAME not in", values, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameBetween(String value1, String value2) {
            addCriterion("DEPART_NAME between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartNameNotBetween(String value1, String value2) {
            addCriterion("DEPART_NAME not between", value1, value2, "departName");
            return (Criteria) this;
        }

        public Criteria andDepartAddressIsNull() {
            addCriterion("DEPART_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andDepartAddressIsNotNull() {
            addCriterion("DEPART_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andDepartAddressEqualTo(String value) {
            addCriterion("DEPART_ADDRESS =", value, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressNotEqualTo(String value) {
            addCriterion("DEPART_ADDRESS <>", value, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressGreaterThan(String value) {
            addCriterion("DEPART_ADDRESS >", value, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_ADDRESS >=", value, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressLessThan(String value) {
            addCriterion("DEPART_ADDRESS <", value, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressLessThanOrEqualTo(String value) {
            addCriterion("DEPART_ADDRESS <=", value, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressLike(String value) {
            addCriterion("DEPART_ADDRESS like", value, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressNotLike(String value) {
            addCriterion("DEPART_ADDRESS not like", value, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressIn(List<String> values) {
            addCriterion("DEPART_ADDRESS in", values, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressNotIn(List<String> values) {
            addCriterion("DEPART_ADDRESS not in", values, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressBetween(String value1, String value2) {
            addCriterion("DEPART_ADDRESS between", value1, value2, "departAddress");
            return (Criteria) this;
        }

        public Criteria andDepartAddressNotBetween(String value1, String value2) {
            addCriterion("DEPART_ADDRESS not between", value1, value2, "departAddress");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("AREA_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("AREA_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("AREA_CODE =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("AREA_CODE <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("AREA_CODE >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_CODE >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("AREA_CODE <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("AREA_CODE <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("AREA_CODE like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("AREA_CODE not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("AREA_CODE in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("AREA_CODE not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("AREA_CODE between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("AREA_CODE not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("ZIP_CODE like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("ZIP_CODE not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNull() {
            addCriterion("PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(String value) {
            addCriterion("PHONE_NO =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(String value) {
            addCriterion("PHONE_NO <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(String value) {
            addCriterion("PHONE_NO >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NO >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(String value) {
            addCriterion("PHONE_NO <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NO <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLike(String value) {
            addCriterion("PHONE_NO like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotLike(String value) {
            addCriterion("PHONE_NO not like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<String> values) {
            addCriterion("PHONE_NO in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<String> values) {
            addCriterion("PHONE_NO not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(String value1, String value2) {
            addCriterion("PHONE_NO between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(String value1, String value2) {
            addCriterion("PHONE_NO not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andReportCodeIsNull() {
            addCriterion("REPORT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReportCodeIsNotNull() {
            addCriterion("REPORT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReportCodeEqualTo(String value) {
            addCriterion("REPORT_CODE =", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotEqualTo(String value) {
            addCriterion("REPORT_CODE <>", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeGreaterThan(String value) {
            addCriterion("REPORT_CODE >", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_CODE >=", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeLessThan(String value) {
            addCriterion("REPORT_CODE <", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeLessThanOrEqualTo(String value) {
            addCriterion("REPORT_CODE <=", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeLike(String value) {
            addCriterion("REPORT_CODE like", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotLike(String value) {
            addCriterion("REPORT_CODE not like", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeIn(List<String> values) {
            addCriterion("REPORT_CODE in", values, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotIn(List<String> values) {
            addCriterion("REPORT_CODE not in", values, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeBetween(String value1, String value2) {
            addCriterion("REPORT_CODE between", value1, value2, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotBetween(String value1, String value2) {
            addCriterion("REPORT_CODE not between", value1, value2, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNull() {
            addCriterion("REPORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNotNull() {
            addCriterion("REPORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReportNameEqualTo(String value) {
            addCriterion("REPORT_NAME =", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotEqualTo(String value) {
            addCriterion("REPORT_NAME <>", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThan(String value) {
            addCriterion("REPORT_NAME >", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_NAME >=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThan(String value) {
            addCriterion("REPORT_NAME <", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThanOrEqualTo(String value) {
            addCriterion("REPORT_NAME <=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLike(String value) {
            addCriterion("REPORT_NAME like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotLike(String value) {
            addCriterion("REPORT_NAME not like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameIn(List<String> values) {
            addCriterion("REPORT_NAME in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotIn(List<String> values) {
            addCriterion("REPORT_NAME not in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameBetween(String value1, String value2) {
            addCriterion("REPORT_NAME between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotBetween(String value1, String value2) {
            addCriterion("REPORT_NAME not between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andCalendarNoIsNull() {
            addCriterion("CALENDAR_NO is null");
            return (Criteria) this;
        }

        public Criteria andCalendarNoIsNotNull() {
            addCriterion("CALENDAR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarNoEqualTo(String value) {
            addCriterion("CALENDAR_NO =", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoNotEqualTo(String value) {
            addCriterion("CALENDAR_NO <>", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoGreaterThan(String value) {
            addCriterion("CALENDAR_NO >", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoGreaterThanOrEqualTo(String value) {
            addCriterion("CALENDAR_NO >=", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoLessThan(String value) {
            addCriterion("CALENDAR_NO <", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoLessThanOrEqualTo(String value) {
            addCriterion("CALENDAR_NO <=", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoLike(String value) {
            addCriterion("CALENDAR_NO like", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoNotLike(String value) {
            addCriterion("CALENDAR_NO not like", value, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoIn(List<String> values) {
            addCriterion("CALENDAR_NO in", values, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoNotIn(List<String> values) {
            addCriterion("CALENDAR_NO not in", values, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoBetween(String value1, String value2) {
            addCriterion("CALENDAR_NO between", value1, value2, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andCalendarNoNotBetween(String value1, String value2) {
            addCriterion("CALENDAR_NO not between", value1, value2, "calendarNo");
            return (Criteria) this;
        }

        public Criteria andInqIdIsNull() {
            addCriterion("INQ_ID is null");
            return (Criteria) this;
        }

        public Criteria andInqIdIsNotNull() {
            addCriterion("INQ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInqIdEqualTo(String value) {
            addCriterion("INQ_ID =", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotEqualTo(String value) {
            addCriterion("INQ_ID <>", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdGreaterThan(String value) {
            addCriterion("INQ_ID >", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdGreaterThanOrEqualTo(String value) {
            addCriterion("INQ_ID >=", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdLessThan(String value) {
            addCriterion("INQ_ID <", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdLessThanOrEqualTo(String value) {
            addCriterion("INQ_ID <=", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdLike(String value) {
            addCriterion("INQ_ID like", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotLike(String value) {
            addCriterion("INQ_ID not like", value, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdIn(List<String> values) {
            addCriterion("INQ_ID in", values, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotIn(List<String> values) {
            addCriterion("INQ_ID not in", values, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdBetween(String value1, String value2) {
            addCriterion("INQ_ID between", value1, value2, "inqId");
            return (Criteria) this;
        }

        public Criteria andInqIdNotBetween(String value1, String value2) {
            addCriterion("INQ_ID not between", value1, value2, "inqId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNull() {
            addCriterion("CORP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNotNull() {
            addCriterion("CORP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCorpIdEqualTo(String value) {
            addCriterion("CORP_ID =", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotEqualTo(String value) {
            addCriterion("CORP_ID <>", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThan(String value) {
            addCriterion("CORP_ID >", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_ID >=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThan(String value) {
            addCriterion("CORP_ID <", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThanOrEqualTo(String value) {
            addCriterion("CORP_ID <=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLike(String value) {
            addCriterion("CORP_ID like", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotLike(String value) {
            addCriterion("CORP_ID not like", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIn(List<String> values) {
            addCriterion("CORP_ID in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotIn(List<String> values) {
            addCriterion("CORP_ID not in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdBetween(String value1, String value2) {
            addCriterion("CORP_ID between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotBetween(String value1, String value2) {
            addCriterion("CORP_ID not between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andRsv1IsNull() {
            addCriterion("RSV1 is null");
            return (Criteria) this;
        }

        public Criteria andRsv1IsNotNull() {
            addCriterion("RSV1 is not null");
            return (Criteria) this;
        }

        public Criteria andRsv1EqualTo(String value) {
            addCriterion("RSV1 =", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1NotEqualTo(String value) {
            addCriterion("RSV1 <>", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1GreaterThan(String value) {
            addCriterion("RSV1 >", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1GreaterThanOrEqualTo(String value) {
            addCriterion("RSV1 >=", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1LessThan(String value) {
            addCriterion("RSV1 <", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1LessThanOrEqualTo(String value) {
            addCriterion("RSV1 <=", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1Like(String value) {
            addCriterion("RSV1 like", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1NotLike(String value) {
            addCriterion("RSV1 not like", value, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1In(List<String> values) {
            addCriterion("RSV1 in", values, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1NotIn(List<String> values) {
            addCriterion("RSV1 not in", values, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1Between(String value1, String value2) {
            addCriterion("RSV1 between", value1, value2, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv1NotBetween(String value1, String value2) {
            addCriterion("RSV1 not between", value1, value2, "rsv1");
            return (Criteria) this;
        }

        public Criteria andRsv2IsNull() {
            addCriterion("RSV2 is null");
            return (Criteria) this;
        }

        public Criteria andRsv2IsNotNull() {
            addCriterion("RSV2 is not null");
            return (Criteria) this;
        }

        public Criteria andRsv2EqualTo(String value) {
            addCriterion("RSV2 =", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2NotEqualTo(String value) {
            addCriterion("RSV2 <>", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2GreaterThan(String value) {
            addCriterion("RSV2 >", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2GreaterThanOrEqualTo(String value) {
            addCriterion("RSV2 >=", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2LessThan(String value) {
            addCriterion("RSV2 <", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2LessThanOrEqualTo(String value) {
            addCriterion("RSV2 <=", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2Like(String value) {
            addCriterion("RSV2 like", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2NotLike(String value) {
            addCriterion("RSV2 not like", value, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2In(List<String> values) {
            addCriterion("RSV2 in", values, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2NotIn(List<String> values) {
            addCriterion("RSV2 not in", values, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2Between(String value1, String value2) {
            addCriterion("RSV2 between", value1, value2, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv2NotBetween(String value1, String value2) {
            addCriterion("RSV2 not between", value1, value2, "rsv2");
            return (Criteria) this;
        }

        public Criteria andRsv3IsNull() {
            addCriterion("RSV3 is null");
            return (Criteria) this;
        }

        public Criteria andRsv3IsNotNull() {
            addCriterion("RSV3 is not null");
            return (Criteria) this;
        }

        public Criteria andRsv3EqualTo(String value) {
            addCriterion("RSV3 =", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3NotEqualTo(String value) {
            addCriterion("RSV3 <>", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3GreaterThan(String value) {
            addCriterion("RSV3 >", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3GreaterThanOrEqualTo(String value) {
            addCriterion("RSV3 >=", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3LessThan(String value) {
            addCriterion("RSV3 <", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3LessThanOrEqualTo(String value) {
            addCriterion("RSV3 <=", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3Like(String value) {
            addCriterion("RSV3 like", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3NotLike(String value) {
            addCriterion("RSV3 not like", value, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3In(List<String> values) {
            addCriterion("RSV3 in", values, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3NotIn(List<String> values) {
            addCriterion("RSV3 not in", values, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3Between(String value1, String value2) {
            addCriterion("RSV3 between", value1, value2, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv3NotBetween(String value1, String value2) {
            addCriterion("RSV3 not between", value1, value2, "rsv3");
            return (Criteria) this;
        }

        public Criteria andRsv4IsNull() {
            addCriterion("RSV4 is null");
            return (Criteria) this;
        }

        public Criteria andRsv4IsNotNull() {
            addCriterion("RSV4 is not null");
            return (Criteria) this;
        }

        public Criteria andRsv4EqualTo(String value) {
            addCriterion("RSV4 =", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4NotEqualTo(String value) {
            addCriterion("RSV4 <>", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4GreaterThan(String value) {
            addCriterion("RSV4 >", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4GreaterThanOrEqualTo(String value) {
            addCriterion("RSV4 >=", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4LessThan(String value) {
            addCriterion("RSV4 <", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4LessThanOrEqualTo(String value) {
            addCriterion("RSV4 <=", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4Like(String value) {
            addCriterion("RSV4 like", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4NotLike(String value) {
            addCriterion("RSV4 not like", value, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4In(List<String> values) {
            addCriterion("RSV4 in", values, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4NotIn(List<String> values) {
            addCriterion("RSV4 not in", values, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4Between(String value1, String value2) {
            addCriterion("RSV4 between", value1, value2, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv4NotBetween(String value1, String value2) {
            addCriterion("RSV4 not between", value1, value2, "rsv4");
            return (Criteria) this;
        }

        public Criteria andRsv5IsNull() {
            addCriterion("RSV5 is null");
            return (Criteria) this;
        }

        public Criteria andRsv5IsNotNull() {
            addCriterion("RSV5 is not null");
            return (Criteria) this;
        }

        public Criteria andRsv5EqualTo(String value) {
            addCriterion("RSV5 =", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5NotEqualTo(String value) {
            addCriterion("RSV5 <>", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5GreaterThan(String value) {
            addCriterion("RSV5 >", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5GreaterThanOrEqualTo(String value) {
            addCriterion("RSV5 >=", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5LessThan(String value) {
            addCriterion("RSV5 <", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5LessThanOrEqualTo(String value) {
            addCriterion("RSV5 <=", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5Like(String value) {
            addCriterion("RSV5 like", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5NotLike(String value) {
            addCriterion("RSV5 not like", value, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5In(List<String> values) {
            addCriterion("RSV5 in", values, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5NotIn(List<String> values) {
            addCriterion("RSV5 not in", values, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5Between(String value1, String value2) {
            addCriterion("RSV5 between", value1, value2, "rsv5");
            return (Criteria) this;
        }

        public Criteria andRsv5NotBetween(String value1, String value2) {
            addCriterion("RSV5 not between", value1, value2, "rsv5");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeIsNull() {
            addCriterion("CHECK_ERR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeIsNotNull() {
            addCriterion("CHECK_ERR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeEqualTo(String value) {
            addCriterion("CHECK_ERR_TYPE =", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeNotEqualTo(String value) {
            addCriterion("CHECK_ERR_TYPE <>", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeGreaterThan(String value) {
            addCriterion("CHECK_ERR_TYPE >", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_ERR_TYPE >=", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeLessThan(String value) {
            addCriterion("CHECK_ERR_TYPE <", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeLessThanOrEqualTo(String value) {
            addCriterion("CHECK_ERR_TYPE <=", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeLike(String value) {
            addCriterion("CHECK_ERR_TYPE like", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeNotLike(String value) {
            addCriterion("CHECK_ERR_TYPE not like", value, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeIn(List<String> values) {
            addCriterion("CHECK_ERR_TYPE in", values, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeNotIn(List<String> values) {
            addCriterion("CHECK_ERR_TYPE not in", values, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeBetween(String value1, String value2) {
            addCriterion("CHECK_ERR_TYPE between", value1, value2, "checkErrType");
            return (Criteria) this;
        }

        public Criteria andCheckErrTypeNotBetween(String value1, String value2) {
            addCriterion("CHECK_ERR_TYPE not between", value1, value2, "checkErrType");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
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