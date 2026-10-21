package com.gingkoo.rpt.dbsvr.server.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OdsXlsVatTaxRptAExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OdsXlsVatTaxRptAExample() {
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

        public Criteria andCol1IsNull() {
            addCriterion("COL1 is null");
            return (Criteria) this;
        }

        public Criteria andCol1IsNotNull() {
            addCriterion("COL1 is not null");
            return (Criteria) this;
        }

        public Criteria andCol1EqualTo(String value) {
            addCriterion("COL1 =", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1NotEqualTo(String value) {
            addCriterion("COL1 <>", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1GreaterThan(String value) {
            addCriterion("COL1 >", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1GreaterThanOrEqualTo(String value) {
            addCriterion("COL1 >=", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1LessThan(String value) {
            addCriterion("COL1 <", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1LessThanOrEqualTo(String value) {
            addCriterion("COL1 <=", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1Like(String value) {
            addCriterion("COL1 like", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1NotLike(String value) {
            addCriterion("COL1 not like", value, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1In(List<String> values) {
            addCriterion("COL1 in", values, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1NotIn(List<String> values) {
            addCriterion("COL1 not in", values, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1Between(String value1, String value2) {
            addCriterion("COL1 between", value1, value2, "col1");
            return (Criteria) this;
        }

        public Criteria andCol1NotBetween(String value1, String value2) {
            addCriterion("COL1 not between", value1, value2, "col1");
            return (Criteria) this;
        }

        public Criteria andCol2IsNull() {
            addCriterion("COL2 is null");
            return (Criteria) this;
        }

        public Criteria andCol2IsNotNull() {
            addCriterion("COL2 is not null");
            return (Criteria) this;
        }

        public Criteria andCol2EqualTo(String value) {
            addCriterion("COL2 =", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2NotEqualTo(String value) {
            addCriterion("COL2 <>", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2GreaterThan(String value) {
            addCriterion("COL2 >", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2GreaterThanOrEqualTo(String value) {
            addCriterion("COL2 >=", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2LessThan(String value) {
            addCriterion("COL2 <", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2LessThanOrEqualTo(String value) {
            addCriterion("COL2 <=", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2Like(String value) {
            addCriterion("COL2 like", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2NotLike(String value) {
            addCriterion("COL2 not like", value, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2In(List<String> values) {
            addCriterion("COL2 in", values, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2NotIn(List<String> values) {
            addCriterion("COL2 not in", values, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2Between(String value1, String value2) {
            addCriterion("COL2 between", value1, value2, "col2");
            return (Criteria) this;
        }

        public Criteria andCol2NotBetween(String value1, String value2) {
            addCriterion("COL2 not between", value1, value2, "col2");
            return (Criteria) this;
        }

        public Criteria andCol3IsNull() {
            addCriterion("COL3 is null");
            return (Criteria) this;
        }

        public Criteria andCol3IsNotNull() {
            addCriterion("COL3 is not null");
            return (Criteria) this;
        }

        public Criteria andCol3EqualTo(String value) {
            addCriterion("COL3 =", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3NotEqualTo(String value) {
            addCriterion("COL3 <>", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3GreaterThan(String value) {
            addCriterion("COL3 >", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3GreaterThanOrEqualTo(String value) {
            addCriterion("COL3 >=", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3LessThan(String value) {
            addCriterion("COL3 <", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3LessThanOrEqualTo(String value) {
            addCriterion("COL3 <=", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3Like(String value) {
            addCriterion("COL3 like", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3NotLike(String value) {
            addCriterion("COL3 not like", value, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3In(List<String> values) {
            addCriterion("COL3 in", values, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3NotIn(List<String> values) {
            addCriterion("COL3 not in", values, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3Between(String value1, String value2) {
            addCriterion("COL3 between", value1, value2, "col3");
            return (Criteria) this;
        }

        public Criteria andCol3NotBetween(String value1, String value2) {
            addCriterion("COL3 not between", value1, value2, "col3");
            return (Criteria) this;
        }

        public Criteria andCol4IsNull() {
            addCriterion("COL4 is null");
            return (Criteria) this;
        }

        public Criteria andCol4IsNotNull() {
            addCriterion("COL4 is not null");
            return (Criteria) this;
        }

        public Criteria andCol4EqualTo(String value) {
            addCriterion("COL4 =", value, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4NotEqualTo(String value) {
            addCriterion("COL4 <>", value, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4GreaterThan(String value) {
            addCriterion("COL4 >", value, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4GreaterThanOrEqualTo(String value) {
            addCriterion("COL4 >=", value, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4LessThan(String value) {
            addCriterion("COL4 <", value, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4LessThanOrEqualTo(String value) {
            addCriterion("COL4 <=", value, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4Like(String value) {
            addCriterion("COL4 like", value, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4NotLike(String value) {
            addCriterion("COL4 not like", value, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4In(List<String> values) {
            addCriterion("COL4 in", values, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4NotIn(List<String> values) {
            addCriterion("COL4 not in", values, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4Between(String value1, String value2) {
            addCriterion("COL4 between", value1, value2, "col4");
            return (Criteria) this;
        }

        public Criteria andCol4NotBetween(String value1, String value2) {
            addCriterion("COL4 not between", value1, value2, "col4");
            return (Criteria) this;
        }

        public Criteria andCol5IsNull() {
            addCriterion("COL5 is null");
            return (Criteria) this;
        }

        public Criteria andCol5IsNotNull() {
            addCriterion("COL5 is not null");
            return (Criteria) this;
        }

        public Criteria andCol5EqualTo(String value) {
            addCriterion("COL5 =", value, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5NotEqualTo(String value) {
            addCriterion("COL5 <>", value, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5GreaterThan(String value) {
            addCriterion("COL5 >", value, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5GreaterThanOrEqualTo(String value) {
            addCriterion("COL5 >=", value, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5LessThan(String value) {
            addCriterion("COL5 <", value, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5LessThanOrEqualTo(String value) {
            addCriterion("COL5 <=", value, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5Like(String value) {
            addCriterion("COL5 like", value, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5NotLike(String value) {
            addCriterion("COL5 not like", value, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5In(List<String> values) {
            addCriterion("COL5 in", values, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5NotIn(List<String> values) {
            addCriterion("COL5 not in", values, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5Between(String value1, String value2) {
            addCriterion("COL5 between", value1, value2, "col5");
            return (Criteria) this;
        }

        public Criteria andCol5NotBetween(String value1, String value2) {
            addCriterion("COL5 not between", value1, value2, "col5");
            return (Criteria) this;
        }

        public Criteria andCol6IsNull() {
            addCriterion("COL6 is null");
            return (Criteria) this;
        }

        public Criteria andCol6IsNotNull() {
            addCriterion("COL6 is not null");
            return (Criteria) this;
        }

        public Criteria andCol6EqualTo(String value) {
            addCriterion("COL6 =", value, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6NotEqualTo(String value) {
            addCriterion("COL6 <>", value, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6GreaterThan(String value) {
            addCriterion("COL6 >", value, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6GreaterThanOrEqualTo(String value) {
            addCriterion("COL6 >=", value, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6LessThan(String value) {
            addCriterion("COL6 <", value, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6LessThanOrEqualTo(String value) {
            addCriterion("COL6 <=", value, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6Like(String value) {
            addCriterion("COL6 like", value, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6NotLike(String value) {
            addCriterion("COL6 not like", value, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6In(List<String> values) {
            addCriterion("COL6 in", values, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6NotIn(List<String> values) {
            addCriterion("COL6 not in", values, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6Between(String value1, String value2) {
            addCriterion("COL6 between", value1, value2, "col6");
            return (Criteria) this;
        }

        public Criteria andCol6NotBetween(String value1, String value2) {
            addCriterion("COL6 not between", value1, value2, "col6");
            return (Criteria) this;
        }

        public Criteria andCol7IsNull() {
            addCriterion("COL7 is null");
            return (Criteria) this;
        }

        public Criteria andCol7IsNotNull() {
            addCriterion("COL7 is not null");
            return (Criteria) this;
        }

        public Criteria andCol7EqualTo(String value) {
            addCriterion("COL7 =", value, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7NotEqualTo(String value) {
            addCriterion("COL7 <>", value, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7GreaterThan(String value) {
            addCriterion("COL7 >", value, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7GreaterThanOrEqualTo(String value) {
            addCriterion("COL7 >=", value, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7LessThan(String value) {
            addCriterion("COL7 <", value, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7LessThanOrEqualTo(String value) {
            addCriterion("COL7 <=", value, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7Like(String value) {
            addCriterion("COL7 like", value, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7NotLike(String value) {
            addCriterion("COL7 not like", value, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7In(List<String> values) {
            addCriterion("COL7 in", values, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7NotIn(List<String> values) {
            addCriterion("COL7 not in", values, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7Between(String value1, String value2) {
            addCriterion("COL7 between", value1, value2, "col7");
            return (Criteria) this;
        }

        public Criteria andCol7NotBetween(String value1, String value2) {
            addCriterion("COL7 not between", value1, value2, "col7");
            return (Criteria) this;
        }

        public Criteria andCol8IsNull() {
            addCriterion("COL8 is null");
            return (Criteria) this;
        }

        public Criteria andCol8IsNotNull() {
            addCriterion("COL8 is not null");
            return (Criteria) this;
        }

        public Criteria andCol8EqualTo(String value) {
            addCriterion("COL8 =", value, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8NotEqualTo(String value) {
            addCriterion("COL8 <>", value, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8GreaterThan(String value) {
            addCriterion("COL8 >", value, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8GreaterThanOrEqualTo(String value) {
            addCriterion("COL8 >=", value, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8LessThan(String value) {
            addCriterion("COL8 <", value, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8LessThanOrEqualTo(String value) {
            addCriterion("COL8 <=", value, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8Like(String value) {
            addCriterion("COL8 like", value, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8NotLike(String value) {
            addCriterion("COL8 not like", value, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8In(List<String> values) {
            addCriterion("COL8 in", values, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8NotIn(List<String> values) {
            addCriterion("COL8 not in", values, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8Between(String value1, String value2) {
            addCriterion("COL8 between", value1, value2, "col8");
            return (Criteria) this;
        }

        public Criteria andCol8NotBetween(String value1, String value2) {
            addCriterion("COL8 not between", value1, value2, "col8");
            return (Criteria) this;
        }

        public Criteria andCol9IsNull() {
            addCriterion("COL9 is null");
            return (Criteria) this;
        }

        public Criteria andCol9IsNotNull() {
            addCriterion("COL9 is not null");
            return (Criteria) this;
        }

        public Criteria andCol9EqualTo(String value) {
            addCriterion("COL9 =", value, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9NotEqualTo(String value) {
            addCriterion("COL9 <>", value, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9GreaterThan(String value) {
            addCriterion("COL9 >", value, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9GreaterThanOrEqualTo(String value) {
            addCriterion("COL9 >=", value, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9LessThan(String value) {
            addCriterion("COL9 <", value, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9LessThanOrEqualTo(String value) {
            addCriterion("COL9 <=", value, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9Like(String value) {
            addCriterion("COL9 like", value, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9NotLike(String value) {
            addCriterion("COL9 not like", value, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9In(List<String> values) {
            addCriterion("COL9 in", values, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9NotIn(List<String> values) {
            addCriterion("COL9 not in", values, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9Between(String value1, String value2) {
            addCriterion("COL9 between", value1, value2, "col9");
            return (Criteria) this;
        }

        public Criteria andCol9NotBetween(String value1, String value2) {
            addCriterion("COL9 not between", value1, value2, "col9");
            return (Criteria) this;
        }

        public Criteria andCol10IsNull() {
            addCriterion("COL10 is null");
            return (Criteria) this;
        }

        public Criteria andCol10IsNotNull() {
            addCriterion("COL10 is not null");
            return (Criteria) this;
        }

        public Criteria andCol10EqualTo(String value) {
            addCriterion("COL10 =", value, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10NotEqualTo(String value) {
            addCriterion("COL10 <>", value, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10GreaterThan(String value) {
            addCriterion("COL10 >", value, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10GreaterThanOrEqualTo(String value) {
            addCriterion("COL10 >=", value, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10LessThan(String value) {
            addCriterion("COL10 <", value, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10LessThanOrEqualTo(String value) {
            addCriterion("COL10 <=", value, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10Like(String value) {
            addCriterion("COL10 like", value, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10NotLike(String value) {
            addCriterion("COL10 not like", value, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10In(List<String> values) {
            addCriterion("COL10 in", values, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10NotIn(List<String> values) {
            addCriterion("COL10 not in", values, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10Between(String value1, String value2) {
            addCriterion("COL10 between", value1, value2, "col10");
            return (Criteria) this;
        }

        public Criteria andCol10NotBetween(String value1, String value2) {
            addCriterion("COL10 not between", value1, value2, "col10");
            return (Criteria) this;
        }

        public Criteria andCol11IsNull() {
            addCriterion("COL11 is null");
            return (Criteria) this;
        }

        public Criteria andCol11IsNotNull() {
            addCriterion("COL11 is not null");
            return (Criteria) this;
        }

        public Criteria andCol11EqualTo(String value) {
            addCriterion("COL11 =", value, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11NotEqualTo(String value) {
            addCriterion("COL11 <>", value, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11GreaterThan(String value) {
            addCriterion("COL11 >", value, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11GreaterThanOrEqualTo(String value) {
            addCriterion("COL11 >=", value, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11LessThan(String value) {
            addCriterion("COL11 <", value, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11LessThanOrEqualTo(String value) {
            addCriterion("COL11 <=", value, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11Like(String value) {
            addCriterion("COL11 like", value, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11NotLike(String value) {
            addCriterion("COL11 not like", value, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11In(List<String> values) {
            addCriterion("COL11 in", values, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11NotIn(List<String> values) {
            addCriterion("COL11 not in", values, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11Between(String value1, String value2) {
            addCriterion("COL11 between", value1, value2, "col11");
            return (Criteria) this;
        }

        public Criteria andCol11NotBetween(String value1, String value2) {
            addCriterion("COL11 not between", value1, value2, "col11");
            return (Criteria) this;
        }

        public Criteria andCol12IsNull() {
            addCriterion("COL12 is null");
            return (Criteria) this;
        }

        public Criteria andCol12IsNotNull() {
            addCriterion("COL12 is not null");
            return (Criteria) this;
        }

        public Criteria andCol12EqualTo(String value) {
            addCriterion("COL12 =", value, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12NotEqualTo(String value) {
            addCriterion("COL12 <>", value, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12GreaterThan(String value) {
            addCriterion("COL12 >", value, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12GreaterThanOrEqualTo(String value) {
            addCriterion("COL12 >=", value, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12LessThan(String value) {
            addCriterion("COL12 <", value, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12LessThanOrEqualTo(String value) {
            addCriterion("COL12 <=", value, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12Like(String value) {
            addCriterion("COL12 like", value, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12NotLike(String value) {
            addCriterion("COL12 not like", value, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12In(List<String> values) {
            addCriterion("COL12 in", values, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12NotIn(List<String> values) {
            addCriterion("COL12 not in", values, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12Between(String value1, String value2) {
            addCriterion("COL12 between", value1, value2, "col12");
            return (Criteria) this;
        }

        public Criteria andCol12NotBetween(String value1, String value2) {
            addCriterion("COL12 not between", value1, value2, "col12");
            return (Criteria) this;
        }

        public Criteria andCol13IsNull() {
            addCriterion("COL13 is null");
            return (Criteria) this;
        }

        public Criteria andCol13IsNotNull() {
            addCriterion("COL13 is not null");
            return (Criteria) this;
        }

        public Criteria andCol13EqualTo(String value) {
            addCriterion("COL13 =", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13NotEqualTo(String value) {
            addCriterion("COL13 <>", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13GreaterThan(String value) {
            addCriterion("COL13 >", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13GreaterThanOrEqualTo(String value) {
            addCriterion("COL13 >=", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13LessThan(String value) {
            addCriterion("COL13 <", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13LessThanOrEqualTo(String value) {
            addCriterion("COL13 <=", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13Like(String value) {
            addCriterion("COL13 like", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13NotLike(String value) {
            addCriterion("COL13 not like", value, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13In(List<String> values) {
            addCriterion("COL13 in", values, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13NotIn(List<String> values) {
            addCriterion("COL13 not in", values, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13Between(String value1, String value2) {
            addCriterion("COL13 between", value1, value2, "col13");
            return (Criteria) this;
        }

        public Criteria andCol13NotBetween(String value1, String value2) {
            addCriterion("COL13 not between", value1, value2, "col13");
            return (Criteria) this;
        }

        public Criteria andCol14IsNull() {
            addCriterion("COL14 is null");
            return (Criteria) this;
        }

        public Criteria andCol14IsNotNull() {
            addCriterion("COL14 is not null");
            return (Criteria) this;
        }

        public Criteria andCol14EqualTo(String value) {
            addCriterion("COL14 =", value, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14NotEqualTo(String value) {
            addCriterion("COL14 <>", value, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14GreaterThan(String value) {
            addCriterion("COL14 >", value, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14GreaterThanOrEqualTo(String value) {
            addCriterion("COL14 >=", value, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14LessThan(String value) {
            addCriterion("COL14 <", value, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14LessThanOrEqualTo(String value) {
            addCriterion("COL14 <=", value, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14Like(String value) {
            addCriterion("COL14 like", value, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14NotLike(String value) {
            addCriterion("COL14 not like", value, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14In(List<String> values) {
            addCriterion("COL14 in", values, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14NotIn(List<String> values) {
            addCriterion("COL14 not in", values, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14Between(String value1, String value2) {
            addCriterion("COL14 between", value1, value2, "col14");
            return (Criteria) this;
        }

        public Criteria andCol14NotBetween(String value1, String value2) {
            addCriterion("COL14 not between", value1, value2, "col14");
            return (Criteria) this;
        }

        public Criteria andCol15IsNull() {
            addCriterion("COL15 is null");
            return (Criteria) this;
        }

        public Criteria andCol15IsNotNull() {
            addCriterion("COL15 is not null");
            return (Criteria) this;
        }

        public Criteria andCol15EqualTo(String value) {
            addCriterion("COL15 =", value, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15NotEqualTo(String value) {
            addCriterion("COL15 <>", value, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15GreaterThan(String value) {
            addCriterion("COL15 >", value, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15GreaterThanOrEqualTo(String value) {
            addCriterion("COL15 >=", value, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15LessThan(String value) {
            addCriterion("COL15 <", value, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15LessThanOrEqualTo(String value) {
            addCriterion("COL15 <=", value, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15Like(String value) {
            addCriterion("COL15 like", value, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15NotLike(String value) {
            addCriterion("COL15 not like", value, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15In(List<String> values) {
            addCriterion("COL15 in", values, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15NotIn(List<String> values) {
            addCriterion("COL15 not in", values, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15Between(String value1, String value2) {
            addCriterion("COL15 between", value1, value2, "col15");
            return (Criteria) this;
        }

        public Criteria andCol15NotBetween(String value1, String value2) {
            addCriterion("COL15 not between", value1, value2, "col15");
            return (Criteria) this;
        }

        public Criteria andCol16IsNull() {
            addCriterion("COL16 is null");
            return (Criteria) this;
        }

        public Criteria andCol16IsNotNull() {
            addCriterion("COL16 is not null");
            return (Criteria) this;
        }

        public Criteria andCol16EqualTo(String value) {
            addCriterion("COL16 =", value, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16NotEqualTo(String value) {
            addCriterion("COL16 <>", value, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16GreaterThan(String value) {
            addCriterion("COL16 >", value, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16GreaterThanOrEqualTo(String value) {
            addCriterion("COL16 >=", value, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16LessThan(String value) {
            addCriterion("COL16 <", value, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16LessThanOrEqualTo(String value) {
            addCriterion("COL16 <=", value, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16Like(String value) {
            addCriterion("COL16 like", value, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16NotLike(String value) {
            addCriterion("COL16 not like", value, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16In(List<String> values) {
            addCriterion("COL16 in", values, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16NotIn(List<String> values) {
            addCriterion("COL16 not in", values, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16Between(String value1, String value2) {
            addCriterion("COL16 between", value1, value2, "col16");
            return (Criteria) this;
        }

        public Criteria andCol16NotBetween(String value1, String value2) {
            addCriterion("COL16 not between", value1, value2, "col16");
            return (Criteria) this;
        }

        public Criteria andCol17IsNull() {
            addCriterion("COL17 is null");
            return (Criteria) this;
        }

        public Criteria andCol17IsNotNull() {
            addCriterion("COL17 is not null");
            return (Criteria) this;
        }

        public Criteria andCol17EqualTo(String value) {
            addCriterion("COL17 =", value, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17NotEqualTo(String value) {
            addCriterion("COL17 <>", value, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17GreaterThan(String value) {
            addCriterion("COL17 >", value, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17GreaterThanOrEqualTo(String value) {
            addCriterion("COL17 >=", value, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17LessThan(String value) {
            addCriterion("COL17 <", value, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17LessThanOrEqualTo(String value) {
            addCriterion("COL17 <=", value, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17Like(String value) {
            addCriterion("COL17 like", value, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17NotLike(String value) {
            addCriterion("COL17 not like", value, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17In(List<String> values) {
            addCriterion("COL17 in", values, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17NotIn(List<String> values) {
            addCriterion("COL17 not in", values, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17Between(String value1, String value2) {
            addCriterion("COL17 between", value1, value2, "col17");
            return (Criteria) this;
        }

        public Criteria andCol17NotBetween(String value1, String value2) {
            addCriterion("COL17 not between", value1, value2, "col17");
            return (Criteria) this;
        }

        public Criteria andCol18IsNull() {
            addCriterion("COL18 is null");
            return (Criteria) this;
        }

        public Criteria andCol18IsNotNull() {
            addCriterion("COL18 is not null");
            return (Criteria) this;
        }

        public Criteria andCol18EqualTo(String value) {
            addCriterion("COL18 =", value, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18NotEqualTo(String value) {
            addCriterion("COL18 <>", value, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18GreaterThan(String value) {
            addCriterion("COL18 >", value, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18GreaterThanOrEqualTo(String value) {
            addCriterion("COL18 >=", value, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18LessThan(String value) {
            addCriterion("COL18 <", value, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18LessThanOrEqualTo(String value) {
            addCriterion("COL18 <=", value, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18Like(String value) {
            addCriterion("COL18 like", value, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18NotLike(String value) {
            addCriterion("COL18 not like", value, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18In(List<String> values) {
            addCriterion("COL18 in", values, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18NotIn(List<String> values) {
            addCriterion("COL18 not in", values, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18Between(String value1, String value2) {
            addCriterion("COL18 between", value1, value2, "col18");
            return (Criteria) this;
        }

        public Criteria andCol18NotBetween(String value1, String value2) {
            addCriterion("COL18 not between", value1, value2, "col18");
            return (Criteria) this;
        }

        public Criteria andCol19IsNull() {
            addCriterion("COL19 is null");
            return (Criteria) this;
        }

        public Criteria andCol19IsNotNull() {
            addCriterion("COL19 is not null");
            return (Criteria) this;
        }

        public Criteria andCol19EqualTo(String value) {
            addCriterion("COL19 =", value, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19NotEqualTo(String value) {
            addCriterion("COL19 <>", value, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19GreaterThan(String value) {
            addCriterion("COL19 >", value, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19GreaterThanOrEqualTo(String value) {
            addCriterion("COL19 >=", value, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19LessThan(String value) {
            addCriterion("COL19 <", value, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19LessThanOrEqualTo(String value) {
            addCriterion("COL19 <=", value, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19Like(String value) {
            addCriterion("COL19 like", value, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19NotLike(String value) {
            addCriterion("COL19 not like", value, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19In(List<String> values) {
            addCriterion("COL19 in", values, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19NotIn(List<String> values) {
            addCriterion("COL19 not in", values, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19Between(String value1, String value2) {
            addCriterion("COL19 between", value1, value2, "col19");
            return (Criteria) this;
        }

        public Criteria andCol19NotBetween(String value1, String value2) {
            addCriterion("COL19 not between", value1, value2, "col19");
            return (Criteria) this;
        }

        public Criteria andCol20IsNull() {
            addCriterion("COL20 is null");
            return (Criteria) this;
        }

        public Criteria andCol20IsNotNull() {
            addCriterion("COL20 is not null");
            return (Criteria) this;
        }

        public Criteria andCol20EqualTo(String value) {
            addCriterion("COL20 =", value, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20NotEqualTo(String value) {
            addCriterion("COL20 <>", value, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20GreaterThan(String value) {
            addCriterion("COL20 >", value, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20GreaterThanOrEqualTo(String value) {
            addCriterion("COL20 >=", value, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20LessThan(String value) {
            addCriterion("COL20 <", value, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20LessThanOrEqualTo(String value) {
            addCriterion("COL20 <=", value, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20Like(String value) {
            addCriterion("COL20 like", value, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20NotLike(String value) {
            addCriterion("COL20 not like", value, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20In(List<String> values) {
            addCriterion("COL20 in", values, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20NotIn(List<String> values) {
            addCriterion("COL20 not in", values, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20Between(String value1, String value2) {
            addCriterion("COL20 between", value1, value2, "col20");
            return (Criteria) this;
        }

        public Criteria andCol20NotBetween(String value1, String value2) {
            addCriterion("COL20 not between", value1, value2, "col20");
            return (Criteria) this;
        }

        public Criteria andCol21IsNull() {
            addCriterion("COL21 is null");
            return (Criteria) this;
        }

        public Criteria andCol21IsNotNull() {
            addCriterion("COL21 is not null");
            return (Criteria) this;
        }

        public Criteria andCol21EqualTo(String value) {
            addCriterion("COL21 =", value, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21NotEqualTo(String value) {
            addCriterion("COL21 <>", value, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21GreaterThan(String value) {
            addCriterion("COL21 >", value, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21GreaterThanOrEqualTo(String value) {
            addCriterion("COL21 >=", value, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21LessThan(String value) {
            addCriterion("COL21 <", value, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21LessThanOrEqualTo(String value) {
            addCriterion("COL21 <=", value, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21Like(String value) {
            addCriterion("COL21 like", value, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21NotLike(String value) {
            addCriterion("COL21 not like", value, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21In(List<String> values) {
            addCriterion("COL21 in", values, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21NotIn(List<String> values) {
            addCriterion("COL21 not in", values, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21Between(String value1, String value2) {
            addCriterion("COL21 between", value1, value2, "col21");
            return (Criteria) this;
        }

        public Criteria andCol21NotBetween(String value1, String value2) {
            addCriterion("COL21 not between", value1, value2, "col21");
            return (Criteria) this;
        }

        public Criteria andCol22IsNull() {
            addCriterion("COL22 is null");
            return (Criteria) this;
        }

        public Criteria andCol22IsNotNull() {
            addCriterion("COL22 is not null");
            return (Criteria) this;
        }

        public Criteria andCol22EqualTo(String value) {
            addCriterion("COL22 =", value, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22NotEqualTo(String value) {
            addCriterion("COL22 <>", value, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22GreaterThan(String value) {
            addCriterion("COL22 >", value, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22GreaterThanOrEqualTo(String value) {
            addCriterion("COL22 >=", value, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22LessThan(String value) {
            addCriterion("COL22 <", value, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22LessThanOrEqualTo(String value) {
            addCriterion("COL22 <=", value, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22Like(String value) {
            addCriterion("COL22 like", value, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22NotLike(String value) {
            addCriterion("COL22 not like", value, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22In(List<String> values) {
            addCriterion("COL22 in", values, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22NotIn(List<String> values) {
            addCriterion("COL22 not in", values, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22Between(String value1, String value2) {
            addCriterion("COL22 between", value1, value2, "col22");
            return (Criteria) this;
        }

        public Criteria andCol22NotBetween(String value1, String value2) {
            addCriterion("COL22 not between", value1, value2, "col22");
            return (Criteria) this;
        }

        public Criteria andCol23IsNull() {
            addCriterion("COL23 is null");
            return (Criteria) this;
        }

        public Criteria andCol23IsNotNull() {
            addCriterion("COL23 is not null");
            return (Criteria) this;
        }

        public Criteria andCol23EqualTo(String value) {
            addCriterion("COL23 =", value, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23NotEqualTo(String value) {
            addCriterion("COL23 <>", value, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23GreaterThan(String value) {
            addCriterion("COL23 >", value, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23GreaterThanOrEqualTo(String value) {
            addCriterion("COL23 >=", value, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23LessThan(String value) {
            addCriterion("COL23 <", value, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23LessThanOrEqualTo(String value) {
            addCriterion("COL23 <=", value, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23Like(String value) {
            addCriterion("COL23 like", value, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23NotLike(String value) {
            addCriterion("COL23 not like", value, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23In(List<String> values) {
            addCriterion("COL23 in", values, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23NotIn(List<String> values) {
            addCriterion("COL23 not in", values, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23Between(String value1, String value2) {
            addCriterion("COL23 between", value1, value2, "col23");
            return (Criteria) this;
        }

        public Criteria andCol23NotBetween(String value1, String value2) {
            addCriterion("COL23 not between", value1, value2, "col23");
            return (Criteria) this;
        }

        public Criteria andCol24IsNull() {
            addCriterion("COL24 is null");
            return (Criteria) this;
        }

        public Criteria andCol24IsNotNull() {
            addCriterion("COL24 is not null");
            return (Criteria) this;
        }

        public Criteria andCol24EqualTo(String value) {
            addCriterion("COL24 =", value, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24NotEqualTo(String value) {
            addCriterion("COL24 <>", value, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24GreaterThan(String value) {
            addCriterion("COL24 >", value, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24GreaterThanOrEqualTo(String value) {
            addCriterion("COL24 >=", value, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24LessThan(String value) {
            addCriterion("COL24 <", value, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24LessThanOrEqualTo(String value) {
            addCriterion("COL24 <=", value, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24Like(String value) {
            addCriterion("COL24 like", value, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24NotLike(String value) {
            addCriterion("COL24 not like", value, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24In(List<String> values) {
            addCriterion("COL24 in", values, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24NotIn(List<String> values) {
            addCriterion("COL24 not in", values, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24Between(String value1, String value2) {
            addCriterion("COL24 between", value1, value2, "col24");
            return (Criteria) this;
        }

        public Criteria andCol24NotBetween(String value1, String value2) {
            addCriterion("COL24 not between", value1, value2, "col24");
            return (Criteria) this;
        }

        public Criteria andCol25IsNull() {
            addCriterion("COL25 is null");
            return (Criteria) this;
        }

        public Criteria andCol25IsNotNull() {
            addCriterion("COL25 is not null");
            return (Criteria) this;
        }

        public Criteria andCol25EqualTo(String value) {
            addCriterion("COL25 =", value, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25NotEqualTo(String value) {
            addCriterion("COL25 <>", value, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25GreaterThan(String value) {
            addCriterion("COL25 >", value, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25GreaterThanOrEqualTo(String value) {
            addCriterion("COL25 >=", value, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25LessThan(String value) {
            addCriterion("COL25 <", value, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25LessThanOrEqualTo(String value) {
            addCriterion("COL25 <=", value, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25Like(String value) {
            addCriterion("COL25 like", value, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25NotLike(String value) {
            addCriterion("COL25 not like", value, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25In(List<String> values) {
            addCriterion("COL25 in", values, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25NotIn(List<String> values) {
            addCriterion("COL25 not in", values, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25Between(String value1, String value2) {
            addCriterion("COL25 between", value1, value2, "col25");
            return (Criteria) this;
        }

        public Criteria andCol25NotBetween(String value1, String value2) {
            addCriterion("COL25 not between", value1, value2, "col25");
            return (Criteria) this;
        }

        public Criteria andCol26IsNull() {
            addCriterion("COL26 is null");
            return (Criteria) this;
        }

        public Criteria andCol26IsNotNull() {
            addCriterion("COL26 is not null");
            return (Criteria) this;
        }

        public Criteria andCol26EqualTo(String value) {
            addCriterion("COL26 =", value, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26NotEqualTo(String value) {
            addCriterion("COL26 <>", value, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26GreaterThan(String value) {
            addCriterion("COL26 >", value, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26GreaterThanOrEqualTo(String value) {
            addCriterion("COL26 >=", value, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26LessThan(String value) {
            addCriterion("COL26 <", value, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26LessThanOrEqualTo(String value) {
            addCriterion("COL26 <=", value, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26Like(String value) {
            addCriterion("COL26 like", value, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26NotLike(String value) {
            addCriterion("COL26 not like", value, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26In(List<String> values) {
            addCriterion("COL26 in", values, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26NotIn(List<String> values) {
            addCriterion("COL26 not in", values, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26Between(String value1, String value2) {
            addCriterion("COL26 between", value1, value2, "col26");
            return (Criteria) this;
        }

        public Criteria andCol26NotBetween(String value1, String value2) {
            addCriterion("COL26 not between", value1, value2, "col26");
            return (Criteria) this;
        }

        public Criteria andCol27IsNull() {
            addCriterion("COL27 is null");
            return (Criteria) this;
        }

        public Criteria andCol27IsNotNull() {
            addCriterion("COL27 is not null");
            return (Criteria) this;
        }

        public Criteria andCol27EqualTo(String value) {
            addCriterion("COL27 =", value, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27NotEqualTo(String value) {
            addCriterion("COL27 <>", value, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27GreaterThan(String value) {
            addCriterion("COL27 >", value, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27GreaterThanOrEqualTo(String value) {
            addCriterion("COL27 >=", value, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27LessThan(String value) {
            addCriterion("COL27 <", value, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27LessThanOrEqualTo(String value) {
            addCriterion("COL27 <=", value, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27Like(String value) {
            addCriterion("COL27 like", value, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27NotLike(String value) {
            addCriterion("COL27 not like", value, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27In(List<String> values) {
            addCriterion("COL27 in", values, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27NotIn(List<String> values) {
            addCriterion("COL27 not in", values, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27Between(String value1, String value2) {
            addCriterion("COL27 between", value1, value2, "col27");
            return (Criteria) this;
        }

        public Criteria andCol27NotBetween(String value1, String value2) {
            addCriterion("COL27 not between", value1, value2, "col27");
            return (Criteria) this;
        }

        public Criteria andCol28IsNull() {
            addCriterion("COL28 is null");
            return (Criteria) this;
        }

        public Criteria andCol28IsNotNull() {
            addCriterion("COL28 is not null");
            return (Criteria) this;
        }

        public Criteria andCol28EqualTo(String value) {
            addCriterion("COL28 =", value, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28NotEqualTo(String value) {
            addCriterion("COL28 <>", value, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28GreaterThan(String value) {
            addCriterion("COL28 >", value, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28GreaterThanOrEqualTo(String value) {
            addCriterion("COL28 >=", value, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28LessThan(String value) {
            addCriterion("COL28 <", value, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28LessThanOrEqualTo(String value) {
            addCriterion("COL28 <=", value, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28Like(String value) {
            addCriterion("COL28 like", value, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28NotLike(String value) {
            addCriterion("COL28 not like", value, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28In(List<String> values) {
            addCriterion("COL28 in", values, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28NotIn(List<String> values) {
            addCriterion("COL28 not in", values, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28Between(String value1, String value2) {
            addCriterion("COL28 between", value1, value2, "col28");
            return (Criteria) this;
        }

        public Criteria andCol28NotBetween(String value1, String value2) {
            addCriterion("COL28 not between", value1, value2, "col28");
            return (Criteria) this;
        }

        public Criteria andCol29IsNull() {
            addCriterion("COL29 is null");
            return (Criteria) this;
        }

        public Criteria andCol29IsNotNull() {
            addCriterion("COL29 is not null");
            return (Criteria) this;
        }

        public Criteria andCol29EqualTo(String value) {
            addCriterion("COL29 =", value, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29NotEqualTo(String value) {
            addCriterion("COL29 <>", value, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29GreaterThan(String value) {
            addCriterion("COL29 >", value, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29GreaterThanOrEqualTo(String value) {
            addCriterion("COL29 >=", value, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29LessThan(String value) {
            addCriterion("COL29 <", value, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29LessThanOrEqualTo(String value) {
            addCriterion("COL29 <=", value, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29Like(String value) {
            addCriterion("COL29 like", value, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29NotLike(String value) {
            addCriterion("COL29 not like", value, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29In(List<String> values) {
            addCriterion("COL29 in", values, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29NotIn(List<String> values) {
            addCriterion("COL29 not in", values, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29Between(String value1, String value2) {
            addCriterion("COL29 between", value1, value2, "col29");
            return (Criteria) this;
        }

        public Criteria andCol29NotBetween(String value1, String value2) {
            addCriterion("COL29 not between", value1, value2, "col29");
            return (Criteria) this;
        }

        public Criteria andCol30IsNull() {
            addCriterion("COL30 is null");
            return (Criteria) this;
        }

        public Criteria andCol30IsNotNull() {
            addCriterion("COL30 is not null");
            return (Criteria) this;
        }

        public Criteria andCol30EqualTo(String value) {
            addCriterion("COL30 =", value, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30NotEqualTo(String value) {
            addCriterion("COL30 <>", value, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30GreaterThan(String value) {
            addCriterion("COL30 >", value, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30GreaterThanOrEqualTo(String value) {
            addCriterion("COL30 >=", value, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30LessThan(String value) {
            addCriterion("COL30 <", value, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30LessThanOrEqualTo(String value) {
            addCriterion("COL30 <=", value, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30Like(String value) {
            addCriterion("COL30 like", value, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30NotLike(String value) {
            addCriterion("COL30 not like", value, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30In(List<String> values) {
            addCriterion("COL30 in", values, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30NotIn(List<String> values) {
            addCriterion("COL30 not in", values, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30Between(String value1, String value2) {
            addCriterion("COL30 between", value1, value2, "col30");
            return (Criteria) this;
        }

        public Criteria andCol30NotBetween(String value1, String value2) {
            addCriterion("COL30 not between", value1, value2, "col30");
            return (Criteria) this;
        }

        public Criteria andCol31IsNull() {
            addCriterion("COL31 is null");
            return (Criteria) this;
        }

        public Criteria andCol31IsNotNull() {
            addCriterion("COL31 is not null");
            return (Criteria) this;
        }

        public Criteria andCol31EqualTo(String value) {
            addCriterion("COL31 =", value, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31NotEqualTo(String value) {
            addCriterion("COL31 <>", value, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31GreaterThan(String value) {
            addCriterion("COL31 >", value, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31GreaterThanOrEqualTo(String value) {
            addCriterion("COL31 >=", value, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31LessThan(String value) {
            addCriterion("COL31 <", value, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31LessThanOrEqualTo(String value) {
            addCriterion("COL31 <=", value, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31Like(String value) {
            addCriterion("COL31 like", value, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31NotLike(String value) {
            addCriterion("COL31 not like", value, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31In(List<String> values) {
            addCriterion("COL31 in", values, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31NotIn(List<String> values) {
            addCriterion("COL31 not in", values, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31Between(String value1, String value2) {
            addCriterion("COL31 between", value1, value2, "col31");
            return (Criteria) this;
        }

        public Criteria andCol31NotBetween(String value1, String value2) {
            addCriterion("COL31 not between", value1, value2, "col31");
            return (Criteria) this;
        }

        public Criteria andCol32IsNull() {
            addCriterion("COL32 is null");
            return (Criteria) this;
        }

        public Criteria andCol32IsNotNull() {
            addCriterion("COL32 is not null");
            return (Criteria) this;
        }

        public Criteria andCol32EqualTo(String value) {
            addCriterion("COL32 =", value, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32NotEqualTo(String value) {
            addCriterion("COL32 <>", value, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32GreaterThan(String value) {
            addCriterion("COL32 >", value, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32GreaterThanOrEqualTo(String value) {
            addCriterion("COL32 >=", value, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32LessThan(String value) {
            addCriterion("COL32 <", value, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32LessThanOrEqualTo(String value) {
            addCriterion("COL32 <=", value, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32Like(String value) {
            addCriterion("COL32 like", value, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32NotLike(String value) {
            addCriterion("COL32 not like", value, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32In(List<String> values) {
            addCriterion("COL32 in", values, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32NotIn(List<String> values) {
            addCriterion("COL32 not in", values, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32Between(String value1, String value2) {
            addCriterion("COL32 between", value1, value2, "col32");
            return (Criteria) this;
        }

        public Criteria andCol32NotBetween(String value1, String value2) {
            addCriterion("COL32 not between", value1, value2, "col32");
            return (Criteria) this;
        }

        public Criteria andCol33IsNull() {
            addCriterion("COL33 is null");
            return (Criteria) this;
        }

        public Criteria andCol33IsNotNull() {
            addCriterion("COL33 is not null");
            return (Criteria) this;
        }

        public Criteria andCol33EqualTo(String value) {
            addCriterion("COL33 =", value, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33NotEqualTo(String value) {
            addCriterion("COL33 <>", value, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33GreaterThan(String value) {
            addCriterion("COL33 >", value, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33GreaterThanOrEqualTo(String value) {
            addCriterion("COL33 >=", value, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33LessThan(String value) {
            addCriterion("COL33 <", value, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33LessThanOrEqualTo(String value) {
            addCriterion("COL33 <=", value, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33Like(String value) {
            addCriterion("COL33 like", value, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33NotLike(String value) {
            addCriterion("COL33 not like", value, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33In(List<String> values) {
            addCriterion("COL33 in", values, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33NotIn(List<String> values) {
            addCriterion("COL33 not in", values, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33Between(String value1, String value2) {
            addCriterion("COL33 between", value1, value2, "col33");
            return (Criteria) this;
        }

        public Criteria andCol33NotBetween(String value1, String value2) {
            addCriterion("COL33 not between", value1, value2, "col33");
            return (Criteria) this;
        }

        public Criteria andCol34IsNull() {
            addCriterion("COL34 is null");
            return (Criteria) this;
        }

        public Criteria andCol34IsNotNull() {
            addCriterion("COL34 is not null");
            return (Criteria) this;
        }

        public Criteria andCol34EqualTo(String value) {
            addCriterion("COL34 =", value, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34NotEqualTo(String value) {
            addCriterion("COL34 <>", value, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34GreaterThan(String value) {
            addCriterion("COL34 >", value, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34GreaterThanOrEqualTo(String value) {
            addCriterion("COL34 >=", value, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34LessThan(String value) {
            addCriterion("COL34 <", value, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34LessThanOrEqualTo(String value) {
            addCriterion("COL34 <=", value, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34Like(String value) {
            addCriterion("COL34 like", value, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34NotLike(String value) {
            addCriterion("COL34 not like", value, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34In(List<String> values) {
            addCriterion("COL34 in", values, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34NotIn(List<String> values) {
            addCriterion("COL34 not in", values, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34Between(String value1, String value2) {
            addCriterion("COL34 between", value1, value2, "col34");
            return (Criteria) this;
        }

        public Criteria andCol34NotBetween(String value1, String value2) {
            addCriterion("COL34 not between", value1, value2, "col34");
            return (Criteria) this;
        }

        public Criteria andCol35IsNull() {
            addCriterion("COL35 is null");
            return (Criteria) this;
        }

        public Criteria andCol35IsNotNull() {
            addCriterion("COL35 is not null");
            return (Criteria) this;
        }

        public Criteria andCol35EqualTo(String value) {
            addCriterion("COL35 =", value, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35NotEqualTo(String value) {
            addCriterion("COL35 <>", value, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35GreaterThan(String value) {
            addCriterion("COL35 >", value, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35GreaterThanOrEqualTo(String value) {
            addCriterion("COL35 >=", value, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35LessThan(String value) {
            addCriterion("COL35 <", value, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35LessThanOrEqualTo(String value) {
            addCriterion("COL35 <=", value, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35Like(String value) {
            addCriterion("COL35 like", value, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35NotLike(String value) {
            addCriterion("COL35 not like", value, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35In(List<String> values) {
            addCriterion("COL35 in", values, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35NotIn(List<String> values) {
            addCriterion("COL35 not in", values, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35Between(String value1, String value2) {
            addCriterion("COL35 between", value1, value2, "col35");
            return (Criteria) this;
        }

        public Criteria andCol35NotBetween(String value1, String value2) {
            addCriterion("COL35 not between", value1, value2, "col35");
            return (Criteria) this;
        }

        public Criteria andCol36IsNull() {
            addCriterion("COL36 is null");
            return (Criteria) this;
        }

        public Criteria andCol36IsNotNull() {
            addCriterion("COL36 is not null");
            return (Criteria) this;
        }

        public Criteria andCol36EqualTo(String value) {
            addCriterion("COL36 =", value, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36NotEqualTo(String value) {
            addCriterion("COL36 <>", value, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36GreaterThan(String value) {
            addCriterion("COL36 >", value, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36GreaterThanOrEqualTo(String value) {
            addCriterion("COL36 >=", value, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36LessThan(String value) {
            addCriterion("COL36 <", value, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36LessThanOrEqualTo(String value) {
            addCriterion("COL36 <=", value, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36Like(String value) {
            addCriterion("COL36 like", value, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36NotLike(String value) {
            addCriterion("COL36 not like", value, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36In(List<String> values) {
            addCriterion("COL36 in", values, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36NotIn(List<String> values) {
            addCriterion("COL36 not in", values, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36Between(String value1, String value2) {
            addCriterion("COL36 between", value1, value2, "col36");
            return (Criteria) this;
        }

        public Criteria andCol36NotBetween(String value1, String value2) {
            addCriterion("COL36 not between", value1, value2, "col36");
            return (Criteria) this;
        }

        public Criteria andCol37IsNull() {
            addCriterion("COL37 is null");
            return (Criteria) this;
        }

        public Criteria andCol37IsNotNull() {
            addCriterion("COL37 is not null");
            return (Criteria) this;
        }

        public Criteria andCol37EqualTo(String value) {
            addCriterion("COL37 =", value, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37NotEqualTo(String value) {
            addCriterion("COL37 <>", value, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37GreaterThan(String value) {
            addCriterion("COL37 >", value, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37GreaterThanOrEqualTo(String value) {
            addCriterion("COL37 >=", value, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37LessThan(String value) {
            addCriterion("COL37 <", value, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37LessThanOrEqualTo(String value) {
            addCriterion("COL37 <=", value, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37Like(String value) {
            addCriterion("COL37 like", value, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37NotLike(String value) {
            addCriterion("COL37 not like", value, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37In(List<String> values) {
            addCriterion("COL37 in", values, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37NotIn(List<String> values) {
            addCriterion("COL37 not in", values, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37Between(String value1, String value2) {
            addCriterion("COL37 between", value1, value2, "col37");
            return (Criteria) this;
        }

        public Criteria andCol37NotBetween(String value1, String value2) {
            addCriterion("COL37 not between", value1, value2, "col37");
            return (Criteria) this;
        }

        public Criteria andCol38IsNull() {
            addCriterion("COL38 is null");
            return (Criteria) this;
        }

        public Criteria andCol38IsNotNull() {
            addCriterion("COL38 is not null");
            return (Criteria) this;
        }

        public Criteria andCol38EqualTo(String value) {
            addCriterion("COL38 =", value, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38NotEqualTo(String value) {
            addCriterion("COL38 <>", value, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38GreaterThan(String value) {
            addCriterion("COL38 >", value, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38GreaterThanOrEqualTo(String value) {
            addCriterion("COL38 >=", value, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38LessThan(String value) {
            addCriterion("COL38 <", value, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38LessThanOrEqualTo(String value) {
            addCriterion("COL38 <=", value, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38Like(String value) {
            addCriterion("COL38 like", value, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38NotLike(String value) {
            addCriterion("COL38 not like", value, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38In(List<String> values) {
            addCriterion("COL38 in", values, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38NotIn(List<String> values) {
            addCriterion("COL38 not in", values, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38Between(String value1, String value2) {
            addCriterion("COL38 between", value1, value2, "col38");
            return (Criteria) this;
        }

        public Criteria andCol38NotBetween(String value1, String value2) {
            addCriterion("COL38 not between", value1, value2, "col38");
            return (Criteria) this;
        }

        public Criteria andCol39IsNull() {
            addCriterion("COL39 is null");
            return (Criteria) this;
        }

        public Criteria andCol39IsNotNull() {
            addCriterion("COL39 is not null");
            return (Criteria) this;
        }

        public Criteria andCol39EqualTo(String value) {
            addCriterion("COL39 =", value, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39NotEqualTo(String value) {
            addCriterion("COL39 <>", value, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39GreaterThan(String value) {
            addCriterion("COL39 >", value, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39GreaterThanOrEqualTo(String value) {
            addCriterion("COL39 >=", value, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39LessThan(String value) {
            addCriterion("COL39 <", value, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39LessThanOrEqualTo(String value) {
            addCriterion("COL39 <=", value, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39Like(String value) {
            addCriterion("COL39 like", value, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39NotLike(String value) {
            addCriterion("COL39 not like", value, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39In(List<String> values) {
            addCriterion("COL39 in", values, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39NotIn(List<String> values) {
            addCriterion("COL39 not in", values, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39Between(String value1, String value2) {
            addCriterion("COL39 between", value1, value2, "col39");
            return (Criteria) this;
        }

        public Criteria andCol39NotBetween(String value1, String value2) {
            addCriterion("COL39 not between", value1, value2, "col39");
            return (Criteria) this;
        }

        public Criteria andCol40IsNull() {
            addCriterion("COL40 is null");
            return (Criteria) this;
        }

        public Criteria andCol40IsNotNull() {
            addCriterion("COL40 is not null");
            return (Criteria) this;
        }

        public Criteria andCol40EqualTo(String value) {
            addCriterion("COL40 =", value, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40NotEqualTo(String value) {
            addCriterion("COL40 <>", value, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40GreaterThan(String value) {
            addCriterion("COL40 >", value, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40GreaterThanOrEqualTo(String value) {
            addCriterion("COL40 >=", value, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40LessThan(String value) {
            addCriterion("COL40 <", value, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40LessThanOrEqualTo(String value) {
            addCriterion("COL40 <=", value, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40Like(String value) {
            addCriterion("COL40 like", value, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40NotLike(String value) {
            addCriterion("COL40 not like", value, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40In(List<String> values) {
            addCriterion("COL40 in", values, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40NotIn(List<String> values) {
            addCriterion("COL40 not in", values, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40Between(String value1, String value2) {
            addCriterion("COL40 between", value1, value2, "col40");
            return (Criteria) this;
        }

        public Criteria andCol40NotBetween(String value1, String value2) {
            addCriterion("COL40 not between", value1, value2, "col40");
            return (Criteria) this;
        }

        public Criteria andCol41IsNull() {
            addCriterion("COL41 is null");
            return (Criteria) this;
        }

        public Criteria andCol41IsNotNull() {
            addCriterion("COL41 is not null");
            return (Criteria) this;
        }

        public Criteria andCol41EqualTo(String value) {
            addCriterion("COL41 =", value, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41NotEqualTo(String value) {
            addCriterion("COL41 <>", value, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41GreaterThan(String value) {
            addCriterion("COL41 >", value, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41GreaterThanOrEqualTo(String value) {
            addCriterion("COL41 >=", value, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41LessThan(String value) {
            addCriterion("COL41 <", value, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41LessThanOrEqualTo(String value) {
            addCriterion("COL41 <=", value, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41Like(String value) {
            addCriterion("COL41 like", value, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41NotLike(String value) {
            addCriterion("COL41 not like", value, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41In(List<String> values) {
            addCriterion("COL41 in", values, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41NotIn(List<String> values) {
            addCriterion("COL41 not in", values, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41Between(String value1, String value2) {
            addCriterion("COL41 between", value1, value2, "col41");
            return (Criteria) this;
        }

        public Criteria andCol41NotBetween(String value1, String value2) {
            addCriterion("COL41 not between", value1, value2, "col41");
            return (Criteria) this;
        }

        public Criteria andCol42IsNull() {
            addCriterion("COL42 is null");
            return (Criteria) this;
        }

        public Criteria andCol42IsNotNull() {
            addCriterion("COL42 is not null");
            return (Criteria) this;
        }

        public Criteria andCol42EqualTo(String value) {
            addCriterion("COL42 =", value, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42NotEqualTo(String value) {
            addCriterion("COL42 <>", value, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42GreaterThan(String value) {
            addCriterion("COL42 >", value, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42GreaterThanOrEqualTo(String value) {
            addCriterion("COL42 >=", value, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42LessThan(String value) {
            addCriterion("COL42 <", value, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42LessThanOrEqualTo(String value) {
            addCriterion("COL42 <=", value, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42Like(String value) {
            addCriterion("COL42 like", value, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42NotLike(String value) {
            addCriterion("COL42 not like", value, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42In(List<String> values) {
            addCriterion("COL42 in", values, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42NotIn(List<String> values) {
            addCriterion("COL42 not in", values, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42Between(String value1, String value2) {
            addCriterion("COL42 between", value1, value2, "col42");
            return (Criteria) this;
        }

        public Criteria andCol42NotBetween(String value1, String value2) {
            addCriterion("COL42 not between", value1, value2, "col42");
            return (Criteria) this;
        }

        public Criteria andCol43IsNull() {
            addCriterion("COL43 is null");
            return (Criteria) this;
        }

        public Criteria andCol43IsNotNull() {
            addCriterion("COL43 is not null");
            return (Criteria) this;
        }

        public Criteria andCol43EqualTo(String value) {
            addCriterion("COL43 =", value, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43NotEqualTo(String value) {
            addCriterion("COL43 <>", value, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43GreaterThan(String value) {
            addCriterion("COL43 >", value, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43GreaterThanOrEqualTo(String value) {
            addCriterion("COL43 >=", value, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43LessThan(String value) {
            addCriterion("COL43 <", value, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43LessThanOrEqualTo(String value) {
            addCriterion("COL43 <=", value, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43Like(String value) {
            addCriterion("COL43 like", value, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43NotLike(String value) {
            addCriterion("COL43 not like", value, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43In(List<String> values) {
            addCriterion("COL43 in", values, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43NotIn(List<String> values) {
            addCriterion("COL43 not in", values, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43Between(String value1, String value2) {
            addCriterion("COL43 between", value1, value2, "col43");
            return (Criteria) this;
        }

        public Criteria andCol43NotBetween(String value1, String value2) {
            addCriterion("COL43 not between", value1, value2, "col43");
            return (Criteria) this;
        }

        public Criteria andCol44IsNull() {
            addCriterion("COL44 is null");
            return (Criteria) this;
        }

        public Criteria andCol44IsNotNull() {
            addCriterion("COL44 is not null");
            return (Criteria) this;
        }

        public Criteria andCol44EqualTo(String value) {
            addCriterion("COL44 =", value, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44NotEqualTo(String value) {
            addCriterion("COL44 <>", value, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44GreaterThan(String value) {
            addCriterion("COL44 >", value, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44GreaterThanOrEqualTo(String value) {
            addCriterion("COL44 >=", value, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44LessThan(String value) {
            addCriterion("COL44 <", value, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44LessThanOrEqualTo(String value) {
            addCriterion("COL44 <=", value, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44Like(String value) {
            addCriterion("COL44 like", value, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44NotLike(String value) {
            addCriterion("COL44 not like", value, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44In(List<String> values) {
            addCriterion("COL44 in", values, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44NotIn(List<String> values) {
            addCriterion("COL44 not in", values, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44Between(String value1, String value2) {
            addCriterion("COL44 between", value1, value2, "col44");
            return (Criteria) this;
        }

        public Criteria andCol44NotBetween(String value1, String value2) {
            addCriterion("COL44 not between", value1, value2, "col44");
            return (Criteria) this;
        }

        public Criteria andCol45IsNull() {
            addCriterion("COL45 is null");
            return (Criteria) this;
        }

        public Criteria andCol45IsNotNull() {
            addCriterion("COL45 is not null");
            return (Criteria) this;
        }

        public Criteria andCol45EqualTo(String value) {
            addCriterion("COL45 =", value, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45NotEqualTo(String value) {
            addCriterion("COL45 <>", value, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45GreaterThan(String value) {
            addCriterion("COL45 >", value, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45GreaterThanOrEqualTo(String value) {
            addCriterion("COL45 >=", value, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45LessThan(String value) {
            addCriterion("COL45 <", value, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45LessThanOrEqualTo(String value) {
            addCriterion("COL45 <=", value, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45Like(String value) {
            addCriterion("COL45 like", value, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45NotLike(String value) {
            addCriterion("COL45 not like", value, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45In(List<String> values) {
            addCriterion("COL45 in", values, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45NotIn(List<String> values) {
            addCriterion("COL45 not in", values, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45Between(String value1, String value2) {
            addCriterion("COL45 between", value1, value2, "col45");
            return (Criteria) this;
        }

        public Criteria andCol45NotBetween(String value1, String value2) {
            addCriterion("COL45 not between", value1, value2, "col45");
            return (Criteria) this;
        }

        public Criteria andCol46IsNull() {
            addCriterion("COL46 is null");
            return (Criteria) this;
        }

        public Criteria andCol46IsNotNull() {
            addCriterion("COL46 is not null");
            return (Criteria) this;
        }

        public Criteria andCol46EqualTo(String value) {
            addCriterion("COL46 =", value, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46NotEqualTo(String value) {
            addCriterion("COL46 <>", value, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46GreaterThan(String value) {
            addCriterion("COL46 >", value, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46GreaterThanOrEqualTo(String value) {
            addCriterion("COL46 >=", value, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46LessThan(String value) {
            addCriterion("COL46 <", value, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46LessThanOrEqualTo(String value) {
            addCriterion("COL46 <=", value, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46Like(String value) {
            addCriterion("COL46 like", value, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46NotLike(String value) {
            addCriterion("COL46 not like", value, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46In(List<String> values) {
            addCriterion("COL46 in", values, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46NotIn(List<String> values) {
            addCriterion("COL46 not in", values, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46Between(String value1, String value2) {
            addCriterion("COL46 between", value1, value2, "col46");
            return (Criteria) this;
        }

        public Criteria andCol46NotBetween(String value1, String value2) {
            addCriterion("COL46 not between", value1, value2, "col46");
            return (Criteria) this;
        }

        public Criteria andCol47IsNull() {
            addCriterion("COL47 is null");
            return (Criteria) this;
        }

        public Criteria andCol47IsNotNull() {
            addCriterion("COL47 is not null");
            return (Criteria) this;
        }

        public Criteria andCol47EqualTo(String value) {
            addCriterion("COL47 =", value, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47NotEqualTo(String value) {
            addCriterion("COL47 <>", value, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47GreaterThan(String value) {
            addCriterion("COL47 >", value, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47GreaterThanOrEqualTo(String value) {
            addCriterion("COL47 >=", value, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47LessThan(String value) {
            addCriterion("COL47 <", value, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47LessThanOrEqualTo(String value) {
            addCriterion("COL47 <=", value, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47Like(String value) {
            addCriterion("COL47 like", value, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47NotLike(String value) {
            addCriterion("COL47 not like", value, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47In(List<String> values) {
            addCriterion("COL47 in", values, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47NotIn(List<String> values) {
            addCriterion("COL47 not in", values, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47Between(String value1, String value2) {
            addCriterion("COL47 between", value1, value2, "col47");
            return (Criteria) this;
        }

        public Criteria andCol47NotBetween(String value1, String value2) {
            addCriterion("COL47 not between", value1, value2, "col47");
            return (Criteria) this;
        }

        public Criteria andCol48IsNull() {
            addCriterion("COL48 is null");
            return (Criteria) this;
        }

        public Criteria andCol48IsNotNull() {
            addCriterion("COL48 is not null");
            return (Criteria) this;
        }

        public Criteria andCol48EqualTo(String value) {
            addCriterion("COL48 =", value, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48NotEqualTo(String value) {
            addCriterion("COL48 <>", value, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48GreaterThan(String value) {
            addCriterion("COL48 >", value, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48GreaterThanOrEqualTo(String value) {
            addCriterion("COL48 >=", value, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48LessThan(String value) {
            addCriterion("COL48 <", value, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48LessThanOrEqualTo(String value) {
            addCriterion("COL48 <=", value, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48Like(String value) {
            addCriterion("COL48 like", value, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48NotLike(String value) {
            addCriterion("COL48 not like", value, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48In(List<String> values) {
            addCriterion("COL48 in", values, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48NotIn(List<String> values) {
            addCriterion("COL48 not in", values, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48Between(String value1, String value2) {
            addCriterion("COL48 between", value1, value2, "col48");
            return (Criteria) this;
        }

        public Criteria andCol48NotBetween(String value1, String value2) {
            addCriterion("COL48 not between", value1, value2, "col48");
            return (Criteria) this;
        }

        public Criteria andCol49IsNull() {
            addCriterion("COL49 is null");
            return (Criteria) this;
        }

        public Criteria andCol49IsNotNull() {
            addCriterion("COL49 is not null");
            return (Criteria) this;
        }

        public Criteria andCol49EqualTo(String value) {
            addCriterion("COL49 =", value, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49NotEqualTo(String value) {
            addCriterion("COL49 <>", value, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49GreaterThan(String value) {
            addCriterion("COL49 >", value, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49GreaterThanOrEqualTo(String value) {
            addCriterion("COL49 >=", value, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49LessThan(String value) {
            addCriterion("COL49 <", value, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49LessThanOrEqualTo(String value) {
            addCriterion("COL49 <=", value, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49Like(String value) {
            addCriterion("COL49 like", value, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49NotLike(String value) {
            addCriterion("COL49 not like", value, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49In(List<String> values) {
            addCriterion("COL49 in", values, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49NotIn(List<String> values) {
            addCriterion("COL49 not in", values, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49Between(String value1, String value2) {
            addCriterion("COL49 between", value1, value2, "col49");
            return (Criteria) this;
        }

        public Criteria andCol49NotBetween(String value1, String value2) {
            addCriterion("COL49 not between", value1, value2, "col49");
            return (Criteria) this;
        }

        public Criteria andCol50IsNull() {
            addCriterion("COL50 is null");
            return (Criteria) this;
        }

        public Criteria andCol50IsNotNull() {
            addCriterion("COL50 is not null");
            return (Criteria) this;
        }

        public Criteria andCol50EqualTo(String value) {
            addCriterion("COL50 =", value, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50NotEqualTo(String value) {
            addCriterion("COL50 <>", value, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50GreaterThan(String value) {
            addCriterion("COL50 >", value, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50GreaterThanOrEqualTo(String value) {
            addCriterion("COL50 >=", value, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50LessThan(String value) {
            addCriterion("COL50 <", value, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50LessThanOrEqualTo(String value) {
            addCriterion("COL50 <=", value, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50Like(String value) {
            addCriterion("COL50 like", value, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50NotLike(String value) {
            addCriterion("COL50 not like", value, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50In(List<String> values) {
            addCriterion("COL50 in", values, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50NotIn(List<String> values) {
            addCriterion("COL50 not in", values, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50Between(String value1, String value2) {
            addCriterion("COL50 between", value1, value2, "col50");
            return (Criteria) this;
        }

        public Criteria andCol50NotBetween(String value1, String value2) {
            addCriterion("COL50 not between", value1, value2, "col50");
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