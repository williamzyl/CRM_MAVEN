package com.zeratul.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.zeratul.bean.Linkman;
import com.zeratul.bean.PageBean;

public interface LinkmanService {
	void save(Linkman linkman);

	Integer getTotalCount(DetachedCriteria dc);

	PageBean getLinkmanPage(DetachedCriteria dc, Integer currentPage, Integer pageSize);

	Linkman getLinkman(Linkman linkMan);

	void delete(Linkman linkMan);
}
