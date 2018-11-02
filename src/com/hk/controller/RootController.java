package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hk.bean.Root;
import com.hk.service.RootService;

@Controller
public class RootController {
	
	@Autowired
	private RootService rootService;
	
	@RequestMapping("123.do")
	@ResponseBody
	public ModelAndView selectmain() {
		ModelAndView mov=new ModelAndView("main");
		return mov;
	}
	@RequestMapping("top.do")
	@ResponseBody
	public ModelAndView selecttop() {
		ModelAndView mov=new ModelAndView("top");
		return mov;
	}
	
	@RequestMapping("left.do")
	@ResponseBody
	public ModelAndView selectleft() {
		ModelAndView mov=new ModelAndView("left");
		return mov;
	}@RequestMapping("columnadd.do")
	@ResponseBody
	public ModelAndView selectcolumnadd() {
		ModelAndView mov=new ModelAndView("columnadd");
		return mov;
	}
	
	
	@RequestMapping("selroot.do")
	@ResponseBody
	public List<Root> queryRoot() {
		return rootService.selectRoot();
	}
	
	@RequestMapping("insertroot.do")
	@ResponseBody
	public int insertRoot(Root root) {
		return rootService.insertRoot(root);
	}
	
	@RequestMapping("updateroot.do")
	@ResponseBody
	public int updateRoot(Root root) {
		return rootService.updateRoot(root);
		
	}
	
	@RequestMapping("deleteroot.do")
	@ResponseBody
	public int deleteRoot() {
		return rootService.deleteRoot(1);
		
	}

}
