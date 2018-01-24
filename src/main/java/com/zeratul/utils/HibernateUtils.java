package com.zeratul.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

	private static SessionFactory sessionFactory = null;

	static {
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();

	}

	public static Session openSession() {
		Session session = null;
		if (sessionFactory != null) {
			session = sessionFactory.openSession();
		}

		return session;
	}

	// 获得session => 获得与线程绑定的session
	public static Session getCurrentSession() {
		// 3 获得session
		Session session = sessionFactory.getCurrentSession();

		return session;
	}

	public static void commitSession(Session session, Transaction tx) {
		tx.commit();
		session.close();
	}
}
