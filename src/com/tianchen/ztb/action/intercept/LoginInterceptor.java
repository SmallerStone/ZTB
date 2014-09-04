package com.tianchen.ztb.action.intercept;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.tianchen.ztb.action.LoginAction;

public class LoginInterceptor extends AbstractInterceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		if(invocation.getAction().getClass() == LoginAction.class) {
			return invocation.invoke();
		}
		
		if(invocation.getInvocationContext().getSession().get("login") == null) {
			return "login_error";
		}
		return invocation.invoke();
	}

}
