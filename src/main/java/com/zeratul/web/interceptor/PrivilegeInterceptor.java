package com.zeratul.web.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import com.zeratul.bean.User;

public class PrivilegeInterceptor extends MethodFilterInterceptor {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4819796430615891537L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = ActionContext.getContext().getSession();
		
		User user=(User) session.get("user");
		if(user==null){
			// session 没有user  拦截，返回登录页
			return "toLogin";
		}else{
			// 已登录 放行
			return invocation.invoke();
		}
		
		
	}

}
