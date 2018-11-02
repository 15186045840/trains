package com.hk.service;

import java.util.List;

import com.hk.bean.News;

public interface NewsService {
	List<News> selectNews();
	int insertNews(News news);
	int updateNews(News news);
	int deleteNews(int a);
}
