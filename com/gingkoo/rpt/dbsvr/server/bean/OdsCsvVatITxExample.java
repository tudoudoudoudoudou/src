package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OdsCsvVatITxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsCsvVatITxExample() {
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

        public Criteria andBrnoIsNull() {
            addCriterion("BRNO is null");
            return (Criteria) this;
        }

        public Criteria andBrnoIsNotNull() {
            addCriterion("BRNO is not null");
            return (Criteria) this;
        }

        public Criteria andBrnoEqualTo(String value) {
            addCriterion("BRNO =", value, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoNotEqualTo(String value) {
            addCriterion("BRNO <>", value, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoGreaterThan(String value) {
            addCriterion("BRNO >", value, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoGreaterThanOrEqualTo(String value) {
            addCriterion("BRNO >=", value, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoLessThan(String value) {
            addCriterion("BRNO <", value, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoLessThanOrEqualTo(String value) {
            addCriterion("BRNO <=", value, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoLike(String value) {
            addCriterion("BRNO like", value, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoNotLike(String value) {
            addCriterion("BRNO not like", value, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoIn(List<String> values) {
            addCriterion("BRNO in", values, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoNotIn(List<String> values) {
            addCriterion("BRNO not in", values, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoBetween(String value1, String value2) {
            addCriterion("BRNO between", value1, value2, "brno");
            return (Criteria) this;
        }

        public Criteria andBrnoNotBetween(String value1, String value2) {
            addCriterion("BRNO not between", value1, value2, "brno");
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

        public Criteria andSysCodeIsNull() {
            addCriterion("SYS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andSysCodeIsNotNull() {
            addCriterion("SYS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andSysCodeEqualTo(String value) {
            addCriterion("SYS_CODE =", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotEqualTo(String value) {
            addCriterion("SYS_CODE <>", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThan(String value) {
            addCriterion("SYS_CODE >", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_CODE >=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThan(String value) {
            addCriterion("SYS_CODE <", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLessThanOrEqualTo(String value) {
            addCriterion("SYS_CODE <=", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeLike(String value) {
            addCriterion("SYS_CODE like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotLike(String value) {
            addCriterion("SYS_CODE not like", value, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeIn(List<String> values) {
            addCriterion("SYS_CODE in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotIn(List<String> values) {
            addCriterion("SYS_CODE not in", values, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeBetween(String value1, String value2) {
            addCriterion("SYS_CODE between", value1, value2, "sysCode");
            return (Criteria) this;
        }

        public Criteria andSysCodeNotBetween(String value1, String value2) {
            addCriterion("SYS_CODE not between", value1, value2, "sysCode");
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

        public Criteria andCustBrnoIsNull() {
            addCriterion("CUST_BRNO is null");
            return (Criteria) this;
        }

        public Criteria andCustBrnoIsNotNull() {
            addCriterion("CUST_BRNO is not null");
            return (Criteria) this;
        }

        public Criteria andCustBrnoEqualTo(String value) {
            addCriterion("CUST_BRNO =", value, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoNotEqualTo(String value) {
            addCriterion("CUST_BRNO <>", value, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoGreaterThan(String value) {
            addCriterion("CUST_BRNO >", value, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoGreaterThanOrEqualTo(String value) {
            addCriterion("CUST_BRNO >=", value, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoLessThan(String value) {
            addCriterion("CUST_BRNO <", value, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoLessThanOrEqualTo(String value) {
            addCriterion("CUST_BRNO <=", value, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoLike(String value) {
            addCriterion("CUST_BRNO like", value, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoNotLike(String value) {
            addCriterion("CUST_BRNO not like", value, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoIn(List<String> values) {
            addCriterion("CUST_BRNO in", values, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoNotIn(List<String> values) {
            addCriterion("CUST_BRNO not in", values, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoBetween(String value1, String value2) {
            addCriterion("CUST_BRNO between", value1, value2, "custBrno");
            return (Criteria) this;
        }

        public Criteria andCustBrnoNotBetween(String value1, String value2) {
            addCriterion("CUST_BRNO not between", value1, value2, "custBrno");
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

        public Criteria andProdTypeIsNull() {
            addCriterion("PROD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProdTypeIsNotNull() {
            addCriterion("PROD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProdTypeEqualTo(String value) {
            addCriterion("PROD_TYPE =", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotEqualTo(String value) {
            addCriterion("PROD_TYPE <>", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeGreaterThan(String value) {
            addCriterion("PROD_TYPE >", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_TYPE >=", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLessThan(String value) {
            addCriterion("PROD_TYPE <", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLessThanOrEqualTo(String value) {
            addCriterion("PROD_TYPE <=", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeLike(String value) {
            addCriterion("PROD_TYPE like", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotLike(String value) {
            addCriterion("PROD_TYPE not like", value, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeIn(List<String> values) {
            addCriterion("PROD_TYPE in", values, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotIn(List<String> values) {
            addCriterion("PROD_TYPE not in", values, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeBetween(String value1, String value2) {
            addCriterion("PROD_TYPE between", value1, value2, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdTypeNotBetween(String value1, String value2) {
            addCriterion("PROD_TYPE not between", value1, value2, "prodType");
            return (Criteria) this;
        }

        public Criteria andProdCodeIsNull() {
            addCriterion("PROD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProdCodeIsNotNull() {
            addCriterion("PROD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProdCodeEqualTo(String value) {
            addCriterion("PROD_CODE =", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotEqualTo(String value) {
            addCriterion("PROD_CODE <>", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThan(String value) {
            addCriterion("PROD_CODE >", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROD_CODE >=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThan(String value) {
            addCriterion("PROD_CODE <", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLessThanOrEqualTo(String value) {
            addCriterion("PROD_CODE <=", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeLike(String value) {
            addCriterion("PROD_CODE like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotLike(String value) {
            addCriterion("PROD_CODE not like", value, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeIn(List<String> values) {
            addCriterion("PROD_CODE in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotIn(List<String> values) {
            addCriterion("PROD_CODE not in", values, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeBetween(String value1, String value2) {
            addCriterion("PROD_CODE between", value1, value2, "prodCode");
            return (Criteria) this;
        }

        public Criteria andProdCodeNotBetween(String value1, String value2) {
            addCriterion("PROD_CODE not between", value1, value2, "prodCode");
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

        public Criteria andCnyAmtIsNull() {
            addCriterion("CNY_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCnyAmtIsNotNull() {
            addCriterion("CNY_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCnyAmtEqualTo(BigDecimal value) {
            addCriterion("CNY_AMT =", value, "cnyAmt");
            return (Criteria) this;
        }

        public Criteria andCnyAmtNotEqualTo(BigDecimal value) {
            addCriterion("CNY_AMT <>", value, "cnyAmt");
            return (Criteria) this;
        }

        public Criteria andCnyAmtGreaterThan(BigDecimal value) {
            addCriterion("CNY_AMT >", value, "cnyAmt");
            return (Criteria) this;
        }

        public Criteria andCnyAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CNY_AMT >=", value, "cnyAmt");
            return (Criteria) this;
        }

        public Criteria andCnyAmtLessThan(BigDecimal value) {
            addCriterion("CNY_AMT <", value, "cnyAmt");
            return (Criteria) this;
        }

        public Criteria andCnyAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CNY_AMT <=", value, "cnyAmt");
            return (Criteria) this;
        }

        public Criteria andCnyAmtIn(List<BigDecimal> values) {
            addCriterion("CNY_AMT in", values, "cnyAmt");
            return (Criteria) this;
        }

        public Criteria andCnyAmtNotIn(List<BigDecimal> values) {
            addCriterion("CNY_AMT not in", values, "cnyAmt");
            return (Criteria) this;
        }

        public Criteria andCnyAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CNY_AMT between", value1, value2, "cnyAmt");
            return (Criteria) this;
        }

        public Criteria andCnyAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CNY_AMT not between", value1, value2, "cnyAmt");
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

        public Criteria andFxRateIsNull() {
            addCriterion("FX_RATE is null");
            return (Criteria) this;
        }

        public Criteria andFxRateIsNotNull() {
            addCriterion("FX_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andFxRateEqualTo(BigDecimal value) {
            addCriterion("FX_RATE =", value, "fxRate");
            return (Criteria) this;
        }

        public Criteria andFxRateNotEqualTo(BigDecimal value) {
            addCriterion("FX_RATE <>", value, "fxRate");
            return (Criteria) this;
        }

        public Criteria andFxRateGreaterThan(BigDecimal value) {
            addCriterion("FX_RATE >", value, "fxRate");
            return (Criteria) this;
        }

        public Criteria andFxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FX_RATE >=", value, "fxRate");
            return (Criteria) this;
        }

        public Criteria andFxRateLessThan(BigDecimal value) {
            addCriterion("FX_RATE <", value, "fxRate");
            return (Criteria) this;
        }

        public Criteria andFxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FX_RATE <=", value, "fxRate");
            return (Criteria) this;
        }

        public Criteria andFxRateIn(List<BigDecimal> values) {
            addCriterion("FX_RATE in", values, "fxRate");
            return (Criteria) this;
        }

        public Criteria andFxRateNotIn(List<BigDecimal> values) {
            addCriterion("FX_RATE not in", values, "fxRate");
            return (Criteria) this;
        }

        public Criteria andFxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FX_RATE between", value1, value2, "fxRate");
            return (Criteria) this;
        }

        public Criteria andFxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FX_RATE not between", value1, value2, "fxRate");
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

        public Criteria andReverseFlagIsNull() {
            addCriterion("REVERSE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andReverseFlagIsNotNull() {
            addCriterion("REVERSE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andReverseFlagEqualTo(String value) {
            addCriterion("REVERSE_FLAG =", value, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagNotEqualTo(String value) {
            addCriterion("REVERSE_FLAG <>", value, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagGreaterThan(String value) {
            addCriterion("REVERSE_FLAG >", value, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagGreaterThanOrEqualTo(String value) {
            addCriterion("REVERSE_FLAG >=", value, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagLessThan(String value) {
            addCriterion("REVERSE_FLAG <", value, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagLessThanOrEqualTo(String value) {
            addCriterion("REVERSE_FLAG <=", value, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagLike(String value) {
            addCriterion("REVERSE_FLAG like", value, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagNotLike(String value) {
            addCriterion("REVERSE_FLAG not like", value, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagIn(List<String> values) {
            addCriterion("REVERSE_FLAG in", values, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagNotIn(List<String> values) {
            addCriterion("REVERSE_FLAG not in", values, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagBetween(String value1, String value2) {
            addCriterion("REVERSE_FLAG between", value1, value2, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andReverseFlagNotBetween(String value1, String value2) {
            addCriterion("REVERSE_FLAG not between", value1, value2, "reverseFlag");
            return (Criteria) this;
        }

        public Criteria andOriTxIdIsNull() {
            addCriterion("ORI_TX_ID is null");
            return (Criteria) this;
        }

        public Criteria andOriTxIdIsNotNull() {
            addCriterion("ORI_TX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOriTxIdEqualTo(String value) {
            addCriterion("ORI_TX_ID =", value, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdNotEqualTo(String value) {
            addCriterion("ORI_TX_ID <>", value, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdGreaterThan(String value) {
            addCriterion("ORI_TX_ID >", value, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORI_TX_ID >=", value, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdLessThan(String value) {
            addCriterion("ORI_TX_ID <", value, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdLessThanOrEqualTo(String value) {
            addCriterion("ORI_TX_ID <=", value, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdLike(String value) {
            addCriterion("ORI_TX_ID like", value, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdNotLike(String value) {
            addCriterion("ORI_TX_ID not like", value, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdIn(List<String> values) {
            addCriterion("ORI_TX_ID in", values, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdNotIn(List<String> values) {
            addCriterion("ORI_TX_ID not in", values, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdBetween(String value1, String value2) {
            addCriterion("ORI_TX_ID between", value1, value2, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriTxIdNotBetween(String value1, String value2) {
            addCriterion("ORI_TX_ID not between", value1, value2, "oriTxId");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoIsNull() {
            addCriterion("ORI_SEQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoIsNotNull() {
            addCriterion("ORI_SEQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoEqualTo(String value) {
            addCriterion("ORI_SEQ_NO =", value, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoNotEqualTo(String value) {
            addCriterion("ORI_SEQ_NO <>", value, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoGreaterThan(String value) {
            addCriterion("ORI_SEQ_NO >", value, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORI_SEQ_NO >=", value, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoLessThan(String value) {
            addCriterion("ORI_SEQ_NO <", value, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoLessThanOrEqualTo(String value) {
            addCriterion("ORI_SEQ_NO <=", value, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoLike(String value) {
            addCriterion("ORI_SEQ_NO like", value, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoNotLike(String value) {
            addCriterion("ORI_SEQ_NO not like", value, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoIn(List<String> values) {
            addCriterion("ORI_SEQ_NO in", values, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoNotIn(List<String> values) {
            addCriterion("ORI_SEQ_NO not in", values, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoBetween(String value1, String value2) {
            addCriterion("ORI_SEQ_NO between", value1, value2, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriSeqNoNotBetween(String value1, String value2) {
            addCriterion("ORI_SEQ_NO not between", value1, value2, "oriSeqNo");
            return (Criteria) this;
        }

        public Criteria andOriTxDateIsNull() {
            addCriterion("ORI_TX_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOriTxDateIsNotNull() {
            addCriterion("ORI_TX_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOriTxDateEqualTo(String value) {
            addCriterion("ORI_TX_DATE =", value, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateNotEqualTo(String value) {
            addCriterion("ORI_TX_DATE <>", value, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateGreaterThan(String value) {
            addCriterion("ORI_TX_DATE >", value, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateGreaterThanOrEqualTo(String value) {
            addCriterion("ORI_TX_DATE >=", value, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateLessThan(String value) {
            addCriterion("ORI_TX_DATE <", value, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateLessThanOrEqualTo(String value) {
            addCriterion("ORI_TX_DATE <=", value, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateLike(String value) {
            addCriterion("ORI_TX_DATE like", value, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateNotLike(String value) {
            addCriterion("ORI_TX_DATE not like", value, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateIn(List<String> values) {
            addCriterion("ORI_TX_DATE in", values, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateNotIn(List<String> values) {
            addCriterion("ORI_TX_DATE not in", values, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateBetween(String value1, String value2) {
            addCriterion("ORI_TX_DATE between", value1, value2, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andOriTxDateNotBetween(String value1, String value2) {
            addCriterion("ORI_TX_DATE not between", value1, value2, "oriTxDate");
            return (Criteria) this;
        }

        public Criteria andRefNoIsNull() {
            addCriterion("REF_NO is null");
            return (Criteria) this;
        }

        public Criteria andRefNoIsNotNull() {
            addCriterion("REF_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRefNoEqualTo(String value) {
            addCriterion("REF_NO =", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotEqualTo(String value) {
            addCriterion("REF_NO <>", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoGreaterThan(String value) {
            addCriterion("REF_NO >", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoGreaterThanOrEqualTo(String value) {
            addCriterion("REF_NO >=", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLessThan(String value) {
            addCriterion("REF_NO <", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLessThanOrEqualTo(String value) {
            addCriterion("REF_NO <=", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoLike(String value) {
            addCriterion("REF_NO like", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotLike(String value) {
            addCriterion("REF_NO not like", value, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoIn(List<String> values) {
            addCriterion("REF_NO in", values, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotIn(List<String> values) {
            addCriterion("REF_NO not in", values, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoBetween(String value1, String value2) {
            addCriterion("REF_NO between", value1, value2, "refNo");
            return (Criteria) this;
        }

        public Criteria andRefNoNotBetween(String value1, String value2) {
            addCriterion("REF_NO not between", value1, value2, "refNo");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNull() {
            addCriterion("OP_USER is null");
            return (Criteria) this;
        }

        public Criteria andOpUserIsNotNull() {
            addCriterion("OP_USER is not null");
            return (Criteria) this;
        }

        public Criteria andOpUserEqualTo(String value) {
            addCriterion("OP_USER =", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotEqualTo(String value) {
            addCriterion("OP_USER <>", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThan(String value) {
            addCriterion("OP_USER >", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserGreaterThanOrEqualTo(String value) {
            addCriterion("OP_USER >=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThan(String value) {
            addCriterion("OP_USER <", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLessThanOrEqualTo(String value) {
            addCriterion("OP_USER <=", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserLike(String value) {
            addCriterion("OP_USER like", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotLike(String value) {
            addCriterion("OP_USER not like", value, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserIn(List<String> values) {
            addCriterion("OP_USER in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotIn(List<String> values) {
            addCriterion("OP_USER not in", values, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserBetween(String value1, String value2) {
            addCriterion("OP_USER between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpUserNotBetween(String value1, String value2) {
            addCriterion("OP_USER not between", value1, value2, "opUser");
            return (Criteria) this;
        }

        public Criteria andOpSsnIsNull() {
            addCriterion("OP_SSN is null");
            return (Criteria) this;
        }

        public Criteria andOpSsnIsNotNull() {
            addCriterion("OP_SSN is not null");
            return (Criteria) this;
        }

        public Criteria andOpSsnEqualTo(String value) {
            addCriterion("OP_SSN =", value, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnNotEqualTo(String value) {
            addCriterion("OP_SSN <>", value, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnGreaterThan(String value) {
            addCriterion("OP_SSN >", value, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnGreaterThanOrEqualTo(String value) {
            addCriterion("OP_SSN >=", value, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnLessThan(String value) {
            addCriterion("OP_SSN <", value, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnLessThanOrEqualTo(String value) {
            addCriterion("OP_SSN <=", value, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnLike(String value) {
            addCriterion("OP_SSN like", value, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnNotLike(String value) {
            addCriterion("OP_SSN not like", value, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnIn(List<String> values) {
            addCriterion("OP_SSN in", values, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnNotIn(List<String> values) {
            addCriterion("OP_SSN not in", values, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnBetween(String value1, String value2) {
            addCriterion("OP_SSN between", value1, value2, "opSsn");
            return (Criteria) this;
        }

        public Criteria andOpSsnNotBetween(String value1, String value2) {
            addCriterion("OP_SSN not between", value1, value2, "opSsn");
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

        public Criteria andExt1IsNull() {
            addCriterion("EXT1 is null");
            return (Criteria) this;
        }

        public Criteria andExt1IsNotNull() {
            addCriterion("EXT1 is not null");
            return (Criteria) this;
        }

        public Criteria andExt1EqualTo(String value) {
            addCriterion("EXT1 =", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotEqualTo(String value) {
            addCriterion("EXT1 <>", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThan(String value) {
            addCriterion("EXT1 >", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1GreaterThanOrEqualTo(String value) {
            addCriterion("EXT1 >=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThan(String value) {
            addCriterion("EXT1 <", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1LessThanOrEqualTo(String value) {
            addCriterion("EXT1 <=", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Like(String value) {
            addCriterion("EXT1 like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotLike(String value) {
            addCriterion("EXT1 not like", value, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1In(List<String> values) {
            addCriterion("EXT1 in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotIn(List<String> values) {
            addCriterion("EXT1 not in", values, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1Between(String value1, String value2) {
            addCriterion("EXT1 between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt1NotBetween(String value1, String value2) {
            addCriterion("EXT1 not between", value1, value2, "ext1");
            return (Criteria) this;
        }

        public Criteria andExt2IsNull() {
            addCriterion("EXT2 is null");
            return (Criteria) this;
        }

        public Criteria andExt2IsNotNull() {
            addCriterion("EXT2 is not null");
            return (Criteria) this;
        }

        public Criteria andExt2EqualTo(String value) {
            addCriterion("EXT2 =", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotEqualTo(String value) {
            addCriterion("EXT2 <>", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThan(String value) {
            addCriterion("EXT2 >", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2GreaterThanOrEqualTo(String value) {
            addCriterion("EXT2 >=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThan(String value) {
            addCriterion("EXT2 <", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2LessThanOrEqualTo(String value) {
            addCriterion("EXT2 <=", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Like(String value) {
            addCriterion("EXT2 like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotLike(String value) {
            addCriterion("EXT2 not like", value, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2In(List<String> values) {
            addCriterion("EXT2 in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotIn(List<String> values) {
            addCriterion("EXT2 not in", values, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2Between(String value1, String value2) {
            addCriterion("EXT2 between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt2NotBetween(String value1, String value2) {
            addCriterion("EXT2 not between", value1, value2, "ext2");
            return (Criteria) this;
        }

        public Criteria andExt3IsNull() {
            addCriterion("EXT3 is null");
            return (Criteria) this;
        }

        public Criteria andExt3IsNotNull() {
            addCriterion("EXT3 is not null");
            return (Criteria) this;
        }

        public Criteria andExt3EqualTo(String value) {
            addCriterion("EXT3 =", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotEqualTo(String value) {
            addCriterion("EXT3 <>", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThan(String value) {
            addCriterion("EXT3 >", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3GreaterThanOrEqualTo(String value) {
            addCriterion("EXT3 >=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThan(String value) {
            addCriterion("EXT3 <", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3LessThanOrEqualTo(String value) {
            addCriterion("EXT3 <=", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Like(String value) {
            addCriterion("EXT3 like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotLike(String value) {
            addCriterion("EXT3 not like", value, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3In(List<String> values) {
            addCriterion("EXT3 in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotIn(List<String> values) {
            addCriterion("EXT3 not in", values, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3Between(String value1, String value2) {
            addCriterion("EXT3 between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt3NotBetween(String value1, String value2) {
            addCriterion("EXT3 not between", value1, value2, "ext3");
            return (Criteria) this;
        }

        public Criteria andExt4IsNull() {
            addCriterion("EXT4 is null");
            return (Criteria) this;
        }

        public Criteria andExt4IsNotNull() {
            addCriterion("EXT4 is not null");
            return (Criteria) this;
        }

        public Criteria andExt4EqualTo(String value) {
            addCriterion("EXT4 =", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotEqualTo(String value) {
            addCriterion("EXT4 <>", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThan(String value) {
            addCriterion("EXT4 >", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4GreaterThanOrEqualTo(String value) {
            addCriterion("EXT4 >=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThan(String value) {
            addCriterion("EXT4 <", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4LessThanOrEqualTo(String value) {
            addCriterion("EXT4 <=", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Like(String value) {
            addCriterion("EXT4 like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotLike(String value) {
            addCriterion("EXT4 not like", value, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4In(List<String> values) {
            addCriterion("EXT4 in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotIn(List<String> values) {
            addCriterion("EXT4 not in", values, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4Between(String value1, String value2) {
            addCriterion("EXT4 between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt4NotBetween(String value1, String value2) {
            addCriterion("EXT4 not between", value1, value2, "ext4");
            return (Criteria) this;
        }

        public Criteria andExt5IsNull() {
            addCriterion("EXT5 is null");
            return (Criteria) this;
        }

        public Criteria andExt5IsNotNull() {
            addCriterion("EXT5 is not null");
            return (Criteria) this;
        }

        public Criteria andExt5EqualTo(String value) {
            addCriterion("EXT5 =", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotEqualTo(String value) {
            addCriterion("EXT5 <>", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThan(String value) {
            addCriterion("EXT5 >", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5GreaterThanOrEqualTo(String value) {
            addCriterion("EXT5 >=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThan(String value) {
            addCriterion("EXT5 <", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5LessThanOrEqualTo(String value) {
            addCriterion("EXT5 <=", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Like(String value) {
            addCriterion("EXT5 like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotLike(String value) {
            addCriterion("EXT5 not like", value, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5In(List<String> values) {
            addCriterion("EXT5 in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotIn(List<String> values) {
            addCriterion("EXT5 not in", values, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5Between(String value1, String value2) {
            addCriterion("EXT5 between", value1, value2, "ext5");
            return (Criteria) this;
        }

        public Criteria andExt5NotBetween(String value1, String value2) {
            addCriterion("EXT5 not between", value1, value2, "ext5");
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