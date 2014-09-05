package com.tianchen.ztb.manager;

import java.util.List;

import com.tianchen.ztb.bean.ZBbook;

public interface ZBmanager {
		/*
		 * ����б�
		 */
		public void addZB(ZBbook zBbook);
		
		/*
		 * ɾ���б��ļ�
		 */
		public void delZB(String zbCode);
		/*
		 * 
		 * �޸��б��ļ�
		 */
		public void updateZb(String zbCode);
		/*
		 * ����ID�����б��ļ�
		 */
		public ZBbook fingZbByCode(String zbCode);
		/*
		 * ���������б��ļ�
		 */
		public List<ZBbook> getAllZbBooks();
	}

