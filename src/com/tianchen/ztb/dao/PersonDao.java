package com.tianchen.ztb.dao;

import com.tianchen.ztb.bean.User;

/*
 * �û�����
 */
public interface PersonDao {
	/*
	 * �û����
	 */
	public void addPerson(User user);
	
	/*
	 * �û��޸�
	 */
	public void updatePerson(int userId);
	
	/*
	 * �û�����
	 * ����Id����
	 */
	public User findPersonById(int userId);
	
	/*
	 * ɾ���û�
	 */
	public void delPerson(int userId);
}
