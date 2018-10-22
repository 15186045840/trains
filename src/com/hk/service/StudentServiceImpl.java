package com.hk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hk.bean.Student;
import com.hk.dao.StudentDao;

@Service(value="studentService")
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao stuDao;

	@Override
	public List<Student> selectAllStudents() {
		// TODO Auto-generated method stub
		return stuDao.selectAllStudents();
	}

}
