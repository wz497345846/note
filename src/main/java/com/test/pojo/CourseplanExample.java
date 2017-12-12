package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseplanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseplanExample() {
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

        public Criteria andCourseidIsNull() {
            addCriterion("courseid is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseid =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseid <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseid >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseid >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseid <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseid <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseid in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseid not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseid between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseid not between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andMonsIsNull() {
            addCriterion("mons is null");
            return (Criteria) this;
        }

        public Criteria andMonsIsNotNull() {
            addCriterion("mons is not null");
            return (Criteria) this;
        }

        public Criteria andMonsEqualTo(String value) {
            addCriterion("mons =", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsNotEqualTo(String value) {
            addCriterion("mons <>", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsGreaterThan(String value) {
            addCriterion("mons >", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsGreaterThanOrEqualTo(String value) {
            addCriterion("mons >=", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsLessThan(String value) {
            addCriterion("mons <", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsLessThanOrEqualTo(String value) {
            addCriterion("mons <=", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsLike(String value) {
            addCriterion("mons like", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsNotLike(String value) {
            addCriterion("mons not like", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsIn(List<String> values) {
            addCriterion("mons in", values, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsNotIn(List<String> values) {
            addCriterion("mons not in", values, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsBetween(String value1, String value2) {
            addCriterion("mons between", value1, value2, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsNotBetween(String value1, String value2) {
            addCriterion("mons not between", value1, value2, "mons");
            return (Criteria) this;
        }

        public Criteria andMoneIsNull() {
            addCriterion("mone is null");
            return (Criteria) this;
        }

        public Criteria andMoneIsNotNull() {
            addCriterion("mone is not null");
            return (Criteria) this;
        }

        public Criteria andMoneEqualTo(String value) {
            addCriterion("mone =", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneNotEqualTo(String value) {
            addCriterion("mone <>", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneGreaterThan(String value) {
            addCriterion("mone >", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneGreaterThanOrEqualTo(String value) {
            addCriterion("mone >=", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneLessThan(String value) {
            addCriterion("mone <", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneLessThanOrEqualTo(String value) {
            addCriterion("mone <=", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneLike(String value) {
            addCriterion("mone like", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneNotLike(String value) {
            addCriterion("mone not like", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneIn(List<String> values) {
            addCriterion("mone in", values, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneNotIn(List<String> values) {
            addCriterion("mone not in", values, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneBetween(String value1, String value2) {
            addCriterion("mone between", value1, value2, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneNotBetween(String value1, String value2) {
            addCriterion("mone not between", value1, value2, "mone");
            return (Criteria) this;
        }

        public Criteria andTuesIsNull() {
            addCriterion("tues is null");
            return (Criteria) this;
        }

        public Criteria andTuesIsNotNull() {
            addCriterion("tues is not null");
            return (Criteria) this;
        }

        public Criteria andTuesEqualTo(String value) {
            addCriterion("tues =", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesNotEqualTo(String value) {
            addCriterion("tues <>", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesGreaterThan(String value) {
            addCriterion("tues >", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesGreaterThanOrEqualTo(String value) {
            addCriterion("tues >=", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesLessThan(String value) {
            addCriterion("tues <", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesLessThanOrEqualTo(String value) {
            addCriterion("tues <=", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesLike(String value) {
            addCriterion("tues like", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesNotLike(String value) {
            addCriterion("tues not like", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesIn(List<String> values) {
            addCriterion("tues in", values, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesNotIn(List<String> values) {
            addCriterion("tues not in", values, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesBetween(String value1, String value2) {
            addCriterion("tues between", value1, value2, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesNotBetween(String value1, String value2) {
            addCriterion("tues not between", value1, value2, "tues");
            return (Criteria) this;
        }

        public Criteria andTuedIsNull() {
            addCriterion("tued is null");
            return (Criteria) this;
        }

        public Criteria andTuedIsNotNull() {
            addCriterion("tued is not null");
            return (Criteria) this;
        }

        public Criteria andTuedEqualTo(String value) {
            addCriterion("tued =", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedNotEqualTo(String value) {
            addCriterion("tued <>", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedGreaterThan(String value) {
            addCriterion("tued >", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedGreaterThanOrEqualTo(String value) {
            addCriterion("tued >=", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedLessThan(String value) {
            addCriterion("tued <", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedLessThanOrEqualTo(String value) {
            addCriterion("tued <=", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedLike(String value) {
            addCriterion("tued like", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedNotLike(String value) {
            addCriterion("tued not like", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedIn(List<String> values) {
            addCriterion("tued in", values, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedNotIn(List<String> values) {
            addCriterion("tued not in", values, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedBetween(String value1, String value2) {
            addCriterion("tued between", value1, value2, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedNotBetween(String value1, String value2) {
            addCriterion("tued not between", value1, value2, "tued");
            return (Criteria) this;
        }

        public Criteria andWedsIsNull() {
            addCriterion("weds is null");
            return (Criteria) this;
        }

        public Criteria andWedsIsNotNull() {
            addCriterion("weds is not null");
            return (Criteria) this;
        }

        public Criteria andWedsEqualTo(String value) {
            addCriterion("weds =", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsNotEqualTo(String value) {
            addCriterion("weds <>", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsGreaterThan(String value) {
            addCriterion("weds >", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsGreaterThanOrEqualTo(String value) {
            addCriterion("weds >=", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsLessThan(String value) {
            addCriterion("weds <", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsLessThanOrEqualTo(String value) {
            addCriterion("weds <=", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsLike(String value) {
            addCriterion("weds like", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsNotLike(String value) {
            addCriterion("weds not like", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsIn(List<String> values) {
            addCriterion("weds in", values, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsNotIn(List<String> values) {
            addCriterion("weds not in", values, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsBetween(String value1, String value2) {
            addCriterion("weds between", value1, value2, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsNotBetween(String value1, String value2) {
            addCriterion("weds not between", value1, value2, "weds");
            return (Criteria) this;
        }

        public Criteria andWedeIsNull() {
            addCriterion("wede is null");
            return (Criteria) this;
        }

        public Criteria andWedeIsNotNull() {
            addCriterion("wede is not null");
            return (Criteria) this;
        }

        public Criteria andWedeEqualTo(String value) {
            addCriterion("wede =", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeNotEqualTo(String value) {
            addCriterion("wede <>", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeGreaterThan(String value) {
            addCriterion("wede >", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeGreaterThanOrEqualTo(String value) {
            addCriterion("wede >=", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeLessThan(String value) {
            addCriterion("wede <", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeLessThanOrEqualTo(String value) {
            addCriterion("wede <=", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeLike(String value) {
            addCriterion("wede like", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeNotLike(String value) {
            addCriterion("wede not like", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeIn(List<String> values) {
            addCriterion("wede in", values, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeNotIn(List<String> values) {
            addCriterion("wede not in", values, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeBetween(String value1, String value2) {
            addCriterion("wede between", value1, value2, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeNotBetween(String value1, String value2) {
            addCriterion("wede not between", value1, value2, "wede");
            return (Criteria) this;
        }

        public Criteria andThursIsNull() {
            addCriterion("thurs is null");
            return (Criteria) this;
        }

        public Criteria andThursIsNotNull() {
            addCriterion("thurs is not null");
            return (Criteria) this;
        }

        public Criteria andThursEqualTo(String value) {
            addCriterion("thurs =", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursNotEqualTo(String value) {
            addCriterion("thurs <>", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursGreaterThan(String value) {
            addCriterion("thurs >", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursGreaterThanOrEqualTo(String value) {
            addCriterion("thurs >=", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursLessThan(String value) {
            addCriterion("thurs <", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursLessThanOrEqualTo(String value) {
            addCriterion("thurs <=", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursLike(String value) {
            addCriterion("thurs like", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursNotLike(String value) {
            addCriterion("thurs not like", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursIn(List<String> values) {
            addCriterion("thurs in", values, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursNotIn(List<String> values) {
            addCriterion("thurs not in", values, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursBetween(String value1, String value2) {
            addCriterion("thurs between", value1, value2, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursNotBetween(String value1, String value2) {
            addCriterion("thurs not between", value1, value2, "thurs");
            return (Criteria) this;
        }

        public Criteria andThureIsNull() {
            addCriterion("thure is null");
            return (Criteria) this;
        }

        public Criteria andThureIsNotNull() {
            addCriterion("thure is not null");
            return (Criteria) this;
        }

        public Criteria andThureEqualTo(String value) {
            addCriterion("thure =", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureNotEqualTo(String value) {
            addCriterion("thure <>", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureGreaterThan(String value) {
            addCriterion("thure >", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureGreaterThanOrEqualTo(String value) {
            addCriterion("thure >=", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureLessThan(String value) {
            addCriterion("thure <", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureLessThanOrEqualTo(String value) {
            addCriterion("thure <=", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureLike(String value) {
            addCriterion("thure like", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureNotLike(String value) {
            addCriterion("thure not like", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureIn(List<String> values) {
            addCriterion("thure in", values, "thure");
            return (Criteria) this;
        }

        public Criteria andThureNotIn(List<String> values) {
            addCriterion("thure not in", values, "thure");
            return (Criteria) this;
        }

        public Criteria andThureBetween(String value1, String value2) {
            addCriterion("thure between", value1, value2, "thure");
            return (Criteria) this;
        }

        public Criteria andThureNotBetween(String value1, String value2) {
            addCriterion("thure not between", value1, value2, "thure");
            return (Criteria) this;
        }

        public Criteria andFrisIsNull() {
            addCriterion("fris is null");
            return (Criteria) this;
        }

        public Criteria andFrisIsNotNull() {
            addCriterion("fris is not null");
            return (Criteria) this;
        }

        public Criteria andFrisEqualTo(String value) {
            addCriterion("fris =", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisNotEqualTo(String value) {
            addCriterion("fris <>", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisGreaterThan(String value) {
            addCriterion("fris >", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisGreaterThanOrEqualTo(String value) {
            addCriterion("fris >=", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisLessThan(String value) {
            addCriterion("fris <", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisLessThanOrEqualTo(String value) {
            addCriterion("fris <=", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisLike(String value) {
            addCriterion("fris like", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisNotLike(String value) {
            addCriterion("fris not like", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisIn(List<String> values) {
            addCriterion("fris in", values, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisNotIn(List<String> values) {
            addCriterion("fris not in", values, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisBetween(String value1, String value2) {
            addCriterion("fris between", value1, value2, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisNotBetween(String value1, String value2) {
            addCriterion("fris not between", value1, value2, "fris");
            return (Criteria) this;
        }

        public Criteria andFrieIsNull() {
            addCriterion("frie is null");
            return (Criteria) this;
        }

        public Criteria andFrieIsNotNull() {
            addCriterion("frie is not null");
            return (Criteria) this;
        }

        public Criteria andFrieEqualTo(String value) {
            addCriterion("frie =", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieNotEqualTo(String value) {
            addCriterion("frie <>", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieGreaterThan(String value) {
            addCriterion("frie >", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieGreaterThanOrEqualTo(String value) {
            addCriterion("frie >=", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieLessThan(String value) {
            addCriterion("frie <", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieLessThanOrEqualTo(String value) {
            addCriterion("frie <=", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieLike(String value) {
            addCriterion("frie like", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieNotLike(String value) {
            addCriterion("frie not like", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieIn(List<String> values) {
            addCriterion("frie in", values, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieNotIn(List<String> values) {
            addCriterion("frie not in", values, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieBetween(String value1, String value2) {
            addCriterion("frie between", value1, value2, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieNotBetween(String value1, String value2) {
            addCriterion("frie not between", value1, value2, "frie");
            return (Criteria) this;
        }

        public Criteria andSatsIsNull() {
            addCriterion("sats is null");
            return (Criteria) this;
        }

        public Criteria andSatsIsNotNull() {
            addCriterion("sats is not null");
            return (Criteria) this;
        }

        public Criteria andSatsEqualTo(String value) {
            addCriterion("sats =", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsNotEqualTo(String value) {
            addCriterion("sats <>", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsGreaterThan(String value) {
            addCriterion("sats >", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsGreaterThanOrEqualTo(String value) {
            addCriterion("sats >=", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsLessThan(String value) {
            addCriterion("sats <", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsLessThanOrEqualTo(String value) {
            addCriterion("sats <=", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsLike(String value) {
            addCriterion("sats like", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsNotLike(String value) {
            addCriterion("sats not like", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsIn(List<String> values) {
            addCriterion("sats in", values, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsNotIn(List<String> values) {
            addCriterion("sats not in", values, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsBetween(String value1, String value2) {
            addCriterion("sats between", value1, value2, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsNotBetween(String value1, String value2) {
            addCriterion("sats not between", value1, value2, "sats");
            return (Criteria) this;
        }

        public Criteria andSateIsNull() {
            addCriterion("sate is null");
            return (Criteria) this;
        }

        public Criteria andSateIsNotNull() {
            addCriterion("sate is not null");
            return (Criteria) this;
        }

        public Criteria andSateEqualTo(String value) {
            addCriterion("sate =", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateNotEqualTo(String value) {
            addCriterion("sate <>", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateGreaterThan(String value) {
            addCriterion("sate >", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateGreaterThanOrEqualTo(String value) {
            addCriterion("sate >=", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateLessThan(String value) {
            addCriterion("sate <", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateLessThanOrEqualTo(String value) {
            addCriterion("sate <=", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateLike(String value) {
            addCriterion("sate like", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateNotLike(String value) {
            addCriterion("sate not like", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateIn(List<String> values) {
            addCriterion("sate in", values, "sate");
            return (Criteria) this;
        }

        public Criteria andSateNotIn(List<String> values) {
            addCriterion("sate not in", values, "sate");
            return (Criteria) this;
        }

        public Criteria andSateBetween(String value1, String value2) {
            addCriterion("sate between", value1, value2, "sate");
            return (Criteria) this;
        }

        public Criteria andSateNotBetween(String value1, String value2) {
            addCriterion("sate not between", value1, value2, "sate");
            return (Criteria) this;
        }

        public Criteria andSunsIsNull() {
            addCriterion("suns is null");
            return (Criteria) this;
        }

        public Criteria andSunsIsNotNull() {
            addCriterion("suns is not null");
            return (Criteria) this;
        }

        public Criteria andSunsEqualTo(String value) {
            addCriterion("suns =", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsNotEqualTo(String value) {
            addCriterion("suns <>", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsGreaterThan(String value) {
            addCriterion("suns >", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsGreaterThanOrEqualTo(String value) {
            addCriterion("suns >=", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsLessThan(String value) {
            addCriterion("suns <", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsLessThanOrEqualTo(String value) {
            addCriterion("suns <=", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsLike(String value) {
            addCriterion("suns like", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsNotLike(String value) {
            addCriterion("suns not like", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsIn(List<String> values) {
            addCriterion("suns in", values, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsNotIn(List<String> values) {
            addCriterion("suns not in", values, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsBetween(String value1, String value2) {
            addCriterion("suns between", value1, value2, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsNotBetween(String value1, String value2) {
            addCriterion("suns not between", value1, value2, "suns");
            return (Criteria) this;
        }

        public Criteria andSuneIsNull() {
            addCriterion("sune is null");
            return (Criteria) this;
        }

        public Criteria andSuneIsNotNull() {
            addCriterion("sune is not null");
            return (Criteria) this;
        }

        public Criteria andSuneEqualTo(String value) {
            addCriterion("sune =", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneNotEqualTo(String value) {
            addCriterion("sune <>", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneGreaterThan(String value) {
            addCriterion("sune >", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneGreaterThanOrEqualTo(String value) {
            addCriterion("sune >=", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneLessThan(String value) {
            addCriterion("sune <", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneLessThanOrEqualTo(String value) {
            addCriterion("sune <=", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneLike(String value) {
            addCriterion("sune like", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneNotLike(String value) {
            addCriterion("sune not like", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneIn(List<String> values) {
            addCriterion("sune in", values, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneNotIn(List<String> values) {
            addCriterion("sune not in", values, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneBetween(String value1, String value2) {
            addCriterion("sune between", value1, value2, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneNotBetween(String value1, String value2) {
            addCriterion("sune not between", value1, value2, "sune");
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