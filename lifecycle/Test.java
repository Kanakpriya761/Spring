package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/lifecycle/NewFile.xml");
   Patient p = (Patient) ctx.getBean("patient");
   System.out.println(p.getId());
   ctx.registerShutdownHook();
	}

}
