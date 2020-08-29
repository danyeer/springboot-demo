package com.ddzb.coppermall.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OmsOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OmsOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameIsNull() {
            addCriterion("user_enterprisename is null");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameIsNotNull() {
            addCriterion("user_enterprisename is not null");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameEqualTo(String value) {
            addCriterion("user_enterprisename =", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameNotEqualTo(String value) {
            addCriterion("user_enterprisename <>", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameGreaterThan(String value) {
            addCriterion("user_enterprisename >", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameGreaterThanOrEqualTo(String value) {
            addCriterion("user_enterprisename >=", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameLessThan(String value) {
            addCriterion("user_enterprisename <", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameLessThanOrEqualTo(String value) {
            addCriterion("user_enterprisename <=", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameLike(String value) {
            addCriterion("user_enterprisename like", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameNotLike(String value) {
            addCriterion("user_enterprisename not like", value, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameIn(List<String> values) {
            addCriterion("user_enterprisename in", values, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameNotIn(List<String> values) {
            addCriterion("user_enterprisename not in", values, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameBetween(String value1, String value2) {
            addCriterion("user_enterprisename between", value1, value2, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andUserEnterprisenameNotBetween(String value1, String value2) {
            addCriterion("user_enterprisename not between", value1, value2, "userEnterprisename");
            return (Criteria) this;
        }

        public Criteria andOsnIsNull() {
            addCriterion("osn is null");
            return (Criteria) this;
        }

        public Criteria andOsnIsNotNull() {
            addCriterion("osn is not null");
            return (Criteria) this;
        }

        public Criteria andOsnEqualTo(String value) {
            addCriterion("osn =", value, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnNotEqualTo(String value) {
            addCriterion("osn <>", value, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnGreaterThan(String value) {
            addCriterion("osn >", value, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnGreaterThanOrEqualTo(String value) {
            addCriterion("osn >=", value, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnLessThan(String value) {
            addCriterion("osn <", value, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnLessThanOrEqualTo(String value) {
            addCriterion("osn <=", value, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnLike(String value) {
            addCriterion("osn like", value, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnNotLike(String value) {
            addCriterion("osn not like", value, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnIn(List<String> values) {
            addCriterion("osn in", values, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnNotIn(List<String> values) {
            addCriterion("osn not in", values, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnBetween(String value1, String value2) {
            addCriterion("osn between", value1, value2, "osn");
            return (Criteria) this;
        }

        public Criteria andOsnNotBetween(String value1, String value2) {
            addCriterion("osn not between", value1, value2, "osn");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNull() {
            addCriterion("numbers is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(BigDecimal value) {
            addCriterion("numbers =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(BigDecimal value) {
            addCriterion("numbers <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(BigDecimal value) {
            addCriterion("numbers >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("numbers >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(BigDecimal value) {
            addCriterion("numbers <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("numbers <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<BigDecimal> values) {
            addCriterion("numbers in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<BigDecimal> values) {
            addCriterion("numbers not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("numbers between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("numbers not between", value1, value2, "numbers");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsbadIsNull() {
            addCriterion("isbad is null");
            return (Criteria) this;
        }

        public Criteria andIsbadIsNotNull() {
            addCriterion("isbad is not null");
            return (Criteria) this;
        }

        public Criteria andIsbadEqualTo(Integer value) {
            addCriterion("isbad =", value, "isbad");
            return (Criteria) this;
        }

        public Criteria andIsbadNotEqualTo(Integer value) {
            addCriterion("isbad <>", value, "isbad");
            return (Criteria) this;
        }

        public Criteria andIsbadGreaterThan(Integer value) {
            addCriterion("isbad >", value, "isbad");
            return (Criteria) this;
        }

        public Criteria andIsbadGreaterThanOrEqualTo(Integer value) {
            addCriterion("isbad >=", value, "isbad");
            return (Criteria) this;
        }

        public Criteria andIsbadLessThan(Integer value) {
            addCriterion("isbad <", value, "isbad");
            return (Criteria) this;
        }

        public Criteria andIsbadLessThanOrEqualTo(Integer value) {
            addCriterion("isbad <=", value, "isbad");
            return (Criteria) this;
        }

        public Criteria andIsbadIn(List<Integer> values) {
            addCriterion("isbad in", values, "isbad");
            return (Criteria) this;
        }

        public Criteria andIsbadNotIn(List<Integer> values) {
            addCriterion("isbad not in", values, "isbad");
            return (Criteria) this;
        }

        public Criteria andIsbadBetween(Integer value1, Integer value2) {
            addCriterion("isbad between", value1, value2, "isbad");
            return (Criteria) this;
        }

        public Criteria andIsbadNotBetween(Integer value1, Integer value2) {
            addCriterion("isbad not between", value1, value2, "isbad");
            return (Criteria) this;
        }

        public Criteria andContractSnIsNull() {
            addCriterion("contract_sn is null");
            return (Criteria) this;
        }

        public Criteria andContractSnIsNotNull() {
            addCriterion("contract_sn is not null");
            return (Criteria) this;
        }

        public Criteria andContractSnEqualTo(String value) {
            addCriterion("contract_sn =", value, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnNotEqualTo(String value) {
            addCriterion("contract_sn <>", value, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnGreaterThan(String value) {
            addCriterion("contract_sn >", value, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnGreaterThanOrEqualTo(String value) {
            addCriterion("contract_sn >=", value, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnLessThan(String value) {
            addCriterion("contract_sn <", value, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnLessThanOrEqualTo(String value) {
            addCriterion("contract_sn <=", value, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnLike(String value) {
            addCriterion("contract_sn like", value, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnNotLike(String value) {
            addCriterion("contract_sn not like", value, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnIn(List<String> values) {
            addCriterion("contract_sn in", values, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnNotIn(List<String> values) {
            addCriterion("contract_sn not in", values, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnBetween(String value1, String value2) {
            addCriterion("contract_sn between", value1, value2, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractSnNotBetween(String value1, String value2) {
            addCriterion("contract_sn not between", value1, value2, "contractSn");
            return (Criteria) this;
        }

        public Criteria andContractFileIsNull() {
            addCriterion("contract_file is null");
            return (Criteria) this;
        }

        public Criteria andContractFileIsNotNull() {
            addCriterion("contract_file is not null");
            return (Criteria) this;
        }

        public Criteria andContractFileEqualTo(String value) {
            addCriterion("contract_file =", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotEqualTo(String value) {
            addCriterion("contract_file <>", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileGreaterThan(String value) {
            addCriterion("contract_file >", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileGreaterThanOrEqualTo(String value) {
            addCriterion("contract_file >=", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileLessThan(String value) {
            addCriterion("contract_file <", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileLessThanOrEqualTo(String value) {
            addCriterion("contract_file <=", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileLike(String value) {
            addCriterion("contract_file like", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotLike(String value) {
            addCriterion("contract_file not like", value, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileIn(List<String> values) {
            addCriterion("contract_file in", values, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotIn(List<String> values) {
            addCriterion("contract_file not in", values, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileBetween(String value1, String value2) {
            addCriterion("contract_file between", value1, value2, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractFileNotBetween(String value1, String value2) {
            addCriterion("contract_file not between", value1, value2, "contractFile");
            return (Criteria) this;
        }

        public Criteria andContractUrlIsNull() {
            addCriterion("contract_url is null");
            return (Criteria) this;
        }

        public Criteria andContractUrlIsNotNull() {
            addCriterion("contract_url is not null");
            return (Criteria) this;
        }

        public Criteria andContractUrlEqualTo(String value) {
            addCriterion("contract_url =", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlNotEqualTo(String value) {
            addCriterion("contract_url <>", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlGreaterThan(String value) {
            addCriterion("contract_url >", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlGreaterThanOrEqualTo(String value) {
            addCriterion("contract_url >=", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlLessThan(String value) {
            addCriterion("contract_url <", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlLessThanOrEqualTo(String value) {
            addCriterion("contract_url <=", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlLike(String value) {
            addCriterion("contract_url like", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlNotLike(String value) {
            addCriterion("contract_url not like", value, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlIn(List<String> values) {
            addCriterion("contract_url in", values, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlNotIn(List<String> values) {
            addCriterion("contract_url not in", values, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlBetween(String value1, String value2) {
            addCriterion("contract_url between", value1, value2, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractUrlNotBetween(String value1, String value2) {
            addCriterion("contract_url not between", value1, value2, "contractUrl");
            return (Criteria) this;
        }

        public Criteria andContractTimeIsNull() {
            addCriterion("contract_time is null");
            return (Criteria) this;
        }

        public Criteria andContractTimeIsNotNull() {
            addCriterion("contract_time is not null");
            return (Criteria) this;
        }

        public Criteria andContractTimeEqualTo(Date value) {
            addCriterion("contract_time =", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeNotEqualTo(Date value) {
            addCriterion("contract_time <>", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeGreaterThan(Date value) {
            addCriterion("contract_time >", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("contract_time >=", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeLessThan(Date value) {
            addCriterion("contract_time <", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeLessThanOrEqualTo(Date value) {
            addCriterion("contract_time <=", value, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeIn(List<Date> values) {
            addCriterion("contract_time in", values, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeNotIn(List<Date> values) {
            addCriterion("contract_time not in", values, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeBetween(Date value1, Date value2) {
            addCriterion("contract_time between", value1, value2, "contractTime");
            return (Criteria) this;
        }

        public Criteria andContractTimeNotBetween(Date value1, Date value2) {
            addCriterion("contract_time not between", value1, value2, "contractTime");
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

        public Criteria andIsbillIsNull() {
            addCriterion("isbill is null");
            return (Criteria) this;
        }

        public Criteria andIsbillIsNotNull() {
            addCriterion("isbill is not null");
            return (Criteria) this;
        }

        public Criteria andIsbillEqualTo(Integer value) {
            addCriterion("isbill =", value, "isbill");
            return (Criteria) this;
        }

        public Criteria andIsbillNotEqualTo(Integer value) {
            addCriterion("isbill <>", value, "isbill");
            return (Criteria) this;
        }

        public Criteria andIsbillGreaterThan(Integer value) {
            addCriterion("isbill >", value, "isbill");
            return (Criteria) this;
        }

        public Criteria andIsbillGreaterThanOrEqualTo(Integer value) {
            addCriterion("isbill >=", value, "isbill");
            return (Criteria) this;
        }

        public Criteria andIsbillLessThan(Integer value) {
            addCriterion("isbill <", value, "isbill");
            return (Criteria) this;
        }

        public Criteria andIsbillLessThanOrEqualTo(Integer value) {
            addCriterion("isbill <=", value, "isbill");
            return (Criteria) this;
        }

        public Criteria andIsbillIn(List<Integer> values) {
            addCriterion("isbill in", values, "isbill");
            return (Criteria) this;
        }

        public Criteria andIsbillNotIn(List<Integer> values) {
            addCriterion("isbill not in", values, "isbill");
            return (Criteria) this;
        }

        public Criteria andIsbillBetween(Integer value1, Integer value2) {
            addCriterion("isbill between", value1, value2, "isbill");
            return (Criteria) this;
        }

        public Criteria andIsbillNotBetween(Integer value1, Integer value2) {
            addCriterion("isbill not between", value1, value2, "isbill");
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDepositDownIsNull() {
            addCriterion("deposit_down is null");
            return (Criteria) this;
        }

        public Criteria andDepositDownIsNotNull() {
            addCriterion("deposit_down is not null");
            return (Criteria) this;
        }

        public Criteria andDepositDownEqualTo(BigDecimal value) {
            addCriterion("deposit_down =", value, "depositDown");
            return (Criteria) this;
        }

        public Criteria andDepositDownNotEqualTo(BigDecimal value) {
            addCriterion("deposit_down <>", value, "depositDown");
            return (Criteria) this;
        }

        public Criteria andDepositDownGreaterThan(BigDecimal value) {
            addCriterion("deposit_down >", value, "depositDown");
            return (Criteria) this;
        }

        public Criteria andDepositDownGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_down >=", value, "depositDown");
            return (Criteria) this;
        }

        public Criteria andDepositDownLessThan(BigDecimal value) {
            addCriterion("deposit_down <", value, "depositDown");
            return (Criteria) this;
        }

        public Criteria andDepositDownLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deposit_down <=", value, "depositDown");
            return (Criteria) this;
        }

        public Criteria andDepositDownIn(List<BigDecimal> values) {
            addCriterion("deposit_down in", values, "depositDown");
            return (Criteria) this;
        }

        public Criteria andDepositDownNotIn(List<BigDecimal> values) {
            addCriterion("deposit_down not in", values, "depositDown");
            return (Criteria) this;
        }

        public Criteria andDepositDownBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_down between", value1, value2, "depositDown");
            return (Criteria) this;
        }

        public Criteria andDepositDownNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deposit_down not between", value1, value2, "depositDown");
            return (Criteria) this;
        }

        public Criteria andDepositImgIsNull() {
            addCriterion("deposit_img is null");
            return (Criteria) this;
        }

        public Criteria andDepositImgIsNotNull() {
            addCriterion("deposit_img is not null");
            return (Criteria) this;
        }

        public Criteria andDepositImgEqualTo(String value) {
            addCriterion("deposit_img =", value, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgNotEqualTo(String value) {
            addCriterion("deposit_img <>", value, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgGreaterThan(String value) {
            addCriterion("deposit_img >", value, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgGreaterThanOrEqualTo(String value) {
            addCriterion("deposit_img >=", value, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgLessThan(String value) {
            addCriterion("deposit_img <", value, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgLessThanOrEqualTo(String value) {
            addCriterion("deposit_img <=", value, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgLike(String value) {
            addCriterion("deposit_img like", value, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgNotLike(String value) {
            addCriterion("deposit_img not like", value, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgIn(List<String> values) {
            addCriterion("deposit_img in", values, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgNotIn(List<String> values) {
            addCriterion("deposit_img not in", values, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgBetween(String value1, String value2) {
            addCriterion("deposit_img between", value1, value2, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositImgNotBetween(String value1, String value2) {
            addCriterion("deposit_img not between", value1, value2, "depositImg");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentIsNull() {
            addCriterion("deposit_payment is null");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentIsNotNull() {
            addCriterion("deposit_payment is not null");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentEqualTo(Integer value) {
            addCriterion("deposit_payment =", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentNotEqualTo(Integer value) {
            addCriterion("deposit_payment <>", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentGreaterThan(Integer value) {
            addCriterion("deposit_payment >", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit_payment >=", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentLessThan(Integer value) {
            addCriterion("deposit_payment <", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentLessThanOrEqualTo(Integer value) {
            addCriterion("deposit_payment <=", value, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentIn(List<Integer> values) {
            addCriterion("deposit_payment in", values, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentNotIn(List<Integer> values) {
            addCriterion("deposit_payment not in", values, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentBetween(Integer value1, Integer value2) {
            addCriterion("deposit_payment between", value1, value2, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositPaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit_payment not between", value1, value2, "depositPayment");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeIsNull() {
            addCriterion("deposit_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeIsNotNull() {
            addCriterion("deposit_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeEqualTo(Date value) {
            addCriterion("deposit_update_time =", value, "depositUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeNotEqualTo(Date value) {
            addCriterion("deposit_update_time <>", value, "depositUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeGreaterThan(Date value) {
            addCriterion("deposit_update_time >", value, "depositUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deposit_update_time >=", value, "depositUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeLessThan(Date value) {
            addCriterion("deposit_update_time <", value, "depositUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("deposit_update_time <=", value, "depositUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeIn(List<Date> values) {
            addCriterion("deposit_update_time in", values, "depositUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeNotIn(List<Date> values) {
            addCriterion("deposit_update_time not in", values, "depositUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("deposit_update_time between", value1, value2, "depositUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDepositUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("deposit_update_time not between", value1, value2, "depositUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNull() {
            addCriterion("delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIsNotNull() {
            addCriterion("delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateEqualTo(Date value) {
            addCriterionForJDBCDate("delivery_date =", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("delivery_date <>", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("delivery_date >", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("delivery_date >=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThan(Date value) {
            addCriterionForJDBCDate("delivery_date <", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("delivery_date <=", value, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateIn(List<Date> values) {
            addCriterionForJDBCDate("delivery_date in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("delivery_date not in", values, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("delivery_date between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("delivery_date not between", value1, value2, "deliveryDate");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgIsNull() {
            addCriterion("delivery_img is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgIsNotNull() {
            addCriterion("delivery_img is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgEqualTo(String value) {
            addCriterion("delivery_img =", value, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgNotEqualTo(String value) {
            addCriterion("delivery_img <>", value, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgGreaterThan(String value) {
            addCriterion("delivery_img >", value, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_img >=", value, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgLessThan(String value) {
            addCriterion("delivery_img <", value, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgLessThanOrEqualTo(String value) {
            addCriterion("delivery_img <=", value, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgLike(String value) {
            addCriterion("delivery_img like", value, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgNotLike(String value) {
            addCriterion("delivery_img not like", value, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgIn(List<String> values) {
            addCriterion("delivery_img in", values, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgNotIn(List<String> values) {
            addCriterion("delivery_img not in", values, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgBetween(String value1, String value2) {
            addCriterion("delivery_img between", value1, value2, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryImgNotBetween(String value1, String value2) {
            addCriterion("delivery_img not between", value1, value2, "deliveryImg");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeIsNull() {
            addCriterion("delivery_update_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeIsNotNull() {
            addCriterion("delivery_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeEqualTo(Date value) {
            addCriterion("delivery_update_time =", value, "deliveryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeNotEqualTo(Date value) {
            addCriterion("delivery_update_time <>", value, "deliveryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeGreaterThan(Date value) {
            addCriterion("delivery_update_time >", value, "deliveryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_update_time >=", value, "deliveryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeLessThan(Date value) {
            addCriterion("delivery_update_time <", value, "deliveryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_update_time <=", value, "deliveryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeIn(List<Date> values) {
            addCriterion("delivery_update_time in", values, "deliveryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeNotIn(List<Date> values) {
            addCriterion("delivery_update_time not in", values, "deliveryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_update_time between", value1, value2, "deliveryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_update_time not between", value1, value2, "deliveryUpdateTime");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgIsNull() {
            addCriterion("invoice_img is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgIsNotNull() {
            addCriterion("invoice_img is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgEqualTo(String value) {
            addCriterion("invoice_img =", value, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgNotEqualTo(String value) {
            addCriterion("invoice_img <>", value, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgGreaterThan(String value) {
            addCriterion("invoice_img >", value, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_img >=", value, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgLessThan(String value) {
            addCriterion("invoice_img <", value, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgLessThanOrEqualTo(String value) {
            addCriterion("invoice_img <=", value, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgLike(String value) {
            addCriterion("invoice_img like", value, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgNotLike(String value) {
            addCriterion("invoice_img not like", value, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgIn(List<String> values) {
            addCriterion("invoice_img in", values, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgNotIn(List<String> values) {
            addCriterion("invoice_img not in", values, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgBetween(String value1, String value2) {
            addCriterion("invoice_img between", value1, value2, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andInvoiceImgNotBetween(String value1, String value2) {
            addCriterion("invoice_img not between", value1, value2, "invoiceImg");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIsNull() {
            addCriterion("final_price is null");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIsNotNull() {
            addCriterion("final_price is not null");
            return (Criteria) this;
        }

        public Criteria andFinalPriceEqualTo(BigDecimal value) {
            addCriterion("final_price =", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotEqualTo(BigDecimal value) {
            addCriterion("final_price <>", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceGreaterThan(BigDecimal value) {
            addCriterion("final_price >", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("final_price >=", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceLessThan(BigDecimal value) {
            addCriterion("final_price <", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("final_price <=", value, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceIn(List<BigDecimal> values) {
            addCriterion("final_price in", values, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotIn(List<BigDecimal> values) {
            addCriterion("final_price not in", values, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_price between", value1, value2, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_price not between", value1, value2, "finalPrice");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersIsNull() {
            addCriterion("final_numbers is null");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersIsNotNull() {
            addCriterion("final_numbers is not null");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersEqualTo(BigDecimal value) {
            addCriterion("final_numbers =", value, "finalNumbers");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersNotEqualTo(BigDecimal value) {
            addCriterion("final_numbers <>", value, "finalNumbers");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersGreaterThan(BigDecimal value) {
            addCriterion("final_numbers >", value, "finalNumbers");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("final_numbers >=", value, "finalNumbers");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersLessThan(BigDecimal value) {
            addCriterion("final_numbers <", value, "finalNumbers");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersLessThanOrEqualTo(BigDecimal value) {
            addCriterion("final_numbers <=", value, "finalNumbers");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersIn(List<BigDecimal> values) {
            addCriterion("final_numbers in", values, "finalNumbers");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersNotIn(List<BigDecimal> values) {
            addCriterion("final_numbers not in", values, "finalNumbers");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_numbers between", value1, value2, "finalNumbers");
            return (Criteria) this;
        }

        public Criteria andFinalNumbersNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_numbers not between", value1, value2, "finalNumbers");
            return (Criteria) this;
        }

        public Criteria andFinalDepositIsNull() {
            addCriterion("final_deposit is null");
            return (Criteria) this;
        }

        public Criteria andFinalDepositIsNotNull() {
            addCriterion("final_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDepositEqualTo(BigDecimal value) {
            addCriterion("final_deposit =", value, "finalDeposit");
            return (Criteria) this;
        }

        public Criteria andFinalDepositNotEqualTo(BigDecimal value) {
            addCriterion("final_deposit <>", value, "finalDeposit");
            return (Criteria) this;
        }

        public Criteria andFinalDepositGreaterThan(BigDecimal value) {
            addCriterion("final_deposit >", value, "finalDeposit");
            return (Criteria) this;
        }

        public Criteria andFinalDepositGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("final_deposit >=", value, "finalDeposit");
            return (Criteria) this;
        }

        public Criteria andFinalDepositLessThan(BigDecimal value) {
            addCriterion("final_deposit <", value, "finalDeposit");
            return (Criteria) this;
        }

        public Criteria andFinalDepositLessThanOrEqualTo(BigDecimal value) {
            addCriterion("final_deposit <=", value, "finalDeposit");
            return (Criteria) this;
        }

        public Criteria andFinalDepositIn(List<BigDecimal> values) {
            addCriterion("final_deposit in", values, "finalDeposit");
            return (Criteria) this;
        }

        public Criteria andFinalDepositNotIn(List<BigDecimal> values) {
            addCriterion("final_deposit not in", values, "finalDeposit");
            return (Criteria) this;
        }

        public Criteria andFinalDepositBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_deposit between", value1, value2, "finalDeposit");
            return (Criteria) this;
        }

        public Criteria andFinalDepositNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_deposit not between", value1, value2, "finalDeposit");
            return (Criteria) this;
        }

        public Criteria andFinalImgIsNull() {
            addCriterion("final_img is null");
            return (Criteria) this;
        }

        public Criteria andFinalImgIsNotNull() {
            addCriterion("final_img is not null");
            return (Criteria) this;
        }

        public Criteria andFinalImgEqualTo(String value) {
            addCriterion("final_img =", value, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgNotEqualTo(String value) {
            addCriterion("final_img <>", value, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgGreaterThan(String value) {
            addCriterion("final_img >", value, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgGreaterThanOrEqualTo(String value) {
            addCriterion("final_img >=", value, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgLessThan(String value) {
            addCriterion("final_img <", value, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgLessThanOrEqualTo(String value) {
            addCriterion("final_img <=", value, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgLike(String value) {
            addCriterion("final_img like", value, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgNotLike(String value) {
            addCriterion("final_img not like", value, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgIn(List<String> values) {
            addCriterion("final_img in", values, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgNotIn(List<String> values) {
            addCriterion("final_img not in", values, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgBetween(String value1, String value2) {
            addCriterion("final_img between", value1, value2, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalImgNotBetween(String value1, String value2) {
            addCriterion("final_img not between", value1, value2, "finalImg");
            return (Criteria) this;
        }

        public Criteria andFinalNoteIsNull() {
            addCriterion("final_note is null");
            return (Criteria) this;
        }

        public Criteria andFinalNoteIsNotNull() {
            addCriterion("final_note is not null");
            return (Criteria) this;
        }

        public Criteria andFinalNoteEqualTo(String value) {
            addCriterion("final_note =", value, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteNotEqualTo(String value) {
            addCriterion("final_note <>", value, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteGreaterThan(String value) {
            addCriterion("final_note >", value, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteGreaterThanOrEqualTo(String value) {
            addCriterion("final_note >=", value, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteLessThan(String value) {
            addCriterion("final_note <", value, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteLessThanOrEqualTo(String value) {
            addCriterion("final_note <=", value, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteLike(String value) {
            addCriterion("final_note like", value, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteNotLike(String value) {
            addCriterion("final_note not like", value, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteIn(List<String> values) {
            addCriterion("final_note in", values, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteNotIn(List<String> values) {
            addCriterion("final_note not in", values, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteBetween(String value1, String value2) {
            addCriterion("final_note between", value1, value2, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalNoteNotBetween(String value1, String value2) {
            addCriterion("final_note not between", value1, value2, "finalNote");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeIsNull() {
            addCriterion("final_update_time is null");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeIsNotNull() {
            addCriterion("final_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeEqualTo(Date value) {
            addCriterion("final_update_time =", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeNotEqualTo(Date value) {
            addCriterion("final_update_time <>", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeGreaterThan(Date value) {
            addCriterion("final_update_time >", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("final_update_time >=", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeLessThan(Date value) {
            addCriterion("final_update_time <", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("final_update_time <=", value, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeIn(List<Date> values) {
            addCriterion("final_update_time in", values, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeNotIn(List<Date> values) {
            addCriterion("final_update_time not in", values, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("final_update_time between", value1, value2, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("final_update_time not between", value1, value2, "finalUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeIsNull() {
            addCriterion("final_confirm_update_time is null");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeIsNotNull() {
            addCriterion("final_confirm_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeEqualTo(Date value) {
            addCriterion("final_confirm_update_time =", value, "finalConfirmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeNotEqualTo(Date value) {
            addCriterion("final_confirm_update_time <>", value, "finalConfirmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeGreaterThan(Date value) {
            addCriterion("final_confirm_update_time >", value, "finalConfirmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("final_confirm_update_time >=", value, "finalConfirmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeLessThan(Date value) {
            addCriterion("final_confirm_update_time <", value, "finalConfirmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("final_confirm_update_time <=", value, "finalConfirmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeIn(List<Date> values) {
            addCriterion("final_confirm_update_time in", values, "finalConfirmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeNotIn(List<Date> values) {
            addCriterion("final_confirm_update_time not in", values, "finalConfirmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("final_confirm_update_time between", value1, value2, "finalConfirmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andFinalConfirmUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("final_confirm_update_time not between", value1, value2, "finalConfirmUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIsNull() {
            addCriterion("balance_amount is null");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIsNotNull() {
            addCriterion("balance_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountEqualTo(BigDecimal value) {
            addCriterion("balance_amount =", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotEqualTo(BigDecimal value) {
            addCriterion("balance_amount <>", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountGreaterThan(BigDecimal value) {
            addCriterion("balance_amount >", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_amount >=", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLessThan(BigDecimal value) {
            addCriterion("balance_amount <", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance_amount <=", value, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountIn(List<BigDecimal> values) {
            addCriterion("balance_amount in", values, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotIn(List<BigDecimal> values) {
            addCriterion("balance_amount not in", values, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_amount between", value1, value2, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance_amount not between", value1, value2, "balanceAmount");
            return (Criteria) this;
        }

        public Criteria andBalanceImgIsNull() {
            addCriterion("balance_img is null");
            return (Criteria) this;
        }

        public Criteria andBalanceImgIsNotNull() {
            addCriterion("balance_img is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceImgEqualTo(String value) {
            addCriterion("balance_img =", value, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgNotEqualTo(String value) {
            addCriterion("balance_img <>", value, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgGreaterThan(String value) {
            addCriterion("balance_img >", value, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgGreaterThanOrEqualTo(String value) {
            addCriterion("balance_img >=", value, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgLessThan(String value) {
            addCriterion("balance_img <", value, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgLessThanOrEqualTo(String value) {
            addCriterion("balance_img <=", value, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgLike(String value) {
            addCriterion("balance_img like", value, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgNotLike(String value) {
            addCriterion("balance_img not like", value, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgIn(List<String> values) {
            addCriterion("balance_img in", values, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgNotIn(List<String> values) {
            addCriterion("balance_img not in", values, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgBetween(String value1, String value2) {
            addCriterion("balance_img between", value1, value2, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceImgNotBetween(String value1, String value2) {
            addCriterion("balance_img not between", value1, value2, "balanceImg");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeIsNull() {
            addCriterion("balance_update_time is null");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeIsNotNull() {
            addCriterion("balance_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeEqualTo(Date value) {
            addCriterion("balance_update_time =", value, "balanceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeNotEqualTo(Date value) {
            addCriterion("balance_update_time <>", value, "balanceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeGreaterThan(Date value) {
            addCriterion("balance_update_time >", value, "balanceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("balance_update_time >=", value, "balanceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeLessThan(Date value) {
            addCriterion("balance_update_time <", value, "balanceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("balance_update_time <=", value, "balanceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeIn(List<Date> values) {
            addCriterion("balance_update_time in", values, "balanceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeNotIn(List<Date> values) {
            addCriterion("balance_update_time not in", values, "balanceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("balance_update_time between", value1, value2, "balanceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalanceUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("balance_update_time not between", value1, value2, "balanceUpdateTime");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentIsNull() {
            addCriterion("balance_payment is null");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentIsNotNull() {
            addCriterion("balance_payment is not null");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentEqualTo(Integer value) {
            addCriterion("balance_payment =", value, "balancePayment");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentNotEqualTo(Integer value) {
            addCriterion("balance_payment <>", value, "balancePayment");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentGreaterThan(Integer value) {
            addCriterion("balance_payment >", value, "balancePayment");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentGreaterThanOrEqualTo(Integer value) {
            addCriterion("balance_payment >=", value, "balancePayment");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentLessThan(Integer value) {
            addCriterion("balance_payment <", value, "balancePayment");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentLessThanOrEqualTo(Integer value) {
            addCriterion("balance_payment <=", value, "balancePayment");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentIn(List<Integer> values) {
            addCriterion("balance_payment in", values, "balancePayment");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentNotIn(List<Integer> values) {
            addCriterion("balance_payment not in", values, "balancePayment");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentBetween(Integer value1, Integer value2) {
            addCriterion("balance_payment between", value1, value2, "balancePayment");
            return (Criteria) this;
        }

        public Criteria andBalancePaymentNotBetween(Integer value1, Integer value2) {
            addCriterion("balance_payment not between", value1, value2, "balancePayment");
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