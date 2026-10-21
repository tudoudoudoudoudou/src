package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OdsVatIVocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsVatIVocExample() {
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

        public Criteria andVocCodeIsNull() {
            addCriterion("VOC_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVocCodeIsNotNull() {
            addCriterion("VOC_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVocCodeEqualTo(String value) {
            addCriterion("VOC_CODE =", value, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeNotEqualTo(String value) {
            addCriterion("VOC_CODE <>", value, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeGreaterThan(String value) {
            addCriterion("VOC_CODE >", value, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_CODE >=", value, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeLessThan(String value) {
            addCriterion("VOC_CODE <", value, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeLessThanOrEqualTo(String value) {
            addCriterion("VOC_CODE <=", value, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeLike(String value) {
            addCriterion("VOC_CODE like", value, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeNotLike(String value) {
            addCriterion("VOC_CODE not like", value, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeIn(List<String> values) {
            addCriterion("VOC_CODE in", values, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeNotIn(List<String> values) {
            addCriterion("VOC_CODE not in", values, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeBetween(String value1, String value2) {
            addCriterion("VOC_CODE between", value1, value2, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocCodeNotBetween(String value1, String value2) {
            addCriterion("VOC_CODE not between", value1, value2, "vocCode");
            return (Criteria) this;
        }

        public Criteria andVocNoIsNull() {
            addCriterion("VOC_NO is null");
            return (Criteria) this;
        }

        public Criteria andVocNoIsNotNull() {
            addCriterion("VOC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVocNoEqualTo(String value) {
            addCriterion("VOC_NO =", value, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoNotEqualTo(String value) {
            addCriterion("VOC_NO <>", value, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoGreaterThan(String value) {
            addCriterion("VOC_NO >", value, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_NO >=", value, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoLessThan(String value) {
            addCriterion("VOC_NO <", value, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoLessThanOrEqualTo(String value) {
            addCriterion("VOC_NO <=", value, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoLike(String value) {
            addCriterion("VOC_NO like", value, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoNotLike(String value) {
            addCriterion("VOC_NO not like", value, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoIn(List<String> values) {
            addCriterion("VOC_NO in", values, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoNotIn(List<String> values) {
            addCriterion("VOC_NO not in", values, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoBetween(String value1, String value2) {
            addCriterion("VOC_NO between", value1, value2, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocNoNotBetween(String value1, String value2) {
            addCriterion("VOC_NO not between", value1, value2, "vocNo");
            return (Criteria) this;
        }

        public Criteria andVocDateIsNull() {
            addCriterion("VOC_DATE is null");
            return (Criteria) this;
        }

        public Criteria andVocDateIsNotNull() {
            addCriterion("VOC_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andVocDateEqualTo(String value) {
            addCriterion("VOC_DATE =", value, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateNotEqualTo(String value) {
            addCriterion("VOC_DATE <>", value, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateGreaterThan(String value) {
            addCriterion("VOC_DATE >", value, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_DATE >=", value, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateLessThan(String value) {
            addCriterion("VOC_DATE <", value, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateLessThanOrEqualTo(String value) {
            addCriterion("VOC_DATE <=", value, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateLike(String value) {
            addCriterion("VOC_DATE like", value, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateNotLike(String value) {
            addCriterion("VOC_DATE not like", value, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateIn(List<String> values) {
            addCriterion("VOC_DATE in", values, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateNotIn(List<String> values) {
            addCriterion("VOC_DATE not in", values, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateBetween(String value1, String value2) {
            addCriterion("VOC_DATE between", value1, value2, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocDateNotBetween(String value1, String value2) {
            addCriterion("VOC_DATE not between", value1, value2, "vocDate");
            return (Criteria) this;
        }

        public Criteria andVocMacIsNull() {
            addCriterion("VOC_MAC is null");
            return (Criteria) this;
        }

        public Criteria andVocMacIsNotNull() {
            addCriterion("VOC_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andVocMacEqualTo(String value) {
            addCriterion("VOC_MAC =", value, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacNotEqualTo(String value) {
            addCriterion("VOC_MAC <>", value, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacGreaterThan(String value) {
            addCriterion("VOC_MAC >", value, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_MAC >=", value, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacLessThan(String value) {
            addCriterion("VOC_MAC <", value, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacLessThanOrEqualTo(String value) {
            addCriterion("VOC_MAC <=", value, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacLike(String value) {
            addCriterion("VOC_MAC like", value, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacNotLike(String value) {
            addCriterion("VOC_MAC not like", value, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacIn(List<String> values) {
            addCriterion("VOC_MAC in", values, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacNotIn(List<String> values) {
            addCriterion("VOC_MAC not in", values, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacBetween(String value1, String value2) {
            addCriterion("VOC_MAC between", value1, value2, "vocMac");
            return (Criteria) this;
        }

        public Criteria andVocMacNotBetween(String value1, String value2) {
            addCriterion("VOC_MAC not between", value1, value2, "vocMac");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNull() {
            addCriterion("CUST_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustNoIsNotNull() {
            addCriterion("CUST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustNoEqualTo(String value) {
            addCriterion("CUST_NO =", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotEqualTo(String value) {
            addCriterion("CUST_NO <>", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThan(String value) {
            addCriterion("CUST_NO >", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NO >=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThan(String value) {
            addCriterion("CUST_NO <", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_NO <=", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoLike(String value) {
            addCriterion("CUST_NO like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotLike(String value) {
            addCriterion("CUST_NO not like", value, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoIn(List<String> values) {
            addCriterion("CUST_NO in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotIn(List<String> values) {
            addCriterion("CUST_NO not in", values, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoBetween(String value1, String value2) {
            addCriterion("CUST_NO between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andCustNoNotBetween(String value1, String value2) {
            addCriterion("CUST_NO not between", value1, value2, "custNo");
            return (Criteria) this;
        }

        public Criteria andBuyNameIsNull() {
            addCriterion("BUY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBuyNameIsNotNull() {
            addCriterion("BUY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBuyNameEqualTo(String value) {
            addCriterion("BUY_NAME =", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotEqualTo(String value) {
            addCriterion("BUY_NAME <>", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameGreaterThan(String value) {
            addCriterion("BUY_NAME >", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_NAME >=", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameLessThan(String value) {
            addCriterion("BUY_NAME <", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameLessThanOrEqualTo(String value) {
            addCriterion("BUY_NAME <=", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameLike(String value) {
            addCriterion("BUY_NAME like", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotLike(String value) {
            addCriterion("BUY_NAME not like", value, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameIn(List<String> values) {
            addCriterion("BUY_NAME in", values, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotIn(List<String> values) {
            addCriterion("BUY_NAME not in", values, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameBetween(String value1, String value2) {
            addCriterion("BUY_NAME between", value1, value2, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyNameNotBetween(String value1, String value2) {
            addCriterion("BUY_NAME not between", value1, value2, "buyName");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoIsNull() {
            addCriterion("BUY_TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoIsNotNull() {
            addCriterion("BUY_TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoEqualTo(String value) {
            addCriterion("BUY_TAX_NO =", value, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoNotEqualTo(String value) {
            addCriterion("BUY_TAX_NO <>", value, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoGreaterThan(String value) {
            addCriterion("BUY_TAX_NO >", value, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("BUY_TAX_NO >=", value, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoLessThan(String value) {
            addCriterion("BUY_TAX_NO <", value, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoLessThanOrEqualTo(String value) {
            addCriterion("BUY_TAX_NO <=", value, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoLike(String value) {
            addCriterion("BUY_TAX_NO like", value, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoNotLike(String value) {
            addCriterion("BUY_TAX_NO not like", value, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoIn(List<String> values) {
            addCriterion("BUY_TAX_NO in", values, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoNotIn(List<String> values) {
            addCriterion("BUY_TAX_NO not in", values, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoBetween(String value1, String value2) {
            addCriterion("BUY_TAX_NO between", value1, value2, "buyTaxNo");
            return (Criteria) this;
        }

        public Criteria andBuyTaxNoNotBetween(String value1, String value2) {
            addCriterion("BUY_TAX_NO not between", value1, value2, "buyTaxNo");
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

        public Criteria andScanUserIsNull() {
            addCriterion("SCAN_USER is null");
            return (Criteria) this;
        }

        public Criteria andScanUserIsNotNull() {
            addCriterion("SCAN_USER is not null");
            return (Criteria) this;
        }

        public Criteria andScanUserEqualTo(String value) {
            addCriterion("SCAN_USER =", value, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserNotEqualTo(String value) {
            addCriterion("SCAN_USER <>", value, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserGreaterThan(String value) {
            addCriterion("SCAN_USER >", value, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN_USER >=", value, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserLessThan(String value) {
            addCriterion("SCAN_USER <", value, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserLessThanOrEqualTo(String value) {
            addCriterion("SCAN_USER <=", value, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserLike(String value) {
            addCriterion("SCAN_USER like", value, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserNotLike(String value) {
            addCriterion("SCAN_USER not like", value, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserIn(List<String> values) {
            addCriterion("SCAN_USER in", values, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserNotIn(List<String> values) {
            addCriterion("SCAN_USER not in", values, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserBetween(String value1, String value2) {
            addCriterion("SCAN_USER between", value1, value2, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanUserNotBetween(String value1, String value2) {
            addCriterion("SCAN_USER not between", value1, value2, "scanUser");
            return (Criteria) this;
        }

        public Criteria andScanDateIsNull() {
            addCriterion("SCAN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andScanDateIsNotNull() {
            addCriterion("SCAN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andScanDateEqualTo(String value) {
            addCriterion("SCAN_DATE =", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotEqualTo(String value) {
            addCriterion("SCAN_DATE <>", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateGreaterThan(String value) {
            addCriterion("SCAN_DATE >", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateGreaterThanOrEqualTo(String value) {
            addCriterion("SCAN_DATE >=", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLessThan(String value) {
            addCriterion("SCAN_DATE <", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLessThanOrEqualTo(String value) {
            addCriterion("SCAN_DATE <=", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateLike(String value) {
            addCriterion("SCAN_DATE like", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotLike(String value) {
            addCriterion("SCAN_DATE not like", value, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateIn(List<String> values) {
            addCriterion("SCAN_DATE in", values, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotIn(List<String> values) {
            addCriterion("SCAN_DATE not in", values, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateBetween(String value1, String value2) {
            addCriterion("SCAN_DATE between", value1, value2, "scanDate");
            return (Criteria) this;
        }

        public Criteria andScanDateNotBetween(String value1, String value2) {
            addCriterion("SCAN_DATE not between", value1, value2, "scanDate");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("IS_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("IS_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(String value) {
            addCriterion("IS_CHECK =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(String value) {
            addCriterion("IS_CHECK <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(String value) {
            addCriterion("IS_CHECK >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHECK >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(String value) {
            addCriterion("IS_CHECK <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(String value) {
            addCriterion("IS_CHECK <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLike(String value) {
            addCriterion("IS_CHECK like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotLike(String value) {
            addCriterion("IS_CHECK not like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<String> values) {
            addCriterion("IS_CHECK in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<String> values) {
            addCriterion("IS_CHECK not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(String value1, String value2) {
            addCriterion("IS_CHECK between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(String value1, String value2) {
            addCriterion("IS_CHECK not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIdentyUserIsNull() {
            addCriterion("IDENTY_USER is null");
            return (Criteria) this;
        }

        public Criteria andIdentyUserIsNotNull() {
            addCriterion("IDENTY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andIdentyUserEqualTo(String value) {
            addCriterion("IDENTY_USER =", value, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserNotEqualTo(String value) {
            addCriterion("IDENTY_USER <>", value, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserGreaterThan(String value) {
            addCriterion("IDENTY_USER >", value, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTY_USER >=", value, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserLessThan(String value) {
            addCriterion("IDENTY_USER <", value, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserLessThanOrEqualTo(String value) {
            addCriterion("IDENTY_USER <=", value, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserLike(String value) {
            addCriterion("IDENTY_USER like", value, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserNotLike(String value) {
            addCriterion("IDENTY_USER not like", value, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserIn(List<String> values) {
            addCriterion("IDENTY_USER in", values, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserNotIn(List<String> values) {
            addCriterion("IDENTY_USER not in", values, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserBetween(String value1, String value2) {
            addCriterion("IDENTY_USER between", value1, value2, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyUserNotBetween(String value1, String value2) {
            addCriterion("IDENTY_USER not between", value1, value2, "identyUser");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusIsNull() {
            addCriterion("IDENTY_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusIsNotNull() {
            addCriterion("IDENTY_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusEqualTo(String value) {
            addCriterion("IDENTY_STATUS =", value, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusNotEqualTo(String value) {
            addCriterion("IDENTY_STATUS <>", value, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusGreaterThan(String value) {
            addCriterion("IDENTY_STATUS >", value, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTY_STATUS >=", value, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusLessThan(String value) {
            addCriterion("IDENTY_STATUS <", value, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusLessThanOrEqualTo(String value) {
            addCriterion("IDENTY_STATUS <=", value, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusLike(String value) {
            addCriterion("IDENTY_STATUS like", value, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusNotLike(String value) {
            addCriterion("IDENTY_STATUS not like", value, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusIn(List<String> values) {
            addCriterion("IDENTY_STATUS in", values, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusNotIn(List<String> values) {
            addCriterion("IDENTY_STATUS not in", values, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusBetween(String value1, String value2) {
            addCriterion("IDENTY_STATUS between", value1, value2, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyStatusNotBetween(String value1, String value2) {
            addCriterion("IDENTY_STATUS not between", value1, value2, "identyStatus");
            return (Criteria) this;
        }

        public Criteria andIdentyDateIsNull() {
            addCriterion("IDENTY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIdentyDateIsNotNull() {
            addCriterion("IDENTY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentyDateEqualTo(String value) {
            addCriterion("IDENTY_DATE =", value, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateNotEqualTo(String value) {
            addCriterion("IDENTY_DATE <>", value, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateGreaterThan(String value) {
            addCriterion("IDENTY_DATE >", value, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTY_DATE >=", value, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateLessThan(String value) {
            addCriterion("IDENTY_DATE <", value, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateLessThanOrEqualTo(String value) {
            addCriterion("IDENTY_DATE <=", value, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateLike(String value) {
            addCriterion("IDENTY_DATE like", value, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateNotLike(String value) {
            addCriterion("IDENTY_DATE not like", value, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateIn(List<String> values) {
            addCriterion("IDENTY_DATE in", values, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateNotIn(List<String> values) {
            addCriterion("IDENTY_DATE not in", values, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateBetween(String value1, String value2) {
            addCriterion("IDENTY_DATE between", value1, value2, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyDateNotBetween(String value1, String value2) {
            addCriterion("IDENTY_DATE not between", value1, value2, "identyDate");
            return (Criteria) this;
        }

        public Criteria andIdentyCountIsNull() {
            addCriterion("IDENTY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andIdentyCountIsNotNull() {
            addCriterion("IDENTY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIdentyCountEqualTo(BigDecimal value) {
            addCriterion("IDENTY_COUNT =", value, "identyCount");
            return (Criteria) this;
        }

        public Criteria andIdentyCountNotEqualTo(BigDecimal value) {
            addCriterion("IDENTY_COUNT <>", value, "identyCount");
            return (Criteria) this;
        }

        public Criteria andIdentyCountGreaterThan(BigDecimal value) {
            addCriterion("IDENTY_COUNT >", value, "identyCount");
            return (Criteria) this;
        }

        public Criteria andIdentyCountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IDENTY_COUNT >=", value, "identyCount");
            return (Criteria) this;
        }

        public Criteria andIdentyCountLessThan(BigDecimal value) {
            addCriterion("IDENTY_COUNT <", value, "identyCount");
            return (Criteria) this;
        }

        public Criteria andIdentyCountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IDENTY_COUNT <=", value, "identyCount");
            return (Criteria) this;
        }

        public Criteria andIdentyCountIn(List<BigDecimal> values) {
            addCriterion("IDENTY_COUNT in", values, "identyCount");
            return (Criteria) this;
        }

        public Criteria andIdentyCountNotIn(List<BigDecimal> values) {
            addCriterion("IDENTY_COUNT not in", values, "identyCount");
            return (Criteria) this;
        }

        public Criteria andIdentyCountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDENTY_COUNT between", value1, value2, "identyCount");
            return (Criteria) this;
        }

        public Criteria andIdentyCountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IDENTY_COUNT not between", value1, value2, "identyCount");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeIsNull() {
            addCriterion("IDENTY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeIsNotNull() {
            addCriterion("IDENTY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeEqualTo(String value) {
            addCriterion("IDENTY_TYPE =", value, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeNotEqualTo(String value) {
            addCriterion("IDENTY_TYPE <>", value, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeGreaterThan(String value) {
            addCriterion("IDENTY_TYPE >", value, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTY_TYPE >=", value, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeLessThan(String value) {
            addCriterion("IDENTY_TYPE <", value, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeLessThanOrEqualTo(String value) {
            addCriterion("IDENTY_TYPE <=", value, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeLike(String value) {
            addCriterion("IDENTY_TYPE like", value, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeNotLike(String value) {
            addCriterion("IDENTY_TYPE not like", value, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeIn(List<String> values) {
            addCriterion("IDENTY_TYPE in", values, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeNotIn(List<String> values) {
            addCriterion("IDENTY_TYPE not in", values, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeBetween(String value1, String value2) {
            addCriterion("IDENTY_TYPE between", value1, value2, "identyType");
            return (Criteria) this;
        }

        public Criteria andIdentyTypeNotBetween(String value1, String value2) {
            addCriterion("IDENTY_TYPE not between", value1, value2, "identyType");
            return (Criteria) this;
        }

        public Criteria andOutAmtIsNull() {
            addCriterion("OUT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOutAmtIsNotNull() {
            addCriterion("OUT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOutAmtEqualTo(BigDecimal value) {
            addCriterion("OUT_AMT =", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotEqualTo(BigDecimal value) {
            addCriterion("OUT_AMT <>", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtGreaterThan(BigDecimal value) {
            addCriterion("OUT_AMT >", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OUT_AMT >=", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtLessThan(BigDecimal value) {
            addCriterion("OUT_AMT <", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OUT_AMT <=", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtIn(List<BigDecimal> values) {
            addCriterion("OUT_AMT in", values, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotIn(List<BigDecimal> values) {
            addCriterion("OUT_AMT not in", values, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUT_AMT between", value1, value2, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OUT_AMT not between", value1, value2, "outAmt");
            return (Criteria) this;
        }

        public Criteria andImgDirIsNull() {
            addCriterion("IMG_DIR is null");
            return (Criteria) this;
        }

        public Criteria andImgDirIsNotNull() {
            addCriterion("IMG_DIR is not null");
            return (Criteria) this;
        }

        public Criteria andImgDirEqualTo(String value) {
            addCriterion("IMG_DIR =", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirNotEqualTo(String value) {
            addCriterion("IMG_DIR <>", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirGreaterThan(String value) {
            addCriterion("IMG_DIR >", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirGreaterThanOrEqualTo(String value) {
            addCriterion("IMG_DIR >=", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirLessThan(String value) {
            addCriterion("IMG_DIR <", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirLessThanOrEqualTo(String value) {
            addCriterion("IMG_DIR <=", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirLike(String value) {
            addCriterion("IMG_DIR like", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirNotLike(String value) {
            addCriterion("IMG_DIR not like", value, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirIn(List<String> values) {
            addCriterion("IMG_DIR in", values, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirNotIn(List<String> values) {
            addCriterion("IMG_DIR not in", values, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirBetween(String value1, String value2) {
            addCriterion("IMG_DIR between", value1, value2, "imgDir");
            return (Criteria) this;
        }

        public Criteria andImgDirNotBetween(String value1, String value2) {
            addCriterion("IMG_DIR not between", value1, value2, "imgDir");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeIsNull() {
            addCriterion("CACL_TAX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeIsNotNull() {
            addCriterion("CACL_TAX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeEqualTo(String value) {
            addCriterion("CACL_TAX_TYPE =", value, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeNotEqualTo(String value) {
            addCriterion("CACL_TAX_TYPE <>", value, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeGreaterThan(String value) {
            addCriterion("CACL_TAX_TYPE >", value, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CACL_TAX_TYPE >=", value, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeLessThan(String value) {
            addCriterion("CACL_TAX_TYPE <", value, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeLessThanOrEqualTo(String value) {
            addCriterion("CACL_TAX_TYPE <=", value, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeLike(String value) {
            addCriterion("CACL_TAX_TYPE like", value, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeNotLike(String value) {
            addCriterion("CACL_TAX_TYPE not like", value, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeIn(List<String> values) {
            addCriterion("CACL_TAX_TYPE in", values, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeNotIn(List<String> values) {
            addCriterion("CACL_TAX_TYPE not in", values, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeBetween(String value1, String value2) {
            addCriterion("CACL_TAX_TYPE between", value1, value2, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andCaclTaxTypeNotBetween(String value1, String value2) {
            addCriterion("CACL_TAX_TYPE not between", value1, value2, "caclTaxType");
            return (Criteria) this;
        }

        public Criteria andVocFlagIsNull() {
            addCriterion("VOC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andVocFlagIsNotNull() {
            addCriterion("VOC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andVocFlagEqualTo(String value) {
            addCriterion("VOC_FLAG =", value, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagNotEqualTo(String value) {
            addCriterion("VOC_FLAG <>", value, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagGreaterThan(String value) {
            addCriterion("VOC_FLAG >", value, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_FLAG >=", value, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagLessThan(String value) {
            addCriterion("VOC_FLAG <", value, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagLessThanOrEqualTo(String value) {
            addCriterion("VOC_FLAG <=", value, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagLike(String value) {
            addCriterion("VOC_FLAG like", value, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagNotLike(String value) {
            addCriterion("VOC_FLAG not like", value, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagIn(List<String> values) {
            addCriterion("VOC_FLAG in", values, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagNotIn(List<String> values) {
            addCriterion("VOC_FLAG not in", values, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagBetween(String value1, String value2) {
            addCriterion("VOC_FLAG between", value1, value2, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andVocFlagNotBetween(String value1, String value2) {
            addCriterion("VOC_FLAG not between", value1, value2, "vocFlag");
            return (Criteria) this;
        }

        public Criteria andTxTypeIsNull() {
            addCriterion("TX_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTxTypeIsNotNull() {
            addCriterion("TX_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTxTypeEqualTo(String value) {
            addCriterion("TX_TYPE =", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeNotEqualTo(String value) {
            addCriterion("TX_TYPE <>", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeGreaterThan(String value) {
            addCriterion("TX_TYPE >", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TX_TYPE >=", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeLessThan(String value) {
            addCriterion("TX_TYPE <", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeLessThanOrEqualTo(String value) {
            addCriterion("TX_TYPE <=", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeLike(String value) {
            addCriterion("TX_TYPE like", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeNotLike(String value) {
            addCriterion("TX_TYPE not like", value, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeIn(List<String> values) {
            addCriterion("TX_TYPE in", values, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeNotIn(List<String> values) {
            addCriterion("TX_TYPE not in", values, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeBetween(String value1, String value2) {
            addCriterion("TX_TYPE between", value1, value2, "txType");
            return (Criteria) this;
        }

        public Criteria andTxTypeNotBetween(String value1, String value2) {
            addCriterion("TX_TYPE not between", value1, value2, "txType");
            return (Criteria) this;
        }

        public Criteria andTxCodeIsNull() {
            addCriterion("TX_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTxCodeIsNotNull() {
            addCriterion("TX_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTxCodeEqualTo(String value) {
            addCriterion("TX_CODE =", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeNotEqualTo(String value) {
            addCriterion("TX_CODE <>", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeGreaterThan(String value) {
            addCriterion("TX_CODE >", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TX_CODE >=", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeLessThan(String value) {
            addCriterion("TX_CODE <", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeLessThanOrEqualTo(String value) {
            addCriterion("TX_CODE <=", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeLike(String value) {
            addCriterion("TX_CODE like", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeNotLike(String value) {
            addCriterion("TX_CODE not like", value, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeIn(List<String> values) {
            addCriterion("TX_CODE in", values, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeNotIn(List<String> values) {
            addCriterion("TX_CODE not in", values, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeBetween(String value1, String value2) {
            addCriterion("TX_CODE between", value1, value2, "txCode");
            return (Criteria) this;
        }

        public Criteria andTxCodeNotBetween(String value1, String value2) {
            addCriterion("TX_CODE not between", value1, value2, "txCode");
            return (Criteria) this;
        }

        public Criteria andSeqNoIsNull() {
            addCriterion("SEQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andSeqNoIsNotNull() {
            addCriterion("SEQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNoEqualTo(String value) {
            addCriterion("SEQ_NO =", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotEqualTo(String value) {
            addCriterion("SEQ_NO <>", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThan(String value) {
            addCriterion("SEQ_NO >", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_NO >=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThan(String value) {
            addCriterion("SEQ_NO <", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThanOrEqualTo(String value) {
            addCriterion("SEQ_NO <=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLike(String value) {
            addCriterion("SEQ_NO like", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotLike(String value) {
            addCriterion("SEQ_NO not like", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoIn(List<String> values) {
            addCriterion("SEQ_NO in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotIn(List<String> values) {
            addCriterion("SEQ_NO not in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoBetween(String value1, String value2) {
            addCriterion("SEQ_NO between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotBetween(String value1, String value2) {
            addCriterion("SEQ_NO not between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoIsNull() {
            addCriterion("PAY_REQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andPayReqNoIsNotNull() {
            addCriterion("PAY_REQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPayReqNoEqualTo(String value) {
            addCriterion("PAY_REQ_NO =", value, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoNotEqualTo(String value) {
            addCriterion("PAY_REQ_NO <>", value, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoGreaterThan(String value) {
            addCriterion("PAY_REQ_NO >", value, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_REQ_NO >=", value, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoLessThan(String value) {
            addCriterion("PAY_REQ_NO <", value, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoLessThanOrEqualTo(String value) {
            addCriterion("PAY_REQ_NO <=", value, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoLike(String value) {
            addCriterion("PAY_REQ_NO like", value, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoNotLike(String value) {
            addCriterion("PAY_REQ_NO not like", value, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoIn(List<String> values) {
            addCriterion("PAY_REQ_NO in", values, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoNotIn(List<String> values) {
            addCriterion("PAY_REQ_NO not in", values, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoBetween(String value1, String value2) {
            addCriterion("PAY_REQ_NO between", value1, value2, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andPayReqNoNotBetween(String value1, String value2) {
            addCriterion("PAY_REQ_NO not between", value1, value2, "payReqNo");
            return (Criteria) this;
        }

        public Criteria andTxDateIsNull() {
            addCriterion("TX_DATE is null");
            return (Criteria) this;
        }

        public Criteria andTxDateIsNotNull() {
            addCriterion("TX_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andTxDateEqualTo(String value) {
            addCriterion("TX_DATE =", value, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateNotEqualTo(String value) {
            addCriterion("TX_DATE <>", value, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateGreaterThan(String value) {
            addCriterion("TX_DATE >", value, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateGreaterThanOrEqualTo(String value) {
            addCriterion("TX_DATE >=", value, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateLessThan(String value) {
            addCriterion("TX_DATE <", value, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateLessThanOrEqualTo(String value) {
            addCriterion("TX_DATE <=", value, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateLike(String value) {
            addCriterion("TX_DATE like", value, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateNotLike(String value) {
            addCriterion("TX_DATE not like", value, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateIn(List<String> values) {
            addCriterion("TX_DATE in", values, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateNotIn(List<String> values) {
            addCriterion("TX_DATE not in", values, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateBetween(String value1, String value2) {
            addCriterion("TX_DATE between", value1, value2, "txDate");
            return (Criteria) this;
        }

        public Criteria andTxDateNotBetween(String value1, String value2) {
            addCriterion("TX_DATE not between", value1, value2, "txDate");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNull() {
            addCriterion("SYS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysIdIsNotNull() {
            addCriterion("SYS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysIdEqualTo(String value) {
            addCriterion("SYS_ID =", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotEqualTo(String value) {
            addCriterion("SYS_ID <>", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThan(String value) {
            addCriterion("SYS_ID >", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_ID >=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThan(String value) {
            addCriterion("SYS_ID <", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLessThanOrEqualTo(String value) {
            addCriterion("SYS_ID <=", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdLike(String value) {
            addCriterion("SYS_ID like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotLike(String value) {
            addCriterion("SYS_ID not like", value, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdIn(List<String> values) {
            addCriterion("SYS_ID in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotIn(List<String> values) {
            addCriterion("SYS_ID not in", values, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdBetween(String value1, String value2) {
            addCriterion("SYS_ID between", value1, value2, "sysId");
            return (Criteria) this;
        }

        public Criteria andSysIdNotBetween(String value1, String value2) {
            addCriterion("SYS_ID not between", value1, value2, "sysId");
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

        public Criteria andDocTypeIsNull() {
            addCriterion("DOC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDocTypeIsNotNull() {
            addCriterion("DOC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDocTypeEqualTo(String value) {
            addCriterion("DOC_TYPE =", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeNotEqualTo(String value) {
            addCriterion("DOC_TYPE <>", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeGreaterThan(String value) {
            addCriterion("DOC_TYPE >", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DOC_TYPE >=", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeLessThan(String value) {
            addCriterion("DOC_TYPE <", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeLessThanOrEqualTo(String value) {
            addCriterion("DOC_TYPE <=", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeLike(String value) {
            addCriterion("DOC_TYPE like", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeNotLike(String value) {
            addCriterion("DOC_TYPE not like", value, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeIn(List<String> values) {
            addCriterion("DOC_TYPE in", values, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeNotIn(List<String> values) {
            addCriterion("DOC_TYPE not in", values, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeBetween(String value1, String value2) {
            addCriterion("DOC_TYPE between", value1, value2, "docType");
            return (Criteria) this;
        }

        public Criteria andDocTypeNotBetween(String value1, String value2) {
            addCriterion("DOC_TYPE not between", value1, value2, "docType");
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

        public Criteria andFormCodingIsNull() {
            addCriterion("FORM_CODING is null");
            return (Criteria) this;
        }

        public Criteria andFormCodingIsNotNull() {
            addCriterion("FORM_CODING is not null");
            return (Criteria) this;
        }

        public Criteria andFormCodingEqualTo(String value) {
            addCriterion("FORM_CODING =", value, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingNotEqualTo(String value) {
            addCriterion("FORM_CODING <>", value, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingGreaterThan(String value) {
            addCriterion("FORM_CODING >", value, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingGreaterThanOrEqualTo(String value) {
            addCriterion("FORM_CODING >=", value, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingLessThan(String value) {
            addCriterion("FORM_CODING <", value, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingLessThanOrEqualTo(String value) {
            addCriterion("FORM_CODING <=", value, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingLike(String value) {
            addCriterion("FORM_CODING like", value, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingNotLike(String value) {
            addCriterion("FORM_CODING not like", value, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingIn(List<String> values) {
            addCriterion("FORM_CODING in", values, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingNotIn(List<String> values) {
            addCriterion("FORM_CODING not in", values, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingBetween(String value1, String value2) {
            addCriterion("FORM_CODING between", value1, value2, "formCoding");
            return (Criteria) this;
        }

        public Criteria andFormCodingNotBetween(String value1, String value2) {
            addCriterion("FORM_CODING not between", value1, value2, "formCoding");
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