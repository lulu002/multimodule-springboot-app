package com.dituibaobao.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChannelTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelTaskExample() {
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

        public Criteria andChannelUserIdIsNull() {
            addCriterion("channel_user_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdIsNotNull() {
            addCriterion("channel_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdEqualTo(Integer value) {
            addCriterion("channel_user_id =", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdNotEqualTo(Integer value) {
            addCriterion("channel_user_id <>", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdGreaterThan(Integer value) {
            addCriterion("channel_user_id >", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_user_id >=", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdLessThan(Integer value) {
            addCriterion("channel_user_id <", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_user_id <=", value, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdIn(List<Integer> values) {
            addCriterion("channel_user_id in", values, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdNotIn(List<Integer> values) {
            addCriterion("channel_user_id not in", values, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_user_id between", value1, value2, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andChannelUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_user_id not between", value1, value2, "channelUserId");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNull() {
            addCriterion("task_code is null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIsNotNull() {
            addCriterion("task_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaskCodeEqualTo(Integer value) {
            addCriterion("task_code =", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotEqualTo(Integer value) {
            addCriterion("task_code <>", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThan(Integer value) {
            addCriterion("task_code >", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_code >=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThan(Integer value) {
            addCriterion("task_code <", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeLessThanOrEqualTo(Integer value) {
            addCriterion("task_code <=", value, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeIn(List<Integer> values) {
            addCriterion("task_code in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotIn(List<Integer> values) {
            addCriterion("task_code not in", values, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeBetween(Integer value1, Integer value2) {
            addCriterion("task_code between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("task_code not between", value1, value2, "taskCode");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNull() {
            addCriterion("task_type is null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIsNotNull() {
            addCriterion("task_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTypeEqualTo(String value) {
            addCriterion("task_type =", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotEqualTo(String value) {
            addCriterion("task_type <>", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThan(String value) {
            addCriterion("task_type >", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeGreaterThanOrEqualTo(String value) {
            addCriterion("task_type >=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThan(String value) {
            addCriterion("task_type <", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLessThanOrEqualTo(String value) {
            addCriterion("task_type <=", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeLike(String value) {
            addCriterion("task_type like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotLike(String value) {
            addCriterion("task_type not like", value, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeIn(List<String> values) {
            addCriterion("task_type in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotIn(List<String> values) {
            addCriterion("task_type not in", values, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeBetween(String value1, String value2) {
            addCriterion("task_type between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskTypeNotBetween(String value1, String value2) {
            addCriterion("task_type not between", value1, value2, "taskType");
            return (Criteria) this;
        }

        public Criteria andTaskUrlIsNull() {
            addCriterion("task_url is null");
            return (Criteria) this;
        }

        public Criteria andTaskUrlIsNotNull() {
            addCriterion("task_url is not null");
            return (Criteria) this;
        }

        public Criteria andTaskUrlEqualTo(String value) {
            addCriterion("task_url =", value, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlNotEqualTo(String value) {
            addCriterion("task_url <>", value, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlGreaterThan(String value) {
            addCriterion("task_url >", value, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlGreaterThanOrEqualTo(String value) {
            addCriterion("task_url >=", value, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlLessThan(String value) {
            addCriterion("task_url <", value, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlLessThanOrEqualTo(String value) {
            addCriterion("task_url <=", value, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlLike(String value) {
            addCriterion("task_url like", value, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlNotLike(String value) {
            addCriterion("task_url not like", value, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlIn(List<String> values) {
            addCriterion("task_url in", values, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlNotIn(List<String> values) {
            addCriterion("task_url not in", values, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlBetween(String value1, String value2) {
            addCriterion("task_url between", value1, value2, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskUrlNotBetween(String value1, String value2) {
            addCriterion("task_url not between", value1, value2, "taskUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlIsNull() {
            addCriterion("task_qr_url is null");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlIsNotNull() {
            addCriterion("task_qr_url is not null");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlEqualTo(String value) {
            addCriterion("task_qr_url =", value, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlNotEqualTo(String value) {
            addCriterion("task_qr_url <>", value, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlGreaterThan(String value) {
            addCriterion("task_qr_url >", value, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlGreaterThanOrEqualTo(String value) {
            addCriterion("task_qr_url >=", value, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlLessThan(String value) {
            addCriterion("task_qr_url <", value, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlLessThanOrEqualTo(String value) {
            addCriterion("task_qr_url <=", value, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlLike(String value) {
            addCriterion("task_qr_url like", value, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlNotLike(String value) {
            addCriterion("task_qr_url not like", value, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlIn(List<String> values) {
            addCriterion("task_qr_url in", values, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlNotIn(List<String> values) {
            addCriterion("task_qr_url not in", values, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlBetween(String value1, String value2) {
            addCriterion("task_qr_url between", value1, value2, "taskQrUrl");
            return (Criteria) this;
        }

        public Criteria andTaskQrUrlNotBetween(String value1, String value2) {
            addCriterion("task_qr_url not between", value1, value2, "taskQrUrl");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdIsNull() {
            addCriterion("thirdparty_channel_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdIsNotNull() {
            addCriterion("thirdparty_channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdEqualTo(Integer value) {
            addCriterion("thirdparty_channel_id =", value, "thirdpartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdNotEqualTo(Integer value) {
            addCriterion("thirdparty_channel_id <>", value, "thirdpartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdGreaterThan(Integer value) {
            addCriterion("thirdparty_channel_id >", value, "thirdpartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("thirdparty_channel_id >=", value, "thirdpartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdLessThan(Integer value) {
            addCriterion("thirdparty_channel_id <", value, "thirdpartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("thirdparty_channel_id <=", value, "thirdpartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdIn(List<Integer> values) {
            addCriterion("thirdparty_channel_id in", values, "thirdpartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdNotIn(List<Integer> values) {
            addCriterion("thirdparty_channel_id not in", values, "thirdpartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("thirdparty_channel_id between", value1, value2, "thirdpartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("thirdparty_channel_id not between", value1, value2, "thirdpartyChannelId");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameIsNull() {
            addCriterion("thirdparty_channel_name is null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameIsNotNull() {
            addCriterion("thirdparty_channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameEqualTo(String value) {
            addCriterion("thirdparty_channel_name =", value, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameNotEqualTo(String value) {
            addCriterion("thirdparty_channel_name <>", value, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameGreaterThan(String value) {
            addCriterion("thirdparty_channel_name >", value, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("thirdparty_channel_name >=", value, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameLessThan(String value) {
            addCriterion("thirdparty_channel_name <", value, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameLessThanOrEqualTo(String value) {
            addCriterion("thirdparty_channel_name <=", value, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameLike(String value) {
            addCriterion("thirdparty_channel_name like", value, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameNotLike(String value) {
            addCriterion("thirdparty_channel_name not like", value, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameIn(List<String> values) {
            addCriterion("thirdparty_channel_name in", values, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameNotIn(List<String> values) {
            addCriterion("thirdparty_channel_name not in", values, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameBetween(String value1, String value2) {
            addCriterion("thirdparty_channel_name between", value1, value2, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelNameNotBetween(String value1, String value2) {
            addCriterion("thirdparty_channel_name not between", value1, value2, "thirdpartyChannelName");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneIsNull() {
            addCriterion("thirdparty_channel_phone is null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneIsNotNull() {
            addCriterion("thirdparty_channel_phone is not null");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneEqualTo(String value) {
            addCriterion("thirdparty_channel_phone =", value, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneNotEqualTo(String value) {
            addCriterion("thirdparty_channel_phone <>", value, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneGreaterThan(String value) {
            addCriterion("thirdparty_channel_phone >", value, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("thirdparty_channel_phone >=", value, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneLessThan(String value) {
            addCriterion("thirdparty_channel_phone <", value, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneLessThanOrEqualTo(String value) {
            addCriterion("thirdparty_channel_phone <=", value, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneLike(String value) {
            addCriterion("thirdparty_channel_phone like", value, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneNotLike(String value) {
            addCriterion("thirdparty_channel_phone not like", value, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneIn(List<String> values) {
            addCriterion("thirdparty_channel_phone in", values, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneNotIn(List<String> values) {
            addCriterion("thirdparty_channel_phone not in", values, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneBetween(String value1, String value2) {
            addCriterion("thirdparty_channel_phone between", value1, value2, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andThirdpartyChannelPhoneNotBetween(String value1, String value2) {
            addCriterion("thirdparty_channel_phone not between", value1, value2, "thirdpartyChannelPhone");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdIsNull() {
            addCriterion("task_pointapply_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdIsNotNull() {
            addCriterion("task_pointapply_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdEqualTo(Integer value) {
            addCriterion("task_pointapply_id =", value, "taskPointapplyId");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdNotEqualTo(Integer value) {
            addCriterion("task_pointapply_id <>", value, "taskPointapplyId");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdGreaterThan(Integer value) {
            addCriterion("task_pointapply_id >", value, "taskPointapplyId");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_pointapply_id >=", value, "taskPointapplyId");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdLessThan(Integer value) {
            addCriterion("task_pointapply_id <", value, "taskPointapplyId");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_pointapply_id <=", value, "taskPointapplyId");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdIn(List<Integer> values) {
            addCriterion("task_pointapply_id in", values, "taskPointapplyId");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdNotIn(List<Integer> values) {
            addCriterion("task_pointapply_id not in", values, "taskPointapplyId");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdBetween(Integer value1, Integer value2) {
            addCriterion("task_pointapply_id between", value1, value2, "taskPointapplyId");
            return (Criteria) this;
        }

        public Criteria andTaskPointapplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_pointapply_id not between", value1, value2, "taskPointapplyId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdIsNull() {
            addCriterion("task_point_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdIsNotNull() {
            addCriterion("task_point_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdEqualTo(Integer value) {
            addCriterion("task_point_id =", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdNotEqualTo(Integer value) {
            addCriterion("task_point_id <>", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdGreaterThan(Integer value) {
            addCriterion("task_point_id >", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_point_id >=", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdLessThan(Integer value) {
            addCriterion("task_point_id <", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_point_id <=", value, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdIn(List<Integer> values) {
            addCriterion("task_point_id in", values, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdNotIn(List<Integer> values) {
            addCriterion("task_point_id not in", values, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdBetween(Integer value1, Integer value2) {
            addCriterion("task_point_id between", value1, value2, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskPointIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_point_id not between", value1, value2, "taskPointId");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNull() {
            addCriterion("task_start_time is null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIsNotNull() {
            addCriterion("task_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeEqualTo(Date value) {
            addCriterion("task_start_time =", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotEqualTo(Date value) {
            addCriterion("task_start_time <>", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThan(Date value) {
            addCriterion("task_start_time >", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("task_start_time >=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThan(Date value) {
            addCriterion("task_start_time <", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("task_start_time <=", value, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeIn(List<Date> values) {
            addCriterion("task_start_time in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotIn(List<Date> values) {
            addCriterion("task_start_time not in", values, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeBetween(Date value1, Date value2) {
            addCriterion("task_start_time between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andTaskStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("task_start_time not between", value1, value2, "taskStartTime");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameIsNull() {
            addCriterion("origin_task_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameIsNotNull() {
            addCriterion("origin_task_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameEqualTo(String value) {
            addCriterion("origin_task_name =", value, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameNotEqualTo(String value) {
            addCriterion("origin_task_name <>", value, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameGreaterThan(String value) {
            addCriterion("origin_task_name >", value, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("origin_task_name >=", value, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameLessThan(String value) {
            addCriterion("origin_task_name <", value, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameLessThanOrEqualTo(String value) {
            addCriterion("origin_task_name <=", value, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameLike(String value) {
            addCriterion("origin_task_name like", value, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameNotLike(String value) {
            addCriterion("origin_task_name not like", value, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameIn(List<String> values) {
            addCriterion("origin_task_name in", values, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameNotIn(List<String> values) {
            addCriterion("origin_task_name not in", values, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameBetween(String value1, String value2) {
            addCriterion("origin_task_name between", value1, value2, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskNameNotBetween(String value1, String value2) {
            addCriterion("origin_task_name not between", value1, value2, "originTaskName");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdIsNull() {
            addCriterion("origin_task_id is null");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdIsNotNull() {
            addCriterion("origin_task_id is not null");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdEqualTo(Integer value) {
            addCriterion("origin_task_id =", value, "originTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdNotEqualTo(Integer value) {
            addCriterion("origin_task_id <>", value, "originTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdGreaterThan(Integer value) {
            addCriterion("origin_task_id >", value, "originTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("origin_task_id >=", value, "originTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdLessThan(Integer value) {
            addCriterion("origin_task_id <", value, "originTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("origin_task_id <=", value, "originTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdIn(List<Integer> values) {
            addCriterion("origin_task_id in", values, "originTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdNotIn(List<Integer> values) {
            addCriterion("origin_task_id not in", values, "originTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("origin_task_id between", value1, value2, "originTaskId");
            return (Criteria) this;
        }

        public Criteria andOriginTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("origin_task_id not between", value1, value2, "originTaskId");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateIsNull() {
            addCriterion("task_begin_date is null");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateIsNotNull() {
            addCriterion("task_begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateEqualTo(Date value) {
            addCriterion("task_begin_date =", value, "taskBeginDate");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateNotEqualTo(Date value) {
            addCriterion("task_begin_date <>", value, "taskBeginDate");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateGreaterThan(Date value) {
            addCriterion("task_begin_date >", value, "taskBeginDate");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("task_begin_date >=", value, "taskBeginDate");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateLessThan(Date value) {
            addCriterion("task_begin_date <", value, "taskBeginDate");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("task_begin_date <=", value, "taskBeginDate");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateIn(List<Date> values) {
            addCriterion("task_begin_date in", values, "taskBeginDate");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateNotIn(List<Date> values) {
            addCriterion("task_begin_date not in", values, "taskBeginDate");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateBetween(Date value1, Date value2) {
            addCriterion("task_begin_date between", value1, value2, "taskBeginDate");
            return (Criteria) this;
        }

        public Criteria andTaskBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("task_begin_date not between", value1, value2, "taskBeginDate");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateIsNull() {
            addCriterion("task_end_date is null");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateIsNotNull() {
            addCriterion("task_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateEqualTo(Date value) {
            addCriterion("task_end_date =", value, "taskEndDate");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateNotEqualTo(Date value) {
            addCriterion("task_end_date <>", value, "taskEndDate");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateGreaterThan(Date value) {
            addCriterion("task_end_date >", value, "taskEndDate");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("task_end_date >=", value, "taskEndDate");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateLessThan(Date value) {
            addCriterion("task_end_date <", value, "taskEndDate");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateLessThanOrEqualTo(Date value) {
            addCriterion("task_end_date <=", value, "taskEndDate");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateIn(List<Date> values) {
            addCriterion("task_end_date in", values, "taskEndDate");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateNotIn(List<Date> values) {
            addCriterion("task_end_date not in", values, "taskEndDate");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateBetween(Date value1, Date value2) {
            addCriterion("task_end_date between", value1, value2, "taskEndDate");
            return (Criteria) this;
        }

        public Criteria andTaskEndDateNotBetween(Date value1, Date value2) {
            addCriterion("task_end_date not between", value1, value2, "taskEndDate");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeIsNull() {
            addCriterion("supervision_code is null");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeIsNotNull() {
            addCriterion("supervision_code is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeEqualTo(String value) {
            addCriterion("supervision_code =", value, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeNotEqualTo(String value) {
            addCriterion("supervision_code <>", value, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeGreaterThan(String value) {
            addCriterion("supervision_code >", value, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("supervision_code >=", value, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeLessThan(String value) {
            addCriterion("supervision_code <", value, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeLessThanOrEqualTo(String value) {
            addCriterion("supervision_code <=", value, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeLike(String value) {
            addCriterion("supervision_code like", value, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeNotLike(String value) {
            addCriterion("supervision_code not like", value, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeIn(List<String> values) {
            addCriterion("supervision_code in", values, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeNotIn(List<String> values) {
            addCriterion("supervision_code not in", values, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeBetween(String value1, String value2) {
            addCriterion("supervision_code between", value1, value2, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andSupervisionCodeNotBetween(String value1, String value2) {
            addCriterion("supervision_code not between", value1, value2, "supervisionCode");
            return (Criteria) this;
        }

        public Criteria andCommandStatusIsNull() {
            addCriterion("command_status is null");
            return (Criteria) this;
        }

        public Criteria andCommandStatusIsNotNull() {
            addCriterion("command_status is not null");
            return (Criteria) this;
        }

        public Criteria andCommandStatusEqualTo(String value) {
            addCriterion("command_status =", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusNotEqualTo(String value) {
            addCriterion("command_status <>", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusGreaterThan(String value) {
            addCriterion("command_status >", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusGreaterThanOrEqualTo(String value) {
            addCriterion("command_status >=", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusLessThan(String value) {
            addCriterion("command_status <", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusLessThanOrEqualTo(String value) {
            addCriterion("command_status <=", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusLike(String value) {
            addCriterion("command_status like", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusNotLike(String value) {
            addCriterion("command_status not like", value, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusIn(List<String> values) {
            addCriterion("command_status in", values, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusNotIn(List<String> values) {
            addCriterion("command_status not in", values, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusBetween(String value1, String value2) {
            addCriterion("command_status between", value1, value2, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCommandStatusNotBetween(String value1, String value2) {
            addCriterion("command_status not between", value1, value2, "commandStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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