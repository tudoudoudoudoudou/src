package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OdsXlsVatVendorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsXlsVatVendorExample() {
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

        public Criteria andBrActnoIsNull() {
            addCriterion("BR_ACTNO is null");
            return (Criteria) this;
        }

        public Criteria andBrActnoIsNotNull() {
            addCriterion("BR_ACTNO is not null");
            return (Criteria) this;
        }

        public Criteria andBrActnoEqualTo(String value) {
            addCriterion("BR_ACTNO =", value, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoNotEqualTo(String value) {
            addCriterion("BR_ACTNO <>", value, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoGreaterThan(String value) {
            addCriterion("BR_ACTNO >", value, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoGreaterThanOrEqualTo(String value) {
            addCriterion("BR_ACTNO >=", value, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoLessThan(String value) {
            addCriterion("BR_ACTNO <", value, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoLessThanOrEqualTo(String value) {
            addCriterion("BR_ACTNO <=", value, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoLike(String value) {
            addCriterion("BR_ACTNO like", value, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoNotLike(String value) {
            addCriterion("BR_ACTNO not like", value, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoIn(List<String> values) {
            addCriterion("BR_ACTNO in", values, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoNotIn(List<String> values) {
            addCriterion("BR_ACTNO not in", values, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoBetween(String value1, String value2) {
            addCriterion("BR_ACTNO between", value1, value2, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrActnoNotBetween(String value1, String value2) {
            addCriterion("BR_ACTNO not between", value1, value2, "brActno");
            return (Criteria) this;
        }

        public Criteria andBrNameIsNull() {
            addCriterion("BR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBrNameIsNotNull() {
            addCriterion("BR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBrNameEqualTo(String value) {
            addCriterion("BR_NAME =", value, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameNotEqualTo(String value) {
            addCriterion("BR_NAME <>", value, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameGreaterThan(String value) {
            addCriterion("BR_NAME >", value, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameGreaterThanOrEqualTo(String value) {
            addCriterion("BR_NAME >=", value, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameLessThan(String value) {
            addCriterion("BR_NAME <", value, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameLessThanOrEqualTo(String value) {
            addCriterion("BR_NAME <=", value, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameLike(String value) {
            addCriterion("BR_NAME like", value, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameNotLike(String value) {
            addCriterion("BR_NAME not like", value, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameIn(List<String> values) {
            addCriterion("BR_NAME in", values, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameNotIn(List<String> values) {
            addCriterion("BR_NAME not in", values, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameBetween(String value1, String value2) {
            addCriterion("BR_NAME between", value1, value2, "brName");
            return (Criteria) this;
        }

        public Criteria andBrNameNotBetween(String value1, String value2) {
            addCriterion("BR_NAME not between", value1, value2, "brName");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNull() {
            addCriterion("ORG_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("ORG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(String value) {
            addCriterion("ORG_NO =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(String value) {
            addCriterion("ORG_NO <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(String value) {
            addCriterion("ORG_NO >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NO >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(String value) {
            addCriterion("ORG_NO <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(String value) {
            addCriterion("ORG_NO <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLike(String value) {
            addCriterion("ORG_NO like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotLike(String value) {
            addCriterion("ORG_NO not like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<String> values) {
            addCriterion("ORG_NO in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<String> values) {
            addCriterion("ORG_NO not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(String value1, String value2) {
            addCriterion("ORG_NO between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(String value1, String value2) {
            addCriterion("ORG_NO not between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andCreateYearIsNull() {
            addCriterion("CREATE_YEAR is null");
            return (Criteria) this;
        }

        public Criteria andCreateYearIsNotNull() {
            addCriterion("CREATE_YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andCreateYearEqualTo(String value) {
            addCriterion("CREATE_YEAR =", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearNotEqualTo(String value) {
            addCriterion("CREATE_YEAR <>", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearGreaterThan(String value) {
            addCriterion("CREATE_YEAR >", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_YEAR >=", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearLessThan(String value) {
            addCriterion("CREATE_YEAR <", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearLessThanOrEqualTo(String value) {
            addCriterion("CREATE_YEAR <=", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearLike(String value) {
            addCriterion("CREATE_YEAR like", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearNotLike(String value) {
            addCriterion("CREATE_YEAR not like", value, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearIn(List<String> values) {
            addCriterion("CREATE_YEAR in", values, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearNotIn(List<String> values) {
            addCriterion("CREATE_YEAR not in", values, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearBetween(String value1, String value2) {
            addCriterion("CREATE_YEAR between", value1, value2, "createYear");
            return (Criteria) this;
        }

        public Criteria andCreateYearNotBetween(String value1, String value2) {
            addCriterion("CREATE_YEAR not between", value1, value2, "createYear");
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

        public Criteria andRegNoIsNull() {
            addCriterion("REG_NO is null");
            return (Criteria) this;
        }

        public Criteria andRegNoIsNotNull() {
            addCriterion("REG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andRegNoEqualTo(String value) {
            addCriterion("REG_NO =", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotEqualTo(String value) {
            addCriterion("REG_NO <>", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoGreaterThan(String value) {
            addCriterion("REG_NO >", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoGreaterThanOrEqualTo(String value) {
            addCriterion("REG_NO >=", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLessThan(String value) {
            addCriterion("REG_NO <", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLessThanOrEqualTo(String value) {
            addCriterion("REG_NO <=", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoLike(String value) {
            addCriterion("REG_NO like", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotLike(String value) {
            addCriterion("REG_NO not like", value, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoIn(List<String> values) {
            addCriterion("REG_NO in", values, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotIn(List<String> values) {
            addCriterion("REG_NO not in", values, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoBetween(String value1, String value2) {
            addCriterion("REG_NO between", value1, value2, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegNoNotBetween(String value1, String value2) {
            addCriterion("REG_NO not between", value1, value2, "regNo");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNull() {
            addCriterion("REG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRegDateIsNotNull() {
            addCriterion("REG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRegDateEqualTo(String value) {
            addCriterion("REG_DATE =", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotEqualTo(String value) {
            addCriterion("REG_DATE <>", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThan(String value) {
            addCriterion("REG_DATE >", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateGreaterThanOrEqualTo(String value) {
            addCriterion("REG_DATE >=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThan(String value) {
            addCriterion("REG_DATE <", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLessThanOrEqualTo(String value) {
            addCriterion("REG_DATE <=", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateLike(String value) {
            addCriterion("REG_DATE like", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotLike(String value) {
            addCriterion("REG_DATE not like", value, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateIn(List<String> values) {
            addCriterion("REG_DATE in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotIn(List<String> values) {
            addCriterion("REG_DATE not in", values, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateBetween(String value1, String value2) {
            addCriterion("REG_DATE between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andRegDateNotBetween(String value1, String value2) {
            addCriterion("REG_DATE not between", value1, value2, "regDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNull() {
            addCriterion("EXP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andExpDateIsNotNull() {
            addCriterion("EXP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andExpDateEqualTo(String value) {
            addCriterion("EXP_DATE =", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotEqualTo(String value) {
            addCriterion("EXP_DATE <>", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThan(String value) {
            addCriterion("EXP_DATE >", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateGreaterThanOrEqualTo(String value) {
            addCriterion("EXP_DATE >=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThan(String value) {
            addCriterion("EXP_DATE <", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLessThanOrEqualTo(String value) {
            addCriterion("EXP_DATE <=", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateLike(String value) {
            addCriterion("EXP_DATE like", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotLike(String value) {
            addCriterion("EXP_DATE not like", value, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateIn(List<String> values) {
            addCriterion("EXP_DATE in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotIn(List<String> values) {
            addCriterion("EXP_DATE not in", values, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateBetween(String value1, String value2) {
            addCriterion("EXP_DATE between", value1, value2, "expDate");
            return (Criteria) this;
        }

        public Criteria andExpDateNotBetween(String value1, String value2) {
            addCriterion("EXP_DATE not between", value1, value2, "expDate");
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

        public Criteria andLandTaxNoIsNull() {
            addCriterion("LAND_TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoIsNotNull() {
            addCriterion("LAND_TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoEqualTo(String value) {
            addCriterion("LAND_TAX_NO =", value, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoNotEqualTo(String value) {
            addCriterion("LAND_TAX_NO <>", value, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoGreaterThan(String value) {
            addCriterion("LAND_TAX_NO >", value, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("LAND_TAX_NO >=", value, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoLessThan(String value) {
            addCriterion("LAND_TAX_NO <", value, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoLessThanOrEqualTo(String value) {
            addCriterion("LAND_TAX_NO <=", value, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoLike(String value) {
            addCriterion("LAND_TAX_NO like", value, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoNotLike(String value) {
            addCriterion("LAND_TAX_NO not like", value, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoIn(List<String> values) {
            addCriterion("LAND_TAX_NO in", values, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoNotIn(List<String> values) {
            addCriterion("LAND_TAX_NO not in", values, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoBetween(String value1, String value2) {
            addCriterion("LAND_TAX_NO between", value1, value2, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andLandTaxNoNotBetween(String value1, String value2) {
            addCriterion("LAND_TAX_NO not between", value1, value2, "landTaxNo");
            return (Criteria) this;
        }

        public Criteria andRegAddrIsNull() {
            addCriterion("REG_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andRegAddrIsNotNull() {
            addCriterion("REG_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andRegAddrEqualTo(String value) {
            addCriterion("REG_ADDR =", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrNotEqualTo(String value) {
            addCriterion("REG_ADDR <>", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrGreaterThan(String value) {
            addCriterion("REG_ADDR >", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrGreaterThanOrEqualTo(String value) {
            addCriterion("REG_ADDR >=", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrLessThan(String value) {
            addCriterion("REG_ADDR <", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrLessThanOrEqualTo(String value) {
            addCriterion("REG_ADDR <=", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrLike(String value) {
            addCriterion("REG_ADDR like", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrNotLike(String value) {
            addCriterion("REG_ADDR not like", value, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrIn(List<String> values) {
            addCriterion("REG_ADDR in", values, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrNotIn(List<String> values) {
            addCriterion("REG_ADDR not in", values, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrBetween(String value1, String value2) {
            addCriterion("REG_ADDR between", value1, value2, "regAddr");
            return (Criteria) this;
        }

        public Criteria andRegAddrNotBetween(String value1, String value2) {
            addCriterion("REG_ADDR not between", value1, value2, "regAddr");
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

        public Criteria andEmployeeQuantityIsNull() {
            addCriterion("EMPLOYEE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityIsNotNull() {
            addCriterion("EMPLOYEE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityEqualTo(BigDecimal value) {
            addCriterion("EMPLOYEE_QUANTITY =", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityNotEqualTo(BigDecimal value) {
            addCriterion("EMPLOYEE_QUANTITY <>", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityGreaterThan(BigDecimal value) {
            addCriterion("EMPLOYEE_QUANTITY >", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPLOYEE_QUANTITY >=", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityLessThan(BigDecimal value) {
            addCriterion("EMPLOYEE_QUANTITY <", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EMPLOYEE_QUANTITY <=", value, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityIn(List<BigDecimal> values) {
            addCriterion("EMPLOYEE_QUANTITY in", values, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityNotIn(List<BigDecimal> values) {
            addCriterion("EMPLOYEE_QUANTITY not in", values, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPLOYEE_QUANTITY between", value1, value2, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andEmployeeQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EMPLOYEE_QUANTITY not between", value1, value2, "employeeQuantity");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("REGION =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("REGION <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("REGION >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("REGION >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("REGION <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("REGION <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("REGION like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("REGION not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("REGION in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("REGION not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("REGION between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("REGION not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andQualityIsNull() {
            addCriterion("QUALITY is null");
            return (Criteria) this;
        }

        public Criteria andQualityIsNotNull() {
            addCriterion("QUALITY is not null");
            return (Criteria) this;
        }

        public Criteria andQualityEqualTo(String value) {
            addCriterion("QUALITY =", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotEqualTo(String value) {
            addCriterion("QUALITY <>", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThan(String value) {
            addCriterion("QUALITY >", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityGreaterThanOrEqualTo(String value) {
            addCriterion("QUALITY >=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThan(String value) {
            addCriterion("QUALITY <", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLessThanOrEqualTo(String value) {
            addCriterion("QUALITY <=", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityLike(String value) {
            addCriterion("QUALITY like", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotLike(String value) {
            addCriterion("QUALITY not like", value, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityIn(List<String> values) {
            addCriterion("QUALITY in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotIn(List<String> values) {
            addCriterion("QUALITY not in", values, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityBetween(String value1, String value2) {
            addCriterion("QUALITY between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andQualityNotBetween(String value1, String value2) {
            addCriterion("QUALITY not between", value1, value2, "quality");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
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

        public Criteria andMainProductIsNull() {
            addCriterion("MAIN_PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andMainProductIsNotNull() {
            addCriterion("MAIN_PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andMainProductEqualTo(String value) {
            addCriterion("MAIN_PRODUCT =", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductNotEqualTo(String value) {
            addCriterion("MAIN_PRODUCT <>", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductGreaterThan(String value) {
            addCriterion("MAIN_PRODUCT >", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_PRODUCT >=", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductLessThan(String value) {
            addCriterion("MAIN_PRODUCT <", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductLessThanOrEqualTo(String value) {
            addCriterion("MAIN_PRODUCT <=", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductLike(String value) {
            addCriterion("MAIN_PRODUCT like", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductNotLike(String value) {
            addCriterion("MAIN_PRODUCT not like", value, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductIn(List<String> values) {
            addCriterion("MAIN_PRODUCT in", values, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductNotIn(List<String> values) {
            addCriterion("MAIN_PRODUCT not in", values, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductBetween(String value1, String value2) {
            addCriterion("MAIN_PRODUCT between", value1, value2, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andMainProductNotBetween(String value1, String value2) {
            addCriterion("MAIN_PRODUCT not between", value1, value2, "mainProduct");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(BigDecimal value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(BigDecimal value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(BigDecimal value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(BigDecimal value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<BigDecimal> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<BigDecimal> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AREA not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andOwnershipIsNull() {
            addCriterion("OWNERSHIP is null");
            return (Criteria) this;
        }

        public Criteria andOwnershipIsNotNull() {
            addCriterion("OWNERSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andOwnershipEqualTo(String value) {
            addCriterion("OWNERSHIP =", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotEqualTo(String value) {
            addCriterion("OWNERSHIP <>", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipGreaterThan(String value) {
            addCriterion("OWNERSHIP >", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipGreaterThanOrEqualTo(String value) {
            addCriterion("OWNERSHIP >=", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLessThan(String value) {
            addCriterion("OWNERSHIP <", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLessThanOrEqualTo(String value) {
            addCriterion("OWNERSHIP <=", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipLike(String value) {
            addCriterion("OWNERSHIP like", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotLike(String value) {
            addCriterion("OWNERSHIP not like", value, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipIn(List<String> values) {
            addCriterion("OWNERSHIP in", values, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotIn(List<String> values) {
            addCriterion("OWNERSHIP not in", values, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipBetween(String value1, String value2) {
            addCriterion("OWNERSHIP between", value1, value2, "ownership");
            return (Criteria) this;
        }

        public Criteria andOwnershipNotBetween(String value1, String value2) {
            addCriterion("OWNERSHIP not between", value1, value2, "ownership");
            return (Criteria) this;
        }

        public Criteria andContNameIsNull() {
            addCriterion("CONT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andContNameIsNotNull() {
            addCriterion("CONT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andContNameEqualTo(String value) {
            addCriterion("CONT_NAME =", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotEqualTo(String value) {
            addCriterion("CONT_NAME <>", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThan(String value) {
            addCriterion("CONT_NAME >", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_NAME >=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThan(String value) {
            addCriterion("CONT_NAME <", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLessThanOrEqualTo(String value) {
            addCriterion("CONT_NAME <=", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameLike(String value) {
            addCriterion("CONT_NAME like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotLike(String value) {
            addCriterion("CONT_NAME not like", value, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameIn(List<String> values) {
            addCriterion("CONT_NAME in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotIn(List<String> values) {
            addCriterion("CONT_NAME not in", values, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameBetween(String value1, String value2) {
            addCriterion("CONT_NAME between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContNameNotBetween(String value1, String value2) {
            addCriterion("CONT_NAME not between", value1, value2, "contName");
            return (Criteria) this;
        }

        public Criteria andContTelIsNull() {
            addCriterion("CONT_TEL is null");
            return (Criteria) this;
        }

        public Criteria andContTelIsNotNull() {
            addCriterion("CONT_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andContTelEqualTo(String value) {
            addCriterion("CONT_TEL =", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotEqualTo(String value) {
            addCriterion("CONT_TEL <>", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelGreaterThan(String value) {
            addCriterion("CONT_TEL >", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_TEL >=", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLessThan(String value) {
            addCriterion("CONT_TEL <", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLessThanOrEqualTo(String value) {
            addCriterion("CONT_TEL <=", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelLike(String value) {
            addCriterion("CONT_TEL like", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotLike(String value) {
            addCriterion("CONT_TEL not like", value, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelIn(List<String> values) {
            addCriterion("CONT_TEL in", values, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotIn(List<String> values) {
            addCriterion("CONT_TEL not in", values, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelBetween(String value1, String value2) {
            addCriterion("CONT_TEL between", value1, value2, "contTel");
            return (Criteria) this;
        }

        public Criteria andContTelNotBetween(String value1, String value2) {
            addCriterion("CONT_TEL not between", value1, value2, "contTel");
            return (Criteria) this;
        }

        public Criteria andContFaxIsNull() {
            addCriterion("CONT_FAX is null");
            return (Criteria) this;
        }

        public Criteria andContFaxIsNotNull() {
            addCriterion("CONT_FAX is not null");
            return (Criteria) this;
        }

        public Criteria andContFaxEqualTo(String value) {
            addCriterion("CONT_FAX =", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxNotEqualTo(String value) {
            addCriterion("CONT_FAX <>", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxGreaterThan(String value) {
            addCriterion("CONT_FAX >", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_FAX >=", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxLessThan(String value) {
            addCriterion("CONT_FAX <", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxLessThanOrEqualTo(String value) {
            addCriterion("CONT_FAX <=", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxLike(String value) {
            addCriterion("CONT_FAX like", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxNotLike(String value) {
            addCriterion("CONT_FAX not like", value, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxIn(List<String> values) {
            addCriterion("CONT_FAX in", values, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxNotIn(List<String> values) {
            addCriterion("CONT_FAX not in", values, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxBetween(String value1, String value2) {
            addCriterion("CONT_FAX between", value1, value2, "contFax");
            return (Criteria) this;
        }

        public Criteria andContFaxNotBetween(String value1, String value2) {
            addCriterion("CONT_FAX not between", value1, value2, "contFax");
            return (Criteria) this;
        }

        public Criteria andContEmailIsNull() {
            addCriterion("CONT_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andContEmailIsNotNull() {
            addCriterion("CONT_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andContEmailEqualTo(String value) {
            addCriterion("CONT_EMAIL =", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotEqualTo(String value) {
            addCriterion("CONT_EMAIL <>", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailGreaterThan(String value) {
            addCriterion("CONT_EMAIL >", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_EMAIL >=", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLessThan(String value) {
            addCriterion("CONT_EMAIL <", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLessThanOrEqualTo(String value) {
            addCriterion("CONT_EMAIL <=", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailLike(String value) {
            addCriterion("CONT_EMAIL like", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotLike(String value) {
            addCriterion("CONT_EMAIL not like", value, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailIn(List<String> values) {
            addCriterion("CONT_EMAIL in", values, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotIn(List<String> values) {
            addCriterion("CONT_EMAIL not in", values, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailBetween(String value1, String value2) {
            addCriterion("CONT_EMAIL between", value1, value2, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContEmailNotBetween(String value1, String value2) {
            addCriterion("CONT_EMAIL not between", value1, value2, "contEmail");
            return (Criteria) this;
        }

        public Criteria andContContryIsNull() {
            addCriterion("CONT_CONTRY is null");
            return (Criteria) this;
        }

        public Criteria andContContryIsNotNull() {
            addCriterion("CONT_CONTRY is not null");
            return (Criteria) this;
        }

        public Criteria andContContryEqualTo(String value) {
            addCriterion("CONT_CONTRY =", value, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryNotEqualTo(String value) {
            addCriterion("CONT_CONTRY <>", value, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryGreaterThan(String value) {
            addCriterion("CONT_CONTRY >", value, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_CONTRY >=", value, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryLessThan(String value) {
            addCriterion("CONT_CONTRY <", value, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryLessThanOrEqualTo(String value) {
            addCriterion("CONT_CONTRY <=", value, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryLike(String value) {
            addCriterion("CONT_CONTRY like", value, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryNotLike(String value) {
            addCriterion("CONT_CONTRY not like", value, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryIn(List<String> values) {
            addCriterion("CONT_CONTRY in", values, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryNotIn(List<String> values) {
            addCriterion("CONT_CONTRY not in", values, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryBetween(String value1, String value2) {
            addCriterion("CONT_CONTRY between", value1, value2, "contContry");
            return (Criteria) this;
        }

        public Criteria andContContryNotBetween(String value1, String value2) {
            addCriterion("CONT_CONTRY not between", value1, value2, "contContry");
            return (Criteria) this;
        }

        public Criteria andContProvinceIsNull() {
            addCriterion("CONT_PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andContProvinceIsNotNull() {
            addCriterion("CONT_PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andContProvinceEqualTo(String value) {
            addCriterion("CONT_PROVINCE =", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceNotEqualTo(String value) {
            addCriterion("CONT_PROVINCE <>", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceGreaterThan(String value) {
            addCriterion("CONT_PROVINCE >", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_PROVINCE >=", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceLessThan(String value) {
            addCriterion("CONT_PROVINCE <", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceLessThanOrEqualTo(String value) {
            addCriterion("CONT_PROVINCE <=", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceLike(String value) {
            addCriterion("CONT_PROVINCE like", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceNotLike(String value) {
            addCriterion("CONT_PROVINCE not like", value, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceIn(List<String> values) {
            addCriterion("CONT_PROVINCE in", values, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceNotIn(List<String> values) {
            addCriterion("CONT_PROVINCE not in", values, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceBetween(String value1, String value2) {
            addCriterion("CONT_PROVINCE between", value1, value2, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContProvinceNotBetween(String value1, String value2) {
            addCriterion("CONT_PROVINCE not between", value1, value2, "contProvince");
            return (Criteria) this;
        }

        public Criteria andContCityIsNull() {
            addCriterion("CONT_CITY is null");
            return (Criteria) this;
        }

        public Criteria andContCityIsNotNull() {
            addCriterion("CONT_CITY is not null");
            return (Criteria) this;
        }

        public Criteria andContCityEqualTo(String value) {
            addCriterion("CONT_CITY =", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityNotEqualTo(String value) {
            addCriterion("CONT_CITY <>", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityGreaterThan(String value) {
            addCriterion("CONT_CITY >", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_CITY >=", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityLessThan(String value) {
            addCriterion("CONT_CITY <", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityLessThanOrEqualTo(String value) {
            addCriterion("CONT_CITY <=", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityLike(String value) {
            addCriterion("CONT_CITY like", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityNotLike(String value) {
            addCriterion("CONT_CITY not like", value, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityIn(List<String> values) {
            addCriterion("CONT_CITY in", values, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityNotIn(List<String> values) {
            addCriterion("CONT_CITY not in", values, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityBetween(String value1, String value2) {
            addCriterion("CONT_CITY between", value1, value2, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCityNotBetween(String value1, String value2) {
            addCriterion("CONT_CITY not between", value1, value2, "contCity");
            return (Criteria) this;
        }

        public Criteria andContCountyIsNull() {
            addCriterion("CONT_COUNTY is null");
            return (Criteria) this;
        }

        public Criteria andContCountyIsNotNull() {
            addCriterion("CONT_COUNTY is not null");
            return (Criteria) this;
        }

        public Criteria andContCountyEqualTo(String value) {
            addCriterion("CONT_COUNTY =", value, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyNotEqualTo(String value) {
            addCriterion("CONT_COUNTY <>", value, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyGreaterThan(String value) {
            addCriterion("CONT_COUNTY >", value, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_COUNTY >=", value, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyLessThan(String value) {
            addCriterion("CONT_COUNTY <", value, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyLessThanOrEqualTo(String value) {
            addCriterion("CONT_COUNTY <=", value, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyLike(String value) {
            addCriterion("CONT_COUNTY like", value, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyNotLike(String value) {
            addCriterion("CONT_COUNTY not like", value, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyIn(List<String> values) {
            addCriterion("CONT_COUNTY in", values, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyNotIn(List<String> values) {
            addCriterion("CONT_COUNTY not in", values, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyBetween(String value1, String value2) {
            addCriterion("CONT_COUNTY between", value1, value2, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContCountyNotBetween(String value1, String value2) {
            addCriterion("CONT_COUNTY not between", value1, value2, "contCounty");
            return (Criteria) this;
        }

        public Criteria andContAddrIsNull() {
            addCriterion("CONT_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andContAddrIsNotNull() {
            addCriterion("CONT_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andContAddrEqualTo(String value) {
            addCriterion("CONT_ADDR =", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrNotEqualTo(String value) {
            addCriterion("CONT_ADDR <>", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrGreaterThan(String value) {
            addCriterion("CONT_ADDR >", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_ADDR >=", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrLessThan(String value) {
            addCriterion("CONT_ADDR <", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrLessThanOrEqualTo(String value) {
            addCriterion("CONT_ADDR <=", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrLike(String value) {
            addCriterion("CONT_ADDR like", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrNotLike(String value) {
            addCriterion("CONT_ADDR not like", value, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrIn(List<String> values) {
            addCriterion("CONT_ADDR in", values, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrNotIn(List<String> values) {
            addCriterion("CONT_ADDR not in", values, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrBetween(String value1, String value2) {
            addCriterion("CONT_ADDR between", value1, value2, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContAddrNotBetween(String value1, String value2) {
            addCriterion("CONT_ADDR not between", value1, value2, "contAddr");
            return (Criteria) this;
        }

        public Criteria andContZipIsNull() {
            addCriterion("CONT_ZIP is null");
            return (Criteria) this;
        }

        public Criteria andContZipIsNotNull() {
            addCriterion("CONT_ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andContZipEqualTo(String value) {
            addCriterion("CONT_ZIP =", value, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipNotEqualTo(String value) {
            addCriterion("CONT_ZIP <>", value, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipGreaterThan(String value) {
            addCriterion("CONT_ZIP >", value, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipGreaterThanOrEqualTo(String value) {
            addCriterion("CONT_ZIP >=", value, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipLessThan(String value) {
            addCriterion("CONT_ZIP <", value, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipLessThanOrEqualTo(String value) {
            addCriterion("CONT_ZIP <=", value, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipLike(String value) {
            addCriterion("CONT_ZIP like", value, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipNotLike(String value) {
            addCriterion("CONT_ZIP not like", value, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipIn(List<String> values) {
            addCriterion("CONT_ZIP in", values, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipNotIn(List<String> values) {
            addCriterion("CONT_ZIP not in", values, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipBetween(String value1, String value2) {
            addCriterion("CONT_ZIP between", value1, value2, "contZip");
            return (Criteria) this;
        }

        public Criteria andContZipNotBetween(String value1, String value2) {
            addCriterion("CONT_ZIP not between", value1, value2, "contZip");
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

        public Criteria andBrNoIsNull() {
            addCriterion("BR_NO is null");
            return (Criteria) this;
        }

        public Criteria andBrNoIsNotNull() {
            addCriterion("BR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBrNoEqualTo(String value) {
            addCriterion("BR_NO =", value, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoNotEqualTo(String value) {
            addCriterion("BR_NO <>", value, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoGreaterThan(String value) {
            addCriterion("BR_NO >", value, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoGreaterThanOrEqualTo(String value) {
            addCriterion("BR_NO >=", value, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoLessThan(String value) {
            addCriterion("BR_NO <", value, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoLessThanOrEqualTo(String value) {
            addCriterion("BR_NO <=", value, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoLike(String value) {
            addCriterion("BR_NO like", value, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoNotLike(String value) {
            addCriterion("BR_NO not like", value, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoIn(List<String> values) {
            addCriterion("BR_NO in", values, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoNotIn(List<String> values) {
            addCriterion("BR_NO not in", values, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoBetween(String value1, String value2) {
            addCriterion("BR_NO between", value1, value2, "brNo");
            return (Criteria) this;
        }

        public Criteria andBrNoNotBetween(String value1, String value2) {
            addCriterion("BR_NO not between", value1, value2, "brNo");
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