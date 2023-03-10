package com.spring.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext ("com/spring/set/NewFile.xml");
   CarDealer c = (CarDealer)ctx.getBean("cardealer");
   System.out.println(c.getName());
   System.out.println(c.getModels());
	}

}
