package com.springdemo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);		//default beanId --> same as class name only first letter is lowerCase.....                        

//		Coach theCoach = context.getBean("thatSillyCoach",Coach.class);		///explicit beanId
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
	}

}
