package com.zeratul.bean;

public class Customer {
	// `cust_id` bigint(32) NOT NULL AUTO_INCREMENT COMMENT '客户编号(主键)',
	// `cust_name` varchar(32) NOT NULL COMMENT '客户名称(公司名称)',
	// `cust_user_id` bigint(32) DEFAULT NULL COMMENT '负责人id',
	// `cust_create_id` bigint(32) DEFAULT NULL COMMENT '创建人id',
	// `cust_source` varchar(32) DEFAULT NULL COMMENT '客户信息来源',
	// `cust_industry` varchar(32) DEFAULT NULL COMMENT '客户所属行业',
	// `cust_level` varchar(32) DEFAULT NULL COMMENT '客户级别',
	// `cust_linkman` varchar(64) DEFAULT NULL COMMENT '联系人',
	// `cust_phone` varchar(64) DEFAULT NULL COMMENT '固定电话',
	// `cust_mobile` varchar(16) DEFAULT NULL COMMENT '移动电话',

	private Long custId;

	private String custName;
	private String custUserId;
	private String custCreatId;
	private String custLinkman;
	private String custPhone;
	private String custMobile;
	
	
	private BaseDict custSource;
	private BaseDict custLevel;
	private BaseDict custIndustry;

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getCustUserId() {
		return custUserId;
	}

	public void setCustUserId(String custUserId) {
		this.custUserId = custUserId;
	}

	public String getCustCreatId() {
		return custCreatId;
	}

	public void setCustCreatId(String custCreatId) {
		this.custCreatId = custCreatId;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
	public BaseDict getCustSource() {
		return custSource;
	}

	public void setCustSource(BaseDict custSource) {
		this.custSource = custSource;
	}


	public BaseDict getCustLevel() {
		return custLevel;
	}

	public void setCustLevel(BaseDict custLevel) {
		this.custLevel = custLevel;
	}

	public BaseDict getCustIndustry() {
		return custIndustry;
	}

	public void setCustIndustry(BaseDict custIndustry) {
		this.custIndustry = custIndustry;
	}

	public String getCustLinkman() {
		return custLinkman;
	}

	public void setCustLinkman(String custLinkman) {
		this.custLinkman = custLinkman;
	}

	public String getCustPhone() {
		return custPhone;
	}

	public void setCustPhone(String custPhone) {
		this.custPhone = custPhone;
	}

	public String getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custUserId=" + custUserId + ", custCreatId="
				+ custCreatId + ", custSource=" + custSource + ", custIndustry=" + custIndustry + ", custLevel="
				+ custLevel + ", custLinkman=" + custLinkman + ", custPhone=" + custPhone + ", custMobile=" + custMobile
				+ "]";
	}
}
