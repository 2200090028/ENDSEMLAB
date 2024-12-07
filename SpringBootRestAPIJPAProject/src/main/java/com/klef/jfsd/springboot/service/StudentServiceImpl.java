package com.klef.jfsd.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentRepository repository;

	@Override
	public String addstudent(Student s) {
		repository.save(s);
		return "Student added Successfully";
	}
	public Student viewstudentbyid(int sid)
	{
		return repository.findById(sid).get();
	}

	@Override
	public List<Student> viewallstudents() {
		// TODO Auto-generated method stub
		 return (List<Student>) repository.findAll();
	}

}
