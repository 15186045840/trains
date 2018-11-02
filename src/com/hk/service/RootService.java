package com.hk.service;

import java.util.List;

import com.hk.bean.Root;

public interface RootService {
	List<Root> selectRoot();
	int insertRoot(Root root);
	int updateRoot(Root root);
	int deleteRoot(int a);

}
