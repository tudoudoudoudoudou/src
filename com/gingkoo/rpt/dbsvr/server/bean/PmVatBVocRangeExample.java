package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmVatBVocRangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmVatBVocRangeExample() {
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

        public Criteria andRangeNoIsNull() {
            addCriterion("RANGE_NO is null");
            return (Criteria) this;
        }

        public Criteria andRangeNoIsNotNull() {
            addCriterion("RANGE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRangeNoEqualTo(String value) {
            addCriterion("RANGE_NO =", value, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoNotEqualTo(String value) {
            addCriterion("RANGE_NO <>", value, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoGreaterThan(String value) {
            addCriterion("RANGE_NO >", value, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoGreaterThanOrEqualTo(String value) {
            addCriterion("RANGE_NO >=", value, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoLessThan(String value) {
            addCriterion("RANGE_NO <", value, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoLessThanOrEqualTo(String value) {
            addCriterion("RANGE_NO <=", value, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoLike(String value) {
            addCriterion("RANGE_NO like", value, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoNotLike(String value) {
            addCriterion("RANGE_NO not like", value, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoIn(List<String> values) {
            addCriterion("RANGE_NO in", values, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoNotIn(List<String> values) {
            addCriterion("RANGE_NO not in", values, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoBetween(String value1, String value2) {
            addCriterion("RANGE_NO between", value1, value2, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andRangeNoNotBetween(String value1, String value2) {
            addCriterion("RANGE_NO not between", value1, value2, "rangeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoIsNull() {
            addCriterion("VOLUME_NO is null");
            return (Criteria) this;
        }

        public Criteria andVolumeNoIsNotNull() {
            addCriterion("VOLUME_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeNoEqualTo(String value) {
            addCriterion("VOLUME_NO =", value, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoNotEqualTo(String value) {
            addCriterion("VOLUME_NO <>", value, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoGreaterThan(String value) {
            addCriterion("VOLUME_NO >", value, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoGreaterThanOrEqualTo(String value) {
            addCriterion("VOLUME_NO >=", value, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoLessThan(String value) {
            addCriterion("VOLUME_NO <", value, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoLessThanOrEqualTo(String value) {
            addCriterion("VOLUME_NO <=", value, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoLike(String value) {
            addCriterion("VOLUME_NO like", value, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoNotLike(String value) {
            addCriterion("VOLUME_NO not like", value, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoIn(List<String> values) {
            addCriterion("VOLUME_NO in", values, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoNotIn(List<String> values) {
            addCriterion("VOLUME_NO not in", values, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoBetween(String value1, String value2) {
            addCriterion("VOLUME_NO between", value1, value2, "volumeNo");
            return (Criteria) this;
        }

        public Criteria andVolumeNoNotBetween(String value1, String value2) {
            addCriterion("VOLUME_NO not between", value1, value2, "volumeNo");
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

        public Criteria andNumIsNull() {
            addCriterion("NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(BigDecimal value) {
            addCriterion("NUM =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(BigDecimal value) {
            addCriterion("NUM <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(BigDecimal value) {
            addCriterion("NUM >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(BigDecimal value) {
            addCriterion("NUM <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<BigDecimal> values) {
            addCriterion("NUM in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<BigDecimal> values) {
            addCriterion("NUM not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andMaxAmtIsNull() {
            addCriterion("MAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andMaxAmtIsNotNull() {
            addCriterion("MAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAmtEqualTo(BigDecimal value) {
            addCriterion("MAX_AMT =", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("MAX_AMT <>", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtGreaterThan(BigDecimal value) {
            addCriterion("MAX_AMT >", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_AMT >=", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtLessThan(BigDecimal value) {
            addCriterion("MAX_AMT <", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAX_AMT <=", value, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtIn(List<BigDecimal> values) {
            addCriterion("MAX_AMT in", values, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("MAX_AMT not in", values, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_AMT between", value1, value2, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andMaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAX_AMT not between", value1, value2, "maxAmt");
            return (Criteria) this;
        }

        public Criteria andInUserIsNull() {
            addCriterion("IN_USER is null");
            return (Criteria) this;
        }

        public Criteria andInUserIsNotNull() {
            addCriterion("IN_USER is not null");
            return (Criteria) this;
        }

        public Criteria andInUserEqualTo(String value) {
            addCriterion("IN_USER =", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserNotEqualTo(String value) {
            addCriterion("IN_USER <>", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserGreaterThan(String value) {
            addCriterion("IN_USER >", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserGreaterThanOrEqualTo(String value) {
            addCriterion("IN_USER >=", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserLessThan(String value) {
            addCriterion("IN_USER <", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserLessThanOrEqualTo(String value) {
            addCriterion("IN_USER <=", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserLike(String value) {
            addCriterion("IN_USER like", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserNotLike(String value) {
            addCriterion("IN_USER not like", value, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserIn(List<String> values) {
            addCriterion("IN_USER in", values, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserNotIn(List<String> values) {
            addCriterion("IN_USER not in", values, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserBetween(String value1, String value2) {
            addCriterion("IN_USER between", value1, value2, "inUser");
            return (Criteria) this;
        }

        public Criteria andInUserNotBetween(String value1, String value2) {
            addCriterion("IN_USER not between", value1, value2, "inUser");
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

        public Criteria andOutUserIsNull() {
            addCriterion("OUT_USER is null");
            return (Criteria) this;
        }

        public Criteria andOutUserIsNotNull() {
            addCriterion("OUT_USER is not null");
            return (Criteria) this;
        }

        public Criteria andOutUserEqualTo(String value) {
            addCriterion("OUT_USER =", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserNotEqualTo(String value) {
            addCriterion("OUT_USER <>", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserGreaterThan(String value) {
            addCriterion("OUT_USER >", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserGreaterThanOrEqualTo(String value) {
            addCriterion("OUT_USER >=", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserLessThan(String value) {
            addCriterion("OUT_USER <", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserLessThanOrEqualTo(String value) {
            addCriterion("OUT_USER <=", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserLike(String value) {
            addCriterion("OUT_USER like", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserNotLike(String value) {
            addCriterion("OUT_USER not like", value, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserIn(List<String> values) {
            addCriterion("OUT_USER in", values, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserNotIn(List<String> values) {
            addCriterion("OUT_USER not in", values, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserBetween(String value1, String value2) {
            addCriterion("OUT_USER between", value1, value2, "outUser");
            return (Criteria) this;
        }

        public Criteria andOutUserNotBetween(String value1, String value2) {
            addCriterion("OUT_USER not between", value1, value2, "outUser");
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

        public Criteria andSrcOrgIdIsNull() {
            addCriterion("SRC_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdIsNotNull() {
            addCriterion("SRC_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdEqualTo(String value) {
            addCriterion("SRC_ORG_ID =", value, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdNotEqualTo(String value) {
            addCriterion("SRC_ORG_ID <>", value, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdGreaterThan(String value) {
            addCriterion("SRC_ORG_ID >", value, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdGreaterThanOrEqualTo(String value) {
            addCriterion("SRC_ORG_ID >=", value, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdLessThan(String value) {
            addCriterion("SRC_ORG_ID <", value, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdLessThanOrEqualTo(String value) {
            addCriterion("SRC_ORG_ID <=", value, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdLike(String value) {
            addCriterion("SRC_ORG_ID like", value, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdNotLike(String value) {
            addCriterion("SRC_ORG_ID not like", value, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdIn(List<String> values) {
            addCriterion("SRC_ORG_ID in", values, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdNotIn(List<String> values) {
            addCriterion("SRC_ORG_ID not in", values, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdBetween(String value1, String value2) {
            addCriterion("SRC_ORG_ID between", value1, value2, "srcOrgId");
            return (Criteria) this;
        }

        public Criteria andSrcOrgIdNotBetween(String value1, String value2) {
            addCriterion("SRC_ORG_ID not between", value1, value2, "srcOrgId");
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

        public Criteria andSrcSiteNoIsNull() {
            addCriterion("SRC_SITE_NO is null");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoIsNotNull() {
            addCriterion("SRC_SITE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoEqualTo(String value) {
            addCriterion("SRC_SITE_NO =", value, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoNotEqualTo(String value) {
            addCriterion("SRC_SITE_NO <>", value, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoGreaterThan(String value) {
            addCriterion("SRC_SITE_NO >", value, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoGreaterThanOrEqualTo(String value) {
            addCriterion("SRC_SITE_NO >=", value, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoLessThan(String value) {
            addCriterion("SRC_SITE_NO <", value, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoLessThanOrEqualTo(String value) {
            addCriterion("SRC_SITE_NO <=", value, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoLike(String value) {
            addCriterion("SRC_SITE_NO like", value, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoNotLike(String value) {
            addCriterion("SRC_SITE_NO not like", value, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoIn(List<String> values) {
            addCriterion("SRC_SITE_NO in", values, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoNotIn(List<String> values) {
            addCriterion("SRC_SITE_NO not in", values, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoBetween(String value1, String value2) {
            addCriterion("SRC_SITE_NO between", value1, value2, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andSrcSiteNoNotBetween(String value1, String value2) {
            addCriterion("SRC_SITE_NO not between", value1, value2, "srcSiteNo");
            return (Criteria) this;
        }

        public Criteria andGetUserIsNull() {
            addCriterion("GET_USER is null");
            return (Criteria) this;
        }

        public Criteria andGetUserIsNotNull() {
            addCriterion("GET_USER is not null");
            return (Criteria) this;
        }

        public Criteria andGetUserEqualTo(String value) {
            addCriterion("GET_USER =", value, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserNotEqualTo(String value) {
            addCriterion("GET_USER <>", value, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserGreaterThan(String value) {
            addCriterion("GET_USER >", value, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserGreaterThanOrEqualTo(String value) {
            addCriterion("GET_USER >=", value, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserLessThan(String value) {
            addCriterion("GET_USER <", value, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserLessThanOrEqualTo(String value) {
            addCriterion("GET_USER <=", value, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserLike(String value) {
            addCriterion("GET_USER like", value, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserNotLike(String value) {
            addCriterion("GET_USER not like", value, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserIn(List<String> values) {
            addCriterion("GET_USER in", values, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserNotIn(List<String> values) {
            addCriterion("GET_USER not in", values, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserBetween(String value1, String value2) {
            addCriterion("GET_USER between", value1, value2, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetUserNotBetween(String value1, String value2) {
            addCriterion("GET_USER not between", value1, value2, "getUser");
            return (Criteria) this;
        }

        public Criteria andGetDateIsNull() {
            addCriterion("GET_DATE is null");
            return (Criteria) this;
        }

        public Criteria andGetDateIsNotNull() {
            addCriterion("GET_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andGetDateEqualTo(String value) {
            addCriterion("GET_DATE =", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateNotEqualTo(String value) {
            addCriterion("GET_DATE <>", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateGreaterThan(String value) {
            addCriterion("GET_DATE >", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateGreaterThanOrEqualTo(String value) {
            addCriterion("GET_DATE >=", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateLessThan(String value) {
            addCriterion("GET_DATE <", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateLessThanOrEqualTo(String value) {
            addCriterion("GET_DATE <=", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateLike(String value) {
            addCriterion("GET_DATE like", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateNotLike(String value) {
            addCriterion("GET_DATE not like", value, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateIn(List<String> values) {
            addCriterion("GET_DATE in", values, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateNotIn(List<String> values) {
            addCriterion("GET_DATE not in", values, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateBetween(String value1, String value2) {
            addCriterion("GET_DATE between", value1, value2, "getDate");
            return (Criteria) this;
        }

        public Criteria andGetDateNotBetween(String value1, String value2) {
            addCriterion("GET_DATE not between", value1, value2, "getDate");
            return (Criteria) this;
        }

        public Criteria andBackUserIsNull() {
            addCriterion("BACK_USER is null");
            return (Criteria) this;
        }

        public Criteria andBackUserIsNotNull() {
            addCriterion("BACK_USER is not null");
            return (Criteria) this;
        }

        public Criteria andBackUserEqualTo(String value) {
            addCriterion("BACK_USER =", value, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserNotEqualTo(String value) {
            addCriterion("BACK_USER <>", value, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserGreaterThan(String value) {
            addCriterion("BACK_USER >", value, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserGreaterThanOrEqualTo(String value) {
            addCriterion("BACK_USER >=", value, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserLessThan(String value) {
            addCriterion("BACK_USER <", value, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserLessThanOrEqualTo(String value) {
            addCriterion("BACK_USER <=", value, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserLike(String value) {
            addCriterion("BACK_USER like", value, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserNotLike(String value) {
            addCriterion("BACK_USER not like", value, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserIn(List<String> values) {
            addCriterion("BACK_USER in", values, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserNotIn(List<String> values) {
            addCriterion("BACK_USER not in", values, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserBetween(String value1, String value2) {
            addCriterion("BACK_USER between", value1, value2, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackUserNotBetween(String value1, String value2) {
            addCriterion("BACK_USER not between", value1, value2, "backUser");
            return (Criteria) this;
        }

        public Criteria andBackDateIsNull() {
            addCriterion("BACK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBackDateIsNotNull() {
            addCriterion("BACK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBackDateEqualTo(String value) {
            addCriterion("BACK_DATE =", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateNotEqualTo(String value) {
            addCriterion("BACK_DATE <>", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateGreaterThan(String value) {
            addCriterion("BACK_DATE >", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateGreaterThanOrEqualTo(String value) {
            addCriterion("BACK_DATE >=", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateLessThan(String value) {
            addCriterion("BACK_DATE <", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateLessThanOrEqualTo(String value) {
            addCriterion("BACK_DATE <=", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateLike(String value) {
            addCriterion("BACK_DATE like", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateNotLike(String value) {
            addCriterion("BACK_DATE not like", value, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateIn(List<String> values) {
            addCriterion("BACK_DATE in", values, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateNotIn(List<String> values) {
            addCriterion("BACK_DATE not in", values, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateBetween(String value1, String value2) {
            addCriterion("BACK_DATE between", value1, value2, "backDate");
            return (Criteria) this;
        }

        public Criteria andBackDateNotBetween(String value1, String value2) {
            addCriterion("BACK_DATE not between", value1, value2, "backDate");
            return (Criteria) this;
        }

        public Criteria andVocStatusIsNull() {
            addCriterion("VOC_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andVocStatusIsNotNull() {
            addCriterion("VOC_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andVocStatusEqualTo(String value) {
            addCriterion("VOC_STATUS =", value, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusNotEqualTo(String value) {
            addCriterion("VOC_STATUS <>", value, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusGreaterThan(String value) {
            addCriterion("VOC_STATUS >", value, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_STATUS >=", value, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusLessThan(String value) {
            addCriterion("VOC_STATUS <", value, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusLessThanOrEqualTo(String value) {
            addCriterion("VOC_STATUS <=", value, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusLike(String value) {
            addCriterion("VOC_STATUS like", value, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusNotLike(String value) {
            addCriterion("VOC_STATUS not like", value, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusIn(List<String> values) {
            addCriterion("VOC_STATUS in", values, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusNotIn(List<String> values) {
            addCriterion("VOC_STATUS not in", values, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusBetween(String value1, String value2) {
            addCriterion("VOC_STATUS between", value1, value2, "vocStatus");
            return (Criteria) this;
        }

        public Criteria andVocStatusNotBetween(String value1, String value2) {
            addCriterion("VOC_STATUS not between", value1, value2, "vocStatus");
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

        public Criteria andOpFlagIsNull() {
            addCriterion("OP_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOpFlagIsNotNull() {
            addCriterion("OP_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOpFlagEqualTo(String value) {
            addCriterion("OP_FLAG =", value, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagNotEqualTo(String value) {
            addCriterion("OP_FLAG <>", value, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagGreaterThan(String value) {
            addCriterion("OP_FLAG >", value, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagGreaterThanOrEqualTo(String value) {
            addCriterion("OP_FLAG >=", value, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagLessThan(String value) {
            addCriterion("OP_FLAG <", value, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagLessThanOrEqualTo(String value) {
            addCriterion("OP_FLAG <=", value, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagLike(String value) {
            addCriterion("OP_FLAG like", value, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagNotLike(String value) {
            addCriterion("OP_FLAG not like", value, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagIn(List<String> values) {
            addCriterion("OP_FLAG in", values, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagNotIn(List<String> values) {
            addCriterion("OP_FLAG not in", values, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagBetween(String value1, String value2) {
            addCriterion("OP_FLAG between", value1, value2, "opFlag");
            return (Criteria) this;
        }

        public Criteria andOpFlagNotBetween(String value1, String value2) {
            addCriterion("OP_FLAG not between", value1, value2, "opFlag");
            return (Criteria) this;
        }

        public Criteria andStartVocNumIsNull() {
            addCriterion("START_VOC_NUM is null");
            return (Criteria) this;
        }

        public Criteria andStartVocNumIsNotNull() {
            addCriterion("START_VOC_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andStartVocNumEqualTo(BigDecimal value) {
            addCriterion("START_VOC_NUM =", value, "startVocNum");
            return (Criteria) this;
        }

        public Criteria andStartVocNumNotEqualTo(BigDecimal value) {
            addCriterion("START_VOC_NUM <>", value, "startVocNum");
            return (Criteria) this;
        }

        public Criteria andStartVocNumGreaterThan(BigDecimal value) {
            addCriterion("START_VOC_NUM >", value, "startVocNum");
            return (Criteria) this;
        }

        public Criteria andStartVocNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("START_VOC_NUM >=", value, "startVocNum");
            return (Criteria) this;
        }

        public Criteria andStartVocNumLessThan(BigDecimal value) {
            addCriterion("START_VOC_NUM <", value, "startVocNum");
            return (Criteria) this;
        }

        public Criteria andStartVocNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("START_VOC_NUM <=", value, "startVocNum");
            return (Criteria) this;
        }

        public Criteria andStartVocNumIn(List<BigDecimal> values) {
            addCriterion("START_VOC_NUM in", values, "startVocNum");
            return (Criteria) this;
        }

        public Criteria andStartVocNumNotIn(List<BigDecimal> values) {
            addCriterion("START_VOC_NUM not in", values, "startVocNum");
            return (Criteria) this;
        }

        public Criteria andStartVocNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("START_VOC_NUM between", value1, value2, "startVocNum");
            return (Criteria) this;
        }

        public Criteria andStartVocNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("START_VOC_NUM not between", value1, value2, "startVocNum");
            return (Criteria) this;
        }

        public Criteria andVocEachNumIsNull() {
            addCriterion("VOC_EACH_NUM is null");
            return (Criteria) this;
        }

        public Criteria andVocEachNumIsNotNull() {
            addCriterion("VOC_EACH_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andVocEachNumEqualTo(BigDecimal value) {
            addCriterion("VOC_EACH_NUM =", value, "vocEachNum");
            return (Criteria) this;
        }

        public Criteria andVocEachNumNotEqualTo(BigDecimal value) {
            addCriterion("VOC_EACH_NUM <>", value, "vocEachNum");
            return (Criteria) this;
        }

        public Criteria andVocEachNumGreaterThan(BigDecimal value) {
            addCriterion("VOC_EACH_NUM >", value, "vocEachNum");
            return (Criteria) this;
        }

        public Criteria andVocEachNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_EACH_NUM >=", value, "vocEachNum");
            return (Criteria) this;
        }

        public Criteria andVocEachNumLessThan(BigDecimal value) {
            addCriterion("VOC_EACH_NUM <", value, "vocEachNum");
            return (Criteria) this;
        }

        public Criteria andVocEachNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOC_EACH_NUM <=", value, "vocEachNum");
            return (Criteria) this;
        }

        public Criteria andVocEachNumIn(List<BigDecimal> values) {
            addCriterion("VOC_EACH_NUM in", values, "vocEachNum");
            return (Criteria) this;
        }

        public Criteria andVocEachNumNotIn(List<BigDecimal> values) {
            addCriterion("VOC_EACH_NUM not in", values, "vocEachNum");
            return (Criteria) this;
        }

        public Criteria andVocEachNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_EACH_NUM between", value1, value2, "vocEachNum");
            return (Criteria) this;
        }

        public Criteria andVocEachNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOC_EACH_NUM not between", value1, value2, "vocEachNum");
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