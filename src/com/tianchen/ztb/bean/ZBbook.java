package com.tianchen.ztb.bean;

import javax.xml.crypto.Data;

public class ZBbook {
    private int id;
    private int zbuserid;//�б���id
    private String zbpath;//�б���·��
    private String zbname;//�б�������
    private String zbintro;//�б�����
    private Data updata;//�ϴ�ʱ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getZbuserid() {
		return zbuserid;
	}
	public void setZbuserid(int zbuserid) {
		this.zbuserid = zbuserid;
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
	public Data getUpdata() {
		return updata;
	}
	public void setUpdata(Data updata) {
		this.updata = updata;
	}
    
    
    
}
