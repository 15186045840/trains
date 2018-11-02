package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.User;
import com.hk.dao.UserDao;

@Service(value="studentService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> selectAllUsers() {
		// TODO Auto-generated method stub
		return userDao.selectAllUsers();
	}

	@Override
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUser(user);
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}

	@Override
	public int deleteUser(int a) {
		// TODO Auto-generated method stub
		return userDao.deleteUser(a);
	}

	@Override
	public User selectUser(User user) {
		// TODO Auto-generated method stub
		return userDao.selectUser(user);
	}

}
