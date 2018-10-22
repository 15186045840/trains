package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Course;
import com.hk.dao.CourseDao;

@Service("courseService")
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseDao courseDao;
	
	@Override
	public List<Course> selectCourses() {
		// TODO Auto-generated method stub
		return courseDao.selectCourse();
	}

}
