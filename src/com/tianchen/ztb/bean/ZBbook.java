package com.tianchen.ztb.bean;

import java.util.Date;

public class ZBbook {
    private int id;
        
    private User user;
    
    private String zbCode;//�б������
    
    private String zbpath;//�б��ļ�·��
    
    private String zbname;//�б�����
    
    private String zbintro;//�б���
    
    private Date updata;//�ϴ�ʱ��
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getZbpath() {
		return zbpath;
	}
	public void setZbpath(String zbpath) {
		this.zbpath = zbpath;
	}
	public String getZbname() {
		return zbname;
	}
	public void setZbname(String zbname) {
		this.zbname = zbname;
	}
	public String getZbintro() {
		return zbintro;
	}
	public void setZbintro(String zbintro) {
		this.zbintro = zbintro;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getUpdata() {
		return updata;
	}
	public void setUpdata(Date updata) {
		this.updata = updata;
	}
	public String getZbCode() {
		return zbCode;
	}
	public void setZbCode(String zbCode) {
		this.zbCode = zbCode;
	}

}
