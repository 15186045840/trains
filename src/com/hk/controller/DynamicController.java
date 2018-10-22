package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.Dynamic;
import com.hk.service.DynamicService;

@Controller
public class DynamicController {
	
	@Autowired
	private DynamicService dynamicService;
	
	@RequestMapping("dynamic.do")
	@ResponseBody
	public List<Dynamic> queryDynamic() {
		
		return dynamicService.selectDynamic();
		
	}
	

}
