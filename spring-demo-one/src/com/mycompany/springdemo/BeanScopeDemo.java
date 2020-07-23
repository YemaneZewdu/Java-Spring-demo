package com.mycompany.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

	public static void main(String[] args) {
		
	// load the spring configuration file
	ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
			
	// retrieve bean from spring container
	Coach theCoach = context.getBean("myCoach", Coach.class);
	
	Coach alphaCoach = context.getBean("myCoach", Coach.class);

	// check if the two beans are the same
	boolean result = (theCoach == alphaCoach);
	
	System.out.println("\nPointing to the same object: " + result);
	
	System.out.println("\nMemory location for the theCoach: " + theCoach);
	
	System.out.println("\nMemory location for the alphaCoach: " + alphaCoach);
	
	context.close();
		

	}

}
