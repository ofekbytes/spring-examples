package com.ofekbytes.springExamples.pk001.ex004;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext ("applicationContext.xml");
		
		// retrieve bean from spring container 
		Coach myCoach = context.getBean("myCoach", Coach.class); //(bean-id, interface)
		
		// call method on the bean
		System.out.println(myCoach.getDailyWorkout());
		
		// close the context (clean up)
		context.close();

	}

}
