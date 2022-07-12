package com.meaven.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
    	//Define Dependency using xml file
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
//    	Vehicle obj = (Vehicle) context.getBean("vehicle");
//    	obj.drive();
    	
    	
    	//Define dependency using annotations
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");  
    	Vehicle obj = (Vehicle) context.getBean("bike");
    	obj.drive();
    	
    	
    	Tyre tyre = (Tyre) context.getBean("tyre");
    	System.out.println(tyre);
    }
}
