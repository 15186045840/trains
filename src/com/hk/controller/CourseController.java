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
	private CourseService courseService;
	
	@RequestMapping("selcourse.do")
	@ResponseBody
	public List<Course> queryCourse() {
		System.out.println("课程显示");
		
		return courseService.selectCourses();
	}
	
	@RequestMapping("insertcourse.do")
	@ResponseBody
	public int insertCourse(Course course) {
		Course cs = new Course();
		cs.setCID(1);
		cs.setCname("java");
		cs.setCtype("野外");
		
		return courseService.insertCourse(cs);
	}
	
	@RequestMapping("updatecourse.do")
	@ResponseBody
	public int updateCourse(Course course) {
		Course cs = new Course();
		cs.setCID(1);
		cs.setCname("C++");
		cs.setCtype("野外");
		
		return courseService.updateCourse(cs);
	}
	
	@RequestMapping("deletecourse.do")
	@ResponseBody
	public int deleteCourse() {
		return courseService.deleteCourse(1);
	}

}
