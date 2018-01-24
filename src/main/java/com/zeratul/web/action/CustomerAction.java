package com.zeratul.web.action;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zeratul.bean.Customer;
import com.zeratul.bean.PageBean;
import com.zeratul.service.CustomerService;

public class CustomerAction extends ActionSupport  implements ModelDriven<Customer> {

	private Customer customer=new Customer();
	
	
	private Integer currentPage;
	private Integer pageSize;
	private CustomerService cs;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2906959531208928286L;
	
	
	public String list(){
		//封装离线查询对象
		DetachedCriteria criteria = DetachedCriteria.forClass(Customer.class);
		//判断并封装参数
		if (StringUtils.isNotBlank(customer.getCustName())) {
			criteria.add(Restrictions.like("custName",
					"%" + customer.getCustName() + "%"));
		}
		PageBean customerPage = cs.getCustomerPage(criteria,currentPage, pageSize);
		ActionContext.getContext().put("customerPage", customerPage);
		return "list";
	}
	
	public String add(){
		System.out.println(customer);
		cs.save(customer);
		return "toList";
	}

	public String edit(){
		Customer  c= cs.getCustomerById(customer);
		ActionContext.getContext().put("customer", c);
		return "toUpdate";
	}
	
	public String delete(){
		
		cs.delete(customer);
		return "toList";
	}
	

	@Override
	public Customer getModel() {
		return customer;
	}


	public void setCs(CustomerService cs) {
		this.cs = cs;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
}
