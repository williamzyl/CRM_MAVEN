package com.zeratul.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDao<T> {
	
	// 新增或修改
	void saveOrUpdate(T t);
	// 增
	void save(T t);
	// 删
	void delete(Serializable id);	
	// 改
	void update(T t);
	// 查
	// 根据ID 查询
	T getById(Serializable id);
	// 查询总量
	Integer getTotalCount(DetachedCriteria dc);
	// 分页查询列表
	List<T> getPageList(DetachedCriteria dc,Integer start,Integer pageSize);
	// 查询所有列表
	List<T> getAllList(DetachedCriteria dc);
}
