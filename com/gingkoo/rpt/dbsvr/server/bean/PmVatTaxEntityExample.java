package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmVatTaxEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmVatTaxEntityExample() {
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

        public Criteria andOrgNameIsNull() {
            addCriterion("ORG_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrgNameIsNotNull() {
            addCriterion("ORG_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNameEqualTo(String value) {
            addCriterion("ORG_NAME =", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotEqualTo(String value) {
            addCriterion("ORG_NAME <>", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThan(String value) {
            addCriterion("ORG_NAME >", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NAME >=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThan(String value) {
            addCriterion("ORG_NAME <", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLessThanOrEqualTo(String value) {
            addCriterion("ORG_NAME <=", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameLike(String value) {
            addCriterion("ORG_NAME like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotLike(String value) {
            addCriterion("ORG_NAME not like", value, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameIn(List<String> values) {
            addCriterion("ORG_NAME in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotIn(List<String> values) {
            addCriterion("ORG_NAME not in", values, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameBetween(String value1, String value2) {
            addCriterion("ORG_NAME between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andOrgNameNotBetween(String value1, String value2) {
            addCriterion("ORG_NAME not between", value1, value2, "orgName");
            return (Criteria) this;
        }

        public Criteria andTaxNoIsNull() {
            addCriterion("TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andTaxNoIsNotNull() {
            addCriterion("TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxNoEqualTo(String value) {
            addCriterion("TAX_NO =", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotEqualTo(String value) {
            addCriterion("TAX_NO <>", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoGreaterThan(String value) {
            addCriterion("TAX_NO >", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_NO >=", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLessThan(String value) {
            addCriterion("TAX_NO <", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLessThanOrEqualTo(String value) {
            addCriterion("TAX_NO <=", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoLike(String value) {
            addCriterion("TAX_NO like", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotLike(String value) {
            addCriterion("TAX_NO not like", value, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoIn(List<String> values) {
            addCriterion("TAX_NO in", values, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotIn(List<String> values) {
            addCriterion("TAX_NO not in", values, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoBetween(String value1, String value2) {
            addCriterion("TAX_NO between", value1, value2, "taxNo");
            return (Criteria) this;
        }

        public Criteria andTaxNoNotBetween(String value1, String value2) {
            addCriterion("TAX_NO not between", value1, value2, "taxNo");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("ADDR =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("ADDR <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("ADDR >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("ADDR <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("ADDR <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("ADDR like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("ADDR not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("ADDR in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("ADDR not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("ADDR between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("ADDR not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNull() {
            addCriterion("BANK_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNotNull() {
            addCriterion("BANK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankNoEqualTo(String value) {
            addCriterion("BANK_NO =", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("BANK_NO <>", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("BANK_NO >", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NO >=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThan(String value) {
            addCriterion("BANK_NO <", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_NO <=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLike(String value) {
            addCriterion("BANK_NO like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotLike(String value) {
            addCriterion("BANK_NO not like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoIn(List<String> values) {
            addCriterion("BANK_NO in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("BANK_NO not in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("BANK_NO between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("BANK_NO not between", value1, value2, "bankNo");
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

        public Criteria andExchangeTypeIsNull() {
            addCriterion("EXCHANGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIsNotNull() {
            addCriterion("EXCHANGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE =", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE <>", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThan(String value) {
            addCriterion("EXCHANGE_TYPE >", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE >=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThan(String value) {
            addCriterion("EXCHANGE_TYPE <", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLessThanOrEqualTo(String value) {
            addCriterion("EXCHANGE_TYPE <=", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeLike(String value) {
            addCriterion("EXCHANGE_TYPE like", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotLike(String value) {
            addCriterion("EXCHANGE_TYPE not like", value, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeIn(List<String> values) {
            addCriterion("EXCHANGE_TYPE in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotIn(List<String> values) {
            addCriterion("EXCHANGE_TYPE not in", values, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeBetween(String value1, String value2) {
            addCriterion("EXCHANGE_TYPE between", value1, value2, "exchangeType");
            return (Criteria) this;
        }

        public Criteria andExchangeTypeNotBetween(String value1, String value2) {
            addCriterion("EXCHANGE_TYPE not between", value1, value2, "exchangeType");
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

        public Criteria andVocNumIsNull() {
            addCriterion("VOC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andVocNumIsNotNull() {
            addCriterion("VOC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andVocNumEqualTo(String value) {
            addCriterion("VOC_NUM =", value, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumNotEqualTo(String value) {
            addCriterion("VOC_NUM <>", value, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumGreaterThan(String value) {
            addCriterion("VOC_NUM >", value, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_NUM >=", value, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumLessThan(String value) {
            addCriterion("VOC_NUM <", value, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumLessThanOrEqualTo(String value) {
            addCriterion("VOC_NUM <=", value, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumLike(String value) {
            addCriterion("VOC_NUM like", value, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumNotLike(String value) {
            addCriterion("VOC_NUM not like", value, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumIn(List<String> values) {
            addCriterion("VOC_NUM in", values, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumNotIn(List<String> values) {
            addCriterion("VOC_NUM not in", values, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumBetween(String value1, String value2) {
            addCriterion("VOC_NUM between", value1, value2, "vocNum");
            return (Criteria) this;
        }

        public Criteria andVocNumNotBetween(String value1, String value2) {
            addCriterion("VOC_NUM not between", value1, value2, "vocNum");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnIsNull() {
            addCriterion("TAX_KEY_SN is null");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnIsNotNull() {
            addCriterion("TAX_KEY_SN is not null");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnEqualTo(String value) {
            addCriterion("TAX_KEY_SN =", value, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnNotEqualTo(String value) {
            addCriterion("TAX_KEY_SN <>", value, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnGreaterThan(String value) {
            addCriterion("TAX_KEY_SN >", value, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_KEY_SN >=", value, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnLessThan(String value) {
            addCriterion("TAX_KEY_SN <", value, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnLessThanOrEqualTo(String value) {
            addCriterion("TAX_KEY_SN <=", value, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnLike(String value) {
            addCriterion("TAX_KEY_SN like", value, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnNotLike(String value) {
            addCriterion("TAX_KEY_SN not like", value, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnIn(List<String> values) {
            addCriterion("TAX_KEY_SN in", values, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnNotIn(List<String> values) {
            addCriterion("TAX_KEY_SN not in", values, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnBetween(String value1, String value2) {
            addCriterion("TAX_KEY_SN between", value1, value2, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andTaxKeySnNotBetween(String value1, String value2) {
            addCriterion("TAX_KEY_SN not between", value1, value2, "taxKeySn");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andMachineNoIsNull() {
            addCriterion("MACHINE_NO is null");
            return (Criteria) this;
        }

        public Criteria andMachineNoIsNotNull() {
            addCriterion("MACHINE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNoEqualTo(String value) {
            addCriterion("MACHINE_NO =", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotEqualTo(String value) {
            addCriterion("MACHINE_NO <>", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoGreaterThan(String value) {
            addCriterion("MACHINE_NO >", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoGreaterThanOrEqualTo(String value) {
            addCriterion("MACHINE_NO >=", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLessThan(String value) {
            addCriterion("MACHINE_NO <", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLessThanOrEqualTo(String value) {
            addCriterion("MACHINE_NO <=", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoLike(String value) {
            addCriterion("MACHINE_NO like", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotLike(String value) {
            addCriterion("MACHINE_NO not like", value, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoIn(List<String> values) {
            addCriterion("MACHINE_NO in", values, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotIn(List<String> values) {
            addCriterion("MACHINE_NO not in", values, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoBetween(String value1, String value2) {
            addCriterion("MACHINE_NO between", value1, value2, "machineNo");
            return (Criteria) this;
        }

        public Criteria andMachineNoNotBetween(String value1, String value2) {
            addCriterion("MACHINE_NO not between", value1, value2, "machineNo");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumIsNull() {
            addCriterion("VOC_MAX_S_NUM is null");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumIsNotNull() {
            addCriterion("VOC_MAX_S_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_S_NUM =", value, "vocMaxSNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumNotEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_S_NUM <>", value, "vocMaxSNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumGreaterThan(BigDecimal value) {
            addCriterion("VOC_MAX_S_NUM >", value, "vocMaxSNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_S_NUM >=", value, "vocMaxSNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumLessThan(BigDecimal value) {
            addCriterion("VOC_MAX_S_NUM <", value, "vocMaxSNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_S_NUM <=", value, "vocMaxSNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumIn(List<BigDecimal> values) {
            addCriterion("VOC_MAX_S_NUM in", values, "vocMaxSNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumNotIn(List<BigDecimal> values) {
            addCriterion("VOC_MAX_S_NUM not in", values, "vocMaxSNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_MAX_S_NUM between", value1, value2, "vocMaxSNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxSNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_MAX_S_NUM not between", value1, value2, "vocMaxSNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumIsNull() {
            addCriterion("VOC_MAX_C_NUM is null");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumIsNotNull() {
            addCriterion("VOC_MAX_C_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_C_NUM =", value, "vocMaxCNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumNotEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_C_NUM <>", value, "vocMaxCNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumGreaterThan(BigDecimal value) {
            addCriterion("VOC_MAX_C_NUM >", value, "vocMaxCNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_C_NUM >=", value, "vocMaxCNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumLessThan(BigDecimal value) {
            addCriterion("VOC_MAX_C_NUM <", value, "vocMaxCNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_C_NUM <=", value, "vocMaxCNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumIn(List<BigDecimal> values) {
            addCriterion("VOC_MAX_C_NUM in", values, "vocMaxCNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumNotIn(List<BigDecimal> values) {
            addCriterion("VOC_MAX_C_NUM not in", values, "vocMaxCNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_MAX_C_NUM between", value1, value2, "vocMaxCNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxCNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_MAX_C_NUM not between", value1, value2, "vocMaxCNum");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtIsNull() {
            addCriterion("VOC_MAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtIsNotNull() {
            addCriterion("VOC_MAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_AMT =", value, "vocMaxAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_AMT <>", value, "vocMaxAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtGreaterThan(BigDecimal value) {
            addCriterion("VOC_MAX_AMT >", value, "vocMaxAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_AMT >=", value, "vocMaxAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtLessThan(BigDecimal value) {
            addCriterion("VOC_MAX_AMT <", value, "vocMaxAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_AMT <=", value, "vocMaxAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtIn(List<BigDecimal> values) {
            addCriterion("VOC_MAX_AMT in", values, "vocMaxAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("VOC_MAX_AMT not in", values, "vocMaxAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_MAX_AMT between", value1, value2, "vocMaxAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_MAX_AMT not between", value1, value2, "vocMaxAmt");
            return (Criteria) this;
        }

        public Criteria andVocAmtIsNull() {
            addCriterion("VOC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andVocAmtIsNotNull() {
            addCriterion("VOC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andVocAmtEqualTo(BigDecimal value) {
            addCriterion("VOC_AMT =", value, "vocAmt");
            return (Criteria) this;
        }

        public Criteria andVocAmtNotEqualTo(BigDecimal value) {
            addCriterion("VOC_AMT <>", value, "vocAmt");
            return (Criteria) this;
        }

        public Criteria andVocAmtGreaterThan(BigDecimal value) {
            addCriterion("VOC_AMT >", value, "vocAmt");
            return (Criteria) this;
        }

        public Criteria andVocAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_AMT >=", value, "vocAmt");
            return (Criteria) this;
        }

        public Criteria andVocAmtLessThan(BigDecimal value) {
            addCriterion("VOC_AMT <", value, "vocAmt");
            return (Criteria) this;
        }

        public Criteria andVocAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_AMT <=", value, "vocAmt");
            return (Criteria) this;
        }

        public Criteria andVocAmtIn(List<BigDecimal> values) {
            addCriterion("VOC_AMT in", values, "vocAmt");
            return (Criteria) this;
        }

        public Criteria andVocAmtNotIn(List<BigDecimal> values) {
            addCriterion("VOC_AMT not in", values, "vocAmt");
            return (Criteria) this;
        }

        public Criteria andVocAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_AMT between", value1, value2, "vocAmt");
            return (Criteria) this;
        }

        public Criteria andVocAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_AMT not between", value1, value2, "vocAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtIsNull() {
            addCriterion("VOC_MAX_S_AMT is null");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtIsNotNull() {
            addCriterion("VOC_MAX_S_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_S_AMT =", value, "vocMaxSAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtNotEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_S_AMT <>", value, "vocMaxSAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtGreaterThan(BigDecimal value) {
            addCriterion("VOC_MAX_S_AMT >", value, "vocMaxSAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_S_AMT >=", value, "vocMaxSAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtLessThan(BigDecimal value) {
            addCriterion("VOC_MAX_S_AMT <", value, "vocMaxSAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_S_AMT <=", value, "vocMaxSAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtIn(List<BigDecimal> values) {
            addCriterion("VOC_MAX_S_AMT in", values, "vocMaxSAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtNotIn(List<BigDecimal> values) {
            addCriterion("VOC_MAX_S_AMT not in", values, "vocMaxSAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_MAX_S_AMT between", value1, value2, "vocMaxSAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxSAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_MAX_S_AMT not between", value1, value2, "vocMaxSAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtIsNull() {
            addCriterion("VOC_MAX_C_AMT is null");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtIsNotNull() {
            addCriterion("VOC_MAX_C_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_C_AMT =", value, "vocMaxCAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtNotEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_C_AMT <>", value, "vocMaxCAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtGreaterThan(BigDecimal value) {
            addCriterion("VOC_MAX_C_AMT >", value, "vocMaxCAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_C_AMT >=", value, "vocMaxCAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtLessThan(BigDecimal value) {
            addCriterion("VOC_MAX_C_AMT <", value, "vocMaxCAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_MAX_C_AMT <=", value, "vocMaxCAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtIn(List<BigDecimal> values) {
            addCriterion("VOC_MAX_C_AMT in", values, "vocMaxCAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtNotIn(List<BigDecimal> values) {
            addCriterion("VOC_MAX_C_AMT not in", values, "vocMaxCAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_MAX_C_AMT between", value1, value2, "vocMaxCAmt");
            return (Criteria) this;
        }

        public Criteria andVocMaxCAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_MAX_C_AMT not between", value1, value2, "vocMaxCAmt");
            return (Criteria) this;
        }

        public Criteria andVocSAmtIsNull() {
            addCriterion("VOC_S_AMT is null");
            return (Criteria) this;
        }

        public Criteria andVocSAmtIsNotNull() {
            addCriterion("VOC_S_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andVocSAmtEqualTo(BigDecimal value) {
            addCriterion("VOC_S_AMT =", value, "vocSAmt");
            return (Criteria) this;
        }

        public Criteria andVocSAmtNotEqualTo(BigDecimal value) {
            addCriterion("VOC_S_AMT <>", value, "vocSAmt");
            return (Criteria) this;
        }

        public Criteria andVocSAmtGreaterThan(BigDecimal value) {
            addCriterion("VOC_S_AMT >", value, "vocSAmt");
            return (Criteria) this;
        }

        public Criteria andVocSAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_S_AMT >=", value, "vocSAmt");
            return (Criteria) this;
        }

        public Criteria andVocSAmtLessThan(BigDecimal value) {
            addCriterion("VOC_S_AMT <", value, "vocSAmt");
            return (Criteria) this;
        }

        public Criteria andVocSAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_S_AMT <=", value, "vocSAmt");
            return (Criteria) this;
        }

        public Criteria andVocSAmtIn(List<BigDecimal> values) {
            addCriterion("VOC_S_AMT in", values, "vocSAmt");
            return (Criteria) this;
        }

        public Criteria andVocSAmtNotIn(List<BigDecimal> values) {
            addCriterion("VOC_S_AMT not in", values, "vocSAmt");
            return (Criteria) this;
        }

        public Criteria andVocSAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_S_AMT between", value1, value2, "vocSAmt");
            return (Criteria) this;
        }

        public Criteria andVocSAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_S_AMT not between", value1, value2, "vocSAmt");
            return (Criteria) this;
        }

        public Criteria andVocCAmtIsNull() {
            addCriterion("VOC_C_AMT is null");
            return (Criteria) this;
        }

        public Criteria andVocCAmtIsNotNull() {
            addCriterion("VOC_C_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andVocCAmtEqualTo(BigDecimal value) {
            addCriterion("VOC_C_AMT =", value, "vocCAmt");
            return (Criteria) this;
        }

        public Criteria andVocCAmtNotEqualTo(BigDecimal value) {
            addCriterion("VOC_C_AMT <>", value, "vocCAmt");
            return (Criteria) this;
        }

        public Criteria andVocCAmtGreaterThan(BigDecimal value) {
            addCriterion("VOC_C_AMT >", value, "vocCAmt");
            return (Criteria) this;
        }

        public Criteria andVocCAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_C_AMT >=", value, "vocCAmt");
            return (Criteria) this;
        }

        public Criteria andVocCAmtLessThan(BigDecimal value) {
            addCriterion("VOC_C_AMT <", value, "vocCAmt");
            return (Criteria) this;
        }

        public Criteria andVocCAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_C_AMT <=", value, "vocCAmt");
            return (Criteria) this;
        }

        public Criteria andVocCAmtIn(List<BigDecimal> values) {
            addCriterion("VOC_C_AMT in", values, "vocCAmt");
            return (Criteria) this;
        }

        public Criteria andVocCAmtNotIn(List<BigDecimal> values) {
            addCriterion("VOC_C_AMT not in", values, "vocCAmt");
            return (Criteria) this;
        }

        public Criteria andVocCAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_C_AMT between", value1, value2, "vocCAmt");
            return (Criteria) this;
        }

        public Criteria andVocCAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_C_AMT not between", value1, value2, "vocCAmt");
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

        public Criteria andIdentityRuleGroupIsNull() {
            addCriterion("IDENTITY_RULE_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupIsNotNull() {
            addCriterion("IDENTITY_RULE_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupEqualTo(String value) {
            addCriterion("IDENTITY_RULE_GROUP =", value, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupNotEqualTo(String value) {
            addCriterion("IDENTITY_RULE_GROUP <>", value, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupGreaterThan(String value) {
            addCriterion("IDENTITY_RULE_GROUP >", value, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTITY_RULE_GROUP >=", value, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupLessThan(String value) {
            addCriterion("IDENTITY_RULE_GROUP <", value, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupLessThanOrEqualTo(String value) {
            addCriterion("IDENTITY_RULE_GROUP <=", value, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupLike(String value) {
            addCriterion("IDENTITY_RULE_GROUP like", value, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupNotLike(String value) {
            addCriterion("IDENTITY_RULE_GROUP not like", value, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupIn(List<String> values) {
            addCriterion("IDENTITY_RULE_GROUP in", values, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupNotIn(List<String> values) {
            addCriterion("IDENTITY_RULE_GROUP not in", values, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupBetween(String value1, String value2) {
            addCriterion("IDENTITY_RULE_GROUP between", value1, value2, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andIdentityRuleGroupNotBetween(String value1, String value2) {
            addCriterion("IDENTITY_RULE_GROUP not between", value1, value2, "identityRuleGroup");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdIsNull() {
            addCriterion("REPORT_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdIsNotNull() {
            addCriterion("REPORT_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdEqualTo(String value) {
            addCriterion("REPORT_ORG_ID =", value, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdNotEqualTo(String value) {
            addCriterion("REPORT_ORG_ID <>", value, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdGreaterThan(String value) {
            addCriterion("REPORT_ORG_ID >", value, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_ORG_ID >=", value, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdLessThan(String value) {
            addCriterion("REPORT_ORG_ID <", value, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdLessThanOrEqualTo(String value) {
            addCriterion("REPORT_ORG_ID <=", value, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdLike(String value) {
            addCriterion("REPORT_ORG_ID like", value, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdNotLike(String value) {
            addCriterion("REPORT_ORG_ID not like", value, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdIn(List<String> values) {
            addCriterion("REPORT_ORG_ID in", values, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdNotIn(List<String> values) {
            addCriterion("REPORT_ORG_ID not in", values, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdBetween(String value1, String value2) {
            addCriterion("REPORT_ORG_ID between", value1, value2, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportOrgIdNotBetween(String value1, String value2) {
            addCriterion("REPORT_ORG_ID not between", value1, value2, "reportOrgId");
            return (Criteria) this;
        }

        public Criteria andReportCycleIsNull() {
            addCriterion("REPORT_CYCLE is null");
            return (Criteria) this;
        }

        public Criteria andReportCycleIsNotNull() {
            addCriterion("REPORT_CYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andReportCycleEqualTo(String value) {
            addCriterion("REPORT_CYCLE =", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleNotEqualTo(String value) {
            addCriterion("REPORT_CYCLE <>", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleGreaterThan(String value) {
            addCriterion("REPORT_CYCLE >", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_CYCLE >=", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleLessThan(String value) {
            addCriterion("REPORT_CYCLE <", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleLessThanOrEqualTo(String value) {
            addCriterion("REPORT_CYCLE <=", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleLike(String value) {
            addCriterion("REPORT_CYCLE like", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleNotLike(String value) {
            addCriterion("REPORT_CYCLE not like", value, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleIn(List<String> values) {
            addCriterion("REPORT_CYCLE in", values, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleNotIn(List<String> values) {
            addCriterion("REPORT_CYCLE not in", values, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleBetween(String value1, String value2) {
            addCriterion("REPORT_CYCLE between", value1, value2, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andReportCycleNotBetween(String value1, String value2) {
            addCriterion("REPORT_CYCLE not between", value1, value2, "reportCycle");
            return (Criteria) this;
        }

        public Criteria andTaxModIsNull() {
            addCriterion("TAX_MOD is null");
            return (Criteria) this;
        }

        public Criteria andTaxModIsNotNull() {
            addCriterion("TAX_MOD is not null");
            return (Criteria) this;
        }

        public Criteria andTaxModEqualTo(String value) {
            addCriterion("TAX_MOD =", value, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModNotEqualTo(String value) {
            addCriterion("TAX_MOD <>", value, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModGreaterThan(String value) {
            addCriterion("TAX_MOD >", value, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_MOD >=", value, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModLessThan(String value) {
            addCriterion("TAX_MOD <", value, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModLessThanOrEqualTo(String value) {
            addCriterion("TAX_MOD <=", value, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModLike(String value) {
            addCriterion("TAX_MOD like", value, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModNotLike(String value) {
            addCriterion("TAX_MOD not like", value, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModIn(List<String> values) {
            addCriterion("TAX_MOD in", values, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModNotIn(List<String> values) {
            addCriterion("TAX_MOD not in", values, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModBetween(String value1, String value2) {
            addCriterion("TAX_MOD between", value1, value2, "taxMod");
            return (Criteria) this;
        }

        public Criteria andTaxModNotBetween(String value1, String value2) {
            addCriterion("TAX_MOD not between", value1, value2, "taxMod");
            return (Criteria) this;
        }

        public Criteria andStateRateIsNull() {
            addCriterion("STATE_RATE is null");
            return (Criteria) this;
        }

        public Criteria andStateRateIsNotNull() {
            addCriterion("STATE_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateRateEqualTo(BigDecimal value) {
            addCriterion("STATE_RATE =", value, "stateRate");
            return (Criteria) this;
        }

        public Criteria andStateRateNotEqualTo(BigDecimal value) {
            addCriterion("STATE_RATE <>", value, "stateRate");
            return (Criteria) this;
        }

        public Criteria andStateRateGreaterThan(BigDecimal value) {
            addCriterion("STATE_RATE >", value, "stateRate");
            return (Criteria) this;
        }

        public Criteria andStateRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATE_RATE >=", value, "stateRate");
            return (Criteria) this;
        }

        public Criteria andStateRateLessThan(BigDecimal value) {
            addCriterion("STATE_RATE <", value, "stateRate");
            return (Criteria) this;
        }

        public Criteria andStateRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATE_RATE <=", value, "stateRate");
            return (Criteria) this;
        }

        public Criteria andStateRateIn(List<BigDecimal> values) {
            addCriterion("STATE_RATE in", values, "stateRate");
            return (Criteria) this;
        }

        public Criteria andStateRateNotIn(List<BigDecimal> values) {
            addCriterion("STATE_RATE not in", values, "stateRate");
            return (Criteria) this;
        }

        public Criteria andStateRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATE_RATE between", value1, value2, "stateRate");
            return (Criteria) this;
        }

        public Criteria andStateRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATE_RATE not between", value1, value2, "stateRate");
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

        public Criteria andRegTypeIsNull() {
            addCriterion("REG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRegTypeIsNotNull() {
            addCriterion("REG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRegTypeEqualTo(String value) {
            addCriterion("REG_TYPE =", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotEqualTo(String value) {
            addCriterion("REG_TYPE <>", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeGreaterThan(String value) {
            addCriterion("REG_TYPE >", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REG_TYPE >=", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLessThan(String value) {
            addCriterion("REG_TYPE <", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLessThanOrEqualTo(String value) {
            addCriterion("REG_TYPE <=", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeLike(String value) {
            addCriterion("REG_TYPE like", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotLike(String value) {
            addCriterion("REG_TYPE not like", value, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeIn(List<String> values) {
            addCriterion("REG_TYPE in", values, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotIn(List<String> values) {
            addCriterion("REG_TYPE not in", values, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeBetween(String value1, String value2) {
            addCriterion("REG_TYPE between", value1, value2, "regType");
            return (Criteria) this;
        }

        public Criteria andRegTypeNotBetween(String value1, String value2) {
            addCriterion("REG_TYPE not between", value1, value2, "regType");
            return (Criteria) this;
        }

        public Criteria andBusiAddrIsNull() {
            addCriterion("BUSI_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andBusiAddrIsNotNull() {
            addCriterion("BUSI_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andBusiAddrEqualTo(String value) {
            addCriterion("BUSI_ADDR =", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrNotEqualTo(String value) {
            addCriterion("BUSI_ADDR <>", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrGreaterThan(String value) {
            addCriterion("BUSI_ADDR >", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrGreaterThanOrEqualTo(String value) {
            addCriterion("BUSI_ADDR >=", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrLessThan(String value) {
            addCriterion("BUSI_ADDR <", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrLessThanOrEqualTo(String value) {
            addCriterion("BUSI_ADDR <=", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrLike(String value) {
            addCriterion("BUSI_ADDR like", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrNotLike(String value) {
            addCriterion("BUSI_ADDR not like", value, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrIn(List<String> values) {
            addCriterion("BUSI_ADDR in", values, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrNotIn(List<String> values) {
            addCriterion("BUSI_ADDR not in", values, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrBetween(String value1, String value2) {
            addCriterion("BUSI_ADDR between", value1, value2, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andBusiAddrNotBetween(String value1, String value2) {
            addCriterion("BUSI_ADDR not between", value1, value2, "busiAddr");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNull() {
            addCriterion("CORP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNotNull() {
            addCriterion("CORP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCorpNameEqualTo(String value) {
            addCriterion("CORP_NAME =", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotEqualTo(String value) {
            addCriterion("CORP_NAME <>", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThan(String value) {
            addCriterion("CORP_NAME >", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("CORP_NAME >=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThan(String value) {
            addCriterion("CORP_NAME <", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThanOrEqualTo(String value) {
            addCriterion("CORP_NAME <=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLike(String value) {
            addCriterion("CORP_NAME like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotLike(String value) {
            addCriterion("CORP_NAME not like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameIn(List<String> values) {
            addCriterion("CORP_NAME in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotIn(List<String> values) {
            addCriterion("CORP_NAME not in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameBetween(String value1, String value2) {
            addCriterion("CORP_NAME between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotBetween(String value1, String value2) {
            addCriterion("CORP_NAME not between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIsNull() {
            addCriterion("INDUSTRY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIsNotNull() {
            addCriterion("INDUSTRY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeEqualTo(String value) {
            addCriterion("INDUSTRY_TYPE =", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotEqualTo(String value) {
            addCriterion("INDUSTRY_TYPE <>", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeGreaterThan(String value) {
            addCriterion("INDUSTRY_TYPE >", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_TYPE >=", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeLessThan(String value) {
            addCriterion("INDUSTRY_TYPE <", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeLessThanOrEqualTo(String value) {
            addCriterion("INDUSTRY_TYPE <=", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeLike(String value) {
            addCriterion("INDUSTRY_TYPE like", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotLike(String value) {
            addCriterion("INDUSTRY_TYPE not like", value, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeIn(List<String> values) {
            addCriterion("INDUSTRY_TYPE in", values, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotIn(List<String> values) {
            addCriterion("INDUSTRY_TYPE not in", values, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeBetween(String value1, String value2) {
            addCriterion("INDUSTRY_TYPE between", value1, value2, "industryType");
            return (Criteria) this;
        }

        public Criteria andIndustryTypeNotBetween(String value1, String value2) {
            addCriterion("INDUSTRY_TYPE not between", value1, value2, "industryType");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptIsNull() {
            addCriterion("ONLY_DPPT is null");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptIsNotNull() {
            addCriterion("ONLY_DPPT is not null");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptEqualTo(String value) {
            addCriterion("ONLY_DPPT =", value, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptNotEqualTo(String value) {
            addCriterion("ONLY_DPPT <>", value, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptGreaterThan(String value) {
            addCriterion("ONLY_DPPT >", value, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptGreaterThanOrEqualTo(String value) {
            addCriterion("ONLY_DPPT >=", value, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptLessThan(String value) {
            addCriterion("ONLY_DPPT <", value, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptLessThanOrEqualTo(String value) {
            addCriterion("ONLY_DPPT <=", value, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptLike(String value) {
            addCriterion("ONLY_DPPT like", value, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptNotLike(String value) {
            addCriterion("ONLY_DPPT not like", value, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptIn(List<String> values) {
            addCriterion("ONLY_DPPT in", values, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptNotIn(List<String> values) {
            addCriterion("ONLY_DPPT not in", values, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptBetween(String value1, String value2) {
            addCriterion("ONLY_DPPT between", value1, value2, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andOnlyDpptNotBetween(String value1, String value2) {
            addCriterion("ONLY_DPPT not between", value1, value2, "onlyDppt");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoIsNull() {
            addCriterion("MNG_TAX_ORG_NO is null");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoIsNotNull() {
            addCriterion("MNG_TAX_ORG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoEqualTo(String value) {
            addCriterion("MNG_TAX_ORG_NO =", value, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoNotEqualTo(String value) {
            addCriterion("MNG_TAX_ORG_NO <>", value, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoGreaterThan(String value) {
            addCriterion("MNG_TAX_ORG_NO >", value, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("MNG_TAX_ORG_NO >=", value, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoLessThan(String value) {
            addCriterion("MNG_TAX_ORG_NO <", value, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoLessThanOrEqualTo(String value) {
            addCriterion("MNG_TAX_ORG_NO <=", value, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoLike(String value) {
            addCriterion("MNG_TAX_ORG_NO like", value, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoNotLike(String value) {
            addCriterion("MNG_TAX_ORG_NO not like", value, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoIn(List<String> values) {
            addCriterion("MNG_TAX_ORG_NO in", values, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoNotIn(List<String> values) {
            addCriterion("MNG_TAX_ORG_NO not in", values, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoBetween(String value1, String value2) {
            addCriterion("MNG_TAX_ORG_NO between", value1, value2, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andMngTaxOrgNoNotBetween(String value1, String value2) {
            addCriterion("MNG_TAX_ORG_NO not between", value1, value2, "mngTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoIsNull() {
            addCriterion("PROV_TAX_ORG_NO is null");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoIsNotNull() {
            addCriterion("PROV_TAX_ORG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoEqualTo(String value) {
            addCriterion("PROV_TAX_ORG_NO =", value, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoNotEqualTo(String value) {
            addCriterion("PROV_TAX_ORG_NO <>", value, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoGreaterThan(String value) {
            addCriterion("PROV_TAX_ORG_NO >", value, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("PROV_TAX_ORG_NO >=", value, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoLessThan(String value) {
            addCriterion("PROV_TAX_ORG_NO <", value, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoLessThanOrEqualTo(String value) {
            addCriterion("PROV_TAX_ORG_NO <=", value, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoLike(String value) {
            addCriterion("PROV_TAX_ORG_NO like", value, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoNotLike(String value) {
            addCriterion("PROV_TAX_ORG_NO not like", value, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoIn(List<String> values) {
            addCriterion("PROV_TAX_ORG_NO in", values, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoNotIn(List<String> values) {
            addCriterion("PROV_TAX_ORG_NO not in", values, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoBetween(String value1, String value2) {
            addCriterion("PROV_TAX_ORG_NO between", value1, value2, "provTaxOrgNo");
            return (Criteria) this;
        }

        public Criteria andProvTaxOrgNoNotBetween(String value1, String value2) {
            addCriterion("PROV_TAX_ORG_NO not between", value1, value2, "provTaxOrgNo");
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