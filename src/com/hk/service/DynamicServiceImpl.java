package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Dynamic;
import com.hk.dao.DynamicDao;


@Service
public class DynamicServiceImpl implements DynamicService {

	@Autowired
	private DynamicDao dynamicDao;
	
	@Override
	public List<Dynamic> selectDynamic() {
		// TODO Auto-generated method stub
		return dynamicDao.selectDynamic();
	}

}
