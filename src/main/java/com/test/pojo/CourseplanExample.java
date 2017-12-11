package com.test.pojo;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andMonsEqualTo(Date value) {
            addCriterion("mons =", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsNotEqualTo(Date value) {
            addCriterion("mons <>", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsGreaterThan(Date value) {
            addCriterion("mons >", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsGreaterThanOrEqualTo(Date value) {
            addCriterion("mons >=", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsLessThan(Date value) {
            addCriterion("mons <", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsLessThanOrEqualTo(Date value) {
            addCriterion("mons <=", value, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsIn(List<Date> values) {
            addCriterion("mons in", values, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsNotIn(List<Date> values) {
            addCriterion("mons not in", values, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsBetween(Date value1, Date value2) {
            addCriterion("mons between", value1, value2, "mons");
            return (Criteria) this;
        }

        public Criteria andMonsNotBetween(Date value1, Date value2) {
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

        public Criteria andMoneEqualTo(Date value) {
            addCriterion("mone =", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneNotEqualTo(Date value) {
            addCriterion("mone <>", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneGreaterThan(Date value) {
            addCriterion("mone >", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneGreaterThanOrEqualTo(Date value) {
            addCriterion("mone >=", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneLessThan(Date value) {
            addCriterion("mone <", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneLessThanOrEqualTo(Date value) {
            addCriterion("mone <=", value, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneIn(List<Date> values) {
            addCriterion("mone in", values, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneNotIn(List<Date> values) {
            addCriterion("mone not in", values, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneBetween(Date value1, Date value2) {
            addCriterion("mone between", value1, value2, "mone");
            return (Criteria) this;
        }

        public Criteria andMoneNotBetween(Date value1, Date value2) {
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

        public Criteria andTuesEqualTo(Date value) {
            addCriterion("tues =", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesNotEqualTo(Date value) {
            addCriterion("tues <>", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesGreaterThan(Date value) {
            addCriterion("tues >", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesGreaterThanOrEqualTo(Date value) {
            addCriterion("tues >=", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesLessThan(Date value) {
            addCriterion("tues <", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesLessThanOrEqualTo(Date value) {
            addCriterion("tues <=", value, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesIn(List<Date> values) {
            addCriterion("tues in", values, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesNotIn(List<Date> values) {
            addCriterion("tues not in", values, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesBetween(Date value1, Date value2) {
            addCriterion("tues between", value1, value2, "tues");
            return (Criteria) this;
        }

        public Criteria andTuesNotBetween(Date value1, Date value2) {
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

        public Criteria andTuedEqualTo(Date value) {
            addCriterion("tued =", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedNotEqualTo(Date value) {
            addCriterion("tued <>", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedGreaterThan(Date value) {
            addCriterion("tued >", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedGreaterThanOrEqualTo(Date value) {
            addCriterion("tued >=", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedLessThan(Date value) {
            addCriterion("tued <", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedLessThanOrEqualTo(Date value) {
            addCriterion("tued <=", value, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedIn(List<Date> values) {
            addCriterion("tued in", values, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedNotIn(List<Date> values) {
            addCriterion("tued not in", values, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedBetween(Date value1, Date value2) {
            addCriterion("tued between", value1, value2, "tued");
            return (Criteria) this;
        }

        public Criteria andTuedNotBetween(Date value1, Date value2) {
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

        public Criteria andWedsEqualTo(Date value) {
            addCriterion("weds =", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsNotEqualTo(Date value) {
            addCriterion("weds <>", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsGreaterThan(Date value) {
            addCriterion("weds >", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsGreaterThanOrEqualTo(Date value) {
            addCriterion("weds >=", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsLessThan(Date value) {
            addCriterion("weds <", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsLessThanOrEqualTo(Date value) {
            addCriterion("weds <=", value, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsIn(List<Date> values) {
            addCriterion("weds in", values, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsNotIn(List<Date> values) {
            addCriterion("weds not in", values, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsBetween(Date value1, Date value2) {
            addCriterion("weds between", value1, value2, "weds");
            return (Criteria) this;
        }

        public Criteria andWedsNotBetween(Date value1, Date value2) {
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

        public Criteria andWedeEqualTo(Date value) {
            addCriterion("wede =", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeNotEqualTo(Date value) {
            addCriterion("wede <>", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeGreaterThan(Date value) {
            addCriterion("wede >", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeGreaterThanOrEqualTo(Date value) {
            addCriterion("wede >=", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeLessThan(Date value) {
            addCriterion("wede <", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeLessThanOrEqualTo(Date value) {
            addCriterion("wede <=", value, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeIn(List<Date> values) {
            addCriterion("wede in", values, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeNotIn(List<Date> values) {
            addCriterion("wede not in", values, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeBetween(Date value1, Date value2) {
            addCriterion("wede between", value1, value2, "wede");
            return (Criteria) this;
        }

        public Criteria andWedeNotBetween(Date value1, Date value2) {
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

        public Criteria andThursEqualTo(Date value) {
            addCriterion("thurs =", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursNotEqualTo(Date value) {
            addCriterion("thurs <>", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursGreaterThan(Date value) {
            addCriterion("thurs >", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursGreaterThanOrEqualTo(Date value) {
            addCriterion("thurs >=", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursLessThan(Date value) {
            addCriterion("thurs <", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursLessThanOrEqualTo(Date value) {
            addCriterion("thurs <=", value, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursIn(List<Date> values) {
            addCriterion("thurs in", values, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursNotIn(List<Date> values) {
            addCriterion("thurs not in", values, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursBetween(Date value1, Date value2) {
            addCriterion("thurs between", value1, value2, "thurs");
            return (Criteria) this;
        }

        public Criteria andThursNotBetween(Date value1, Date value2) {
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

        public Criteria andThureEqualTo(Date value) {
            addCriterion("thure =", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureNotEqualTo(Date value) {
            addCriterion("thure <>", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureGreaterThan(Date value) {
            addCriterion("thure >", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureGreaterThanOrEqualTo(Date value) {
            addCriterion("thure >=", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureLessThan(Date value) {
            addCriterion("thure <", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureLessThanOrEqualTo(Date value) {
            addCriterion("thure <=", value, "thure");
            return (Criteria) this;
        }

        public Criteria andThureIn(List<Date> values) {
            addCriterion("thure in", values, "thure");
            return (Criteria) this;
        }

        public Criteria andThureNotIn(List<Date> values) {
            addCriterion("thure not in", values, "thure");
            return (Criteria) this;
        }

        public Criteria andThureBetween(Date value1, Date value2) {
            addCriterion("thure between", value1, value2, "thure");
            return (Criteria) this;
        }

        public Criteria andThureNotBetween(Date value1, Date value2) {
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

        public Criteria andFrisEqualTo(Date value) {
            addCriterion("fris =", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisNotEqualTo(Date value) {
            addCriterion("fris <>", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisGreaterThan(Date value) {
            addCriterion("fris >", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisGreaterThanOrEqualTo(Date value) {
            addCriterion("fris >=", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisLessThan(Date value) {
            addCriterion("fris <", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisLessThanOrEqualTo(Date value) {
            addCriterion("fris <=", value, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisIn(List<Date> values) {
            addCriterion("fris in", values, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisNotIn(List<Date> values) {
            addCriterion("fris not in", values, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisBetween(Date value1, Date value2) {
            addCriterion("fris between", value1, value2, "fris");
            return (Criteria) this;
        }

        public Criteria andFrisNotBetween(Date value1, Date value2) {
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

        public Criteria andFrieEqualTo(Date value) {
            addCriterion("frie =", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieNotEqualTo(Date value) {
            addCriterion("frie <>", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieGreaterThan(Date value) {
            addCriterion("frie >", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieGreaterThanOrEqualTo(Date value) {
            addCriterion("frie >=", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieLessThan(Date value) {
            addCriterion("frie <", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieLessThanOrEqualTo(Date value) {
            addCriterion("frie <=", value, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieIn(List<Date> values) {
            addCriterion("frie in", values, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieNotIn(List<Date> values) {
            addCriterion("frie not in", values, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieBetween(Date value1, Date value2) {
            addCriterion("frie between", value1, value2, "frie");
            return (Criteria) this;
        }

        public Criteria andFrieNotBetween(Date value1, Date value2) {
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

        public Criteria andSatsEqualTo(Date value) {
            addCriterion("sats =", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsNotEqualTo(Date value) {
            addCriterion("sats <>", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsGreaterThan(Date value) {
            addCriterion("sats >", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsGreaterThanOrEqualTo(Date value) {
            addCriterion("sats >=", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsLessThan(Date value) {
            addCriterion("sats <", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsLessThanOrEqualTo(Date value) {
            addCriterion("sats <=", value, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsIn(List<Date> values) {
            addCriterion("sats in", values, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsNotIn(List<Date> values) {
            addCriterion("sats not in", values, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsBetween(Date value1, Date value2) {
            addCriterion("sats between", value1, value2, "sats");
            return (Criteria) this;
        }

        public Criteria andSatsNotBetween(Date value1, Date value2) {
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

        public Criteria andSateEqualTo(Date value) {
            addCriterion("sate =", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateNotEqualTo(Date value) {
            addCriterion("sate <>", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateGreaterThan(Date value) {
            addCriterion("sate >", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateGreaterThanOrEqualTo(Date value) {
            addCriterion("sate >=", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateLessThan(Date value) {
            addCriterion("sate <", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateLessThanOrEqualTo(Date value) {
            addCriterion("sate <=", value, "sate");
            return (Criteria) this;
        }

        public Criteria andSateIn(List<Date> values) {
            addCriterion("sate in", values, "sate");
            return (Criteria) this;
        }

        public Criteria andSateNotIn(List<Date> values) {
            addCriterion("sate not in", values, "sate");
            return (Criteria) this;
        }

        public Criteria andSateBetween(Date value1, Date value2) {
            addCriterion("sate between", value1, value2, "sate");
            return (Criteria) this;
        }

        public Criteria andSateNotBetween(Date value1, Date value2) {
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

        public Criteria andSunsEqualTo(Date value) {
            addCriterion("suns =", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsNotEqualTo(Date value) {
            addCriterion("suns <>", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsGreaterThan(Date value) {
            addCriterion("suns >", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsGreaterThanOrEqualTo(Date value) {
            addCriterion("suns >=", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsLessThan(Date value) {
            addCriterion("suns <", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsLessThanOrEqualTo(Date value) {
            addCriterion("suns <=", value, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsIn(List<Date> values) {
            addCriterion("suns in", values, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsNotIn(List<Date> values) {
            addCriterion("suns not in", values, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsBetween(Date value1, Date value2) {
            addCriterion("suns between", value1, value2, "suns");
            return (Criteria) this;
        }

        public Criteria andSunsNotBetween(Date value1, Date value2) {
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

        public Criteria andSuneEqualTo(Date value) {
            addCriterion("sune =", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneNotEqualTo(Date value) {
            addCriterion("sune <>", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneGreaterThan(Date value) {
            addCriterion("sune >", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneGreaterThanOrEqualTo(Date value) {
            addCriterion("sune >=", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneLessThan(Date value) {
            addCriterion("sune <", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneLessThanOrEqualTo(Date value) {
            addCriterion("sune <=", value, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneIn(List<Date> values) {
            addCriterion("sune in", values, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneNotIn(List<Date> values) {
            addCriterion("sune not in", values, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneBetween(Date value1, Date value2) {
            addCriterion("sune between", value1, value2, "sune");
            return (Criteria) this;
        }

        public Criteria andSuneNotBetween(Date value1, Date value2) {
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