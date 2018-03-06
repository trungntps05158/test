package com.xample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xample.service.StudentService;
import com.xample.service.StudentServiceImpl;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		StudentService service = context.getBean("studentService", StudentService.class);
		System.out.println(service.getAllStudent().size());
	}

}
