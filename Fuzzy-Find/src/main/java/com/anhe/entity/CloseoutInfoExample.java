package com.anhe.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CloseoutInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    public CloseoutInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
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
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConstructIsNull() {
            addCriterion("construct is null");
            return (Criteria) this;
        }

        public Criteria andConstructIsNotNull() {
            addCriterion("construct is not null");
            return (Criteria) this;
        }

        public Criteria andConstructEqualTo(String value) {
            addCriterion("construct =", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructNotEqualTo(String value) {
            addCriterion("construct <>", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructGreaterThan(String value) {
            addCriterion("construct >", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructGreaterThanOrEqualTo(String value) {
            addCriterion("construct >=", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructLessThan(String value) {
            addCriterion("construct <", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructLessThanOrEqualTo(String value) {
            addCriterion("construct <=", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructLike(String value) {
            addCriterion("construct like", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructNotLike(String value) {
            addCriterion("construct not like", value, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructIn(List<String> values) {
            addCriterion("construct in", values, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructNotIn(List<String> values) {
            addCriterion("construct not in", values, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructBetween(String value1, String value2) {
            addCriterion("construct between", value1, value2, "construct");
            return (Criteria) this;
        }

        public Criteria andConstructNotBetween(String value1, String value2) {
            addCriterion("construct not between", value1, value2, "construct");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(String value) {
            addCriterion("value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(String value) {
            addCriterion("value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(String value) {
            addCriterion("value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(String value) {
            addCriterion("value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(String value) {
            addCriterion("value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(String value) {
            addCriterion("value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLike(String value) {
            addCriterion("value like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotLike(String value) {
            addCriterion("value not like", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<String> values) {
            addCriterion("value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<String> values) {
            addCriterion("value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(String value1, String value2) {
            addCriterion("value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(String value1, String value2) {
            addCriterion("value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andPickupNumIsNull() {
            addCriterion("pickup_num is null");
            return (Criteria) this;
        }

        public Criteria andPickupNumIsNotNull() {
            addCriterion("pickup_num is not null");
            return (Criteria) this;
        }

        public Criteria andPickupNumEqualTo(Integer value) {
            addCriterion("pickup_num =", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumNotEqualTo(Integer value) {
            addCriterion("pickup_num <>", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumGreaterThan(Integer value) {
            addCriterion("pickup_num >", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pickup_num >=", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumLessThan(Integer value) {
            addCriterion("pickup_num <", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumLessThanOrEqualTo(Integer value) {
            addCriterion("pickup_num <=", value, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumIn(List<Integer> values) {
            addCriterion("pickup_num in", values, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumNotIn(List<Integer> values) {
            addCriterion("pickup_num not in", values, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumBetween(Integer value1, Integer value2) {
            addCriterion("pickup_num between", value1, value2, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andPickupNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pickup_num not between", value1, value2, "pickupNum");
            return (Criteria) this;
        }

        public Criteria andTrackingsIsNull() {
            addCriterion("trackings is null");
            return (Criteria) this;
        }

        public Criteria andTrackingsIsNotNull() {
            addCriterion("trackings is not null");
            return (Criteria) this;
        }

        public Criteria andTrackingsEqualTo(String value) {
            addCriterion("trackings =", value, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsNotEqualTo(String value) {
            addCriterion("trackings <>", value, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsGreaterThan(String value) {
            addCriterion("trackings >", value, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsGreaterThanOrEqualTo(String value) {
            addCriterion("trackings >=", value, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsLessThan(String value) {
            addCriterion("trackings <", value, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsLessThanOrEqualTo(String value) {
            addCriterion("trackings <=", value, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsLike(String value) {
            addCriterion("trackings like", value, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsNotLike(String value) {
            addCriterion("trackings not like", value, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsIn(List<String> values) {
            addCriterion("trackings in", values, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsNotIn(List<String> values) {
            addCriterion("trackings not in", values, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsBetween(String value1, String value2) {
            addCriterion("trackings between", value1, value2, "trackings");
            return (Criteria) this;
        }

        public Criteria andTrackingsNotBetween(String value1, String value2) {
            addCriterion("trackings not between", value1, value2, "trackings");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDelStatusIsNull() {
            addCriterion("del_status is null");
            return (Criteria) this;
        }

        public Criteria andDelStatusIsNotNull() {
            addCriterion("del_status is not null");
            return (Criteria) this;
        }

        public Criteria andDelStatusEqualTo(Boolean value) {
            addCriterion("del_status =", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotEqualTo(Boolean value) {
            addCriterion("del_status <>", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusGreaterThan(Boolean value) {
            addCriterion("del_status >", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("del_status >=", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLessThan(Boolean value) {
            addCriterion("del_status <", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("del_status <=", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusIn(List<Boolean> values) {
            addCriterion("del_status in", values, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotIn(List<Boolean> values) {
            addCriterion("del_status not in", values, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("del_status between", value1, value2, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("del_status not between", value1, value2, "delStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table closeout_info
     *
     * @mbg.generated do_not_delete_during_merge Thu Apr 11 09:54:15 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table closeout_info
     *
     * @mbg.generated Thu Apr 11 09:54:15 CST 2019
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