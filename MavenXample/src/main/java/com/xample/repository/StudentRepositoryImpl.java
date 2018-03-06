package com.xample.repository;

import java.util.ArrayList;
import java.util.List;

import com.xample.model.Student;

public class StudentRepositoryImpl implements StudentRepository {
	public List<Student> getAllStudent() {
		List<Student> studentList = new ArrayList();
		studentList.add(new Student("Ducky", "Ha Noi"));
		return studentList;
	}
}
