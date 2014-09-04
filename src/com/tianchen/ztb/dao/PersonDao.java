package com.tianchen.ztb.dao;

import com.tianchen.ztb.bean.User;

/*
 * 用户管理
 */
public interface PersonDao {
	/*
	 * 用户添加
	 */
	public void addPerson(User user);
	
	/*
	 * 用户修改
	 */
	public void updatePerson(int userId);
	
	/*
	 * 用户查找
	 * 根据Id查找
	 */
	public User findPersonById(int userId);
	
	/*
	 * 删除用户
	 */
	public void delPerson(int userId);
}
