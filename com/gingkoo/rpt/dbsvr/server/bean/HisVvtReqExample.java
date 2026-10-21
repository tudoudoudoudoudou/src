package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HisVvtReqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HisVvtReqExample() {
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

        public Criteria andDataIdIsNull() {
            addCriterion("DATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andDataIdIsNotNull() {
            addCriterion("DATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDataIdEqualTo(String value) {
            addCriterion("DATA_ID =", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotEqualTo(String value) {
            addCriterion("DATA_ID <>", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThan(String value) {
            addCriterion("DATA_ID >", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_ID >=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThan(String value) {
            addCriterion("DATA_ID <", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLessThanOrEqualTo(String value) {
            addCriterion("DATA_ID <=", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdLike(String value) {
            addCriterion("DATA_ID like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotLike(String value) {
            addCriterion("DATA_ID not like", value, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdIn(List<String> values) {
            addCriterion("DATA_ID in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotIn(List<String> values) {
            addCriterion("DATA_ID not in", values, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdBetween(String value1, String value2) {
            addCriterion("DATA_ID between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataIdNotBetween(String value1, String value2) {
            addCriterion("DATA_ID not between", value1, value2, "dataId");
            return (Criteria) this;
        }

        public Criteria andDataDateIsNull() {
            addCriterion("DATA_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDataDateIsNotNull() {
            addCriterion("DATA_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDataDateEqualTo(String value) {
            addCriterion("DATA_DATE =", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotEqualTo(String value) {
            addCriterion("DATA_DATE <>", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThan(String value) {
            addCriterion("DATA_DATE >", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_DATE >=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThan(String value) {
            addCriterion("DATA_DATE <", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLessThanOrEqualTo(String value) {
            addCriterion("DATA_DATE <=", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateLike(String value) {
            addCriterion("DATA_DATE like", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotLike(String value) {
            addCriterion("DATA_DATE not like", value, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateIn(List<String> values) {
            addCriterion("DATA_DATE in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotIn(List<String> values) {
            addCriterion("DATA_DATE not in", values, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateBetween(String value1, String value2) {
            addCriterion("DATA_DATE between", value1, value2, "dataDate");
            return (Criteria) this;
        }

        public Criteria andDataDateNotBetween(String value1, String value2) {
            addCriterion("DATA_DATE not between", value1, value2, "dataDate");
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(String value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(String value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(String value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(String value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(String value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLike(String value) {
            addCriterion("ORG_ID like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotLike(String value) {
            addCriterion("ORG_ID not like", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<String> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<String> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(String value1, String value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(String value1, String value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
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

        public Criteria andInqOrgIdIsNull() {
            addCriterion("INQ_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdIsNotNull() {
            addCriterion("INQ_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdEqualTo(String value) {
            addCriterion("INQ_ORG_ID =", value, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdNotEqualTo(String value) {
            addCriterion("INQ_ORG_ID <>", value, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdGreaterThan(String value) {
            addCriterion("INQ_ORG_ID >", value, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("INQ_ORG_ID >=", value, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdLessThan(String value) {
            addCriterion("INQ_ORG_ID <", value, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdLessThanOrEqualTo(String value) {
            addCriterion("INQ_ORG_ID <=", value, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdLike(String value) {
            addCriterion("INQ_ORG_ID like", value, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdNotLike(String value) {
            addCriterion("INQ_ORG_ID not like", value, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdIn(List<String> values) {
            addCriterion("INQ_ORG_ID in", values, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdNotIn(List<String> values) {
            addCriterion("INQ_ORG_ID not in", values, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdBetween(String value1, String value2) {
            addCriterion("INQ_ORG_ID between", value1, value2, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqOrgIdNotBetween(String value1, String value2) {
            addCriterion("INQ_ORG_ID not between", value1, value2, "inqOrgId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdIsNull() {
            addCriterion("INQ_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdIsNotNull() {
            addCriterion("INQ_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdEqualTo(String value) {
            addCriterion("INQ_GROUP_ID =", value, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdNotEqualTo(String value) {
            addCriterion("INQ_GROUP_ID <>", value, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdGreaterThan(String value) {
            addCriterion("INQ_GROUP_ID >", value, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("INQ_GROUP_ID >=", value, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdLessThan(String value) {
            addCriterion("INQ_GROUP_ID <", value, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdLessThanOrEqualTo(String value) {
            addCriterion("INQ_GROUP_ID <=", value, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdLike(String value) {
            addCriterion("INQ_GROUP_ID like", value, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdNotLike(String value) {
            addCriterion("INQ_GROUP_ID not like", value, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdIn(List<String> values) {
            addCriterion("INQ_GROUP_ID in", values, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdNotIn(List<String> values) {
            addCriterion("INQ_GROUP_ID not in", values, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdBetween(String value1, String value2) {
            addCriterion("INQ_GROUP_ID between", value1, value2, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andInqGroupIdNotBetween(String value1, String value2) {
            addCriterion("INQ_GROUP_ID not between", value1, value2, "inqGroupId");
            return (Criteria) this;
        }

        public Criteria andVeTypeIsNull() {
            addCriterion("VE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVeTypeIsNotNull() {
            addCriterion("VE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVeTypeEqualTo(String value) {
            addCriterion("VE_TYPE =", value, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeNotEqualTo(String value) {
            addCriterion("VE_TYPE <>", value, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeGreaterThan(String value) {
            addCriterion("VE_TYPE >", value, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VE_TYPE >=", value, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeLessThan(String value) {
            addCriterion("VE_TYPE <", value, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeLessThanOrEqualTo(String value) {
            addCriterion("VE_TYPE <=", value, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeLike(String value) {
            addCriterion("VE_TYPE like", value, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeNotLike(String value) {
            addCriterion("VE_TYPE not like", value, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeIn(List<String> values) {
            addCriterion("VE_TYPE in", values, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeNotIn(List<String> values) {
            addCriterion("VE_TYPE not in", values, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeBetween(String value1, String value2) {
            addCriterion("VE_TYPE between", value1, value2, "veType");
            return (Criteria) this;
        }

        public Criteria andVeTypeNotBetween(String value1, String value2) {
            addCriterion("VE_TYPE not between", value1, value2, "veType");
            return (Criteria) this;
        }

        public Criteria andVeAmountIsNull() {
            addCriterion("VE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andVeAmountIsNotNull() {
            addCriterion("VE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andVeAmountEqualTo(BigDecimal value) {
            addCriterion("VE_AMOUNT =", value, "veAmount");
            return (Criteria) this;
        }

        public Criteria andVeAmountNotEqualTo(BigDecimal value) {
            addCriterion("VE_AMOUNT <>", value, "veAmount");
            return (Criteria) this;
        }

        public Criteria andVeAmountGreaterThan(BigDecimal value) {
            addCriterion("VE_AMOUNT >", value, "veAmount");
            return (Criteria) this;
        }

        public Criteria andVeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VE_AMOUNT >=", value, "veAmount");
            return (Criteria) this;
        }

        public Criteria andVeAmountLessThan(BigDecimal value) {
            addCriterion("VE_AMOUNT <", value, "veAmount");
            return (Criteria) this;
        }

        public Criteria andVeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VE_AMOUNT <=", value, "veAmount");
            return (Criteria) this;
        }

        public Criteria andVeAmountIn(List<BigDecimal> values) {
            addCriterion("VE_AMOUNT in", values, "veAmount");
            return (Criteria) this;
        }

        public Criteria andVeAmountNotIn(List<BigDecimal> values) {
            addCriterion("VE_AMOUNT not in", values, "veAmount");
            return (Criteria) this;
        }

        public Criteria andVeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VE_AMOUNT between", value1, value2, "veAmount");
            return (Criteria) this;
        }

        public Criteria andVeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VE_AMOUNT not between", value1, value2, "veAmount");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateIsNull() {
            addCriterion("VE_BUY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateIsNotNull() {
            addCriterion("VE_BUY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateEqualTo(String value) {
            addCriterion("VE_BUY_DATE =", value, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateNotEqualTo(String value) {
            addCriterion("VE_BUY_DATE <>", value, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateGreaterThan(String value) {
            addCriterion("VE_BUY_DATE >", value, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateGreaterThanOrEqualTo(String value) {
            addCriterion("VE_BUY_DATE >=", value, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateLessThan(String value) {
            addCriterion("VE_BUY_DATE <", value, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateLessThanOrEqualTo(String value) {
            addCriterion("VE_BUY_DATE <=", value, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateLike(String value) {
            addCriterion("VE_BUY_DATE like", value, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateNotLike(String value) {
            addCriterion("VE_BUY_DATE not like", value, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateIn(List<String> values) {
            addCriterion("VE_BUY_DATE in", values, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateNotIn(List<String> values) {
            addCriterion("VE_BUY_DATE not in", values, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateBetween(String value1, String value2) {
            addCriterion("VE_BUY_DATE between", value1, value2, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeBuyDateNotBetween(String value1, String value2) {
            addCriterion("VE_BUY_DATE not between", value1, value2, "veBuyDate");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementIsNull() {
            addCriterion("VE_DISPLACEMENT is null");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementIsNotNull() {
            addCriterion("VE_DISPLACEMENT is not null");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementEqualTo(BigDecimal value) {
            addCriterion("VE_DISPLACEMENT =", value, "veDisplacement");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementNotEqualTo(BigDecimal value) {
            addCriterion("VE_DISPLACEMENT <>", value, "veDisplacement");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementGreaterThan(BigDecimal value) {
            addCriterion("VE_DISPLACEMENT >", value, "veDisplacement");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VE_DISPLACEMENT >=", value, "veDisplacement");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementLessThan(BigDecimal value) {
            addCriterion("VE_DISPLACEMENT <", value, "veDisplacement");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VE_DISPLACEMENT <=", value, "veDisplacement");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementIn(List<BigDecimal> values) {
            addCriterion("VE_DISPLACEMENT in", values, "veDisplacement");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementNotIn(List<BigDecimal> values) {
            addCriterion("VE_DISPLACEMENT not in", values, "veDisplacement");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VE_DISPLACEMENT between", value1, value2, "veDisplacement");
            return (Criteria) this;
        }

        public Criteria andVeDisplacementNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VE_DISPLACEMENT not between", value1, value2, "veDisplacement");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgIsNull() {
            addCriterion("VE_APV_PSG is null");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgIsNotNull() {
            addCriterion("VE_APV_PSG is not null");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgEqualTo(BigDecimal value) {
            addCriterion("VE_APV_PSG =", value, "veApvPsg");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgNotEqualTo(BigDecimal value) {
            addCriterion("VE_APV_PSG <>", value, "veApvPsg");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgGreaterThan(BigDecimal value) {
            addCriterion("VE_APV_PSG >", value, "veApvPsg");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VE_APV_PSG >=", value, "veApvPsg");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgLessThan(BigDecimal value) {
            addCriterion("VE_APV_PSG <", value, "veApvPsg");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VE_APV_PSG <=", value, "veApvPsg");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgIn(List<BigDecimal> values) {
            addCriterion("VE_APV_PSG in", values, "veApvPsg");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgNotIn(List<BigDecimal> values) {
            addCriterion("VE_APV_PSG not in", values, "veApvPsg");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VE_APV_PSG between", value1, value2, "veApvPsg");
            return (Criteria) this;
        }

        public Criteria andVeApvPsgNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VE_APV_PSG not between", value1, value2, "veApvPsg");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassIsNull() {
            addCriterion("VE_KERB_MASS is null");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassIsNotNull() {
            addCriterion("VE_KERB_MASS is not null");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassEqualTo(String value) {
            addCriterion("VE_KERB_MASS =", value, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassNotEqualTo(String value) {
            addCriterion("VE_KERB_MASS <>", value, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassGreaterThan(String value) {
            addCriterion("VE_KERB_MASS >", value, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassGreaterThanOrEqualTo(String value) {
            addCriterion("VE_KERB_MASS >=", value, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassLessThan(String value) {
            addCriterion("VE_KERB_MASS <", value, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassLessThanOrEqualTo(String value) {
            addCriterion("VE_KERB_MASS <=", value, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassLike(String value) {
            addCriterion("VE_KERB_MASS like", value, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassNotLike(String value) {
            addCriterion("VE_KERB_MASS not like", value, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassIn(List<String> values) {
            addCriterion("VE_KERB_MASS in", values, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassNotIn(List<String> values) {
            addCriterion("VE_KERB_MASS not in", values, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassBetween(String value1, String value2) {
            addCriterion("VE_KERB_MASS between", value1, value2, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeKerbMassNotBetween(String value1, String value2) {
            addCriterion("VE_KERB_MASS not between", value1, value2, "veKerbMass");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateIsNull() {
            addCriterion("VE_LIC_PLATE is null");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateIsNotNull() {
            addCriterion("VE_LIC_PLATE is not null");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateEqualTo(String value) {
            addCriterion("VE_LIC_PLATE =", value, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateNotEqualTo(String value) {
            addCriterion("VE_LIC_PLATE <>", value, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateGreaterThan(String value) {
            addCriterion("VE_LIC_PLATE >", value, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateGreaterThanOrEqualTo(String value) {
            addCriterion("VE_LIC_PLATE >=", value, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateLessThan(String value) {
            addCriterion("VE_LIC_PLATE <", value, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateLessThanOrEqualTo(String value) {
            addCriterion("VE_LIC_PLATE <=", value, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateLike(String value) {
            addCriterion("VE_LIC_PLATE like", value, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateNotLike(String value) {
            addCriterion("VE_LIC_PLATE not like", value, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateIn(List<String> values) {
            addCriterion("VE_LIC_PLATE in", values, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateNotIn(List<String> values) {
            addCriterion("VE_LIC_PLATE not in", values, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateBetween(String value1, String value2) {
            addCriterion("VE_LIC_PLATE between", value1, value2, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeLicPlateNotBetween(String value1, String value2) {
            addCriterion("VE_LIC_PLATE not between", value1, value2, "veLicPlate");
            return (Criteria) this;
        }

        public Criteria andVeStatusIsNull() {
            addCriterion("VE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andVeStatusIsNotNull() {
            addCriterion("VE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andVeStatusEqualTo(String value) {
            addCriterion("VE_STATUS =", value, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusNotEqualTo(String value) {
            addCriterion("VE_STATUS <>", value, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusGreaterThan(String value) {
            addCriterion("VE_STATUS >", value, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("VE_STATUS >=", value, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusLessThan(String value) {
            addCriterion("VE_STATUS <", value, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusLessThanOrEqualTo(String value) {
            addCriterion("VE_STATUS <=", value, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusLike(String value) {
            addCriterion("VE_STATUS like", value, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusNotLike(String value) {
            addCriterion("VE_STATUS not like", value, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusIn(List<String> values) {
            addCriterion("VE_STATUS in", values, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusNotIn(List<String> values) {
            addCriterion("VE_STATUS not in", values, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusBetween(String value1, String value2) {
            addCriterion("VE_STATUS between", value1, value2, "veStatus");
            return (Criteria) this;
        }

        public Criteria andVeStatusNotBetween(String value1, String value2) {
            addCriterion("VE_STATUS not between", value1, value2, "veStatus");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeIsNull() {
            addCriterion("CAL_TAX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeIsNotNull() {
            addCriterion("CAL_TAX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeEqualTo(String value) {
            addCriterion("CAL_TAX_TYPE =", value, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeNotEqualTo(String value) {
            addCriterion("CAL_TAX_TYPE <>", value, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeGreaterThan(String value) {
            addCriterion("CAL_TAX_TYPE >", value, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CAL_TAX_TYPE >=", value, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeLessThan(String value) {
            addCriterion("CAL_TAX_TYPE <", value, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeLessThanOrEqualTo(String value) {
            addCriterion("CAL_TAX_TYPE <=", value, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeLike(String value) {
            addCriterion("CAL_TAX_TYPE like", value, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeNotLike(String value) {
            addCriterion("CAL_TAX_TYPE not like", value, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeIn(List<String> values) {
            addCriterion("CAL_TAX_TYPE in", values, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeNotIn(List<String> values) {
            addCriterion("CAL_TAX_TYPE not in", values, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeBetween(String value1, String value2) {
            addCriterion("CAL_TAX_TYPE between", value1, value2, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andCalTaxTypeNotBetween(String value1, String value2) {
            addCriterion("CAL_TAX_TYPE not between", value1, value2, "calTaxType");
            return (Criteria) this;
        }

        public Criteria andTaxUnitIsNull() {
            addCriterion("TAX_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andTaxUnitIsNotNull() {
            addCriterion("TAX_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxUnitEqualTo(BigDecimal value) {
            addCriterion("TAX_UNIT =", value, "taxUnit");
            return (Criteria) this;
        }

        public Criteria andTaxUnitNotEqualTo(BigDecimal value) {
            addCriterion("TAX_UNIT <>", value, "taxUnit");
            return (Criteria) this;
        }

        public Criteria andTaxUnitGreaterThan(BigDecimal value) {
            addCriterion("TAX_UNIT >", value, "taxUnit");
            return (Criteria) this;
        }

        public Criteria andTaxUnitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_UNIT >=", value, "taxUnit");
            return (Criteria) this;
        }

        public Criteria andTaxUnitLessThan(BigDecimal value) {
            addCriterion("TAX_UNIT <", value, "taxUnit");
            return (Criteria) this;
        }

        public Criteria andTaxUnitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_UNIT <=", value, "taxUnit");
            return (Criteria) this;
        }

        public Criteria andTaxUnitIn(List<BigDecimal> values) {
            addCriterion("TAX_UNIT in", values, "taxUnit");
            return (Criteria) this;
        }

        public Criteria andTaxUnitNotIn(List<BigDecimal> values) {
            addCriterion("TAX_UNIT not in", values, "taxUnit");
            return (Criteria) this;
        }

        public Criteria andTaxUnitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_UNIT between", value1, value2, "taxUnit");
            return (Criteria) this;
        }

        public Criteria andTaxUnitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_UNIT not between", value1, value2, "taxUnit");
            return (Criteria) this;
        }

        public Criteria andBuyAddrIsNull() {
            addCriterion("BUY_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andBuyAddrIsNotNull() {
            addCriterion("BUY_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andBuyAddrEqualTo(String value) {
            addCriterion("BUY_ADDR =", value, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrNotEqualTo(String value) {
            addCriterion("BUY_ADDR <>", value, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrGreaterThan(String value) {
            addCriterion("BUY_ADDR >", value, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_ADDR >=", value, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrLessThan(String value) {
            addCriterion("BUY_ADDR <", value, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrLessThanOrEqualTo(String value) {
            addCriterion("BUY_ADDR <=", value, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrLike(String value) {
            addCriterion("BUY_ADDR like", value, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrNotLike(String value) {
            addCriterion("BUY_ADDR not like", value, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrIn(List<String> values) {
            addCriterion("BUY_ADDR in", values, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrNotIn(List<String> values) {
            addCriterion("BUY_ADDR not in", values, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrBetween(String value1, String value2) {
            addCriterion("BUY_ADDR between", value1, value2, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyAddrNotBetween(String value1, String value2) {
            addCriterion("BUY_ADDR not between", value1, value2, "buyAddr");
            return (Criteria) this;
        }

        public Criteria andBuyTelIsNull() {
            addCriterion("BUY_TEL is null");
            return (Criteria) this;
        }

        public Criteria andBuyTelIsNotNull() {
            addCriterion("BUY_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTelEqualTo(String value) {
            addCriterion("BUY_TEL =", value, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelNotEqualTo(String value) {
            addCriterion("BUY_TEL <>", value, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelGreaterThan(String value) {
            addCriterion("BUY_TEL >", value, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_TEL >=", value, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelLessThan(String value) {
            addCriterion("BUY_TEL <", value, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelLessThanOrEqualTo(String value) {
            addCriterion("BUY_TEL <=", value, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelLike(String value) {
            addCriterion("BUY_TEL like", value, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelNotLike(String value) {
            addCriterion("BUY_TEL not like", value, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelIn(List<String> values) {
            addCriterion("BUY_TEL in", values, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelNotIn(List<String> values) {
            addCriterion("BUY_TEL not in", values, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelBetween(String value1, String value2) {
            addCriterion("BUY_TEL between", value1, value2, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyTelNotBetween(String value1, String value2) {
            addCriterion("BUY_TEL not between", value1, value2, "buyTel");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoIsNull() {
            addCriterion("BUY_BANK_NO is null");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoIsNotNull() {
            addCriterion("BUY_BANK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoEqualTo(String value) {
            addCriterion("BUY_BANK_NO =", value, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoNotEqualTo(String value) {
            addCriterion("BUY_BANK_NO <>", value, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoGreaterThan(String value) {
            addCriterion("BUY_BANK_NO >", value, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_BANK_NO >=", value, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoLessThan(String value) {
            addCriterion("BUY_BANK_NO <", value, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoLessThanOrEqualTo(String value) {
            addCriterion("BUY_BANK_NO <=", value, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoLike(String value) {
            addCriterion("BUY_BANK_NO like", value, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoNotLike(String value) {
            addCriterion("BUY_BANK_NO not like", value, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoIn(List<String> values) {
            addCriterion("BUY_BANK_NO in", values, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoNotIn(List<String> values) {
            addCriterion("BUY_BANK_NO not in", values, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoBetween(String value1, String value2) {
            addCriterion("BUY_BANK_NO between", value1, value2, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyBankNoNotBetween(String value1, String value2) {
            addCriterion("BUY_BANK_NO not between", value1, value2, "buyBankNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoIsNull() {
            addCriterion("BUY_ACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andBuyActNoIsNotNull() {
            addCriterion("BUY_ACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBuyActNoEqualTo(String value) {
            addCriterion("BUY_ACT_NO =", value, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoNotEqualTo(String value) {
            addCriterion("BUY_ACT_NO <>", value, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoGreaterThan(String value) {
            addCriterion("BUY_ACT_NO >", value, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_ACT_NO >=", value, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoLessThan(String value) {
            addCriterion("BUY_ACT_NO <", value, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoLessThanOrEqualTo(String value) {
            addCriterion("BUY_ACT_NO <=", value, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoLike(String value) {
            addCriterion("BUY_ACT_NO like", value, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoNotLike(String value) {
            addCriterion("BUY_ACT_NO not like", value, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoIn(List<String> values) {
            addCriterion("BUY_ACT_NO in", values, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoNotIn(List<String> values) {
            addCriterion("BUY_ACT_NO not in", values, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoBetween(String value1, String value2) {
            addCriterion("BUY_ACT_NO between", value1, value2, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andBuyActNoNotBetween(String value1, String value2) {
            addCriterion("BUY_ACT_NO not between", value1, value2, "buyActNo");
            return (Criteria) this;
        }

        public Criteria andSaleNameIsNull() {
            addCriterion("SALE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSaleNameIsNotNull() {
            addCriterion("SALE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNameEqualTo(String value) {
            addCriterion("SALE_NAME =", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotEqualTo(String value) {
            addCriterion("SALE_NAME <>", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameGreaterThan(String value) {
            addCriterion("SALE_NAME >", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_NAME >=", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLessThan(String value) {
            addCriterion("SALE_NAME <", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLessThanOrEqualTo(String value) {
            addCriterion("SALE_NAME <=", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLike(String value) {
            addCriterion("SALE_NAME like", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotLike(String value) {
            addCriterion("SALE_NAME not like", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameIn(List<String> values) {
            addCriterion("SALE_NAME in", values, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotIn(List<String> values) {
            addCriterion("SALE_NAME not in", values, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameBetween(String value1, String value2) {
            addCriterion("SALE_NAME between", value1, value2, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotBetween(String value1, String value2) {
            addCriterion("SALE_NAME not between", value1, value2, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoIsNull() {
            addCriterion("SALE_TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoIsNotNull() {
            addCriterion("SALE_TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoEqualTo(String value) {
            addCriterion("SALE_TAX_NO =", value, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoNotEqualTo(String value) {
            addCriterion("SALE_TAX_NO <>", value, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoGreaterThan(String value) {
            addCriterion("SALE_TAX_NO >", value, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_TAX_NO >=", value, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoLessThan(String value) {
            addCriterion("SALE_TAX_NO <", value, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoLessThanOrEqualTo(String value) {
            addCriterion("SALE_TAX_NO <=", value, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoLike(String value) {
            addCriterion("SALE_TAX_NO like", value, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoNotLike(String value) {
            addCriterion("SALE_TAX_NO not like", value, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoIn(List<String> values) {
            addCriterion("SALE_TAX_NO in", values, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoNotIn(List<String> values) {
            addCriterion("SALE_TAX_NO not in", values, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoBetween(String value1, String value2) {
            addCriterion("SALE_TAX_NO between", value1, value2, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleTaxNoNotBetween(String value1, String value2) {
            addCriterion("SALE_TAX_NO not between", value1, value2, "saleTaxNo");
            return (Criteria) this;
        }

        public Criteria andSaleAddrIsNull() {
            addCriterion("SALE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andSaleAddrIsNotNull() {
            addCriterion("SALE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAddrEqualTo(String value) {
            addCriterion("SALE_ADDR =", value, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrNotEqualTo(String value) {
            addCriterion("SALE_ADDR <>", value, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrGreaterThan(String value) {
            addCriterion("SALE_ADDR >", value, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_ADDR >=", value, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrLessThan(String value) {
            addCriterion("SALE_ADDR <", value, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrLessThanOrEqualTo(String value) {
            addCriterion("SALE_ADDR <=", value, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrLike(String value) {
            addCriterion("SALE_ADDR like", value, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrNotLike(String value) {
            addCriterion("SALE_ADDR not like", value, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrIn(List<String> values) {
            addCriterion("SALE_ADDR in", values, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrNotIn(List<String> values) {
            addCriterion("SALE_ADDR not in", values, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrBetween(String value1, String value2) {
            addCriterion("SALE_ADDR between", value1, value2, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleAddrNotBetween(String value1, String value2) {
            addCriterion("SALE_ADDR not between", value1, value2, "saleAddr");
            return (Criteria) this;
        }

        public Criteria andSaleTelIsNull() {
            addCriterion("SALE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andSaleTelIsNotNull() {
            addCriterion("SALE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTelEqualTo(String value) {
            addCriterion("SALE_TEL =", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelNotEqualTo(String value) {
            addCriterion("SALE_TEL <>", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelGreaterThan(String value) {
            addCriterion("SALE_TEL >", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_TEL >=", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelLessThan(String value) {
            addCriterion("SALE_TEL <", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelLessThanOrEqualTo(String value) {
            addCriterion("SALE_TEL <=", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelLike(String value) {
            addCriterion("SALE_TEL like", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelNotLike(String value) {
            addCriterion("SALE_TEL not like", value, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelIn(List<String> values) {
            addCriterion("SALE_TEL in", values, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelNotIn(List<String> values) {
            addCriterion("SALE_TEL not in", values, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelBetween(String value1, String value2) {
            addCriterion("SALE_TEL between", value1, value2, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleTelNotBetween(String value1, String value2) {
            addCriterion("SALE_TEL not between", value1, value2, "saleTel");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoIsNull() {
            addCriterion("SALE_BANK_NO is null");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoIsNotNull() {
            addCriterion("SALE_BANK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoEqualTo(String value) {
            addCriterion("SALE_BANK_NO =", value, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoNotEqualTo(String value) {
            addCriterion("SALE_BANK_NO <>", value, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoGreaterThan(String value) {
            addCriterion("SALE_BANK_NO >", value, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_BANK_NO >=", value, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoLessThan(String value) {
            addCriterion("SALE_BANK_NO <", value, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoLessThanOrEqualTo(String value) {
            addCriterion("SALE_BANK_NO <=", value, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoLike(String value) {
            addCriterion("SALE_BANK_NO like", value, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoNotLike(String value) {
            addCriterion("SALE_BANK_NO not like", value, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoIn(List<String> values) {
            addCriterion("SALE_BANK_NO in", values, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoNotIn(List<String> values) {
            addCriterion("SALE_BANK_NO not in", values, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoBetween(String value1, String value2) {
            addCriterion("SALE_BANK_NO between", value1, value2, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleBankNoNotBetween(String value1, String value2) {
            addCriterion("SALE_BANK_NO not between", value1, value2, "saleBankNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoIsNull() {
            addCriterion("SALE_ACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSaleActNoIsNotNull() {
            addCriterion("SALE_ACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSaleActNoEqualTo(String value) {
            addCriterion("SALE_ACT_NO =", value, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoNotEqualTo(String value) {
            addCriterion("SALE_ACT_NO <>", value, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoGreaterThan(String value) {
            addCriterion("SALE_ACT_NO >", value, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_ACT_NO >=", value, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoLessThan(String value) {
            addCriterion("SALE_ACT_NO <", value, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoLessThanOrEqualTo(String value) {
            addCriterion("SALE_ACT_NO <=", value, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoLike(String value) {
            addCriterion("SALE_ACT_NO like", value, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoNotLike(String value) {
            addCriterion("SALE_ACT_NO not like", value, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoIn(List<String> values) {
            addCriterion("SALE_ACT_NO in", values, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoNotIn(List<String> values) {
            addCriterion("SALE_ACT_NO not in", values, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoBetween(String value1, String value2) {
            addCriterion("SALE_ACT_NO between", value1, value2, "saleActNo");
            return (Criteria) this;
        }

        public Criteria andSaleActNoNotBetween(String value1, String value2) {
            addCriterion("SALE_ACT_NO not between", value1, value2, "saleActNo");
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

        public Criteria andPayeeNameIsNull() {
            addCriterion("PAYEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIsNotNull() {
            addCriterion("PAYEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeNameEqualTo(String value) {
            addCriterion("PAYEE_NAME =", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotEqualTo(String value) {
            addCriterion("PAYEE_NAME <>", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameGreaterThan(String value) {
            addCriterion("PAYEE_NAME >", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEE_NAME >=", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLessThan(String value) {
            addCriterion("PAYEE_NAME <", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLessThanOrEqualTo(String value) {
            addCriterion("PAYEE_NAME <=", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameLike(String value) {
            addCriterion("PAYEE_NAME like", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotLike(String value) {
            addCriterion("PAYEE_NAME not like", value, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameIn(List<String> values) {
            addCriterion("PAYEE_NAME in", values, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotIn(List<String> values) {
            addCriterion("PAYEE_NAME not in", values, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameBetween(String value1, String value2) {
            addCriterion("PAYEE_NAME between", value1, value2, "payeeName");
            return (Criteria) this;
        }

        public Criteria andPayeeNameNotBetween(String value1, String value2) {
            addCriterion("PAYEE_NAME not between", value1, value2, "payeeName");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andTaxAmtIsNull() {
            addCriterion("TAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTaxAmtIsNotNull() {
            addCriterion("TAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTaxAmtEqualTo(BigDecimal value) {
            addCriterion("TAX_AMT =", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("TAX_AMT <>", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtGreaterThan(BigDecimal value) {
            addCriterion("TAX_AMT >", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_AMT >=", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtLessThan(BigDecimal value) {
            addCriterion("TAX_AMT <", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_AMT <=", value, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtIn(List<BigDecimal> values) {
            addCriterion("TAX_AMT in", values, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("TAX_AMT not in", values, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_AMT between", value1, value2, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_AMT not between", value1, value2, "taxAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtIsNull() {
            addCriterion("SUM_AMT is null");
            return (Criteria) this;
        }

        public Criteria andSumAmtIsNotNull() {
            addCriterion("SUM_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andSumAmtEqualTo(BigDecimal value) {
            addCriterion("SUM_AMT =", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotEqualTo(BigDecimal value) {
            addCriterion("SUM_AMT <>", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtGreaterThan(BigDecimal value) {
            addCriterion("SUM_AMT >", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_AMT >=", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtLessThan(BigDecimal value) {
            addCriterion("SUM_AMT <", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUM_AMT <=", value, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtIn(List<BigDecimal> values) {
            addCriterion("SUM_AMT in", values, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotIn(List<BigDecimal> values) {
            addCriterion("SUM_AMT not in", values, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_AMT between", value1, value2, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andSumAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUM_AMT not between", value1, value2, "sumAmt");
            return (Criteria) this;
        }

        public Criteria andVocUserIsNull() {
            addCriterion("VOC_USER is null");
            return (Criteria) this;
        }

        public Criteria andVocUserIsNotNull() {
            addCriterion("VOC_USER is not null");
            return (Criteria) this;
        }

        public Criteria andVocUserEqualTo(String value) {
            addCriterion("VOC_USER =", value, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserNotEqualTo(String value) {
            addCriterion("VOC_USER <>", value, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserGreaterThan(String value) {
            addCriterion("VOC_USER >", value, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_USER >=", value, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserLessThan(String value) {
            addCriterion("VOC_USER <", value, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserLessThanOrEqualTo(String value) {
            addCriterion("VOC_USER <=", value, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserLike(String value) {
            addCriterion("VOC_USER like", value, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserNotLike(String value) {
            addCriterion("VOC_USER not like", value, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserIn(List<String> values) {
            addCriterion("VOC_USER in", values, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserNotIn(List<String> values) {
            addCriterion("VOC_USER not in", values, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserBetween(String value1, String value2) {
            addCriterion("VOC_USER between", value1, value2, "vocUser");
            return (Criteria) this;
        }

        public Criteria andVocUserNotBetween(String value1, String value2) {
            addCriterion("VOC_USER not between", value1, value2, "vocUser");
            return (Criteria) this;
        }

        public Criteria andApvUserIsNull() {
            addCriterion("APV_USER is null");
            return (Criteria) this;
        }

        public Criteria andApvUserIsNotNull() {
            addCriterion("APV_USER is not null");
            return (Criteria) this;
        }

        public Criteria andApvUserEqualTo(String value) {
            addCriterion("APV_USER =", value, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserNotEqualTo(String value) {
            addCriterion("APV_USER <>", value, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserGreaterThan(String value) {
            addCriterion("APV_USER >", value, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserGreaterThanOrEqualTo(String value) {
            addCriterion("APV_USER >=", value, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserLessThan(String value) {
            addCriterion("APV_USER <", value, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserLessThanOrEqualTo(String value) {
            addCriterion("APV_USER <=", value, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserLike(String value) {
            addCriterion("APV_USER like", value, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserNotLike(String value) {
            addCriterion("APV_USER not like", value, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserIn(List<String> values) {
            addCriterion("APV_USER in", values, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserNotIn(List<String> values) {
            addCriterion("APV_USER not in", values, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserBetween(String value1, String value2) {
            addCriterion("APV_USER between", value1, value2, "apvUser");
            return (Criteria) this;
        }

        public Criteria andApvUserNotBetween(String value1, String value2) {
            addCriterion("APV_USER not between", value1, value2, "apvUser");
            return (Criteria) this;
        }

        public Criteria andOriDataIdIsNull() {
            addCriterion("ORI_DATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriDataIdIsNotNull() {
            addCriterion("ORI_DATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriDataIdEqualTo(String value) {
            addCriterion("ORI_DATA_ID =", value, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdNotEqualTo(String value) {
            addCriterion("ORI_DATA_ID <>", value, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdGreaterThan(String value) {
            addCriterion("ORI_DATA_ID >", value, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORI_DATA_ID >=", value, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdLessThan(String value) {
            addCriterion("ORI_DATA_ID <", value, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdLessThanOrEqualTo(String value) {
            addCriterion("ORI_DATA_ID <=", value, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdLike(String value) {
            addCriterion("ORI_DATA_ID like", value, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdNotLike(String value) {
            addCriterion("ORI_DATA_ID not like", value, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdIn(List<String> values) {
            addCriterion("ORI_DATA_ID in", values, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdNotIn(List<String> values) {
            addCriterion("ORI_DATA_ID not in", values, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdBetween(String value1, String value2) {
            addCriterion("ORI_DATA_ID between", value1, value2, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andOriDataIdNotBetween(String value1, String value2) {
            addCriterion("ORI_DATA_ID not between", value1, value2, "oriDataId");
            return (Criteria) this;
        }

        public Criteria andIoFlagIsNull() {
            addCriterion("IO_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIoFlagIsNotNull() {
            addCriterion("IO_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIoFlagEqualTo(String value) {
            addCriterion("IO_FLAG =", value, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagNotEqualTo(String value) {
            addCriterion("IO_FLAG <>", value, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagGreaterThan(String value) {
            addCriterion("IO_FLAG >", value, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IO_FLAG >=", value, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagLessThan(String value) {
            addCriterion("IO_FLAG <", value, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagLessThanOrEqualTo(String value) {
            addCriterion("IO_FLAG <=", value, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagLike(String value) {
            addCriterion("IO_FLAG like", value, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagNotLike(String value) {
            addCriterion("IO_FLAG not like", value, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagIn(List<String> values) {
            addCriterion("IO_FLAG in", values, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagNotIn(List<String> values) {
            addCriterion("IO_FLAG not in", values, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagBetween(String value1, String value2) {
            addCriterion("IO_FLAG between", value1, value2, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIoFlagNotBetween(String value1, String value2) {
            addCriterion("IO_FLAG not between", value1, value2, "ioFlag");
            return (Criteria) this;
        }

        public Criteria andIIsDeduIsNull() {
            addCriterion("I_IS_DEDU is null");
            return (Criteria) this;
        }

        public Criteria andIIsDeduIsNotNull() {
            addCriterion("I_IS_DEDU is not null");
            return (Criteria) this;
        }

        public Criteria andIIsDeduEqualTo(String value) {
            addCriterion("I_IS_DEDU =", value, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduNotEqualTo(String value) {
            addCriterion("I_IS_DEDU <>", value, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduGreaterThan(String value) {
            addCriterion("I_IS_DEDU >", value, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduGreaterThanOrEqualTo(String value) {
            addCriterion("I_IS_DEDU >=", value, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduLessThan(String value) {
            addCriterion("I_IS_DEDU <", value, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduLessThanOrEqualTo(String value) {
            addCriterion("I_IS_DEDU <=", value, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduLike(String value) {
            addCriterion("I_IS_DEDU like", value, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduNotLike(String value) {
            addCriterion("I_IS_DEDU not like", value, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduIn(List<String> values) {
            addCriterion("I_IS_DEDU in", values, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduNotIn(List<String> values) {
            addCriterion("I_IS_DEDU not in", values, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduBetween(String value1, String value2) {
            addCriterion("I_IS_DEDU between", value1, value2, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIIsDeduNotBetween(String value1, String value2) {
            addCriterion("I_IS_DEDU not between", value1, value2, "iIsDedu");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeIsNull() {
            addCriterion("I_DEDU_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeIsNotNull() {
            addCriterion("I_DEDU_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeEqualTo(String value) {
            addCriterion("I_DEDU_TYPE =", value, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeNotEqualTo(String value) {
            addCriterion("I_DEDU_TYPE <>", value, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeGreaterThan(String value) {
            addCriterion("I_DEDU_TYPE >", value, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeGreaterThanOrEqualTo(String value) {
            addCriterion("I_DEDU_TYPE >=", value, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeLessThan(String value) {
            addCriterion("I_DEDU_TYPE <", value, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeLessThanOrEqualTo(String value) {
            addCriterion("I_DEDU_TYPE <=", value, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeLike(String value) {
            addCriterion("I_DEDU_TYPE like", value, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeNotLike(String value) {
            addCriterion("I_DEDU_TYPE not like", value, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeIn(List<String> values) {
            addCriterion("I_DEDU_TYPE in", values, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeNotIn(List<String> values) {
            addCriterion("I_DEDU_TYPE not in", values, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeBetween(String value1, String value2) {
            addCriterion("I_DEDU_TYPE between", value1, value2, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andIDeduTypeNotBetween(String value1, String value2) {
            addCriterion("I_DEDU_TYPE not between", value1, value2, "iDeduType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeIsNull() {
            addCriterion("O_REQ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOReqTypeIsNotNull() {
            addCriterion("O_REQ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOReqTypeEqualTo(String value) {
            addCriterion("O_REQ_TYPE =", value, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeNotEqualTo(String value) {
            addCriterion("O_REQ_TYPE <>", value, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeGreaterThan(String value) {
            addCriterion("O_REQ_TYPE >", value, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeGreaterThanOrEqualTo(String value) {
            addCriterion("O_REQ_TYPE >=", value, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeLessThan(String value) {
            addCriterion("O_REQ_TYPE <", value, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeLessThanOrEqualTo(String value) {
            addCriterion("O_REQ_TYPE <=", value, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeLike(String value) {
            addCriterion("O_REQ_TYPE like", value, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeNotLike(String value) {
            addCriterion("O_REQ_TYPE not like", value, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeIn(List<String> values) {
            addCriterion("O_REQ_TYPE in", values, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeNotIn(List<String> values) {
            addCriterion("O_REQ_TYPE not in", values, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeBetween(String value1, String value2) {
            addCriterion("O_REQ_TYPE between", value1, value2, "oReqType");
            return (Criteria) this;
        }

        public Criteria andOReqTypeNotBetween(String value1, String value2) {
            addCriterion("O_REQ_TYPE not between", value1, value2, "oReqType");
            return (Criteria) this;
        }

        public Criteria andReqRemarksIsNull() {
            addCriterion("REQ_REMARKS is null");
            return (Criteria) this;
        }

        public Criteria andReqRemarksIsNotNull() {
            addCriterion("REQ_REMARKS is not null");
            return (Criteria) this;
        }

        public Criteria andReqRemarksEqualTo(String value) {
            addCriterion("REQ_REMARKS =", value, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksNotEqualTo(String value) {
            addCriterion("REQ_REMARKS <>", value, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksGreaterThan(String value) {
            addCriterion("REQ_REMARKS >", value, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_REMARKS >=", value, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksLessThan(String value) {
            addCriterion("REQ_REMARKS <", value, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksLessThanOrEqualTo(String value) {
            addCriterion("REQ_REMARKS <=", value, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksLike(String value) {
            addCriterion("REQ_REMARKS like", value, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksNotLike(String value) {
            addCriterion("REQ_REMARKS not like", value, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksIn(List<String> values) {
            addCriterion("REQ_REMARKS in", values, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksNotIn(List<String> values) {
            addCriterion("REQ_REMARKS not in", values, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksBetween(String value1, String value2) {
            addCriterion("REQ_REMARKS between", value1, value2, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqRemarksNotBetween(String value1, String value2) {
            addCriterion("REQ_REMARKS not between", value1, value2, "reqRemarks");
            return (Criteria) this;
        }

        public Criteria andReqStatusIsNull() {
            addCriterion("REQ_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReqStatusIsNotNull() {
            addCriterion("REQ_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReqStatusEqualTo(String value) {
            addCriterion("REQ_STATUS =", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusNotEqualTo(String value) {
            addCriterion("REQ_STATUS <>", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusGreaterThan(String value) {
            addCriterion("REQ_STATUS >", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_STATUS >=", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusLessThan(String value) {
            addCriterion("REQ_STATUS <", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusLessThanOrEqualTo(String value) {
            addCriterion("REQ_STATUS <=", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusLike(String value) {
            addCriterion("REQ_STATUS like", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusNotLike(String value) {
            addCriterion("REQ_STATUS not like", value, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusIn(List<String> values) {
            addCriterion("REQ_STATUS in", values, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusNotIn(List<String> values) {
            addCriterion("REQ_STATUS not in", values, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusBetween(String value1, String value2) {
            addCriterion("REQ_STATUS between", value1, value2, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqStatusNotBetween(String value1, String value2) {
            addCriterion("REQ_STATUS not between", value1, value2, "reqStatus");
            return (Criteria) this;
        }

        public Criteria andReqRjDescIsNull() {
            addCriterion("REQ_RJ_DESC is null");
            return (Criteria) this;
        }

        public Criteria andReqRjDescIsNotNull() {
            addCriterion("REQ_RJ_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andReqRjDescEqualTo(String value) {
            addCriterion("REQ_RJ_DESC =", value, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescNotEqualTo(String value) {
            addCriterion("REQ_RJ_DESC <>", value, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescGreaterThan(String value) {
            addCriterion("REQ_RJ_DESC >", value, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_RJ_DESC >=", value, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescLessThan(String value) {
            addCriterion("REQ_RJ_DESC <", value, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescLessThanOrEqualTo(String value) {
            addCriterion("REQ_RJ_DESC <=", value, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescLike(String value) {
            addCriterion("REQ_RJ_DESC like", value, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescNotLike(String value) {
            addCriterion("REQ_RJ_DESC not like", value, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescIn(List<String> values) {
            addCriterion("REQ_RJ_DESC in", values, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescNotIn(List<String> values) {
            addCriterion("REQ_RJ_DESC not in", values, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescBetween(String value1, String value2) {
            addCriterion("REQ_RJ_DESC between", value1, value2, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andReqRjDescNotBetween(String value1, String value2) {
            addCriterion("REQ_RJ_DESC not between", value1, value2, "reqRjDesc");
            return (Criteria) this;
        }

        public Criteria andRspNoIsNull() {
            addCriterion("RSP_NO is null");
            return (Criteria) this;
        }

        public Criteria andRspNoIsNotNull() {
            addCriterion("RSP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRspNoEqualTo(String value) {
            addCriterion("RSP_NO =", value, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoNotEqualTo(String value) {
            addCriterion("RSP_NO <>", value, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoGreaterThan(String value) {
            addCriterion("RSP_NO >", value, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoGreaterThanOrEqualTo(String value) {
            addCriterion("RSP_NO >=", value, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoLessThan(String value) {
            addCriterion("RSP_NO <", value, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoLessThanOrEqualTo(String value) {
            addCriterion("RSP_NO <=", value, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoLike(String value) {
            addCriterion("RSP_NO like", value, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoNotLike(String value) {
            addCriterion("RSP_NO not like", value, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoIn(List<String> values) {
            addCriterion("RSP_NO in", values, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoNotIn(List<String> values) {
            addCriterion("RSP_NO not in", values, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoBetween(String value1, String value2) {
            addCriterion("RSP_NO between", value1, value2, "rspNo");
            return (Criteria) this;
        }

        public Criteria andRspNoNotBetween(String value1, String value2) {
            addCriterion("RSP_NO not between", value1, value2, "rspNo");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIsNull() {
            addCriterion("CHECK_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIsNotNull() {
            addCriterion("CHECK_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andCheckFlagEqualTo(String value) {
            addCriterion("CHECK_FLAG =", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotEqualTo(String value) {
            addCriterion("CHECK_FLAG <>", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagGreaterThan(String value) {
            addCriterion("CHECK_FLAG >", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_FLAG >=", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLessThan(String value) {
            addCriterion("CHECK_FLAG <", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLessThanOrEqualTo(String value) {
            addCriterion("CHECK_FLAG <=", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagLike(String value) {
            addCriterion("CHECK_FLAG like", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotLike(String value) {
            addCriterion("CHECK_FLAG not like", value, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagIn(List<String> values) {
            addCriterion("CHECK_FLAG in", values, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotIn(List<String> values) {
            addCriterion("CHECK_FLAG not in", values, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagBetween(String value1, String value2) {
            addCriterion("CHECK_FLAG between", value1, value2, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckFlagNotBetween(String value1, String value2) {
            addCriterion("CHECK_FLAG not between", value1, value2, "checkFlag");
            return (Criteria) this;
        }

        public Criteria andCheckDescIsNull() {
            addCriterion("CHECK_DESC is null");
            return (Criteria) this;
        }

        public Criteria andCheckDescIsNotNull() {
            addCriterion("CHECK_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDescEqualTo(String value) {
            addCriterion("CHECK_DESC =", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotEqualTo(String value) {
            addCriterion("CHECK_DESC <>", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescGreaterThan(String value) {
            addCriterion("CHECK_DESC >", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_DESC >=", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescLessThan(String value) {
            addCriterion("CHECK_DESC <", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescLessThanOrEqualTo(String value) {
            addCriterion("CHECK_DESC <=", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescLike(String value) {
            addCriterion("CHECK_DESC like", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotLike(String value) {
            addCriterion("CHECK_DESC not like", value, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescIn(List<String> values) {
            addCriterion("CHECK_DESC in", values, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotIn(List<String> values) {
            addCriterion("CHECK_DESC not in", values, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescBetween(String value1, String value2) {
            addCriterion("CHECK_DESC between", value1, value2, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andCheckDescNotBetween(String value1, String value2) {
            addCriterion("CHECK_DESC not between", value1, value2, "checkDesc");
            return (Criteria) this;
        }

        public Criteria andNextActionIsNull() {
            addCriterion("NEXT_ACTION is null");
            return (Criteria) this;
        }

        public Criteria andNextActionIsNotNull() {
            addCriterion("NEXT_ACTION is not null");
            return (Criteria) this;
        }

        public Criteria andNextActionEqualTo(String value) {
            addCriterion("NEXT_ACTION =", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionNotEqualTo(String value) {
            addCriterion("NEXT_ACTION <>", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionGreaterThan(String value) {
            addCriterion("NEXT_ACTION >", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_ACTION >=", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionLessThan(String value) {
            addCriterion("NEXT_ACTION <", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionLessThanOrEqualTo(String value) {
            addCriterion("NEXT_ACTION <=", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionLike(String value) {
            addCriterion("NEXT_ACTION like", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionNotLike(String value) {
            addCriterion("NEXT_ACTION not like", value, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionIn(List<String> values) {
            addCriterion("NEXT_ACTION in", values, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionNotIn(List<String> values) {
            addCriterion("NEXT_ACTION not in", values, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionBetween(String value1, String value2) {
            addCriterion("NEXT_ACTION between", value1, value2, "nextAction");
            return (Criteria) this;
        }

        public Criteria andNextActionNotBetween(String value1, String value2) {
            addCriterion("NEXT_ACTION not between", value1, value2, "nextAction");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNull() {
            addCriterion("DATA_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andDataStatusIsNotNull() {
            addCriterion("DATA_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andDataStatusEqualTo(String value) {
            addCriterion("DATA_STATUS =", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotEqualTo(String value) {
            addCriterion("DATA_STATUS <>", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThan(String value) {
            addCriterion("DATA_STATUS >", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_STATUS >=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThan(String value) {
            addCriterion("DATA_STATUS <", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLessThanOrEqualTo(String value) {
            addCriterion("DATA_STATUS <=", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusLike(String value) {
            addCriterion("DATA_STATUS like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotLike(String value) {
            addCriterion("DATA_STATUS not like", value, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusIn(List<String> values) {
            addCriterion("DATA_STATUS in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotIn(List<String> values) {
            addCriterion("DATA_STATUS not in", values, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusBetween(String value1, String value2) {
            addCriterion("DATA_STATUS between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataStatusNotBetween(String value1, String value2) {
            addCriterion("DATA_STATUS not between", value1, value2, "dataStatus");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNull() {
            addCriterion("DATA_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDataFlagIsNotNull() {
            addCriterion("DATA_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDataFlagEqualTo(String value) {
            addCriterion("DATA_FLAG =", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotEqualTo(String value) {
            addCriterion("DATA_FLAG <>", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThan(String value) {
            addCriterion("DATA_FLAG >", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_FLAG >=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThan(String value) {
            addCriterion("DATA_FLAG <", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLessThanOrEqualTo(String value) {
            addCriterion("DATA_FLAG <=", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagLike(String value) {
            addCriterion("DATA_FLAG like", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotLike(String value) {
            addCriterion("DATA_FLAG not like", value, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagIn(List<String> values) {
            addCriterion("DATA_FLAG in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotIn(List<String> values) {
            addCriterion("DATA_FLAG not in", values, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagBetween(String value1, String value2) {
            addCriterion("DATA_FLAG between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataFlagNotBetween(String value1, String value2) {
            addCriterion("DATA_FLAG not between", value1, value2, "dataFlag");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNull() {
            addCriterion("DATA_SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIsNotNull() {
            addCriterion("DATA_SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceEqualTo(String value) {
            addCriterion("DATA_SOURCE =", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotEqualTo(String value) {
            addCriterion("DATA_SOURCE <>", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThan(String value) {
            addCriterion("DATA_SOURCE >", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE >=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThan(String value) {
            addCriterion("DATA_SOURCE <", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLessThanOrEqualTo(String value) {
            addCriterion("DATA_SOURCE <=", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceLike(String value) {
            addCriterion("DATA_SOURCE like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotLike(String value) {
            addCriterion("DATA_SOURCE not like", value, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceIn(List<String> values) {
            addCriterion("DATA_SOURCE in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotIn(List<String> values) {
            addCriterion("DATA_SOURCE not in", values, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataSourceNotBetween(String value1, String value2) {
            addCriterion("DATA_SOURCE not between", value1, value2, "dataSource");
            return (Criteria) this;
        }

        public Criteria andDataVersionIsNull() {
            addCriterion("DATA_VERSION is null");
            return (Criteria) this;
        }

        public Criteria andDataVersionIsNotNull() {
            addCriterion("DATA_VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andDataVersionEqualTo(BigDecimal value) {
            addCriterion("DATA_VERSION =", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotEqualTo(BigDecimal value) {
            addCriterion("DATA_VERSION <>", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionGreaterThan(BigDecimal value) {
            addCriterion("DATA_VERSION >", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DATA_VERSION >=", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionLessThan(BigDecimal value) {
            addCriterion("DATA_VERSION <", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DATA_VERSION <=", value, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionIn(List<BigDecimal> values) {
            addCriterion("DATA_VERSION in", values, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotIn(List<BigDecimal> values) {
            addCriterion("DATA_VERSION not in", values, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATA_VERSION between", value1, value2, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataVersionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATA_VERSION not between", value1, value2, "dataVersion");
            return (Criteria) this;
        }

        public Criteria andDataRejDescIsNull() {
            addCriterion("DATA_REJ_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDataRejDescIsNotNull() {
            addCriterion("DATA_REJ_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDataRejDescEqualTo(String value) {
            addCriterion("DATA_REJ_DESC =", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescNotEqualTo(String value) {
            addCriterion("DATA_REJ_DESC <>", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescGreaterThan(String value) {
            addCriterion("DATA_REJ_DESC >", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_REJ_DESC >=", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescLessThan(String value) {
            addCriterion("DATA_REJ_DESC <", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescLessThanOrEqualTo(String value) {
            addCriterion("DATA_REJ_DESC <=", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescLike(String value) {
            addCriterion("DATA_REJ_DESC like", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescNotLike(String value) {
            addCriterion("DATA_REJ_DESC not like", value, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescIn(List<String> values) {
            addCriterion("DATA_REJ_DESC in", values, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescNotIn(List<String> values) {
            addCriterion("DATA_REJ_DESC not in", values, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescBetween(String value1, String value2) {
            addCriterion("DATA_REJ_DESC between", value1, value2, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataRejDescNotBetween(String value1, String value2) {
            addCriterion("DATA_REJ_DESC not between", value1, value2, "dataRejDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescIsNull() {
            addCriterion("DATA_DEL_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDataDelDescIsNotNull() {
            addCriterion("DATA_DEL_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDataDelDescEqualTo(String value) {
            addCriterion("DATA_DEL_DESC =", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescNotEqualTo(String value) {
            addCriterion("DATA_DEL_DESC <>", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescGreaterThan(String value) {
            addCriterion("DATA_DEL_DESC >", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_DEL_DESC >=", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescLessThan(String value) {
            addCriterion("DATA_DEL_DESC <", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescLessThanOrEqualTo(String value) {
            addCriterion("DATA_DEL_DESC <=", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescLike(String value) {
            addCriterion("DATA_DEL_DESC like", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescNotLike(String value) {
            addCriterion("DATA_DEL_DESC not like", value, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescIn(List<String> values) {
            addCriterion("DATA_DEL_DESC in", values, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescNotIn(List<String> values) {
            addCriterion("DATA_DEL_DESC not in", values, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescBetween(String value1, String value2) {
            addCriterion("DATA_DEL_DESC between", value1, value2, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataDelDescNotBetween(String value1, String value2) {
            addCriterion("DATA_DEL_DESC not between", value1, value2, "dataDelDesc");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserIsNull() {
            addCriterion("DATA_CRT_USER is null");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserIsNotNull() {
            addCriterion("DATA_CRT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserEqualTo(String value) {
            addCriterion("DATA_CRT_USER =", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserNotEqualTo(String value) {
            addCriterion("DATA_CRT_USER <>", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserGreaterThan(String value) {
            addCriterion("DATA_CRT_USER >", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_USER >=", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserLessThan(String value) {
            addCriterion("DATA_CRT_USER <", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserLessThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_USER <=", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserLike(String value) {
            addCriterion("DATA_CRT_USER like", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserNotLike(String value) {
            addCriterion("DATA_CRT_USER not like", value, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserIn(List<String> values) {
            addCriterion("DATA_CRT_USER in", values, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserNotIn(List<String> values) {
            addCriterion("DATA_CRT_USER not in", values, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserBetween(String value1, String value2) {
            addCriterion("DATA_CRT_USER between", value1, value2, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtUserNotBetween(String value1, String value2) {
            addCriterion("DATA_CRT_USER not between", value1, value2, "dataCrtUser");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateIsNull() {
            addCriterion("DATA_CRT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateIsNotNull() {
            addCriterion("DATA_CRT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateEqualTo(String value) {
            addCriterion("DATA_CRT_DATE =", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateNotEqualTo(String value) {
            addCriterion("DATA_CRT_DATE <>", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateGreaterThan(String value) {
            addCriterion("DATA_CRT_DATE >", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_DATE >=", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateLessThan(String value) {
            addCriterion("DATA_CRT_DATE <", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateLessThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_DATE <=", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateLike(String value) {
            addCriterion("DATA_CRT_DATE like", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateNotLike(String value) {
            addCriterion("DATA_CRT_DATE not like", value, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateIn(List<String> values) {
            addCriterion("DATA_CRT_DATE in", values, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateNotIn(List<String> values) {
            addCriterion("DATA_CRT_DATE not in", values, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateBetween(String value1, String value2) {
            addCriterion("DATA_CRT_DATE between", value1, value2, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtDateNotBetween(String value1, String value2) {
            addCriterion("DATA_CRT_DATE not between", value1, value2, "dataCrtDate");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeIsNull() {
            addCriterion("DATA_CRT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeIsNotNull() {
            addCriterion("DATA_CRT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeEqualTo(String value) {
            addCriterion("DATA_CRT_TIME =", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeNotEqualTo(String value) {
            addCriterion("DATA_CRT_TIME <>", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeGreaterThan(String value) {
            addCriterion("DATA_CRT_TIME >", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_TIME >=", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeLessThan(String value) {
            addCriterion("DATA_CRT_TIME <", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeLessThanOrEqualTo(String value) {
            addCriterion("DATA_CRT_TIME <=", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeLike(String value) {
            addCriterion("DATA_CRT_TIME like", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeNotLike(String value) {
            addCriterion("DATA_CRT_TIME not like", value, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeIn(List<String> values) {
            addCriterion("DATA_CRT_TIME in", values, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeNotIn(List<String> values) {
            addCriterion("DATA_CRT_TIME not in", values, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeBetween(String value1, String value2) {
            addCriterion("DATA_CRT_TIME between", value1, value2, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataCrtTimeNotBetween(String value1, String value2) {
            addCriterion("DATA_CRT_TIME not between", value1, value2, "dataCrtTime");
            return (Criteria) this;
        }

        public Criteria andDataChgUserIsNull() {
            addCriterion("DATA_CHG_USER is null");
            return (Criteria) this;
        }

        public Criteria andDataChgUserIsNotNull() {
            addCriterion("DATA_CHG_USER is not null");
            return (Criteria) this;
        }

        public Criteria andDataChgUserEqualTo(String value) {
            addCriterion("DATA_CHG_USER =", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserNotEqualTo(String value) {
            addCriterion("DATA_CHG_USER <>", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserGreaterThan(String value) {
            addCriterion("DATA_CHG_USER >", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_USER >=", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserLessThan(String value) {
            addCriterion("DATA_CHG_USER <", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserLessThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_USER <=", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserLike(String value) {
            addCriterion("DATA_CHG_USER like", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserNotLike(String value) {
            addCriterion("DATA_CHG_USER not like", value, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserIn(List<String> values) {
            addCriterion("DATA_CHG_USER in", values, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserNotIn(List<String> values) {
            addCriterion("DATA_CHG_USER not in", values, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserBetween(String value1, String value2) {
            addCriterion("DATA_CHG_USER between", value1, value2, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgUserNotBetween(String value1, String value2) {
            addCriterion("DATA_CHG_USER not between", value1, value2, "dataChgUser");
            return (Criteria) this;
        }

        public Criteria andDataChgDateIsNull() {
            addCriterion("DATA_CHG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDataChgDateIsNotNull() {
            addCriterion("DATA_CHG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDataChgDateEqualTo(String value) {
            addCriterion("DATA_CHG_DATE =", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateNotEqualTo(String value) {
            addCriterion("DATA_CHG_DATE <>", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateGreaterThan(String value) {
            addCriterion("DATA_CHG_DATE >", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_DATE >=", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateLessThan(String value) {
            addCriterion("DATA_CHG_DATE <", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateLessThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_DATE <=", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateLike(String value) {
            addCriterion("DATA_CHG_DATE like", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateNotLike(String value) {
            addCriterion("DATA_CHG_DATE not like", value, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateIn(List<String> values) {
            addCriterion("DATA_CHG_DATE in", values, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateNotIn(List<String> values) {
            addCriterion("DATA_CHG_DATE not in", values, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateBetween(String value1, String value2) {
            addCriterion("DATA_CHG_DATE between", value1, value2, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgDateNotBetween(String value1, String value2) {
            addCriterion("DATA_CHG_DATE not between", value1, value2, "dataChgDate");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeIsNull() {
            addCriterion("DATA_CHG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeIsNotNull() {
            addCriterion("DATA_CHG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeEqualTo(String value) {
            addCriterion("DATA_CHG_TIME =", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeNotEqualTo(String value) {
            addCriterion("DATA_CHG_TIME <>", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeGreaterThan(String value) {
            addCriterion("DATA_CHG_TIME >", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_TIME >=", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeLessThan(String value) {
            addCriterion("DATA_CHG_TIME <", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeLessThanOrEqualTo(String value) {
            addCriterion("DATA_CHG_TIME <=", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeLike(String value) {
            addCriterion("DATA_CHG_TIME like", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeNotLike(String value) {
            addCriterion("DATA_CHG_TIME not like", value, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeIn(List<String> values) {
            addCriterion("DATA_CHG_TIME in", values, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeNotIn(List<String> values) {
            addCriterion("DATA_CHG_TIME not in", values, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeBetween(String value1, String value2) {
            addCriterion("DATA_CHG_TIME between", value1, value2, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataChgTimeNotBetween(String value1, String value2) {
            addCriterion("DATA_CHG_TIME not between", value1, value2, "dataChgTime");
            return (Criteria) this;
        }

        public Criteria andDataApvUserIsNull() {
            addCriterion("DATA_APV_USER is null");
            return (Criteria) this;
        }

        public Criteria andDataApvUserIsNotNull() {
            addCriterion("DATA_APV_USER is not null");
            return (Criteria) this;
        }

        public Criteria andDataApvUserEqualTo(String value) {
            addCriterion("DATA_APV_USER =", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserNotEqualTo(String value) {
            addCriterion("DATA_APV_USER <>", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserGreaterThan(String value) {
            addCriterion("DATA_APV_USER >", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_APV_USER >=", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserLessThan(String value) {
            addCriterion("DATA_APV_USER <", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserLessThanOrEqualTo(String value) {
            addCriterion("DATA_APV_USER <=", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserLike(String value) {
            addCriterion("DATA_APV_USER like", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserNotLike(String value) {
            addCriterion("DATA_APV_USER not like", value, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserIn(List<String> values) {
            addCriterion("DATA_APV_USER in", values, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserNotIn(List<String> values) {
            addCriterion("DATA_APV_USER not in", values, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserBetween(String value1, String value2) {
            addCriterion("DATA_APV_USER between", value1, value2, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvUserNotBetween(String value1, String value2) {
            addCriterion("DATA_APV_USER not between", value1, value2, "dataApvUser");
            return (Criteria) this;
        }

        public Criteria andDataApvDateIsNull() {
            addCriterion("DATA_APV_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDataApvDateIsNotNull() {
            addCriterion("DATA_APV_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDataApvDateEqualTo(String value) {
            addCriterion("DATA_APV_DATE =", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateNotEqualTo(String value) {
            addCriterion("DATA_APV_DATE <>", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateGreaterThan(String value) {
            addCriterion("DATA_APV_DATE >", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_APV_DATE >=", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateLessThan(String value) {
            addCriterion("DATA_APV_DATE <", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateLessThanOrEqualTo(String value) {
            addCriterion("DATA_APV_DATE <=", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateLike(String value) {
            addCriterion("DATA_APV_DATE like", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateNotLike(String value) {
            addCriterion("DATA_APV_DATE not like", value, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateIn(List<String> values) {
            addCriterion("DATA_APV_DATE in", values, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateNotIn(List<String> values) {
            addCriterion("DATA_APV_DATE not in", values, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateBetween(String value1, String value2) {
            addCriterion("DATA_APV_DATE between", value1, value2, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvDateNotBetween(String value1, String value2) {
            addCriterion("DATA_APV_DATE not between", value1, value2, "dataApvDate");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeIsNull() {
            addCriterion("DATA_APV_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeIsNotNull() {
            addCriterion("DATA_APV_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeEqualTo(String value) {
            addCriterion("DATA_APV_TIME =", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeNotEqualTo(String value) {
            addCriterion("DATA_APV_TIME <>", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeGreaterThan(String value) {
            addCriterion("DATA_APV_TIME >", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_APV_TIME >=", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeLessThan(String value) {
            addCriterion("DATA_APV_TIME <", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeLessThanOrEqualTo(String value) {
            addCriterion("DATA_APV_TIME <=", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeLike(String value) {
            addCriterion("DATA_APV_TIME like", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeNotLike(String value) {
            addCriterion("DATA_APV_TIME not like", value, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeIn(List<String> values) {
            addCriterion("DATA_APV_TIME in", values, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeNotIn(List<String> values) {
            addCriterion("DATA_APV_TIME not in", values, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeBetween(String value1, String value2) {
            addCriterion("DATA_APV_TIME between", value1, value2, "dataApvTime");
            return (Criteria) this;
        }

        public Criteria andDataApvTimeNotBetween(String value1, String value2) {
            addCriterion("DATA_APV_TIME not between", value1, value2, "dataApvTime");
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