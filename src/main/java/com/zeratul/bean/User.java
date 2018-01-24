package com.zeratul.bean;

public class User {

	
	
//	`user_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '用户id',
//	  `user_code` varchar(32) NOT NULL COMMENT '用户账号',
//	  `user_name` varchar(64) NOT NULL COMMENT '用户名称',
//	  `user_password` varchar(32) NOT NULL COMMENT '用户密码',
//	  `user_state` char(1) NOT NULL COMMENT '1:正常,0:暂停',
	
	private Long userId;
	private String userCode;
	private String userName;
	private String userPassword;
	private String  userState;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userCode=" + userCode
				+ ", userName=" + userName + ", userPassword=" + userPassword
				+ ", userState=" + userState + "]";
	}
	
}
