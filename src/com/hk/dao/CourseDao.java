package com.hk.dao;

import java.util.List;

import com.hk.bean.Course;

public interface CourseDao {
	
	List<Course> selectCourse();
	int insertCourse(Course course);
	int updateCourse(Course course);
	int deleteCourse(int a);
}
