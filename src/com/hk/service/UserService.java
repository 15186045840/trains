package com.hk.service;

import java.util.List;

import com.hk.bean.User;

public interface UserService {
	List<User> selectAllUsers();
	User selectUser(User user);
	int insertUser(User user);
	int updateUser(User user);
	int deleteUser(int a);

}
