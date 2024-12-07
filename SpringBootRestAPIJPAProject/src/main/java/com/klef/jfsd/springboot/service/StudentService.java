package com.klef.jfsd.springboot.service;

import java.util.List;


import com.klef.jfsd.springboot.model.Student;

public interface StudentService 
{
	public String addstudent(Student s);
	public Student viewstudentbyid(int sid);
	public List<Student> viewallstudents();
}
