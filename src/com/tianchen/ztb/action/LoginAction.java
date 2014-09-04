package com.tianchen.ztb.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tianchen.ztb.bean.User;
import com.tianchen.ztb.manager.UserManager;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private UserManager userManager;
	
	private String username;
	private String password;
	
	@Override
	public String execute() throws Exception {
//		// TODO Auto-generated method stub
		System.out.println("123123123");
		User user = userManager.login(username, password);
		//System.out.println(user.getRole());
		ActionContext.getContext().getSession().put("login", user);
		if(user != null){
			if(user.getRole() == 1){
				return "zhaobiao";
			}else if(user.getRole() == 2){
				return "toubiao";
			}else if(user.getRole() == 3){
				return "zhuanjia";
			}
		}
		return "login";
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
