package com.tianchen.ztb.dao;

import java.util.List;

import com.tianchen.ztb.bean.ZBbook;


public interface ZBDao {
	/*
	 * 添加招标
	 */
	public void addZB(ZBbook zBbook);
	
	/*
	 * 删除招标文件
	 */
	public void delZB(String zbCode);
	/*
	 * 
	 * 修改招标文件
	 */
	public void updateZb(String zbCode);
	/*
	 * 根据ID查找招标文件
	 */
	public ZBbook fingZbByCode(String zbCode);
	/*
	 * 查找所有招标文件
	 */
	public List<ZBbook> getAllZbBooks();
}
