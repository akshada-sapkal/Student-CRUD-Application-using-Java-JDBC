package com.student_management_app;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionProvider{
	static Connection con;
	public static Connection createC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","S2923@msql#");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
}