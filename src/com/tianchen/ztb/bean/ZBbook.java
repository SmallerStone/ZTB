package com.tianchen.ztb.bean;

import javax.xml.crypto.Data;

public class ZBbook {
    private int id;
    private int zbuserid;//招标人id
    private String zbpath;//招标书路径
    private String zbname;//招标书名称
    private String zbintro;//招标书简介
    private Data updata;//上传时间
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
