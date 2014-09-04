package com.tianchen.ztb.action;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.tianchen.ztb.bean.User;
import com.tianchen.ztb.manager.UserManager;

public class UserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	private String password;
	
	private String personName;
	
	private UserManager userManager;
	
	@Override
	public String execute() throws Exception {
		return "add_input";
	}
	
	public String add() throws Exception{
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		user.setCreate_time(new Date());
		userManager.addUser(user);
		return "add_success";
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	
}
