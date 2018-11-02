package com.hk.service;

import java.util.List;

import com.hk.bean.Course;

public interface CourseService {
	List<Course> selectCourses();
	int insertCourse(Course course);
	int updateCourse(Course course);
	int deleteCourse(int a);
}
