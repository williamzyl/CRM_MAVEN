package com.zeratul.bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SaleVisit {
	
	/*
	 * `visit_id` varchar(32) NOT NULL,
  `visit_cust_id` bigint(32) DEFAULT NULL COMMENT '客户id',
  `visit_user_id` bigint(32) DEFAULT NULL COMMENT '负责人id',
  `visit_time` date DEFAULT NULL COMMENT '拜访时间',
  `visit_interviewee` varchar(32) DEFAULT NULL COMMENT '被拜访人',
  `visit_addr` varchar(128) DEFAULT NULL COMMENT '拜访地点',
  `visit_detail` varchar(256) DEFAULT NULL COMMENT '拜访详情',
  `visit_nexttime` date DEFAULT NULL COMMENT '下次拜访时间',
	 */
	
	private String visitId;
	private Date visitTime;
	private String visitInterviewee;
	private String  visitAddr;
	private String  visitDetail;
	private Date visitNextTime;
	
	private Customer customer;
	private User user;
	
	
	public String getVisitId() {
		return visitId;
	}
	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}
	public Date getVisitTime() {
		return visitTime;
	}
	public void setVisitTime(Date visitTime) {
		this.visitTime = visitTime;
	}
	public String getVisitInterviewee() {
		return visitInterviewee;
	}
	public void setVisitInterviewee(String visitInterviewee) {
		this.visitInterviewee = visitInterviewee;
	}
	public String getVisitAddr() {
		return visitAddr;
	}
	public void setVisitAddr(String visitAddr) {
		this.visitAddr = visitAddr;
	}
	public String getVisitDetail() {
		return visitDetail;
	}
	public void setVisitDetail(String visitDetail) {
		this.visitDetail = visitDetail;
	}
	public Date getVisitNextTime() {
		return visitNextTime;
	}
	public void setVisitNextTime(Date visitNextTime) {
		this.visitNextTime = visitNextTime;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "SaleVisit [visitId=" + visitId + ", visitTime=" + visitTime
				+ ", visitInterviewee=" + visitInterviewee + ", visitAddr="
				+ visitAddr + ", visitDetail=" + visitDetail
				+ ", visitNextTime=" + visitNextTime + ", customer=" + customer
				+ ", user=" + user + "]";
	}
	//-----------------------------------------------
		public String getVisitTime_s() {
			return transferDate(visitTime,"yyyy-MM-dd");
		}
		public String getVisitNextTime_s() {
			return transferDate(visitNextTime,"yyyy-MM-dd");
		}
		public static String  transferDate(Date date,String format){
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.format(date);
		}
	//-----------------------------------------------
	
	
	
	
}
