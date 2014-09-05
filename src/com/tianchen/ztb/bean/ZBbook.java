package com.tianchen.ztb.bean;

import java.util.Date;

public class ZBbook {
    private int id;
        
    private User user;
    
    private String zbCode;//招标书编码
    
    private String zbpath;//招标文件路径
    
    private String zbname;//招标名称
    
    private String zbintro;//招标简介
    
    private Date updata;//上传时间
    
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
