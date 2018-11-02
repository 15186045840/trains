package com.hk.dao;

import java.util.List;

import com.hk.bean.User;

public interface UserDao {
	List<User> selectAllUsers();
	User selectUser(User user);
	int insertUser(User user);
	int updateUser(User user);
	int deleteUser(int a);
}
