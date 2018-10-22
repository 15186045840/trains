package com.hk.dao;

import java.util.List;

import com.hk.bean.Course;

public interface CourseDao {
	
	List<Course> selectCourse();
	
}
