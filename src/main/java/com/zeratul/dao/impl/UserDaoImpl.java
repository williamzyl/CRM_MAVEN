package com.zeratul.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.zeratul.bean.User;
import com.zeratul.dao.UserDao;

@SuppressWarnings("all")
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	
	@Override
	public User getUserByCode(final String userCode) {
		System.out.println(userCode);
		// HQL 
		return getHibernateTemplate().execute(new HibernateCallback<User>() {

			@Override
			public User doInHibernate(Session session)
					throws HibernateException {
				String hql=" from User where userCode=? ";
				
				Query query = session.createQuery(hql);
				query.setParameter(0, userCode);
				User user = (User) query.uniqueResult();
				
				return user;
			}
		});
		
		// 离线Criteria 查询
//		DetachedCriteria criteria=DetachedCriteria.forClass(User.class);
//		criteria.add(Restrictions.eq("userCode", userCode));
//		
//		List<User> list = (List<User>) getHibernateTemplate().findByCriteria(criteria);
//		
//		if(list!=null&&list.size()>0){
//			return list.get(0);
//		}else{
//			return null;
//		}
		
	}

	@Override
	public void saveUser(User u) {
		
		Session session = getSessionFactory().getCurrentSession();
		session.save(u);
		
	}

}
