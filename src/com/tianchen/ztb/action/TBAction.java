package com.tianchen.ztb.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.tianchen.ztb.bean.ZBbook;
import com.tianchen.ztb.common.Json;
import com.tianchen.ztb.manager.impl.TBManagerImpl;

public class TBAction extends ActionSupport{
	private List<ZBbook> list;
	//private List<TBtb> list2;//��Ͷ��ͳ�Ʊ�
	private ZBbook data;
	private int zbid;// �б���id
	//private TBManagerImpl tBManager;
	  HttpServletRequest request = ServletActionContext.getRequest();
	    HttpServletResponse response = ServletActionContext.getResponse();
	/**
	 * �����б���Ϣ�����ظ���Ͷ������ҳ����Ͷ���˲鿴���б���Ϣ
	 * @return
	 */
    public String queryZBInfo()
    
    {
    	//list=tBManager.queryZB();
    	return "sss";
    }
    /**
     * ͨ���б���id����ĳһ���б���Ϣ
     * @return
     */
    public String  findInfo()
    {
    	//data=;
    	try {
			response.setCharacterEncoding("gb18030");
			response.getWriter().write(Json.beanToJsonWithName(data));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return "findInfo";
    }
    /**
     *������Ͷ�ݱ��飬����list
     * @return
     */
   /* public String findtb()
    {
        list2=
    	return "findtb";
    }*/
    
    
    
    
    
    
	public List<ZBbook> getList() {
		return list;
	}
	public void setList(List<ZBbook> list) {
		this.list = list;
	}
	public int getZbid() {
		return zbid;
	}
	public void setZbid(int zbid) {
		this.zbid = zbid;
	}
	public ZBbook getData() {
		return data;
	}
	public void setData(ZBbook data) {
		this.data = data;
	}
	/*public List<TBtb> getList2() {
		return list2;
	}
	public void setList2(List<TBtb> list2) {
		this.list2 = list2;
	}
*/
	
//
//	public TBManagerImpl gettBManager() {
//		return tBManager;
//	}
//
//	public void settBManager(TBManagerImpl tBManager) {
//		this.tBManager = tBManager;
//	}
	
}
