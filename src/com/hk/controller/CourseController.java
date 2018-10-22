package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.Course;
import com.hk.service.CourseService;

@Controller
public class CourseController {
	
	@Autowired
	private CourseService CourseService;
	
	@RequestMapping("course.do")
	@ResponseBody
	public List<Course> queryCourse() {
		
		return CourseService.selectCourses();
	}

}
