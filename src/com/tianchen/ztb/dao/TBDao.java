package com.tianchen.ztb.dao;

import java.util.List;

import com.tianchen.ztb.bean.ZBbook;


public interface TBDao {
    /*
     * 招标书信息查询
     */
	public List<ZBbook> queryZB();
}
