package com.hk.dao;

import java.util.List;

import com.hk.bean.Resource;

public interface ResourceDao {
	List<Resource> selectResource();
	int insertResource(Resource resource);
	int updateResource(Resource resource);
	int deleteResource(int a);
	
}
