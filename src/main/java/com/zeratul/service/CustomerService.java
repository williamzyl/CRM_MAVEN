package com.zeratul.service;



import org.hibernate.criterion.DetachedCriteria;

import com.zeratul.bean.Customer;
import com.zeratul.bean.PageBean;

public interface CustomerService {
	
	PageBean getCustomerPage(DetachedCriteria criteria, Integer currentPage, Integer pageSize);

	void save(Customer c);


	Customer getCustomerById(Customer c);

	void delete(Customer customer);
	
}
