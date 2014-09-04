package com.tianchen.ztb.dao;

import com.tianchen.ztb.bean.User;

/*
 * 用户管理
 */
public interface UserDao {
	/*
	 * 用户添加
	 */
	public void addUser(User user);
	
	/*
	 * 用户修改
	 */
	public void updateUser(int userId);
	
	/*
	 * 用户查找
	 * 根据Id查找
	 */
	public User findUserById(int userId);
	
	/*
	 * 删除用户
	 */
	public void delUser(int userId);
	/*
	 * 登录
	 */
	public User login(String name, String password);
}
