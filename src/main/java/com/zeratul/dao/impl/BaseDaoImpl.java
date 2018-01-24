package com.zeratul.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.zeratul.dao.BaseDao;

public class BaseDaoImpl<T> extends HibernateDaoSupport implements BaseDao<T> {

	@SuppressWarnings("rawtypes")
	private Class clazz;

	@SuppressWarnings("rawtypes")
	public BaseDaoImpl() {
		// 获得当前类型的带有泛型类型的父类
		ParameterizedType pt = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		// 获得运行期的泛型类型
		clazz = (Class) pt.getActualTypeArguments()[0];
	}

	@Override
	public void save(T t) {
		getHibernateTemplate().save(t);
	}

	@Override
	public void delete(Serializable id) {
		T t = this.getById(id);
		getHibernateTemplate().delete(t);
	}

	@Override
	public void update(T t) {
		getHibernateTemplate().update(t);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getById(Serializable id) {

		return (T) getHibernateTemplate().get(clazz, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Integer getTotalCount(DetachedCriteria dc) {
		dc.setProjection(Projections.rowCount());
		List<Long> list = (List<Long>) getHibernateTemplate()
				.findByCriteria(dc);
		dc.setProjection(null);
		if (list != null && list.size() > 0) {
			Long rows = list.get(0);
			return rows.intValue();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getPageList(DetachedCriteria dc, Integer start,
			Integer pageSize) {

		List<T> list = (List<T>) getHibernateTemplate().findByCriteria(dc,
				start, pageSize);

		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAllList(DetachedCriteria dc) {

		List<T> list = (List<T>) getHibernateTemplate().findByCriteria(dc);

		return list;

	}

	@Override
	public void saveOrUpdate(T t) {
		getHibernateTemplate().saveOrUpdate(t);
		
	}

}
