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

	@Override
	public int insertCourse(Course course) {
		// TODO Auto-generated method stub
		return courseDao.insertCourse(course);
	}

	@Override
	public int updateCourse(Course course) {
		// TODO Auto-generated method stub
		return courseDao.updateCourse(course);
	}

	@Override
	public int deleteCourse(int a) {
		// TODO Auto-generated method stub
		return courseDao.deleteCourse(a);
	}

}
