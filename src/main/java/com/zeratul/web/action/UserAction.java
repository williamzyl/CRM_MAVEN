package com.zeratul.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.zeratul.bean.User;
import com.zeratul.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {

	private UserService userService;
	private User user = new User();
	/**
	 * 
	 */
	private static final long serialVersionUID = -5433948548758927034L;

	public String login() {

		User resultUser = userService.getUserByCodePassword(user);

		ActionContext.getContext().getSession().put("user", resultUser);

		return SUCCESS;
	}
	
	public String regist(){
		
		try {
			user.setUserState("1");
			userService.savc(user);
		} catch (Exception e) {
			e.printStackTrace();
			ActionContext.getContext().put("error", e.getMessage());
			return "regist";
		}
		return "toLogin";
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public User getModel() {
		return user;
	}

}
