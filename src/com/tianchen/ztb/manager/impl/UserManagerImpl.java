package com.tianchen.ztb.manager.impl;

import com.tianchen.ztb.bean.User;
import com.tianchen.ztb.dao.UserDao;
import com.tianchen.ztb.manager.UserManager;

public class UserManagerImpl implements UserManager {

	private UserDao userDao;
	@Override
	public void addUser(User user) {
		System.out.println("------mananger----");
		userDao.addUser(user);

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

	
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User login(String username, String password) {
		System.out.println("loginmanager");
		return userDao.login(username, password);
	}
	
	
}
