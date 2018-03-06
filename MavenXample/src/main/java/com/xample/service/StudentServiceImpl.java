package com.xample.service;

import java.util.List;

import com.xample.model.Student;
import com.xample.repository.StudentRepository;
import com.xample.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository = new StudentRepositoryImpl() ;

	
	public StudentServiceImpl() {
		super();
		System.out.println("Defaul Constructor Injection");
	}


	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		System.out.println("Constructor Injection");
		this.studentRepository = studentRepository;
	}


	public StudentRepository getStudentRepository() {
		return studentRepository;
	}


	public void setStudentRepository(StudentRepository studentRepository) {
		System.out.println("Setter Injection");
		this.studentRepository = studentRepository;
	}


	public List<Student> getAllStudent() {
		
		return studentRepository.getAllStudent();
	}
}
