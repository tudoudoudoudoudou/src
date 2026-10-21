package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmVatIEstateLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmVatIEstateLogExample() {
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

        public Criteria andPdataIdIsNull() {
            addCriterion("PDATA_ID is null");
            return (Criteria) this;
        }

        public Criteria andPdataIdIsNotNull() {
            addCriterion("PDATA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPdataIdEqualTo(String value) {
            addCriterion("PDATA_ID =", value, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdNotEqualTo(String value) {
            addCriterion("PDATA_ID <>", value, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdGreaterThan(String value) {
            addCriterion("PDATA_ID >", value, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdGreaterThanOrEqualTo(String value) {
            addCriterion("PDATA_ID >=", value, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdLessThan(String value) {
            addCriterion("PDATA_ID <", value, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdLessThanOrEqualTo(String value) {
            addCriterion("PDATA_ID <=", value, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdLike(String value) {
            addCriterion("PDATA_ID like", value, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdNotLike(String value) {
            addCriterion("PDATA_ID not like", value, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdIn(List<String> values) {
            addCriterion("PDATA_ID in", values, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdNotIn(List<String> values) {
            addCriterion("PDATA_ID not in", values, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdBetween(String value1, String value2) {
            addCriterion("PDATA_ID between", value1, value2, "pdataId");
            return (Criteria) this;
        }

        public Criteria andPdataIdNotBetween(String value1, String value2) {
            addCriterion("PDATA_ID not between", value1, value2, "pdataId");
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

        public Criteria andEstateNoIsNull() {
            addCriterion("ESTATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andEstateNoIsNotNull() {
            addCriterion("ESTATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEstateNoEqualTo(String value) {
            addCriterion("ESTATE_NO =", value, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoNotEqualTo(String value) {
            addCriterion("ESTATE_NO <>", value, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoGreaterThan(String value) {
            addCriterion("ESTATE_NO >", value, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoGreaterThanOrEqualTo(String value) {
            addCriterion("ESTATE_NO >=", value, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoLessThan(String value) {
            addCriterion("ESTATE_NO <", value, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoLessThanOrEqualTo(String value) {
            addCriterion("ESTATE_NO <=", value, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoLike(String value) {
            addCriterion("ESTATE_NO like", value, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoNotLike(String value) {
            addCriterion("ESTATE_NO not like", value, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoIn(List<String> values) {
            addCriterion("ESTATE_NO in", values, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoNotIn(List<String> values) {
            addCriterion("ESTATE_NO not in", values, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoBetween(String value1, String value2) {
            addCriterion("ESTATE_NO between", value1, value2, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNoNotBetween(String value1, String value2) {
            addCriterion("ESTATE_NO not between", value1, value2, "estateNo");
            return (Criteria) this;
        }

        public Criteria andEstateNameIsNull() {
            addCriterion("ESTATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andEstateNameIsNotNull() {
            addCriterion("ESTATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andEstateNameEqualTo(String value) {
            addCriterion("ESTATE_NAME =", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameNotEqualTo(String value) {
            addCriterion("ESTATE_NAME <>", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameGreaterThan(String value) {
            addCriterion("ESTATE_NAME >", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameGreaterThanOrEqualTo(String value) {
            addCriterion("ESTATE_NAME >=", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameLessThan(String value) {
            addCriterion("ESTATE_NAME <", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameLessThanOrEqualTo(String value) {
            addCriterion("ESTATE_NAME <=", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameLike(String value) {
            addCriterion("ESTATE_NAME like", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameNotLike(String value) {
            addCriterion("ESTATE_NAME not like", value, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameIn(List<String> values) {
            addCriterion("ESTATE_NAME in", values, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameNotIn(List<String> values) {
            addCriterion("ESTATE_NAME not in", values, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameBetween(String value1, String value2) {
            addCriterion("ESTATE_NAME between", value1, value2, "estateName");
            return (Criteria) this;
        }

        public Criteria andEstateNameNotBetween(String value1, String value2) {
            addCriterion("ESTATE_NAME not between", value1, value2, "estateName");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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

        public Criteria andValueAmountIsNull() {
            addCriterion("VALUE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andValueAmountIsNotNull() {
            addCriterion("VALUE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andValueAmountEqualTo(BigDecimal value) {
            addCriterion("VALUE_AMOUNT =", value, "valueAmount");
            return (Criteria) this;
        }

        public Criteria andValueAmountNotEqualTo(BigDecimal value) {
            addCriterion("VALUE_AMOUNT <>", value, "valueAmount");
            return (Criteria) this;
        }

        public Criteria andValueAmountGreaterThan(BigDecimal value) {
            addCriterion("VALUE_AMOUNT >", value, "valueAmount");
            return (Criteria) this;
        }

        public Criteria andValueAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUE_AMOUNT >=", value, "valueAmount");
            return (Criteria) this;
        }

        public Criteria andValueAmountLessThan(BigDecimal value) {
            addCriterion("VALUE_AMOUNT <", value, "valueAmount");
            return (Criteria) this;
        }

        public Criteria andValueAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VALUE_AMOUNT <=", value, "valueAmount");
            return (Criteria) this;
        }

        public Criteria andValueAmountIn(List<BigDecimal> values) {
            addCriterion("VALUE_AMOUNT in", values, "valueAmount");
            return (Criteria) this;
        }

        public Criteria andValueAmountNotIn(List<BigDecimal> values) {
            addCriterion("VALUE_AMOUNT not in", values, "valueAmount");
            return (Criteria) this;
        }

        public Criteria andValueAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUE_AMOUNT between", value1, value2, "valueAmount");
            return (Criteria) this;
        }

        public Criteria andValueAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VALUE_AMOUNT not between", value1, value2, "valueAmount");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNull() {
            addCriterion("FIRST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andFirstDateIsNotNull() {
            addCriterion("FIRST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDateEqualTo(String value) {
            addCriterion("FIRST_DATE =", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotEqualTo(String value) {
            addCriterion("FIRST_DATE <>", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThan(String value) {
            addCriterion("FIRST_DATE >", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_DATE >=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThan(String value) {
            addCriterion("FIRST_DATE <", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLessThanOrEqualTo(String value) {
            addCriterion("FIRST_DATE <=", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateLike(String value) {
            addCriterion("FIRST_DATE like", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotLike(String value) {
            addCriterion("FIRST_DATE not like", value, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateIn(List<String> values) {
            addCriterion("FIRST_DATE in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotIn(List<String> values) {
            addCriterion("FIRST_DATE not in", values, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateBetween(String value1, String value2) {
            addCriterion("FIRST_DATE between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstDateNotBetween(String value1, String value2) {
            addCriterion("FIRST_DATE not between", value1, value2, "firstDate");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtIsNull() {
            addCriterion("FIRST_TAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtIsNotNull() {
            addCriterion("FIRST_TAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtEqualTo(BigDecimal value) {
            addCriterion("FIRST_TAX_AMT =", value, "firstTaxAmt");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("FIRST_TAX_AMT <>", value, "firstTaxAmt");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtGreaterThan(BigDecimal value) {
            addCriterion("FIRST_TAX_AMT >", value, "firstTaxAmt");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRST_TAX_AMT >=", value, "firstTaxAmt");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtLessThan(BigDecimal value) {
            addCriterion("FIRST_TAX_AMT <", value, "firstTaxAmt");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRST_TAX_AMT <=", value, "firstTaxAmt");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtIn(List<BigDecimal> values) {
            addCriterion("FIRST_TAX_AMT in", values, "firstTaxAmt");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("FIRST_TAX_AMT not in", values, "firstTaxAmt");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRST_TAX_AMT between", value1, value2, "firstTaxAmt");
            return (Criteria) this;
        }

        public Criteria andFirstTaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRST_TAX_AMT not between", value1, value2, "firstTaxAmt");
            return (Criteria) this;
        }

        public Criteria andSecondDateIsNull() {
            addCriterion("SECOND_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSecondDateIsNotNull() {
            addCriterion("SECOND_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSecondDateEqualTo(String value) {
            addCriterion("SECOND_DATE =", value, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateNotEqualTo(String value) {
            addCriterion("SECOND_DATE <>", value, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateGreaterThan(String value) {
            addCriterion("SECOND_DATE >", value, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateGreaterThanOrEqualTo(String value) {
            addCriterion("SECOND_DATE >=", value, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateLessThan(String value) {
            addCriterion("SECOND_DATE <", value, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateLessThanOrEqualTo(String value) {
            addCriterion("SECOND_DATE <=", value, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateLike(String value) {
            addCriterion("SECOND_DATE like", value, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateNotLike(String value) {
            addCriterion("SECOND_DATE not like", value, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateIn(List<String> values) {
            addCriterion("SECOND_DATE in", values, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateNotIn(List<String> values) {
            addCriterion("SECOND_DATE not in", values, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateBetween(String value1, String value2) {
            addCriterion("SECOND_DATE between", value1, value2, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondDateNotBetween(String value1, String value2) {
            addCriterion("SECOND_DATE not between", value1, value2, "secondDate");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtIsNull() {
            addCriterion("SECOND_TAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtIsNotNull() {
            addCriterion("SECOND_TAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtEqualTo(BigDecimal value) {
            addCriterion("SECOND_TAX_AMT =", value, "secondTaxAmt");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("SECOND_TAX_AMT <>", value, "secondTaxAmt");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtGreaterThan(BigDecimal value) {
            addCriterion("SECOND_TAX_AMT >", value, "secondTaxAmt");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SECOND_TAX_AMT >=", value, "secondTaxAmt");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtLessThan(BigDecimal value) {
            addCriterion("SECOND_TAX_AMT <", value, "secondTaxAmt");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SECOND_TAX_AMT <=", value, "secondTaxAmt");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtIn(List<BigDecimal> values) {
            addCriterion("SECOND_TAX_AMT in", values, "secondTaxAmt");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("SECOND_TAX_AMT not in", values, "secondTaxAmt");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECOND_TAX_AMT between", value1, value2, "secondTaxAmt");
            return (Criteria) this;
        }

        public Criteria andSecondTaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SECOND_TAX_AMT not between", value1, value2, "secondTaxAmt");
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

        public Criteria andOutReasonIsNull() {
            addCriterion("OUT_REASON is null");
            return (Criteria) this;
        }

        public Criteria andOutReasonIsNotNull() {
            addCriterion("OUT_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andOutReasonEqualTo(String value) {
            addCriterion("OUT_REASON =", value, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonNotEqualTo(String value) {
            addCriterion("OUT_REASON <>", value, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonGreaterThan(String value) {
            addCriterion("OUT_REASON >", value, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_REASON >=", value, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonLessThan(String value) {
            addCriterion("OUT_REASON <", value, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonLessThanOrEqualTo(String value) {
            addCriterion("OUT_REASON <=", value, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonLike(String value) {
            addCriterion("OUT_REASON like", value, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonNotLike(String value) {
            addCriterion("OUT_REASON not like", value, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonIn(List<String> values) {
            addCriterion("OUT_REASON in", values, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonNotIn(List<String> values) {
            addCriterion("OUT_REASON not in", values, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonBetween(String value1, String value2) {
            addCriterion("OUT_REASON between", value1, value2, "outReason");
            return (Criteria) this;
        }

        public Criteria andOutReasonNotBetween(String value1, String value2) {
            addCriterion("OUT_REASON not between", value1, value2, "outReason");
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

        public Criteria andOutDateIsNull() {
            addCriterion("OUT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOutDateIsNotNull() {
            addCriterion("OUT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOutDateEqualTo(String value) {
            addCriterion("OUT_DATE =", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotEqualTo(String value) {
            addCriterion("OUT_DATE <>", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateGreaterThan(String value) {
            addCriterion("OUT_DATE >", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_DATE >=", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLessThan(String value) {
            addCriterion("OUT_DATE <", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLessThanOrEqualTo(String value) {
            addCriterion("OUT_DATE <=", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateLike(String value) {
            addCriterion("OUT_DATE like", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotLike(String value) {
            addCriterion("OUT_DATE not like", value, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateIn(List<String> values) {
            addCriterion("OUT_DATE in", values, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotIn(List<String> values) {
            addCriterion("OUT_DATE not in", values, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateBetween(String value1, String value2) {
            addCriterion("OUT_DATE between", value1, value2, "outDate");
            return (Criteria) this;
        }

        public Criteria andOutDateNotBetween(String value1, String value2) {
            addCriterion("OUT_DATE not between", value1, value2, "outDate");
            return (Criteria) this;
        }

        public Criteria andInAmtIsNull() {
            addCriterion("IN_AMT is null");
            return (Criteria) this;
        }

        public Criteria andInAmtIsNotNull() {
            addCriterion("IN_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andInAmtEqualTo(BigDecimal value) {
            addCriterion("IN_AMT =", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtNotEqualTo(BigDecimal value) {
            addCriterion("IN_AMT <>", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtGreaterThan(BigDecimal value) {
            addCriterion("IN_AMT >", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_AMT >=", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtLessThan(BigDecimal value) {
            addCriterion("IN_AMT <", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("IN_AMT <=", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtIn(List<BigDecimal> values) {
            addCriterion("IN_AMT in", values, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtNotIn(List<BigDecimal> values) {
            addCriterion("IN_AMT not in", values, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_AMT between", value1, value2, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("IN_AMT not between", value1, value2, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInDateIsNull() {
            addCriterion("IN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInDateIsNotNull() {
            addCriterion("IN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInDateEqualTo(String value) {
            addCriterion("IN_DATE =", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotEqualTo(String value) {
            addCriterion("IN_DATE <>", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThan(String value) {
            addCriterion("IN_DATE >", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateGreaterThanOrEqualTo(String value) {
            addCriterion("IN_DATE >=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThan(String value) {
            addCriterion("IN_DATE <", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLessThanOrEqualTo(String value) {
            addCriterion("IN_DATE <=", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateLike(String value) {
            addCriterion("IN_DATE like", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotLike(String value) {
            addCriterion("IN_DATE not like", value, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateIn(List<String> values) {
            addCriterion("IN_DATE in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotIn(List<String> values) {
            addCriterion("IN_DATE not in", values, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateBetween(String value1, String value2) {
            addCriterion("IN_DATE between", value1, value2, "inDate");
            return (Criteria) this;
        }

        public Criteria andInDateNotBetween(String value1, String value2) {
            addCriterion("IN_DATE not between", value1, value2, "inDate");
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

        public Criteria andIsFlagIsNull() {
            addCriterion("IS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsFlagIsNotNull() {
            addCriterion("IS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsFlagEqualTo(String value) {
            addCriterion("IS_FLAG =", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotEqualTo(String value) {
            addCriterion("IS_FLAG <>", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagGreaterThan(String value) {
            addCriterion("IS_FLAG >", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FLAG >=", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagLessThan(String value) {
            addCriterion("IS_FLAG <", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagLessThanOrEqualTo(String value) {
            addCriterion("IS_FLAG <=", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagLike(String value) {
            addCriterion("IS_FLAG like", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotLike(String value) {
            addCriterion("IS_FLAG not like", value, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagIn(List<String> values) {
            addCriterion("IS_FLAG in", values, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotIn(List<String> values) {
            addCriterion("IS_FLAG not in", values, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagBetween(String value1, String value2) {
            addCriterion("IS_FLAG between", value1, value2, "isFlag");
            return (Criteria) this;
        }

        public Criteria andIsFlagNotBetween(String value1, String value2) {
            addCriterion("IS_FLAG not between", value1, value2, "isFlag");
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

        public Criteria andOperationTypeIsNull() {
            addCriterion("OPERATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIsNotNull() {
            addCriterion("OPERATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperationTypeEqualTo(String value) {
            addCriterion("OPERATION_TYPE =", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotEqualTo(String value) {
            addCriterion("OPERATION_TYPE <>", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThan(String value) {
            addCriterion("OPERATION_TYPE >", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION_TYPE >=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThan(String value) {
            addCriterion("OPERATION_TYPE <", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLessThanOrEqualTo(String value) {
            addCriterion("OPERATION_TYPE <=", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeLike(String value) {
            addCriterion("OPERATION_TYPE like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotLike(String value) {
            addCriterion("OPERATION_TYPE not like", value, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeIn(List<String> values) {
            addCriterion("OPERATION_TYPE in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotIn(List<String> values) {
            addCriterion("OPERATION_TYPE not in", values, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeBetween(String value1, String value2) {
            addCriterion("OPERATION_TYPE between", value1, value2, "operationType");
            return (Criteria) this;
        }

        public Criteria andOperationTypeNotBetween(String value1, String value2) {
            addCriterion("OPERATION_TYPE not between", value1, value2, "operationType");
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