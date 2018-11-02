package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Root;
import com.hk.dao.RootDao;

@Service
public class RootServiceImpl implements RootService {
	
	@Autowired
	private RootDao rootDao;

	@Override
	public List<Root> selectRoot() {
		// TODO Auto-generated method stub
		return rootDao.selectRoot();
	}

	@Override
	public int insertRoot(Root root) {
		// TODO Auto-generated method stub
		return rootDao.insertRoot(root);
	}

	@Override
	public int updateRoot(Root root) {
		// TODO Auto-generated method stub
		return rootDao.updateRoot(root);
	}

	@Override
	public int deleteRoot(int a) {
		// TODO Auto-generated method stub
		return rootDao.deleteRoot(a);
	}

}
