package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HisVatITxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HisVatITxExample() {
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

        public Criteria andTxIdIsNull() {
            addCriterion("TX_ID is null");
            return (Criteria) this;
        }

        public Criteria andTxIdIsNotNull() {
            addCriterion("TX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTxIdEqualTo(String value) {
            addCriterion("TX_ID =", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdNotEqualTo(String value) {
            addCriterion("TX_ID <>", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdGreaterThan(String value) {
            addCriterion("TX_ID >", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdGreaterThanOrEqualTo(String value) {
            addCriterion("TX_ID >=", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdLessThan(String value) {
            addCriterion("TX_ID <", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdLessThanOrEqualTo(String value) {
            addCriterion("TX_ID <=", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdLike(String value) {
            addCriterion("TX_ID like", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdNotLike(String value) {
            addCriterion("TX_ID not like", value, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdIn(List<String> values) {
            addCriterion("TX_ID in", values, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdNotIn(List<String> values) {
            addCriterion("TX_ID not in", values, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdBetween(String value1, String value2) {
            addCriterion("TX_ID between", value1, value2, "txId");
            return (Criteria) this;
        }

        public Criteria andTxIdNotBetween(String value1, String value2) {
            addCriterion("TX_ID not between", value1, value2, "txId");
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

        public Criteria andPayChlIsNull() {
            addCriterion("PAY_CHL is null");
            return (Criteria) this;
        }

        public Criteria andPayChlIsNotNull() {
            addCriterion("PAY_CHL is not null");
            return (Criteria) this;
        }

        public Criteria andPayChlEqualTo(String value) {
            addCriterion("PAY_CHL =", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlNotEqualTo(String value) {
            addCriterion("PAY_CHL <>", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlGreaterThan(String value) {
            addCriterion("PAY_CHL >", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_CHL >=", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlLessThan(String value) {
            addCriterion("PAY_CHL <", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlLessThanOrEqualTo(String value) {
            addCriterion("PAY_CHL <=", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlLike(String value) {
            addCriterion("PAY_CHL like", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlNotLike(String value) {
            addCriterion("PAY_CHL not like", value, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlIn(List<String> values) {
            addCriterion("PAY_CHL in", values, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlNotIn(List<String> values) {
            addCriterion("PAY_CHL not in", values, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlBetween(String value1, String value2) {
            addCriterion("PAY_CHL between", value1, value2, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayChlNotBetween(String value1, String value2) {
            addCriterion("PAY_CHL not between", value1, value2, "payChl");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("PAY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("PAY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(String value) {
            addCriterion("PAY_DATE =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(String value) {
            addCriterion("PAY_DATE <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(String value) {
            addCriterion("PAY_DATE >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_DATE >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(String value) {
            addCriterion("PAY_DATE <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(String value) {
            addCriterion("PAY_DATE <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLike(String value) {
            addCriterion("PAY_DATE like", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotLike(String value) {
            addCriterion("PAY_DATE not like", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<String> values) {
            addCriterion("PAY_DATE in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<String> values) {
            addCriterion("PAY_DATE not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(String value1, String value2) {
            addCriterion("PAY_DATE between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(String value1, String value2) {
            addCriterion("PAY_DATE not between", value1, value2, "payDate");
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

        public Criteria andBizTypeIsNull() {
            addCriterion("BIZ_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBizTypeIsNotNull() {
            addCriterion("BIZ_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBizTypeEqualTo(String value) {
            addCriterion("BIZ_TYPE =", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotEqualTo(String value) {
            addCriterion("BIZ_TYPE <>", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThan(String value) {
            addCriterion("BIZ_TYPE >", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_TYPE >=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThan(String value) {
            addCriterion("BIZ_TYPE <", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLessThanOrEqualTo(String value) {
            addCriterion("BIZ_TYPE <=", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeLike(String value) {
            addCriterion("BIZ_TYPE like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotLike(String value) {
            addCriterion("BIZ_TYPE not like", value, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeIn(List<String> values) {
            addCriterion("BIZ_TYPE in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotIn(List<String> values) {
            addCriterion("BIZ_TYPE not in", values, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeBetween(String value1, String value2) {
            addCriterion("BIZ_TYPE between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andBizTypeNotBetween(String value1, String value2) {
            addCriterion("BIZ_TYPE not between", value1, value2, "bizType");
            return (Criteria) this;
        }

        public Criteria andActNoIsNull() {
            addCriterion("ACT_NO is null");
            return (Criteria) this;
        }

        public Criteria andActNoIsNotNull() {
            addCriterion("ACT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andActNoEqualTo(String value) {
            addCriterion("ACT_NO =", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotEqualTo(String value) {
            addCriterion("ACT_NO <>", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoGreaterThan(String value) {
            addCriterion("ACT_NO >", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_NO >=", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoLessThan(String value) {
            addCriterion("ACT_NO <", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoLessThanOrEqualTo(String value) {
            addCriterion("ACT_NO <=", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoLike(String value) {
            addCriterion("ACT_NO like", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotLike(String value) {
            addCriterion("ACT_NO not like", value, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoIn(List<String> values) {
            addCriterion("ACT_NO in", values, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotIn(List<String> values) {
            addCriterion("ACT_NO not in", values, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoBetween(String value1, String value2) {
            addCriterion("ACT_NO between", value1, value2, "actNo");
            return (Criteria) this;
        }

        public Criteria andActNoNotBetween(String value1, String value2) {
            addCriterion("ACT_NO not between", value1, value2, "actNo");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNull() {
            addCriterion("ACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNotNull() {
            addCriterion("ACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActTypeEqualTo(String value) {
            addCriterion("ACT_TYPE =", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotEqualTo(String value) {
            addCriterion("ACT_TYPE <>", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThan(String value) {
            addCriterion("ACT_TYPE >", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_TYPE >=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThan(String value) {
            addCriterion("ACT_TYPE <", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThanOrEqualTo(String value) {
            addCriterion("ACT_TYPE <=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLike(String value) {
            addCriterion("ACT_TYPE like", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotLike(String value) {
            addCriterion("ACT_TYPE not like", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeIn(List<String> values) {
            addCriterion("ACT_TYPE in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotIn(List<String> values) {
            addCriterion("ACT_TYPE not in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeBetween(String value1, String value2) {
            addCriterion("ACT_TYPE between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotBetween(String value1, String value2) {
            addCriterion("ACT_TYPE not between", value1, value2, "actType");
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

        public Criteria andOAmtIsNull() {
            addCriterion("O_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOAmtIsNotNull() {
            addCriterion("O_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOAmtEqualTo(BigDecimal value) {
            addCriterion("O_AMT =", value, "oAmt");
            return (Criteria) this;
        }

        public Criteria andOAmtNotEqualTo(BigDecimal value) {
            addCriterion("O_AMT <>", value, "oAmt");
            return (Criteria) this;
        }

        public Criteria andOAmtGreaterThan(BigDecimal value) {
            addCriterion("O_AMT >", value, "oAmt");
            return (Criteria) this;
        }

        public Criteria andOAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("O_AMT >=", value, "oAmt");
            return (Criteria) this;
        }

        public Criteria andOAmtLessThan(BigDecimal value) {
            addCriterion("O_AMT <", value, "oAmt");
            return (Criteria) this;
        }

        public Criteria andOAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("O_AMT <=", value, "oAmt");
            return (Criteria) this;
        }

        public Criteria andOAmtIn(List<BigDecimal> values) {
            addCriterion("O_AMT in", values, "oAmt");
            return (Criteria) this;
        }

        public Criteria andOAmtNotIn(List<BigDecimal> values) {
            addCriterion("O_AMT not in", values, "oAmt");
            return (Criteria) this;
        }

        public Criteria andOAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_AMT between", value1, value2, "oAmt");
            return (Criteria) this;
        }

        public Criteria andOAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_AMT not between", value1, value2, "oAmt");
            return (Criteria) this;
        }

        public Criteria andCcyIsNull() {
            addCriterion("CCY is null");
            return (Criteria) this;
        }

        public Criteria andCcyIsNotNull() {
            addCriterion("CCY is not null");
            return (Criteria) this;
        }

        public Criteria andCcyEqualTo(String value) {
            addCriterion("CCY =", value, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyNotEqualTo(String value) {
            addCriterion("CCY <>", value, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyGreaterThan(String value) {
            addCriterion("CCY >", value, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyGreaterThanOrEqualTo(String value) {
            addCriterion("CCY >=", value, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyLessThan(String value) {
            addCriterion("CCY <", value, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyLessThanOrEqualTo(String value) {
            addCriterion("CCY <=", value, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyLike(String value) {
            addCriterion("CCY like", value, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyNotLike(String value) {
            addCriterion("CCY not like", value, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyIn(List<String> values) {
            addCriterion("CCY in", values, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyNotIn(List<String> values) {
            addCriterion("CCY not in", values, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyBetween(String value1, String value2) {
            addCriterion("CCY between", value1, value2, "ccy");
            return (Criteria) this;
        }

        public Criteria andCcyNotBetween(String value1, String value2) {
            addCriterion("CCY not between", value1, value2, "ccy");
            return (Criteria) this;
        }

        public Criteria andExchageRateIsNull() {
            addCriterion("EXCHAGE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andExchageRateIsNotNull() {
            addCriterion("EXCHAGE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andExchageRateEqualTo(BigDecimal value) {
            addCriterion("EXCHAGE_RATE =", value, "exchageRate");
            return (Criteria) this;
        }

        public Criteria andExchageRateNotEqualTo(BigDecimal value) {
            addCriterion("EXCHAGE_RATE <>", value, "exchageRate");
            return (Criteria) this;
        }

        public Criteria andExchageRateGreaterThan(BigDecimal value) {
            addCriterion("EXCHAGE_RATE >", value, "exchageRate");
            return (Criteria) this;
        }

        public Criteria andExchageRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHAGE_RATE >=", value, "exchageRate");
            return (Criteria) this;
        }

        public Criteria andExchageRateLessThan(BigDecimal value) {
            addCriterion("EXCHAGE_RATE <", value, "exchageRate");
            return (Criteria) this;
        }

        public Criteria andExchageRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXCHAGE_RATE <=", value, "exchageRate");
            return (Criteria) this;
        }

        public Criteria andExchageRateIn(List<BigDecimal> values) {
            addCriterion("EXCHAGE_RATE in", values, "exchageRate");
            return (Criteria) this;
        }

        public Criteria andExchageRateNotIn(List<BigDecimal> values) {
            addCriterion("EXCHAGE_RATE not in", values, "exchageRate");
            return (Criteria) this;
        }

        public Criteria andExchageRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHAGE_RATE between", value1, value2, "exchageRate");
            return (Criteria) this;
        }

        public Criteria andExchageRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXCHAGE_RATE not between", value1, value2, "exchageRate");
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

        public Criteria andContractTypeIsNull() {
            addCriterion("CONTRACT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andContractTypeIsNotNull() {
            addCriterion("CONTRACT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andContractTypeEqualTo(String value) {
            addCriterion("CONTRACT_TYPE =", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotEqualTo(String value) {
            addCriterion("CONTRACT_TYPE <>", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThan(String value) {
            addCriterion("CONTRACT_TYPE >", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TYPE >=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThan(String value) {
            addCriterion("CONTRACT_TYPE <", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLessThanOrEqualTo(String value) {
            addCriterion("CONTRACT_TYPE <=", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeLike(String value) {
            addCriterion("CONTRACT_TYPE like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotLike(String value) {
            addCriterion("CONTRACT_TYPE not like", value, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeIn(List<String> values) {
            addCriterion("CONTRACT_TYPE in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotIn(List<String> values) {
            addCriterion("CONTRACT_TYPE not in", values, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeBetween(String value1, String value2) {
            addCriterion("CONTRACT_TYPE between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andContractTypeNotBetween(String value1, String value2) {
            addCriterion("CONTRACT_TYPE not between", value1, value2, "contractType");
            return (Criteria) this;
        }

        public Criteria andVendorNoIsNull() {
            addCriterion("VENDOR_NO is null");
            return (Criteria) this;
        }

        public Criteria andVendorNoIsNotNull() {
            addCriterion("VENDOR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVendorNoEqualTo(String value) {
            addCriterion("VENDOR_NO =", value, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoNotEqualTo(String value) {
            addCriterion("VENDOR_NO <>", value, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoGreaterThan(String value) {
            addCriterion("VENDOR_NO >", value, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoGreaterThanOrEqualTo(String value) {
            addCriterion("VENDOR_NO >=", value, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoLessThan(String value) {
            addCriterion("VENDOR_NO <", value, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoLessThanOrEqualTo(String value) {
            addCriterion("VENDOR_NO <=", value, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoLike(String value) {
            addCriterion("VENDOR_NO like", value, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoNotLike(String value) {
            addCriterion("VENDOR_NO not like", value, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoIn(List<String> values) {
            addCriterion("VENDOR_NO in", values, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoNotIn(List<String> values) {
            addCriterion("VENDOR_NO not in", values, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoBetween(String value1, String value2) {
            addCriterion("VENDOR_NO between", value1, value2, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNoNotBetween(String value1, String value2) {
            addCriterion("VENDOR_NO not between", value1, value2, "vendorNo");
            return (Criteria) this;
        }

        public Criteria andVendorNameIsNull() {
            addCriterion("VENDOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVendorNameIsNotNull() {
            addCriterion("VENDOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVendorNameEqualTo(String value) {
            addCriterion("VENDOR_NAME =", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotEqualTo(String value) {
            addCriterion("VENDOR_NAME <>", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameGreaterThan(String value) {
            addCriterion("VENDOR_NAME >", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameGreaterThanOrEqualTo(String value) {
            addCriterion("VENDOR_NAME >=", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLessThan(String value) {
            addCriterion("VENDOR_NAME <", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLessThanOrEqualTo(String value) {
            addCriterion("VENDOR_NAME <=", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameLike(String value) {
            addCriterion("VENDOR_NAME like", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotLike(String value) {
            addCriterion("VENDOR_NAME not like", value, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameIn(List<String> values) {
            addCriterion("VENDOR_NAME in", values, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotIn(List<String> values) {
            addCriterion("VENDOR_NAME not in", values, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameBetween(String value1, String value2) {
            addCriterion("VENDOR_NAME between", value1, value2, "vendorName");
            return (Criteria) this;
        }

        public Criteria andVendorNameNotBetween(String value1, String value2) {
            addCriterion("VENDOR_NAME not between", value1, value2, "vendorName");
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

        public Criteria andVocIdIsNull() {
            addCriterion("VOC_ID is null");
            return (Criteria) this;
        }

        public Criteria andVocIdIsNotNull() {
            addCriterion("VOC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVocIdEqualTo(String value) {
            addCriterion("VOC_ID =", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdNotEqualTo(String value) {
            addCriterion("VOC_ID <>", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdGreaterThan(String value) {
            addCriterion("VOC_ID >", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_ID >=", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdLessThan(String value) {
            addCriterion("VOC_ID <", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdLessThanOrEqualTo(String value) {
            addCriterion("VOC_ID <=", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdLike(String value) {
            addCriterion("VOC_ID like", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdNotLike(String value) {
            addCriterion("VOC_ID not like", value, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdIn(List<String> values) {
            addCriterion("VOC_ID in", values, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdNotIn(List<String> values) {
            addCriterion("VOC_ID not in", values, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdBetween(String value1, String value2) {
            addCriterion("VOC_ID between", value1, value2, "vocId");
            return (Criteria) this;
        }

        public Criteria andVocIdNotBetween(String value1, String value2) {
            addCriterion("VOC_ID not between", value1, value2, "vocId");
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

        public Criteria andIsTaxIsNull() {
            addCriterion("IS_TAX is null");
            return (Criteria) this;
        }

        public Criteria andIsTaxIsNotNull() {
            addCriterion("IS_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andIsTaxEqualTo(String value) {
            addCriterion("IS_TAX =", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotEqualTo(String value) {
            addCriterion("IS_TAX <>", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxGreaterThan(String value) {
            addCriterion("IS_TAX >", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxGreaterThanOrEqualTo(String value) {
            addCriterion("IS_TAX >=", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxLessThan(String value) {
            addCriterion("IS_TAX <", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxLessThanOrEqualTo(String value) {
            addCriterion("IS_TAX <=", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxLike(String value) {
            addCriterion("IS_TAX like", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotLike(String value) {
            addCriterion("IS_TAX not like", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxIn(List<String> values) {
            addCriterion("IS_TAX in", values, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotIn(List<String> values) {
            addCriterion("IS_TAX not in", values, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxBetween(String value1, String value2) {
            addCriterion("IS_TAX between", value1, value2, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotBetween(String value1, String value2) {
            addCriterion("IS_TAX not between", value1, value2, "isTax");
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

        public Criteria andExpAmtIsNull() {
            addCriterion("EXP_AMT is null");
            return (Criteria) this;
        }

        public Criteria andExpAmtIsNotNull() {
            addCriterion("EXP_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andExpAmtEqualTo(BigDecimal value) {
            addCriterion("EXP_AMT =", value, "expAmt");
            return (Criteria) this;
        }

        public Criteria andExpAmtNotEqualTo(BigDecimal value) {
            addCriterion("EXP_AMT <>", value, "expAmt");
            return (Criteria) this;
        }

        public Criteria andExpAmtGreaterThan(BigDecimal value) {
            addCriterion("EXP_AMT >", value, "expAmt");
            return (Criteria) this;
        }

        public Criteria andExpAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXP_AMT >=", value, "expAmt");
            return (Criteria) this;
        }

        public Criteria andExpAmtLessThan(BigDecimal value) {
            addCriterion("EXP_AMT <", value, "expAmt");
            return (Criteria) this;
        }

        public Criteria andExpAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXP_AMT <=", value, "expAmt");
            return (Criteria) this;
        }

        public Criteria andExpAmtIn(List<BigDecimal> values) {
            addCriterion("EXP_AMT in", values, "expAmt");
            return (Criteria) this;
        }

        public Criteria andExpAmtNotIn(List<BigDecimal> values) {
            addCriterion("EXP_AMT not in", values, "expAmt");
            return (Criteria) this;
        }

        public Criteria andExpAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXP_AMT between", value1, value2, "expAmt");
            return (Criteria) this;
        }

        public Criteria andExpAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXP_AMT not between", value1, value2, "expAmt");
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

        public Criteria andHasVocIsNull() {
            addCriterion("HAS_VOC is null");
            return (Criteria) this;
        }

        public Criteria andHasVocIsNotNull() {
            addCriterion("HAS_VOC is not null");
            return (Criteria) this;
        }

        public Criteria andHasVocEqualTo(String value) {
            addCriterion("HAS_VOC =", value, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocNotEqualTo(String value) {
            addCriterion("HAS_VOC <>", value, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocGreaterThan(String value) {
            addCriterion("HAS_VOC >", value, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_VOC >=", value, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocLessThan(String value) {
            addCriterion("HAS_VOC <", value, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocLessThanOrEqualTo(String value) {
            addCriterion("HAS_VOC <=", value, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocLike(String value) {
            addCriterion("HAS_VOC like", value, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocNotLike(String value) {
            addCriterion("HAS_VOC not like", value, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocIn(List<String> values) {
            addCriterion("HAS_VOC in", values, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocNotIn(List<String> values) {
            addCriterion("HAS_VOC not in", values, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocBetween(String value1, String value2) {
            addCriterion("HAS_VOC between", value1, value2, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andHasVocNotBetween(String value1, String value2) {
            addCriterion("HAS_VOC not between", value1, value2, "hasVoc");
            return (Criteria) this;
        }

        public Criteria andDeductTypeIsNull() {
            addCriterion("DEDUCT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeductTypeIsNotNull() {
            addCriterion("DEDUCT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeductTypeEqualTo(String value) {
            addCriterion("DEDUCT_TYPE =", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeNotEqualTo(String value) {
            addCriterion("DEDUCT_TYPE <>", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeGreaterThan(String value) {
            addCriterion("DEDUCT_TYPE >", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEDUCT_TYPE >=", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeLessThan(String value) {
            addCriterion("DEDUCT_TYPE <", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeLessThanOrEqualTo(String value) {
            addCriterion("DEDUCT_TYPE <=", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeLike(String value) {
            addCriterion("DEDUCT_TYPE like", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeNotLike(String value) {
            addCriterion("DEDUCT_TYPE not like", value, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeIn(List<String> values) {
            addCriterion("DEDUCT_TYPE in", values, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeNotIn(List<String> values) {
            addCriterion("DEDUCT_TYPE not in", values, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeBetween(String value1, String value2) {
            addCriterion("DEDUCT_TYPE between", value1, value2, "deductType");
            return (Criteria) this;
        }

        public Criteria andDeductTypeNotBetween(String value1, String value2) {
            addCriterion("DEDUCT_TYPE not between", value1, value2, "deductType");
            return (Criteria) this;
        }

        public Criteria andOutTypeIsNull() {
            addCriterion("OUT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOutTypeIsNotNull() {
            addCriterion("OUT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOutTypeEqualTo(String value) {
            addCriterion("OUT_TYPE =", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotEqualTo(String value) {
            addCriterion("OUT_TYPE <>", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeGreaterThan(String value) {
            addCriterion("OUT_TYPE >", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_TYPE >=", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLessThan(String value) {
            addCriterion("OUT_TYPE <", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLessThanOrEqualTo(String value) {
            addCriterion("OUT_TYPE <=", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeLike(String value) {
            addCriterion("OUT_TYPE like", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotLike(String value) {
            addCriterion("OUT_TYPE not like", value, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeIn(List<String> values) {
            addCriterion("OUT_TYPE in", values, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotIn(List<String> values) {
            addCriterion("OUT_TYPE not in", values, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeBetween(String value1, String value2) {
            addCriterion("OUT_TYPE between", value1, value2, "outType");
            return (Criteria) this;
        }

        public Criteria andOutTypeNotBetween(String value1, String value2) {
            addCriterion("OUT_TYPE not between", value1, value2, "outType");
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

        public Criteria andVendorIdIsNull() {
            addCriterion("VENDOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andVendorIdIsNotNull() {
            addCriterion("VENDOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVendorIdEqualTo(String value) {
            addCriterion("VENDOR_ID =", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotEqualTo(String value) {
            addCriterion("VENDOR_ID <>", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdGreaterThan(String value) {
            addCriterion("VENDOR_ID >", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdGreaterThanOrEqualTo(String value) {
            addCriterion("VENDOR_ID >=", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdLessThan(String value) {
            addCriterion("VENDOR_ID <", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdLessThanOrEqualTo(String value) {
            addCriterion("VENDOR_ID <=", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdLike(String value) {
            addCriterion("VENDOR_ID like", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotLike(String value) {
            addCriterion("VENDOR_ID not like", value, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdIn(List<String> values) {
            addCriterion("VENDOR_ID in", values, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotIn(List<String> values) {
            addCriterion("VENDOR_ID not in", values, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdBetween(String value1, String value2) {
            addCriterion("VENDOR_ID between", value1, value2, "vendorId");
            return (Criteria) this;
        }

        public Criteria andVendorIdNotBetween(String value1, String value2) {
            addCriterion("VENDOR_ID not between", value1, value2, "vendorId");
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

        public Criteria andUsageIsNull() {
            addCriterion("USAGE is null");
            return (Criteria) this;
        }

        public Criteria andUsageIsNotNull() {
            addCriterion("USAGE is not null");
            return (Criteria) this;
        }

        public Criteria andUsageEqualTo(String value) {
            addCriterion("USAGE =", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotEqualTo(String value) {
            addCriterion("USAGE <>", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThan(String value) {
            addCriterion("USAGE >", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageGreaterThanOrEqualTo(String value) {
            addCriterion("USAGE >=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThan(String value) {
            addCriterion("USAGE <", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLessThanOrEqualTo(String value) {
            addCriterion("USAGE <=", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageLike(String value) {
            addCriterion("USAGE like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotLike(String value) {
            addCriterion("USAGE not like", value, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageIn(List<String> values) {
            addCriterion("USAGE in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotIn(List<String> values) {
            addCriterion("USAGE not in", values, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageBetween(String value1, String value2) {
            addCriterion("USAGE between", value1, value2, "usage");
            return (Criteria) this;
        }

        public Criteria andUsageNotBetween(String value1, String value2) {
            addCriterion("USAGE not between", value1, value2, "usage");
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

        public Criteria andOriTxidIsNull() {
            addCriterion("ORI_TXID is null");
            return (Criteria) this;
        }

        public Criteria andOriTxidIsNotNull() {
            addCriterion("ORI_TXID is not null");
            return (Criteria) this;
        }

        public Criteria andOriTxidEqualTo(String value) {
            addCriterion("ORI_TXID =", value, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidNotEqualTo(String value) {
            addCriterion("ORI_TXID <>", value, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidGreaterThan(String value) {
            addCriterion("ORI_TXID >", value, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidGreaterThanOrEqualTo(String value) {
            addCriterion("ORI_TXID >=", value, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidLessThan(String value) {
            addCriterion("ORI_TXID <", value, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidLessThanOrEqualTo(String value) {
            addCriterion("ORI_TXID <=", value, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidLike(String value) {
            addCriterion("ORI_TXID like", value, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidNotLike(String value) {
            addCriterion("ORI_TXID not like", value, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidIn(List<String> values) {
            addCriterion("ORI_TXID in", values, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidNotIn(List<String> values) {
            addCriterion("ORI_TXID not in", values, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidBetween(String value1, String value2) {
            addCriterion("ORI_TXID between", value1, value2, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andOriTxidNotBetween(String value1, String value2) {
            addCriterion("ORI_TXID not between", value1, value2, "oriTxid");
            return (Criteria) this;
        }

        public Criteria andValueDateIsNull() {
            addCriterion("VALUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andValueDateIsNotNull() {
            addCriterion("VALUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andValueDateEqualTo(String value) {
            addCriterion("VALUE_DATE =", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateNotEqualTo(String value) {
            addCriterion("VALUE_DATE <>", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateGreaterThan(String value) {
            addCriterion("VALUE_DATE >", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateGreaterThanOrEqualTo(String value) {
            addCriterion("VALUE_DATE >=", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateLessThan(String value) {
            addCriterion("VALUE_DATE <", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateLessThanOrEqualTo(String value) {
            addCriterion("VALUE_DATE <=", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateLike(String value) {
            addCriterion("VALUE_DATE like", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateNotLike(String value) {
            addCriterion("VALUE_DATE not like", value, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateIn(List<String> values) {
            addCriterion("VALUE_DATE in", values, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateNotIn(List<String> values) {
            addCriterion("VALUE_DATE not in", values, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateBetween(String value1, String value2) {
            addCriterion("VALUE_DATE between", value1, value2, "valueDate");
            return (Criteria) this;
        }

        public Criteria andValueDateNotBetween(String value1, String value2) {
            addCriterion("VALUE_DATE not between", value1, value2, "valueDate");
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

        public Criteria andOTaxAmtIsNull() {
            addCriterion("O_TAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtIsNotNull() {
            addCriterion("O_TAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtEqualTo(BigDecimal value) {
            addCriterion("O_TAX_AMT =", value, "oTaxAmt");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("O_TAX_AMT <>", value, "oTaxAmt");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtGreaterThan(BigDecimal value) {
            addCriterion("O_TAX_AMT >", value, "oTaxAmt");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("O_TAX_AMT >=", value, "oTaxAmt");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtLessThan(BigDecimal value) {
            addCriterion("O_TAX_AMT <", value, "oTaxAmt");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("O_TAX_AMT <=", value, "oTaxAmt");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtIn(List<BigDecimal> values) {
            addCriterion("O_TAX_AMT in", values, "oTaxAmt");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("O_TAX_AMT not in", values, "oTaxAmt");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_TAX_AMT between", value1, value2, "oTaxAmt");
            return (Criteria) this;
        }

        public Criteria andOTaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_TAX_AMT not between", value1, value2, "oTaxAmt");
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

        public Criteria andIsAllCcIsNull() {
            addCriterion("IS_ALL_CC is null");
            return (Criteria) this;
        }

        public Criteria andIsAllCcIsNotNull() {
            addCriterion("IS_ALL_CC is not null");
            return (Criteria) this;
        }

        public Criteria andIsAllCcEqualTo(String value) {
            addCriterion("IS_ALL_CC =", value, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcNotEqualTo(String value) {
            addCriterion("IS_ALL_CC <>", value, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcGreaterThan(String value) {
            addCriterion("IS_ALL_CC >", value, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ALL_CC >=", value, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcLessThan(String value) {
            addCriterion("IS_ALL_CC <", value, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcLessThanOrEqualTo(String value) {
            addCriterion("IS_ALL_CC <=", value, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcLike(String value) {
            addCriterion("IS_ALL_CC like", value, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcNotLike(String value) {
            addCriterion("IS_ALL_CC not like", value, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcIn(List<String> values) {
            addCriterion("IS_ALL_CC in", values, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcNotIn(List<String> values) {
            addCriterion("IS_ALL_CC not in", values, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcBetween(String value1, String value2) {
            addCriterion("IS_ALL_CC between", value1, value2, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andIsAllCcNotBetween(String value1, String value2) {
            addCriterion("IS_ALL_CC not between", value1, value2, "isAllCc");
            return (Criteria) this;
        }

        public Criteria andDeductPercIsNull() {
            addCriterion("DEDUCT_PERC is null");
            return (Criteria) this;
        }

        public Criteria andDeductPercIsNotNull() {
            addCriterion("DEDUCT_PERC is not null");
            return (Criteria) this;
        }

        public Criteria andDeductPercEqualTo(String value) {
            addCriterion("DEDUCT_PERC =", value, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercNotEqualTo(String value) {
            addCriterion("DEDUCT_PERC <>", value, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercGreaterThan(String value) {
            addCriterion("DEDUCT_PERC >", value, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercGreaterThanOrEqualTo(String value) {
            addCriterion("DEDUCT_PERC >=", value, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercLessThan(String value) {
            addCriterion("DEDUCT_PERC <", value, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercLessThanOrEqualTo(String value) {
            addCriterion("DEDUCT_PERC <=", value, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercLike(String value) {
            addCriterion("DEDUCT_PERC like", value, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercNotLike(String value) {
            addCriterion("DEDUCT_PERC not like", value, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercIn(List<String> values) {
            addCriterion("DEDUCT_PERC in", values, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercNotIn(List<String> values) {
            addCriterion("DEDUCT_PERC not in", values, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercBetween(String value1, String value2) {
            addCriterion("DEDUCT_PERC between", value1, value2, "deductPerc");
            return (Criteria) this;
        }

        public Criteria andDeductPercNotBetween(String value1, String value2) {
            addCriterion("DEDUCT_PERC not between", value1, value2, "deductPerc");
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

        public Criteria andImpTaxAmtIsNull() {
            addCriterion("IMP_TAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtIsNotNull() {
            addCriterion("IMP_TAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtEqualTo(BigDecimal value) {
            addCriterion("IMP_TAX_AMT =", value, "impTaxAmt");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("IMP_TAX_AMT <>", value, "impTaxAmt");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtGreaterThan(BigDecimal value) {
            addCriterion("IMP_TAX_AMT >", value, "impTaxAmt");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IMP_TAX_AMT >=", value, "impTaxAmt");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtLessThan(BigDecimal value) {
            addCriterion("IMP_TAX_AMT <", value, "impTaxAmt");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IMP_TAX_AMT <=", value, "impTaxAmt");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtIn(List<BigDecimal> values) {
            addCriterion("IMP_TAX_AMT in", values, "impTaxAmt");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("IMP_TAX_AMT not in", values, "impTaxAmt");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMP_TAX_AMT between", value1, value2, "impTaxAmt");
            return (Criteria) this;
        }

        public Criteria andImpTaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMP_TAX_AMT not between", value1, value2, "impTaxAmt");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateIsNull() {
            addCriterion("IMP_TAX_RATE is null");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateIsNotNull() {
            addCriterion("IMP_TAX_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateEqualTo(BigDecimal value) {
            addCriterion("IMP_TAX_RATE =", value, "impTaxRate");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("IMP_TAX_RATE <>", value, "impTaxRate");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateGreaterThan(BigDecimal value) {
            addCriterion("IMP_TAX_RATE >", value, "impTaxRate");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IMP_TAX_RATE >=", value, "impTaxRate");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateLessThan(BigDecimal value) {
            addCriterion("IMP_TAX_RATE <", value, "impTaxRate");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IMP_TAX_RATE <=", value, "impTaxRate");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateIn(List<BigDecimal> values) {
            addCriterion("IMP_TAX_RATE in", values, "impTaxRate");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("IMP_TAX_RATE not in", values, "impTaxRate");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMP_TAX_RATE between", value1, value2, "impTaxRate");
            return (Criteria) this;
        }

        public Criteria andImpTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMP_TAX_RATE not between", value1, value2, "impTaxRate");
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