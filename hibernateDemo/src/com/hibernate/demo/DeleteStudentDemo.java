package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		Integer id = 3;
		session.beginTransaction();
		
		Student student = session.get(Student.class, id);
		
		System.out.println("\n deleting student id = 3 "+ student);
		session.delete(student);
		
		System.out.println("\n deleting student id = 4 ");
		session.createQuery("delete from Student where id = 4").executeUpdate();
		
		session.getTransaction().commit();
		session.close();
	}

}
