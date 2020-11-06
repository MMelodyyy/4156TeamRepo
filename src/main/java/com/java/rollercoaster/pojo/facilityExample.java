package com.java.rollercoaster.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class facilityExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public facilityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facility
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
     * This method corresponds to the database table facility
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
     * This method corresponds to the database table facility
     *
     * @mbggenerated Fri Nov 06 12:17:04 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table facility
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
     * This class corresponds to the database table facility
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

        public Criteria andFacilityNameIsNull() {
            addCriterion("facility_name is null");
            return (Criteria) this;
        }

        public Criteria andFacilityNameIsNotNull() {
            addCriterion("facility_name is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityNameEqualTo(String value) {
            addCriterion("facility_name =", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotEqualTo(String value) {
            addCriterion("facility_name <>", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameGreaterThan(String value) {
            addCriterion("facility_name >", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameGreaterThanOrEqualTo(String value) {
            addCriterion("facility_name >=", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLessThan(String value) {
            addCriterion("facility_name <", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLessThanOrEqualTo(String value) {
            addCriterion("facility_name <=", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameLike(String value) {
            addCriterion("facility_name like", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotLike(String value) {
            addCriterion("facility_name not like", value, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameIn(List<String> values) {
            addCriterion("facility_name in", values, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotIn(List<String> values) {
            addCriterion("facility_name not in", values, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameBetween(String value1, String value2) {
            addCriterion("facility_name between", value1, value2, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityNameNotBetween(String value1, String value2) {
            addCriterion("facility_name not between", value1, value2, "facilityName");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusIsNull() {
            addCriterion("facility_status is null");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusIsNotNull() {
            addCriterion("facility_status is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusEqualTo(String value) {
            addCriterion("facility_status =", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusNotEqualTo(String value) {
            addCriterion("facility_status <>", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusGreaterThan(String value) {
            addCriterion("facility_status >", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusGreaterThanOrEqualTo(String value) {
            addCriterion("facility_status >=", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusLessThan(String value) {
            addCriterion("facility_status <", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusLessThanOrEqualTo(String value) {
            addCriterion("facility_status <=", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusLike(String value) {
            addCriterion("facility_status like", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusNotLike(String value) {
            addCriterion("facility_status not like", value, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusIn(List<String> values) {
            addCriterion("facility_status in", values, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusNotIn(List<String> values) {
            addCriterion("facility_status not in", values, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusBetween(String value1, String value2) {
            addCriterion("facility_status between", value1, value2, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityStatusNotBetween(String value1, String value2) {
            addCriterion("facility_status not between", value1, value2, "facilityStatus");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionIsNull() {
            addCriterion("facility_introduction is null");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionIsNotNull() {
            addCriterion("facility_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionEqualTo(String value) {
            addCriterion("facility_introduction =", value, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionNotEqualTo(String value) {
            addCriterion("facility_introduction <>", value, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionGreaterThan(String value) {
            addCriterion("facility_introduction >", value, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("facility_introduction >=", value, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionLessThan(String value) {
            addCriterion("facility_introduction <", value, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionLessThanOrEqualTo(String value) {
            addCriterion("facility_introduction <=", value, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionLike(String value) {
            addCriterion("facility_introduction like", value, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionNotLike(String value) {
            addCriterion("facility_introduction not like", value, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionIn(List<String> values) {
            addCriterion("facility_introduction in", values, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionNotIn(List<String> values) {
            addCriterion("facility_introduction not in", values, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionBetween(String value1, String value2) {
            addCriterion("facility_introduction between", value1, value2, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityIntroductionNotBetween(String value1, String value2) {
            addCriterion("facility_introduction not between", value1, value2, "facilityIntroduction");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeIsNull() {
            addCriterion("facility_open_time is null");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeIsNotNull() {
            addCriterion("facility_open_time is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeEqualTo(Date value) {
            addCriterionForJDBCTime("facility_open_time =", value, "facilityOpenTime");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("facility_open_time <>", value, "facilityOpenTime");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("facility_open_time >", value, "facilityOpenTime");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("facility_open_time >=", value, "facilityOpenTime");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeLessThan(Date value) {
            addCriterionForJDBCTime("facility_open_time <", value, "facilityOpenTime");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("facility_open_time <=", value, "facilityOpenTime");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeIn(List<Date> values) {
            addCriterionForJDBCTime("facility_open_time in", values, "facilityOpenTime");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("facility_open_time not in", values, "facilityOpenTime");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("facility_open_time between", value1, value2, "facilityOpenTime");
            return (Criteria) this;
        }

        public Criteria andFacilityOpenTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("facility_open_time not between", value1, value2, "facilityOpenTime");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeIsNull() {
            addCriterion("facility_close_time is null");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeIsNotNull() {
            addCriterion("facility_close_time is not null");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeEqualTo(Date value) {
            addCriterionForJDBCTime("facility_close_time =", value, "facilityCloseTime");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("facility_close_time <>", value, "facilityCloseTime");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("facility_close_time >", value, "facilityCloseTime");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("facility_close_time >=", value, "facilityCloseTime");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeLessThan(Date value) {
            addCriterionForJDBCTime("facility_close_time <", value, "facilityCloseTime");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("facility_close_time <=", value, "facilityCloseTime");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeIn(List<Date> values) {
            addCriterionForJDBCTime("facility_close_time in", values, "facilityCloseTime");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("facility_close_time not in", values, "facilityCloseTime");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("facility_close_time between", value1, value2, "facilityCloseTime");
            return (Criteria) this;
        }

        public Criteria andFacilityCloseTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("facility_close_time not between", value1, value2, "facilityCloseTime");
            return (Criteria) this;
        }

        public Criteria andQueueStatusIsNull() {
            addCriterion("queue_status is null");
            return (Criteria) this;
        }

        public Criteria andQueueStatusIsNotNull() {
            addCriterion("queue_status is not null");
            return (Criteria) this;
        }

        public Criteria andQueueStatusEqualTo(Integer value) {
            addCriterion("queue_status =", value, "queueStatus");
            return (Criteria) this;
        }

        public Criteria andQueueStatusNotEqualTo(Integer value) {
            addCriterion("queue_status <>", value, "queueStatus");
            return (Criteria) this;
        }

        public Criteria andQueueStatusGreaterThan(Integer value) {
            addCriterion("queue_status >", value, "queueStatus");
            return (Criteria) this;
        }

        public Criteria andQueueStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("queue_status >=", value, "queueStatus");
            return (Criteria) this;
        }

        public Criteria andQueueStatusLessThan(Integer value) {
            addCriterion("queue_status <", value, "queueStatus");
            return (Criteria) this;
        }

        public Criteria andQueueStatusLessThanOrEqualTo(Integer value) {
            addCriterion("queue_status <=", value, "queueStatus");
            return (Criteria) this;
        }

        public Criteria andQueueStatusIn(List<Integer> values) {
            addCriterion("queue_status in", values, "queueStatus");
            return (Criteria) this;
        }

        public Criteria andQueueStatusNotIn(List<Integer> values) {
            addCriterion("queue_status not in", values, "queueStatus");
            return (Criteria) this;
        }

        public Criteria andQueueStatusBetween(Integer value1, Integer value2) {
            addCriterion("queue_status between", value1, value2, "queueStatus");
            return (Criteria) this;
        }

        public Criteria andQueueStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("queue_status not between", value1, value2, "queueStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table facility
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
     * This class corresponds to the database table facility
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