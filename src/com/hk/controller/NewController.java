package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.New;
import com.hk.service.NewService;


@Controller
public class NewController {
	
	@Autowired
	private NewService newService;
	
	@RequestMapping("new.do")
	@ResponseBody
	public List<New> queryStudent() {
		// TODO Auto-generated method stub
		List<New> news=newService.selectNews();
		System.out.println(news);
		return news;

	}
	
	 
}
