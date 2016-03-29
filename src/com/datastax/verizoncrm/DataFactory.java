package com.datastax.verizoncrm;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import com.github.javafaker.Faker;

public final class DataFactory {
	private final Faker fakedata;
	private Random rand;
	private Date startDate;
	private Date endDate;
	
	public DataFactory(){
		fakedata = new Faker();
		rand = new Random();
		
		//Establish a date range
		Calendar day = Calendar.getInstance();
		endDate = day.getTime();
		
		day.add(Calendar.DATE, -30);
		startDate = day.getTime();
	}
	
	public Notification createNotification(Message m){
		Notification n = new Notification();
		n.setApp_nm(m.getApp_nm());
		n.setCategory_key(fakedata.lorem().word());
		n.setContent_string(fakedata.lorem().sentence());
		n.setInput_id(fakedata.lorem().word());
		n.setMse_flow_id(rand.nextInt(100));
		n.setMse_flow_step(rand.nextInt(10));
		n.setMse_status(rand.nextInt(100));
		n.setMse_timestamp(fakedata.date().between(startDate, endDate));
		n.setMse_tx_id(fakedata.bothify("#######"));
		n.setNotify_processed_dt(fakedata.date().between(startDate, endDate));
		n.setNotify_retry(rand.nextInt(3));
		n.setNotify_serverid(rand.nextInt(1000));
		n.setNotify_status(rand.nextInt(2));
		n.setNotify_type_id(rand.nextInt(5));
		n.setPush_to_app(fakedata.lorem().word());
		n.setRecv_dt(m.getRecv_dt());
		n.setRemark(m.getRemark());
		n.setRequest_id(rand.nextInt(1000));
		n.setRequest_raw_id(n.getRequest_id());
		n.setResponse_desc(fakedata.lorem().word());
		n.setResponse_code(n.getResponse_desc().substring(0,1));
		n.setSent_dt(m.getSent_dt());
		n.setSms_tx_id(m.getSms_tx_id());
		n.setStatus_id(m.getStatus_id());
		n.setTrans_nm(m.getTrans_nm());
		n.setTx_id(m.getTx_id());
		n.setVzcom_userid(m.getVzcom_userid());
		return n;
	}
	
	public Message createMessage(){
		Message m = new Message();
		m.setAction(fakedata.lorem().word());
		m.setAction_code(m.getAction().substring(0, 1));
		m.setAction_date(fakedata.date().between(startDate, endDate));
		m.setApp_nm(fakedata.lorem().sentence());
		m.setFilter_category(fakedata.lorem().word());
		m.setMessage(fakedata.lorem().paragraph());
		m.setMessage_actions(fakedata.lorem().word());
		m.setMessage_expiry_ts(fakedata.date().between(startDate, endDate));
		m.setMessage_type(fakedata.lorem().word());
		m.setPriority(rand.nextInt(2));
		m.setRecv_dt(fakedata.date().between(startDate, endDate));
		m.setRemark(fakedata.lorem().sentence());
		m.setSent_dt(fakedata.date().between(startDate, endDate));
		m.setShort_message(fakedata.lorem().sentence());
		m.setSms_tx_id(fakedata.phoneNumber().phoneNumber());
		m.setStatus_id(rand.nextInt(10));
		m.setSubject(fakedata.lorem().sentence());
		m.setTrans_nm(fakedata.lorem().word());
		m.setTx_id(fakedata.bothify("#?#################"));
		m.setVzcom_userid(fakedata.internet().emailAddress());
		return m;
	}
	
	public Inbox createInbox(Message m){
		Inbox in = new Inbox();
		in.setPriority(m.getPriority());
		in.setRecv_dt(m.getRecv_dt());
		in.setShort_message(m.getShort_message());
		in.setSubject(m.getSubject());
		in.setTx_id(m.getTx_id());
		in.setVzcom_userid(m.getVzcom_userid());
		return in;
	}
	
}
