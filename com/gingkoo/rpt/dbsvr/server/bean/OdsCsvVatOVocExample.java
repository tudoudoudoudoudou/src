package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OdsCsvVatOVocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsCsvVatOVocExample() {
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

        public Criteria andReqSeqIsNull() {
            addCriterion("REQ_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andReqSeqIsNotNull() {
            addCriterion("REQ_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andReqSeqEqualTo(String value) {
            addCriterion("REQ_SEQ =", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqNotEqualTo(String value) {
            addCriterion("REQ_SEQ <>", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqGreaterThan(String value) {
            addCriterion("REQ_SEQ >", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_SEQ >=", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqLessThan(String value) {
            addCriterion("REQ_SEQ <", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqLessThanOrEqualTo(String value) {
            addCriterion("REQ_SEQ <=", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqLike(String value) {
            addCriterion("REQ_SEQ like", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqNotLike(String value) {
            addCriterion("REQ_SEQ not like", value, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqIn(List<String> values) {
            addCriterion("REQ_SEQ in", values, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqNotIn(List<String> values) {
            addCriterion("REQ_SEQ not in", values, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqBetween(String value1, String value2) {
            addCriterion("REQ_SEQ between", value1, value2, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andReqSeqNotBetween(String value1, String value2) {
            addCriterion("REQ_SEQ not between", value1, value2, "reqSeq");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIsNull() {
            addCriterion("POLICY_NO is null");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIsNotNull() {
            addCriterion("POLICY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyNoEqualTo(String value) {
            addCriterion("POLICY_NO =", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotEqualTo(String value) {
            addCriterion("POLICY_NO <>", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoGreaterThan(String value) {
            addCriterion("POLICY_NO >", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoGreaterThanOrEqualTo(String value) {
            addCriterion("POLICY_NO >=", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLessThan(String value) {
            addCriterion("POLICY_NO <", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLessThanOrEqualTo(String value) {
            addCriterion("POLICY_NO <=", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoLike(String value) {
            addCriterion("POLICY_NO like", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotLike(String value) {
            addCriterion("POLICY_NO not like", value, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoIn(List<String> values) {
            addCriterion("POLICY_NO in", values, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotIn(List<String> values) {
            addCriterion("POLICY_NO not in", values, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoBetween(String value1, String value2) {
            addCriterion("POLICY_NO between", value1, value2, "policyNo");
            return (Criteria) this;
        }

        public Criteria andPolicyNoNotBetween(String value1, String value2) {
            addCriterion("POLICY_NO not between", value1, value2, "policyNo");
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

        public Criteria andEntryNoIsNull() {
            addCriterion("ENTRY_NO is null");
            return (Criteria) this;
        }

        public Criteria andEntryNoIsNotNull() {
            addCriterion("ENTRY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEntryNoEqualTo(String value) {
            addCriterion("ENTRY_NO =", value, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoNotEqualTo(String value) {
            addCriterion("ENTRY_NO <>", value, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoGreaterThan(String value) {
            addCriterion("ENTRY_NO >", value, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoGreaterThanOrEqualTo(String value) {
            addCriterion("ENTRY_NO >=", value, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoLessThan(String value) {
            addCriterion("ENTRY_NO <", value, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoLessThanOrEqualTo(String value) {
            addCriterion("ENTRY_NO <=", value, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoLike(String value) {
            addCriterion("ENTRY_NO like", value, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoNotLike(String value) {
            addCriterion("ENTRY_NO not like", value, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoIn(List<String> values) {
            addCriterion("ENTRY_NO in", values, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoNotIn(List<String> values) {
            addCriterion("ENTRY_NO not in", values, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoBetween(String value1, String value2) {
            addCriterion("ENTRY_NO between", value1, value2, "entryNo");
            return (Criteria) this;
        }

        public Criteria andEntryNoNotBetween(String value1, String value2) {
            addCriterion("ENTRY_NO not between", value1, value2, "entryNo");
            return (Criteria) this;
        }

        public Criteria andDcFlagIsNull() {
            addCriterion("DC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDcFlagIsNotNull() {
            addCriterion("DC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDcFlagEqualTo(String value) {
            addCriterion("DC_FLAG =", value, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagNotEqualTo(String value) {
            addCriterion("DC_FLAG <>", value, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagGreaterThan(String value) {
            addCriterion("DC_FLAG >", value, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DC_FLAG >=", value, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagLessThan(String value) {
            addCriterion("DC_FLAG <", value, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagLessThanOrEqualTo(String value) {
            addCriterion("DC_FLAG <=", value, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagLike(String value) {
            addCriterion("DC_FLAG like", value, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagNotLike(String value) {
            addCriterion("DC_FLAG not like", value, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagIn(List<String> values) {
            addCriterion("DC_FLAG in", values, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagNotIn(List<String> values) {
            addCriterion("DC_FLAG not in", values, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagBetween(String value1, String value2) {
            addCriterion("DC_FLAG between", value1, value2, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andDcFlagNotBetween(String value1, String value2) {
            addCriterion("DC_FLAG not between", value1, value2, "dcFlag");
            return (Criteria) this;
        }

        public Criteria andTxAmtIsNull() {
            addCriterion("TX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTxAmtIsNotNull() {
            addCriterion("TX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTxAmtEqualTo(BigDecimal value) {
            addCriterion("TX_AMT =", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtNotEqualTo(BigDecimal value) {
            addCriterion("TX_AMT <>", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtGreaterThan(BigDecimal value) {
            addCriterion("TX_AMT >", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TX_AMT >=", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtLessThan(BigDecimal value) {
            addCriterion("TX_AMT <", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TX_AMT <=", value, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtIn(List<BigDecimal> values) {
            addCriterion("TX_AMT in", values, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtNotIn(List<BigDecimal> values) {
            addCriterion("TX_AMT not in", values, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TX_AMT between", value1, value2, "txAmt");
            return (Criteria) this;
        }

        public Criteria andTxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TX_AMT not between", value1, value2, "txAmt");
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

        public Criteria andTxNameIsNull() {
            addCriterion("TX_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTxNameIsNotNull() {
            addCriterion("TX_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTxNameEqualTo(String value) {
            addCriterion("TX_NAME =", value, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameNotEqualTo(String value) {
            addCriterion("TX_NAME <>", value, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameGreaterThan(String value) {
            addCriterion("TX_NAME >", value, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameGreaterThanOrEqualTo(String value) {
            addCriterion("TX_NAME >=", value, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameLessThan(String value) {
            addCriterion("TX_NAME <", value, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameLessThanOrEqualTo(String value) {
            addCriterion("TX_NAME <=", value, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameLike(String value) {
            addCriterion("TX_NAME like", value, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameNotLike(String value) {
            addCriterion("TX_NAME not like", value, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameIn(List<String> values) {
            addCriterion("TX_NAME in", values, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameNotIn(List<String> values) {
            addCriterion("TX_NAME not in", values, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameBetween(String value1, String value2) {
            addCriterion("TX_NAME between", value1, value2, "txName");
            return (Criteria) this;
        }

        public Criteria andTxNameNotBetween(String value1, String value2) {
            addCriterion("TX_NAME not between", value1, value2, "txName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("GOOD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("GOOD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("GOOD_NAME =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("GOOD_NAME <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("GOOD_NAME >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOOD_NAME >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("GOOD_NAME <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("GOOD_NAME <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("GOOD_NAME like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("GOOD_NAME not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("GOOD_NAME in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("GOOD_NAME not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("GOOD_NAME between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("GOOD_NAME not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNull() {
            addCriterion("GOOD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIsNotNull() {
            addCriterion("GOOD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodTypeEqualTo(String value) {
            addCriterion("GOOD_TYPE =", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotEqualTo(String value) {
            addCriterion("GOOD_TYPE <>", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThan(String value) {
            addCriterion("GOOD_TYPE >", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GOOD_TYPE >=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThan(String value) {
            addCriterion("GOOD_TYPE <", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLessThanOrEqualTo(String value) {
            addCriterion("GOOD_TYPE <=", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeLike(String value) {
            addCriterion("GOOD_TYPE like", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotLike(String value) {
            addCriterion("GOOD_TYPE not like", value, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeIn(List<String> values) {
            addCriterion("GOOD_TYPE in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotIn(List<String> values) {
            addCriterion("GOOD_TYPE not in", values, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeBetween(String value1, String value2) {
            addCriterion("GOOD_TYPE between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andGoodTypeNotBetween(String value1, String value2) {
            addCriterion("GOOD_TYPE not between", value1, value2, "goodType");
            return (Criteria) this;
        }

        public Criteria andCntUnitIsNull() {
            addCriterion("CNT_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCntUnitIsNotNull() {
            addCriterion("CNT_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCntUnitEqualTo(String value) {
            addCriterion("CNT_UNIT =", value, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitNotEqualTo(String value) {
            addCriterion("CNT_UNIT <>", value, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitGreaterThan(String value) {
            addCriterion("CNT_UNIT >", value, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitGreaterThanOrEqualTo(String value) {
            addCriterion("CNT_UNIT >=", value, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitLessThan(String value) {
            addCriterion("CNT_UNIT <", value, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitLessThanOrEqualTo(String value) {
            addCriterion("CNT_UNIT <=", value, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitLike(String value) {
            addCriterion("CNT_UNIT like", value, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitNotLike(String value) {
            addCriterion("CNT_UNIT not like", value, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitIn(List<String> values) {
            addCriterion("CNT_UNIT in", values, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitNotIn(List<String> values) {
            addCriterion("CNT_UNIT not in", values, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitBetween(String value1, String value2) {
            addCriterion("CNT_UNIT between", value1, value2, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andCntUnitNotBetween(String value1, String value2) {
            addCriterion("CNT_UNIT not between", value1, value2, "cntUnit");
            return (Criteria) this;
        }

        public Criteria andGoodNumIsNull() {
            addCriterion("GOOD_NUM is null");
            return (Criteria) this;
        }

        public Criteria andGoodNumIsNotNull() {
            addCriterion("GOOD_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNumEqualTo(BigDecimal value) {
            addCriterion("GOOD_NUM =", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotEqualTo(BigDecimal value) {
            addCriterion("GOOD_NUM <>", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumGreaterThan(BigDecimal value) {
            addCriterion("GOOD_NUM >", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_NUM >=", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumLessThan(BigDecimal value) {
            addCriterion("GOOD_NUM <", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_NUM <=", value, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumIn(List<BigDecimal> values) {
            addCriterion("GOOD_NUM in", values, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotIn(List<BigDecimal> values) {
            addCriterion("GOOD_NUM not in", values, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_NUM between", value1, value2, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_NUM not between", value1, value2, "goodNum");
            return (Criteria) this;
        }

        public Criteria andGoodAmtIsNull() {
            addCriterion("GOOD_AMT is null");
            return (Criteria) this;
        }

        public Criteria andGoodAmtIsNotNull() {
            addCriterion("GOOD_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodAmtEqualTo(BigDecimal value) {
            addCriterion("GOOD_AMT =", value, "goodAmt");
            return (Criteria) this;
        }

        public Criteria andGoodAmtNotEqualTo(BigDecimal value) {
            addCriterion("GOOD_AMT <>", value, "goodAmt");
            return (Criteria) this;
        }

        public Criteria andGoodAmtGreaterThan(BigDecimal value) {
            addCriterion("GOOD_AMT >", value, "goodAmt");
            return (Criteria) this;
        }

        public Criteria andGoodAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_AMT >=", value, "goodAmt");
            return (Criteria) this;
        }

        public Criteria andGoodAmtLessThan(BigDecimal value) {
            addCriterion("GOOD_AMT <", value, "goodAmt");
            return (Criteria) this;
        }

        public Criteria andGoodAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_AMT <=", value, "goodAmt");
            return (Criteria) this;
        }

        public Criteria andGoodAmtIn(List<BigDecimal> values) {
            addCriterion("GOOD_AMT in", values, "goodAmt");
            return (Criteria) this;
        }

        public Criteria andGoodAmtNotIn(List<BigDecimal> values) {
            addCriterion("GOOD_AMT not in", values, "goodAmt");
            return (Criteria) this;
        }

        public Criteria andGoodAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_AMT between", value1, value2, "goodAmt");
            return (Criteria) this;
        }

        public Criteria andGoodAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_AMT not between", value1, value2, "goodAmt");
            return (Criteria) this;
        }

        public Criteria andInsAmtIsNull() {
            addCriterion("INS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andInsAmtIsNotNull() {
            addCriterion("INS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andInsAmtEqualTo(BigDecimal value) {
            addCriterion("INS_AMT =", value, "insAmt");
            return (Criteria) this;
        }

        public Criteria andInsAmtNotEqualTo(BigDecimal value) {
            addCriterion("INS_AMT <>", value, "insAmt");
            return (Criteria) this;
        }

        public Criteria andInsAmtGreaterThan(BigDecimal value) {
            addCriterion("INS_AMT >", value, "insAmt");
            return (Criteria) this;
        }

        public Criteria andInsAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INS_AMT >=", value, "insAmt");
            return (Criteria) this;
        }

        public Criteria andInsAmtLessThan(BigDecimal value) {
            addCriterion("INS_AMT <", value, "insAmt");
            return (Criteria) this;
        }

        public Criteria andInsAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INS_AMT <=", value, "insAmt");
            return (Criteria) this;
        }

        public Criteria andInsAmtIn(List<BigDecimal> values) {
            addCriterion("INS_AMT in", values, "insAmt");
            return (Criteria) this;
        }

        public Criteria andInsAmtNotIn(List<BigDecimal> values) {
            addCriterion("INS_AMT not in", values, "insAmt");
            return (Criteria) this;
        }

        public Criteria andInsAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INS_AMT between", value1, value2, "insAmt");
            return (Criteria) this;
        }

        public Criteria andInsAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INS_AMT not between", value1, value2, "insAmt");
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

        public Criteria andTaxRateIsNull() {
            addCriterion("TAX_RATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("TAX_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("TAX_RATE >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("TAX_RATE <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("TAX_RATE in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("TAX_RATE not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RATE between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RATE not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNull() {
            addCriterion("REF_ID is null");
            return (Criteria) this;
        }

        public Criteria andRefIdIsNotNull() {
            addCriterion("REF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRefIdEqualTo(String value) {
            addCriterion("REF_ID =", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotEqualTo(String value) {
            addCriterion("REF_ID <>", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThan(String value) {
            addCriterion("REF_ID >", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdGreaterThanOrEqualTo(String value) {
            addCriterion("REF_ID >=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThan(String value) {
            addCriterion("REF_ID <", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLessThanOrEqualTo(String value) {
            addCriterion("REF_ID <=", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdLike(String value) {
            addCriterion("REF_ID like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotLike(String value) {
            addCriterion("REF_ID not like", value, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdIn(List<String> values) {
            addCriterion("REF_ID in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotIn(List<String> values) {
            addCriterion("REF_ID not in", values, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdBetween(String value1, String value2) {
            addCriterion("REF_ID between", value1, value2, "refId");
            return (Criteria) this;
        }

        public Criteria andRefIdNotBetween(String value1, String value2) {
            addCriterion("REF_ID not between", value1, value2, "refId");
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

        public Criteria andNationalTaxNoIsNull() {
            addCriterion("NATIONAL_TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoIsNotNull() {
            addCriterion("NATIONAL_TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoEqualTo(String value) {
            addCriterion("NATIONAL_TAX_NO =", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotEqualTo(String value) {
            addCriterion("NATIONAL_TAX_NO <>", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoGreaterThan(String value) {
            addCriterion("NATIONAL_TAX_NO >", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("NATIONAL_TAX_NO >=", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoLessThan(String value) {
            addCriterion("NATIONAL_TAX_NO <", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoLessThanOrEqualTo(String value) {
            addCriterion("NATIONAL_TAX_NO <=", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoLike(String value) {
            addCriterion("NATIONAL_TAX_NO like", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotLike(String value) {
            addCriterion("NATIONAL_TAX_NO not like", value, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoIn(List<String> values) {
            addCriterion("NATIONAL_TAX_NO in", values, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotIn(List<String> values) {
            addCriterion("NATIONAL_TAX_NO not in", values, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoBetween(String value1, String value2) {
            addCriterion("NATIONAL_TAX_NO between", value1, value2, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andNationalTaxNoNotBetween(String value1, String value2) {
            addCriterion("NATIONAL_TAX_NO not between", value1, value2, "nationalTaxNo");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNull() {
            addCriterion("CUST_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("CUST_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("CUST_NAME =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("CUST_NAME <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("CUST_NAME >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_NAME >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("CUST_NAME <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_NAME <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("CUST_NAME like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("CUST_NAME not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("CUST_NAME in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("CUST_NAME not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("CUST_NAME between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("CUST_NAME not between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustAddrIsNull() {
            addCriterion("CUST_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andCustAddrIsNotNull() {
            addCriterion("CUST_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andCustAddrEqualTo(String value) {
            addCriterion("CUST_ADDR =", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotEqualTo(String value) {
            addCriterion("CUST_ADDR <>", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrGreaterThan(String value) {
            addCriterion("CUST_ADDR >", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ADDR >=", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLessThan(String value) {
            addCriterion("CUST_ADDR <", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLessThanOrEqualTo(String value) {
            addCriterion("CUST_ADDR <=", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrLike(String value) {
            addCriterion("CUST_ADDR like", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotLike(String value) {
            addCriterion("CUST_ADDR not like", value, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrIn(List<String> values) {
            addCriterion("CUST_ADDR in", values, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotIn(List<String> values) {
            addCriterion("CUST_ADDR not in", values, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrBetween(String value1, String value2) {
            addCriterion("CUST_ADDR between", value1, value2, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustAddrNotBetween(String value1, String value2) {
            addCriterion("CUST_ADDR not between", value1, value2, "custAddr");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNull() {
            addCriterion("CUST_TEL is null");
            return (Criteria) this;
        }

        public Criteria andCustTelIsNotNull() {
            addCriterion("CUST_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustTelEqualTo(String value) {
            addCriterion("CUST_TEL =", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotEqualTo(String value) {
            addCriterion("CUST_TEL <>", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThan(String value) {
            addCriterion("CUST_TEL >", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_TEL >=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThan(String value) {
            addCriterion("CUST_TEL <", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLessThanOrEqualTo(String value) {
            addCriterion("CUST_TEL <=", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelLike(String value) {
            addCriterion("CUST_TEL like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotLike(String value) {
            addCriterion("CUST_TEL not like", value, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelIn(List<String> values) {
            addCriterion("CUST_TEL in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotIn(List<String> values) {
            addCriterion("CUST_TEL not in", values, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelBetween(String value1, String value2) {
            addCriterion("CUST_TEL between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustTelNotBetween(String value1, String value2) {
            addCriterion("CUST_TEL not between", value1, value2, "custTel");
            return (Criteria) this;
        }

        public Criteria andCustBrNameIsNull() {
            addCriterion("CUST_BR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustBrNameIsNotNull() {
            addCriterion("CUST_BR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustBrNameEqualTo(String value) {
            addCriterion("CUST_BR_NAME =", value, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameNotEqualTo(String value) {
            addCriterion("CUST_BR_NAME <>", value, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameGreaterThan(String value) {
            addCriterion("CUST_BR_NAME >", value, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_BR_NAME >=", value, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameLessThan(String value) {
            addCriterion("CUST_BR_NAME <", value, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameLessThanOrEqualTo(String value) {
            addCriterion("CUST_BR_NAME <=", value, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameLike(String value) {
            addCriterion("CUST_BR_NAME like", value, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameNotLike(String value) {
            addCriterion("CUST_BR_NAME not like", value, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameIn(List<String> values) {
            addCriterion("CUST_BR_NAME in", values, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameNotIn(List<String> values) {
            addCriterion("CUST_BR_NAME not in", values, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameBetween(String value1, String value2) {
            addCriterion("CUST_BR_NAME between", value1, value2, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustBrNameNotBetween(String value1, String value2) {
            addCriterion("CUST_BR_NAME not between", value1, value2, "custBrName");
            return (Criteria) this;
        }

        public Criteria andCustActNoIsNull() {
            addCriterion("CUST_ACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustActNoIsNotNull() {
            addCriterion("CUST_ACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustActNoEqualTo(String value) {
            addCriterion("CUST_ACT_NO =", value, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoNotEqualTo(String value) {
            addCriterion("CUST_ACT_NO <>", value, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoGreaterThan(String value) {
            addCriterion("CUST_ACT_NO >", value, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ACT_NO >=", value, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoLessThan(String value) {
            addCriterion("CUST_ACT_NO <", value, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoLessThanOrEqualTo(String value) {
            addCriterion("CUST_ACT_NO <=", value, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoLike(String value) {
            addCriterion("CUST_ACT_NO like", value, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoNotLike(String value) {
            addCriterion("CUST_ACT_NO not like", value, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoIn(List<String> values) {
            addCriterion("CUST_ACT_NO in", values, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoNotIn(List<String> values) {
            addCriterion("CUST_ACT_NO not in", values, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoBetween(String value1, String value2) {
            addCriterion("CUST_ACT_NO between", value1, value2, "custActNo");
            return (Criteria) this;
        }

        public Criteria andCustActNoNotBetween(String value1, String value2) {
            addCriterion("CUST_ACT_NO not between", value1, value2, "custActNo");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeIsNull() {
            addCriterion("TAX_ENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeIsNotNull() {
            addCriterion("TAX_ENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeEqualTo(String value) {
            addCriterion("TAX_ENT_TYPE =", value, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeNotEqualTo(String value) {
            addCriterion("TAX_ENT_TYPE <>", value, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeGreaterThan(String value) {
            addCriterion("TAX_ENT_TYPE >", value, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ENT_TYPE >=", value, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeLessThan(String value) {
            addCriterion("TAX_ENT_TYPE <", value, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeLessThanOrEqualTo(String value) {
            addCriterion("TAX_ENT_TYPE <=", value, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeLike(String value) {
            addCriterion("TAX_ENT_TYPE like", value, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeNotLike(String value) {
            addCriterion("TAX_ENT_TYPE not like", value, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeIn(List<String> values) {
            addCriterion("TAX_ENT_TYPE in", values, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeNotIn(List<String> values) {
            addCriterion("TAX_ENT_TYPE not in", values, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeBetween(String value1, String value2) {
            addCriterion("TAX_ENT_TYPE between", value1, value2, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andTaxEntTypeNotBetween(String value1, String value2) {
            addCriterion("TAX_ENT_TYPE not between", value1, value2, "taxEntType");
            return (Criteria) this;
        }

        public Criteria andVocTypeIsNull() {
            addCriterion("VOC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVocTypeIsNotNull() {
            addCriterion("VOC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVocTypeEqualTo(String value) {
            addCriterion("VOC_TYPE =", value, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeNotEqualTo(String value) {
            addCriterion("VOC_TYPE <>", value, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeGreaterThan(String value) {
            addCriterion("VOC_TYPE >", value, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_TYPE >=", value, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeLessThan(String value) {
            addCriterion("VOC_TYPE <", value, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeLessThanOrEqualTo(String value) {
            addCriterion("VOC_TYPE <=", value, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeLike(String value) {
            addCriterion("VOC_TYPE like", value, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeNotLike(String value) {
            addCriterion("VOC_TYPE not like", value, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeIn(List<String> values) {
            addCriterion("VOC_TYPE in", values, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeNotIn(List<String> values) {
            addCriterion("VOC_TYPE not in", values, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeBetween(String value1, String value2) {
            addCriterion("VOC_TYPE between", value1, value2, "vocType");
            return (Criteria) this;
        }

        public Criteria andVocTypeNotBetween(String value1, String value2) {
            addCriterion("VOC_TYPE not between", value1, value2, "vocType");
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

        public Criteria andVocDescIsNull() {
            addCriterion("VOC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVocDescIsNotNull() {
            addCriterion("VOC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVocDescEqualTo(String value) {
            addCriterion("VOC_DESC =", value, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescNotEqualTo(String value) {
            addCriterion("VOC_DESC <>", value, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescGreaterThan(String value) {
            addCriterion("VOC_DESC >", value, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_DESC >=", value, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescLessThan(String value) {
            addCriterion("VOC_DESC <", value, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescLessThanOrEqualTo(String value) {
            addCriterion("VOC_DESC <=", value, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescLike(String value) {
            addCriterion("VOC_DESC like", value, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescNotLike(String value) {
            addCriterion("VOC_DESC not like", value, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescIn(List<String> values) {
            addCriterion("VOC_DESC in", values, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescNotIn(List<String> values) {
            addCriterion("VOC_DESC not in", values, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescBetween(String value1, String value2) {
            addCriterion("VOC_DESC between", value1, value2, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andVocDescNotBetween(String value1, String value2) {
            addCriterion("VOC_DESC not between", value1, value2, "vocDesc");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNull() {
            addCriterion("SEND_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSendTypeIsNotNull() {
            addCriterion("SEND_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSendTypeEqualTo(String value) {
            addCriterion("SEND_TYPE =", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotEqualTo(String value) {
            addCriterion("SEND_TYPE <>", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThan(String value) {
            addCriterion("SEND_TYPE >", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_TYPE >=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThan(String value) {
            addCriterion("SEND_TYPE <", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLessThanOrEqualTo(String value) {
            addCriterion("SEND_TYPE <=", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeLike(String value) {
            addCriterion("SEND_TYPE like", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotLike(String value) {
            addCriterion("SEND_TYPE not like", value, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeIn(List<String> values) {
            addCriterion("SEND_TYPE in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotIn(List<String> values) {
            addCriterion("SEND_TYPE not in", values, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeBetween(String value1, String value2) {
            addCriterion("SEND_TYPE between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andSendTypeNotBetween(String value1, String value2) {
            addCriterion("SEND_TYPE not between", value1, value2, "sendType");
            return (Criteria) this;
        }

        public Criteria andImpFileNameIsNull() {
            addCriterion("IMP_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andImpFileNameIsNotNull() {
            addCriterion("IMP_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andImpFileNameEqualTo(String value) {
            addCriterion("IMP_FILE_NAME =", value, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameNotEqualTo(String value) {
            addCriterion("IMP_FILE_NAME <>", value, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameGreaterThan(String value) {
            addCriterion("IMP_FILE_NAME >", value, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("IMP_FILE_NAME >=", value, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameLessThan(String value) {
            addCriterion("IMP_FILE_NAME <", value, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameLessThanOrEqualTo(String value) {
            addCriterion("IMP_FILE_NAME <=", value, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameLike(String value) {
            addCriterion("IMP_FILE_NAME like", value, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameNotLike(String value) {
            addCriterion("IMP_FILE_NAME not like", value, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameIn(List<String> values) {
            addCriterion("IMP_FILE_NAME in", values, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameNotIn(List<String> values) {
            addCriterion("IMP_FILE_NAME not in", values, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameBetween(String value1, String value2) {
            addCriterion("IMP_FILE_NAME between", value1, value2, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpFileNameNotBetween(String value1, String value2) {
            addCriterion("IMP_FILE_NAME not between", value1, value2, "impFileName");
            return (Criteria) this;
        }

        public Criteria andImpTimeIsNull() {
            addCriterion("IMP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andImpTimeIsNotNull() {
            addCriterion("IMP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andImpTimeEqualTo(String value) {
            addCriterion("IMP_TIME =", value, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeNotEqualTo(String value) {
            addCriterion("IMP_TIME <>", value, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeGreaterThan(String value) {
            addCriterion("IMP_TIME >", value, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeGreaterThanOrEqualTo(String value) {
            addCriterion("IMP_TIME >=", value, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeLessThan(String value) {
            addCriterion("IMP_TIME <", value, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeLessThanOrEqualTo(String value) {
            addCriterion("IMP_TIME <=", value, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeLike(String value) {
            addCriterion("IMP_TIME like", value, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeNotLike(String value) {
            addCriterion("IMP_TIME not like", value, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeIn(List<String> values) {
            addCriterion("IMP_TIME in", values, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeNotIn(List<String> values) {
            addCriterion("IMP_TIME not in", values, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeBetween(String value1, String value2) {
            addCriterion("IMP_TIME between", value1, value2, "impTime");
            return (Criteria) this;
        }

        public Criteria andImpTimeNotBetween(String value1, String value2) {
            addCriterion("IMP_TIME not between", value1, value2, "impTime");
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

        public Criteria andGoodCodeIsNull() {
            addCriterion("GOOD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andGoodCodeIsNotNull() {
            addCriterion("GOOD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCodeEqualTo(String value) {
            addCriterion("GOOD_CODE =", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeNotEqualTo(String value) {
            addCriterion("GOOD_CODE <>", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeGreaterThan(String value) {
            addCriterion("GOOD_CODE >", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeGreaterThanOrEqualTo(String value) {
            addCriterion("GOOD_CODE >=", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeLessThan(String value) {
            addCriterion("GOOD_CODE <", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeLessThanOrEqualTo(String value) {
            addCriterion("GOOD_CODE <=", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeLike(String value) {
            addCriterion("GOOD_CODE like", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeNotLike(String value) {
            addCriterion("GOOD_CODE not like", value, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeIn(List<String> values) {
            addCriterion("GOOD_CODE in", values, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeNotIn(List<String> values) {
            addCriterion("GOOD_CODE not in", values, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeBetween(String value1, String value2) {
            addCriterion("GOOD_CODE between", value1, value2, "goodCode");
            return (Criteria) this;
        }

        public Criteria andGoodCodeNotBetween(String value1, String value2) {
            addCriterion("GOOD_CODE not between", value1, value2, "goodCode");
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