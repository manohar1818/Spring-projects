package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext path =
				new ClassPathXmlApplicationContext("1.xml");
		
		//Coach theCoach = path.getBean("thatSillyCoach",Coach.class);
		
		Coach theCoach = path.getBean("tennisCoach",Coach.class);

		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		path.close();
		

}
	
}