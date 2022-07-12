package com.hibernate.demo;

import java.text.ParseException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class CreateStudent {

	public static void main(String[] args) {

		//create session factory		
		//-->The SessionFactory is a factory of session and client of ConnectionProvider. It holds second level cache (optional) of data.
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session
		//-->The session object provides an interface between the application and data stored in the database. 
		//It is a short-lived object and wraps the JDBC connection. It is factory of Transaction, Query and Criteria. 
		//It holds a first-level cache (mandatory) of data. The org.hibernate.Session interface provides methods to insert, update and 
		//delete the object. It also provides factory methods for Transaction, Query and Criteria.
		Session session = factory.getCurrentSession();
           
		try {
//			
//			String dateOfBirthStr = "21/8/2003";
//	        Date theDateOfBirth = DateUtils.parseDate(dateOfBirthStr);
			// create student object
			Student tempStudent = new Student("Rysen", "Rajjo", "rysen@gmail.com", new Date());			
			// start transaction
			session.beginTransaction();
			
			// save student object
			System.out.println("saving..");
			session.save(tempStudent);
			
			//commit transaction
			session.getTransaction().commit();
			System.out.println("success");
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}finally {
			session.close();
		}
	}

}
