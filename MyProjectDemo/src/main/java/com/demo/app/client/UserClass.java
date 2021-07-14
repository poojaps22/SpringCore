package com.demo.app.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.app.model.Employee;

public class UserClass {

	public static void main(String[] args) {
		
		ApplicationContext spring = new ClassPathXmlApplicationContext("spring-conf.xml");
		
		Employee emp = (Employee)spring.getBean("newEmp");
		System.out.println(emp);
		
		Employee emp1 = (Employee)spring.getBean("newEmp1");
		System.out.println(emp1);
		
	}
	
}
