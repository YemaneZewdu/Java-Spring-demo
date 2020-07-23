package com.mycompany.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		
	// load the spring configuration file
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
			
	// retrieve bean from spring container
	Coach theCoach = context.getBean("myCoach", Coach.class);
	
	System.out.println(theCoach.getDailyWorkout());
	
	context.close();
		

	}

}
