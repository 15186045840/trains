package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Resource;
import com.hk.dao.ResourceDao;

@Service
public class ResourceServiceImpl implements ResourceService {
	
	@Autowired
	private ResourceDao resourceDao;

	@Override
	public List<Resource> selectResource() {
		// TODO Auto-generated method stub
		return resourceDao.selectResource();
	}

	@Override
	public int insertResource(Resource resource) {
		// TODO Auto-generated method stub
		return resourceDao.insertResource(resource);
	}

	@Override
	public int updateResource(Resource resource) {
		// TODO Auto-generated method stub
		return resourceDao.updateResource(resource);
	}

	@Override
	public int deleteResource(int a) {
		// TODO Auto-generated method stub
		return resourceDao.deleteResource(a);
	}
	

}
