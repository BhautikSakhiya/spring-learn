package com.learnInjection.SetterDependentList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		  ApplicationContext context = new ClassPathXmlApplicationContext("setterDependentCollection.xml");
	        Question que = (Question) context.getBean("question");
	        que.show();
	}

}
