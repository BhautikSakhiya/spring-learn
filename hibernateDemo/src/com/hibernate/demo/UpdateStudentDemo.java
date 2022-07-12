package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class UpdateStudentDemo {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		int studentId = 2;
		session.beginTransaction();
		
		Student student = session.get(Student.class, studentId);
		System.out.println("updating student..");
		student.setFirstName("sona");
		student.setLastName("cora");
		student.setEmail("sora@gmail.com");
		
//		System.out.println("\n\n update student email..");
//		session.createQuery("update Student set email='demo@outlook.com'").executeUpdate();
		
		
		session.getTransaction().commit();
		session.close();
//		factory.close();
	}

}
