package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HisVatTaxRptA1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HisVatTaxRptA1Example() {
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

        public Criteria andBoucMonthIsNull() {
            addCriterion("BOUC_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andBoucMonthIsNotNull() {
            addCriterion("BOUC_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andBoucMonthEqualTo(String value) {
            addCriterion("BOUC_MONTH =", value, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthNotEqualTo(String value) {
            addCriterion("BOUC_MONTH <>", value, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthGreaterThan(String value) {
            addCriterion("BOUC_MONTH >", value, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthGreaterThanOrEqualTo(String value) {
            addCriterion("BOUC_MONTH >=", value, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthLessThan(String value) {
            addCriterion("BOUC_MONTH <", value, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthLessThanOrEqualTo(String value) {
            addCriterion("BOUC_MONTH <=", value, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthLike(String value) {
            addCriterion("BOUC_MONTH like", value, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthNotLike(String value) {
            addCriterion("BOUC_MONTH not like", value, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthIn(List<String> values) {
            addCriterion("BOUC_MONTH in", values, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthNotIn(List<String> values) {
            addCriterion("BOUC_MONTH not in", values, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthBetween(String value1, String value2) {
            addCriterion("BOUC_MONTH between", value1, value2, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andBoucMonthNotBetween(String value1, String value2) {
            addCriterion("BOUC_MONTH not between", value1, value2, "boucMonth");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("ITEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("ITEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("ITEM_NAME =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("ITEM_NAME <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("ITEM_NAME >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("ITEM_NAME <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("ITEM_NAME <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("ITEM_NAME like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("ITEM_NAME not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("ITEM_NAME in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("ITEM_NAME not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("ITEM_NAME between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("ITEM_NAME not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNull() {
            addCriterion("ITEM_NO is null");
            return (Criteria) this;
        }

        public Criteria andItemNoIsNotNull() {
            addCriterion("ITEM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andItemNoEqualTo(BigDecimal value) {
            addCriterion("ITEM_NO =", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotEqualTo(BigDecimal value) {
            addCriterion("ITEM_NO <>", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThan(BigDecimal value) {
            addCriterion("ITEM_NO >", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_NO >=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThan(BigDecimal value) {
            addCriterion("ITEM_NO <", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ITEM_NO <=", value, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoIn(List<BigDecimal> values) {
            addCriterion("ITEM_NO in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotIn(List<BigDecimal> values) {
            addCriterion("ITEM_NO not in", values, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_NO between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andItemNoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ITEM_NO not between", value1, value2, "itemNo");
            return (Criteria) this;
        }

        public Criteria andS1AmtIsNull() {
            addCriterion("S_1_AMT is null");
            return (Criteria) this;
        }

        public Criteria andS1AmtIsNotNull() {
            addCriterion("S_1_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andS1AmtEqualTo(BigDecimal value) {
            addCriterion("S_1_AMT =", value, "s1Amt");
            return (Criteria) this;
        }

        public Criteria andS1AmtNotEqualTo(BigDecimal value) {
            addCriterion("S_1_AMT <>", value, "s1Amt");
            return (Criteria) this;
        }

        public Criteria andS1AmtGreaterThan(BigDecimal value) {
            addCriterion("S_1_AMT >", value, "s1Amt");
            return (Criteria) this;
        }

        public Criteria andS1AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_1_AMT >=", value, "s1Amt");
            return (Criteria) this;
        }

        public Criteria andS1AmtLessThan(BigDecimal value) {
            addCriterion("S_1_AMT <", value, "s1Amt");
            return (Criteria) this;
        }

        public Criteria andS1AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_1_AMT <=", value, "s1Amt");
            return (Criteria) this;
        }

        public Criteria andS1AmtIn(List<BigDecimal> values) {
            addCriterion("S_1_AMT in", values, "s1Amt");
            return (Criteria) this;
        }

        public Criteria andS1AmtNotIn(List<BigDecimal> values) {
            addCriterion("S_1_AMT not in", values, "s1Amt");
            return (Criteria) this;
        }

        public Criteria andS1AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_1_AMT between", value1, value2, "s1Amt");
            return (Criteria) this;
        }

        public Criteria andS1AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_1_AMT not between", value1, value2, "s1Amt");
            return (Criteria) this;
        }

        public Criteria andT1AmtIsNull() {
            addCriterion("T_1_AMT is null");
            return (Criteria) this;
        }

        public Criteria andT1AmtIsNotNull() {
            addCriterion("T_1_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andT1AmtEqualTo(BigDecimal value) {
            addCriterion("T_1_AMT =", value, "t1Amt");
            return (Criteria) this;
        }

        public Criteria andT1AmtNotEqualTo(BigDecimal value) {
            addCriterion("T_1_AMT <>", value, "t1Amt");
            return (Criteria) this;
        }

        public Criteria andT1AmtGreaterThan(BigDecimal value) {
            addCriterion("T_1_AMT >", value, "t1Amt");
            return (Criteria) this;
        }

        public Criteria andT1AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_1_AMT >=", value, "t1Amt");
            return (Criteria) this;
        }

        public Criteria andT1AmtLessThan(BigDecimal value) {
            addCriterion("T_1_AMT <", value, "t1Amt");
            return (Criteria) this;
        }

        public Criteria andT1AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_1_AMT <=", value, "t1Amt");
            return (Criteria) this;
        }

        public Criteria andT1AmtIn(List<BigDecimal> values) {
            addCriterion("T_1_AMT in", values, "t1Amt");
            return (Criteria) this;
        }

        public Criteria andT1AmtNotIn(List<BigDecimal> values) {
            addCriterion("T_1_AMT not in", values, "t1Amt");
            return (Criteria) this;
        }

        public Criteria andT1AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_1_AMT between", value1, value2, "t1Amt");
            return (Criteria) this;
        }

        public Criteria andT1AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_1_AMT not between", value1, value2, "t1Amt");
            return (Criteria) this;
        }

        public Criteria andS2AmtIsNull() {
            addCriterion("S_2_AMT is null");
            return (Criteria) this;
        }

        public Criteria andS2AmtIsNotNull() {
            addCriterion("S_2_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andS2AmtEqualTo(BigDecimal value) {
            addCriterion("S_2_AMT =", value, "s2Amt");
            return (Criteria) this;
        }

        public Criteria andS2AmtNotEqualTo(BigDecimal value) {
            addCriterion("S_2_AMT <>", value, "s2Amt");
            return (Criteria) this;
        }

        public Criteria andS2AmtGreaterThan(BigDecimal value) {
            addCriterion("S_2_AMT >", value, "s2Amt");
            return (Criteria) this;
        }

        public Criteria andS2AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_2_AMT >=", value, "s2Amt");
            return (Criteria) this;
        }

        public Criteria andS2AmtLessThan(BigDecimal value) {
            addCriterion("S_2_AMT <", value, "s2Amt");
            return (Criteria) this;
        }

        public Criteria andS2AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_2_AMT <=", value, "s2Amt");
            return (Criteria) this;
        }

        public Criteria andS2AmtIn(List<BigDecimal> values) {
            addCriterion("S_2_AMT in", values, "s2Amt");
            return (Criteria) this;
        }

        public Criteria andS2AmtNotIn(List<BigDecimal> values) {
            addCriterion("S_2_AMT not in", values, "s2Amt");
            return (Criteria) this;
        }

        public Criteria andS2AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_2_AMT between", value1, value2, "s2Amt");
            return (Criteria) this;
        }

        public Criteria andS2AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_2_AMT not between", value1, value2, "s2Amt");
            return (Criteria) this;
        }

        public Criteria andT2AmtIsNull() {
            addCriterion("T_2_AMT is null");
            return (Criteria) this;
        }

        public Criteria andT2AmtIsNotNull() {
            addCriterion("T_2_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andT2AmtEqualTo(BigDecimal value) {
            addCriterion("T_2_AMT =", value, "t2Amt");
            return (Criteria) this;
        }

        public Criteria andT2AmtNotEqualTo(BigDecimal value) {
            addCriterion("T_2_AMT <>", value, "t2Amt");
            return (Criteria) this;
        }

        public Criteria andT2AmtGreaterThan(BigDecimal value) {
            addCriterion("T_2_AMT >", value, "t2Amt");
            return (Criteria) this;
        }

        public Criteria andT2AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_2_AMT >=", value, "t2Amt");
            return (Criteria) this;
        }

        public Criteria andT2AmtLessThan(BigDecimal value) {
            addCriterion("T_2_AMT <", value, "t2Amt");
            return (Criteria) this;
        }

        public Criteria andT2AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_2_AMT <=", value, "t2Amt");
            return (Criteria) this;
        }

        public Criteria andT2AmtIn(List<BigDecimal> values) {
            addCriterion("T_2_AMT in", values, "t2Amt");
            return (Criteria) this;
        }

        public Criteria andT2AmtNotIn(List<BigDecimal> values) {
            addCriterion("T_2_AMT not in", values, "t2Amt");
            return (Criteria) this;
        }

        public Criteria andT2AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_2_AMT between", value1, value2, "t2Amt");
            return (Criteria) this;
        }

        public Criteria andT2AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_2_AMT not between", value1, value2, "t2Amt");
            return (Criteria) this;
        }

        public Criteria andS3AmtIsNull() {
            addCriterion("S_3_AMT is null");
            return (Criteria) this;
        }

        public Criteria andS3AmtIsNotNull() {
            addCriterion("S_3_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andS3AmtEqualTo(BigDecimal value) {
            addCriterion("S_3_AMT =", value, "s3Amt");
            return (Criteria) this;
        }

        public Criteria andS3AmtNotEqualTo(BigDecimal value) {
            addCriterion("S_3_AMT <>", value, "s3Amt");
            return (Criteria) this;
        }

        public Criteria andS3AmtGreaterThan(BigDecimal value) {
            addCriterion("S_3_AMT >", value, "s3Amt");
            return (Criteria) this;
        }

        public Criteria andS3AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_3_AMT >=", value, "s3Amt");
            return (Criteria) this;
        }

        public Criteria andS3AmtLessThan(BigDecimal value) {
            addCriterion("S_3_AMT <", value, "s3Amt");
            return (Criteria) this;
        }

        public Criteria andS3AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_3_AMT <=", value, "s3Amt");
            return (Criteria) this;
        }

        public Criteria andS3AmtIn(List<BigDecimal> values) {
            addCriterion("S_3_AMT in", values, "s3Amt");
            return (Criteria) this;
        }

        public Criteria andS3AmtNotIn(List<BigDecimal> values) {
            addCriterion("S_3_AMT not in", values, "s3Amt");
            return (Criteria) this;
        }

        public Criteria andS3AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_3_AMT between", value1, value2, "s3Amt");
            return (Criteria) this;
        }

        public Criteria andS3AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_3_AMT not between", value1, value2, "s3Amt");
            return (Criteria) this;
        }

        public Criteria andT3AmtIsNull() {
            addCriterion("T_3_AMT is null");
            return (Criteria) this;
        }

        public Criteria andT3AmtIsNotNull() {
            addCriterion("T_3_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andT3AmtEqualTo(BigDecimal value) {
            addCriterion("T_3_AMT =", value, "t3Amt");
            return (Criteria) this;
        }

        public Criteria andT3AmtNotEqualTo(BigDecimal value) {
            addCriterion("T_3_AMT <>", value, "t3Amt");
            return (Criteria) this;
        }

        public Criteria andT3AmtGreaterThan(BigDecimal value) {
            addCriterion("T_3_AMT >", value, "t3Amt");
            return (Criteria) this;
        }

        public Criteria andT3AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_3_AMT >=", value, "t3Amt");
            return (Criteria) this;
        }

        public Criteria andT3AmtLessThan(BigDecimal value) {
            addCriterion("T_3_AMT <", value, "t3Amt");
            return (Criteria) this;
        }

        public Criteria andT3AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_3_AMT <=", value, "t3Amt");
            return (Criteria) this;
        }

        public Criteria andT3AmtIn(List<BigDecimal> values) {
            addCriterion("T_3_AMT in", values, "t3Amt");
            return (Criteria) this;
        }

        public Criteria andT3AmtNotIn(List<BigDecimal> values) {
            addCriterion("T_3_AMT not in", values, "t3Amt");
            return (Criteria) this;
        }

        public Criteria andT3AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_3_AMT between", value1, value2, "t3Amt");
            return (Criteria) this;
        }

        public Criteria andT3AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_3_AMT not between", value1, value2, "t3Amt");
            return (Criteria) this;
        }

        public Criteria andS4AmtIsNull() {
            addCriterion("S_4_AMT is null");
            return (Criteria) this;
        }

        public Criteria andS4AmtIsNotNull() {
            addCriterion("S_4_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andS4AmtEqualTo(BigDecimal value) {
            addCriterion("S_4_AMT =", value, "s4Amt");
            return (Criteria) this;
        }

        public Criteria andS4AmtNotEqualTo(BigDecimal value) {
            addCriterion("S_4_AMT <>", value, "s4Amt");
            return (Criteria) this;
        }

        public Criteria andS4AmtGreaterThan(BigDecimal value) {
            addCriterion("S_4_AMT >", value, "s4Amt");
            return (Criteria) this;
        }

        public Criteria andS4AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_4_AMT >=", value, "s4Amt");
            return (Criteria) this;
        }

        public Criteria andS4AmtLessThan(BigDecimal value) {
            addCriterion("S_4_AMT <", value, "s4Amt");
            return (Criteria) this;
        }

        public Criteria andS4AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_4_AMT <=", value, "s4Amt");
            return (Criteria) this;
        }

        public Criteria andS4AmtIn(List<BigDecimal> values) {
            addCriterion("S_4_AMT in", values, "s4Amt");
            return (Criteria) this;
        }

        public Criteria andS4AmtNotIn(List<BigDecimal> values) {
            addCriterion("S_4_AMT not in", values, "s4Amt");
            return (Criteria) this;
        }

        public Criteria andS4AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_4_AMT between", value1, value2, "s4Amt");
            return (Criteria) this;
        }

        public Criteria andS4AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_4_AMT not between", value1, value2, "s4Amt");
            return (Criteria) this;
        }

        public Criteria andT4AmtIsNull() {
            addCriterion("T_4_AMT is null");
            return (Criteria) this;
        }

        public Criteria andT4AmtIsNotNull() {
            addCriterion("T_4_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andT4AmtEqualTo(BigDecimal value) {
            addCriterion("T_4_AMT =", value, "t4Amt");
            return (Criteria) this;
        }

        public Criteria andT4AmtNotEqualTo(BigDecimal value) {
            addCriterion("T_4_AMT <>", value, "t4Amt");
            return (Criteria) this;
        }

        public Criteria andT4AmtGreaterThan(BigDecimal value) {
            addCriterion("T_4_AMT >", value, "t4Amt");
            return (Criteria) this;
        }

        public Criteria andT4AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_4_AMT >=", value, "t4Amt");
            return (Criteria) this;
        }

        public Criteria andT4AmtLessThan(BigDecimal value) {
            addCriterion("T_4_AMT <", value, "t4Amt");
            return (Criteria) this;
        }

        public Criteria andT4AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_4_AMT <=", value, "t4Amt");
            return (Criteria) this;
        }

        public Criteria andT4AmtIn(List<BigDecimal> values) {
            addCriterion("T_4_AMT in", values, "t4Amt");
            return (Criteria) this;
        }

        public Criteria andT4AmtNotIn(List<BigDecimal> values) {
            addCriterion("T_4_AMT not in", values, "t4Amt");
            return (Criteria) this;
        }

        public Criteria andT4AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_4_AMT between", value1, value2, "t4Amt");
            return (Criteria) this;
        }

        public Criteria andT4AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_4_AMT not between", value1, value2, "t4Amt");
            return (Criteria) this;
        }

        public Criteria andS5AmtIsNull() {
            addCriterion("S_5_AMT is null");
            return (Criteria) this;
        }

        public Criteria andS5AmtIsNotNull() {
            addCriterion("S_5_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andS5AmtEqualTo(BigDecimal value) {
            addCriterion("S_5_AMT =", value, "s5Amt");
            return (Criteria) this;
        }

        public Criteria andS5AmtNotEqualTo(BigDecimal value) {
            addCriterion("S_5_AMT <>", value, "s5Amt");
            return (Criteria) this;
        }

        public Criteria andS5AmtGreaterThan(BigDecimal value) {
            addCriterion("S_5_AMT >", value, "s5Amt");
            return (Criteria) this;
        }

        public Criteria andS5AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_5_AMT >=", value, "s5Amt");
            return (Criteria) this;
        }

        public Criteria andS5AmtLessThan(BigDecimal value) {
            addCriterion("S_5_AMT <", value, "s5Amt");
            return (Criteria) this;
        }

        public Criteria andS5AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_5_AMT <=", value, "s5Amt");
            return (Criteria) this;
        }

        public Criteria andS5AmtIn(List<BigDecimal> values) {
            addCriterion("S_5_AMT in", values, "s5Amt");
            return (Criteria) this;
        }

        public Criteria andS5AmtNotIn(List<BigDecimal> values) {
            addCriterion("S_5_AMT not in", values, "s5Amt");
            return (Criteria) this;
        }

        public Criteria andS5AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_5_AMT between", value1, value2, "s5Amt");
            return (Criteria) this;
        }

        public Criteria andS5AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_5_AMT not between", value1, value2, "s5Amt");
            return (Criteria) this;
        }

        public Criteria andT5AmtIsNull() {
            addCriterion("T_5_AMT is null");
            return (Criteria) this;
        }

        public Criteria andT5AmtIsNotNull() {
            addCriterion("T_5_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andT5AmtEqualTo(BigDecimal value) {
            addCriterion("T_5_AMT =", value, "t5Amt");
            return (Criteria) this;
        }

        public Criteria andT5AmtNotEqualTo(BigDecimal value) {
            addCriterion("T_5_AMT <>", value, "t5Amt");
            return (Criteria) this;
        }

        public Criteria andT5AmtGreaterThan(BigDecimal value) {
            addCriterion("T_5_AMT >", value, "t5Amt");
            return (Criteria) this;
        }

        public Criteria andT5AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_5_AMT >=", value, "t5Amt");
            return (Criteria) this;
        }

        public Criteria andT5AmtLessThan(BigDecimal value) {
            addCriterion("T_5_AMT <", value, "t5Amt");
            return (Criteria) this;
        }

        public Criteria andT5AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_5_AMT <=", value, "t5Amt");
            return (Criteria) this;
        }

        public Criteria andT5AmtIn(List<BigDecimal> values) {
            addCriterion("T_5_AMT in", values, "t5Amt");
            return (Criteria) this;
        }

        public Criteria andT5AmtNotIn(List<BigDecimal> values) {
            addCriterion("T_5_AMT not in", values, "t5Amt");
            return (Criteria) this;
        }

        public Criteria andT5AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_5_AMT between", value1, value2, "t5Amt");
            return (Criteria) this;
        }

        public Criteria andT5AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_5_AMT not between", value1, value2, "t5Amt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIsNull() {
            addCriterion("TOTAL_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIsNotNull() {
            addCriterion("TOTAL_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmtEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMT =", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMT <>", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_AMT >", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMT >=", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtLessThan(BigDecimal value) {
            addCriterion("TOTAL_AMT <", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_AMT <=", value, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AMT in", values, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_AMT not in", values, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AMT between", value1, value2, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andTotalAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_AMT not between", value1, value2, "totalAmt");
            return (Criteria) this;
        }

        public Criteria andDeduAmtIsNull() {
            addCriterion("DEDU_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDeduAmtIsNotNull() {
            addCriterion("DEDU_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDeduAmtEqualTo(BigDecimal value) {
            addCriterion("DEDU_AMT =", value, "deduAmt");
            return (Criteria) this;
        }

        public Criteria andDeduAmtNotEqualTo(BigDecimal value) {
            addCriterion("DEDU_AMT <>", value, "deduAmt");
            return (Criteria) this;
        }

        public Criteria andDeduAmtGreaterThan(BigDecimal value) {
            addCriterion("DEDU_AMT >", value, "deduAmt");
            return (Criteria) this;
        }

        public Criteria andDeduAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDU_AMT >=", value, "deduAmt");
            return (Criteria) this;
        }

        public Criteria andDeduAmtLessThan(BigDecimal value) {
            addCriterion("DEDU_AMT <", value, "deduAmt");
            return (Criteria) this;
        }

        public Criteria andDeduAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEDU_AMT <=", value, "deduAmt");
            return (Criteria) this;
        }

        public Criteria andDeduAmtIn(List<BigDecimal> values) {
            addCriterion("DEDU_AMT in", values, "deduAmt");
            return (Criteria) this;
        }

        public Criteria andDeduAmtNotIn(List<BigDecimal> values) {
            addCriterion("DEDU_AMT not in", values, "deduAmt");
            return (Criteria) this;
        }

        public Criteria andDeduAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDU_AMT between", value1, value2, "deduAmt");
            return (Criteria) this;
        }

        public Criteria andDeduAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEDU_AMT not between", value1, value2, "deduAmt");
            return (Criteria) this;
        }

        public Criteria andS7AmtIsNull() {
            addCriterion("S_7_AMT is null");
            return (Criteria) this;
        }

        public Criteria andS7AmtIsNotNull() {
            addCriterion("S_7_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andS7AmtEqualTo(BigDecimal value) {
            addCriterion("S_7_AMT =", value, "s7Amt");
            return (Criteria) this;
        }

        public Criteria andS7AmtNotEqualTo(BigDecimal value) {
            addCriterion("S_7_AMT <>", value, "s7Amt");
            return (Criteria) this;
        }

        public Criteria andS7AmtGreaterThan(BigDecimal value) {
            addCriterion("S_7_AMT >", value, "s7Amt");
            return (Criteria) this;
        }

        public Criteria andS7AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("S_7_AMT >=", value, "s7Amt");
            return (Criteria) this;
        }

        public Criteria andS7AmtLessThan(BigDecimal value) {
            addCriterion("S_7_AMT <", value, "s7Amt");
            return (Criteria) this;
        }

        public Criteria andS7AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("S_7_AMT <=", value, "s7Amt");
            return (Criteria) this;
        }

        public Criteria andS7AmtIn(List<BigDecimal> values) {
            addCriterion("S_7_AMT in", values, "s7Amt");
            return (Criteria) this;
        }

        public Criteria andS7AmtNotIn(List<BigDecimal> values) {
            addCriterion("S_7_AMT not in", values, "s7Amt");
            return (Criteria) this;
        }

        public Criteria andS7AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_7_AMT between", value1, value2, "s7Amt");
            return (Criteria) this;
        }

        public Criteria andS7AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("S_7_AMT not between", value1, value2, "s7Amt");
            return (Criteria) this;
        }

        public Criteria andT7AmtIsNull() {
            addCriterion("T_7_AMT is null");
            return (Criteria) this;
        }

        public Criteria andT7AmtIsNotNull() {
            addCriterion("T_7_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andT7AmtEqualTo(BigDecimal value) {
            addCriterion("T_7_AMT =", value, "t7Amt");
            return (Criteria) this;
        }

        public Criteria andT7AmtNotEqualTo(BigDecimal value) {
            addCriterion("T_7_AMT <>", value, "t7Amt");
            return (Criteria) this;
        }

        public Criteria andT7AmtGreaterThan(BigDecimal value) {
            addCriterion("T_7_AMT >", value, "t7Amt");
            return (Criteria) this;
        }

        public Criteria andT7AmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("T_7_AMT >=", value, "t7Amt");
            return (Criteria) this;
        }

        public Criteria andT7AmtLessThan(BigDecimal value) {
            addCriterion("T_7_AMT <", value, "t7Amt");
            return (Criteria) this;
        }

        public Criteria andT7AmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("T_7_AMT <=", value, "t7Amt");
            return (Criteria) this;
        }

        public Criteria andT7AmtIn(List<BigDecimal> values) {
            addCriterion("T_7_AMT in", values, "t7Amt");
            return (Criteria) this;
        }

        public Criteria andT7AmtNotIn(List<BigDecimal> values) {
            addCriterion("T_7_AMT not in", values, "t7Amt");
            return (Criteria) this;
        }

        public Criteria andT7AmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_7_AMT between", value1, value2, "t7Amt");
            return (Criteria) this;
        }

        public Criteria andT7AmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("T_7_AMT not between", value1, value2, "t7Amt");
            return (Criteria) this;
        }

        public Criteria andRptStatusIsNull() {
            addCriterion("RPT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andRptStatusIsNotNull() {
            addCriterion("RPT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andRptStatusEqualTo(String value) {
            addCriterion("RPT_STATUS =", value, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusNotEqualTo(String value) {
            addCriterion("RPT_STATUS <>", value, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusGreaterThan(String value) {
            addCriterion("RPT_STATUS >", value, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_STATUS >=", value, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusLessThan(String value) {
            addCriterion("RPT_STATUS <", value, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusLessThanOrEqualTo(String value) {
            addCriterion("RPT_STATUS <=", value, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusLike(String value) {
            addCriterion("RPT_STATUS like", value, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusNotLike(String value) {
            addCriterion("RPT_STATUS not like", value, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusIn(List<String> values) {
            addCriterion("RPT_STATUS in", values, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusNotIn(List<String> values) {
            addCriterion("RPT_STATUS not in", values, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusBetween(String value1, String value2) {
            addCriterion("RPT_STATUS between", value1, value2, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptStatusNotBetween(String value1, String value2) {
            addCriterion("RPT_STATUS not between", value1, value2, "rptStatus");
            return (Criteria) this;
        }

        public Criteria andRptDateIsNull() {
            addCriterion("RPT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRptDateIsNotNull() {
            addCriterion("RPT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRptDateEqualTo(String value) {
            addCriterion("RPT_DATE =", value, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateNotEqualTo(String value) {
            addCriterion("RPT_DATE <>", value, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateGreaterThan(String value) {
            addCriterion("RPT_DATE >", value, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_DATE >=", value, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateLessThan(String value) {
            addCriterion("RPT_DATE <", value, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateLessThanOrEqualTo(String value) {
            addCriterion("RPT_DATE <=", value, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateLike(String value) {
            addCriterion("RPT_DATE like", value, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateNotLike(String value) {
            addCriterion("RPT_DATE not like", value, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateIn(List<String> values) {
            addCriterion("RPT_DATE in", values, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateNotIn(List<String> values) {
            addCriterion("RPT_DATE not in", values, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateBetween(String value1, String value2) {
            addCriterion("RPT_DATE between", value1, value2, "rptDate");
            return (Criteria) this;
        }

        public Criteria andRptDateNotBetween(String value1, String value2) {
            addCriterion("RPT_DATE not between", value1, value2, "rptDate");
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