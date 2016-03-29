package com.datastax.verizoncrm;

import java.util.Date;

import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "verizon", name = "inbox",
readConsistency = "ONE",
writeConsistency = "ONE",
caseSensitiveKeyspace = false,
caseSensitiveTable = false)

public class Inbox {
	    private String vzcom_userid;
	    private int priority;
	    private Date recv_dt;
	    private String tx_id;
	    private String short_message;
	    private String subject;
	    
		public String getVzcom_userid() {
			return vzcom_userid;
		}
		public void setVzcom_userid(String vzcom_userid) {
			this.vzcom_userid = vzcom_userid;
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
		public String getTx_id() {
			return tx_id;
		}
		public void setTx_id(String tx_id) {
			this.tx_id = tx_id;
		}
		public String getShort_message() {
			return short_message;
		}
		public void setShort_message(String short_message) {
			this.short_message = short_message;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
	    
	    
}
