package com.tianchen.ztb.dao.impl;

import org.hibernate.SessionFactory;

import com.tianchen.ztb.bean.User;
import com.tianchen.ztb.dao.UserDao;

public class UserDaoImpl implements UserDao {

	private SessionFactory sessionFactory;
	@Override
	public void addUser(User user) {
		
		sessionFactory.getCurrentSession().save(user);
		
	}

	@Override
	public void updateUser(int userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delUser(int userId) {
		// TODO Auto-generated method stub

	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
