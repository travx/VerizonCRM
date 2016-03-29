package com.datastax.verizoncrm;

import java.util.Date;

import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "verizon", name = "pushnotif_input_transaction",
readConsistency = "ONE",
writeConsistency = "ONE",
caseSensitiveKeyspace = false,
caseSensitiveTable = false)

public class Notification {
	    private String tx_id;
	    private String app_nm;
	    private String category_key;
	    private String content_string;
	    private String input_id;
	    private int mse_flow_id;
	    private int mse_flow_step;
	    private int mse_status;
	    private Date mse_timestamp;
	    private String mse_tx_id;
	    private Date notify_processed_dt;
	    private int notify_retry;
	    private int notify_serverid;
	    private int notify_status;
	    private int notify_type_id;
	    private String push_to_app;
	    private Date recv_dt;
	    private String remark;
	    private int request_id;
	    private int request_raw_id;
	    private String response_code;
	    private String response_desc;
	    private Date sent_dt;
	    private String sms_tx_id;
	    private int status_id;
	    private String trans_nm;
	    private String vzcom_userid;
		    
			public String getTx_id() {
				return tx_id;
			}
			public void setTx_id(String tx_id) {
				this.tx_id = tx_id;
			}
			public String getApp_nm() {
				return app_nm;
			}
			public void setApp_nm(String app_nm) {
				this.app_nm = app_nm;
			}
			public String getCategory_key() {
				return category_key;
			}
			public void setCategory_key(String category_key) {
				this.category_key = category_key;
			}
			public String getContent_string() {
				return content_string;
			}
			public void setContent_string(String content_string) {
				this.content_string = content_string;
			}
			public String getInput_id() {
				return input_id;
			}
			public void setInput_id(String input_id) {
				this.input_id = input_id;
			}
			public int getMse_flow_id() {
				return mse_flow_id;
			}
			public void setMse_flow_id(int mse_flow_id) {
				this.mse_flow_id = mse_flow_id;
			}
			public int getMse_flow_step() {
				return mse_flow_step;
			}
			public void setMse_flow_step(int mse_flow_step) {
				this.mse_flow_step = mse_flow_step;
			}
			public int getMse_status() {
				return mse_status;
			}
			public void setMse_status(int mse_status) {
				this.mse_status = mse_status;
			}
			public Date getMse_timestamp() {
				return mse_timestamp;
			}
			public void setMse_timestamp(Date mse_timestamp) {
				this.mse_timestamp = mse_timestamp;
			}
			public String getMse_tx_id() {
				return mse_tx_id;
			}
			public void setMse_tx_id(String mse_tx_id) {
				this.mse_tx_id = mse_tx_id;
			}
			public Date getNotify_processed_dt() {
				return notify_processed_dt;
			}
			public void setNotify_processed_dt(Date notify_processed_dt) {
				this.notify_processed_dt = notify_processed_dt;
			}
			public int getNotify_retry() {
				return notify_retry;
			}
			public void setNotify_retry(int notify_retry) {
				this.notify_retry = notify_retry;
			}
			public int getNotify_serverid() {
				return notify_serverid;
			}
			public void setNotify_serverid(int notify_serverid) {
				this.notify_serverid = notify_serverid;
			}
			public int getNotify_status() {
				return notify_status;
			}
			public void setNotify_status(int notify_status) {
				this.notify_status = notify_status;
			}
			public int getNotify_type_id() {
				return notify_type_id;
			}
			public void setNotify_type_id(int notify_type_id) {
				this.notify_type_id = notify_type_id;
			}
			public String getPush_to_app() {
				return push_to_app;
			}
			public void setPush_to_app(String push_to_app) {
				this.push_to_app = push_to_app;
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
			public int getRequest_id() {
				return request_id;
			}
			public void setRequest_id(int request_id) {
				this.request_id = request_id;
			}
			public int getRequest_raw_id() {
				return request_raw_id;
			}
			public void setRequest_raw_id(int request_raw_id) {
				this.request_raw_id = request_raw_id;
			}
			public String getResponse_code() {
				return response_code;
			}
			public void setResponse_code(String response_code) {
				this.response_code = response_code;
			}
			public String getResponse_desc() {
				return response_desc;
			}
			public void setResponse_desc(String response_desc) {
				this.response_desc = response_desc;
			}
			public Date getSent_dt() {
				return sent_dt;
			}
			public void setSent_dt(Date sent_dt) {
				this.sent_dt = sent_dt;
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
