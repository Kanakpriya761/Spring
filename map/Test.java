package com.spring.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/map/NewFile.xml");
		Customer c = (Customer) ctx.getBean("customer");
		System.out.println(c.getId());
		System.out.println(c.getProducts());
	}

}
