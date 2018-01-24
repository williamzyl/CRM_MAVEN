package com.zeratul.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.zeratul.bean.PageBean;
import com.zeratul.bean.SaleVisit;
import com.zeratul.dao.SaleVisitDao;
import com.zeratul.service.SaleVistService;

public class SaleVisitServiceImpl implements SaleVistService {
	private SaleVisitDao svd;

	
	
	
	public void setSvd(SaleVisitDao svd) {
		this.svd = svd;
	}

	@Override
	public void save(SaleVisit saleVisit) {
		svd.saveOrUpdate(saleVisit);
	}

	@Override
	public PageBean getSaleVisitPage(DetachedCriteria dc, Integer currentPage,Integer pageSize) {
		
		Integer totalSize = svd.getTotalCount(dc);
		PageBean pageBean=new PageBean(currentPage, pageSize, totalSize);
		List<SaleVisit> list = svd.getPageList(dc, pageBean.getStart(), pageBean.getPageSize());
		pageBean.setList(list);
		return pageBean;
	}

	
	
	@Override
	public SaleVisit getSaleById(String visitId) {
		
		return svd.getById(visitId);
	}

	@Override
	public void delete(SaleVisit saleVisit) {
		svd.delete(saleVisit.getVisitId());
	}
	
	
}
