package com.dependency.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/dependency/spring/NewFile.xml");
   Student s = (Student) ctx.getBean("std");
   System.out.println(s);
	}

}
