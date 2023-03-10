package com.spring.list;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/list/NewFile.xml");
   Hospital h = (Hospital) ctx.getBean("hospital");
   System.out.println(h.getName());
   System.out.println(h.getDepartment());
	}

}
