package com.tianchen.ztb.dao;

import com.tianchen.ztb.bean.User;

/*
 * �û�����
 */
public interface UserDao {
	/*
	 * �û����
	 */
	public void addUser(User user);
	
	/*
	 * �û��޸�
	 */
	public void updateUser(int userId);
	
	/*
	 * �û�����
	 * ����Id����
	 */
	public User findUserById(int userId);
	
	/*
	 * ɾ���û�
	 */
	public void delUser(int userId);
	/*
	 * ��¼
	 */
	public User login(String name, String password);
}
