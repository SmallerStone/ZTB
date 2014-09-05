package com.tianchen.ztb.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tianchen.ztb.bean.ZBbook;
import com.tianchen.ztb.manager.impl.TBManagerImpl;

public class TBAction extends ActionSupport{
	private List<ZBbook> list;
	private TBManagerImpl tBManager;
    public String queryZBInfo()
    {
    	list=tBManager.queryZB();
    	return "sss";
    }
    
	public List<ZBbook> getList() {
		return list;
	}
	public void setList(List<ZBbook> list) {
		this.list = list;
	}

	public TBManagerImpl gettBManager() {
		return tBManager;
	}

	public void settBManager(TBManagerImpl tBManager) {
		this.tBManager = tBManager;
	}
	
}
