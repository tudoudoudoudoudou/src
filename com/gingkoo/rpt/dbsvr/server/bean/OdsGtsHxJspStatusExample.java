package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OdsGtsHxJspStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsGtsHxJspStatusExample() {
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

        public Criteria andNsrsbhIsNull() {
            addCriterion("NSRSBH is null");
            return (Criteria) this;
        }

        public Criteria andNsrsbhIsNotNull() {
            addCriterion("NSRSBH is not null");
            return (Criteria) this;
        }

        public Criteria andNsrsbhEqualTo(String value) {
            addCriterion("NSRSBH =", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotEqualTo(String value) {
            addCriterion("NSRSBH <>", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhGreaterThan(String value) {
            addCriterion("NSRSBH >", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhGreaterThanOrEqualTo(String value) {
            addCriterion("NSRSBH >=", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhLessThan(String value) {
            addCriterion("NSRSBH <", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhLessThanOrEqualTo(String value) {
            addCriterion("NSRSBH <=", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhLike(String value) {
            addCriterion("NSRSBH like", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotLike(String value) {
            addCriterion("NSRSBH not like", value, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhIn(List<String> values) {
            addCriterion("NSRSBH in", values, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotIn(List<String> values) {
            addCriterion("NSRSBH not in", values, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhBetween(String value1, String value2) {
            addCriterion("NSRSBH between", value1, value2, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andNsrsbhNotBetween(String value1, String value2) {
            addCriterion("NSRSBH not between", value1, value2, "nsrsbh");
            return (Criteria) this;
        }

        public Criteria andBkpjlxIsNull() {
            addCriterion("BKPJLX is null");
            return (Criteria) this;
        }

        public Criteria andBkpjlxIsNotNull() {
            addCriterion("BKPJLX is not null");
            return (Criteria) this;
        }

        public Criteria andBkpjlxEqualTo(String value) {
            addCriterion("BKPJLX =", value, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxNotEqualTo(String value) {
            addCriterion("BKPJLX <>", value, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxGreaterThan(String value) {
            addCriterion("BKPJLX >", value, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxGreaterThanOrEqualTo(String value) {
            addCriterion("BKPJLX >=", value, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxLessThan(String value) {
            addCriterion("BKPJLX <", value, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxLessThanOrEqualTo(String value) {
            addCriterion("BKPJLX <=", value, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxLike(String value) {
            addCriterion("BKPJLX like", value, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxNotLike(String value) {
            addCriterion("BKPJLX not like", value, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxIn(List<String> values) {
            addCriterion("BKPJLX in", values, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxNotIn(List<String> values) {
            addCriterion("BKPJLX not in", values, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxBetween(String value1, String value2) {
            addCriterion("BKPJLX between", value1, value2, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andBkpjlxNotBetween(String value1, String value2) {
            addCriterion("BKPJLX not between", value1, value2, "bkpjlx");
            return (Criteria) this;
        }

        public Criteria andFkpjsmIsNull() {
            addCriterion("FKPJSM is null");
            return (Criteria) this;
        }

        public Criteria andFkpjsmIsNotNull() {
            addCriterion("FKPJSM is not null");
            return (Criteria) this;
        }

        public Criteria andFkpjsmEqualTo(String value) {
            addCriterion("FKPJSM =", value, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmNotEqualTo(String value) {
            addCriterion("FKPJSM <>", value, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmGreaterThan(String value) {
            addCriterion("FKPJSM >", value, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmGreaterThanOrEqualTo(String value) {
            addCriterion("FKPJSM >=", value, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmLessThan(String value) {
            addCriterion("FKPJSM <", value, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmLessThanOrEqualTo(String value) {
            addCriterion("FKPJSM <=", value, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmLike(String value) {
            addCriterion("FKPJSM like", value, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmNotLike(String value) {
            addCriterion("FKPJSM not like", value, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmIn(List<String> values) {
            addCriterion("FKPJSM in", values, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmNotIn(List<String> values) {
            addCriterion("FKPJSM not in", values, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmBetween(String value1, String value2) {
            addCriterion("FKPJSM between", value1, value2, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andFkpjsmNotBetween(String value1, String value2) {
            addCriterion("FKPJSM not between", value1, value2, "fkpjsm");
            return (Criteria) this;
        }

        public Criteria andKpdhIsNull() {
            addCriterion("KPDH is null");
            return (Criteria) this;
        }

        public Criteria andKpdhIsNotNull() {
            addCriterion("KPDH is not null");
            return (Criteria) this;
        }

        public Criteria andKpdhEqualTo(String value) {
            addCriterion("KPDH =", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhNotEqualTo(String value) {
            addCriterion("KPDH <>", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhGreaterThan(String value) {
            addCriterion("KPDH >", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhGreaterThanOrEqualTo(String value) {
            addCriterion("KPDH >=", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhLessThan(String value) {
            addCriterion("KPDH <", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhLessThanOrEqualTo(String value) {
            addCriterion("KPDH <=", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhLike(String value) {
            addCriterion("KPDH like", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhNotLike(String value) {
            addCriterion("KPDH not like", value, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhIn(List<String> values) {
            addCriterion("KPDH in", values, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhNotIn(List<String> values) {
            addCriterion("KPDH not in", values, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhBetween(String value1, String value2) {
            addCriterion("KPDH between", value1, value2, "kpdh");
            return (Criteria) this;
        }

        public Criteria andKpdhNotBetween(String value1, String value2) {
            addCriterion("KPDH not between", value1, value2, "kpdh");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqIsNull() {
            addCriterion("JSSBDQRQ is null");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqIsNotNull() {
            addCriterion("JSSBDQRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqEqualTo(String value) {
            addCriterion("JSSBDQRQ =", value, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqNotEqualTo(String value) {
            addCriterion("JSSBDQRQ <>", value, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqGreaterThan(String value) {
            addCriterion("JSSBDQRQ >", value, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqGreaterThanOrEqualTo(String value) {
            addCriterion("JSSBDQRQ >=", value, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqLessThan(String value) {
            addCriterion("JSSBDQRQ <", value, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqLessThanOrEqualTo(String value) {
            addCriterion("JSSBDQRQ <=", value, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqLike(String value) {
            addCriterion("JSSBDQRQ like", value, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqNotLike(String value) {
            addCriterion("JSSBDQRQ not like", value, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqIn(List<String> values) {
            addCriterion("JSSBDQRQ in", values, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqNotIn(List<String> values) {
            addCriterion("JSSBDQRQ not in", values, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqBetween(String value1, String value2) {
            addCriterion("JSSBDQRQ between", value1, value2, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andJssbdqrqNotBetween(String value1, String value2) {
            addCriterion("JSSBDQRQ not between", value1, value2, "jssbdqrq");
            return (Criteria) this;
        }

        public Criteria andFpsfywIsNull() {
            addCriterion("FPSFYW is null");
            return (Criteria) this;
        }

        public Criteria andFpsfywIsNotNull() {
            addCriterion("FPSFYW is not null");
            return (Criteria) this;
        }

        public Criteria andFpsfywEqualTo(String value) {
            addCriterion("FPSFYW =", value, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywNotEqualTo(String value) {
            addCriterion("FPSFYW <>", value, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywGreaterThan(String value) {
            addCriterion("FPSFYW >", value, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywGreaterThanOrEqualTo(String value) {
            addCriterion("FPSFYW >=", value, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywLessThan(String value) {
            addCriterion("FPSFYW <", value, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywLessThanOrEqualTo(String value) {
            addCriterion("FPSFYW <=", value, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywLike(String value) {
            addCriterion("FPSFYW like", value, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywNotLike(String value) {
            addCriterion("FPSFYW not like", value, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywIn(List<String> values) {
            addCriterion("FPSFYW in", values, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywNotIn(List<String> values) {
            addCriterion("FPSFYW not in", values, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywBetween(String value1, String value2) {
            addCriterion("FPSFYW between", value1, value2, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andFpsfywNotBetween(String value1, String value2) {
            addCriterion("FPSFYW not between", value1, value2, "fpsfyw");
            return (Criteria) this;
        }

        public Criteria andScjzrqIsNull() {
            addCriterion("SCJZRQ is null");
            return (Criteria) this;
        }

        public Criteria andScjzrqIsNotNull() {
            addCriterion("SCJZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andScjzrqEqualTo(String value) {
            addCriterion("SCJZRQ =", value, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqNotEqualTo(String value) {
            addCriterion("SCJZRQ <>", value, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqGreaterThan(String value) {
            addCriterion("SCJZRQ >", value, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqGreaterThanOrEqualTo(String value) {
            addCriterion("SCJZRQ >=", value, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqLessThan(String value) {
            addCriterion("SCJZRQ <", value, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqLessThanOrEqualTo(String value) {
            addCriterion("SCJZRQ <=", value, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqLike(String value) {
            addCriterion("SCJZRQ like", value, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqNotLike(String value) {
            addCriterion("SCJZRQ not like", value, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqIn(List<String> values) {
            addCriterion("SCJZRQ in", values, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqNotIn(List<String> values) {
            addCriterion("SCJZRQ not in", values, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqBetween(String value1, String value2) {
            addCriterion("SCJZRQ between", value1, value2, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andScjzrqNotBetween(String value1, String value2) {
            addCriterion("SCJZRQ not between", value1, value2, "scjzrq");
            return (Criteria) this;
        }

        public Criteria andLxsxIsNull() {
            addCriterion("LXSX is null");
            return (Criteria) this;
        }

        public Criteria andLxsxIsNotNull() {
            addCriterion("LXSX is not null");
            return (Criteria) this;
        }

        public Criteria andLxsxEqualTo(String value) {
            addCriterion("LXSX =", value, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxNotEqualTo(String value) {
            addCriterion("LXSX <>", value, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxGreaterThan(String value) {
            addCriterion("LXSX >", value, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxGreaterThanOrEqualTo(String value) {
            addCriterion("LXSX >=", value, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxLessThan(String value) {
            addCriterion("LXSX <", value, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxLessThanOrEqualTo(String value) {
            addCriterion("LXSX <=", value, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxLike(String value) {
            addCriterion("LXSX like", value, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxNotLike(String value) {
            addCriterion("LXSX not like", value, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxIn(List<String> values) {
            addCriterion("LXSX in", values, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxNotIn(List<String> values) {
            addCriterion("LXSX not in", values, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxBetween(String value1, String value2) {
            addCriterion("LXSX between", value1, value2, "lxsx");
            return (Criteria) this;
        }

        public Criteria andLxsxNotBetween(String value1, String value2) {
            addCriterion("LXSX not between", value1, value2, "lxsx");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhIsNull() {
            addCriterion("QDCXBBH is null");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhIsNotNull() {
            addCriterion("QDCXBBH is not null");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhEqualTo(String value) {
            addCriterion("QDCXBBH =", value, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhNotEqualTo(String value) {
            addCriterion("QDCXBBH <>", value, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhGreaterThan(String value) {
            addCriterion("QDCXBBH >", value, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhGreaterThanOrEqualTo(String value) {
            addCriterion("QDCXBBH >=", value, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhLessThan(String value) {
            addCriterion("QDCXBBH <", value, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhLessThanOrEqualTo(String value) {
            addCriterion("QDCXBBH <=", value, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhLike(String value) {
            addCriterion("QDCXBBH like", value, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhNotLike(String value) {
            addCriterion("QDCXBBH not like", value, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhIn(List<String> values) {
            addCriterion("QDCXBBH in", values, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhNotIn(List<String> values) {
            addCriterion("QDCXBBH not in", values, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhBetween(String value1, String value2) {
            addCriterion("QDCXBBH between", value1, value2, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andQdcxbbhNotBetween(String value1, String value2) {
            addCriterion("QDCXBBH not between", value1, value2, "qdcxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhIsNull() {
            addCriterion("DCCXBBH is null");
            return (Criteria) this;
        }

        public Criteria andDccxbbhIsNotNull() {
            addCriterion("DCCXBBH is not null");
            return (Criteria) this;
        }

        public Criteria andDccxbbhEqualTo(String value) {
            addCriterion("DCCXBBH =", value, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhNotEqualTo(String value) {
            addCriterion("DCCXBBH <>", value, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhGreaterThan(String value) {
            addCriterion("DCCXBBH >", value, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhGreaterThanOrEqualTo(String value) {
            addCriterion("DCCXBBH >=", value, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhLessThan(String value) {
            addCriterion("DCCXBBH <", value, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhLessThanOrEqualTo(String value) {
            addCriterion("DCCXBBH <=", value, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhLike(String value) {
            addCriterion("DCCXBBH like", value, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhNotLike(String value) {
            addCriterion("DCCXBBH not like", value, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhIn(List<String> values) {
            addCriterion("DCCXBBH in", values, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhNotIn(List<String> values) {
            addCriterion("DCCXBBH not in", values, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhBetween(String value1, String value2) {
            addCriterion("DCCXBBH between", value1, value2, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andDccxbbhNotBetween(String value1, String value2) {
            addCriterion("DCCXBBH not between", value1, value2, "dccxbbh");
            return (Criteria) this;
        }

        public Criteria andJspbhIsNull() {
            addCriterion("JSPBH is null");
            return (Criteria) this;
        }

        public Criteria andJspbhIsNotNull() {
            addCriterion("JSPBH is not null");
            return (Criteria) this;
        }

        public Criteria andJspbhEqualTo(String value) {
            addCriterion("JSPBH =", value, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhNotEqualTo(String value) {
            addCriterion("JSPBH <>", value, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhGreaterThan(String value) {
            addCriterion("JSPBH >", value, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhGreaterThanOrEqualTo(String value) {
            addCriterion("JSPBH >=", value, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhLessThan(String value) {
            addCriterion("JSPBH <", value, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhLessThanOrEqualTo(String value) {
            addCriterion("JSPBH <=", value, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhLike(String value) {
            addCriterion("JSPBH like", value, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhNotLike(String value) {
            addCriterion("JSPBH not like", value, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhIn(List<String> values) {
            addCriterion("JSPBH in", values, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhNotIn(List<String> values) {
            addCriterion("JSPBH not in", values, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhBetween(String value1, String value2) {
            addCriterion("JSPBH between", value1, value2, "jspbh");
            return (Criteria) this;
        }

        public Criteria andJspbhNotBetween(String value1, String value2) {
            addCriterion("JSPBH not between", value1, value2, "jspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhIsNull() {
            addCriterion("BSPBH is null");
            return (Criteria) this;
        }

        public Criteria andBspbhIsNotNull() {
            addCriterion("BSPBH is not null");
            return (Criteria) this;
        }

        public Criteria andBspbhEqualTo(String value) {
            addCriterion("BSPBH =", value, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhNotEqualTo(String value) {
            addCriterion("BSPBH <>", value, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhGreaterThan(String value) {
            addCriterion("BSPBH >", value, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhGreaterThanOrEqualTo(String value) {
            addCriterion("BSPBH >=", value, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhLessThan(String value) {
            addCriterion("BSPBH <", value, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhLessThanOrEqualTo(String value) {
            addCriterion("BSPBH <=", value, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhLike(String value) {
            addCriterion("BSPBH like", value, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhNotLike(String value) {
            addCriterion("BSPBH not like", value, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhIn(List<String> values) {
            addCriterion("BSPBH in", values, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhNotIn(List<String> values) {
            addCriterion("BSPBH not in", values, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhBetween(String value1, String value2) {
            addCriterion("BSPBH between", value1, value2, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspbhNotBetween(String value1, String value2) {
            addCriterion("BSPBH not between", value1, value2, "bspbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhIsNull() {
            addCriterion("BSPDCBBH is null");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhIsNotNull() {
            addCriterion("BSPDCBBH is not null");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhEqualTo(String value) {
            addCriterion("BSPDCBBH =", value, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhNotEqualTo(String value) {
            addCriterion("BSPDCBBH <>", value, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhGreaterThan(String value) {
            addCriterion("BSPDCBBH >", value, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhGreaterThanOrEqualTo(String value) {
            addCriterion("BSPDCBBH >=", value, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhLessThan(String value) {
            addCriterion("BSPDCBBH <", value, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhLessThanOrEqualTo(String value) {
            addCriterion("BSPDCBBH <=", value, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhLike(String value) {
            addCriterion("BSPDCBBH like", value, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhNotLike(String value) {
            addCriterion("BSPDCBBH not like", value, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhIn(List<String> values) {
            addCriterion("BSPDCBBH in", values, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhNotIn(List<String> values) {
            addCriterion("BSPDCBBH not in", values, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhBetween(String value1, String value2) {
            addCriterion("BSPDCBBH between", value1, value2, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andBspdcbbhNotBetween(String value1, String value2) {
            addCriterion("BSPDCBBH not between", value1, value2, "bspdcbbh");
            return (Criteria) this;
        }

        public Criteria andHzfwsqIsNull() {
            addCriterion("HZFWSQ is null");
            return (Criteria) this;
        }

        public Criteria andHzfwsqIsNotNull() {
            addCriterion("HZFWSQ is not null");
            return (Criteria) this;
        }

        public Criteria andHzfwsqEqualTo(String value) {
            addCriterion("HZFWSQ =", value, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqNotEqualTo(String value) {
            addCriterion("HZFWSQ <>", value, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqGreaterThan(String value) {
            addCriterion("HZFWSQ >", value, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqGreaterThanOrEqualTo(String value) {
            addCriterion("HZFWSQ >=", value, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqLessThan(String value) {
            addCriterion("HZFWSQ <", value, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqLessThanOrEqualTo(String value) {
            addCriterion("HZFWSQ <=", value, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqLike(String value) {
            addCriterion("HZFWSQ like", value, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqNotLike(String value) {
            addCriterion("HZFWSQ not like", value, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqIn(List<String> values) {
            addCriterion("HZFWSQ in", values, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqNotIn(List<String> values) {
            addCriterion("HZFWSQ not in", values, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqBetween(String value1, String value2) {
            addCriterion("HZFWSQ between", value1, value2, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andHzfwsqNotBetween(String value1, String value2) {
            addCriterion("HZFWSQ not between", value1, value2, "hzfwsq");
            return (Criteria) this;
        }

        public Criteria andFxsqxxIsNull() {
            addCriterion("FXSQXX is null");
            return (Criteria) this;
        }

        public Criteria andFxsqxxIsNotNull() {
            addCriterion("FXSQXX is not null");
            return (Criteria) this;
        }

        public Criteria andFxsqxxEqualTo(String value) {
            addCriterion("FXSQXX =", value, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxNotEqualTo(String value) {
            addCriterion("FXSQXX <>", value, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxGreaterThan(String value) {
            addCriterion("FXSQXX >", value, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxGreaterThanOrEqualTo(String value) {
            addCriterion("FXSQXX >=", value, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxLessThan(String value) {
            addCriterion("FXSQXX <", value, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxLessThanOrEqualTo(String value) {
            addCriterion("FXSQXX <=", value, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxLike(String value) {
            addCriterion("FXSQXX like", value, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxNotLike(String value) {
            addCriterion("FXSQXX not like", value, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxIn(List<String> values) {
            addCriterion("FXSQXX in", values, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxNotIn(List<String> values) {
            addCriterion("FXSQXX not in", values, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxBetween(String value1, String value2) {
            addCriterion("FXSQXX between", value1, value2, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andFxsqxxNotBetween(String value1, String value2) {
            addCriterion("FXSQXX not between", value1, value2, "fxsqxx");
            return (Criteria) this;
        }

        public Criteria andBsprlIsNull() {
            addCriterion("BSPRL is null");
            return (Criteria) this;
        }

        public Criteria andBsprlIsNotNull() {
            addCriterion("BSPRL is not null");
            return (Criteria) this;
        }

        public Criteria andBsprlEqualTo(String value) {
            addCriterion("BSPRL =", value, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlNotEqualTo(String value) {
            addCriterion("BSPRL <>", value, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlGreaterThan(String value) {
            addCriterion("BSPRL >", value, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlGreaterThanOrEqualTo(String value) {
            addCriterion("BSPRL >=", value, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlLessThan(String value) {
            addCriterion("BSPRL <", value, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlLessThanOrEqualTo(String value) {
            addCriterion("BSPRL <=", value, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlLike(String value) {
            addCriterion("BSPRL like", value, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlNotLike(String value) {
            addCriterion("BSPRL not like", value, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlIn(List<String> values) {
            addCriterion("BSPRL in", values, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlNotIn(List<String> values) {
            addCriterion("BSPRL not in", values, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlBetween(String value1, String value2) {
            addCriterion("BSPRL between", value1, value2, "bsprl");
            return (Criteria) this;
        }

        public Criteria andBsprlNotBetween(String value1, String value2) {
            addCriterion("BSPRL not between", value1, value2, "bsprl");
            return (Criteria) this;
        }

        public Criteria andSfdcsqIsNull() {
            addCriterion("SFDCSQ is null");
            return (Criteria) this;
        }

        public Criteria andSfdcsqIsNotNull() {
            addCriterion("SFDCSQ is not null");
            return (Criteria) this;
        }

        public Criteria andSfdcsqEqualTo(String value) {
            addCriterion("SFDCSQ =", value, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqNotEqualTo(String value) {
            addCriterion("SFDCSQ <>", value, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqGreaterThan(String value) {
            addCriterion("SFDCSQ >", value, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqGreaterThanOrEqualTo(String value) {
            addCriterion("SFDCSQ >=", value, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqLessThan(String value) {
            addCriterion("SFDCSQ <", value, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqLessThanOrEqualTo(String value) {
            addCriterion("SFDCSQ <=", value, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqLike(String value) {
            addCriterion("SFDCSQ like", value, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqNotLike(String value) {
            addCriterion("SFDCSQ not like", value, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqIn(List<String> values) {
            addCriterion("SFDCSQ in", values, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqNotIn(List<String> values) {
            addCriterion("SFDCSQ not in", values, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqBetween(String value1, String value2) {
            addCriterion("SFDCSQ between", value1, value2, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdcsqNotBetween(String value1, String value2) {
            addCriterion("SFDCSQ not between", value1, value2, "sfdcsq");
            return (Criteria) this;
        }

        public Criteria andSfdssqIsNull() {
            addCriterion("SFDSSQ is null");
            return (Criteria) this;
        }

        public Criteria andSfdssqIsNotNull() {
            addCriterion("SFDSSQ is not null");
            return (Criteria) this;
        }

        public Criteria andSfdssqEqualTo(String value) {
            addCriterion("SFDSSQ =", value, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqNotEqualTo(String value) {
            addCriterion("SFDSSQ <>", value, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqGreaterThan(String value) {
            addCriterion("SFDSSQ >", value, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqGreaterThanOrEqualTo(String value) {
            addCriterion("SFDSSQ >=", value, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqLessThan(String value) {
            addCriterion("SFDSSQ <", value, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqLessThanOrEqualTo(String value) {
            addCriterion("SFDSSQ <=", value, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqLike(String value) {
            addCriterion("SFDSSQ like", value, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqNotLike(String value) {
            addCriterion("SFDSSQ not like", value, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqIn(List<String> values) {
            addCriterion("SFDSSQ in", values, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqNotIn(List<String> values) {
            addCriterion("SFDSSQ not in", values, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqBetween(String value1, String value2) {
            addCriterion("SFDSSQ between", value1, value2, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andSfdssqNotBetween(String value1, String value2) {
            addCriterion("SFDSSQ not between", value1, value2, "sfdssq");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeIsNull() {
            addCriterion("ZYFPLXXE is null");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeIsNotNull() {
            addCriterion("ZYFPLXXE is not null");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeEqualTo(BigDecimal value) {
            addCriterion("ZYFPLXXE =", value, "zyfplxxe");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeNotEqualTo(BigDecimal value) {
            addCriterion("ZYFPLXXE <>", value, "zyfplxxe");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeGreaterThan(BigDecimal value) {
            addCriterion("ZYFPLXXE >", value, "zyfplxxe");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYFPLXXE >=", value, "zyfplxxe");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeLessThan(BigDecimal value) {
            addCriterion("ZYFPLXXE <", value, "zyfplxxe");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYFPLXXE <=", value, "zyfplxxe");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeIn(List<BigDecimal> values) {
            addCriterion("ZYFPLXXE in", values, "zyfplxxe");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeNotIn(List<BigDecimal> values) {
            addCriterion("ZYFPLXXE not in", values, "zyfplxxe");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYFPLXXE between", value1, value2, "zyfplxxe");
            return (Criteria) this;
        }

        public Criteria andZyfplxxeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYFPLXXE not between", value1, value2, "zyfplxxe");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeIsNull() {
            addCriterion("PTFPLXXE is null");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeIsNotNull() {
            addCriterion("PTFPLXXE is not null");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeEqualTo(BigDecimal value) {
            addCriterion("PTFPLXXE =", value, "ptfplxxe");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeNotEqualTo(BigDecimal value) {
            addCriterion("PTFPLXXE <>", value, "ptfplxxe");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeGreaterThan(BigDecimal value) {
            addCriterion("PTFPLXXE >", value, "ptfplxxe");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PTFPLXXE >=", value, "ptfplxxe");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeLessThan(BigDecimal value) {
            addCriterion("PTFPLXXE <", value, "ptfplxxe");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PTFPLXXE <=", value, "ptfplxxe");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeIn(List<BigDecimal> values) {
            addCriterion("PTFPLXXE in", values, "ptfplxxe");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeNotIn(List<BigDecimal> values) {
            addCriterion("PTFPLXXE not in", values, "ptfplxxe");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTFPLXXE between", value1, value2, "ptfplxxe");
            return (Criteria) this;
        }

        public Criteria andPtfplxxeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTFPLXXE not between", value1, value2, "ptfplxxe");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeIsNull() {
            addCriterion("ZYFPLXSYJE is null");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeIsNotNull() {
            addCriterion("ZYFPLXSYJE is not null");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeEqualTo(BigDecimal value) {
            addCriterion("ZYFPLXSYJE =", value, "zyfplxsyje");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeNotEqualTo(BigDecimal value) {
            addCriterion("ZYFPLXSYJE <>", value, "zyfplxsyje");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeGreaterThan(BigDecimal value) {
            addCriterion("ZYFPLXSYJE >", value, "zyfplxsyje");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYFPLXSYJE >=", value, "zyfplxsyje");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeLessThan(BigDecimal value) {
            addCriterion("ZYFPLXSYJE <", value, "zyfplxsyje");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYFPLXSYJE <=", value, "zyfplxsyje");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeIn(List<BigDecimal> values) {
            addCriterion("ZYFPLXSYJE in", values, "zyfplxsyje");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeNotIn(List<BigDecimal> values) {
            addCriterion("ZYFPLXSYJE not in", values, "zyfplxsyje");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYFPLXSYJE between", value1, value2, "zyfplxsyje");
            return (Criteria) this;
        }

        public Criteria andZyfplxsyjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYFPLXSYJE not between", value1, value2, "zyfplxsyje");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeIsNull() {
            addCriterion("PTFPLXSYJE is null");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeIsNotNull() {
            addCriterion("PTFPLXSYJE is not null");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeEqualTo(BigDecimal value) {
            addCriterion("PTFPLXSYJE =", value, "ptfplxsyje");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeNotEqualTo(BigDecimal value) {
            addCriterion("PTFPLXSYJE <>", value, "ptfplxsyje");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeGreaterThan(BigDecimal value) {
            addCriterion("PTFPLXSYJE >", value, "ptfplxsyje");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PTFPLXSYJE >=", value, "ptfplxsyje");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeLessThan(BigDecimal value) {
            addCriterion("PTFPLXSYJE <", value, "ptfplxsyje");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PTFPLXSYJE <=", value, "ptfplxsyje");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeIn(List<BigDecimal> values) {
            addCriterion("PTFPLXSYJE in", values, "ptfplxsyje");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeNotIn(List<BigDecimal> values) {
            addCriterion("PTFPLXSYJE not in", values, "ptfplxsyje");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTFPLXSYJE between", value1, value2, "ptfplxsyje");
            return (Criteria) this;
        }

        public Criteria andPtfplxsyjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTFPLXSYJE not between", value1, value2, "ptfplxsyje");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeIsNull() {
            addCriterion("ZYFPKPXE is null");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeIsNotNull() {
            addCriterion("ZYFPKPXE is not null");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeEqualTo(BigDecimal value) {
            addCriterion("ZYFPKPXE =", value, "zyfpkpxe");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeNotEqualTo(BigDecimal value) {
            addCriterion("ZYFPKPXE <>", value, "zyfpkpxe");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeGreaterThan(BigDecimal value) {
            addCriterion("ZYFPKPXE >", value, "zyfpkpxe");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYFPKPXE >=", value, "zyfpkpxe");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeLessThan(BigDecimal value) {
            addCriterion("ZYFPKPXE <", value, "zyfpkpxe");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZYFPKPXE <=", value, "zyfpkpxe");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeIn(List<BigDecimal> values) {
            addCriterion("ZYFPKPXE in", values, "zyfpkpxe");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeNotIn(List<BigDecimal> values) {
            addCriterion("ZYFPKPXE not in", values, "zyfpkpxe");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYFPKPXE between", value1, value2, "zyfpkpxe");
            return (Criteria) this;
        }

        public Criteria andZyfpkpxeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZYFPKPXE not between", value1, value2, "zyfpkpxe");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeIsNull() {
            addCriterion("PTFPKPXE is null");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeIsNotNull() {
            addCriterion("PTFPKPXE is not null");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeEqualTo(BigDecimal value) {
            addCriterion("PTFPKPXE =", value, "ptfpkpxe");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeNotEqualTo(BigDecimal value) {
            addCriterion("PTFPKPXE <>", value, "ptfpkpxe");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeGreaterThan(BigDecimal value) {
            addCriterion("PTFPKPXE >", value, "ptfpkpxe");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PTFPKPXE >=", value, "ptfpkpxe");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeLessThan(BigDecimal value) {
            addCriterion("PTFPKPXE <", value, "ptfpkpxe");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PTFPKPXE <=", value, "ptfpkpxe");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeIn(List<BigDecimal> values) {
            addCriterion("PTFPKPXE in", values, "ptfpkpxe");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeNotIn(List<BigDecimal> values) {
            addCriterion("PTFPKPXE not in", values, "ptfpkpxe");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTFPKPXE between", value1, value2, "ptfpkpxe");
            return (Criteria) this;
        }

        public Criteria andPtfpkpxeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PTFPKPXE not between", value1, value2, "ptfpkpxe");
            return (Criteria) this;
        }

        public Criteria andSsrqIsNull() {
            addCriterion("SSRQ is null");
            return (Criteria) this;
        }

        public Criteria andSsrqIsNotNull() {
            addCriterion("SSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSsrqEqualTo(String value) {
            addCriterion("SSRQ =", value, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqNotEqualTo(String value) {
            addCriterion("SSRQ <>", value, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqGreaterThan(String value) {
            addCriterion("SSRQ >", value, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqGreaterThanOrEqualTo(String value) {
            addCriterion("SSRQ >=", value, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqLessThan(String value) {
            addCriterion("SSRQ <", value, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqLessThanOrEqualTo(String value) {
            addCriterion("SSRQ <=", value, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqLike(String value) {
            addCriterion("SSRQ like", value, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqNotLike(String value) {
            addCriterion("SSRQ not like", value, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqIn(List<String> values) {
            addCriterion("SSRQ in", values, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqNotIn(List<String> values) {
            addCriterion("SSRQ not in", values, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqBetween(String value1, String value2) {
            addCriterion("SSRQ between", value1, value2, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSsrqNotBetween(String value1, String value2) {
            addCriterion("SSRQ not between", value1, value2, "ssrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqIsNull() {
            addCriterion("SCCBRQ is null");
            return (Criteria) this;
        }

        public Criteria andSccbrqIsNotNull() {
            addCriterion("SCCBRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSccbrqEqualTo(String value) {
            addCriterion("SCCBRQ =", value, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqNotEqualTo(String value) {
            addCriterion("SCCBRQ <>", value, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqGreaterThan(String value) {
            addCriterion("SCCBRQ >", value, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqGreaterThanOrEqualTo(String value) {
            addCriterion("SCCBRQ >=", value, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqLessThan(String value) {
            addCriterion("SCCBRQ <", value, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqLessThanOrEqualTo(String value) {
            addCriterion("SCCBRQ <=", value, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqLike(String value) {
            addCriterion("SCCBRQ like", value, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqNotLike(String value) {
            addCriterion("SCCBRQ not like", value, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqIn(List<String> values) {
            addCriterion("SCCBRQ in", values, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqNotIn(List<String> values) {
            addCriterion("SCCBRQ not in", values, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqBetween(String value1, String value2) {
            addCriterion("SCCBRQ between", value1, value2, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andSccbrqNotBetween(String value1, String value2) {
            addCriterion("SCCBRQ not between", value1, value2, "sccbrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqIsNull() {
            addCriterion("CSQSRQ is null");
            return (Criteria) this;
        }

        public Criteria andCsqsrqIsNotNull() {
            addCriterion("CSQSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andCsqsrqEqualTo(String value) {
            addCriterion("CSQSRQ =", value, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqNotEqualTo(String value) {
            addCriterion("CSQSRQ <>", value, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqGreaterThan(String value) {
            addCriterion("CSQSRQ >", value, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqGreaterThanOrEqualTo(String value) {
            addCriterion("CSQSRQ >=", value, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqLessThan(String value) {
            addCriterion("CSQSRQ <", value, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqLessThanOrEqualTo(String value) {
            addCriterion("CSQSRQ <=", value, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqLike(String value) {
            addCriterion("CSQSRQ like", value, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqNotLike(String value) {
            addCriterion("CSQSRQ not like", value, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqIn(List<String> values) {
            addCriterion("CSQSRQ in", values, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqNotIn(List<String> values) {
            addCriterion("CSQSRQ not in", values, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqBetween(String value1, String value2) {
            addCriterion("CSQSRQ between", value1, value2, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andCsqsrqNotBetween(String value1, String value2) {
            addCriterion("CSQSRQ not between", value1, value2, "csqsrq");
            return (Criteria) this;
        }

        public Criteria andBszlIsNull() {
            addCriterion("BSZL is null");
            return (Criteria) this;
        }

        public Criteria andBszlIsNotNull() {
            addCriterion("BSZL is not null");
            return (Criteria) this;
        }

        public Criteria andBszlEqualTo(String value) {
            addCriterion("BSZL =", value, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlNotEqualTo(String value) {
            addCriterion("BSZL <>", value, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlGreaterThan(String value) {
            addCriterion("BSZL >", value, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlGreaterThanOrEqualTo(String value) {
            addCriterion("BSZL >=", value, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlLessThan(String value) {
            addCriterion("BSZL <", value, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlLessThanOrEqualTo(String value) {
            addCriterion("BSZL <=", value, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlLike(String value) {
            addCriterion("BSZL like", value, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlNotLike(String value) {
            addCriterion("BSZL not like", value, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlIn(List<String> values) {
            addCriterion("BSZL in", values, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlNotIn(List<String> values) {
            addCriterion("BSZL not in", values, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlBetween(String value1, String value2) {
            addCriterion("BSZL between", value1, value2, "bszl");
            return (Criteria) this;
        }

        public Criteria andBszlNotBetween(String value1, String value2) {
            addCriterion("BSZL not between", value1, value2, "bszl");
            return (Criteria) this;
        }

        public Criteria andBscgbzIsNull() {
            addCriterion("BSCGBZ is null");
            return (Criteria) this;
        }

        public Criteria andBscgbzIsNotNull() {
            addCriterion("BSCGBZ is not null");
            return (Criteria) this;
        }

        public Criteria andBscgbzEqualTo(String value) {
            addCriterion("BSCGBZ =", value, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzNotEqualTo(String value) {
            addCriterion("BSCGBZ <>", value, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzGreaterThan(String value) {
            addCriterion("BSCGBZ >", value, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzGreaterThanOrEqualTo(String value) {
            addCriterion("BSCGBZ >=", value, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzLessThan(String value) {
            addCriterion("BSCGBZ <", value, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzLessThanOrEqualTo(String value) {
            addCriterion("BSCGBZ <=", value, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzLike(String value) {
            addCriterion("BSCGBZ like", value, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzNotLike(String value) {
            addCriterion("BSCGBZ not like", value, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzIn(List<String> values) {
            addCriterion("BSCGBZ in", values, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzNotIn(List<String> values) {
            addCriterion("BSCGBZ not in", values, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzBetween(String value1, String value2) {
            addCriterion("BSCGBZ between", value1, value2, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andBscgbzNotBetween(String value1, String value2) {
            addCriterion("BSCGBZ not between", value1, value2, "bscgbz");
            return (Criteria) this;
        }

        public Criteria andGrfpxxIsNull() {
            addCriterion("GRFPXX is null");
            return (Criteria) this;
        }

        public Criteria andGrfpxxIsNotNull() {
            addCriterion("GRFPXX is not null");
            return (Criteria) this;
        }

        public Criteria andGrfpxxEqualTo(String value) {
            addCriterion("GRFPXX =", value, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxNotEqualTo(String value) {
            addCriterion("GRFPXX <>", value, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxGreaterThan(String value) {
            addCriterion("GRFPXX >", value, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxGreaterThanOrEqualTo(String value) {
            addCriterion("GRFPXX >=", value, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxLessThan(String value) {
            addCriterion("GRFPXX <", value, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxLessThanOrEqualTo(String value) {
            addCriterion("GRFPXX <=", value, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxLike(String value) {
            addCriterion("GRFPXX like", value, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxNotLike(String value) {
            addCriterion("GRFPXX not like", value, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxIn(List<String> values) {
            addCriterion("GRFPXX in", values, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxNotIn(List<String> values) {
            addCriterion("GRFPXX not in", values, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxBetween(String value1, String value2) {
            addCriterion("GRFPXX between", value1, value2, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andGrfpxxNotBetween(String value1, String value2) {
            addCriterion("GRFPXX not between", value1, value2, "grfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxIsNull() {
            addCriterion("THFPXX is null");
            return (Criteria) this;
        }

        public Criteria andThfpxxIsNotNull() {
            addCriterion("THFPXX is not null");
            return (Criteria) this;
        }

        public Criteria andThfpxxEqualTo(String value) {
            addCriterion("THFPXX =", value, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxNotEqualTo(String value) {
            addCriterion("THFPXX <>", value, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxGreaterThan(String value) {
            addCriterion("THFPXX >", value, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxGreaterThanOrEqualTo(String value) {
            addCriterion("THFPXX >=", value, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxLessThan(String value) {
            addCriterion("THFPXX <", value, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxLessThanOrEqualTo(String value) {
            addCriterion("THFPXX <=", value, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxLike(String value) {
            addCriterion("THFPXX like", value, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxNotLike(String value) {
            addCriterion("THFPXX not like", value, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxIn(List<String> values) {
            addCriterion("THFPXX in", values, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxNotIn(List<String> values) {
            addCriterion("THFPXX not in", values, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxBetween(String value1, String value2) {
            addCriterion("THFPXX between", value1, value2, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andThfpxxNotBetween(String value1, String value2) {
            addCriterion("THFPXX not between", value1, value2, "thfpxx");
            return (Criteria) this;
        }

        public Criteria andLxxeIsNull() {
            addCriterion("LXXE is null");
            return (Criteria) this;
        }

        public Criteria andLxxeIsNotNull() {
            addCriterion("LXXE is not null");
            return (Criteria) this;
        }

        public Criteria andLxxeEqualTo(BigDecimal value) {
            addCriterion("LXXE =", value, "lxxe");
            return (Criteria) this;
        }

        public Criteria andLxxeNotEqualTo(BigDecimal value) {
            addCriterion("LXXE <>", value, "lxxe");
            return (Criteria) this;
        }

        public Criteria andLxxeGreaterThan(BigDecimal value) {
            addCriterion("LXXE >", value, "lxxe");
            return (Criteria) this;
        }

        public Criteria andLxxeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LXXE >=", value, "lxxe");
            return (Criteria) this;
        }

        public Criteria andLxxeLessThan(BigDecimal value) {
            addCriterion("LXXE <", value, "lxxe");
            return (Criteria) this;
        }

        public Criteria andLxxeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LXXE <=", value, "lxxe");
            return (Criteria) this;
        }

        public Criteria andLxxeIn(List<BigDecimal> values) {
            addCriterion("LXXE in", values, "lxxe");
            return (Criteria) this;
        }

        public Criteria andLxxeNotIn(List<BigDecimal> values) {
            addCriterion("LXXE not in", values, "lxxe");
            return (Criteria) this;
        }

        public Criteria andLxxeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXXE between", value1, value2, "lxxe");
            return (Criteria) this;
        }

        public Criteria andLxxeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXXE not between", value1, value2, "lxxe");
            return (Criteria) this;
        }

        public Criteria andLxsyjeIsNull() {
            addCriterion("LXSYJE is null");
            return (Criteria) this;
        }

        public Criteria andLxsyjeIsNotNull() {
            addCriterion("LXSYJE is not null");
            return (Criteria) this;
        }

        public Criteria andLxsyjeEqualTo(BigDecimal value) {
            addCriterion("LXSYJE =", value, "lxsyje");
            return (Criteria) this;
        }

        public Criteria andLxsyjeNotEqualTo(BigDecimal value) {
            addCriterion("LXSYJE <>", value, "lxsyje");
            return (Criteria) this;
        }

        public Criteria andLxsyjeGreaterThan(BigDecimal value) {
            addCriterion("LXSYJE >", value, "lxsyje");
            return (Criteria) this;
        }

        public Criteria andLxsyjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LXSYJE >=", value, "lxsyje");
            return (Criteria) this;
        }

        public Criteria andLxsyjeLessThan(BigDecimal value) {
            addCriterion("LXSYJE <", value, "lxsyje");
            return (Criteria) this;
        }

        public Criteria andLxsyjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LXSYJE <=", value, "lxsyje");
            return (Criteria) this;
        }

        public Criteria andLxsyjeIn(List<BigDecimal> values) {
            addCriterion("LXSYJE in", values, "lxsyje");
            return (Criteria) this;
        }

        public Criteria andLxsyjeNotIn(List<BigDecimal> values) {
            addCriterion("LXSYJE not in", values, "lxsyje");
            return (Criteria) this;
        }

        public Criteria andLxsyjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXSYJE between", value1, value2, "lxsyje");
            return (Criteria) this;
        }

        public Criteria andLxsyjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LXSYJE not between", value1, value2, "lxsyje");
            return (Criteria) this;
        }

        public Criteria andDzkpxeIsNull() {
            addCriterion("DZKPXE is null");
            return (Criteria) this;
        }

        public Criteria andDzkpxeIsNotNull() {
            addCriterion("DZKPXE is not null");
            return (Criteria) this;
        }

        public Criteria andDzkpxeEqualTo(BigDecimal value) {
            addCriterion("DZKPXE =", value, "dzkpxe");
            return (Criteria) this;
        }

        public Criteria andDzkpxeNotEqualTo(BigDecimal value) {
            addCriterion("DZKPXE <>", value, "dzkpxe");
            return (Criteria) this;
        }

        public Criteria andDzkpxeGreaterThan(BigDecimal value) {
            addCriterion("DZKPXE >", value, "dzkpxe");
            return (Criteria) this;
        }

        public Criteria andDzkpxeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DZKPXE >=", value, "dzkpxe");
            return (Criteria) this;
        }

        public Criteria andDzkpxeLessThan(BigDecimal value) {
            addCriterion("DZKPXE <", value, "dzkpxe");
            return (Criteria) this;
        }

        public Criteria andDzkpxeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DZKPXE <=", value, "dzkpxe");
            return (Criteria) this;
        }

        public Criteria andDzkpxeIn(List<BigDecimal> values) {
            addCriterion("DZKPXE in", values, "dzkpxe");
            return (Criteria) this;
        }

        public Criteria andDzkpxeNotIn(List<BigDecimal> values) {
            addCriterion("DZKPXE not in", values, "dzkpxe");
            return (Criteria) this;
        }

        public Criteria andDzkpxeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DZKPXE between", value1, value2, "dzkpxe");
            return (Criteria) this;
        }

        public Criteria andDzkpxeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DZKPXE not between", value1, value2, "dzkpxe");
            return (Criteria) this;
        }

        public Criteria andYljkpxxIsNull() {
            addCriterion("YLJKPXX is null");
            return (Criteria) this;
        }

        public Criteria andYljkpxxIsNotNull() {
            addCriterion("YLJKPXX is not null");
            return (Criteria) this;
        }

        public Criteria andYljkpxxEqualTo(BigDecimal value) {
            addCriterion("YLJKPXX =", value, "yljkpxx");
            return (Criteria) this;
        }

        public Criteria andYljkpxxNotEqualTo(BigDecimal value) {
            addCriterion("YLJKPXX <>", value, "yljkpxx");
            return (Criteria) this;
        }

        public Criteria andYljkpxxGreaterThan(BigDecimal value) {
            addCriterion("YLJKPXX >", value, "yljkpxx");
            return (Criteria) this;
        }

        public Criteria andYljkpxxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YLJKPXX >=", value, "yljkpxx");
            return (Criteria) this;
        }

        public Criteria andYljkpxxLessThan(BigDecimal value) {
            addCriterion("YLJKPXX <", value, "yljkpxx");
            return (Criteria) this;
        }

        public Criteria andYljkpxxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YLJKPXX <=", value, "yljkpxx");
            return (Criteria) this;
        }

        public Criteria andYljkpxxIn(List<BigDecimal> values) {
            addCriterion("YLJKPXX in", values, "yljkpxx");
            return (Criteria) this;
        }

        public Criteria andYljkpxxNotIn(List<BigDecimal> values) {
            addCriterion("YLJKPXX not in", values, "yljkpxx");
            return (Criteria) this;
        }

        public Criteria andYljkpxxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLJKPXX between", value1, value2, "yljkpxx");
            return (Criteria) this;
        }

        public Criteria andYljkpxxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLJKPXX not between", value1, value2, "yljkpxx");
            return (Criteria) this;
        }

        public Criteria andYljtpxxIsNull() {
            addCriterion("YLJTPXX is null");
            return (Criteria) this;
        }

        public Criteria andYljtpxxIsNotNull() {
            addCriterion("YLJTPXX is not null");
            return (Criteria) this;
        }

        public Criteria andYljtpxxEqualTo(BigDecimal value) {
            addCriterion("YLJTPXX =", value, "yljtpxx");
            return (Criteria) this;
        }

        public Criteria andYljtpxxNotEqualTo(BigDecimal value) {
            addCriterion("YLJTPXX <>", value, "yljtpxx");
            return (Criteria) this;
        }

        public Criteria andYljtpxxGreaterThan(BigDecimal value) {
            addCriterion("YLJTPXX >", value, "yljtpxx");
            return (Criteria) this;
        }

        public Criteria andYljtpxxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YLJTPXX >=", value, "yljtpxx");
            return (Criteria) this;
        }

        public Criteria andYljtpxxLessThan(BigDecimal value) {
            addCriterion("YLJTPXX <", value, "yljtpxx");
            return (Criteria) this;
        }

        public Criteria andYljtpxxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YLJTPXX <=", value, "yljtpxx");
            return (Criteria) this;
        }

        public Criteria andYljtpxxIn(List<BigDecimal> values) {
            addCriterion("YLJTPXX in", values, "yljtpxx");
            return (Criteria) this;
        }

        public Criteria andYljtpxxNotIn(List<BigDecimal> values) {
            addCriterion("YLJTPXX not in", values, "yljtpxx");
            return (Criteria) this;
        }

        public Criteria andYljtpxxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLJTPXX between", value1, value2, "yljtpxx");
            return (Criteria) this;
        }

        public Criteria andYljtpxxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YLJTPXX not between", value1, value2, "yljtpxx");
            return (Criteria) this;
        }

        public Criteria andByykfpjeIsNull() {
            addCriterion("BYYKFPJE is null");
            return (Criteria) this;
        }

        public Criteria andByykfpjeIsNotNull() {
            addCriterion("BYYKFPJE is not null");
            return (Criteria) this;
        }

        public Criteria andByykfpjeEqualTo(BigDecimal value) {
            addCriterion("BYYKFPJE =", value, "byykfpje");
            return (Criteria) this;
        }

        public Criteria andByykfpjeNotEqualTo(BigDecimal value) {
            addCriterion("BYYKFPJE <>", value, "byykfpje");
            return (Criteria) this;
        }

        public Criteria andByykfpjeGreaterThan(BigDecimal value) {
            addCriterion("BYYKFPJE >", value, "byykfpje");
            return (Criteria) this;
        }

        public Criteria andByykfpjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BYYKFPJE >=", value, "byykfpje");
            return (Criteria) this;
        }

        public Criteria andByykfpjeLessThan(BigDecimal value) {
            addCriterion("BYYKFPJE <", value, "byykfpje");
            return (Criteria) this;
        }

        public Criteria andByykfpjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BYYKFPJE <=", value, "byykfpje");
            return (Criteria) this;
        }

        public Criteria andByykfpjeIn(List<BigDecimal> values) {
            addCriterion("BYYKFPJE in", values, "byykfpje");
            return (Criteria) this;
        }

        public Criteria andByykfpjeNotIn(List<BigDecimal> values) {
            addCriterion("BYYKFPJE not in", values, "byykfpje");
            return (Criteria) this;
        }

        public Criteria andByykfpjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BYYKFPJE between", value1, value2, "byykfpje");
            return (Criteria) this;
        }

        public Criteria andByykfpjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BYYKFPJE not between", value1, value2, "byykfpje");
            return (Criteria) this;
        }

        public Criteria andByytfpjeIsNull() {
            addCriterion("BYYTFPJE is null");
            return (Criteria) this;
        }

        public Criteria andByytfpjeIsNotNull() {
            addCriterion("BYYTFPJE is not null");
            return (Criteria) this;
        }

        public Criteria andByytfpjeEqualTo(BigDecimal value) {
            addCriterion("BYYTFPJE =", value, "byytfpje");
            return (Criteria) this;
        }

        public Criteria andByytfpjeNotEqualTo(BigDecimal value) {
            addCriterion("BYYTFPJE <>", value, "byytfpje");
            return (Criteria) this;
        }

        public Criteria andByytfpjeGreaterThan(BigDecimal value) {
            addCriterion("BYYTFPJE >", value, "byytfpje");
            return (Criteria) this;
        }

        public Criteria andByytfpjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BYYTFPJE >=", value, "byytfpje");
            return (Criteria) this;
        }

        public Criteria andByytfpjeLessThan(BigDecimal value) {
            addCriterion("BYYTFPJE <", value, "byytfpje");
            return (Criteria) this;
        }

        public Criteria andByytfpjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BYYTFPJE <=", value, "byytfpje");
            return (Criteria) this;
        }

        public Criteria andByytfpjeIn(List<BigDecimal> values) {
            addCriterion("BYYTFPJE in", values, "byytfpje");
            return (Criteria) this;
        }

        public Criteria andByytfpjeNotIn(List<BigDecimal> values) {
            addCriterion("BYYTFPJE not in", values, "byytfpje");
            return (Criteria) this;
        }

        public Criteria andByytfpjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BYYTFPJE between", value1, value2, "byytfpje");
            return (Criteria) this;
        }

        public Criteria andByytfpjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BYYTFPJE not between", value1, value2, "byytfpje");
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