package com.tianchen.ztb.bean;

import java.util.Date;

import javax.xml.crypto.Data;

public class TBbook {
    private int id;
        
    private User user;//Ͷ����
    
    private ZBbook zbbook;//Ͷ����
    
    private String tbName;//Ͷ��������
    
    private String tbpath;//Ͷ���ļ�·��
    
    private Date createDate;//�ϴ�ʱ��

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ZBbook getZbbook() {
		return zbbook;
	}

	public void setZbbook(ZBbook zbbook) {
		this.zbbook = zbbook;
	}

	public String getTbName() {
		return tbName;
	}

	public void setTbName(String tbName) {
		this.tbName = tbName;
	}

	public String getTbpath() {
		return tbpath;
	}

	public void setTbpath(String tbpath) {
		this.tbpath = tbpath;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}




    

}
