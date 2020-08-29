package com.ddzb.coppermall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UmsMemberDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UmsMemberDetailsExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCardcodeIsNull() {
            addCriterion("cardcode is null");
            return (Criteria) this;
        }

        public Criteria andCardcodeIsNotNull() {
            addCriterion("cardcode is not null");
            return (Criteria) this;
        }

        public Criteria andCardcodeEqualTo(String value) {
            addCriterion("cardcode =", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotEqualTo(String value) {
            addCriterion("cardcode <>", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeGreaterThan(String value) {
            addCriterion("cardcode >", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeGreaterThanOrEqualTo(String value) {
            addCriterion("cardcode >=", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeLessThan(String value) {
            addCriterion("cardcode <", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeLessThanOrEqualTo(String value) {
            addCriterion("cardcode <=", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeLike(String value) {
            addCriterion("cardcode like", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotLike(String value) {
            addCriterion("cardcode not like", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeIn(List<String> values) {
            addCriterion("cardcode in", values, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotIn(List<String> values) {
            addCriterion("cardcode not in", values, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeBetween(String value1, String value2) {
            addCriterion("cardcode between", value1, value2, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotBetween(String value1, String value2) {
            addCriterion("cardcode not between", value1, value2, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIsNull() {
            addCriterion("creditcode is null");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIsNotNull() {
            addCriterion("creditcode is not null");
            return (Criteria) this;
        }

        public Criteria andCreditcodeEqualTo(String value) {
            addCriterion("creditcode =", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotEqualTo(String value) {
            addCriterion("creditcode <>", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeGreaterThan(String value) {
            addCriterion("creditcode >", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("creditcode >=", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLessThan(String value) {
            addCriterion("creditcode <", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLessThanOrEqualTo(String value) {
            addCriterion("creditcode <=", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeLike(String value) {
            addCriterion("creditcode like", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotLike(String value) {
            addCriterion("creditcode not like", value, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeIn(List<String> values) {
            addCriterion("creditcode in", values, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotIn(List<String> values) {
            addCriterion("creditcode not in", values, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeBetween(String value1, String value2) {
            addCriterion("creditcode between", value1, value2, "creditcode");
            return (Criteria) this;
        }

        public Criteria andCreditcodeNotBetween(String value1, String value2) {
            addCriterion("creditcode not between", value1, value2, "creditcode");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIsNull() {
            addCriterion("enterprisename is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIsNotNull() {
            addCriterion("enterprisename is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameEqualTo(String value) {
            addCriterion("enterprisename =", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotEqualTo(String value) {
            addCriterion("enterprisename <>", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameGreaterThan(String value) {
            addCriterion("enterprisename >", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprisename >=", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLessThan(String value) {
            addCriterion("enterprisename <", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLessThanOrEqualTo(String value) {
            addCriterion("enterprisename <=", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameLike(String value) {
            addCriterion("enterprisename like", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotLike(String value) {
            addCriterion("enterprisename not like", value, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameIn(List<String> values) {
            addCriterion("enterprisename in", values, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotIn(List<String> values) {
            addCriterion("enterprisename not in", values, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameBetween(String value1, String value2) {
            addCriterion("enterprisename between", value1, value2, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterprisenameNotBetween(String value1, String value2) {
            addCriterion("enterprisename not between", value1, value2, "enterprisename");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseIsNull() {
            addCriterion("enterpriselicense is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseIsNotNull() {
            addCriterion("enterpriselicense is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseEqualTo(String value) {
            addCriterion("enterpriselicense =", value, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseNotEqualTo(String value) {
            addCriterion("enterpriselicense <>", value, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseGreaterThan(String value) {
            addCriterion("enterpriselicense >", value, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseGreaterThanOrEqualTo(String value) {
            addCriterion("enterpriselicense >=", value, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseLessThan(String value) {
            addCriterion("enterpriselicense <", value, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseLessThanOrEqualTo(String value) {
            addCriterion("enterpriselicense <=", value, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseLike(String value) {
            addCriterion("enterpriselicense like", value, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseNotLike(String value) {
            addCriterion("enterpriselicense not like", value, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseIn(List<String> values) {
            addCriterion("enterpriselicense in", values, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseNotIn(List<String> values) {
            addCriterion("enterpriselicense not in", values, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseBetween(String value1, String value2) {
            addCriterion("enterpriselicense between", value1, value2, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andEnterpriselicenseNotBetween(String value1, String value2) {
            addCriterion("enterpriselicense not between", value1, value2, "enterpriselicense");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNull() {
            addCriterion("main_business is null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNotNull() {
            addCriterion("main_business is not null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessEqualTo(String value) {
            addCriterion("main_business =", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotEqualTo(String value) {
            addCriterion("main_business <>", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThan(String value) {
            addCriterion("main_business >", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("main_business >=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThan(String value) {
            addCriterion("main_business <", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThanOrEqualTo(String value) {
            addCriterion("main_business <=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLike(String value) {
            addCriterion("main_business like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotLike(String value) {
            addCriterion("main_business not like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIn(List<String> values) {
            addCriterion("main_business in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotIn(List<String> values) {
            addCriterion("main_business not in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessBetween(String value1, String value2) {
            addCriterion("main_business between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotBetween(String value1, String value2) {
            addCriterion("main_business not between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Long value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Long value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Long value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Long value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Long value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Long value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Long> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Long> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Long value1, Long value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Long value1, Long value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Long value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Long value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Long value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Long value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Long value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Long value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Long> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Long> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Long value1, Long value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Long value1, Long value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(Long value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(Long value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(Long value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(Long value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(Long value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(Long value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<Long> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<Long> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(Long value1, Long value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(Long value1, Long value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oname is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oname is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oname =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oname <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oname >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oname >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oname <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oname <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oname like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oname not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oname in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oname not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oname between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oname not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNull() {
            addCriterion("registered is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredIsNotNull() {
            addCriterion("registered is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredEqualTo(String value) {
            addCriterion("registered =", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotEqualTo(String value) {
            addCriterion("registered <>", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThan(String value) {
            addCriterion("registered >", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredGreaterThanOrEqualTo(String value) {
            addCriterion("registered >=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThan(String value) {
            addCriterion("registered <", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLessThanOrEqualTo(String value) {
            addCriterion("registered <=", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredLike(String value) {
            addCriterion("registered like", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotLike(String value) {
            addCriterion("registered not like", value, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredIn(List<String> values) {
            addCriterion("registered in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotIn(List<String> values) {
            addCriterion("registered not in", values, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredBetween(String value1, String value2) {
            addCriterion("registered between", value1, value2, "registered");
            return (Criteria) this;
        }

        public Criteria andRegisteredNotBetween(String value1, String value2) {
            addCriterion("registered not between", value1, value2, "registered");
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