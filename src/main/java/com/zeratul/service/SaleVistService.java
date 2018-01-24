package com.zeratul.service;

import org.hibernate.criterion.DetachedCriteria;

import com.zeratul.bean.PageBean;
import com.zeratul.bean.SaleVisit;

public interface SaleVistService  {

	void save(SaleVisit saleVisit);

	PageBean getSaleVisitPage(DetachedCriteria dc, Integer currentPage,
			Integer pageSize);

	SaleVisit getSaleById(String visitId);

	void delete(SaleVisit saleVisit);
	
	

}
