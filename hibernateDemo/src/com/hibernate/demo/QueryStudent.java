package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class QueryStudent {

	public static void main(String[] args) {

		//create session factory
		 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		//create session
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			List<Student> student = session.createQuery("from Student").getResultList(); 
			System.out.println("All Students ");
			displayStudent(student);

			student = session.createQuery("from Student s where s.lastName='ball'").getResultList();
			System.out.println("\n\nStudents have a last name is ball");
			displayStudent(student);

			student = session.createQuery("from Student s where s.email like '%@gmail.com'").getResultList();
			System.out.println("\n\nemail emd with gmail.com");
			displayStudent(student);
			
			session.getTransaction().commit(); 
			 
		}finally {
			session.close();
		}
	}

	private static void displayStudent(List<Student> student) {
		for(Student thestudent : student)
			System.out.println(thestudent);
	}

}
