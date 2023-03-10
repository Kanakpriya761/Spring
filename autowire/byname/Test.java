package com.spring.autowire.byname;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/autowire/byname/NewFile.xml");
   Employee e = (Employee) ctx.getBean("emp");
   System.out.println(e.getId());
   System.out.println(e.getName());
   System.out.println(e.getAddress());
	}

}
