package com.hk.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hk.bean.User;
import com.hk.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("selusers.do")
	@ResponseBody
	public List<User> queryUsers() {
		// TODO Auto-generated method stub
		List<User> users=userService.selectAllUsers();
		System.out.println("查看用户");
		System.out.println(users);
		return users;

	}
	
	@RequestMapping("page/seluser.do")
	@ResponseBody
	public ModelAndView queryUser(User user) {
		ModelAndView mv = new ModelAndView("index");
		User us=userService.selectUser(user);
		System.out.println(us);
		if (us==null) {
			System.out.println(mv);
			return mv;
		}else {
			System.out.println(mv);
			return mv;
		}

	}
	
	
	@RequestMapping("page/insertuser.do")
	@ResponseBody
	public ModelAndView insertUser(User user) {
		ModelAndView mv = new ModelAndView("index");
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String da=df.format(day);
		System.out.println(user);
		user.setUdate(da);
		System.out.println(user);
		userService.insertUser(user);
		return mv;
	}
	
	@RequestMapping("updateuser.do")
	@ResponseBody
	public int updateUser() {
		Date day=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
		String da=df.format(day);
		System.out.println(day);
		User us = new User();
		
		us.setUname("程磊御风");
		us.setUsex("男");
		us.setUage(22);
		us.setUpassword("123456789");
		us.setUdate(da);
		
		System.out.println(df.format(day)); 
		return userService.updateUser(us);
	}
	
	@RequestMapping("deleteuser.do")
	@ResponseBody
	public int deleteUser() {
		return userService.deleteUser(2);
	}
}
