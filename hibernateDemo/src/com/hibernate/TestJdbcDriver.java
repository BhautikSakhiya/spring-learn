package com.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbcDriver {

	public static void main(String[] args) {
	  
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "root";
		String Password = "root@123";
		
		try {
			System.out.println("Connection establish with:"+url);
			Connection connetion = DriverManager.getConnection(url, user, Password);
			System.out.println("connection success..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
