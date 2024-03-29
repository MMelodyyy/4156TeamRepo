package com.java.rollercoaster.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class eventExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public eventExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andEventNameIsNull() {
            addCriterion("event_name is null");
            return (Criteria) this;
        }

        public Criteria andEventNameIsNotNull() {
            addCriterion("event_name is not null");
            return (Criteria) this;
        }

        public Criteria andEventNameEqualTo(String value) {
            addCriterion("event_name =", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotEqualTo(String value) {
            addCriterion("event_name <>", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThan(String value) {
            addCriterion("event_name >", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameGreaterThanOrEqualTo(String value) {
            addCriterion("event_name >=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThan(String value) {
            addCriterion("event_name <", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLessThanOrEqualTo(String value) {
            addCriterion("event_name <=", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameLike(String value) {
            addCriterion("event_name like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotLike(String value) {
            addCriterion("event_name not like", value, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameIn(List<String> values) {
            addCriterion("event_name in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotIn(List<String> values) {
            addCriterion("event_name not in", values, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameBetween(String value1, String value2) {
            addCriterion("event_name between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventNameNotBetween(String value1, String value2) {
            addCriterion("event_name not between", value1, value2, "eventName");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionIsNull() {
            addCriterion("event_introduction is null");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionIsNotNull() {
            addCriterion("event_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionEqualTo(String value) {
            addCriterion("event_introduction =", value, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionNotEqualTo(String value) {
            addCriterion("event_introduction <>", value, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionGreaterThan(String value) {
            addCriterion("event_introduction >", value, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("event_introduction >=", value, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionLessThan(String value) {
            addCriterion("event_introduction <", value, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionLessThanOrEqualTo(String value) {
            addCriterion("event_introduction <=", value, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionLike(String value) {
            addCriterion("event_introduction like", value, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionNotLike(String value) {
            addCriterion("event_introduction not like", value, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionIn(List<String> values) {
            addCriterion("event_introduction in", values, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionNotIn(List<String> values) {
            addCriterion("event_introduction not in", values, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionBetween(String value1, String value2) {
            addCriterion("event_introduction between", value1, value2, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andEventIntroductionNotBetween(String value1, String value2) {
            addCriterion("event_introduction not between", value1, value2, "eventIntroduction");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEventLocationIsNull() {
            addCriterion("event_location is null");
            return (Criteria) this;
        }

        public Criteria andEventLocationIsNotNull() {
            addCriterion("event_location is not null");
            return (Criteria) this;
        }

        public Criteria andEventLocationEqualTo(String value) {
            addCriterion("event_location =", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationNotEqualTo(String value) {
            addCriterion("event_location <>", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationGreaterThan(String value) {
            addCriterion("event_location >", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationGreaterThanOrEqualTo(String value) {
            addCriterion("event_location >=", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationLessThan(String value) {
            addCriterion("event_location <", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationLessThanOrEqualTo(String value) {
            addCriterion("event_location <=", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationLike(String value) {
            addCriterion("event_location like", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationNotLike(String value) {
            addCriterion("event_location not like", value, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationIn(List<String> values) {
            addCriterion("event_location in", values, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationNotIn(List<String> values) {
            addCriterion("event_location not in", values, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationBetween(String value1, String value2) {
            addCriterion("event_location between", value1, value2, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventLocationNotBetween(String value1, String value2) {
            addCriterion("event_location not between", value1, value2, "eventLocation");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsIsNull() {
            addCriterion("event_remain_positions is null");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsIsNotNull() {
            addCriterion("event_remain_positions is not null");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsEqualTo(Integer value) {
            addCriterion("event_remain_positions =", value, "eventRemainPositions");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsNotEqualTo(Integer value) {
            addCriterion("event_remain_positions <>", value, "eventRemainPositions");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsGreaterThan(Integer value) {
            addCriterion("event_remain_positions >", value, "eventRemainPositions");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("event_remain_positions >=", value, "eventRemainPositions");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsLessThan(Integer value) {
            addCriterion("event_remain_positions <", value, "eventRemainPositions");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsLessThanOrEqualTo(Integer value) {
            addCriterion("event_remain_positions <=", value, "eventRemainPositions");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsIn(List<Integer> values) {
            addCriterion("event_remain_positions in", values, "eventRemainPositions");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsNotIn(List<Integer> values) {
            addCriterion("event_remain_positions not in", values, "eventRemainPositions");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsBetween(Integer value1, Integer value2) {
            addCriterion("event_remain_positions between", value1, value2, "eventRemainPositions");
            return (Criteria) this;
        }

        public Criteria andEventRemainPositionsNotBetween(Integer value1, Integer value2) {
            addCriterion("event_remain_positions not between", value1, value2, "eventRemainPositions");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table event
     *
     * @mbggenerated do_not_delete_during_merge Fri Nov 06 12:17:04 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table event
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
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