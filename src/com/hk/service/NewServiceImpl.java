package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.New;
import com.hk.dao.NewDao;

@Service(value="newService")
public class NewServiceImpl implements NewService {
	
	@Autowired
	private NewDao newDao;

	@Override
	public List<New> selectNews() {
		// TODO Auto-generated method stub
		return newDao.selectNews();
	}

}
