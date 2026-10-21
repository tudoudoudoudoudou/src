package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andDescnIsNull() {
            addCriterion("DESCN is null");
            return (Criteria) this;
        }

        public Criteria andDescnIsNotNull() {
            addCriterion("DESCN is not null");
            return (Criteria) this;
        }

        public Criteria andDescnEqualTo(String value) {
            addCriterion("DESCN =", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotEqualTo(String value) {
            addCriterion("DESCN <>", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnGreaterThan(String value) {
            addCriterion("DESCN >", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnGreaterThanOrEqualTo(String value) {
            addCriterion("DESCN >=", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnLessThan(String value) {
            addCriterion("DESCN <", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnLessThanOrEqualTo(String value) {
            addCriterion("DESCN <=", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnLike(String value) {
            addCriterion("DESCN like", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotLike(String value) {
            addCriterion("DESCN not like", value, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnIn(List<String> values) {
            addCriterion("DESCN in", values, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotIn(List<String> values) {
            addCriterion("DESCN not in", values, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnBetween(String value1, String value2) {
            addCriterion("DESCN between", value1, value2, "descn");
            return (Criteria) this;
        }

        public Criteria andDescnNotBetween(String value1, String value2) {
            addCriterion("DESCN not between", value1, value2, "descn");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountIsNull() {
            addCriterion("FAILURE_LOGIN_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountIsNotNull() {
            addCriterion("FAILURE_LOGIN_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountEqualTo(BigDecimal value) {
            addCriterion("FAILURE_LOGIN_COUNT =", value, "failureLoginCount");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountNotEqualTo(BigDecimal value) {
            addCriterion("FAILURE_LOGIN_COUNT <>", value, "failureLoginCount");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountGreaterThan(BigDecimal value) {
            addCriterion("FAILURE_LOGIN_COUNT >", value, "failureLoginCount");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAILURE_LOGIN_COUNT >=", value, "failureLoginCount");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountLessThan(BigDecimal value) {
            addCriterion("FAILURE_LOGIN_COUNT <", value, "failureLoginCount");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAILURE_LOGIN_COUNT <=", value, "failureLoginCount");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountIn(List<BigDecimal> values) {
            addCriterion("FAILURE_LOGIN_COUNT in", values, "failureLoginCount");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountNotIn(List<BigDecimal> values) {
            addCriterion("FAILURE_LOGIN_COUNT not in", values, "failureLoginCount");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAILURE_LOGIN_COUNT between", value1, value2, "failureLoginCount");
            return (Criteria) this;
        }

        public Criteria andFailureLoginCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAILURE_LOGIN_COUNT not between", value1, value2, "failureLoginCount");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayIsNull() {
            addCriterion("LAST_LOGIN_DAY is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayIsNotNull() {
            addCriterion("LAST_LOGIN_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayEqualTo(String value) {
            addCriterion("LAST_LOGIN_DAY =", value, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayNotEqualTo(String value) {
            addCriterion("LAST_LOGIN_DAY <>", value, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayGreaterThan(String value) {
            addCriterion("LAST_LOGIN_DAY >", value, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_DAY >=", value, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayLessThan(String value) {
            addCriterion("LAST_LOGIN_DAY <", value, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayLessThanOrEqualTo(String value) {
            addCriterion("LAST_LOGIN_DAY <=", value, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayLike(String value) {
            addCriterion("LAST_LOGIN_DAY like", value, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayNotLike(String value) {
            addCriterion("LAST_LOGIN_DAY not like", value, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayIn(List<String> values) {
            addCriterion("LAST_LOGIN_DAY in", values, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayNotIn(List<String> values) {
            addCriterion("LAST_LOGIN_DAY not in", values, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_DAY between", value1, value2, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastLoginDayNotBetween(String value1, String value2) {
            addCriterion("LAST_LOGIN_DAY not between", value1, value2, "lastLoginDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayIsNull() {
            addCriterion("LAST_PASSWORD_CHANGE_DAY is null");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayIsNotNull() {
            addCriterion("LAST_PASSWORD_CHANGE_DAY is not null");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayEqualTo(String value) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY =", value, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayNotEqualTo(String value) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY <>", value, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayGreaterThan(String value) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY >", value, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY >=", value, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayLessThan(String value) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY <", value, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayLessThanOrEqualTo(String value) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY <=", value, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayLike(String value) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY like", value, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayNotLike(String value) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY not like", value, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayIn(List<String> values) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY in", values, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayNotIn(List<String> values) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY not in", values, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayBetween(String value1, String value2) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY between", value1, value2, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andLastPasswordChangeDayNotBetween(String value1, String value2) {
            addCriterion("LAST_PASSWORD_CHANGE_DAY not between", value1, value2, "lastPasswordChangeDay");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("STAFF_ID is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("STAFF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("STAFF_ID =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("STAFF_ID <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("STAFF_ID >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_ID >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("STAFF_ID <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("STAFF_ID <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("STAFF_ID like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("STAFF_ID not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("STAFF_ID in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("STAFF_ID not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("STAFF_ID between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("STAFF_ID not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("STAFF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("STAFF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("STAFF_NAME =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("STAFF_NAME <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("STAFF_NAME >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("STAFF_NAME >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("STAFF_NAME <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("STAFF_NAME <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("STAFF_NAME like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("STAFF_NAME not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("STAFF_NAME in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("STAFF_NAME not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("STAFF_NAME between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("STAFF_NAME not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("GENDER is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("GENDER =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("GENDER <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("GENDER >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("GENDER >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("GENDER <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("GENDER <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("GENDER like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("GENDER not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("GENDER in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("GENDER not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("GENDER between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("GENDER not between", value1, value2, "gender");
            return (Criteria) this;
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

        public Criteria andOnlineStatusIsNull() {
            addCriterion("ONLINE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIsNotNull() {
            addCriterion("ONLINE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusEqualTo(String value) {
            addCriterion("ONLINE_STATUS =", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotEqualTo(String value) {
            addCriterion("ONLINE_STATUS <>", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThan(String value) {
            addCriterion("ONLINE_STATUS >", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_STATUS >=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThan(String value) {
            addCriterion("ONLINE_STATUS <", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_STATUS <=", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusLike(String value) {
            addCriterion("ONLINE_STATUS like", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotLike(String value) {
            addCriterion("ONLINE_STATUS not like", value, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusIn(List<String> values) {
            addCriterion("ONLINE_STATUS in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotIn(List<String> values) {
            addCriterion("ONLINE_STATUS not in", values, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusBetween(String value1, String value2) {
            addCriterion("ONLINE_STATUS between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andOnlineStatusNotBetween(String value1, String value2) {
            addCriterion("ONLINE_STATUS not between", value1, value2, "onlineStatus");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNull() {
            addCriterion("CREATER is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIsNotNull() {
            addCriterion("CREATER is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterEqualTo(String value) {
            addCriterion("CREATER =", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotEqualTo(String value) {
            addCriterion("CREATER <>", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThan(String value) {
            addCriterion("CREATER >", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterGreaterThanOrEqualTo(String value) {
            addCriterion("CREATER >=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThan(String value) {
            addCriterion("CREATER <", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLessThanOrEqualTo(String value) {
            addCriterion("CREATER <=", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterLike(String value) {
            addCriterion("CREATER like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotLike(String value) {
            addCriterion("CREATER not like", value, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterIn(List<String> values) {
            addCriterion("CREATER in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotIn(List<String> values) {
            addCriterion("CREATER not in", values, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterBetween(String value1, String value2) {
            addCriterion("CREATER between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreaterNotBetween(String value1, String value2) {
            addCriterion("CREATER not between", value1, value2, "creater");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("CREATED_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("CREATED_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(String value) {
            addCriterion("CREATED_DATE =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(String value) {
            addCriterion("CREATED_DATE <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(String value) {
            addCriterion("CREATED_DATE >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_DATE >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(String value) {
            addCriterion("CREATED_DATE <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(String value) {
            addCriterion("CREATED_DATE <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLike(String value) {
            addCriterion("CREATED_DATE like", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotLike(String value) {
            addCriterion("CREATED_DATE not like", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<String> values) {
            addCriterion("CREATED_DATE in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<String> values) {
            addCriterion("CREATED_DATE not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(String value1, String value2) {
            addCriterion("CREATED_DATE between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(String value1, String value2) {
            addCriterion("CREATED_DATE not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andModUserIsNull() {
            addCriterion("MOD_USER is null");
            return (Criteria) this;
        }

        public Criteria andModUserIsNotNull() {
            addCriterion("MOD_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModUserEqualTo(String value) {
            addCriterion("MOD_USER =", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotEqualTo(String value) {
            addCriterion("MOD_USER <>", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserGreaterThan(String value) {
            addCriterion("MOD_USER >", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_USER >=", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLessThan(String value) {
            addCriterion("MOD_USER <", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLessThanOrEqualTo(String value) {
            addCriterion("MOD_USER <=", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserLike(String value) {
            addCriterion("MOD_USER like", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotLike(String value) {
            addCriterion("MOD_USER not like", value, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserIn(List<String> values) {
            addCriterion("MOD_USER in", values, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotIn(List<String> values) {
            addCriterion("MOD_USER not in", values, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserBetween(String value1, String value2) {
            addCriterion("MOD_USER between", value1, value2, "modUser");
            return (Criteria) this;
        }

        public Criteria andModUserNotBetween(String value1, String value2) {
            addCriterion("MOD_USER not between", value1, value2, "modUser");
            return (Criteria) this;
        }

        public Criteria andModDateIsNull() {
            addCriterion("MOD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andModDateIsNotNull() {
            addCriterion("MOD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andModDateEqualTo(String value) {
            addCriterion("MOD_DATE =", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateNotEqualTo(String value) {
            addCriterion("MOD_DATE <>", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateGreaterThan(String value) {
            addCriterion("MOD_DATE >", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateGreaterThanOrEqualTo(String value) {
            addCriterion("MOD_DATE >=", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateLessThan(String value) {
            addCriterion("MOD_DATE <", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateLessThanOrEqualTo(String value) {
            addCriterion("MOD_DATE <=", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateLike(String value) {
            addCriterion("MOD_DATE like", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateNotLike(String value) {
            addCriterion("MOD_DATE not like", value, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateIn(List<String> values) {
            addCriterion("MOD_DATE in", values, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateNotIn(List<String> values) {
            addCriterion("MOD_DATE not in", values, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateBetween(String value1, String value2) {
            addCriterion("MOD_DATE between", value1, value2, "modDate");
            return (Criteria) this;
        }

        public Criteria andModDateNotBetween(String value1, String value2) {
            addCriterion("MOD_DATE not between", value1, value2, "modDate");
            return (Criteria) this;
        }

        public Criteria andCheckUserIsNull() {
            addCriterion("CHECK_USER is null");
            return (Criteria) this;
        }

        public Criteria andCheckUserIsNotNull() {
            addCriterion("CHECK_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckUserEqualTo(String value) {
            addCriterion("CHECK_USER =", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotEqualTo(String value) {
            addCriterion("CHECK_USER <>", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserGreaterThan(String value) {
            addCriterion("CHECK_USER >", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_USER >=", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserLessThan(String value) {
            addCriterion("CHECK_USER <", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserLessThanOrEqualTo(String value) {
            addCriterion("CHECK_USER <=", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserLike(String value) {
            addCriterion("CHECK_USER like", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotLike(String value) {
            addCriterion("CHECK_USER not like", value, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserIn(List<String> values) {
            addCriterion("CHECK_USER in", values, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotIn(List<String> values) {
            addCriterion("CHECK_USER not in", values, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserBetween(String value1, String value2) {
            addCriterion("CHECK_USER between", value1, value2, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckUserNotBetween(String value1, String value2) {
            addCriterion("CHECK_USER not between", value1, value2, "checkUser");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("CHECK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("CHECK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(String value) {
            addCriterion("CHECK_DATE =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(String value) {
            addCriterion("CHECK_DATE <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(String value) {
            addCriterion("CHECK_DATE >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_DATE >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(String value) {
            addCriterion("CHECK_DATE <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(String value) {
            addCriterion("CHECK_DATE <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLike(String value) {
            addCriterion("CHECK_DATE like", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotLike(String value) {
            addCriterion("CHECK_DATE not like", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<String> values) {
            addCriterion("CHECK_DATE in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<String> values) {
            addCriterion("CHECK_DATE not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(String value1, String value2) {
            addCriterion("CHECK_DATE between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(String value1, String value2) {
            addCriterion("CHECK_DATE not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("MAIL is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("MAIL =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("MAIL <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("MAIL >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("MAIL >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("MAIL <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("MAIL <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("MAIL like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("MAIL not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("MAIL in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("MAIL not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("MAIL between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("MAIL not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andTelnoIsNull() {
            addCriterion("TELNO is null");
            return (Criteria) this;
        }

        public Criteria andTelnoIsNotNull() {
            addCriterion("TELNO is not null");
            return (Criteria) this;
        }

        public Criteria andTelnoEqualTo(String value) {
            addCriterion("TELNO =", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotEqualTo(String value) {
            addCriterion("TELNO <>", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoGreaterThan(String value) {
            addCriterion("TELNO >", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoGreaterThanOrEqualTo(String value) {
            addCriterion("TELNO >=", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLessThan(String value) {
            addCriterion("TELNO <", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLessThanOrEqualTo(String value) {
            addCriterion("TELNO <=", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoLike(String value) {
            addCriterion("TELNO like", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotLike(String value) {
            addCriterion("TELNO not like", value, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoIn(List<String> values) {
            addCriterion("TELNO in", values, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotIn(List<String> values) {
            addCriterion("TELNO not in", values, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoBetween(String value1, String value2) {
            addCriterion("TELNO between", value1, value2, "telno");
            return (Criteria) this;
        }

        public Criteria andTelnoNotBetween(String value1, String value2) {
            addCriterion("TELNO not between", value1, value2, "telno");
            return (Criteria) this;
        }

        public Criteria andVarsionNoIsNull() {
            addCriterion("VARSION_NO is null");
            return (Criteria) this;
        }

        public Criteria andVarsionNoIsNotNull() {
            addCriterion("VARSION_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVarsionNoEqualTo(BigDecimal value) {
            addCriterion("VARSION_NO =", value, "varsionNo");
            return (Criteria) this;
        }

        public Criteria andVarsionNoNotEqualTo(BigDecimal value) {
            addCriterion("VARSION_NO <>", value, "varsionNo");
            return (Criteria) this;
        }

        public Criteria andVarsionNoGreaterThan(BigDecimal value) {
            addCriterion("VARSION_NO >", value, "varsionNo");
            return (Criteria) this;
        }

        public Criteria andVarsionNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VARSION_NO >=", value, "varsionNo");
            return (Criteria) this;
        }

        public Criteria andVarsionNoLessThan(BigDecimal value) {
            addCriterion("VARSION_NO <", value, "varsionNo");
            return (Criteria) this;
        }

        public Criteria andVarsionNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VARSION_NO <=", value, "varsionNo");
            return (Criteria) this;
        }

        public Criteria andVarsionNoIn(List<BigDecimal> values) {
            addCriterion("VARSION_NO in", values, "varsionNo");
            return (Criteria) this;
        }

        public Criteria andVarsionNoNotIn(List<BigDecimal> values) {
            addCriterion("VARSION_NO not in", values, "varsionNo");
            return (Criteria) this;
        }

        public Criteria andVarsionNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VARSION_NO between", value1, value2, "varsionNo");
            return (Criteria) this;
        }

        public Criteria andVarsionNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VARSION_NO not between", value1, value2, "varsionNo");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableIsNull() {
            addCriterion("CLIENT_SYNC_ENABLE is null");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableIsNotNull() {
            addCriterion("CLIENT_SYNC_ENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableEqualTo(String value) {
            addCriterion("CLIENT_SYNC_ENABLE =", value, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableNotEqualTo(String value) {
            addCriterion("CLIENT_SYNC_ENABLE <>", value, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableGreaterThan(String value) {
            addCriterion("CLIENT_SYNC_ENABLE >", value, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_SYNC_ENABLE >=", value, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableLessThan(String value) {
            addCriterion("CLIENT_SYNC_ENABLE <", value, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_SYNC_ENABLE <=", value, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableLike(String value) {
            addCriterion("CLIENT_SYNC_ENABLE like", value, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableNotLike(String value) {
            addCriterion("CLIENT_SYNC_ENABLE not like", value, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableIn(List<String> values) {
            addCriterion("CLIENT_SYNC_ENABLE in", values, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableNotIn(List<String> values) {
            addCriterion("CLIENT_SYNC_ENABLE not in", values, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableBetween(String value1, String value2) {
            addCriterion("CLIENT_SYNC_ENABLE between", value1, value2, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andClientSyncEnableNotBetween(String value1, String value2) {
            addCriterion("CLIENT_SYNC_ENABLE not between", value1, value2, "clientSyncEnable");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("BANK is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("BANK =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("BANK <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("BANK >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("BANK >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("BANK <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("BANK <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("BANK like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("BANK not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("BANK in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("BANK not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("BANK between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("BANK not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNull() {
            addCriterion("APPLICATION is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNotNull() {
            addCriterion("APPLICATION is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEqualTo(String value) {
            addCriterion("APPLICATION =", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotEqualTo(String value) {
            addCriterion("APPLICATION <>", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThan(String value) {
            addCriterion("APPLICATION >", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION >=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThan(String value) {
            addCriterion("APPLICATION <", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION <=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLike(String value) {
            addCriterion("APPLICATION like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotLike(String value) {
            addCriterion("APPLICATION not like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationIn(List<String> values) {
            addCriterion("APPLICATION in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotIn(List<String> values) {
            addCriterion("APPLICATION not in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationBetween(String value1, String value2) {
            addCriterion("APPLICATION between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotBetween(String value1, String value2) {
            addCriterion("APPLICATION not between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordIsNull() {
            addCriterion("IS_INITIAL_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordIsNotNull() {
            addCriterion("IS_INITIAL_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordEqualTo(String value) {
            addCriterion("IS_INITIAL_PASSWORD =", value, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordNotEqualTo(String value) {
            addCriterion("IS_INITIAL_PASSWORD <>", value, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordGreaterThan(String value) {
            addCriterion("IS_INITIAL_PASSWORD >", value, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INITIAL_PASSWORD >=", value, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordLessThan(String value) {
            addCriterion("IS_INITIAL_PASSWORD <", value, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordLessThanOrEqualTo(String value) {
            addCriterion("IS_INITIAL_PASSWORD <=", value, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordLike(String value) {
            addCriterion("IS_INITIAL_PASSWORD like", value, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordNotLike(String value) {
            addCriterion("IS_INITIAL_PASSWORD not like", value, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordIn(List<String> values) {
            addCriterion("IS_INITIAL_PASSWORD in", values, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordNotIn(List<String> values) {
            addCriterion("IS_INITIAL_PASSWORD not in", values, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordBetween(String value1, String value2) {
            addCriterion("IS_INITIAL_PASSWORD between", value1, value2, "isInitialPassword");
            return (Criteria) this;
        }

        public Criteria andIsInitialPasswordNotBetween(String value1, String value2) {
            addCriterion("IS_INITIAL_PASSWORD not between", value1, value2, "isInitialPassword");
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

        public Criteria andGroupIdIsNull() {
            addCriterion("GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(String value) {
            addCriterion("GROUP_ID =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(String value) {
            addCriterion("GROUP_ID <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(String value) {
            addCriterion("GROUP_ID >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("GROUP_ID >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(String value) {
            addCriterion("GROUP_ID <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(String value) {
            addCriterion("GROUP_ID <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLike(String value) {
            addCriterion("GROUP_ID like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotLike(String value) {
            addCriterion("GROUP_ID not like", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<String> values) {
            addCriterion("GROUP_ID in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<String> values) {
            addCriterion("GROUP_ID not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(String value1, String value2) {
            addCriterion("GROUP_ID between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(String value1, String value2) {
            addCriterion("GROUP_ID not between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
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