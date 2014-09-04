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

	@Override
	public User login(String username, String password) {
		System.out.println("dao----------");
		System.out.println(username.length());
		System.out.println(password.length());
		if(username.length() != 0 && password.length()!= 0){
			User user = (User)sessionFactory.getCurrentSession().createQuery("from User u where u.userName=? and u.password=?")
						  .setParameter(0, username)
						  .setParameter(1, password)
						  .uniqueResult();
			System.out.println("dao------end----");
			return user;
		}
		return null;
	}


}
