package com.maven.learnInjection.withDependentObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("dependentObject.xml");
        
        Employee employee = (Employee) context.getBean("employee");
        employee.show();
    }
}
