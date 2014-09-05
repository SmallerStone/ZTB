package com.tianchen.ztb.dao.impl;

import java.util.List;

import javax.ejb.FinderException;

import org.hibernate.SessionFactory;

import com.tianchen.ztb.bean.ZBbook;
import com.tianchen.ztb.dao.ZBDao;

public class ZBDaoImpl implements ZBDao {
	
	private SessionFactory sessionFactory;
	@Override
	public void addZB(ZBbook zBbook) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(zBbook);
	}

	@Override
	public void delZB(String zbCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateZb(String zbCodes) {
		// TODO Auto-generated method stub

	}

	@Override
	public ZBbook fingZbByCode(String zbCode) {
		// TODO Auto-generated method stub
		String hql = "from ZBbook zb where zb.zbCode = ?";
		ZBbook zBbook = (ZBbook)sessionFactory.getCurrentSession().createQuery(hql)
					  .setParameter(0, zbCode)
					  .uniqueResult();
		return zBbook;
	}

	@Override
	public List<ZBbook> getAllZbBooks() {
		String hql = "from ZBbook";
		List<ZBbook> list = sessionFactory.getCurrentSession().createQuery(hql).list();
		return null;
	}

}
