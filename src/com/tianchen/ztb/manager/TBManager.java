package com.tianchen.ztb.manager;

import java.util.List;

import com.tianchen.ztb.bean.ZBbook;

public interface TBManager {
	/*
     * 招标书信息查询
     */
	public List<ZBbook> queryZB();
}
