package com.hk.dao;

import java.util.List;

import com.hk.bean.News;

public interface NewsDao {
	List<News> selectNews();
	int insertNews(News news);
	int updateNews(News news);
	int deleteNews(int a);
	
}
