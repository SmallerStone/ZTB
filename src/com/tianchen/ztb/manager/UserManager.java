package com.tianchen.ztb.manager;

import com.tianchen.ztb.bean.User;

public interface UserManager {
	
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
}
