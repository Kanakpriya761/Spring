package com.componentscan.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext con = new AnnotationConfigApplicationContext(config.class);
student st = (student) con.getBean("Beans");
System.out.println("Id of student "+st.getId());
		
	}

}
