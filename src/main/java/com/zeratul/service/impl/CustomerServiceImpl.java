package com.zeratul.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.zeratul.bean.Customer;
import com.zeratul.bean.PageBean;
import com.zeratul.dao.CustomerDao;
import com.zeratul.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	


	@SuppressWarnings("unchecked")
	@Override
	public PageBean getCustomerPage(DetachedCriteria criteria, Integer currentPage, Integer pageSize) {
		
		int totalSize=customerDao.getTotalCount(criteria);
		
		PageBean pageBean=new PageBean(currentPage, pageSize, totalSize);
		System.out.println(pageBean.getPageSize());
		List<Customer> list=customerDao.getPageList(criteria,pageBean.getStart(),pageBean.getPageSize());
		pageBean.setList(list);
		
		return pageBean;
	}

	@Override
	public void save(Customer c) {
		customerDao.saveOrUpdate(c);
	}

	@Override
	public Customer getCustomerById(Customer c) {
		return customerDao.getById(c.getCustId());
	}
	
	@Override
	public void delete(Customer customer) {
		customerDao.delete(customer.getCustId());
	}
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	

	
	
}
