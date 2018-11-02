package com.hk.dao;

import java.util.List;

import com.hk.bean.Root;

public interface RootDao {
	List<Root> selectRoot();
	int insertRoot(Root root);
	int updateRoot(Root root);
	int deleteRoot(int a);
}
