package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PmVatVocSiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmVatVocSiteExample() {
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

        public Criteria andTaxEntityIsNull() {
            addCriterion("TAX_ENTITY is null");
            return (Criteria) this;
        }

        public Criteria andTaxEntityIsNotNull() {
            addCriterion("TAX_ENTITY is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEntityEqualTo(String value) {
            addCriterion("TAX_ENTITY =", value, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityNotEqualTo(String value) {
            addCriterion("TAX_ENTITY <>", value, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityGreaterThan(String value) {
            addCriterion("TAX_ENTITY >", value, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_ENTITY >=", value, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityLessThan(String value) {
            addCriterion("TAX_ENTITY <", value, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityLessThanOrEqualTo(String value) {
            addCriterion("TAX_ENTITY <=", value, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityLike(String value) {
            addCriterion("TAX_ENTITY like", value, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityNotLike(String value) {
            addCriterion("TAX_ENTITY not like", value, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityIn(List<String> values) {
            addCriterion("TAX_ENTITY in", values, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityNotIn(List<String> values) {
            addCriterion("TAX_ENTITY not in", values, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityBetween(String value1, String value2) {
            addCriterion("TAX_ENTITY between", value1, value2, "taxEntity");
            return (Criteria) this;
        }

        public Criteria andTaxEntityNotBetween(String value1, String value2) {
            addCriterion("TAX_ENTITY not between", value1, value2, "taxEntity");
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

        public Criteria andMacTypeIsNull() {
            addCriterion("MAC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMacTypeIsNotNull() {
            addCriterion("MAC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMacTypeEqualTo(String value) {
            addCriterion("MAC_TYPE =", value, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeNotEqualTo(String value) {
            addCriterion("MAC_TYPE <>", value, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeGreaterThan(String value) {
            addCriterion("MAC_TYPE >", value, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MAC_TYPE >=", value, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeLessThan(String value) {
            addCriterion("MAC_TYPE <", value, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeLessThanOrEqualTo(String value) {
            addCriterion("MAC_TYPE <=", value, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeLike(String value) {
            addCriterion("MAC_TYPE like", value, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeNotLike(String value) {
            addCriterion("MAC_TYPE not like", value, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeIn(List<String> values) {
            addCriterion("MAC_TYPE in", values, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeNotIn(List<String> values) {
            addCriterion("MAC_TYPE not in", values, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeBetween(String value1, String value2) {
            addCriterion("MAC_TYPE between", value1, value2, "macType");
            return (Criteria) this;
        }

        public Criteria andMacTypeNotBetween(String value1, String value2) {
            addCriterion("MAC_TYPE not between", value1, value2, "macType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeIsNull() {
            addCriterion("TAX_MAC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeIsNotNull() {
            addCriterion("TAX_MAC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeEqualTo(String value) {
            addCriterion("TAX_MAC_TYPE =", value, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeNotEqualTo(String value) {
            addCriterion("TAX_MAC_TYPE <>", value, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeGreaterThan(String value) {
            addCriterion("TAX_MAC_TYPE >", value, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TAX_MAC_TYPE >=", value, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeLessThan(String value) {
            addCriterion("TAX_MAC_TYPE <", value, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeLessThanOrEqualTo(String value) {
            addCriterion("TAX_MAC_TYPE <=", value, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeLike(String value) {
            addCriterion("TAX_MAC_TYPE like", value, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeNotLike(String value) {
            addCriterion("TAX_MAC_TYPE not like", value, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeIn(List<String> values) {
            addCriterion("TAX_MAC_TYPE in", values, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeNotIn(List<String> values) {
            addCriterion("TAX_MAC_TYPE not in", values, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeBetween(String value1, String value2) {
            addCriterion("TAX_MAC_TYPE between", value1, value2, "taxMacType");
            return (Criteria) this;
        }

        public Criteria andTaxMacTypeNotBetween(String value1, String value2) {
            addCriterion("TAX_MAC_TYPE not between", value1, value2, "taxMacType");
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

        public Criteria andVocMacTypeIsNull() {
            addCriterion("VOC_MAC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeIsNotNull() {
            addCriterion("VOC_MAC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeEqualTo(String value) {
            addCriterion("VOC_MAC_TYPE =", value, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeNotEqualTo(String value) {
            addCriterion("VOC_MAC_TYPE <>", value, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeGreaterThan(String value) {
            addCriterion("VOC_MAC_TYPE >", value, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VOC_MAC_TYPE >=", value, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeLessThan(String value) {
            addCriterion("VOC_MAC_TYPE <", value, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeLessThanOrEqualTo(String value) {
            addCriterion("VOC_MAC_TYPE <=", value, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeLike(String value) {
            addCriterion("VOC_MAC_TYPE like", value, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeNotLike(String value) {
            addCriterion("VOC_MAC_TYPE not like", value, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeIn(List<String> values) {
            addCriterion("VOC_MAC_TYPE in", values, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeNotIn(List<String> values) {
            addCriterion("VOC_MAC_TYPE not in", values, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeBetween(String value1, String value2) {
            addCriterion("VOC_MAC_TYPE between", value1, value2, "vocMacType");
            return (Criteria) this;
        }

        public Criteria andVocMacTypeNotBetween(String value1, String value2) {
            addCriterion("VOC_MAC_TYPE not between", value1, value2, "vocMacType");
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

        public Criteria andClientIpIsNull() {
            addCriterion("CLIENT_IP is null");
            return (Criteria) this;
        }

        public Criteria andClientIpIsNotNull() {
            addCriterion("CLIENT_IP is not null");
            return (Criteria) this;
        }

        public Criteria andClientIpEqualTo(String value) {
            addCriterion("CLIENT_IP =", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotEqualTo(String value) {
            addCriterion("CLIENT_IP <>", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThan(String value) {
            addCriterion("CLIENT_IP >", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_IP >=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThan(String value) {
            addCriterion("CLIENT_IP <", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_IP <=", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpLike(String value) {
            addCriterion("CLIENT_IP like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotLike(String value) {
            addCriterion("CLIENT_IP not like", value, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpIn(List<String> values) {
            addCriterion("CLIENT_IP in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotIn(List<String> values) {
            addCriterion("CLIENT_IP not in", values, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpBetween(String value1, String value2) {
            addCriterion("CLIENT_IP between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientIpNotBetween(String value1, String value2) {
            addCriterion("CLIENT_IP not between", value1, value2, "clientIp");
            return (Criteria) this;
        }

        public Criteria andClientPortIsNull() {
            addCriterion("CLIENT_PORT is null");
            return (Criteria) this;
        }

        public Criteria andClientPortIsNotNull() {
            addCriterion("CLIENT_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andClientPortEqualTo(String value) {
            addCriterion("CLIENT_PORT =", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotEqualTo(String value) {
            addCriterion("CLIENT_PORT <>", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortGreaterThan(String value) {
            addCriterion("CLIENT_PORT >", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortGreaterThanOrEqualTo(String value) {
            addCriterion("CLIENT_PORT >=", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortLessThan(String value) {
            addCriterion("CLIENT_PORT <", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortLessThanOrEqualTo(String value) {
            addCriterion("CLIENT_PORT <=", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortLike(String value) {
            addCriterion("CLIENT_PORT like", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotLike(String value) {
            addCriterion("CLIENT_PORT not like", value, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortIn(List<String> values) {
            addCriterion("CLIENT_PORT in", values, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotIn(List<String> values) {
            addCriterion("CLIENT_PORT not in", values, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortBetween(String value1, String value2) {
            addCriterion("CLIENT_PORT between", value1, value2, "clientPort");
            return (Criteria) this;
        }

        public Criteria andClientPortNotBetween(String value1, String value2) {
            addCriterion("CLIENT_PORT not between", value1, value2, "clientPort");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNull() {
            addCriterion("SERVER_IP is null");
            return (Criteria) this;
        }

        public Criteria andServerIpIsNotNull() {
            addCriterion("SERVER_IP is not null");
            return (Criteria) this;
        }

        public Criteria andServerIpEqualTo(String value) {
            addCriterion("SERVER_IP =", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotEqualTo(String value) {
            addCriterion("SERVER_IP <>", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThan(String value) {
            addCriterion("SERVER_IP >", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_IP >=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThan(String value) {
            addCriterion("SERVER_IP <", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLessThanOrEqualTo(String value) {
            addCriterion("SERVER_IP <=", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpLike(String value) {
            addCriterion("SERVER_IP like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotLike(String value) {
            addCriterion("SERVER_IP not like", value, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpIn(List<String> values) {
            addCriterion("SERVER_IP in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotIn(List<String> values) {
            addCriterion("SERVER_IP not in", values, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpBetween(String value1, String value2) {
            addCriterion("SERVER_IP between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerIpNotBetween(String value1, String value2) {
            addCriterion("SERVER_IP not between", value1, value2, "serverIp");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNull() {
            addCriterion("SERVER_PORT is null");
            return (Criteria) this;
        }

        public Criteria andServerPortIsNotNull() {
            addCriterion("SERVER_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andServerPortEqualTo(String value) {
            addCriterion("SERVER_PORT =", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotEqualTo(String value) {
            addCriterion("SERVER_PORT <>", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThan(String value) {
            addCriterion("SERVER_PORT >", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_PORT >=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThan(String value) {
            addCriterion("SERVER_PORT <", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLessThanOrEqualTo(String value) {
            addCriterion("SERVER_PORT <=", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortLike(String value) {
            addCriterion("SERVER_PORT like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotLike(String value) {
            addCriterion("SERVER_PORT not like", value, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortIn(List<String> values) {
            addCriterion("SERVER_PORT in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotIn(List<String> values) {
            addCriterion("SERVER_PORT not in", values, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortBetween(String value1, String value2) {
            addCriterion("SERVER_PORT between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerPortNotBetween(String value1, String value2) {
            addCriterion("SERVER_PORT not between", value1, value2, "serverPort");
            return (Criteria) this;
        }

        public Criteria andServerNoIsNull() {
            addCriterion("SERVER_NO is null");
            return (Criteria) this;
        }

        public Criteria andServerNoIsNotNull() {
            addCriterion("SERVER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andServerNoEqualTo(String value) {
            addCriterion("SERVER_NO =", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoNotEqualTo(String value) {
            addCriterion("SERVER_NO <>", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoGreaterThan(String value) {
            addCriterion("SERVER_NO >", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoGreaterThanOrEqualTo(String value) {
            addCriterion("SERVER_NO >=", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoLessThan(String value) {
            addCriterion("SERVER_NO <", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoLessThanOrEqualTo(String value) {
            addCriterion("SERVER_NO <=", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoLike(String value) {
            addCriterion("SERVER_NO like", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoNotLike(String value) {
            addCriterion("SERVER_NO not like", value, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoIn(List<String> values) {
            addCriterion("SERVER_NO in", values, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoNotIn(List<String> values) {
            addCriterion("SERVER_NO not in", values, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoBetween(String value1, String value2) {
            addCriterion("SERVER_NO between", value1, value2, "serverNo");
            return (Criteria) this;
        }

        public Criteria andServerNoNotBetween(String value1, String value2) {
            addCriterion("SERVER_NO not between", value1, value2, "serverNo");
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

        public Criteria andSiteNameIsNull() {
            addCriterion("SITE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("SITE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("SITE_NAME =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("SITE_NAME <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("SITE_NAME >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_NAME >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("SITE_NAME <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("SITE_NAME <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("SITE_NAME like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("SITE_NAME not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("SITE_NAME in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("SITE_NAME not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("SITE_NAME between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("SITE_NAME not between", value1, value2, "siteName");
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

        public Criteria andServiceIpIsNull() {
            addCriterion("SERVICE_IP is null");
            return (Criteria) this;
        }

        public Criteria andServiceIpIsNotNull() {
            addCriterion("SERVICE_IP is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIpEqualTo(String value) {
            addCriterion("SERVICE_IP =", value, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpNotEqualTo(String value) {
            addCriterion("SERVICE_IP <>", value, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpGreaterThan(String value) {
            addCriterion("SERVICE_IP >", value, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_IP >=", value, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpLessThan(String value) {
            addCriterion("SERVICE_IP <", value, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_IP <=", value, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpLike(String value) {
            addCriterion("SERVICE_IP like", value, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpNotLike(String value) {
            addCriterion("SERVICE_IP not like", value, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpIn(List<String> values) {
            addCriterion("SERVICE_IP in", values, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpNotIn(List<String> values) {
            addCriterion("SERVICE_IP not in", values, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpBetween(String value1, String value2) {
            addCriterion("SERVICE_IP between", value1, value2, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServiceIpNotBetween(String value1, String value2) {
            addCriterion("SERVICE_IP not between", value1, value2, "serviceIp");
            return (Criteria) this;
        }

        public Criteria andServicePortIsNull() {
            addCriterion("SERVICE_PORT is null");
            return (Criteria) this;
        }

        public Criteria andServicePortIsNotNull() {
            addCriterion("SERVICE_PORT is not null");
            return (Criteria) this;
        }

        public Criteria andServicePortEqualTo(String value) {
            addCriterion("SERVICE_PORT =", value, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortNotEqualTo(String value) {
            addCriterion("SERVICE_PORT <>", value, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortGreaterThan(String value) {
            addCriterion("SERVICE_PORT >", value, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortGreaterThanOrEqualTo(String value) {
            addCriterion("SERVICE_PORT >=", value, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortLessThan(String value) {
            addCriterion("SERVICE_PORT <", value, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortLessThanOrEqualTo(String value) {
            addCriterion("SERVICE_PORT <=", value, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortLike(String value) {
            addCriterion("SERVICE_PORT like", value, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortNotLike(String value) {
            addCriterion("SERVICE_PORT not like", value, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortIn(List<String> values) {
            addCriterion("SERVICE_PORT in", values, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortNotIn(List<String> values) {
            addCriterion("SERVICE_PORT not in", values, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortBetween(String value1, String value2) {
            addCriterion("SERVICE_PORT between", value1, value2, "servicePort");
            return (Criteria) this;
        }

        public Criteria andServicePortNotBetween(String value1, String value2) {
            addCriterion("SERVICE_PORT not between", value1, value2, "servicePort");
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