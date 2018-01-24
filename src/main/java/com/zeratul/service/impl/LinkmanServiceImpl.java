package com.zeratul.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.zeratul.bean.Linkman;
import com.zeratul.bean.PageBean;
import com.zeratul.dao.LinkmanDao;
import com.zeratul.service.LinkmanService;

public class LinkmanServiceImpl implements LinkmanService {

	
	private  LinkmanDao ld;
	

	@Override
	public void save(Linkman linkman) {
		ld.saveOrUpdate(linkman);
	}
	
	@Override
	public Integer getTotalCount(DetachedCriteria dc) {
		
		return ld.getTotalCount(dc);
	}

	
	@Override
	public PageBean getLinkmanPage(DetachedCriteria dc, Integer currentPage,
			Integer pageSize) {
		
		Integer totalSize=ld.getTotalCount(dc);
		
		PageBean linkmanPage=new PageBean(currentPage, pageSize, totalSize);
		
		List<Linkman> pageList = ld.getPageList(dc, linkmanPage.getStart(), linkmanPage.getPageSize());
		linkmanPage.setList(pageList);
		return linkmanPage;
	}

	
	@Override
	public Linkman getLinkman(Linkman linkMan) {
		
		return ld.getById(linkMan.getLkmId());
	}
	
	@Override
	public void delete(Linkman linkMan) {		
		ld.delete(linkMan.getLkmId());
	}
	
	public void setLd(LinkmanDao ld) {
		this.ld = ld;
	}

	

	

	

	

}
