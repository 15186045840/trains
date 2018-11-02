package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.News;
import com.hk.dao.NewsDao;

@Service(value="newService")
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsDao newsDao;

	@Override
	public List<News> selectNews() {
		// TODO Auto-generated method stub
		return newsDao.selectNews();
	}

	@Override
	public int insertNews(News news) {
		// TODO Auto-generated method stub
		return newsDao.insertNews(news);
	}

	@Override
	public int updateNews(News news) {
		// TODO Auto-generated method stub
		return newsDao.updateNews(news);
	}

	@Override
	public int deleteNews(int a) {
		// TODO Auto-generated method stub
		return newsDao.deleteNews(a);
	}

}
