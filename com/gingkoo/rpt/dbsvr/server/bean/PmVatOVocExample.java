package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmVatOVocExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmVatOVocExample() {
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

        public Criteria andMadeTypeIsNull() {
            addCriterion("MADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMadeTypeIsNotNull() {
            addCriterion("MADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMadeTypeEqualTo(String value) {
            addCriterion("MADE_TYPE =", value, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeNotEqualTo(String value) {
            addCriterion("MADE_TYPE <>", value, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeGreaterThan(String value) {
            addCriterion("MADE_TYPE >", value, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MADE_TYPE >=", value, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeLessThan(String value) {
            addCriterion("MADE_TYPE <", value, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeLessThanOrEqualTo(String value) {
            addCriterion("MADE_TYPE <=", value, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeLike(String value) {
            addCriterion("MADE_TYPE like", value, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeNotLike(String value) {
            addCriterion("MADE_TYPE not like", value, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeIn(List<String> values) {
            addCriterion("MADE_TYPE in", values, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeNotIn(List<String> values) {
            addCriterion("MADE_TYPE not in", values, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeBetween(String value1, String value2) {
            addCriterion("MADE_TYPE between", value1, value2, "madeType");
            return (Criteria) this;
        }

        public Criteria andMadeTypeNotBetween(String value1, String value2) {
            addCriterion("MADE_TYPE not between", value1, value2, "madeType");
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

        public Criteria andVocStatIsNull() {
            addCriterion("VOC_STAT is null");
            return (Criteria) this;
        }

        public Criteria andVocStatIsNotNull() {
            addCriterion("VOC_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andVocStatEqualTo(String value) {
            addCriterion("VOC_STAT =", value, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatNotEqualTo(String value) {
            addCriterion("VOC_STAT <>", value, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatGreaterThan(String value) {
            addCriterion("VOC_STAT >", value, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_STAT >=", value, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatLessThan(String value) {
            addCriterion("VOC_STAT <", value, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatLessThanOrEqualTo(String value) {
            addCriterion("VOC_STAT <=", value, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatLike(String value) {
            addCriterion("VOC_STAT like", value, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatNotLike(String value) {
            addCriterion("VOC_STAT not like", value, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatIn(List<String> values) {
            addCriterion("VOC_STAT in", values, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatNotIn(List<String> values) {
            addCriterion("VOC_STAT not in", values, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatBetween(String value1, String value2) {
            addCriterion("VOC_STAT between", value1, value2, "vocStat");
            return (Criteria) this;
        }

        public Criteria andVocStatNotBetween(String value1, String value2) {
            addCriterion("VOC_STAT not between", value1, value2, "vocStat");
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

        public Criteria andDeviAmtIsNull() {
            addCriterion("DEVI_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDeviAmtIsNotNull() {
            addCriterion("DEVI_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDeviAmtEqualTo(BigDecimal value) {
            addCriterion("DEVI_AMT =", value, "deviAmt");
            return (Criteria) this;
        }

        public Criteria andDeviAmtNotEqualTo(BigDecimal value) {
            addCriterion("DEVI_AMT <>", value, "deviAmt");
            return (Criteria) this;
        }

        public Criteria andDeviAmtGreaterThan(BigDecimal value) {
            addCriterion("DEVI_AMT >", value, "deviAmt");
            return (Criteria) this;
        }

        public Criteria andDeviAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEVI_AMT >=", value, "deviAmt");
            return (Criteria) this;
        }

        public Criteria andDeviAmtLessThan(BigDecimal value) {
            addCriterion("DEVI_AMT <", value, "deviAmt");
            return (Criteria) this;
        }

        public Criteria andDeviAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEVI_AMT <=", value, "deviAmt");
            return (Criteria) this;
        }

        public Criteria andDeviAmtIn(List<BigDecimal> values) {
            addCriterion("DEVI_AMT in", values, "deviAmt");
            return (Criteria) this;
        }

        public Criteria andDeviAmtNotIn(List<BigDecimal> values) {
            addCriterion("DEVI_AMT not in", values, "deviAmt");
            return (Criteria) this;
        }

        public Criteria andDeviAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEVI_AMT between", value1, value2, "deviAmt");
            return (Criteria) this;
        }

        public Criteria andDeviAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEVI_AMT not between", value1, value2, "deviAmt");
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

        public Criteria andSendStatusIsNull() {
            addCriterion("SEND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("SEND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(String value) {
            addCriterion("SEND_STATUS =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(String value) {
            addCriterion("SEND_STATUS <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(String value) {
            addCriterion("SEND_STATUS >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("SEND_STATUS >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(String value) {
            addCriterion("SEND_STATUS <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(String value) {
            addCriterion("SEND_STATUS <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLike(String value) {
            addCriterion("SEND_STATUS like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotLike(String value) {
            addCriterion("SEND_STATUS not like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<String> values) {
            addCriterion("SEND_STATUS in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<String> values) {
            addCriterion("SEND_STATUS not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(String value1, String value2) {
            addCriterion("SEND_STATUS between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(String value1, String value2) {
            addCriterion("SEND_STATUS not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtIsNull() {
            addCriterion("GTS_INC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtIsNotNull() {
            addCriterion("GTS_INC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtEqualTo(BigDecimal value) {
            addCriterion("GTS_INC_AMT =", value, "gtsIncAmt");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtNotEqualTo(BigDecimal value) {
            addCriterion("GTS_INC_AMT <>", value, "gtsIncAmt");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtGreaterThan(BigDecimal value) {
            addCriterion("GTS_INC_AMT >", value, "gtsIncAmt");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GTS_INC_AMT >=", value, "gtsIncAmt");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtLessThan(BigDecimal value) {
            addCriterion("GTS_INC_AMT <", value, "gtsIncAmt");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GTS_INC_AMT <=", value, "gtsIncAmt");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtIn(List<BigDecimal> values) {
            addCriterion("GTS_INC_AMT in", values, "gtsIncAmt");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtNotIn(List<BigDecimal> values) {
            addCriterion("GTS_INC_AMT not in", values, "gtsIncAmt");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GTS_INC_AMT between", value1, value2, "gtsIncAmt");
            return (Criteria) this;
        }

        public Criteria andGtsIncAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GTS_INC_AMT not between", value1, value2, "gtsIncAmt");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtIsNull() {
            addCriterion("GTS_TAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtIsNotNull() {
            addCriterion("GTS_TAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtEqualTo(BigDecimal value) {
            addCriterion("GTS_TAX_AMT =", value, "gtsTaxAmt");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("GTS_TAX_AMT <>", value, "gtsTaxAmt");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtGreaterThan(BigDecimal value) {
            addCriterion("GTS_TAX_AMT >", value, "gtsTaxAmt");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GTS_TAX_AMT >=", value, "gtsTaxAmt");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtLessThan(BigDecimal value) {
            addCriterion("GTS_TAX_AMT <", value, "gtsTaxAmt");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GTS_TAX_AMT <=", value, "gtsTaxAmt");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtIn(List<BigDecimal> values) {
            addCriterion("GTS_TAX_AMT in", values, "gtsTaxAmt");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("GTS_TAX_AMT not in", values, "gtsTaxAmt");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GTS_TAX_AMT between", value1, value2, "gtsTaxAmt");
            return (Criteria) this;
        }

        public Criteria andGtsTaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GTS_TAX_AMT not between", value1, value2, "gtsTaxAmt");
            return (Criteria) this;
        }

        public Criteria andRevFlagIsNull() {
            addCriterion("REV_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRevFlagIsNotNull() {
            addCriterion("REV_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRevFlagEqualTo(String value) {
            addCriterion("REV_FLAG =", value, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagNotEqualTo(String value) {
            addCriterion("REV_FLAG <>", value, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagGreaterThan(String value) {
            addCriterion("REV_FLAG >", value, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagGreaterThanOrEqualTo(String value) {
            addCriterion("REV_FLAG >=", value, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagLessThan(String value) {
            addCriterion("REV_FLAG <", value, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagLessThanOrEqualTo(String value) {
            addCriterion("REV_FLAG <=", value, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagLike(String value) {
            addCriterion("REV_FLAG like", value, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagNotLike(String value) {
            addCriterion("REV_FLAG not like", value, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagIn(List<String> values) {
            addCriterion("REV_FLAG in", values, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagNotIn(List<String> values) {
            addCriterion("REV_FLAG not in", values, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagBetween(String value1, String value2) {
            addCriterion("REV_FLAG between", value1, value2, "revFlag");
            return (Criteria) this;
        }

        public Criteria andRevFlagNotBetween(String value1, String value2) {
            addCriterion("REV_FLAG not between", value1, value2, "revFlag");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeIsNull() {
            addCriterion("DISCARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeIsNotNull() {
            addCriterion("DISCARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeEqualTo(String value) {
            addCriterion("DISCARD_TYPE =", value, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeNotEqualTo(String value) {
            addCriterion("DISCARD_TYPE <>", value, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeGreaterThan(String value) {
            addCriterion("DISCARD_TYPE >", value, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DISCARD_TYPE >=", value, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeLessThan(String value) {
            addCriterion("DISCARD_TYPE <", value, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeLessThanOrEqualTo(String value) {
            addCriterion("DISCARD_TYPE <=", value, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeLike(String value) {
            addCriterion("DISCARD_TYPE like", value, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeNotLike(String value) {
            addCriterion("DISCARD_TYPE not like", value, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeIn(List<String> values) {
            addCriterion("DISCARD_TYPE in", values, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeNotIn(List<String> values) {
            addCriterion("DISCARD_TYPE not in", values, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeBetween(String value1, String value2) {
            addCriterion("DISCARD_TYPE between", value1, value2, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardTypeNotBetween(String value1, String value2) {
            addCriterion("DISCARD_TYPE not between", value1, value2, "discardType");
            return (Criteria) this;
        }

        public Criteria andDiscardDescIsNull() {
            addCriterion("DISCARD_DESC is null");
            return (Criteria) this;
        }

        public Criteria andDiscardDescIsNotNull() {
            addCriterion("DISCARD_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andDiscardDescEqualTo(String value) {
            addCriterion("DISCARD_DESC =", value, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescNotEqualTo(String value) {
            addCriterion("DISCARD_DESC <>", value, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescGreaterThan(String value) {
            addCriterion("DISCARD_DESC >", value, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescGreaterThanOrEqualTo(String value) {
            addCriterion("DISCARD_DESC >=", value, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescLessThan(String value) {
            addCriterion("DISCARD_DESC <", value, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescLessThanOrEqualTo(String value) {
            addCriterion("DISCARD_DESC <=", value, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescLike(String value) {
            addCriterion("DISCARD_DESC like", value, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescNotLike(String value) {
            addCriterion("DISCARD_DESC not like", value, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescIn(List<String> values) {
            addCriterion("DISCARD_DESC in", values, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescNotIn(List<String> values) {
            addCriterion("DISCARD_DESC not in", values, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescBetween(String value1, String value2) {
            addCriterion("DISCARD_DESC between", value1, value2, "discardDesc");
            return (Criteria) this;
        }

        public Criteria andDiscardDescNotBetween(String value1, String value2) {
            addCriterion("DISCARD_DESC not between", value1, value2, "discardDesc");
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

        public Criteria andMediaTypeIsNull() {
            addCriterion("MEDIA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIsNotNull() {
            addCriterion("MEDIA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMediaTypeEqualTo(String value) {
            addCriterion("MEDIA_TYPE =", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotEqualTo(String value) {
            addCriterion("MEDIA_TYPE <>", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeGreaterThan(String value) {
            addCriterion("MEDIA_TYPE >", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MEDIA_TYPE >=", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLessThan(String value) {
            addCriterion("MEDIA_TYPE <", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLessThanOrEqualTo(String value) {
            addCriterion("MEDIA_TYPE <=", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeLike(String value) {
            addCriterion("MEDIA_TYPE like", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotLike(String value) {
            addCriterion("MEDIA_TYPE not like", value, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeIn(List<String> values) {
            addCriterion("MEDIA_TYPE in", values, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotIn(List<String> values) {
            addCriterion("MEDIA_TYPE not in", values, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeBetween(String value1, String value2) {
            addCriterion("MEDIA_TYPE between", value1, value2, "mediaType");
            return (Criteria) this;
        }

        public Criteria andMediaTypeNotBetween(String value1, String value2) {
            addCriterion("MEDIA_TYPE not between", value1, value2, "mediaType");
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

        public Criteria andSiteOrgIdIsNull() {
            addCriterion("SITE_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdIsNotNull() {
            addCriterion("SITE_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdEqualTo(String value) {
            addCriterion("SITE_ORG_ID =", value, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdNotEqualTo(String value) {
            addCriterion("SITE_ORG_ID <>", value, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdGreaterThan(String value) {
            addCriterion("SITE_ORG_ID >", value, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_ORG_ID >=", value, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdLessThan(String value) {
            addCriterion("SITE_ORG_ID <", value, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdLessThanOrEqualTo(String value) {
            addCriterion("SITE_ORG_ID <=", value, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdLike(String value) {
            addCriterion("SITE_ORG_ID like", value, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdNotLike(String value) {
            addCriterion("SITE_ORG_ID not like", value, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdIn(List<String> values) {
            addCriterion("SITE_ORG_ID in", values, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdNotIn(List<String> values) {
            addCriterion("SITE_ORG_ID not in", values, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdBetween(String value1, String value2) {
            addCriterion("SITE_ORG_ID between", value1, value2, "siteOrgId");
            return (Criteria) this;
        }

        public Criteria andSiteOrgIdNotBetween(String value1, String value2) {
            addCriterion("SITE_ORG_ID not between", value1, value2, "siteOrgId");
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

        public Criteria andCoreDeviAmtIsNull() {
            addCriterion("CORE_DEVI_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtIsNotNull() {
            addCriterion("CORE_DEVI_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtEqualTo(BigDecimal value) {
            addCriterion("CORE_DEVI_AMT =", value, "coreDeviAmt");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtNotEqualTo(BigDecimal value) {
            addCriterion("CORE_DEVI_AMT <>", value, "coreDeviAmt");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtGreaterThan(BigDecimal value) {
            addCriterion("CORE_DEVI_AMT >", value, "coreDeviAmt");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CORE_DEVI_AMT >=", value, "coreDeviAmt");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtLessThan(BigDecimal value) {
            addCriterion("CORE_DEVI_AMT <", value, "coreDeviAmt");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CORE_DEVI_AMT <=", value, "coreDeviAmt");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtIn(List<BigDecimal> values) {
            addCriterion("CORE_DEVI_AMT in", values, "coreDeviAmt");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtNotIn(List<BigDecimal> values) {
            addCriterion("CORE_DEVI_AMT not in", values, "coreDeviAmt");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CORE_DEVI_AMT between", value1, value2, "coreDeviAmt");
            return (Criteria) this;
        }

        public Criteria andCoreDeviAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CORE_DEVI_AMT not between", value1, value2, "coreDeviAmt");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtIsNull() {
            addCriterion("CORE_INC_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtIsNotNull() {
            addCriterion("CORE_INC_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtEqualTo(BigDecimal value) {
            addCriterion("CORE_INC_AMT =", value, "coreIncAmt");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtNotEqualTo(BigDecimal value) {
            addCriterion("CORE_INC_AMT <>", value, "coreIncAmt");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtGreaterThan(BigDecimal value) {
            addCriterion("CORE_INC_AMT >", value, "coreIncAmt");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CORE_INC_AMT >=", value, "coreIncAmt");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtLessThan(BigDecimal value) {
            addCriterion("CORE_INC_AMT <", value, "coreIncAmt");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CORE_INC_AMT <=", value, "coreIncAmt");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtIn(List<BigDecimal> values) {
            addCriterion("CORE_INC_AMT in", values, "coreIncAmt");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtNotIn(List<BigDecimal> values) {
            addCriterion("CORE_INC_AMT not in", values, "coreIncAmt");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CORE_INC_AMT between", value1, value2, "coreIncAmt");
            return (Criteria) this;
        }

        public Criteria andCoreIncAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CORE_INC_AMT not between", value1, value2, "coreIncAmt");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtIsNull() {
            addCriterion("CORE_TAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtIsNotNull() {
            addCriterion("CORE_TAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtEqualTo(BigDecimal value) {
            addCriterion("CORE_TAX_AMT =", value, "coreTaxAmt");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("CORE_TAX_AMT <>", value, "coreTaxAmt");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtGreaterThan(BigDecimal value) {
            addCriterion("CORE_TAX_AMT >", value, "coreTaxAmt");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CORE_TAX_AMT >=", value, "coreTaxAmt");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtLessThan(BigDecimal value) {
            addCriterion("CORE_TAX_AMT <", value, "coreTaxAmt");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CORE_TAX_AMT <=", value, "coreTaxAmt");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtIn(List<BigDecimal> values) {
            addCriterion("CORE_TAX_AMT in", values, "coreTaxAmt");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("CORE_TAX_AMT not in", values, "coreTaxAmt");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CORE_TAX_AMT between", value1, value2, "coreTaxAmt");
            return (Criteria) this;
        }

        public Criteria andCoreTaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CORE_TAX_AMT not between", value1, value2, "coreTaxAmt");
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

        public Criteria andIsHappenIsNull() {
            addCriterion("IS_HAPPEN is null");
            return (Criteria) this;
        }

        public Criteria andIsHappenIsNotNull() {
            addCriterion("IS_HAPPEN is not null");
            return (Criteria) this;
        }

        public Criteria andIsHappenEqualTo(String value) {
            addCriterion("IS_HAPPEN =", value, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenNotEqualTo(String value) {
            addCriterion("IS_HAPPEN <>", value, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenGreaterThan(String value) {
            addCriterion("IS_HAPPEN >", value, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenGreaterThanOrEqualTo(String value) {
            addCriterion("IS_HAPPEN >=", value, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenLessThan(String value) {
            addCriterion("IS_HAPPEN <", value, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenLessThanOrEqualTo(String value) {
            addCriterion("IS_HAPPEN <=", value, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenLike(String value) {
            addCriterion("IS_HAPPEN like", value, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenNotLike(String value) {
            addCriterion("IS_HAPPEN not like", value, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenIn(List<String> values) {
            addCriterion("IS_HAPPEN in", values, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenNotIn(List<String> values) {
            addCriterion("IS_HAPPEN not in", values, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenBetween(String value1, String value2) {
            addCriterion("IS_HAPPEN between", value1, value2, "isHappen");
            return (Criteria) this;
        }

        public Criteria andIsHappenNotBetween(String value1, String value2) {
            addCriterion("IS_HAPPEN not between", value1, value2, "isHappen");
            return (Criteria) this;
        }

        public Criteria andUploadStatusIsNull() {
            addCriterion("UPLOAD_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andUploadStatusIsNotNull() {
            addCriterion("UPLOAD_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andUploadStatusEqualTo(String value) {
            addCriterion("UPLOAD_STATUS =", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusNotEqualTo(String value) {
            addCriterion("UPLOAD_STATUS <>", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusGreaterThan(String value) {
            addCriterion("UPLOAD_STATUS >", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_STATUS >=", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusLessThan(String value) {
            addCriterion("UPLOAD_STATUS <", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_STATUS <=", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusLike(String value) {
            addCriterion("UPLOAD_STATUS like", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusNotLike(String value) {
            addCriterion("UPLOAD_STATUS not like", value, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusIn(List<String> values) {
            addCriterion("UPLOAD_STATUS in", values, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusNotIn(List<String> values) {
            addCriterion("UPLOAD_STATUS not in", values, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusBetween(String value1, String value2) {
            addCriterion("UPLOAD_STATUS between", value1, value2, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andUploadStatusNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_STATUS not between", value1, value2, "uploadStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusIsNull() {
            addCriterion("REVISE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andReviseStatusIsNotNull() {
            addCriterion("REVISE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andReviseStatusEqualTo(String value) {
            addCriterion("REVISE_STATUS =", value, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusNotEqualTo(String value) {
            addCriterion("REVISE_STATUS <>", value, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusGreaterThan(String value) {
            addCriterion("REVISE_STATUS >", value, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusGreaterThanOrEqualTo(String value) {
            addCriterion("REVISE_STATUS >=", value, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusLessThan(String value) {
            addCriterion("REVISE_STATUS <", value, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusLessThanOrEqualTo(String value) {
            addCriterion("REVISE_STATUS <=", value, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusLike(String value) {
            addCriterion("REVISE_STATUS like", value, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusNotLike(String value) {
            addCriterion("REVISE_STATUS not like", value, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusIn(List<String> values) {
            addCriterion("REVISE_STATUS in", values, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusNotIn(List<String> values) {
            addCriterion("REVISE_STATUS not in", values, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusBetween(String value1, String value2) {
            addCriterion("REVISE_STATUS between", value1, value2, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReviseStatusNotBetween(String value1, String value2) {
            addCriterion("REVISE_STATUS not between", value1, value2, "reviseStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNull() {
            addCriterion("RECEIVE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("RECEIVE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("RECEIVE_NAME =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("RECEIVE_NAME <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("RECEIVE_NAME >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_NAME >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("RECEIVE_NAME <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_NAME <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("RECEIVE_NAME like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("RECEIVE_NAME not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("RECEIVE_NAME in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("RECEIVE_NAME not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("RECEIVE_NAME between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_NAME not between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIsNull() {
            addCriterion("CREDENTIAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIsNotNull() {
            addCriterion("CREDENTIAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeEqualTo(String value) {
            addCriterion("CREDENTIAL_TYPE =", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotEqualTo(String value) {
            addCriterion("CREDENTIAL_TYPE <>", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeGreaterThan(String value) {
            addCriterion("CREDENTIAL_TYPE >", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CREDENTIAL_TYPE >=", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLessThan(String value) {
            addCriterion("CREDENTIAL_TYPE <", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLessThanOrEqualTo(String value) {
            addCriterion("CREDENTIAL_TYPE <=", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeLike(String value) {
            addCriterion("CREDENTIAL_TYPE like", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotLike(String value) {
            addCriterion("CREDENTIAL_TYPE not like", value, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeIn(List<String> values) {
            addCriterion("CREDENTIAL_TYPE in", values, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotIn(List<String> values) {
            addCriterion("CREDENTIAL_TYPE not in", values, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeBetween(String value1, String value2) {
            addCriterion("CREDENTIAL_TYPE between", value1, value2, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialTypeNotBetween(String value1, String value2) {
            addCriterion("CREDENTIAL_TYPE not between", value1, value2, "credentialType");
            return (Criteria) this;
        }

        public Criteria andCredentialNoIsNull() {
            addCriterion("CREDENTIAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andCredentialNoIsNotNull() {
            addCriterion("CREDENTIAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCredentialNoEqualTo(String value) {
            addCriterion("CREDENTIAL_NO =", value, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoNotEqualTo(String value) {
            addCriterion("CREDENTIAL_NO <>", value, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoGreaterThan(String value) {
            addCriterion("CREDENTIAL_NO >", value, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoGreaterThanOrEqualTo(String value) {
            addCriterion("CREDENTIAL_NO >=", value, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoLessThan(String value) {
            addCriterion("CREDENTIAL_NO <", value, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoLessThanOrEqualTo(String value) {
            addCriterion("CREDENTIAL_NO <=", value, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoLike(String value) {
            addCriterion("CREDENTIAL_NO like", value, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoNotLike(String value) {
            addCriterion("CREDENTIAL_NO not like", value, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoIn(List<String> values) {
            addCriterion("CREDENTIAL_NO in", values, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoNotIn(List<String> values) {
            addCriterion("CREDENTIAL_NO not in", values, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoBetween(String value1, String value2) {
            addCriterion("CREDENTIAL_NO between", value1, value2, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andCredentialNoNotBetween(String value1, String value2) {
            addCriterion("CREDENTIAL_NO not between", value1, value2, "credentialNo");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNull() {
            addCriterion("RECEIVE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("RECEIVE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(String value) {
            addCriterion("RECEIVE_DATE =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(String value) {
            addCriterion("RECEIVE_DATE <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(String value) {
            addCriterion("RECEIVE_DATE >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_DATE >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(String value) {
            addCriterion("RECEIVE_DATE <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_DATE <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLike(String value) {
            addCriterion("RECEIVE_DATE like", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotLike(String value) {
            addCriterion("RECEIVE_DATE not like", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<String> values) {
            addCriterion("RECEIVE_DATE in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<String> values) {
            addCriterion("RECEIVE_DATE not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(String value1, String value2) {
            addCriterion("RECEIVE_DATE between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_DATE not between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andSiteNoIsNull() {
            addCriterion("SITE_NO is null");
            return (Criteria) this;
        }

        public Criteria andSiteNoIsNotNull() {
            addCriterion("SITE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNoEqualTo(String value) {
            addCriterion("SITE_NO =", value, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoNotEqualTo(String value) {
            addCriterion("SITE_NO <>", value, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoGreaterThan(String value) {
            addCriterion("SITE_NO >", value, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_NO >=", value, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoLessThan(String value) {
            addCriterion("SITE_NO <", value, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoLessThanOrEqualTo(String value) {
            addCriterion("SITE_NO <=", value, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoLike(String value) {
            addCriterion("SITE_NO like", value, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoNotLike(String value) {
            addCriterion("SITE_NO not like", value, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoIn(List<String> values) {
            addCriterion("SITE_NO in", values, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoNotIn(List<String> values) {
            addCriterion("SITE_NO not in", values, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoBetween(String value1, String value2) {
            addCriterion("SITE_NO between", value1, value2, "siteNo");
            return (Criteria) this;
        }

        public Criteria andSiteNoNotBetween(String value1, String value2) {
            addCriterion("SITE_NO not between", value1, value2, "siteNo");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIsNull() {
            addCriterion("RECEIVE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIsNotNull() {
            addCriterion("RECEIVE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTelEqualTo(String value) {
            addCriterion("RECEIVE_TEL =", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotEqualTo(String value) {
            addCriterion("RECEIVE_TEL <>", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelGreaterThan(String value) {
            addCriterion("RECEIVE_TEL >", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_TEL >=", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLessThan(String value) {
            addCriterion("RECEIVE_TEL <", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_TEL <=", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLike(String value) {
            addCriterion("RECEIVE_TEL like", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotLike(String value) {
            addCriterion("RECEIVE_TEL not like", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIn(List<String> values) {
            addCriterion("RECEIVE_TEL in", values, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotIn(List<String> values) {
            addCriterion("RECEIVE_TEL not in", values, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelBetween(String value1, String value2) {
            addCriterion("RECEIVE_TEL between", value1, value2, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_TEL not between", value1, value2, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andRePrintNumIsNull() {
            addCriterion("RE_PRINT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRePrintNumIsNotNull() {
            addCriterion("RE_PRINT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRePrintNumEqualTo(BigDecimal value) {
            addCriterion("RE_PRINT_NUM =", value, "rePrintNum");
            return (Criteria) this;
        }

        public Criteria andRePrintNumNotEqualTo(BigDecimal value) {
            addCriterion("RE_PRINT_NUM <>", value, "rePrintNum");
            return (Criteria) this;
        }

        public Criteria andRePrintNumGreaterThan(BigDecimal value) {
            addCriterion("RE_PRINT_NUM >", value, "rePrintNum");
            return (Criteria) this;
        }

        public Criteria andRePrintNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RE_PRINT_NUM >=", value, "rePrintNum");
            return (Criteria) this;
        }

        public Criteria andRePrintNumLessThan(BigDecimal value) {
            addCriterion("RE_PRINT_NUM <", value, "rePrintNum");
            return (Criteria) this;
        }

        public Criteria andRePrintNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RE_PRINT_NUM <=", value, "rePrintNum");
            return (Criteria) this;
        }

        public Criteria andRePrintNumIn(List<BigDecimal> values) {
            addCriterion("RE_PRINT_NUM in", values, "rePrintNum");
            return (Criteria) this;
        }

        public Criteria andRePrintNumNotIn(List<BigDecimal> values) {
            addCriterion("RE_PRINT_NUM not in", values, "rePrintNum");
            return (Criteria) this;
        }

        public Criteria andRePrintNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RE_PRINT_NUM between", value1, value2, "rePrintNum");
            return (Criteria) this;
        }

        public Criteria andRePrintNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RE_PRINT_NUM not between", value1, value2, "rePrintNum");
            return (Criteria) this;
        }

        public Criteria andVocFailDescIsNull() {
            addCriterion("VOC_FAIL_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVocFailDescIsNotNull() {
            addCriterion("VOC_FAIL_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVocFailDescEqualTo(String value) {
            addCriterion("VOC_FAIL_DESC =", value, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescNotEqualTo(String value) {
            addCriterion("VOC_FAIL_DESC <>", value, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescGreaterThan(String value) {
            addCriterion("VOC_FAIL_DESC >", value, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_FAIL_DESC >=", value, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescLessThan(String value) {
            addCriterion("VOC_FAIL_DESC <", value, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescLessThanOrEqualTo(String value) {
            addCriterion("VOC_FAIL_DESC <=", value, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescLike(String value) {
            addCriterion("VOC_FAIL_DESC like", value, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescNotLike(String value) {
            addCriterion("VOC_FAIL_DESC not like", value, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescIn(List<String> values) {
            addCriterion("VOC_FAIL_DESC in", values, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescNotIn(List<String> values) {
            addCriterion("VOC_FAIL_DESC not in", values, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescBetween(String value1, String value2) {
            addCriterion("VOC_FAIL_DESC between", value1, value2, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocFailDescNotBetween(String value1, String value2) {
            addCriterion("VOC_FAIL_DESC not between", value1, value2, "vocFailDesc");
            return (Criteria) this;
        }

        public Criteria andVocChannelIsNull() {
            addCriterion("VOC_CHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andVocChannelIsNotNull() {
            addCriterion("VOC_CHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andVocChannelEqualTo(String value) {
            addCriterion("VOC_CHANNEL =", value, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelNotEqualTo(String value) {
            addCriterion("VOC_CHANNEL <>", value, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelGreaterThan(String value) {
            addCriterion("VOC_CHANNEL >", value, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_CHANNEL >=", value, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelLessThan(String value) {
            addCriterion("VOC_CHANNEL <", value, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelLessThanOrEqualTo(String value) {
            addCriterion("VOC_CHANNEL <=", value, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelLike(String value) {
            addCriterion("VOC_CHANNEL like", value, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelNotLike(String value) {
            addCriterion("VOC_CHANNEL not like", value, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelIn(List<String> values) {
            addCriterion("VOC_CHANNEL in", values, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelNotIn(List<String> values) {
            addCriterion("VOC_CHANNEL not in", values, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelBetween(String value1, String value2) {
            addCriterion("VOC_CHANNEL between", value1, value2, "vocChannel");
            return (Criteria) this;
        }

        public Criteria andVocChannelNotBetween(String value1, String value2) {
            addCriterion("VOC_CHANNEL not between", value1, value2, "vocChannel");
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

        public Criteria andPdfPathIsNull() {
            addCriterion("PDF_PATH is null");
            return (Criteria) this;
        }

        public Criteria andPdfPathIsNotNull() {
            addCriterion("PDF_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andPdfPathEqualTo(String value) {
            addCriterion("PDF_PATH =", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotEqualTo(String value) {
            addCriterion("PDF_PATH <>", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathGreaterThan(String value) {
            addCriterion("PDF_PATH >", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathGreaterThanOrEqualTo(String value) {
            addCriterion("PDF_PATH >=", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLessThan(String value) {
            addCriterion("PDF_PATH <", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLessThanOrEqualTo(String value) {
            addCriterion("PDF_PATH <=", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathLike(String value) {
            addCriterion("PDF_PATH like", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotLike(String value) {
            addCriterion("PDF_PATH not like", value, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathIn(List<String> values) {
            addCriterion("PDF_PATH in", values, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotIn(List<String> values) {
            addCriterion("PDF_PATH not in", values, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathBetween(String value1, String value2) {
            addCriterion("PDF_PATH between", value1, value2, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andPdfPathNotBetween(String value1, String value2) {
            addCriterion("PDF_PATH not between", value1, value2, "pdfPath");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusIsNull() {
            addCriterion("EMAIL_SEND_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusIsNotNull() {
            addCriterion("EMAIL_SEND_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusEqualTo(String value) {
            addCriterion("EMAIL_SEND_STATUS =", value, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusNotEqualTo(String value) {
            addCriterion("EMAIL_SEND_STATUS <>", value, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusGreaterThan(String value) {
            addCriterion("EMAIL_SEND_STATUS >", value, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_SEND_STATUS >=", value, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusLessThan(String value) {
            addCriterion("EMAIL_SEND_STATUS <", value, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_SEND_STATUS <=", value, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusLike(String value) {
            addCriterion("EMAIL_SEND_STATUS like", value, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusNotLike(String value) {
            addCriterion("EMAIL_SEND_STATUS not like", value, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusIn(List<String> values) {
            addCriterion("EMAIL_SEND_STATUS in", values, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusNotIn(List<String> values) {
            addCriterion("EMAIL_SEND_STATUS not in", values, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusBetween(String value1, String value2) {
            addCriterion("EMAIL_SEND_STATUS between", value1, value2, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendStatusNotBetween(String value1, String value2) {
            addCriterion("EMAIL_SEND_STATUS not between", value1, value2, "emailSendStatus");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeIsNull() {
            addCriterion("EMAIL_SEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeIsNotNull() {
            addCriterion("EMAIL_SEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeEqualTo(String value) {
            addCriterion("EMAIL_SEND_TIME =", value, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeNotEqualTo(String value) {
            addCriterion("EMAIL_SEND_TIME <>", value, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeGreaterThan(String value) {
            addCriterion("EMAIL_SEND_TIME >", value, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_SEND_TIME >=", value, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeLessThan(String value) {
            addCriterion("EMAIL_SEND_TIME <", value, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_SEND_TIME <=", value, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeLike(String value) {
            addCriterion("EMAIL_SEND_TIME like", value, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeNotLike(String value) {
            addCriterion("EMAIL_SEND_TIME not like", value, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeIn(List<String> values) {
            addCriterion("EMAIL_SEND_TIME in", values, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeNotIn(List<String> values) {
            addCriterion("EMAIL_SEND_TIME not in", values, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeBetween(String value1, String value2) {
            addCriterion("EMAIL_SEND_TIME between", value1, value2, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailSendTimeNotBetween(String value1, String value2) {
            addCriterion("EMAIL_SEND_TIME not between", value1, value2, "emailSendTime");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsIsNull() {
            addCriterion("EMAIL_ANNEX_EXISTS is null");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsIsNotNull() {
            addCriterion("EMAIL_ANNEX_EXISTS is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsEqualTo(String value) {
            addCriterion("EMAIL_ANNEX_EXISTS =", value, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsNotEqualTo(String value) {
            addCriterion("EMAIL_ANNEX_EXISTS <>", value, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsGreaterThan(String value) {
            addCriterion("EMAIL_ANNEX_EXISTS >", value, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_ANNEX_EXISTS >=", value, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsLessThan(String value) {
            addCriterion("EMAIL_ANNEX_EXISTS <", value, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_ANNEX_EXISTS <=", value, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsLike(String value) {
            addCriterion("EMAIL_ANNEX_EXISTS like", value, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsNotLike(String value) {
            addCriterion("EMAIL_ANNEX_EXISTS not like", value, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsIn(List<String> values) {
            addCriterion("EMAIL_ANNEX_EXISTS in", values, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsNotIn(List<String> values) {
            addCriterion("EMAIL_ANNEX_EXISTS not in", values, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsBetween(String value1, String value2) {
            addCriterion("EMAIL_ANNEX_EXISTS between", value1, value2, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexExistsNotBetween(String value1, String value2) {
            addCriterion("EMAIL_ANNEX_EXISTS not between", value1, value2, "emailAnnexExists");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathIsNull() {
            addCriterion("EMAIL_ANNEX_PATH is null");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathIsNotNull() {
            addCriterion("EMAIL_ANNEX_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathEqualTo(String value) {
            addCriterion("EMAIL_ANNEX_PATH =", value, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathNotEqualTo(String value) {
            addCriterion("EMAIL_ANNEX_PATH <>", value, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathGreaterThan(String value) {
            addCriterion("EMAIL_ANNEX_PATH >", value, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL_ANNEX_PATH >=", value, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathLessThan(String value) {
            addCriterion("EMAIL_ANNEX_PATH <", value, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathLessThanOrEqualTo(String value) {
            addCriterion("EMAIL_ANNEX_PATH <=", value, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathLike(String value) {
            addCriterion("EMAIL_ANNEX_PATH like", value, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathNotLike(String value) {
            addCriterion("EMAIL_ANNEX_PATH not like", value, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathIn(List<String> values) {
            addCriterion("EMAIL_ANNEX_PATH in", values, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathNotIn(List<String> values) {
            addCriterion("EMAIL_ANNEX_PATH not in", values, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathBetween(String value1, String value2) {
            addCriterion("EMAIL_ANNEX_PATH between", value1, value2, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andEmailAnnexPathNotBetween(String value1, String value2) {
            addCriterion("EMAIL_ANNEX_PATH not between", value1, value2, "emailAnnexPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathIsNull() {
            addCriterion("XML_PATH is null");
            return (Criteria) this;
        }

        public Criteria andXmlPathIsNotNull() {
            addCriterion("XML_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andXmlPathEqualTo(String value) {
            addCriterion("XML_PATH =", value, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathNotEqualTo(String value) {
            addCriterion("XML_PATH <>", value, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathGreaterThan(String value) {
            addCriterion("XML_PATH >", value, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathGreaterThanOrEqualTo(String value) {
            addCriterion("XML_PATH >=", value, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathLessThan(String value) {
            addCriterion("XML_PATH <", value, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathLessThanOrEqualTo(String value) {
            addCriterion("XML_PATH <=", value, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathLike(String value) {
            addCriterion("XML_PATH like", value, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathNotLike(String value) {
            addCriterion("XML_PATH not like", value, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathIn(List<String> values) {
            addCriterion("XML_PATH in", values, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathNotIn(List<String> values) {
            addCriterion("XML_PATH not in", values, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathBetween(String value1, String value2) {
            addCriterion("XML_PATH between", value1, value2, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andXmlPathNotBetween(String value1, String value2) {
            addCriterion("XML_PATH not between", value1, value2, "xmlPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathIsNull() {
            addCriterion("OFD_PATH is null");
            return (Criteria) this;
        }

        public Criteria andOfdPathIsNotNull() {
            addCriterion("OFD_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andOfdPathEqualTo(String value) {
            addCriterion("OFD_PATH =", value, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathNotEqualTo(String value) {
            addCriterion("OFD_PATH <>", value, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathGreaterThan(String value) {
            addCriterion("OFD_PATH >", value, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathGreaterThanOrEqualTo(String value) {
            addCriterion("OFD_PATH >=", value, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathLessThan(String value) {
            addCriterion("OFD_PATH <", value, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathLessThanOrEqualTo(String value) {
            addCriterion("OFD_PATH <=", value, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathLike(String value) {
            addCriterion("OFD_PATH like", value, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathNotLike(String value) {
            addCriterion("OFD_PATH not like", value, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathIn(List<String> values) {
            addCriterion("OFD_PATH in", values, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathNotIn(List<String> values) {
            addCriterion("OFD_PATH not in", values, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathBetween(String value1, String value2) {
            addCriterion("OFD_PATH between", value1, value2, "ofdPath");
            return (Criteria) this;
        }

        public Criteria andOfdPathNotBetween(String value1, String value2) {
            addCriterion("OFD_PATH not between", value1, value2, "ofdPath");
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