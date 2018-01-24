package com.zeratul.service.impl;

import com.zeratul.bean.User;
import com.zeratul.dao.UserDao;
import com.zeratul.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	@Override
	public User getUserByCodePassword(User u) {
		
		User existU=userDao.getUserByCode(u.getUserCode());
		if(existU==null){
			throw new RuntimeException("用户不存在！");
		}
		
		if(!existU.getUserPassword().equals(u.getUserPassword())){
			throw new RuntimeException("密码错误！");
		}
		return existU;
	}

	@Override
	public void savc(User u) {
		User userByCode = userDao.getUserByCode(u.getUserCode());
		if(userByCode!=null){
			throw new RuntimeException("用户已存在!"); 
		}else{
			userDao.saveUser(u);
		}
	}
	

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	
}
