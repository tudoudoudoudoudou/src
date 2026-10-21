package com.gingkoo.rpt.dbsvr.server.bean;

import java.util.ArrayList;
import java.util.List;

public class TbInqCfgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbInqCfgExample() {
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

        public Criteria andSqlIdIsNull() {
            addCriterion("SQL_ID is null");
            return (Criteria) this;
        }

        public Criteria andSqlIdIsNotNull() {
            addCriterion("SQL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSqlIdEqualTo(String value) {
            addCriterion("SQL_ID =", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotEqualTo(String value) {
            addCriterion("SQL_ID <>", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdGreaterThan(String value) {
            addCriterion("SQL_ID >", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_ID >=", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdLessThan(String value) {
            addCriterion("SQL_ID <", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdLessThanOrEqualTo(String value) {
            addCriterion("SQL_ID <=", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdLike(String value) {
            addCriterion("SQL_ID like", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotLike(String value) {
            addCriterion("SQL_ID not like", value, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdIn(List<String> values) {
            addCriterion("SQL_ID in", values, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotIn(List<String> values) {
            addCriterion("SQL_ID not in", values, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdBetween(String value1, String value2) {
            addCriterion("SQL_ID between", value1, value2, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlIdNotBetween(String value1, String value2) {
            addCriterion("SQL_ID not between", value1, value2, "sqlId");
            return (Criteria) this;
        }

        public Criteria andSqlStringIsNull() {
            addCriterion("SQL_STRING is null");
            return (Criteria) this;
        }

        public Criteria andSqlStringIsNotNull() {
            addCriterion("SQL_STRING is not null");
            return (Criteria) this;
        }

        public Criteria andSqlStringEqualTo(String value) {
            addCriterion("SQL_STRING =", value, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringNotEqualTo(String value) {
            addCriterion("SQL_STRING <>", value, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringGreaterThan(String value) {
            addCriterion("SQL_STRING >", value, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringGreaterThanOrEqualTo(String value) {
            addCriterion("SQL_STRING >=", value, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringLessThan(String value) {
            addCriterion("SQL_STRING <", value, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringLessThanOrEqualTo(String value) {
            addCriterion("SQL_STRING <=", value, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringLike(String value) {
            addCriterion("SQL_STRING like", value, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringNotLike(String value) {
            addCriterion("SQL_STRING not like", value, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringIn(List<String> values) {
            addCriterion("SQL_STRING in", values, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringNotIn(List<String> values) {
            addCriterion("SQL_STRING not in", values, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringBetween(String value1, String value2) {
            addCriterion("SQL_STRING between", value1, value2, "sqlString");
            return (Criteria) this;
        }

        public Criteria andSqlStringNotBetween(String value1, String value2) {
            addCriterion("SQL_STRING not between", value1, value2, "sqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringIsNull() {
            addCriterion("DETAIL_SQL_STRING is null");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringIsNotNull() {
            addCriterion("DETAIL_SQL_STRING is not null");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringEqualTo(String value) {
            addCriterion("DETAIL_SQL_STRING =", value, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringNotEqualTo(String value) {
            addCriterion("DETAIL_SQL_STRING <>", value, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringGreaterThan(String value) {
            addCriterion("DETAIL_SQL_STRING >", value, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_SQL_STRING >=", value, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringLessThan(String value) {
            addCriterion("DETAIL_SQL_STRING <", value, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_SQL_STRING <=", value, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringLike(String value) {
            addCriterion("DETAIL_SQL_STRING like", value, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringNotLike(String value) {
            addCriterion("DETAIL_SQL_STRING not like", value, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringIn(List<String> values) {
            addCriterion("DETAIL_SQL_STRING in", values, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringNotIn(List<String> values) {
            addCriterion("DETAIL_SQL_STRING not in", values, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringBetween(String value1, String value2) {
            addCriterion("DETAIL_SQL_STRING between", value1, value2, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andDetailSqlStringNotBetween(String value1, String value2) {
            addCriterion("DETAIL_SQL_STRING not between", value1, value2, "detailSqlString");
            return (Criteria) this;
        }

        public Criteria andSystemIsNull() {
            addCriterion("SYSTEM is null");
            return (Criteria) this;
        }

        public Criteria andSystemIsNotNull() {
            addCriterion("SYSTEM is not null");
            return (Criteria) this;
        }

        public Criteria andSystemEqualTo(String value) {
            addCriterion("SYSTEM =", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotEqualTo(String value) {
            addCriterion("SYSTEM <>", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThan(String value) {
            addCriterion("SYSTEM >", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM >=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThan(String value) {
            addCriterion("SYSTEM <", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM <=", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemLike(String value) {
            addCriterion("SYSTEM like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotLike(String value) {
            addCriterion("SYSTEM not like", value, "system");
            return (Criteria) this;
        }

        public Criteria andSystemIn(List<String> values) {
            addCriterion("SYSTEM in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotIn(List<String> values) {
            addCriterion("SYSTEM not in", values, "system");
            return (Criteria) this;
        }

        public Criteria andSystemBetween(String value1, String value2) {
            addCriterion("SYSTEM between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andSystemNotBetween(String value1, String value2) {
            addCriterion("SYSTEM not between", value1, value2, "system");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("REMARKS =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("REMARKS <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("REMARKS >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REMARKS >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("REMARKS <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("REMARKS <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("REMARKS like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("REMARKS not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("REMARKS in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("REMARKS not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("REMARKS between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("REMARKS not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("UPD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("UPD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(String value) {
            addCriterion("UPD_TIME =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(String value) {
            addCriterion("UPD_TIME <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(String value) {
            addCriterion("UPD_TIME >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPD_TIME >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(String value) {
            addCriterion("UPD_TIME <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(String value) {
            addCriterion("UPD_TIME <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLike(String value) {
            addCriterion("UPD_TIME like", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotLike(String value) {
            addCriterion("UPD_TIME not like", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<String> values) {
            addCriterion("UPD_TIME in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<String> values) {
            addCriterion("UPD_TIME not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(String value1, String value2) {
            addCriterion("UPD_TIME between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(String value1, String value2) {
            addCriterion("UPD_TIME not between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(String value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(String value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(String value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(String value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(String value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLike(String value) {
            addCriterion("ADD_TIME like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotLike(String value) {
            addCriterion("ADD_TIME not like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<String> values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<String> values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(String value1, String value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(String value1, String value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
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