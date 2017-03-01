package com.dituibaobao.dao.model;

import java.util.Date;

public class ChannelTask {
    private Integer id;

    private Integer channelUserId;

    private String title;

    private Integer taskCode;

    private String taskType;

    private String taskUrl;

    private String taskQrUrl;

    private String status;

    private Integer thirdpartyChannelId;

    private String thirdpartyChannelName;

    private String thirdpartyChannelPhone;

    private Integer taskPointapplyId;

    private Integer taskPointId;

    private Date taskStartTime;

    private String originTaskName;

    private Integer originTaskId;

    private Date taskBeginDate;

    private Date taskEndDate;

    private String supervisionCode;

    private String commandStatus;

    private Date createdAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChannelUserId() {
        return channelUserId;
    }

    public void setChannelUserId(Integer channelUserId) {
        this.channelUserId = channelUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(Integer taskCode) {
        this.taskCode = taskCode;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType == null ? null : taskType.trim();
    }

    public String getTaskUrl() {
        return taskUrl;
    }

    public void setTaskUrl(String taskUrl) {
        this.taskUrl = taskUrl == null ? null : taskUrl.trim();
    }

    public String getTaskQrUrl() {
        return taskQrUrl;
    }

    public void setTaskQrUrl(String taskQrUrl) {
        this.taskQrUrl = taskQrUrl == null ? null : taskQrUrl.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getThirdpartyChannelId() {
        return thirdpartyChannelId;
    }

    public void setThirdpartyChannelId(Integer thirdpartyChannelId) {
        this.thirdpartyChannelId = thirdpartyChannelId;
    }

    public String getThirdpartyChannelName() {
        return thirdpartyChannelName;
    }

    public void setThirdpartyChannelName(String thirdpartyChannelName) {
        this.thirdpartyChannelName = thirdpartyChannelName == null ? null : thirdpartyChannelName.trim();
    }

    public String getThirdpartyChannelPhone() {
        return thirdpartyChannelPhone;
    }

    public void setThirdpartyChannelPhone(String thirdpartyChannelPhone) {
        this.thirdpartyChannelPhone = thirdpartyChannelPhone == null ? null : thirdpartyChannelPhone.trim();
    }

    public Integer getTaskPointapplyId() {
        return taskPointapplyId;
    }

    public void setTaskPointapplyId(Integer taskPointapplyId) {
        this.taskPointapplyId = taskPointapplyId;
    }

    public Integer getTaskPointId() {
        return taskPointId;
    }

    public void setTaskPointId(Integer taskPointId) {
        this.taskPointId = taskPointId;
    }

    public Date getTaskStartTime() {
        return taskStartTime;
    }

    public void setTaskStartTime(Date taskStartTime) {
        this.taskStartTime = taskStartTime;
    }

    public String getOriginTaskName() {
        return originTaskName;
    }

    public void setOriginTaskName(String originTaskName) {
        this.originTaskName = originTaskName == null ? null : originTaskName.trim();
    }

    public Integer getOriginTaskId() {
        return originTaskId;
    }

    public void setOriginTaskId(Integer originTaskId) {
        this.originTaskId = originTaskId;
    }

    public Date getTaskBeginDate() {
        return taskBeginDate;
    }

    public void setTaskBeginDate(Date taskBeginDate) {
        this.taskBeginDate = taskBeginDate;
    }

    public Date getTaskEndDate() {
        return taskEndDate;
    }

    public void setTaskEndDate(Date taskEndDate) {
        this.taskEndDate = taskEndDate;
    }

    public String getSupervisionCode() {
        return supervisionCode;
    }

    public void setSupervisionCode(String supervisionCode) {
        this.supervisionCode = supervisionCode == null ? null : supervisionCode.trim();
    }

    public String getCommandStatus() {
        return commandStatus;
    }

    public void setCommandStatus(String commandStatus) {
        this.commandStatus = commandStatus == null ? null : commandStatus.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}