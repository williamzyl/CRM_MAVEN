package com.zeratul.bean;

public class Linkman {
//	`lkm_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '联系人编号(主键)',
//	  `lkm_name` varchar(16) DEFAULT NULL COMMENT '联系人姓名',
//	  `lkm_cust_id` bigint(32) NOT NULL COMMENT '客户id',
//	  `lkm_gender` char(1) DEFAULT NULL COMMENT '联系人性别',
//	  `lkm_phone` varchar(16) DEFAULT NULL COMMENT '联系人办公电话',
//	  `lkm_mobile` varchar(16) DEFAULT NULL COMMENT '联系人手机',
//	  `lkm_email` varchar(64) DEFAULT NULL COMMENT '联系人邮箱',
//	  `lkm_qq` varchar(16) DEFAULT NULL COMMENT '联系人qq',
//	  `lkm_position` varchar(16) DEFAULT NULL COMMENT '联系人职位',
//	  `lkm_memo` varchar(512) DEFAULT NULL COMMENT '联系人备注',
	
	private Long lkmId;
	private String lkmName;
	private String lkmGender;
	private String lkmPhone;
	private String lkmMobile;
	private String lkmEmail;
	private String lkmQQ;
	private String lkmPosition;
	private String lkmMemo;
	private Customer customer;
	
	
	
	public Long getLkmId() {
		return lkmId;
	}
	public void setLkmId(Long lkmId) {
		this.lkmId = lkmId;
	}
	public String getLkmName() {
		return lkmName;
	}
	public void setLkmName(String lkmName) {
		this.lkmName = lkmName;
	}
	public String getLkmGender() {
		return lkmGender;
	}
	public void setLkmGender(String lkmGender) {
		this.lkmGender = lkmGender;
	}
	public String getLkmPhone() {
		return lkmPhone;
	}
	public void setLkmPhone(String lkmPhone) {
		this.lkmPhone = lkmPhone;
	}
	public String getLkmMobile() {
		return lkmMobile;
	}
	public void setLkmMobile(String lkmMobile) {
		this.lkmMobile = lkmMobile;
	}
	public String getLkmEmail() {
		return lkmEmail;
	}
	public void setLkmEmail(String lkmEmail) {
		this.lkmEmail = lkmEmail;
	}
	public String getLkmQQ() {
		return lkmQQ;
	}
	public void setLkmQQ(String lkmQQ) {
		this.lkmQQ = lkmQQ;
	}
	public String getLkmPosition() {
		return lkmPosition;
	}
	public void setLkmPosition(String lkmPosition) {
		this.lkmPosition = lkmPosition;
	}
	public String getLkmMemo() {
		return lkmMemo;
	}
	public void setLkmMemo(String lkmMemo) {
		this.lkmMemo = lkmMemo;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Linkman [lkmId=" + lkmId + ", lkmName=" + lkmName
				+ ", lkmGender=" + lkmGender + ", lkmPhone=" + lkmPhone
				+ ", lkmMobile=" + lkmMobile + ", lkmEmail=" + lkmEmail
				+ ", lkmQQ=" + lkmQQ + ", lkmPosition=" + lkmPosition
				+ ", lkmMemo=" + lkmMemo + ", customer=" + customer + "]";
	}
	
}
