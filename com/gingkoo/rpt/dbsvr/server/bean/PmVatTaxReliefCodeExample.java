package com.gingkoo.rpt.dbsvr.server.bean;

import java.util.ArrayList;
import java.util.List;

public class PmVatTaxReliefCodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PmVatTaxReliefCodeExample() {
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

        public Criteria andSeqNumIsNull() {
            addCriterion("SEQ_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNotNull() {
            addCriterion("SEQ_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNumEqualTo(String value) {
            addCriterion("SEQ_NUM =", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotEqualTo(String value) {
            addCriterion("SEQ_NUM <>", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThan(String value) {
            addCriterion("SEQ_NUM >", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_NUM >=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThan(String value) {
            addCriterion("SEQ_NUM <", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThanOrEqualTo(String value) {
            addCriterion("SEQ_NUM <=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLike(String value) {
            addCriterion("SEQ_NUM like", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotLike(String value) {
            addCriterion("SEQ_NUM not like", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumIn(List<String> values) {
            addCriterion("SEQ_NUM in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotIn(List<String> values) {
            addCriterion("SEQ_NUM not in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumBetween(String value1, String value2) {
            addCriterion("SEQ_NUM between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotBetween(String value1, String value2) {
            addCriterion("SEQ_NUM not between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andReliefCodeIsNull() {
            addCriterion("RELIEF_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReliefCodeIsNotNull() {
            addCriterion("RELIEF_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReliefCodeEqualTo(String value) {
            addCriterion("RELIEF_CODE =", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeNotEqualTo(String value) {
            addCriterion("RELIEF_CODE <>", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeGreaterThan(String value) {
            addCriterion("RELIEF_CODE >", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeGreaterThanOrEqualTo(String value) {
            addCriterion("RELIEF_CODE >=", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeLessThan(String value) {
            addCriterion("RELIEF_CODE <", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeLessThanOrEqualTo(String value) {
            addCriterion("RELIEF_CODE <=", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeLike(String value) {
            addCriterion("RELIEF_CODE like", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeNotLike(String value) {
            addCriterion("RELIEF_CODE not like", value, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeIn(List<String> values) {
            addCriterion("RELIEF_CODE in", values, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeNotIn(List<String> values) {
            addCriterion("RELIEF_CODE not in", values, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeBetween(String value1, String value2) {
            addCriterion("RELIEF_CODE between", value1, value2, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefCodeNotBetween(String value1, String value2) {
            addCriterion("RELIEF_CODE not between", value1, value2, "reliefCode");
            return (Criteria) this;
        }

        public Criteria andReliefNameIsNull() {
            addCriterion("RELIEF_NAME is null");
            return (Criteria) this;
        }

        public Criteria andReliefNameIsNotNull() {
            addCriterion("RELIEF_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andReliefNameEqualTo(String value) {
            addCriterion("RELIEF_NAME =", value, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameNotEqualTo(String value) {
            addCriterion("RELIEF_NAME <>", value, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameGreaterThan(String value) {
            addCriterion("RELIEF_NAME >", value, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameGreaterThanOrEqualTo(String value) {
            addCriterion("RELIEF_NAME >=", value, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameLessThan(String value) {
            addCriterion("RELIEF_NAME <", value, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameLessThanOrEqualTo(String value) {
            addCriterion("RELIEF_NAME <=", value, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameLike(String value) {
            addCriterion("RELIEF_NAME like", value, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameNotLike(String value) {
            addCriterion("RELIEF_NAME not like", value, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameIn(List<String> values) {
            addCriterion("RELIEF_NAME in", values, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameNotIn(List<String> values) {
            addCriterion("RELIEF_NAME not in", values, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameBetween(String value1, String value2) {
            addCriterion("RELIEF_NAME between", value1, value2, "reliefName");
            return (Criteria) this;
        }

        public Criteria andReliefNameNotBetween(String value1, String value2) {
            addCriterion("RELIEF_NAME not between", value1, value2, "reliefName");
            return (Criteria) this;
        }

        public Criteria andIncTypeIsNull() {
            addCriterion("INC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIncTypeIsNotNull() {
            addCriterion("INC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIncTypeEqualTo(String value) {
            addCriterion("INC_TYPE =", value, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeNotEqualTo(String value) {
            addCriterion("INC_TYPE <>", value, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeGreaterThan(String value) {
            addCriterion("INC_TYPE >", value, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INC_TYPE >=", value, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeLessThan(String value) {
            addCriterion("INC_TYPE <", value, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeLessThanOrEqualTo(String value) {
            addCriterion("INC_TYPE <=", value, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeLike(String value) {
            addCriterion("INC_TYPE like", value, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeNotLike(String value) {
            addCriterion("INC_TYPE not like", value, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeIn(List<String> values) {
            addCriterion("INC_TYPE in", values, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeNotIn(List<String> values) {
            addCriterion("INC_TYPE not in", values, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeBetween(String value1, String value2) {
            addCriterion("INC_TYPE between", value1, value2, "incType");
            return (Criteria) this;
        }

        public Criteria andIncTypeNotBetween(String value1, String value2) {
            addCriterion("INC_TYPE not between", value1, value2, "incType");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesIsNull() {
            addCriterion("RELIEF_CATEGORIES is null");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesIsNotNull() {
            addCriterion("RELIEF_CATEGORIES is not null");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesEqualTo(String value) {
            addCriterion("RELIEF_CATEGORIES =", value, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesNotEqualTo(String value) {
            addCriterion("RELIEF_CATEGORIES <>", value, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesGreaterThan(String value) {
            addCriterion("RELIEF_CATEGORIES >", value, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesGreaterThanOrEqualTo(String value) {
            addCriterion("RELIEF_CATEGORIES >=", value, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesLessThan(String value) {
            addCriterion("RELIEF_CATEGORIES <", value, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesLessThanOrEqualTo(String value) {
            addCriterion("RELIEF_CATEGORIES <=", value, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesLike(String value) {
            addCriterion("RELIEF_CATEGORIES like", value, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesNotLike(String value) {
            addCriterion("RELIEF_CATEGORIES not like", value, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesIn(List<String> values) {
            addCriterion("RELIEF_CATEGORIES in", values, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesNotIn(List<String> values) {
            addCriterion("RELIEF_CATEGORIES not in", values, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesBetween(String value1, String value2) {
            addCriterion("RELIEF_CATEGORIES between", value1, value2, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefCategoriesNotBetween(String value1, String value2) {
            addCriterion("RELIEF_CATEGORIES not between", value1, value2, "reliefCategories");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesIsNull() {
            addCriterion("RELIEF_SUBCLASSES is null");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesIsNotNull() {
            addCriterion("RELIEF_SUBCLASSES is not null");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesEqualTo(String value) {
            addCriterion("RELIEF_SUBCLASSES =", value, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesNotEqualTo(String value) {
            addCriterion("RELIEF_SUBCLASSES <>", value, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesGreaterThan(String value) {
            addCriterion("RELIEF_SUBCLASSES >", value, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesGreaterThanOrEqualTo(String value) {
            addCriterion("RELIEF_SUBCLASSES >=", value, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesLessThan(String value) {
            addCriterion("RELIEF_SUBCLASSES <", value, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesLessThanOrEqualTo(String value) {
            addCriterion("RELIEF_SUBCLASSES <=", value, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesLike(String value) {
            addCriterion("RELIEF_SUBCLASSES like", value, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesNotLike(String value) {
            addCriterion("RELIEF_SUBCLASSES not like", value, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesIn(List<String> values) {
            addCriterion("RELIEF_SUBCLASSES in", values, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesNotIn(List<String> values) {
            addCriterion("RELIEF_SUBCLASSES not in", values, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesBetween(String value1, String value2) {
            addCriterion("RELIEF_SUBCLASSES between", value1, value2, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andReliefSubclassesNotBetween(String value1, String value2) {
            addCriterion("RELIEF_SUBCLASSES not between", value1, value2, "reliefSubclasses");
            return (Criteria) this;
        }

        public Criteria andFavorsItemIsNull() {
            addCriterion("FAVORS_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andFavorsItemIsNotNull() {
            addCriterion("FAVORS_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andFavorsItemEqualTo(String value) {
            addCriterion("FAVORS_ITEM =", value, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemNotEqualTo(String value) {
            addCriterion("FAVORS_ITEM <>", value, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemGreaterThan(String value) {
            addCriterion("FAVORS_ITEM >", value, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORS_ITEM >=", value, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemLessThan(String value) {
            addCriterion("FAVORS_ITEM <", value, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemLessThanOrEqualTo(String value) {
            addCriterion("FAVORS_ITEM <=", value, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemLike(String value) {
            addCriterion("FAVORS_ITEM like", value, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemNotLike(String value) {
            addCriterion("FAVORS_ITEM not like", value, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemIn(List<String> values) {
            addCriterion("FAVORS_ITEM in", values, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemNotIn(List<String> values) {
            addCriterion("FAVORS_ITEM not in", values, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemBetween(String value1, String value2) {
            addCriterion("FAVORS_ITEM between", value1, value2, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsItemNotBetween(String value1, String value2) {
            addCriterion("FAVORS_ITEM not between", value1, value2, "favorsItem");
            return (Criteria) this;
        }

        public Criteria andFavorsNameIsNull() {
            addCriterion("FAVORS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFavorsNameIsNotNull() {
            addCriterion("FAVORS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFavorsNameEqualTo(String value) {
            addCriterion("FAVORS_NAME =", value, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameNotEqualTo(String value) {
            addCriterion("FAVORS_NAME <>", value, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameGreaterThan(String value) {
            addCriterion("FAVORS_NAME >", value, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameGreaterThanOrEqualTo(String value) {
            addCriterion("FAVORS_NAME >=", value, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameLessThan(String value) {
            addCriterion("FAVORS_NAME <", value, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameLessThanOrEqualTo(String value) {
            addCriterion("FAVORS_NAME <=", value, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameLike(String value) {
            addCriterion("FAVORS_NAME like", value, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameNotLike(String value) {
            addCriterion("FAVORS_NAME not like", value, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameIn(List<String> values) {
            addCriterion("FAVORS_NAME in", values, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameNotIn(List<String> values) {
            addCriterion("FAVORS_NAME not in", values, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameBetween(String value1, String value2) {
            addCriterion("FAVORS_NAME between", value1, value2, "favorsName");
            return (Criteria) this;
        }

        public Criteria andFavorsNameNotBetween(String value1, String value2) {
            addCriterion("FAVORS_NAME not between", value1, value2, "favorsName");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateIsNull() {
            addCriterion("POLICY_RELATE is null");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateIsNotNull() {
            addCriterion("POLICY_RELATE is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateEqualTo(String value) {
            addCriterion("POLICY_RELATE =", value, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateNotEqualTo(String value) {
            addCriterion("POLICY_RELATE <>", value, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateGreaterThan(String value) {
            addCriterion("POLICY_RELATE >", value, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateGreaterThanOrEqualTo(String value) {
            addCriterion("POLICY_RELATE >=", value, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateLessThan(String value) {
            addCriterion("POLICY_RELATE <", value, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateLessThanOrEqualTo(String value) {
            addCriterion("POLICY_RELATE <=", value, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateLike(String value) {
            addCriterion("POLICY_RELATE like", value, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateNotLike(String value) {
            addCriterion("POLICY_RELATE not like", value, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateIn(List<String> values) {
            addCriterion("POLICY_RELATE in", values, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateNotIn(List<String> values) {
            addCriterion("POLICY_RELATE not in", values, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateBetween(String value1, String value2) {
            addCriterion("POLICY_RELATE between", value1, value2, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyRelateNotBetween(String value1, String value2) {
            addCriterion("POLICY_RELATE not between", value1, value2, "policyRelate");
            return (Criteria) this;
        }

        public Criteria andPolicyContentIsNull() {
            addCriterion("POLICY_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andPolicyContentIsNotNull() {
            addCriterion("POLICY_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyContentEqualTo(String value) {
            addCriterion("POLICY_CONTENT =", value, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentNotEqualTo(String value) {
            addCriterion("POLICY_CONTENT <>", value, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentGreaterThan(String value) {
            addCriterion("POLICY_CONTENT >", value, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentGreaterThanOrEqualTo(String value) {
            addCriterion("POLICY_CONTENT >=", value, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentLessThan(String value) {
            addCriterion("POLICY_CONTENT <", value, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentLessThanOrEqualTo(String value) {
            addCriterion("POLICY_CONTENT <=", value, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentLike(String value) {
            addCriterion("POLICY_CONTENT like", value, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentNotLike(String value) {
            addCriterion("POLICY_CONTENT not like", value, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentIn(List<String> values) {
            addCriterion("POLICY_CONTENT in", values, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentNotIn(List<String> values) {
            addCriterion("POLICY_CONTENT not in", values, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentBetween(String value1, String value2) {
            addCriterion("POLICY_CONTENT between", value1, value2, "policyContent");
            return (Criteria) this;
        }

        public Criteria andPolicyContentNotBetween(String value1, String value2) {
            addCriterion("POLICY_CONTENT not between", value1, value2, "policyContent");
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