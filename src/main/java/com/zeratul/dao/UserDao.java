package com.zeratul.dao;

import com.zeratul.bean.User;

public interface UserDao {
	User getUserByCode(String userCode);
	void saveUser(User u);
}
