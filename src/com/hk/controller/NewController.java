package com.hk.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.News;
import com.hk.service.NewsService;


@Controller
public class NewController {
	
	@Autowired
	private NewsService newsService;
	
	@RequestMapping("selnews.do")
	@ResponseBody
	public List<News> queryNews() {
		// TODO Auto-generated method stub
		return newsService.selectNews();

	}
	@RequestMapping("insertnews.do")
	@ResponseBody
	public int insertNews(News news) {
		// TODO Auto-generated method stub
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String da=df.format(day);
		System.out.println(day);
		News ns = new News();
		ns.setNID(1);
		ns.setNtype("����");
		ns.setNtitle("�û�����");
		ns.setNcontent("�����ѵ���Ǻü���");
		ns.setNdate(da);
		return newsService.insertNews(ns);

	}
	@RequestMapping("updatenews.do")
	@ResponseBody
	public int updateNews(News news) {
		// TODO Auto-generated method stub
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String da=df.format(day);
		System.out.println(day);
		News ns = new News();
		ns.setNID(1);
		ns.setNtype("����");
		ns.setNtitle("�û�����");
		ns.setNcontent("�����ѵ���Ǻü���");
		ns.setNdate(da);
		return newsService.updateNews(ns);

	}
	@RequestMapping("deletenews.do")
	@ResponseBody
	public int deleteNews() {
		// TODO Auto-generated method stub
		return newsService.deleteNews(1);

	}
	
	 
}
