package com.spring.java;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/java/Newfile.xml");
		Student s = (Student) ctx.getBean("std");
		s.display();
	}

}
