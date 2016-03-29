package com.datastax.verizoncrm;

import java.util.Date;

import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "verizon", name = "message",
readConsistency = "ONE",
writeConsistency = "ONE",
caseSensitiveKeyspace = false,
caseSensitiveTable = false)

public class Message {
    private String tx_id;
    private String action;
    private String action_code;
    private Date action_date;
    private String app_nm;
    private String filter_category;
    private String message;
    private String message_actions;
    private Date message_expiry_ts;
    private String message_type;
    private int priority;
    private Date recv_dt;
    private String remark;
    private Date sent_dt;
    private String short_message;
    private String sms_tx_id;
    private int status_id;
    private String subject;
    private String trans_nm;
    private String vzcom_userid;
    
	public String getTx_id() {
		return tx_id;
	}
	public void setTx_id(String tx_id) {
		this.tx_id = tx_id;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getAction_code() {
		return action_code;
	}
	public void setAction_code(String action_code) {
		this.action_code = action_code;
	}
	public Date getAction_date() {
		return action_date;
	}
	public void setAction_date(Date action_date) {
		this.action_date = action_date;
	}
	public String getApp_nm() {
		return app_nm;
	}
	public void setApp_nm(String app_nm) {
		this.app_nm = app_nm;
	}
	public String getFilter_category() {
		return filter_category;
	}
	public void setFilter_category(String filter_category) {
		this.filter_category = filter_category;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage_actions() {
		return message_actions;
	}
	public void setMessage_actions(String message_actions) {
		this.message_actions = message_actions;
	}
	public Date getMessage_expiry_ts() {
		return message_expiry_ts;
	}
	public void setMessage_expiry_ts(Date message_expiry_ts) {
		this.message_expiry_ts = message_expiry_ts;
	}
	public String getMessage_type() {
		return message_type;
	}
	public void setMessage_type(String message_type) {
		this.message_type = message_type;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public Date getRecv_dt() {
		return recv_dt;
	}
	public void setRecv_dt(Date recv_dt) {
		this.recv_dt = recv_dt;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getSent_dt() {
		return sent_dt;
	}
	public void setSent_dt(Date sent_dt) {
		this.sent_dt = sent_dt;
	}
	public String getShort_message() {
		return short_message;
	}
	public void setShort_message(String short_message) {
		this.short_message = short_message;
	}
	public String getSms_tx_id() {
		return sms_tx_id;
	}
	public void setSms_tx_id(String sms_tx_id) {
		this.sms_tx_id = sms_tx_id;
	}
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTrans_nm() {
		return trans_nm;
	}
	public void setTrans_nm(String trans_nm) {
		this.trans_nm = trans_nm;
	}
	public String getVzcom_userid() {
		return vzcom_userid;
	}
	public void setVzcom_userid(String vzcom_userid) {
		this.vzcom_userid = vzcom_userid;
	}
    
}
