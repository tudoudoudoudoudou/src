package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DmVatAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DmVatAccountExample() {
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

        public Criteria andOSeqNoIsNull() {
            addCriterion("O_SEQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andOSeqNoIsNotNull() {
            addCriterion("O_SEQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOSeqNoEqualTo(String value) {
            addCriterion("O_SEQ_NO =", value, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoNotEqualTo(String value) {
            addCriterion("O_SEQ_NO <>", value, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoGreaterThan(String value) {
            addCriterion("O_SEQ_NO >", value, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoGreaterThanOrEqualTo(String value) {
            addCriterion("O_SEQ_NO >=", value, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoLessThan(String value) {
            addCriterion("O_SEQ_NO <", value, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoLessThanOrEqualTo(String value) {
            addCriterion("O_SEQ_NO <=", value, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoLike(String value) {
            addCriterion("O_SEQ_NO like", value, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoNotLike(String value) {
            addCriterion("O_SEQ_NO not like", value, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoIn(List<String> values) {
            addCriterion("O_SEQ_NO in", values, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoNotIn(List<String> values) {
            addCriterion("O_SEQ_NO not in", values, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoBetween(String value1, String value2) {
            addCriterion("O_SEQ_NO between", value1, value2, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOSeqNoNotBetween(String value1, String value2) {
            addCriterion("O_SEQ_NO not between", value1, value2, "oSeqNo");
            return (Criteria) this;
        }

        public Criteria andOValueDateIsNull() {
            addCriterion("O_VALUE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOValueDateIsNotNull() {
            addCriterion("O_VALUE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOValueDateEqualTo(String value) {
            addCriterion("O_VALUE_DATE =", value, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateNotEqualTo(String value) {
            addCriterion("O_VALUE_DATE <>", value, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateGreaterThan(String value) {
            addCriterion("O_VALUE_DATE >", value, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateGreaterThanOrEqualTo(String value) {
            addCriterion("O_VALUE_DATE >=", value, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateLessThan(String value) {
            addCriterion("O_VALUE_DATE <", value, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateLessThanOrEqualTo(String value) {
            addCriterion("O_VALUE_DATE <=", value, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateLike(String value) {
            addCriterion("O_VALUE_DATE like", value, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateNotLike(String value) {
            addCriterion("O_VALUE_DATE not like", value, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateIn(List<String> values) {
            addCriterion("O_VALUE_DATE in", values, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateNotIn(List<String> values) {
            addCriterion("O_VALUE_DATE not in", values, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateBetween(String value1, String value2) {
            addCriterion("O_VALUE_DATE between", value1, value2, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andOValueDateNotBetween(String value1, String value2) {
            addCriterion("O_VALUE_DATE not between", value1, value2, "oValueDate");
            return (Criteria) this;
        }

        public Criteria andDbActno1IsNull() {
            addCriterion("DB_ACTNO1 is null");
            return (Criteria) this;
        }

        public Criteria andDbActno1IsNotNull() {
            addCriterion("DB_ACTNO1 is not null");
            return (Criteria) this;
        }

        public Criteria andDbActno1EqualTo(String value) {
            addCriterion("DB_ACTNO1 =", value, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1NotEqualTo(String value) {
            addCriterion("DB_ACTNO1 <>", value, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1GreaterThan(String value) {
            addCriterion("DB_ACTNO1 >", value, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1GreaterThanOrEqualTo(String value) {
            addCriterion("DB_ACTNO1 >=", value, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1LessThan(String value) {
            addCriterion("DB_ACTNO1 <", value, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1LessThanOrEqualTo(String value) {
            addCriterion("DB_ACTNO1 <=", value, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1Like(String value) {
            addCriterion("DB_ACTNO1 like", value, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1NotLike(String value) {
            addCriterion("DB_ACTNO1 not like", value, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1In(List<String> values) {
            addCriterion("DB_ACTNO1 in", values, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1NotIn(List<String> values) {
            addCriterion("DB_ACTNO1 not in", values, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1Between(String value1, String value2) {
            addCriterion("DB_ACTNO1 between", value1, value2, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbActno1NotBetween(String value1, String value2) {
            addCriterion("DB_ACTNO1 not between", value1, value2, "dbActno1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1IsNull() {
            addCriterion("DB_CCY1 is null");
            return (Criteria) this;
        }

        public Criteria andDbCcy1IsNotNull() {
            addCriterion("DB_CCY1 is not null");
            return (Criteria) this;
        }

        public Criteria andDbCcy1EqualTo(String value) {
            addCriterion("DB_CCY1 =", value, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1NotEqualTo(String value) {
            addCriterion("DB_CCY1 <>", value, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1GreaterThan(String value) {
            addCriterion("DB_CCY1 >", value, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1GreaterThanOrEqualTo(String value) {
            addCriterion("DB_CCY1 >=", value, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1LessThan(String value) {
            addCriterion("DB_CCY1 <", value, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1LessThanOrEqualTo(String value) {
            addCriterion("DB_CCY1 <=", value, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1Like(String value) {
            addCriterion("DB_CCY1 like", value, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1NotLike(String value) {
            addCriterion("DB_CCY1 not like", value, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1In(List<String> values) {
            addCriterion("DB_CCY1 in", values, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1NotIn(List<String> values) {
            addCriterion("DB_CCY1 not in", values, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1Between(String value1, String value2) {
            addCriterion("DB_CCY1 between", value1, value2, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbCcy1NotBetween(String value1, String value2) {
            addCriterion("DB_CCY1 not between", value1, value2, "dbCcy1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1IsNull() {
            addCriterion("DB_REMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andDbRemark1IsNotNull() {
            addCriterion("DB_REMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andDbRemark1EqualTo(String value) {
            addCriterion("DB_REMARK1 =", value, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1NotEqualTo(String value) {
            addCriterion("DB_REMARK1 <>", value, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1GreaterThan(String value) {
            addCriterion("DB_REMARK1 >", value, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("DB_REMARK1 >=", value, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1LessThan(String value) {
            addCriterion("DB_REMARK1 <", value, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1LessThanOrEqualTo(String value) {
            addCriterion("DB_REMARK1 <=", value, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1Like(String value) {
            addCriterion("DB_REMARK1 like", value, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1NotLike(String value) {
            addCriterion("DB_REMARK1 not like", value, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1In(List<String> values) {
            addCriterion("DB_REMARK1 in", values, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1NotIn(List<String> values) {
            addCriterion("DB_REMARK1 not in", values, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1Between(String value1, String value2) {
            addCriterion("DB_REMARK1 between", value1, value2, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbRemark1NotBetween(String value1, String value2) {
            addCriterion("DB_REMARK1 not between", value1, value2, "dbRemark1");
            return (Criteria) this;
        }

        public Criteria andDbAmt1IsNull() {
            addCriterion("DB_AMT1 is null");
            return (Criteria) this;
        }

        public Criteria andDbAmt1IsNotNull() {
            addCriterion("DB_AMT1 is not null");
            return (Criteria) this;
        }

        public Criteria andDbAmt1EqualTo(BigDecimal value) {
            addCriterion("DB_AMT1 =", value, "dbAmt1");
            return (Criteria) this;
        }

        public Criteria andDbAmt1NotEqualTo(BigDecimal value) {
            addCriterion("DB_AMT1 <>", value, "dbAmt1");
            return (Criteria) this;
        }

        public Criteria andDbAmt1GreaterThan(BigDecimal value) {
            addCriterion("DB_AMT1 >", value, "dbAmt1");
            return (Criteria) this;
        }

        public Criteria andDbAmt1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DB_AMT1 >=", value, "dbAmt1");
            return (Criteria) this;
        }

        public Criteria andDbAmt1LessThan(BigDecimal value) {
            addCriterion("DB_AMT1 <", value, "dbAmt1");
            return (Criteria) this;
        }

        public Criteria andDbAmt1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("DB_AMT1 <=", value, "dbAmt1");
            return (Criteria) this;
        }

        public Criteria andDbAmt1In(List<BigDecimal> values) {
            addCriterion("DB_AMT1 in", values, "dbAmt1");
            return (Criteria) this;
        }

        public Criteria andDbAmt1NotIn(List<BigDecimal> values) {
            addCriterion("DB_AMT1 not in", values, "dbAmt1");
            return (Criteria) this;
        }

        public Criteria andDbAmt1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("DB_AMT1 between", value1, value2, "dbAmt1");
            return (Criteria) this;
        }

        public Criteria andDbAmt1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DB_AMT1 not between", value1, value2, "dbAmt1");
            return (Criteria) this;
        }

        public Criteria andCrActno1IsNull() {
            addCriterion("CR_ACTNO1 is null");
            return (Criteria) this;
        }

        public Criteria andCrActno1IsNotNull() {
            addCriterion("CR_ACTNO1 is not null");
            return (Criteria) this;
        }

        public Criteria andCrActno1EqualTo(String value) {
            addCriterion("CR_ACTNO1 =", value, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1NotEqualTo(String value) {
            addCriterion("CR_ACTNO1 <>", value, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1GreaterThan(String value) {
            addCriterion("CR_ACTNO1 >", value, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1GreaterThanOrEqualTo(String value) {
            addCriterion("CR_ACTNO1 >=", value, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1LessThan(String value) {
            addCriterion("CR_ACTNO1 <", value, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1LessThanOrEqualTo(String value) {
            addCriterion("CR_ACTNO1 <=", value, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1Like(String value) {
            addCriterion("CR_ACTNO1 like", value, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1NotLike(String value) {
            addCriterion("CR_ACTNO1 not like", value, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1In(List<String> values) {
            addCriterion("CR_ACTNO1 in", values, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1NotIn(List<String> values) {
            addCriterion("CR_ACTNO1 not in", values, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1Between(String value1, String value2) {
            addCriterion("CR_ACTNO1 between", value1, value2, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrActno1NotBetween(String value1, String value2) {
            addCriterion("CR_ACTNO1 not between", value1, value2, "crActno1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1IsNull() {
            addCriterion("CR_CCY1 is null");
            return (Criteria) this;
        }

        public Criteria andCrCcy1IsNotNull() {
            addCriterion("CR_CCY1 is not null");
            return (Criteria) this;
        }

        public Criteria andCrCcy1EqualTo(String value) {
            addCriterion("CR_CCY1 =", value, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1NotEqualTo(String value) {
            addCriterion("CR_CCY1 <>", value, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1GreaterThan(String value) {
            addCriterion("CR_CCY1 >", value, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1GreaterThanOrEqualTo(String value) {
            addCriterion("CR_CCY1 >=", value, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1LessThan(String value) {
            addCriterion("CR_CCY1 <", value, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1LessThanOrEqualTo(String value) {
            addCriterion("CR_CCY1 <=", value, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1Like(String value) {
            addCriterion("CR_CCY1 like", value, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1NotLike(String value) {
            addCriterion("CR_CCY1 not like", value, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1In(List<String> values) {
            addCriterion("CR_CCY1 in", values, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1NotIn(List<String> values) {
            addCriterion("CR_CCY1 not in", values, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1Between(String value1, String value2) {
            addCriterion("CR_CCY1 between", value1, value2, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrCcy1NotBetween(String value1, String value2) {
            addCriterion("CR_CCY1 not between", value1, value2, "crCcy1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1IsNull() {
            addCriterion("CR_REMARK1 is null");
            return (Criteria) this;
        }

        public Criteria andCrRemark1IsNotNull() {
            addCriterion("CR_REMARK1 is not null");
            return (Criteria) this;
        }

        public Criteria andCrRemark1EqualTo(String value) {
            addCriterion("CR_REMARK1 =", value, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1NotEqualTo(String value) {
            addCriterion("CR_REMARK1 <>", value, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1GreaterThan(String value) {
            addCriterion("CR_REMARK1 >", value, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("CR_REMARK1 >=", value, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1LessThan(String value) {
            addCriterion("CR_REMARK1 <", value, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1LessThanOrEqualTo(String value) {
            addCriterion("CR_REMARK1 <=", value, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1Like(String value) {
            addCriterion("CR_REMARK1 like", value, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1NotLike(String value) {
            addCriterion("CR_REMARK1 not like", value, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1In(List<String> values) {
            addCriterion("CR_REMARK1 in", values, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1NotIn(List<String> values) {
            addCriterion("CR_REMARK1 not in", values, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1Between(String value1, String value2) {
            addCriterion("CR_REMARK1 between", value1, value2, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrRemark1NotBetween(String value1, String value2) {
            addCriterion("CR_REMARK1 not between", value1, value2, "crRemark1");
            return (Criteria) this;
        }

        public Criteria andCrAmt1IsNull() {
            addCriterion("CR_AMT1 is null");
            return (Criteria) this;
        }

        public Criteria andCrAmt1IsNotNull() {
            addCriterion("CR_AMT1 is not null");
            return (Criteria) this;
        }

        public Criteria andCrAmt1EqualTo(BigDecimal value) {
            addCriterion("CR_AMT1 =", value, "crAmt1");
            return (Criteria) this;
        }

        public Criteria andCrAmt1NotEqualTo(BigDecimal value) {
            addCriterion("CR_AMT1 <>", value, "crAmt1");
            return (Criteria) this;
        }

        public Criteria andCrAmt1GreaterThan(BigDecimal value) {
            addCriterion("CR_AMT1 >", value, "crAmt1");
            return (Criteria) this;
        }

        public Criteria andCrAmt1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CR_AMT1 >=", value, "crAmt1");
            return (Criteria) this;
        }

        public Criteria andCrAmt1LessThan(BigDecimal value) {
            addCriterion("CR_AMT1 <", value, "crAmt1");
            return (Criteria) this;
        }

        public Criteria andCrAmt1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CR_AMT1 <=", value, "crAmt1");
            return (Criteria) this;
        }

        public Criteria andCrAmt1In(List<BigDecimal> values) {
            addCriterion("CR_AMT1 in", values, "crAmt1");
            return (Criteria) this;
        }

        public Criteria andCrAmt1NotIn(List<BigDecimal> values) {
            addCriterion("CR_AMT1 not in", values, "crAmt1");
            return (Criteria) this;
        }

        public Criteria andCrAmt1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CR_AMT1 between", value1, value2, "crAmt1");
            return (Criteria) this;
        }

        public Criteria andCrAmt1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CR_AMT1 not between", value1, value2, "crAmt1");
            return (Criteria) this;
        }

        public Criteria andDbActno2IsNull() {
            addCriterion("DB_ACTNO2 is null");
            return (Criteria) this;
        }

        public Criteria andDbActno2IsNotNull() {
            addCriterion("DB_ACTNO2 is not null");
            return (Criteria) this;
        }

        public Criteria andDbActno2EqualTo(String value) {
            addCriterion("DB_ACTNO2 =", value, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2NotEqualTo(String value) {
            addCriterion("DB_ACTNO2 <>", value, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2GreaterThan(String value) {
            addCriterion("DB_ACTNO2 >", value, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2GreaterThanOrEqualTo(String value) {
            addCriterion("DB_ACTNO2 >=", value, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2LessThan(String value) {
            addCriterion("DB_ACTNO2 <", value, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2LessThanOrEqualTo(String value) {
            addCriterion("DB_ACTNO2 <=", value, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2Like(String value) {
            addCriterion("DB_ACTNO2 like", value, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2NotLike(String value) {
            addCriterion("DB_ACTNO2 not like", value, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2In(List<String> values) {
            addCriterion("DB_ACTNO2 in", values, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2NotIn(List<String> values) {
            addCriterion("DB_ACTNO2 not in", values, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2Between(String value1, String value2) {
            addCriterion("DB_ACTNO2 between", value1, value2, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbActno2NotBetween(String value1, String value2) {
            addCriterion("DB_ACTNO2 not between", value1, value2, "dbActno2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2IsNull() {
            addCriterion("DB_CCY2 is null");
            return (Criteria) this;
        }

        public Criteria andDbCcy2IsNotNull() {
            addCriterion("DB_CCY2 is not null");
            return (Criteria) this;
        }

        public Criteria andDbCcy2EqualTo(String value) {
            addCriterion("DB_CCY2 =", value, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2NotEqualTo(String value) {
            addCriterion("DB_CCY2 <>", value, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2GreaterThan(String value) {
            addCriterion("DB_CCY2 >", value, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2GreaterThanOrEqualTo(String value) {
            addCriterion("DB_CCY2 >=", value, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2LessThan(String value) {
            addCriterion("DB_CCY2 <", value, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2LessThanOrEqualTo(String value) {
            addCriterion("DB_CCY2 <=", value, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2Like(String value) {
            addCriterion("DB_CCY2 like", value, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2NotLike(String value) {
            addCriterion("DB_CCY2 not like", value, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2In(List<String> values) {
            addCriterion("DB_CCY2 in", values, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2NotIn(List<String> values) {
            addCriterion("DB_CCY2 not in", values, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2Between(String value1, String value2) {
            addCriterion("DB_CCY2 between", value1, value2, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbCcy2NotBetween(String value1, String value2) {
            addCriterion("DB_CCY2 not between", value1, value2, "dbCcy2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2IsNull() {
            addCriterion("DB_REMARK2 is null");
            return (Criteria) this;
        }

        public Criteria andDbRemark2IsNotNull() {
            addCriterion("DB_REMARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andDbRemark2EqualTo(String value) {
            addCriterion("DB_REMARK2 =", value, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2NotEqualTo(String value) {
            addCriterion("DB_REMARK2 <>", value, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2GreaterThan(String value) {
            addCriterion("DB_REMARK2 >", value, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("DB_REMARK2 >=", value, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2LessThan(String value) {
            addCriterion("DB_REMARK2 <", value, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2LessThanOrEqualTo(String value) {
            addCriterion("DB_REMARK2 <=", value, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2Like(String value) {
            addCriterion("DB_REMARK2 like", value, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2NotLike(String value) {
            addCriterion("DB_REMARK2 not like", value, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2In(List<String> values) {
            addCriterion("DB_REMARK2 in", values, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2NotIn(List<String> values) {
            addCriterion("DB_REMARK2 not in", values, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2Between(String value1, String value2) {
            addCriterion("DB_REMARK2 between", value1, value2, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbRemark2NotBetween(String value1, String value2) {
            addCriterion("DB_REMARK2 not between", value1, value2, "dbRemark2");
            return (Criteria) this;
        }

        public Criteria andDbAmt2IsNull() {
            addCriterion("DB_AMT2 is null");
            return (Criteria) this;
        }

        public Criteria andDbAmt2IsNotNull() {
            addCriterion("DB_AMT2 is not null");
            return (Criteria) this;
        }

        public Criteria andDbAmt2EqualTo(BigDecimal value) {
            addCriterion("DB_AMT2 =", value, "dbAmt2");
            return (Criteria) this;
        }

        public Criteria andDbAmt2NotEqualTo(BigDecimal value) {
            addCriterion("DB_AMT2 <>", value, "dbAmt2");
            return (Criteria) this;
        }

        public Criteria andDbAmt2GreaterThan(BigDecimal value) {
            addCriterion("DB_AMT2 >", value, "dbAmt2");
            return (Criteria) this;
        }

        public Criteria andDbAmt2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DB_AMT2 >=", value, "dbAmt2");
            return (Criteria) this;
        }

        public Criteria andDbAmt2LessThan(BigDecimal value) {
            addCriterion("DB_AMT2 <", value, "dbAmt2");
            return (Criteria) this;
        }

        public Criteria andDbAmt2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("DB_AMT2 <=", value, "dbAmt2");
            return (Criteria) this;
        }

        public Criteria andDbAmt2In(List<BigDecimal> values) {
            addCriterion("DB_AMT2 in", values, "dbAmt2");
            return (Criteria) this;
        }

        public Criteria andDbAmt2NotIn(List<BigDecimal> values) {
            addCriterion("DB_AMT2 not in", values, "dbAmt2");
            return (Criteria) this;
        }

        public Criteria andDbAmt2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("DB_AMT2 between", value1, value2, "dbAmt2");
            return (Criteria) this;
        }

        public Criteria andDbAmt2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DB_AMT2 not between", value1, value2, "dbAmt2");
            return (Criteria) this;
        }

        public Criteria andCrActno2IsNull() {
            addCriterion("CR_ACTNO2 is null");
            return (Criteria) this;
        }

        public Criteria andCrActno2IsNotNull() {
            addCriterion("CR_ACTNO2 is not null");
            return (Criteria) this;
        }

        public Criteria andCrActno2EqualTo(String value) {
            addCriterion("CR_ACTNO2 =", value, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2NotEqualTo(String value) {
            addCriterion("CR_ACTNO2 <>", value, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2GreaterThan(String value) {
            addCriterion("CR_ACTNO2 >", value, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2GreaterThanOrEqualTo(String value) {
            addCriterion("CR_ACTNO2 >=", value, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2LessThan(String value) {
            addCriterion("CR_ACTNO2 <", value, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2LessThanOrEqualTo(String value) {
            addCriterion("CR_ACTNO2 <=", value, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2Like(String value) {
            addCriterion("CR_ACTNO2 like", value, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2NotLike(String value) {
            addCriterion("CR_ACTNO2 not like", value, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2In(List<String> values) {
            addCriterion("CR_ACTNO2 in", values, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2NotIn(List<String> values) {
            addCriterion("CR_ACTNO2 not in", values, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2Between(String value1, String value2) {
            addCriterion("CR_ACTNO2 between", value1, value2, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrActno2NotBetween(String value1, String value2) {
            addCriterion("CR_ACTNO2 not between", value1, value2, "crActno2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2IsNull() {
            addCriterion("CR_CCY2 is null");
            return (Criteria) this;
        }

        public Criteria andCrCcy2IsNotNull() {
            addCriterion("CR_CCY2 is not null");
            return (Criteria) this;
        }

        public Criteria andCrCcy2EqualTo(String value) {
            addCriterion("CR_CCY2 =", value, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2NotEqualTo(String value) {
            addCriterion("CR_CCY2 <>", value, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2GreaterThan(String value) {
            addCriterion("CR_CCY2 >", value, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2GreaterThanOrEqualTo(String value) {
            addCriterion("CR_CCY2 >=", value, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2LessThan(String value) {
            addCriterion("CR_CCY2 <", value, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2LessThanOrEqualTo(String value) {
            addCriterion("CR_CCY2 <=", value, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2Like(String value) {
            addCriterion("CR_CCY2 like", value, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2NotLike(String value) {
            addCriterion("CR_CCY2 not like", value, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2In(List<String> values) {
            addCriterion("CR_CCY2 in", values, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2NotIn(List<String> values) {
            addCriterion("CR_CCY2 not in", values, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2Between(String value1, String value2) {
            addCriterion("CR_CCY2 between", value1, value2, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrCcy2NotBetween(String value1, String value2) {
            addCriterion("CR_CCY2 not between", value1, value2, "crCcy2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2IsNull() {
            addCriterion("CR_REMARK2 is null");
            return (Criteria) this;
        }

        public Criteria andCrRemark2IsNotNull() {
            addCriterion("CR_REMARK2 is not null");
            return (Criteria) this;
        }

        public Criteria andCrRemark2EqualTo(String value) {
            addCriterion("CR_REMARK2 =", value, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2NotEqualTo(String value) {
            addCriterion("CR_REMARK2 <>", value, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2GreaterThan(String value) {
            addCriterion("CR_REMARK2 >", value, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("CR_REMARK2 >=", value, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2LessThan(String value) {
            addCriterion("CR_REMARK2 <", value, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2LessThanOrEqualTo(String value) {
            addCriterion("CR_REMARK2 <=", value, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2Like(String value) {
            addCriterion("CR_REMARK2 like", value, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2NotLike(String value) {
            addCriterion("CR_REMARK2 not like", value, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2In(List<String> values) {
            addCriterion("CR_REMARK2 in", values, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2NotIn(List<String> values) {
            addCriterion("CR_REMARK2 not in", values, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2Between(String value1, String value2) {
            addCriterion("CR_REMARK2 between", value1, value2, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrRemark2NotBetween(String value1, String value2) {
            addCriterion("CR_REMARK2 not between", value1, value2, "crRemark2");
            return (Criteria) this;
        }

        public Criteria andCrAmt2IsNull() {
            addCriterion("CR_AMT2 is null");
            return (Criteria) this;
        }

        public Criteria andCrAmt2IsNotNull() {
            addCriterion("CR_AMT2 is not null");
            return (Criteria) this;
        }

        public Criteria andCrAmt2EqualTo(BigDecimal value) {
            addCriterion("CR_AMT2 =", value, "crAmt2");
            return (Criteria) this;
        }

        public Criteria andCrAmt2NotEqualTo(BigDecimal value) {
            addCriterion("CR_AMT2 <>", value, "crAmt2");
            return (Criteria) this;
        }

        public Criteria andCrAmt2GreaterThan(BigDecimal value) {
            addCriterion("CR_AMT2 >", value, "crAmt2");
            return (Criteria) this;
        }

        public Criteria andCrAmt2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CR_AMT2 >=", value, "crAmt2");
            return (Criteria) this;
        }

        public Criteria andCrAmt2LessThan(BigDecimal value) {
            addCriterion("CR_AMT2 <", value, "crAmt2");
            return (Criteria) this;
        }

        public Criteria andCrAmt2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CR_AMT2 <=", value, "crAmt2");
            return (Criteria) this;
        }

        public Criteria andCrAmt2In(List<BigDecimal> values) {
            addCriterion("CR_AMT2 in", values, "crAmt2");
            return (Criteria) this;
        }

        public Criteria andCrAmt2NotIn(List<BigDecimal> values) {
            addCriterion("CR_AMT2 not in", values, "crAmt2");
            return (Criteria) this;
        }

        public Criteria andCrAmt2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CR_AMT2 between", value1, value2, "crAmt2");
            return (Criteria) this;
        }

        public Criteria andCrAmt2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CR_AMT2 not between", value1, value2, "crAmt2");
            return (Criteria) this;
        }

        public Criteria andDbActno3IsNull() {
            addCriterion("DB_ACTNO3 is null");
            return (Criteria) this;
        }

        public Criteria andDbActno3IsNotNull() {
            addCriterion("DB_ACTNO3 is not null");
            return (Criteria) this;
        }

        public Criteria andDbActno3EqualTo(String value) {
            addCriterion("DB_ACTNO3 =", value, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3NotEqualTo(String value) {
            addCriterion("DB_ACTNO3 <>", value, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3GreaterThan(String value) {
            addCriterion("DB_ACTNO3 >", value, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3GreaterThanOrEqualTo(String value) {
            addCriterion("DB_ACTNO3 >=", value, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3LessThan(String value) {
            addCriterion("DB_ACTNO3 <", value, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3LessThanOrEqualTo(String value) {
            addCriterion("DB_ACTNO3 <=", value, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3Like(String value) {
            addCriterion("DB_ACTNO3 like", value, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3NotLike(String value) {
            addCriterion("DB_ACTNO3 not like", value, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3In(List<String> values) {
            addCriterion("DB_ACTNO3 in", values, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3NotIn(List<String> values) {
            addCriterion("DB_ACTNO3 not in", values, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3Between(String value1, String value2) {
            addCriterion("DB_ACTNO3 between", value1, value2, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbActno3NotBetween(String value1, String value2) {
            addCriterion("DB_ACTNO3 not between", value1, value2, "dbActno3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3IsNull() {
            addCriterion("DB_CCY3 is null");
            return (Criteria) this;
        }

        public Criteria andDbCcy3IsNotNull() {
            addCriterion("DB_CCY3 is not null");
            return (Criteria) this;
        }

        public Criteria andDbCcy3EqualTo(String value) {
            addCriterion("DB_CCY3 =", value, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3NotEqualTo(String value) {
            addCriterion("DB_CCY3 <>", value, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3GreaterThan(String value) {
            addCriterion("DB_CCY3 >", value, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3GreaterThanOrEqualTo(String value) {
            addCriterion("DB_CCY3 >=", value, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3LessThan(String value) {
            addCriterion("DB_CCY3 <", value, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3LessThanOrEqualTo(String value) {
            addCriterion("DB_CCY3 <=", value, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3Like(String value) {
            addCriterion("DB_CCY3 like", value, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3NotLike(String value) {
            addCriterion("DB_CCY3 not like", value, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3In(List<String> values) {
            addCriterion("DB_CCY3 in", values, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3NotIn(List<String> values) {
            addCriterion("DB_CCY3 not in", values, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3Between(String value1, String value2) {
            addCriterion("DB_CCY3 between", value1, value2, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbCcy3NotBetween(String value1, String value2) {
            addCriterion("DB_CCY3 not between", value1, value2, "dbCcy3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3IsNull() {
            addCriterion("DB_REMARK3 is null");
            return (Criteria) this;
        }

        public Criteria andDbRemark3IsNotNull() {
            addCriterion("DB_REMARK3 is not null");
            return (Criteria) this;
        }

        public Criteria andDbRemark3EqualTo(String value) {
            addCriterion("DB_REMARK3 =", value, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3NotEqualTo(String value) {
            addCriterion("DB_REMARK3 <>", value, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3GreaterThan(String value) {
            addCriterion("DB_REMARK3 >", value, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("DB_REMARK3 >=", value, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3LessThan(String value) {
            addCriterion("DB_REMARK3 <", value, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3LessThanOrEqualTo(String value) {
            addCriterion("DB_REMARK3 <=", value, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3Like(String value) {
            addCriterion("DB_REMARK3 like", value, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3NotLike(String value) {
            addCriterion("DB_REMARK3 not like", value, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3In(List<String> values) {
            addCriterion("DB_REMARK3 in", values, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3NotIn(List<String> values) {
            addCriterion("DB_REMARK3 not in", values, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3Between(String value1, String value2) {
            addCriterion("DB_REMARK3 between", value1, value2, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbRemark3NotBetween(String value1, String value2) {
            addCriterion("DB_REMARK3 not between", value1, value2, "dbRemark3");
            return (Criteria) this;
        }

        public Criteria andDbAmt3IsNull() {
            addCriterion("DB_AMT3 is null");
            return (Criteria) this;
        }

        public Criteria andDbAmt3IsNotNull() {
            addCriterion("DB_AMT3 is not null");
            return (Criteria) this;
        }

        public Criteria andDbAmt3EqualTo(BigDecimal value) {
            addCriterion("DB_AMT3 =", value, "dbAmt3");
            return (Criteria) this;
        }

        public Criteria andDbAmt3NotEqualTo(BigDecimal value) {
            addCriterion("DB_AMT3 <>", value, "dbAmt3");
            return (Criteria) this;
        }

        public Criteria andDbAmt3GreaterThan(BigDecimal value) {
            addCriterion("DB_AMT3 >", value, "dbAmt3");
            return (Criteria) this;
        }

        public Criteria andDbAmt3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DB_AMT3 >=", value, "dbAmt3");
            return (Criteria) this;
        }

        public Criteria andDbAmt3LessThan(BigDecimal value) {
            addCriterion("DB_AMT3 <", value, "dbAmt3");
            return (Criteria) this;
        }

        public Criteria andDbAmt3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("DB_AMT3 <=", value, "dbAmt3");
            return (Criteria) this;
        }

        public Criteria andDbAmt3In(List<BigDecimal> values) {
            addCriterion("DB_AMT3 in", values, "dbAmt3");
            return (Criteria) this;
        }

        public Criteria andDbAmt3NotIn(List<BigDecimal> values) {
            addCriterion("DB_AMT3 not in", values, "dbAmt3");
            return (Criteria) this;
        }

        public Criteria andDbAmt3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("DB_AMT3 between", value1, value2, "dbAmt3");
            return (Criteria) this;
        }

        public Criteria andDbAmt3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DB_AMT3 not between", value1, value2, "dbAmt3");
            return (Criteria) this;
        }

        public Criteria andCrActno3IsNull() {
            addCriterion("CR_ACTNO3 is null");
            return (Criteria) this;
        }

        public Criteria andCrActno3IsNotNull() {
            addCriterion("CR_ACTNO3 is not null");
            return (Criteria) this;
        }

        public Criteria andCrActno3EqualTo(String value) {
            addCriterion("CR_ACTNO3 =", value, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3NotEqualTo(String value) {
            addCriterion("CR_ACTNO3 <>", value, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3GreaterThan(String value) {
            addCriterion("CR_ACTNO3 >", value, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3GreaterThanOrEqualTo(String value) {
            addCriterion("CR_ACTNO3 >=", value, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3LessThan(String value) {
            addCriterion("CR_ACTNO3 <", value, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3LessThanOrEqualTo(String value) {
            addCriterion("CR_ACTNO3 <=", value, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3Like(String value) {
            addCriterion("CR_ACTNO3 like", value, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3NotLike(String value) {
            addCriterion("CR_ACTNO3 not like", value, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3In(List<String> values) {
            addCriterion("CR_ACTNO3 in", values, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3NotIn(List<String> values) {
            addCriterion("CR_ACTNO3 not in", values, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3Between(String value1, String value2) {
            addCriterion("CR_ACTNO3 between", value1, value2, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrActno3NotBetween(String value1, String value2) {
            addCriterion("CR_ACTNO3 not between", value1, value2, "crActno3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3IsNull() {
            addCriterion("CR_CCY3 is null");
            return (Criteria) this;
        }

        public Criteria andCrCcy3IsNotNull() {
            addCriterion("CR_CCY3 is not null");
            return (Criteria) this;
        }

        public Criteria andCrCcy3EqualTo(String value) {
            addCriterion("CR_CCY3 =", value, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3NotEqualTo(String value) {
            addCriterion("CR_CCY3 <>", value, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3GreaterThan(String value) {
            addCriterion("CR_CCY3 >", value, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3GreaterThanOrEqualTo(String value) {
            addCriterion("CR_CCY3 >=", value, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3LessThan(String value) {
            addCriterion("CR_CCY3 <", value, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3LessThanOrEqualTo(String value) {
            addCriterion("CR_CCY3 <=", value, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3Like(String value) {
            addCriterion("CR_CCY3 like", value, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3NotLike(String value) {
            addCriterion("CR_CCY3 not like", value, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3In(List<String> values) {
            addCriterion("CR_CCY3 in", values, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3NotIn(List<String> values) {
            addCriterion("CR_CCY3 not in", values, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3Between(String value1, String value2) {
            addCriterion("CR_CCY3 between", value1, value2, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrCcy3NotBetween(String value1, String value2) {
            addCriterion("CR_CCY3 not between", value1, value2, "crCcy3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3IsNull() {
            addCriterion("CR_REMARK3 is null");
            return (Criteria) this;
        }

        public Criteria andCrRemark3IsNotNull() {
            addCriterion("CR_REMARK3 is not null");
            return (Criteria) this;
        }

        public Criteria andCrRemark3EqualTo(String value) {
            addCriterion("CR_REMARK3 =", value, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3NotEqualTo(String value) {
            addCriterion("CR_REMARK3 <>", value, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3GreaterThan(String value) {
            addCriterion("CR_REMARK3 >", value, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("CR_REMARK3 >=", value, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3LessThan(String value) {
            addCriterion("CR_REMARK3 <", value, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3LessThanOrEqualTo(String value) {
            addCriterion("CR_REMARK3 <=", value, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3Like(String value) {
            addCriterion("CR_REMARK3 like", value, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3NotLike(String value) {
            addCriterion("CR_REMARK3 not like", value, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3In(List<String> values) {
            addCriterion("CR_REMARK3 in", values, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3NotIn(List<String> values) {
            addCriterion("CR_REMARK3 not in", values, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3Between(String value1, String value2) {
            addCriterion("CR_REMARK3 between", value1, value2, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrRemark3NotBetween(String value1, String value2) {
            addCriterion("CR_REMARK3 not between", value1, value2, "crRemark3");
            return (Criteria) this;
        }

        public Criteria andCrAmt3IsNull() {
            addCriterion("CR_AMT3 is null");
            return (Criteria) this;
        }

        public Criteria andCrAmt3IsNotNull() {
            addCriterion("CR_AMT3 is not null");
            return (Criteria) this;
        }

        public Criteria andCrAmt3EqualTo(BigDecimal value) {
            addCriterion("CR_AMT3 =", value, "crAmt3");
            return (Criteria) this;
        }

        public Criteria andCrAmt3NotEqualTo(BigDecimal value) {
            addCriterion("CR_AMT3 <>", value, "crAmt3");
            return (Criteria) this;
        }

        public Criteria andCrAmt3GreaterThan(BigDecimal value) {
            addCriterion("CR_AMT3 >", value, "crAmt3");
            return (Criteria) this;
        }

        public Criteria andCrAmt3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CR_AMT3 >=", value, "crAmt3");
            return (Criteria) this;
        }

        public Criteria andCrAmt3LessThan(BigDecimal value) {
            addCriterion("CR_AMT3 <", value, "crAmt3");
            return (Criteria) this;
        }

        public Criteria andCrAmt3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CR_AMT3 <=", value, "crAmt3");
            return (Criteria) this;
        }

        public Criteria andCrAmt3In(List<BigDecimal> values) {
            addCriterion("CR_AMT3 in", values, "crAmt3");
            return (Criteria) this;
        }

        public Criteria andCrAmt3NotIn(List<BigDecimal> values) {
            addCriterion("CR_AMT3 not in", values, "crAmt3");
            return (Criteria) this;
        }

        public Criteria andCrAmt3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CR_AMT3 between", value1, value2, "crAmt3");
            return (Criteria) this;
        }

        public Criteria andCrAmt3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CR_AMT3 not between", value1, value2, "crAmt3");
            return (Criteria) this;
        }

        public Criteria andDbActno4IsNull() {
            addCriterion("DB_ACTNO4 is null");
            return (Criteria) this;
        }

        public Criteria andDbActno4IsNotNull() {
            addCriterion("DB_ACTNO4 is not null");
            return (Criteria) this;
        }

        public Criteria andDbActno4EqualTo(String value) {
            addCriterion("DB_ACTNO4 =", value, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4NotEqualTo(String value) {
            addCriterion("DB_ACTNO4 <>", value, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4GreaterThan(String value) {
            addCriterion("DB_ACTNO4 >", value, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4GreaterThanOrEqualTo(String value) {
            addCriterion("DB_ACTNO4 >=", value, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4LessThan(String value) {
            addCriterion("DB_ACTNO4 <", value, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4LessThanOrEqualTo(String value) {
            addCriterion("DB_ACTNO4 <=", value, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4Like(String value) {
            addCriterion("DB_ACTNO4 like", value, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4NotLike(String value) {
            addCriterion("DB_ACTNO4 not like", value, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4In(List<String> values) {
            addCriterion("DB_ACTNO4 in", values, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4NotIn(List<String> values) {
            addCriterion("DB_ACTNO4 not in", values, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4Between(String value1, String value2) {
            addCriterion("DB_ACTNO4 between", value1, value2, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbActno4NotBetween(String value1, String value2) {
            addCriterion("DB_ACTNO4 not between", value1, value2, "dbActno4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4IsNull() {
            addCriterion("DB_CCY4 is null");
            return (Criteria) this;
        }

        public Criteria andDbCcy4IsNotNull() {
            addCriterion("DB_CCY4 is not null");
            return (Criteria) this;
        }

        public Criteria andDbCcy4EqualTo(String value) {
            addCriterion("DB_CCY4 =", value, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4NotEqualTo(String value) {
            addCriterion("DB_CCY4 <>", value, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4GreaterThan(String value) {
            addCriterion("DB_CCY4 >", value, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4GreaterThanOrEqualTo(String value) {
            addCriterion("DB_CCY4 >=", value, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4LessThan(String value) {
            addCriterion("DB_CCY4 <", value, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4LessThanOrEqualTo(String value) {
            addCriterion("DB_CCY4 <=", value, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4Like(String value) {
            addCriterion("DB_CCY4 like", value, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4NotLike(String value) {
            addCriterion("DB_CCY4 not like", value, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4In(List<String> values) {
            addCriterion("DB_CCY4 in", values, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4NotIn(List<String> values) {
            addCriterion("DB_CCY4 not in", values, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4Between(String value1, String value2) {
            addCriterion("DB_CCY4 between", value1, value2, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbCcy4NotBetween(String value1, String value2) {
            addCriterion("DB_CCY4 not between", value1, value2, "dbCcy4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4IsNull() {
            addCriterion("DB_REMARK4 is null");
            return (Criteria) this;
        }

        public Criteria andDbRemark4IsNotNull() {
            addCriterion("DB_REMARK4 is not null");
            return (Criteria) this;
        }

        public Criteria andDbRemark4EqualTo(String value) {
            addCriterion("DB_REMARK4 =", value, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4NotEqualTo(String value) {
            addCriterion("DB_REMARK4 <>", value, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4GreaterThan(String value) {
            addCriterion("DB_REMARK4 >", value, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("DB_REMARK4 >=", value, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4LessThan(String value) {
            addCriterion("DB_REMARK4 <", value, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4LessThanOrEqualTo(String value) {
            addCriterion("DB_REMARK4 <=", value, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4Like(String value) {
            addCriterion("DB_REMARK4 like", value, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4NotLike(String value) {
            addCriterion("DB_REMARK4 not like", value, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4In(List<String> values) {
            addCriterion("DB_REMARK4 in", values, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4NotIn(List<String> values) {
            addCriterion("DB_REMARK4 not in", values, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4Between(String value1, String value2) {
            addCriterion("DB_REMARK4 between", value1, value2, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbRemark4NotBetween(String value1, String value2) {
            addCriterion("DB_REMARK4 not between", value1, value2, "dbRemark4");
            return (Criteria) this;
        }

        public Criteria andDbAmt4IsNull() {
            addCriterion("DB_AMT4 is null");
            return (Criteria) this;
        }

        public Criteria andDbAmt4IsNotNull() {
            addCriterion("DB_AMT4 is not null");
            return (Criteria) this;
        }

        public Criteria andDbAmt4EqualTo(BigDecimal value) {
            addCriterion("DB_AMT4 =", value, "dbAmt4");
            return (Criteria) this;
        }

        public Criteria andDbAmt4NotEqualTo(BigDecimal value) {
            addCriterion("DB_AMT4 <>", value, "dbAmt4");
            return (Criteria) this;
        }

        public Criteria andDbAmt4GreaterThan(BigDecimal value) {
            addCriterion("DB_AMT4 >", value, "dbAmt4");
            return (Criteria) this;
        }

        public Criteria andDbAmt4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DB_AMT4 >=", value, "dbAmt4");
            return (Criteria) this;
        }

        public Criteria andDbAmt4LessThan(BigDecimal value) {
            addCriterion("DB_AMT4 <", value, "dbAmt4");
            return (Criteria) this;
        }

        public Criteria andDbAmt4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("DB_AMT4 <=", value, "dbAmt4");
            return (Criteria) this;
        }

        public Criteria andDbAmt4In(List<BigDecimal> values) {
            addCriterion("DB_AMT4 in", values, "dbAmt4");
            return (Criteria) this;
        }

        public Criteria andDbAmt4NotIn(List<BigDecimal> values) {
            addCriterion("DB_AMT4 not in", values, "dbAmt4");
            return (Criteria) this;
        }

        public Criteria andDbAmt4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("DB_AMT4 between", value1, value2, "dbAmt4");
            return (Criteria) this;
        }

        public Criteria andDbAmt4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DB_AMT4 not between", value1, value2, "dbAmt4");
            return (Criteria) this;
        }

        public Criteria andCrActno4IsNull() {
            addCriterion("CR_ACTNO4 is null");
            return (Criteria) this;
        }

        public Criteria andCrActno4IsNotNull() {
            addCriterion("CR_ACTNO4 is not null");
            return (Criteria) this;
        }

        public Criteria andCrActno4EqualTo(String value) {
            addCriterion("CR_ACTNO4 =", value, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4NotEqualTo(String value) {
            addCriterion("CR_ACTNO4 <>", value, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4GreaterThan(String value) {
            addCriterion("CR_ACTNO4 >", value, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4GreaterThanOrEqualTo(String value) {
            addCriterion("CR_ACTNO4 >=", value, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4LessThan(String value) {
            addCriterion("CR_ACTNO4 <", value, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4LessThanOrEqualTo(String value) {
            addCriterion("CR_ACTNO4 <=", value, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4Like(String value) {
            addCriterion("CR_ACTNO4 like", value, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4NotLike(String value) {
            addCriterion("CR_ACTNO4 not like", value, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4In(List<String> values) {
            addCriterion("CR_ACTNO4 in", values, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4NotIn(List<String> values) {
            addCriterion("CR_ACTNO4 not in", values, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4Between(String value1, String value2) {
            addCriterion("CR_ACTNO4 between", value1, value2, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrActno4NotBetween(String value1, String value2) {
            addCriterion("CR_ACTNO4 not between", value1, value2, "crActno4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4IsNull() {
            addCriterion("CR_CCY4 is null");
            return (Criteria) this;
        }

        public Criteria andCrCcy4IsNotNull() {
            addCriterion("CR_CCY4 is not null");
            return (Criteria) this;
        }

        public Criteria andCrCcy4EqualTo(String value) {
            addCriterion("CR_CCY4 =", value, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4NotEqualTo(String value) {
            addCriterion("CR_CCY4 <>", value, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4GreaterThan(String value) {
            addCriterion("CR_CCY4 >", value, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4GreaterThanOrEqualTo(String value) {
            addCriterion("CR_CCY4 >=", value, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4LessThan(String value) {
            addCriterion("CR_CCY4 <", value, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4LessThanOrEqualTo(String value) {
            addCriterion("CR_CCY4 <=", value, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4Like(String value) {
            addCriterion("CR_CCY4 like", value, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4NotLike(String value) {
            addCriterion("CR_CCY4 not like", value, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4In(List<String> values) {
            addCriterion("CR_CCY4 in", values, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4NotIn(List<String> values) {
            addCriterion("CR_CCY4 not in", values, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4Between(String value1, String value2) {
            addCriterion("CR_CCY4 between", value1, value2, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrCcy4NotBetween(String value1, String value2) {
            addCriterion("CR_CCY4 not between", value1, value2, "crCcy4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4IsNull() {
            addCriterion("CR_REMARK4 is null");
            return (Criteria) this;
        }

        public Criteria andCrRemark4IsNotNull() {
            addCriterion("CR_REMARK4 is not null");
            return (Criteria) this;
        }

        public Criteria andCrRemark4EqualTo(String value) {
            addCriterion("CR_REMARK4 =", value, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4NotEqualTo(String value) {
            addCriterion("CR_REMARK4 <>", value, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4GreaterThan(String value) {
            addCriterion("CR_REMARK4 >", value, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4GreaterThanOrEqualTo(String value) {
            addCriterion("CR_REMARK4 >=", value, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4LessThan(String value) {
            addCriterion("CR_REMARK4 <", value, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4LessThanOrEqualTo(String value) {
            addCriterion("CR_REMARK4 <=", value, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4Like(String value) {
            addCriterion("CR_REMARK4 like", value, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4NotLike(String value) {
            addCriterion("CR_REMARK4 not like", value, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4In(List<String> values) {
            addCriterion("CR_REMARK4 in", values, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4NotIn(List<String> values) {
            addCriterion("CR_REMARK4 not in", values, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4Between(String value1, String value2) {
            addCriterion("CR_REMARK4 between", value1, value2, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrRemark4NotBetween(String value1, String value2) {
            addCriterion("CR_REMARK4 not between", value1, value2, "crRemark4");
            return (Criteria) this;
        }

        public Criteria andCrAmt4IsNull() {
            addCriterion("CR_AMT4 is null");
            return (Criteria) this;
        }

        public Criteria andCrAmt4IsNotNull() {
            addCriterion("CR_AMT4 is not null");
            return (Criteria) this;
        }

        public Criteria andCrAmt4EqualTo(BigDecimal value) {
            addCriterion("CR_AMT4 =", value, "crAmt4");
            return (Criteria) this;
        }

        public Criteria andCrAmt4NotEqualTo(BigDecimal value) {
            addCriterion("CR_AMT4 <>", value, "crAmt4");
            return (Criteria) this;
        }

        public Criteria andCrAmt4GreaterThan(BigDecimal value) {
            addCriterion("CR_AMT4 >", value, "crAmt4");
            return (Criteria) this;
        }

        public Criteria andCrAmt4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CR_AMT4 >=", value, "crAmt4");
            return (Criteria) this;
        }

        public Criteria andCrAmt4LessThan(BigDecimal value) {
            addCriterion("CR_AMT4 <", value, "crAmt4");
            return (Criteria) this;
        }

        public Criteria andCrAmt4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("CR_AMT4 <=", value, "crAmt4");
            return (Criteria) this;
        }

        public Criteria andCrAmt4In(List<BigDecimal> values) {
            addCriterion("CR_AMT4 in", values, "crAmt4");
            return (Criteria) this;
        }

        public Criteria andCrAmt4NotIn(List<BigDecimal> values) {
            addCriterion("CR_AMT4 not in", values, "crAmt4");
            return (Criteria) this;
        }

        public Criteria andCrAmt4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("CR_AMT4 between", value1, value2, "crAmt4");
            return (Criteria) this;
        }

        public Criteria andCrAmt4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CR_AMT4 not between", value1, value2, "crAmt4");
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