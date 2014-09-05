package com.tianchen.ztb.manager.impl;

import java.util.List;

import com.tianchen.ztb.bean.ZBbook;
import com.tianchen.ztb.dao.ZBDao;
import com.tianchen.ztb.manager.ZBmanager;

public class ZBManagerImpl implements ZBmanager{

	private ZBDao zbDao;
	@Override
	public void addZB(ZBbook zBbook) {
		// TODO Auto-generated method stub
		zbDao.addZB(zBbook);
	}

	@Override
	public void delZB(String zbCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateZb(String zbCode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ZBbook fingZbByCode(String zbCode) {
		// TODO Auto-generated method stub
		return zbDao.fingZbByCode(zbCode);
	}

	@Override
	public List<ZBbook> getAllZbBooks() {
		// TODO Auto-generated method stub
		return zbDao.getAllZbBooks();
	}

	public ZBDao getZbDao() {
		return zbDao;
	}

	public void setZbDao(ZBDao zbDao) {
		this.zbDao = zbDao;
	}
	
}
