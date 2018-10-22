package com.hk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hk.bean.Student;
import com.hk.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("student.do")
	@ResponseBody
	public List<Student> queryStudent() {
		// TODO Auto-generated method stub
		List<Student> students=studentService.selectAllStudents();
		System.out.println(students);
		return students;

	}
	
	 
}
