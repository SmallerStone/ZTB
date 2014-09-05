package com.tianchen.ztb.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.tianchen.ztb.bean.ZBbook;
import com.tianchen.ztb.dao.TBDao;

public class TBDaoImpl implements TBDao{
	private SessionFactory sessionFactory;
	@Override
	public List<ZBbook> queryZB() {
	      String hql = "from ZBbook";
	      List<ZBbook> list = (List<ZBbook>)sessionFactory.openSession().createQuery(hql).list();
		for(ZBbook w:list){
		     return list;
		    }
		return list;
	}

}
