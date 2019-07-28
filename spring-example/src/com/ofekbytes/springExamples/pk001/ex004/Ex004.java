package com.ofekbytes.springExamples.pk001.ex004;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ex004 {
	// main //
	public static void main(String[] args) {
		
		//create object
		Coach myCoach = new TrackCoach();
		
		//use the object
		System.out.println( myCoach.getDailyWorkout() );
		
	}
}
