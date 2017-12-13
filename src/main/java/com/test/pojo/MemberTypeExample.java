package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class MemberTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberTypeExample() {
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

        public Criteria andMembertypeIdIsNull() {
            addCriterion("membertype_id is null");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdIsNotNull() {
            addCriterion("membertype_id is not null");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdEqualTo(Integer value) {
            addCriterion("membertype_id =", value, "membertypeId");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdNotEqualTo(Integer value) {
            addCriterion("membertype_id <>", value, "membertypeId");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdGreaterThan(Integer value) {
            addCriterion("membertype_id >", value, "membertypeId");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("membertype_id >=", value, "membertypeId");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdLessThan(Integer value) {
            addCriterion("membertype_id <", value, "membertypeId");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("membertype_id <=", value, "membertypeId");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdIn(List<Integer> values) {
            addCriterion("membertype_id in", values, "membertypeId");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdNotIn(List<Integer> values) {
            addCriterion("membertype_id not in", values, "membertypeId");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdBetween(Integer value1, Integer value2) {
            addCriterion("membertype_id between", value1, value2, "membertypeId");
            return (Criteria) this;
        }

        public Criteria andMembertypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("membertype_id not between", value1, value2, "membertypeId");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameIsNull() {
            addCriterion("membertype_name is null");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameIsNotNull() {
            addCriterion("membertype_name is not null");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameEqualTo(String value) {
            addCriterion("membertype_name =", value, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameNotEqualTo(String value) {
            addCriterion("membertype_name <>", value, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameGreaterThan(String value) {
            addCriterion("membertype_name >", value, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("membertype_name >=", value, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameLessThan(String value) {
            addCriterion("membertype_name <", value, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameLessThanOrEqualTo(String value) {
            addCriterion("membertype_name <=", value, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameLike(String value) {
            addCriterion("membertype_name like", value, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameNotLike(String value) {
            addCriterion("membertype_name not like", value, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameIn(List<String> values) {
            addCriterion("membertype_name in", values, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameNotIn(List<String> values) {
            addCriterion("membertype_name not in", values, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameBetween(String value1, String value2) {
            addCriterion("membertype_name between", value1, value2, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeNameNotBetween(String value1, String value2) {
            addCriterion("membertype_name not between", value1, value2, "membertypeName");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostIsNull() {
            addCriterion("membertype_cost is null");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostIsNotNull() {
            addCriterion("membertype_cost is not null");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostEqualTo(Double value) {
            addCriterion("membertype_cost =", value, "membertypeCost");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostNotEqualTo(Double value) {
            addCriterion("membertype_cost <>", value, "membertypeCost");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostGreaterThan(Double value) {
            addCriterion("membertype_cost >", value, "membertypeCost");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostGreaterThanOrEqualTo(Double value) {
            addCriterion("membertype_cost >=", value, "membertypeCost");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostLessThan(Double value) {
            addCriterion("membertype_cost <", value, "membertypeCost");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostLessThanOrEqualTo(Double value) {
            addCriterion("membertype_cost <=", value, "membertypeCost");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostIn(List<Double> values) {
            addCriterion("membertype_cost in", values, "membertypeCost");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostNotIn(List<Double> values) {
            addCriterion("membertype_cost not in", values, "membertypeCost");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostBetween(Double value1, Double value2) {
            addCriterion("membertype_cost between", value1, value2, "membertypeCost");
            return (Criteria) this;
        }

        public Criteria andMembertypeCostNotBetween(Double value1, Double value2) {
            addCriterion("membertype_cost not between", value1, value2, "membertypeCost");
            return (Criteria) this;
        }

        public Criteria andMonthTimeIsNull() {
            addCriterion("month_time is null");
            return (Criteria) this;
        }

        public Criteria andMonthTimeIsNotNull() {
            addCriterion("month_time is not null");
            return (Criteria) this;
        }

        public Criteria andMonthTimeEqualTo(Integer value) {
            addCriterion("month_time =", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeNotEqualTo(Integer value) {
            addCriterion("month_time <>", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeGreaterThan(Integer value) {
            addCriterion("month_time >", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("month_time >=", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeLessThan(Integer value) {
            addCriterion("month_time <", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeLessThanOrEqualTo(Integer value) {
            addCriterion("month_time <=", value, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeIn(List<Integer> values) {
            addCriterion("month_time in", values, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeNotIn(List<Integer> values) {
            addCriterion("month_time not in", values, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeBetween(Integer value1, Integer value2) {
            addCriterion("month_time between", value1, value2, "monthTime");
            return (Criteria) this;
        }

        public Criteria andMonthTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("month_time not between", value1, value2, "monthTime");
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