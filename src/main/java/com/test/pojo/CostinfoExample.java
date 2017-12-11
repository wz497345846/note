package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class CostinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CostinfoExample() {
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

        public Criteria andCostinfoidIsNull() {
            addCriterion("costinfoid is null");
            return (Criteria) this;
        }

        public Criteria andCostinfoidIsNotNull() {
            addCriterion("costinfoid is not null");
            return (Criteria) this;
        }

        public Criteria andCostinfoidEqualTo(Integer value) {
            addCriterion("costinfoid =", value, "costinfoid");
            return (Criteria) this;
        }

        public Criteria andCostinfoidNotEqualTo(Integer value) {
            addCriterion("costinfoid <>", value, "costinfoid");
            return (Criteria) this;
        }

        public Criteria andCostinfoidGreaterThan(Integer value) {
            addCriterion("costinfoid >", value, "costinfoid");
            return (Criteria) this;
        }

        public Criteria andCostinfoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("costinfoid >=", value, "costinfoid");
            return (Criteria) this;
        }

        public Criteria andCostinfoidLessThan(Integer value) {
            addCriterion("costinfoid <", value, "costinfoid");
            return (Criteria) this;
        }

        public Criteria andCostinfoidLessThanOrEqualTo(Integer value) {
            addCriterion("costinfoid <=", value, "costinfoid");
            return (Criteria) this;
        }

        public Criteria andCostinfoidIn(List<Integer> values) {
            addCriterion("costinfoid in", values, "costinfoid");
            return (Criteria) this;
        }

        public Criteria andCostinfoidNotIn(List<Integer> values) {
            addCriterion("costinfoid not in", values, "costinfoid");
            return (Criteria) this;
        }

        public Criteria andCostinfoidBetween(Integer value1, Integer value2) {
            addCriterion("costinfoid between", value1, value2, "costinfoid");
            return (Criteria) this;
        }

        public Criteria andCostinfoidNotBetween(Integer value1, Integer value2) {
            addCriterion("costinfoid not between", value1, value2, "costinfoid");
            return (Criteria) this;
        }

        public Criteria andBillidIsNull() {
            addCriterion("billid is null");
            return (Criteria) this;
        }

        public Criteria andBillidIsNotNull() {
            addCriterion("billid is not null");
            return (Criteria) this;
        }

        public Criteria andBillidEqualTo(Integer value) {
            addCriterion("billid =", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotEqualTo(Integer value) {
            addCriterion("billid <>", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThan(Integer value) {
            addCriterion("billid >", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThanOrEqualTo(Integer value) {
            addCriterion("billid >=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThan(Integer value) {
            addCriterion("billid <", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThanOrEqualTo(Integer value) {
            addCriterion("billid <=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidIn(List<Integer> values) {
            addCriterion("billid in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotIn(List<Integer> values) {
            addCriterion("billid not in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidBetween(Integer value1, Integer value2) {
            addCriterion("billid between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotBetween(Integer value1, Integer value2) {
            addCriterion("billid not between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andCostiteamIsNull() {
            addCriterion("costiteam is null");
            return (Criteria) this;
        }

        public Criteria andCostiteamIsNotNull() {
            addCriterion("costiteam is not null");
            return (Criteria) this;
        }

        public Criteria andCostiteamEqualTo(Integer value) {
            addCriterion("costiteam =", value, "costiteam");
            return (Criteria) this;
        }

        public Criteria andCostiteamNotEqualTo(Integer value) {
            addCriterion("costiteam <>", value, "costiteam");
            return (Criteria) this;
        }

        public Criteria andCostiteamGreaterThan(Integer value) {
            addCriterion("costiteam >", value, "costiteam");
            return (Criteria) this;
        }

        public Criteria andCostiteamGreaterThanOrEqualTo(Integer value) {
            addCriterion("costiteam >=", value, "costiteam");
            return (Criteria) this;
        }

        public Criteria andCostiteamLessThan(Integer value) {
            addCriterion("costiteam <", value, "costiteam");
            return (Criteria) this;
        }

        public Criteria andCostiteamLessThanOrEqualTo(Integer value) {
            addCriterion("costiteam <=", value, "costiteam");
            return (Criteria) this;
        }

        public Criteria andCostiteamIn(List<Integer> values) {
            addCriterion("costiteam in", values, "costiteam");
            return (Criteria) this;
        }

        public Criteria andCostiteamNotIn(List<Integer> values) {
            addCriterion("costiteam not in", values, "costiteam");
            return (Criteria) this;
        }

        public Criteria andCostiteamBetween(Integer value1, Integer value2) {
            addCriterion("costiteam between", value1, value2, "costiteam");
            return (Criteria) this;
        }

        public Criteria andCostiteamNotBetween(Integer value1, Integer value2) {
            addCriterion("costiteam not between", value1, value2, "costiteam");
            return (Criteria) this;
        }

        public Criteria andCostplandescIsNull() {
            addCriterion("costplandesc is null");
            return (Criteria) this;
        }

        public Criteria andCostplandescIsNotNull() {
            addCriterion("costplandesc is not null");
            return (Criteria) this;
        }

        public Criteria andCostplandescEqualTo(String value) {
            addCriterion("costplandesc =", value, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescNotEqualTo(String value) {
            addCriterion("costplandesc <>", value, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescGreaterThan(String value) {
            addCriterion("costplandesc >", value, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescGreaterThanOrEqualTo(String value) {
            addCriterion("costplandesc >=", value, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescLessThan(String value) {
            addCriterion("costplandesc <", value, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescLessThanOrEqualTo(String value) {
            addCriterion("costplandesc <=", value, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescLike(String value) {
            addCriterion("costplandesc like", value, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescNotLike(String value) {
            addCriterion("costplandesc not like", value, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescIn(List<String> values) {
            addCriterion("costplandesc in", values, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescNotIn(List<String> values) {
            addCriterion("costplandesc not in", values, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescBetween(String value1, String value2) {
            addCriterion("costplandesc between", value1, value2, "costplandesc");
            return (Criteria) this;
        }

        public Criteria andCostplandescNotBetween(String value1, String value2) {
            addCriterion("costplandesc not between", value1, value2, "costplandesc");
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