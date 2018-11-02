package com.hk.service;

import java.util.List;

import com.hk.bean.Resource;

public interface ResourceService {
	List<Resource> selectResource();
	int insertResource(Resource resource);
	int updateResource(Resource resource);
	int deleteResource(int a);
	

}
