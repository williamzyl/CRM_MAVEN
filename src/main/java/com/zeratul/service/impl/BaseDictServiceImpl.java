package com.zeratul.service.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.zeratul.bean.BaseDict;
import com.zeratul.dao.BaseDictDao;
import com.zeratul.service.BaseDictService;

public class BaseDictServiceImpl implements BaseDictService {

	private BaseDictDao bdd;
	
	
	@Override
	public List<BaseDict> getBaseDictByCode(DetachedCriteria dc) {
		
		List<BaseDict> list = bdd.getAllList(dc);
		
		return list;
	}

	public void setBdd(BaseDictDao bdd) {
		this.bdd = bdd;
	}

}
