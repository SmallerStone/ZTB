package com.tianchen.ztb.manager;

import com.tianchen.ztb.bean.User;

public interface UserManager {
	
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
}
