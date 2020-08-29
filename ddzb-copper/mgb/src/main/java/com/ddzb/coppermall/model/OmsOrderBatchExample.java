package com.ddzb.coppermall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OmsOrderBatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderBatchExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_no is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_no is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(Integer value) {
            addCriterion("batch_no =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(Integer value) {
            addCriterion("batch_no <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(Integer value) {
            addCriterion("batch_no >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("batch_no >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(Integer value) {
            addCriterion("batch_no <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(Integer value) {
            addCriterion("batch_no <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<Integer> values) {
            addCriterion("batch_no in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<Integer> values) {
            addCriterion("batch_no not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(Integer value1, Integer value2) {
            addCriterion("batch_no between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(Integer value1, Integer value2) {
            addCriterion("batch_no not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyIsNull() {
            addCriterion("apply_money is null");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyIsNotNull() {
            addCriterion("apply_money is not null");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyEqualTo(BigDecimal value) {
            addCriterion("apply_money =", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("apply_money <>", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyGreaterThan(BigDecimal value) {
            addCriterion("apply_money >", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_money >=", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyLessThan(BigDecimal value) {
            addCriterion("apply_money <", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_money <=", value, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyIn(List<BigDecimal> values) {
            addCriterion("apply_money in", values, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("apply_money not in", values, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_money between", value1, value2, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_money not between", value1, value2, "applyMoney");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersIsNull() {
            addCriterion("apply_numbers is null");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersIsNotNull() {
            addCriterion("apply_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersEqualTo(BigDecimal value) {
            addCriterion("apply_numbers =", value, "applyNumbers");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersNotEqualTo(BigDecimal value) {
            addCriterion("apply_numbers <>", value, "applyNumbers");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersGreaterThan(BigDecimal value) {
            addCriterion("apply_numbers >", value, "applyNumbers");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_numbers >=", value, "applyNumbers");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersLessThan(BigDecimal value) {
            addCriterion("apply_numbers <", value, "applyNumbers");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_numbers <=", value, "applyNumbers");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersIn(List<BigDecimal> values) {
            addCriterion("apply_numbers in", values, "applyNumbers");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersNotIn(List<BigDecimal> values) {
            addCriterion("apply_numbers not in", values, "applyNumbers");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_numbers between", value1, value2, "applyNumbers");
            return (Criteria) this;
        }

        public Criteria andApplyNumbersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_numbers not between", value1, value2, "applyNumbers");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNull() {
            addCriterion("apply_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIsNotNull() {
            addCriterion("apply_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyTimeEqualTo(Date value) {
            addCriterion("apply_time =", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotEqualTo(Date value) {
            addCriterion("apply_time <>", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThan(Date value) {
            addCriterion("apply_time >", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_time >=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThan(Date value) {
            addCriterion("apply_time <", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_time <=", value, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeIn(List<Date> values) {
            addCriterion("apply_time in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotIn(List<Date> values) {
            addCriterion("apply_time not in", values, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeBetween(Date value1, Date value2) {
            addCriterion("apply_time between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_time not between", value1, value2, "applyTime");
            return (Criteria) this;
        }

        public Criteria andApplyPnameIsNull() {
            addCriterion("apply_pname is null");
            return (Criteria) this;
        }

        public Criteria andApplyPnameIsNotNull() {
            addCriterion("apply_pname is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPnameEqualTo(String value) {
            addCriterion("apply_pname =", value, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameNotEqualTo(String value) {
            addCriterion("apply_pname <>", value, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameGreaterThan(String value) {
            addCriterion("apply_pname >", value, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameGreaterThanOrEqualTo(String value) {
            addCriterion("apply_pname >=", value, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameLessThan(String value) {
            addCriterion("apply_pname <", value, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameLessThanOrEqualTo(String value) {
            addCriterion("apply_pname <=", value, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameLike(String value) {
            addCriterion("apply_pname like", value, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameNotLike(String value) {
            addCriterion("apply_pname not like", value, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameIn(List<String> values) {
            addCriterion("apply_pname in", values, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameNotIn(List<String> values) {
            addCriterion("apply_pname not in", values, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameBetween(String value1, String value2) {
            addCriterion("apply_pname between", value1, value2, "applyPname");
            return (Criteria) this;
        }

        public Criteria andApplyPnameNotBetween(String value1, String value2) {
            addCriterion("apply_pname not between", value1, value2, "applyPname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameIsNull() {
            addCriterion("appply_cname is null");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameIsNotNull() {
            addCriterion("appply_cname is not null");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameEqualTo(String value) {
            addCriterion("appply_cname =", value, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameNotEqualTo(String value) {
            addCriterion("appply_cname <>", value, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameGreaterThan(String value) {
            addCriterion("appply_cname >", value, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameGreaterThanOrEqualTo(String value) {
            addCriterion("appply_cname >=", value, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameLessThan(String value) {
            addCriterion("appply_cname <", value, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameLessThanOrEqualTo(String value) {
            addCriterion("appply_cname <=", value, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameLike(String value) {
            addCriterion("appply_cname like", value, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameNotLike(String value) {
            addCriterion("appply_cname not like", value, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameIn(List<String> values) {
            addCriterion("appply_cname in", values, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameNotIn(List<String> values) {
            addCriterion("appply_cname not in", values, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameBetween(String value1, String value2) {
            addCriterion("appply_cname between", value1, value2, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyCnameNotBetween(String value1, String value2) {
            addCriterion("appply_cname not between", value1, value2, "appplyCname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameIsNull() {
            addCriterion("appply_oname is null");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameIsNotNull() {
            addCriterion("appply_oname is not null");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameEqualTo(String value) {
            addCriterion("appply_oname =", value, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameNotEqualTo(String value) {
            addCriterion("appply_oname <>", value, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameGreaterThan(String value) {
            addCriterion("appply_oname >", value, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameGreaterThanOrEqualTo(String value) {
            addCriterion("appply_oname >=", value, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameLessThan(String value) {
            addCriterion("appply_oname <", value, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameLessThanOrEqualTo(String value) {
            addCriterion("appply_oname <=", value, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameLike(String value) {
            addCriterion("appply_oname like", value, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameNotLike(String value) {
            addCriterion("appply_oname not like", value, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameIn(List<String> values) {
            addCriterion("appply_oname in", values, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameNotIn(List<String> values) {
            addCriterion("appply_oname not in", values, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameBetween(String value1, String value2) {
            addCriterion("appply_oname between", value1, value2, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyOnameNotBetween(String value1, String value2) {
            addCriterion("appply_oname not between", value1, value2, "appplyOname");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressIsNull() {
            addCriterion("appply_address is null");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressIsNotNull() {
            addCriterion("appply_address is not null");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressEqualTo(String value) {
            addCriterion("appply_address =", value, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressNotEqualTo(String value) {
            addCriterion("appply_address <>", value, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressGreaterThan(String value) {
            addCriterion("appply_address >", value, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("appply_address >=", value, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressLessThan(String value) {
            addCriterion("appply_address <", value, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressLessThanOrEqualTo(String value) {
            addCriterion("appply_address <=", value, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressLike(String value) {
            addCriterion("appply_address like", value, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressNotLike(String value) {
            addCriterion("appply_address not like", value, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressIn(List<String> values) {
            addCriterion("appply_address in", values, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressNotIn(List<String> values) {
            addCriterion("appply_address not in", values, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressBetween(String value1, String value2) {
            addCriterion("appply_address between", value1, value2, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andAppplyAddressNotBetween(String value1, String value2) {
            addCriterion("appply_address not between", value1, value2, "appplyAddress");
            return (Criteria) this;
        }

        public Criteria andRealNumbersIsNull() {
            addCriterion("real_numbers is null");
            return (Criteria) this;
        }

        public Criteria andRealNumbersIsNotNull() {
            addCriterion("real_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andRealNumbersEqualTo(BigDecimal value) {
            addCriterion("real_numbers =", value, "realNumbers");
            return (Criteria) this;
        }

        public Criteria andRealNumbersNotEqualTo(BigDecimal value) {
            addCriterion("real_numbers <>", value, "realNumbers");
            return (Criteria) this;
        }

        public Criteria andRealNumbersGreaterThan(BigDecimal value) {
            addCriterion("real_numbers >", value, "realNumbers");
            return (Criteria) this;
        }

        public Criteria andRealNumbersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_numbers >=", value, "realNumbers");
            return (Criteria) this;
        }

        public Criteria andRealNumbersLessThan(BigDecimal value) {
            addCriterion("real_numbers <", value, "realNumbers");
            return (Criteria) this;
        }

        public Criteria andRealNumbersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_numbers <=", value, "realNumbers");
            return (Criteria) this;
        }

        public Criteria andRealNumbersIn(List<BigDecimal> values) {
            addCriterion("real_numbers in", values, "realNumbers");
            return (Criteria) this;
        }

        public Criteria andRealNumbersNotIn(List<BigDecimal> values) {
            addCriterion("real_numbers not in", values, "realNumbers");
            return (Criteria) this;
        }

        public Criteria andRealNumbersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_numbers between", value1, value2, "realNumbers");
            return (Criteria) this;
        }

        public Criteria andRealNumbersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_numbers not between", value1, value2, "realNumbers");
            return (Criteria) this;
        }

        public Criteria andRealBacksIsNull() {
            addCriterion("real_backs is null");
            return (Criteria) this;
        }

        public Criteria andRealBacksIsNotNull() {
            addCriterion("real_backs is not null");
            return (Criteria) this;
        }

        public Criteria andRealBacksEqualTo(BigDecimal value) {
            addCriterion("real_backs =", value, "realBacks");
            return (Criteria) this;
        }

        public Criteria andRealBacksNotEqualTo(BigDecimal value) {
            addCriterion("real_backs <>", value, "realBacks");
            return (Criteria) this;
        }

        public Criteria andRealBacksGreaterThan(BigDecimal value) {
            addCriterion("real_backs >", value, "realBacks");
            return (Criteria) this;
        }

        public Criteria andRealBacksGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("real_backs >=", value, "realBacks");
            return (Criteria) this;
        }

        public Criteria andRealBacksLessThan(BigDecimal value) {
            addCriterion("real_backs <", value, "realBacks");
            return (Criteria) this;
        }

        public Criteria andRealBacksLessThanOrEqualTo(BigDecimal value) {
            addCriterion("real_backs <=", value, "realBacks");
            return (Criteria) this;
        }

        public Criteria andRealBacksIn(List<BigDecimal> values) {
            addCriterion("real_backs in", values, "realBacks");
            return (Criteria) this;
        }

        public Criteria andRealBacksNotIn(List<BigDecimal> values) {
            addCriterion("real_backs not in", values, "realBacks");
            return (Criteria) this;
        }

        public Criteria andRealBacksBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_backs between", value1, value2, "realBacks");
            return (Criteria) this;
        }

        public Criteria andRealBacksNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("real_backs not between", value1, value2, "realBacks");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andImagesIsNull() {
            addCriterion("images is null");
            return (Criteria) this;
        }

        public Criteria andImagesIsNotNull() {
            addCriterion("images is not null");
            return (Criteria) this;
        }

        public Criteria andImagesEqualTo(String value) {
            addCriterion("images =", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotEqualTo(String value) {
            addCriterion("images <>", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThan(String value) {
            addCriterion("images >", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesGreaterThanOrEqualTo(String value) {
            addCriterion("images >=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThan(String value) {
            addCriterion("images <", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLessThanOrEqualTo(String value) {
            addCriterion("images <=", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesLike(String value) {
            addCriterion("images like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotLike(String value) {
            addCriterion("images not like", value, "images");
            return (Criteria) this;
        }

        public Criteria andImagesIn(List<String> values) {
            addCriterion("images in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotIn(List<String> values) {
            addCriterion("images not in", values, "images");
            return (Criteria) this;
        }

        public Criteria andImagesBetween(String value1, String value2) {
            addCriterion("images between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImagesNotBetween(String value1, String value2) {
            addCriterion("images not between", value1, value2, "images");
            return (Criteria) this;
        }

        public Criteria andImages2IsNull() {
            addCriterion("images2 is null");
            return (Criteria) this;
        }

        public Criteria andImages2IsNotNull() {
            addCriterion("images2 is not null");
            return (Criteria) this;
        }

        public Criteria andImages2EqualTo(String value) {
            addCriterion("images2 =", value, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2NotEqualTo(String value) {
            addCriterion("images2 <>", value, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2GreaterThan(String value) {
            addCriterion("images2 >", value, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2GreaterThanOrEqualTo(String value) {
            addCriterion("images2 >=", value, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2LessThan(String value) {
            addCriterion("images2 <", value, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2LessThanOrEqualTo(String value) {
            addCriterion("images2 <=", value, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2Like(String value) {
            addCriterion("images2 like", value, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2NotLike(String value) {
            addCriterion("images2 not like", value, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2In(List<String> values) {
            addCriterion("images2 in", values, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2NotIn(List<String> values) {
            addCriterion("images2 not in", values, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2Between(String value1, String value2) {
            addCriterion("images2 between", value1, value2, "images2");
            return (Criteria) this;
        }

        public Criteria andImages2NotBetween(String value1, String value2) {
            addCriterion("images2 not between", value1, value2, "images2");
            return (Criteria) this;
        }

        public Criteria andImages3IsNull() {
            addCriterion("images3 is null");
            return (Criteria) this;
        }

        public Criteria andImages3IsNotNull() {
            addCriterion("images3 is not null");
            return (Criteria) this;
        }

        public Criteria andImages3EqualTo(String value) {
            addCriterion("images3 =", value, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3NotEqualTo(String value) {
            addCriterion("images3 <>", value, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3GreaterThan(String value) {
            addCriterion("images3 >", value, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3GreaterThanOrEqualTo(String value) {
            addCriterion("images3 >=", value, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3LessThan(String value) {
            addCriterion("images3 <", value, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3LessThanOrEqualTo(String value) {
            addCriterion("images3 <=", value, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3Like(String value) {
            addCriterion("images3 like", value, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3NotLike(String value) {
            addCriterion("images3 not like", value, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3In(List<String> values) {
            addCriterion("images3 in", values, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3NotIn(List<String> values) {
            addCriterion("images3 not in", values, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3Between(String value1, String value2) {
            addCriterion("images3 between", value1, value2, "images3");
            return (Criteria) this;
        }

        public Criteria andImages3NotBetween(String value1, String value2) {
            addCriterion("images3 not between", value1, value2, "images3");
            return (Criteria) this;
        }

        public Criteria andStautsIsNull() {
            addCriterion("stauts is null");
            return (Criteria) this;
        }

        public Criteria andStautsIsNotNull() {
            addCriterion("stauts is not null");
            return (Criteria) this;
        }

        public Criteria andStautsEqualTo(Integer value) {
            addCriterion("stauts =", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotEqualTo(Integer value) {
            addCriterion("stauts <>", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsGreaterThan(Integer value) {
            addCriterion("stauts >", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsGreaterThanOrEqualTo(Integer value) {
            addCriterion("stauts >=", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLessThan(Integer value) {
            addCriterion("stauts <", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsLessThanOrEqualTo(Integer value) {
            addCriterion("stauts <=", value, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsIn(List<Integer> values) {
            addCriterion("stauts in", values, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotIn(List<Integer> values) {
            addCriterion("stauts not in", values, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsBetween(Integer value1, Integer value2) {
            addCriterion("stauts between", value1, value2, "stauts");
            return (Criteria) this;
        }

        public Criteria andStautsNotBetween(Integer value1, Integer value2) {
            addCriterion("stauts not between", value1, value2, "stauts");
            return (Criteria) this;
        }

        public Criteria andIsLastIsNull() {
            addCriterion("is_last is null");
            return (Criteria) this;
        }

        public Criteria andIsLastIsNotNull() {
            addCriterion("is_last is not null");
            return (Criteria) this;
        }

        public Criteria andIsLastEqualTo(Integer value) {
            addCriterion("is_last =", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastNotEqualTo(Integer value) {
            addCriterion("is_last <>", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastGreaterThan(Integer value) {
            addCriterion("is_last >", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_last >=", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastLessThan(Integer value) {
            addCriterion("is_last <", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastLessThanOrEqualTo(Integer value) {
            addCriterion("is_last <=", value, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastIn(List<Integer> values) {
            addCriterion("is_last in", values, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastNotIn(List<Integer> values) {
            addCriterion("is_last not in", values, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastBetween(Integer value1, Integer value2) {
            addCriterion("is_last between", value1, value2, "isLast");
            return (Criteria) this;
        }

        public Criteria andIsLastNotBetween(Integer value1, Integer value2) {
            addCriterion("is_last not between", value1, value2, "isLast");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginIsNull() {
            addCriterion("payment_margin is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginIsNotNull() {
            addCriterion("payment_margin is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginEqualTo(String value) {
            addCriterion("payment_margin =", value, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginNotEqualTo(String value) {
            addCriterion("payment_margin <>", value, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginGreaterThan(String value) {
            addCriterion("payment_margin >", value, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginGreaterThanOrEqualTo(String value) {
            addCriterion("payment_margin >=", value, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginLessThan(String value) {
            addCriterion("payment_margin <", value, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginLessThanOrEqualTo(String value) {
            addCriterion("payment_margin <=", value, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginLike(String value) {
            addCriterion("payment_margin like", value, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginNotLike(String value) {
            addCriterion("payment_margin not like", value, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginIn(List<String> values) {
            addCriterion("payment_margin in", values, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginNotIn(List<String> values) {
            addCriterion("payment_margin not in", values, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginBetween(String value1, String value2) {
            addCriterion("payment_margin between", value1, value2, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andPaymentMarginNotBetween(String value1, String value2) {
            addCriterion("payment_margin not between", value1, value2, "paymentMargin");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNull() {
            addCriterion("deposit_amount is null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIsNotNull() {
            addCriterion("deposit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAmountEqualTo(Double value) {
            addCriterion("deposit_amount =", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotEqualTo(Double value) {
            addCriterion("deposit_amount <>", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThan(Double value) {
            addCriterion("deposit_amount >", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("deposit_amount >=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThan(Double value) {
            addCriterion("deposit_amount <", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountLessThanOrEqualTo(Double value) {
            addCriterion("deposit_amount <=", value, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountIn(List<Double> values) {
            addCriterion("deposit_amount in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotIn(List<Double> values) {
            addCriterion("deposit_amount not in", values, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountBetween(Double value1, Double value2) {
            addCriterion("deposit_amount between", value1, value2, "depositAmount");
            return (Criteria) this;
        }

        public Criteria andDepositAmountNotBetween(Double value1, Double value2) {
            addCriterion("deposit_amount not between", value1, value2, "depositAmount");
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