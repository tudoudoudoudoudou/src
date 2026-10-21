package com.gingkoo.rpt.dbsvr.server.bean;

import java.util.ArrayList;
import java.util.List;

public class TbSysStatExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSysStatExample() {
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

        public Criteria andFalObjCodeIsNull() {
            addCriterion("FAL_OBJ_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeIsNotNull() {
            addCriterion("FAL_OBJ_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeEqualTo(String value) {
            addCriterion("FAL_OBJ_CODE =", value, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeNotEqualTo(String value) {
            addCriterion("FAL_OBJ_CODE <>", value, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeGreaterThan(String value) {
            addCriterion("FAL_OBJ_CODE >", value, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FAL_OBJ_CODE >=", value, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeLessThan(String value) {
            addCriterion("FAL_OBJ_CODE <", value, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeLessThanOrEqualTo(String value) {
            addCriterion("FAL_OBJ_CODE <=", value, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeLike(String value) {
            addCriterion("FAL_OBJ_CODE like", value, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeNotLike(String value) {
            addCriterion("FAL_OBJ_CODE not like", value, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeIn(List<String> values) {
            addCriterion("FAL_OBJ_CODE in", values, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeNotIn(List<String> values) {
            addCriterion("FAL_OBJ_CODE not in", values, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeBetween(String value1, String value2) {
            addCriterion("FAL_OBJ_CODE between", value1, value2, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andFalObjCodeNotBetween(String value1, String value2) {
            addCriterion("FAL_OBJ_CODE not between", value1, value2, "falObjCode");
            return (Criteria) this;
        }

        public Criteria andLastSysDateIsNull() {
            addCriterion("LAST_SYS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastSysDateIsNotNull() {
            addCriterion("LAST_SYS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastSysDateEqualTo(String value) {
            addCriterion("LAST_SYS_DATE =", value, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateNotEqualTo(String value) {
            addCriterion("LAST_SYS_DATE <>", value, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateGreaterThan(String value) {
            addCriterion("LAST_SYS_DATE >", value, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_SYS_DATE >=", value, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateLessThan(String value) {
            addCriterion("LAST_SYS_DATE <", value, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateLessThanOrEqualTo(String value) {
            addCriterion("LAST_SYS_DATE <=", value, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateLike(String value) {
            addCriterion("LAST_SYS_DATE like", value, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateNotLike(String value) {
            addCriterion("LAST_SYS_DATE not like", value, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateIn(List<String> values) {
            addCriterion("LAST_SYS_DATE in", values, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateNotIn(List<String> values) {
            addCriterion("LAST_SYS_DATE not in", values, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateBetween(String value1, String value2) {
            addCriterion("LAST_SYS_DATE between", value1, value2, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andLastSysDateNotBetween(String value1, String value2) {
            addCriterion("LAST_SYS_DATE not between", value1, value2, "lastSysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNull() {
            addCriterion("SYS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNotNull() {
            addCriterion("SYS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSysDateEqualTo(String value) {
            addCriterion("SYS_DATE =", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotEqualTo(String value) {
            addCriterion("SYS_DATE <>", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThan(String value) {
            addCriterion("SYS_DATE >", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_DATE >=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThan(String value) {
            addCriterion("SYS_DATE <", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThanOrEqualTo(String value) {
            addCriterion("SYS_DATE <=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLike(String value) {
            addCriterion("SYS_DATE like", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotLike(String value) {
            addCriterion("SYS_DATE not like", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateIn(List<String> values) {
            addCriterion("SYS_DATE in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotIn(List<String> values) {
            addCriterion("SYS_DATE not in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateBetween(String value1, String value2) {
            addCriterion("SYS_DATE between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotBetween(String value1, String value2) {
            addCriterion("SYS_DATE not between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateIsNull() {
            addCriterion("NEXT_SYS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNextSysDateIsNotNull() {
            addCriterion("NEXT_SYS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNextSysDateEqualTo(String value) {
            addCriterion("NEXT_SYS_DATE =", value, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateNotEqualTo(String value) {
            addCriterion("NEXT_SYS_DATE <>", value, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateGreaterThan(String value) {
            addCriterion("NEXT_SYS_DATE >", value, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_SYS_DATE >=", value, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateLessThan(String value) {
            addCriterion("NEXT_SYS_DATE <", value, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateLessThanOrEqualTo(String value) {
            addCriterion("NEXT_SYS_DATE <=", value, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateLike(String value) {
            addCriterion("NEXT_SYS_DATE like", value, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateNotLike(String value) {
            addCriterion("NEXT_SYS_DATE not like", value, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateIn(List<String> values) {
            addCriterion("NEXT_SYS_DATE in", values, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateNotIn(List<String> values) {
            addCriterion("NEXT_SYS_DATE not in", values, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateBetween(String value1, String value2) {
            addCriterion("NEXT_SYS_DATE between", value1, value2, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andNextSysDateNotBetween(String value1, String value2) {
            addCriterion("NEXT_SYS_DATE not between", value1, value2, "nextSysDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateIsNull() {
            addCriterion("LAST_WORK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateIsNotNull() {
            addCriterion("LAST_WORK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateEqualTo(String value) {
            addCriterion("LAST_WORK_DATE =", value, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateNotEqualTo(String value) {
            addCriterion("LAST_WORK_DATE <>", value, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateGreaterThan(String value) {
            addCriterion("LAST_WORK_DATE >", value, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_WORK_DATE >=", value, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateLessThan(String value) {
            addCriterion("LAST_WORK_DATE <", value, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateLessThanOrEqualTo(String value) {
            addCriterion("LAST_WORK_DATE <=", value, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateLike(String value) {
            addCriterion("LAST_WORK_DATE like", value, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateNotLike(String value) {
            addCriterion("LAST_WORK_DATE not like", value, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateIn(List<String> values) {
            addCriterion("LAST_WORK_DATE in", values, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateNotIn(List<String> values) {
            addCriterion("LAST_WORK_DATE not in", values, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateBetween(String value1, String value2) {
            addCriterion("LAST_WORK_DATE between", value1, value2, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastWorkDateNotBetween(String value1, String value2) {
            addCriterion("LAST_WORK_DATE not between", value1, value2, "lastWorkDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNull() {
            addCriterion("WORK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andWorkDateIsNotNull() {
            addCriterion("WORK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkDateEqualTo(String value) {
            addCriterion("WORK_DATE =", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotEqualTo(String value) {
            addCriterion("WORK_DATE <>", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThan(String value) {
            addCriterion("WORK_DATE >", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_DATE >=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThan(String value) {
            addCriterion("WORK_DATE <", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLessThanOrEqualTo(String value) {
            addCriterion("WORK_DATE <=", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateLike(String value) {
            addCriterion("WORK_DATE like", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotLike(String value) {
            addCriterion("WORK_DATE not like", value, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateIn(List<String> values) {
            addCriterion("WORK_DATE in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotIn(List<String> values) {
            addCriterion("WORK_DATE not in", values, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateBetween(String value1, String value2) {
            addCriterion("WORK_DATE between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andWorkDateNotBetween(String value1, String value2) {
            addCriterion("WORK_DATE not between", value1, value2, "workDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateIsNull() {
            addCriterion("NEXT_WORK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateIsNotNull() {
            addCriterion("NEXT_WORK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateEqualTo(String value) {
            addCriterion("NEXT_WORK_DATE =", value, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateNotEqualTo(String value) {
            addCriterion("NEXT_WORK_DATE <>", value, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateGreaterThan(String value) {
            addCriterion("NEXT_WORK_DATE >", value, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_WORK_DATE >=", value, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateLessThan(String value) {
            addCriterion("NEXT_WORK_DATE <", value, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateLessThanOrEqualTo(String value) {
            addCriterion("NEXT_WORK_DATE <=", value, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateLike(String value) {
            addCriterion("NEXT_WORK_DATE like", value, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateNotLike(String value) {
            addCriterion("NEXT_WORK_DATE not like", value, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateIn(List<String> values) {
            addCriterion("NEXT_WORK_DATE in", values, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateNotIn(List<String> values) {
            addCriterion("NEXT_WORK_DATE not in", values, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateBetween(String value1, String value2) {
            addCriterion("NEXT_WORK_DATE between", value1, value2, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andNextWorkDateNotBetween(String value1, String value2) {
            addCriterion("NEXT_WORK_DATE not between", value1, value2, "nextWorkDate");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthIsNull() {
            addCriterion("LAST_FAL_BUOC_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthIsNotNull() {
            addCriterion("LAST_FAL_BUOC_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthEqualTo(String value) {
            addCriterion("LAST_FAL_BUOC_MONTH =", value, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthNotEqualTo(String value) {
            addCriterion("LAST_FAL_BUOC_MONTH <>", value, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthGreaterThan(String value) {
            addCriterion("LAST_FAL_BUOC_MONTH >", value, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_FAL_BUOC_MONTH >=", value, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthLessThan(String value) {
            addCriterion("LAST_FAL_BUOC_MONTH <", value, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthLessThanOrEqualTo(String value) {
            addCriterion("LAST_FAL_BUOC_MONTH <=", value, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthLike(String value) {
            addCriterion("LAST_FAL_BUOC_MONTH like", value, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthNotLike(String value) {
            addCriterion("LAST_FAL_BUOC_MONTH not like", value, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthIn(List<String> values) {
            addCriterion("LAST_FAL_BUOC_MONTH in", values, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthNotIn(List<String> values) {
            addCriterion("LAST_FAL_BUOC_MONTH not in", values, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthBetween(String value1, String value2) {
            addCriterion("LAST_FAL_BUOC_MONTH between", value1, value2, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andLastFalBuocMonthNotBetween(String value1, String value2) {
            addCriterion("LAST_FAL_BUOC_MONTH not between", value1, value2, "lastFalBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthIsNull() {
            addCriterion("FAL_BUOC_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthIsNotNull() {
            addCriterion("FAL_BUOC_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthEqualTo(String value) {
            addCriterion("FAL_BUOC_MONTH =", value, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthNotEqualTo(String value) {
            addCriterion("FAL_BUOC_MONTH <>", value, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthGreaterThan(String value) {
            addCriterion("FAL_BUOC_MONTH >", value, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthGreaterThanOrEqualTo(String value) {
            addCriterion("FAL_BUOC_MONTH >=", value, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthLessThan(String value) {
            addCriterion("FAL_BUOC_MONTH <", value, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthLessThanOrEqualTo(String value) {
            addCriterion("FAL_BUOC_MONTH <=", value, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthLike(String value) {
            addCriterion("FAL_BUOC_MONTH like", value, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthNotLike(String value) {
            addCriterion("FAL_BUOC_MONTH not like", value, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthIn(List<String> values) {
            addCriterion("FAL_BUOC_MONTH in", values, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthNotIn(List<String> values) {
            addCriterion("FAL_BUOC_MONTH not in", values, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthBetween(String value1, String value2) {
            addCriterion("FAL_BUOC_MONTH between", value1, value2, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andFalBuocMonthNotBetween(String value1, String value2) {
            addCriterion("FAL_BUOC_MONTH not between", value1, value2, "falBuocMonth");
            return (Criteria) this;
        }

        public Criteria andSysStatIsNull() {
            addCriterion("SYS_STAT is null");
            return (Criteria) this;
        }

        public Criteria andSysStatIsNotNull() {
            addCriterion("SYS_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andSysStatEqualTo(String value) {
            addCriterion("SYS_STAT =", value, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatNotEqualTo(String value) {
            addCriterion("SYS_STAT <>", value, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatGreaterThan(String value) {
            addCriterion("SYS_STAT >", value, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_STAT >=", value, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatLessThan(String value) {
            addCriterion("SYS_STAT <", value, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatLessThanOrEqualTo(String value) {
            addCriterion("SYS_STAT <=", value, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatLike(String value) {
            addCriterion("SYS_STAT like", value, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatNotLike(String value) {
            addCriterion("SYS_STAT not like", value, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatIn(List<String> values) {
            addCriterion("SYS_STAT in", values, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatNotIn(List<String> values) {
            addCriterion("SYS_STAT not in", values, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatBetween(String value1, String value2) {
            addCriterion("SYS_STAT between", value1, value2, "sysStat");
            return (Criteria) this;
        }

        public Criteria andSysStatNotBetween(String value1, String value2) {
            addCriterion("SYS_STAT not between", value1, value2, "sysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatIsNull() {
            addCriterion("LAST_SYS_STAT is null");
            return (Criteria) this;
        }

        public Criteria andLastSysStatIsNotNull() {
            addCriterion("LAST_SYS_STAT is not null");
            return (Criteria) this;
        }

        public Criteria andLastSysStatEqualTo(String value) {
            addCriterion("LAST_SYS_STAT =", value, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatNotEqualTo(String value) {
            addCriterion("LAST_SYS_STAT <>", value, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatGreaterThan(String value) {
            addCriterion("LAST_SYS_STAT >", value, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_SYS_STAT >=", value, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatLessThan(String value) {
            addCriterion("LAST_SYS_STAT <", value, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatLessThanOrEqualTo(String value) {
            addCriterion("LAST_SYS_STAT <=", value, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatLike(String value) {
            addCriterion("LAST_SYS_STAT like", value, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatNotLike(String value) {
            addCriterion("LAST_SYS_STAT not like", value, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatIn(List<String> values) {
            addCriterion("LAST_SYS_STAT in", values, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatNotIn(List<String> values) {
            addCriterion("LAST_SYS_STAT not in", values, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatBetween(String value1, String value2) {
            addCriterion("LAST_SYS_STAT between", value1, value2, "lastSysStat");
            return (Criteria) this;
        }

        public Criteria andLastSysStatNotBetween(String value1, String value2) {
            addCriterion("LAST_SYS_STAT not between", value1, value2, "lastSysStat");
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

        public Criteria andDepartIdIsNull() {
            addCriterion("DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("DEPART_ID =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("DEPART_ID <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("DEPART_ID >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("DEPART_ID >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("DEPART_ID <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("DEPART_ID <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("DEPART_ID like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("DEPART_ID not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("DEPART_ID in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("DEPART_ID not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("DEPART_ID between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("DEPART_ID not between", value1, value2, "departId");
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