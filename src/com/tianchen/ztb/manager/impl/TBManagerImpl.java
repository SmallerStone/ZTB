package com.tianchen.ztb.manager.impl;

import java.util.List;

import com.tianchen.ztb.bean.ZBbook;
import com.tianchen.ztb.dao.impl.TBDaoImpl;
import com.tianchen.ztb.manager.TBManager;

public class TBManagerImpl implements TBManager{
	private TBDaoImpl tBDaoImpl;
	@Override
	public List<ZBbook> queryZB() {
		// TODO Auto-generated method stub
		return tBDaoImpl.queryZB();
	}
	public TBDaoImpl gettBDaoImpl() {
		return tBDaoImpl;
	}
	public void settBDaoImpl(TBDaoImpl tBDaoImpl) {
		this.tBDaoImpl = tBDaoImpl;
	}

}
