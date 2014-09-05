package com.tianchen.ztb.manager.impl;

import java.util.List;

import com.tianchen.ztb.bean.ZBbook;
import com.tianchen.ztb.dao.TBDao;
import com.tianchen.ztb.dao.impl.TBDaoImpl;
import com.tianchen.ztb.manager.TBManager;

public class TBManagerImpl implements TBManager{
	private TBDao tBDao;
	@Override
	public List<ZBbook> queryZB() {
		// TODO Auto-generated method stub
		return tBDao.queryZB();
	}
	public TBDao gettBDao() {
		return tBDao;
	}
	public void settBDao(TBDao tBDao) {
		this.tBDao = tBDao;
	}
	
}
