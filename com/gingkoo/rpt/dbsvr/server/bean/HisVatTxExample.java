package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HisVatTxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HisVatTxExample() {
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

        public Criteria andHasTaxIsNull() {
            addCriterion("HAS_TAX is null");
            return (Criteria) this;
        }

        public Criteria andHasTaxIsNotNull() {
            addCriterion("HAS_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andHasTaxEqualTo(String value) {
            addCriterion("HAS_TAX =", value, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxNotEqualTo(String value) {
            addCriterion("HAS_TAX <>", value, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxGreaterThan(String value) {
            addCriterion("HAS_TAX >", value, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxGreaterThanOrEqualTo(String value) {
            addCriterion("HAS_TAX >=", value, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxLessThan(String value) {
            addCriterion("HAS_TAX <", value, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxLessThanOrEqualTo(String value) {
            addCriterion("HAS_TAX <=", value, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxLike(String value) {
            addCriterion("HAS_TAX like", value, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxNotLike(String value) {
            addCriterion("HAS_TAX not like", value, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxIn(List<String> values) {
            addCriterion("HAS_TAX in", values, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxNotIn(List<String> values) {
            addCriterion("HAS_TAX not in", values, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxBetween(String value1, String value2) {
            addCriterion("HAS_TAX between", value1, value2, "hasTax");
            return (Criteria) this;
        }

        public Criteria andHasTaxNotBetween(String value1, String value2) {
            addCriterion("HAS_TAX not between", value1, value2, "hasTax");
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

        public Criteria andNeedVocFlagIsNull() {
            addCriterion("NEED_VOC_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagIsNotNull() {
            addCriterion("NEED_VOC_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagEqualTo(String value) {
            addCriterion("NEED_VOC_FLAG =", value, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagNotEqualTo(String value) {
            addCriterion("NEED_VOC_FLAG <>", value, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagGreaterThan(String value) {
            addCriterion("NEED_VOC_FLAG >", value, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagGreaterThanOrEqualTo(String value) {
            addCriterion("NEED_VOC_FLAG >=", value, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagLessThan(String value) {
            addCriterion("NEED_VOC_FLAG <", value, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagLessThanOrEqualTo(String value) {
            addCriterion("NEED_VOC_FLAG <=", value, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagLike(String value) {
            addCriterion("NEED_VOC_FLAG like", value, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagNotLike(String value) {
            addCriterion("NEED_VOC_FLAG not like", value, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagIn(List<String> values) {
            addCriterion("NEED_VOC_FLAG in", values, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagNotIn(List<String> values) {
            addCriterion("NEED_VOC_FLAG not in", values, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagBetween(String value1, String value2) {
            addCriterion("NEED_VOC_FLAG between", value1, value2, "needVocFlag");
            return (Criteria) this;
        }

        public Criteria andNeedVocFlagNotBetween(String value1, String value2) {
            addCriterion("NEED_VOC_FLAG not between", value1, value2, "needVocFlag");
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

        public Criteria andIdentifyFlagIsNull() {
            addCriterion("IDENTIFY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagIsNotNull() {
            addCriterion("IDENTIFY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagEqualTo(String value) {
            addCriterion("IDENTIFY_FLAG =", value, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagNotEqualTo(String value) {
            addCriterion("IDENTIFY_FLAG <>", value, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagGreaterThan(String value) {
            addCriterion("IDENTIFY_FLAG >", value, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTIFY_FLAG >=", value, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagLessThan(String value) {
            addCriterion("IDENTIFY_FLAG <", value, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagLessThanOrEqualTo(String value) {
            addCriterion("IDENTIFY_FLAG <=", value, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagLike(String value) {
            addCriterion("IDENTIFY_FLAG like", value, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagNotLike(String value) {
            addCriterion("IDENTIFY_FLAG not like", value, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagIn(List<String> values) {
            addCriterion("IDENTIFY_FLAG in", values, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagNotIn(List<String> values) {
            addCriterion("IDENTIFY_FLAG not in", values, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagBetween(String value1, String value2) {
            addCriterion("IDENTIFY_FLAG between", value1, value2, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andIdentifyFlagNotBetween(String value1, String value2) {
            addCriterion("IDENTIFY_FLAG not between", value1, value2, "identifyFlag");
            return (Criteria) this;
        }

        public Criteria andTxStatusIsNull() {
            addCriterion("TX_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTxStatusIsNotNull() {
            addCriterion("TX_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTxStatusEqualTo(String value) {
            addCriterion("TX_STATUS =", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusNotEqualTo(String value) {
            addCriterion("TX_STATUS <>", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusGreaterThan(String value) {
            addCriterion("TX_STATUS >", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TX_STATUS >=", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusLessThan(String value) {
            addCriterion("TX_STATUS <", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusLessThanOrEqualTo(String value) {
            addCriterion("TX_STATUS <=", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusLike(String value) {
            addCriterion("TX_STATUS like", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusNotLike(String value) {
            addCriterion("TX_STATUS not like", value, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusIn(List<String> values) {
            addCriterion("TX_STATUS in", values, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusNotIn(List<String> values) {
            addCriterion("TX_STATUS not in", values, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusBetween(String value1, String value2) {
            addCriterion("TX_STATUS between", value1, value2, "txStatus");
            return (Criteria) this;
        }

        public Criteria andTxStatusNotBetween(String value1, String value2) {
            addCriterion("TX_STATUS not between", value1, value2, "txStatus");
            return (Criteria) this;
        }

        public Criteria andRevTxidIsNull() {
            addCriterion("REV_TXID is null");
            return (Criteria) this;
        }

        public Criteria andRevTxidIsNotNull() {
            addCriterion("REV_TXID is not null");
            return (Criteria) this;
        }

        public Criteria andRevTxidEqualTo(String value) {
            addCriterion("REV_TXID =", value, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidNotEqualTo(String value) {
            addCriterion("REV_TXID <>", value, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidGreaterThan(String value) {
            addCriterion("REV_TXID >", value, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidGreaterThanOrEqualTo(String value) {
            addCriterion("REV_TXID >=", value, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidLessThan(String value) {
            addCriterion("REV_TXID <", value, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidLessThanOrEqualTo(String value) {
            addCriterion("REV_TXID <=", value, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidLike(String value) {
            addCriterion("REV_TXID like", value, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidNotLike(String value) {
            addCriterion("REV_TXID not like", value, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidIn(List<String> values) {
            addCriterion("REV_TXID in", values, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidNotIn(List<String> values) {
            addCriterion("REV_TXID not in", values, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidBetween(String value1, String value2) {
            addCriterion("REV_TXID between", value1, value2, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevTxidNotBetween(String value1, String value2) {
            addCriterion("REV_TXID not between", value1, value2, "revTxid");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoIsNull() {
            addCriterion("REV_SEQNO is null");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoIsNotNull() {
            addCriterion("REV_SEQNO is not null");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoEqualTo(String value) {
            addCriterion("REV_SEQNO =", value, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoNotEqualTo(String value) {
            addCriterion("REV_SEQNO <>", value, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoGreaterThan(String value) {
            addCriterion("REV_SEQNO >", value, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoGreaterThanOrEqualTo(String value) {
            addCriterion("REV_SEQNO >=", value, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoLessThan(String value) {
            addCriterion("REV_SEQNO <", value, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoLessThanOrEqualTo(String value) {
            addCriterion("REV_SEQNO <=", value, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoLike(String value) {
            addCriterion("REV_SEQNO like", value, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoNotLike(String value) {
            addCriterion("REV_SEQNO not like", value, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoIn(List<String> values) {
            addCriterion("REV_SEQNO in", values, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoNotIn(List<String> values) {
            addCriterion("REV_SEQNO not in", values, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoBetween(String value1, String value2) {
            addCriterion("REV_SEQNO between", value1, value2, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevSeqnoNotBetween(String value1, String value2) {
            addCriterion("REV_SEQNO not between", value1, value2, "revSeqno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoIsNull() {
            addCriterion("REV_BRNO is null");
            return (Criteria) this;
        }

        public Criteria andRevBrnoIsNotNull() {
            addCriterion("REV_BRNO is not null");
            return (Criteria) this;
        }

        public Criteria andRevBrnoEqualTo(String value) {
            addCriterion("REV_BRNO =", value, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoNotEqualTo(String value) {
            addCriterion("REV_BRNO <>", value, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoGreaterThan(String value) {
            addCriterion("REV_BRNO >", value, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoGreaterThanOrEqualTo(String value) {
            addCriterion("REV_BRNO >=", value, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoLessThan(String value) {
            addCriterion("REV_BRNO <", value, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoLessThanOrEqualTo(String value) {
            addCriterion("REV_BRNO <=", value, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoLike(String value) {
            addCriterion("REV_BRNO like", value, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoNotLike(String value) {
            addCriterion("REV_BRNO not like", value, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoIn(List<String> values) {
            addCriterion("REV_BRNO in", values, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoNotIn(List<String> values) {
            addCriterion("REV_BRNO not in", values, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoBetween(String value1, String value2) {
            addCriterion("REV_BRNO between", value1, value2, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevBrnoNotBetween(String value1, String value2) {
            addCriterion("REV_BRNO not between", value1, value2, "revBrno");
            return (Criteria) this;
        }

        public Criteria andRevDateIsNull() {
            addCriterion("REV_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRevDateIsNotNull() {
            addCriterion("REV_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRevDateEqualTo(String value) {
            addCriterion("REV_DATE =", value, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateNotEqualTo(String value) {
            addCriterion("REV_DATE <>", value, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateGreaterThan(String value) {
            addCriterion("REV_DATE >", value, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateGreaterThanOrEqualTo(String value) {
            addCriterion("REV_DATE >=", value, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateLessThan(String value) {
            addCriterion("REV_DATE <", value, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateLessThanOrEqualTo(String value) {
            addCriterion("REV_DATE <=", value, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateLike(String value) {
            addCriterion("REV_DATE like", value, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateNotLike(String value) {
            addCriterion("REV_DATE not like", value, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateIn(List<String> values) {
            addCriterion("REV_DATE in", values, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateNotIn(List<String> values) {
            addCriterion("REV_DATE not in", values, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateBetween(String value1, String value2) {
            addCriterion("REV_DATE between", value1, value2, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevDateNotBetween(String value1, String value2) {
            addCriterion("REV_DATE not between", value1, value2, "revDate");
            return (Criteria) this;
        }

        public Criteria andRevAmtIsNull() {
            addCriterion("REV_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRevAmtIsNotNull() {
            addCriterion("REV_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRevAmtEqualTo(BigDecimal value) {
            addCriterion("REV_AMT =", value, "revAmt");
            return (Criteria) this;
        }

        public Criteria andRevAmtNotEqualTo(BigDecimal value) {
            addCriterion("REV_AMT <>", value, "revAmt");
            return (Criteria) this;
        }

        public Criteria andRevAmtGreaterThan(BigDecimal value) {
            addCriterion("REV_AMT >", value, "revAmt");
            return (Criteria) this;
        }

        public Criteria andRevAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REV_AMT >=", value, "revAmt");
            return (Criteria) this;
        }

        public Criteria andRevAmtLessThan(BigDecimal value) {
            addCriterion("REV_AMT <", value, "revAmt");
            return (Criteria) this;
        }

        public Criteria andRevAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REV_AMT <=", value, "revAmt");
            return (Criteria) this;
        }

        public Criteria andRevAmtIn(List<BigDecimal> values) {
            addCriterion("REV_AMT in", values, "revAmt");
            return (Criteria) this;
        }

        public Criteria andRevAmtNotIn(List<BigDecimal> values) {
            addCriterion("REV_AMT not in", values, "revAmt");
            return (Criteria) this;
        }

        public Criteria andRevAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REV_AMT between", value1, value2, "revAmt");
            return (Criteria) this;
        }

        public Criteria andRevAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REV_AMT not between", value1, value2, "revAmt");
            return (Criteria) this;
        }

        public Criteria andRevOAmtIsNull() {
            addCriterion("REV_O_AMT is null");
            return (Criteria) this;
        }

        public Criteria andRevOAmtIsNotNull() {
            addCriterion("REV_O_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andRevOAmtEqualTo(BigDecimal value) {
            addCriterion("REV_O_AMT =", value, "revOAmt");
            return (Criteria) this;
        }

        public Criteria andRevOAmtNotEqualTo(BigDecimal value) {
            addCriterion("REV_O_AMT <>", value, "revOAmt");
            return (Criteria) this;
        }

        public Criteria andRevOAmtGreaterThan(BigDecimal value) {
            addCriterion("REV_O_AMT >", value, "revOAmt");
            return (Criteria) this;
        }

        public Criteria andRevOAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REV_O_AMT >=", value, "revOAmt");
            return (Criteria) this;
        }

        public Criteria andRevOAmtLessThan(BigDecimal value) {
            addCriterion("REV_O_AMT <", value, "revOAmt");
            return (Criteria) this;
        }

        public Criteria andRevOAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REV_O_AMT <=", value, "revOAmt");
            return (Criteria) this;
        }

        public Criteria andRevOAmtIn(List<BigDecimal> values) {
            addCriterion("REV_O_AMT in", values, "revOAmt");
            return (Criteria) this;
        }

        public Criteria andRevOAmtNotIn(List<BigDecimal> values) {
            addCriterion("REV_O_AMT not in", values, "revOAmt");
            return (Criteria) this;
        }

        public Criteria andRevOAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REV_O_AMT between", value1, value2, "revOAmt");
            return (Criteria) this;
        }

        public Criteria andRevOAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REV_O_AMT not between", value1, value2, "revOAmt");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxIsNull() {
            addCriterion("IS_CALC_TAX is null");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxIsNotNull() {
            addCriterion("IS_CALC_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxEqualTo(String value) {
            addCriterion("IS_CALC_TAX =", value, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxNotEqualTo(String value) {
            addCriterion("IS_CALC_TAX <>", value, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxGreaterThan(String value) {
            addCriterion("IS_CALC_TAX >", value, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CALC_TAX >=", value, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxLessThan(String value) {
            addCriterion("IS_CALC_TAX <", value, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxLessThanOrEqualTo(String value) {
            addCriterion("IS_CALC_TAX <=", value, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxLike(String value) {
            addCriterion("IS_CALC_TAX like", value, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxNotLike(String value) {
            addCriterion("IS_CALC_TAX not like", value, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxIn(List<String> values) {
            addCriterion("IS_CALC_TAX in", values, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxNotIn(List<String> values) {
            addCriterion("IS_CALC_TAX not in", values, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxBetween(String value1, String value2) {
            addCriterion("IS_CALC_TAX between", value1, value2, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andIsCalcTaxNotBetween(String value1, String value2) {
            addCriterion("IS_CALC_TAX not between", value1, value2, "isCalcTax");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagIsNull() {
            addCriterion("RECEIPT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagIsNotNull() {
            addCriterion("RECEIPT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagEqualTo(String value) {
            addCriterion("RECEIPT_FLAG =", value, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagNotEqualTo(String value) {
            addCriterion("RECEIPT_FLAG <>", value, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagGreaterThan(String value) {
            addCriterion("RECEIPT_FLAG >", value, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIPT_FLAG >=", value, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagLessThan(String value) {
            addCriterion("RECEIPT_FLAG <", value, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagLessThanOrEqualTo(String value) {
            addCriterion("RECEIPT_FLAG <=", value, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagLike(String value) {
            addCriterion("RECEIPT_FLAG like", value, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagNotLike(String value) {
            addCriterion("RECEIPT_FLAG not like", value, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagIn(List<String> values) {
            addCriterion("RECEIPT_FLAG in", values, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagNotIn(List<String> values) {
            addCriterion("RECEIPT_FLAG not in", values, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagBetween(String value1, String value2) {
            addCriterion("RECEIPT_FLAG between", value1, value2, "receiptFlag");
            return (Criteria) this;
        }

        public Criteria andReceiptFlagNotBetween(String value1, String value2) {
            addCriterion("RECEIPT_FLAG not between", value1, value2, "receiptFlag");
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

        public Criteria andIsLikesaleIsNull() {
            addCriterion("IS_LIKESALE is null");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleIsNotNull() {
            addCriterion("IS_LIKESALE is not null");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleEqualTo(String value) {
            addCriterion("IS_LIKESALE =", value, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleNotEqualTo(String value) {
            addCriterion("IS_LIKESALE <>", value, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleGreaterThan(String value) {
            addCriterion("IS_LIKESALE >", value, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LIKESALE >=", value, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleLessThan(String value) {
            addCriterion("IS_LIKESALE <", value, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleLessThanOrEqualTo(String value) {
            addCriterion("IS_LIKESALE <=", value, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleLike(String value) {
            addCriterion("IS_LIKESALE like", value, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleNotLike(String value) {
            addCriterion("IS_LIKESALE not like", value, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleIn(List<String> values) {
            addCriterion("IS_LIKESALE in", values, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleNotIn(List<String> values) {
            addCriterion("IS_LIKESALE not in", values, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleBetween(String value1, String value2) {
            addCriterion("IS_LIKESALE between", value1, value2, "isLikesale");
            return (Criteria) this;
        }

        public Criteria andIsLikesaleNotBetween(String value1, String value2) {
            addCriterion("IS_LIKESALE not between", value1, value2, "isLikesale");
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

        public Criteria andCustIdIsNull() {
            addCriterion("CUST_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("CUST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(String value) {
            addCriterion("CUST_ID =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(String value) {
            addCriterion("CUST_ID <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(String value) {
            addCriterion("CUST_ID >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_ID >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(String value) {
            addCriterion("CUST_ID <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(String value) {
            addCriterion("CUST_ID <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLike(String value) {
            addCriterion("CUST_ID like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotLike(String value) {
            addCriterion("CUST_ID not like", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<String> values) {
            addCriterion("CUST_ID in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<String> values) {
            addCriterion("CUST_ID not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(String value1, String value2) {
            addCriterion("CUST_ID between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(String value1, String value2) {
            addCriterion("CUST_ID not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagIsNull() {
            addCriterion("HAND_IDENTIFY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagIsNotNull() {
            addCriterion("HAND_IDENTIFY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagEqualTo(String value) {
            addCriterion("HAND_IDENTIFY_FLAG =", value, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagNotEqualTo(String value) {
            addCriterion("HAND_IDENTIFY_FLAG <>", value, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagGreaterThan(String value) {
            addCriterion("HAND_IDENTIFY_FLAG >", value, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("HAND_IDENTIFY_FLAG >=", value, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagLessThan(String value) {
            addCriterion("HAND_IDENTIFY_FLAG <", value, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagLessThanOrEqualTo(String value) {
            addCriterion("HAND_IDENTIFY_FLAG <=", value, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagLike(String value) {
            addCriterion("HAND_IDENTIFY_FLAG like", value, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagNotLike(String value) {
            addCriterion("HAND_IDENTIFY_FLAG not like", value, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagIn(List<String> values) {
            addCriterion("HAND_IDENTIFY_FLAG in", values, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagNotIn(List<String> values) {
            addCriterion("HAND_IDENTIFY_FLAG not in", values, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagBetween(String value1, String value2) {
            addCriterion("HAND_IDENTIFY_FLAG between", value1, value2, "handIdentifyFlag");
            return (Criteria) this;
        }

        public Criteria andHandIdentifyFlagNotBetween(String value1, String value2) {
            addCriterion("HAND_IDENTIFY_FLAG not between", value1, value2, "handIdentifyFlag");
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

        public Criteria andImpIncomeAmtIsNull() {
            addCriterion("IMP_INCOME_AMT is null");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtIsNotNull() {
            addCriterion("IMP_INCOME_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtEqualTo(BigDecimal value) {
            addCriterion("IMP_INCOME_AMT =", value, "impIncomeAmt");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtNotEqualTo(BigDecimal value) {
            addCriterion("IMP_INCOME_AMT <>", value, "impIncomeAmt");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtGreaterThan(BigDecimal value) {
            addCriterion("IMP_INCOME_AMT >", value, "impIncomeAmt");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IMP_INCOME_AMT >=", value, "impIncomeAmt");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtLessThan(BigDecimal value) {
            addCriterion("IMP_INCOME_AMT <", value, "impIncomeAmt");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IMP_INCOME_AMT <=", value, "impIncomeAmt");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtIn(List<BigDecimal> values) {
            addCriterion("IMP_INCOME_AMT in", values, "impIncomeAmt");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtNotIn(List<BigDecimal> values) {
            addCriterion("IMP_INCOME_AMT not in", values, "impIncomeAmt");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMP_INCOME_AMT between", value1, value2, "impIncomeAmt");
            return (Criteria) this;
        }

        public Criteria andImpIncomeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMP_INCOME_AMT not between", value1, value2, "impIncomeAmt");
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

        public Criteria andImpTaxCcyIsNull() {
            addCriterion("IMP_TAX_CCY is null");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyIsNotNull() {
            addCriterion("IMP_TAX_CCY is not null");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyEqualTo(String value) {
            addCriterion("IMP_TAX_CCY =", value, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyNotEqualTo(String value) {
            addCriterion("IMP_TAX_CCY <>", value, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyGreaterThan(String value) {
            addCriterion("IMP_TAX_CCY >", value, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyGreaterThanOrEqualTo(String value) {
            addCriterion("IMP_TAX_CCY >=", value, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyLessThan(String value) {
            addCriterion("IMP_TAX_CCY <", value, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyLessThanOrEqualTo(String value) {
            addCriterion("IMP_TAX_CCY <=", value, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyLike(String value) {
            addCriterion("IMP_TAX_CCY like", value, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyNotLike(String value) {
            addCriterion("IMP_TAX_CCY not like", value, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyIn(List<String> values) {
            addCriterion("IMP_TAX_CCY in", values, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyNotIn(List<String> values) {
            addCriterion("IMP_TAX_CCY not in", values, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyBetween(String value1, String value2) {
            addCriterion("IMP_TAX_CCY between", value1, value2, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpTaxCcyNotBetween(String value1, String value2) {
            addCriterion("IMP_TAX_CCY not between", value1, value2, "impTaxCcy");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtIsNull() {
            addCriterion("IMP_CNY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtIsNotNull() {
            addCriterion("IMP_CNY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtEqualTo(BigDecimal value) {
            addCriterion("IMP_CNY_AMT =", value, "impCnyAmt");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtNotEqualTo(BigDecimal value) {
            addCriterion("IMP_CNY_AMT <>", value, "impCnyAmt");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtGreaterThan(BigDecimal value) {
            addCriterion("IMP_CNY_AMT >", value, "impCnyAmt");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IMP_CNY_AMT >=", value, "impCnyAmt");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtLessThan(BigDecimal value) {
            addCriterion("IMP_CNY_AMT <", value, "impCnyAmt");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IMP_CNY_AMT <=", value, "impCnyAmt");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtIn(List<BigDecimal> values) {
            addCriterion("IMP_CNY_AMT in", values, "impCnyAmt");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtNotIn(List<BigDecimal> values) {
            addCriterion("IMP_CNY_AMT not in", values, "impCnyAmt");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMP_CNY_AMT between", value1, value2, "impCnyAmt");
            return (Criteria) this;
        }

        public Criteria andImpCnyAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IMP_CNY_AMT not between", value1, value2, "impCnyAmt");
            return (Criteria) this;
        }

        public Criteria andInsTypeIsNull() {
            addCriterion("INS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInsTypeIsNotNull() {
            addCriterion("INS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInsTypeEqualTo(String value) {
            addCriterion("INS_TYPE =", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotEqualTo(String value) {
            addCriterion("INS_TYPE <>", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeGreaterThan(String value) {
            addCriterion("INS_TYPE >", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INS_TYPE >=", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeLessThan(String value) {
            addCriterion("INS_TYPE <", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeLessThanOrEqualTo(String value) {
            addCriterion("INS_TYPE <=", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeLike(String value) {
            addCriterion("INS_TYPE like", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotLike(String value) {
            addCriterion("INS_TYPE not like", value, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeIn(List<String> values) {
            addCriterion("INS_TYPE in", values, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotIn(List<String> values) {
            addCriterion("INS_TYPE not in", values, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeBetween(String value1, String value2) {
            addCriterion("INS_TYPE between", value1, value2, "insType");
            return (Criteria) this;
        }

        public Criteria andInsTypeNotBetween(String value1, String value2) {
            addCriterion("INS_TYPE not between", value1, value2, "insType");
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

        public Criteria andIsGenEntryIsNull() {
            addCriterion("IS_GEN_ENTRY is null");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryIsNotNull() {
            addCriterion("IS_GEN_ENTRY is not null");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryEqualTo(String value) {
            addCriterion("IS_GEN_ENTRY =", value, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryNotEqualTo(String value) {
            addCriterion("IS_GEN_ENTRY <>", value, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryGreaterThan(String value) {
            addCriterion("IS_GEN_ENTRY >", value, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GEN_ENTRY >=", value, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryLessThan(String value) {
            addCriterion("IS_GEN_ENTRY <", value, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryLessThanOrEqualTo(String value) {
            addCriterion("IS_GEN_ENTRY <=", value, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryLike(String value) {
            addCriterion("IS_GEN_ENTRY like", value, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryNotLike(String value) {
            addCriterion("IS_GEN_ENTRY not like", value, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryIn(List<String> values) {
            addCriterion("IS_GEN_ENTRY in", values, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryNotIn(List<String> values) {
            addCriterion("IS_GEN_ENTRY not in", values, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryBetween(String value1, String value2) {
            addCriterion("IS_GEN_ENTRY between", value1, value2, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenEntryNotBetween(String value1, String value2) {
            addCriterion("IS_GEN_ENTRY not between", value1, value2, "isGenEntry");
            return (Criteria) this;
        }

        public Criteria andIsGenDivIsNull() {
            addCriterion("IS_GEN_DIV is null");
            return (Criteria) this;
        }

        public Criteria andIsGenDivIsNotNull() {
            addCriterion("IS_GEN_DIV is not null");
            return (Criteria) this;
        }

        public Criteria andIsGenDivEqualTo(String value) {
            addCriterion("IS_GEN_DIV =", value, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivNotEqualTo(String value) {
            addCriterion("IS_GEN_DIV <>", value, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivGreaterThan(String value) {
            addCriterion("IS_GEN_DIV >", value, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GEN_DIV >=", value, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivLessThan(String value) {
            addCriterion("IS_GEN_DIV <", value, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivLessThanOrEqualTo(String value) {
            addCriterion("IS_GEN_DIV <=", value, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivLike(String value) {
            addCriterion("IS_GEN_DIV like", value, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivNotLike(String value) {
            addCriterion("IS_GEN_DIV not like", value, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivIn(List<String> values) {
            addCriterion("IS_GEN_DIV in", values, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivNotIn(List<String> values) {
            addCriterion("IS_GEN_DIV not in", values, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivBetween(String value1, String value2) {
            addCriterion("IS_GEN_DIV between", value1, value2, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andIsGenDivNotBetween(String value1, String value2) {
            addCriterion("IS_GEN_DIV not between", value1, value2, "isGenDiv");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxIsNull() {
            addCriterion("IMP_INC_TAX is null");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxIsNotNull() {
            addCriterion("IMP_INC_TAX is not null");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxEqualTo(String value) {
            addCriterion("IMP_INC_TAX =", value, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxNotEqualTo(String value) {
            addCriterion("IMP_INC_TAX <>", value, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxGreaterThan(String value) {
            addCriterion("IMP_INC_TAX >", value, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxGreaterThanOrEqualTo(String value) {
            addCriterion("IMP_INC_TAX >=", value, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxLessThan(String value) {
            addCriterion("IMP_INC_TAX <", value, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxLessThanOrEqualTo(String value) {
            addCriterion("IMP_INC_TAX <=", value, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxLike(String value) {
            addCriterion("IMP_INC_TAX like", value, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxNotLike(String value) {
            addCriterion("IMP_INC_TAX not like", value, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxIn(List<String> values) {
            addCriterion("IMP_INC_TAX in", values, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxNotIn(List<String> values) {
            addCriterion("IMP_INC_TAX not in", values, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxBetween(String value1, String value2) {
            addCriterion("IMP_INC_TAX between", value1, value2, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andImpIncTaxNotBetween(String value1, String value2) {
            addCriterion("IMP_INC_TAX not between", value1, value2, "impIncTax");
            return (Criteria) this;
        }

        public Criteria andDeductAmtIsNull() {
            addCriterion("DEDUCT_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDeductAmtIsNotNull() {
            addCriterion("DEDUCT_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDeductAmtEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_AMT =", value, "deductAmt");
            return (Criteria) this;
        }

        public Criteria andDeductAmtNotEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_AMT <>", value, "deductAmt");
            return (Criteria) this;
        }

        public Criteria andDeductAmtGreaterThan(BigDecimal value) {
            addCriterion("DEDUCT_AMT >", value, "deductAmt");
            return (Criteria) this;
        }

        public Criteria andDeductAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_AMT >=", value, "deductAmt");
            return (Criteria) this;
        }

        public Criteria andDeductAmtLessThan(BigDecimal value) {
            addCriterion("DEDUCT_AMT <", value, "deductAmt");
            return (Criteria) this;
        }

        public Criteria andDeductAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDUCT_AMT <=", value, "deductAmt");
            return (Criteria) this;
        }

        public Criteria andDeductAmtIn(List<BigDecimal> values) {
            addCriterion("DEDUCT_AMT in", values, "deductAmt");
            return (Criteria) this;
        }

        public Criteria andDeductAmtNotIn(List<BigDecimal> values) {
            addCriterion("DEDUCT_AMT not in", values, "deductAmt");
            return (Criteria) this;
        }

        public Criteria andDeductAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCT_AMT between", value1, value2, "deductAmt");
            return (Criteria) this;
        }

        public Criteria andDeductAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDUCT_AMT not between", value1, value2, "deductAmt");
            return (Criteria) this;
        }

        public Criteria andDiscountDescIsNull() {
            addCriterion("DISCOUNT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDiscountDescIsNotNull() {
            addCriterion("DISCOUNT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountDescEqualTo(String value) {
            addCriterion("DISCOUNT_DESC =", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescNotEqualTo(String value) {
            addCriterion("DISCOUNT_DESC <>", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescGreaterThan(String value) {
            addCriterion("DISCOUNT_DESC >", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_DESC >=", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescLessThan(String value) {
            addCriterion("DISCOUNT_DESC <", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_DESC <=", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescLike(String value) {
            addCriterion("DISCOUNT_DESC like", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescNotLike(String value) {
            addCriterion("DISCOUNT_DESC not like", value, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescIn(List<String> values) {
            addCriterion("DISCOUNT_DESC in", values, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescNotIn(List<String> values) {
            addCriterion("DISCOUNT_DESC not in", values, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescBetween(String value1, String value2) {
            addCriterion("DISCOUNT_DESC between", value1, value2, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountDescNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_DESC not between", value1, value2, "discountDesc");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagIsNull() {
            addCriterion("DISCOUNT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagIsNotNull() {
            addCriterion("DISCOUNT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagEqualTo(String value) {
            addCriterion("DISCOUNT_FLAG =", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagNotEqualTo(String value) {
            addCriterion("DISCOUNT_FLAG <>", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagGreaterThan(String value) {
            addCriterion("DISCOUNT_FLAG >", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_FLAG >=", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagLessThan(String value) {
            addCriterion("DISCOUNT_FLAG <", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_FLAG <=", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagLike(String value) {
            addCriterion("DISCOUNT_FLAG like", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagNotLike(String value) {
            addCriterion("DISCOUNT_FLAG not like", value, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagIn(List<String> values) {
            addCriterion("DISCOUNT_FLAG in", values, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagNotIn(List<String> values) {
            addCriterion("DISCOUNT_FLAG not in", values, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagBetween(String value1, String value2) {
            addCriterion("DISCOUNT_FLAG between", value1, value2, "discountFlag");
            return (Criteria) this;
        }

        public Criteria andDiscountFlagNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_FLAG not between", value1, value2, "discountFlag");
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

        public Criteria andReliefCodeIsNull() {
            addCriterion("RELIEF_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReliefCodeIsNotNull() {
            addCriterion("RELIEF_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReliefCodeEqualTo(String value) {
            addCriterion("RELIEF_CODE =", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeNotEqualTo(String value) {
            addCriterion("RELIEF_CODE <>", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeGreaterThan(String value) {
            addCriterion("RELIEF_CODE >", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RELIEF_CODE >=", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeLessThan(String value) {
            addCriterion("RELIEF_CODE <", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeLessThanOrEqualTo(String value) {
            addCriterion("RELIEF_CODE <=", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeLike(String value) {
            addCriterion("RELIEF_CODE like", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeNotLike(String value) {
            addCriterion("RELIEF_CODE not like", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeIn(List<String> values) {
            addCriterion("RELIEF_CODE in", values, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeNotIn(List<String> values) {
            addCriterion("RELIEF_CODE not in", values, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeBetween(String value1, String value2) {
            addCriterion("RELIEF_CODE between", value1, value2, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeNotBetween(String value1, String value2) {
            addCriterion("RELIEF_CODE not between", value1, value2, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdIsNull() {
            addCriterion("TAXENT_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdIsNotNull() {
            addCriterion("TAXENT_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdEqualTo(String value) {
            addCriterion("TAXENT_ORG_ID =", value, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdNotEqualTo(String value) {
            addCriterion("TAXENT_ORG_ID <>", value, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdGreaterThan(String value) {
            addCriterion("TAXENT_ORG_ID >", value, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("TAXENT_ORG_ID >=", value, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdLessThan(String value) {
            addCriterion("TAXENT_ORG_ID <", value, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdLessThanOrEqualTo(String value) {
            addCriterion("TAXENT_ORG_ID <=", value, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdLike(String value) {
            addCriterion("TAXENT_ORG_ID like", value, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdNotLike(String value) {
            addCriterion("TAXENT_ORG_ID not like", value, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdIn(List<String> values) {
            addCriterion("TAXENT_ORG_ID in", values, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdNotIn(List<String> values) {
            addCriterion("TAXENT_ORG_ID not in", values, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdBetween(String value1, String value2) {
            addCriterion("TAXENT_ORG_ID between", value1, value2, "taxentOrgId");
            return (Criteria) this;
        }

        public Criteria andTaxentOrgIdNotBetween(String value1, String value2) {
            addCriterion("TAXENT_ORG_ID not between", value1, value2, "taxentOrgId");
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