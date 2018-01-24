package com.zeratul.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import com.zeratul.bean.BaseDict;
import com.zeratul.dao.BaseDao;

public interface BaseDictService {
	
	 List<BaseDict> getBaseDictByCode(DetachedCriteria dc);
}
