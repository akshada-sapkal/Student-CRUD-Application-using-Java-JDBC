package com.student_management_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDB(Student st) {
		boolean f=false;
		try {
		Connection con=ConnectionProvider.createC();
		String q="insert into Student(sname,sphone,scity) values(?,?,?)";
		//PreparedStatement
		PreparedStatement pstmt=con.prepareStatement(q);
		//set the value of parameters
		pstmt.setString(1, st.getSname());
		pstmt.setString(2, st.getSphone());
		pstmt.setString(3, st.getScity());
		//execute
		pstmt.executeUpdate();
		f=true;
	}catch(Exception e) {
		e.printStackTrace();
	}
		return f;
	}

	public static boolean deleteStudent(int userId) {
		boolean f=false;
		try {
		Connection con=ConnectionProvider.createC();
		String q="delete from Student where sid=?";
		//PreparedStatement
		PreparedStatement pstmt=con.prepareStatement(q);
		//set the value of parameters
		pstmt.setInt(1, userId);
		
		//execute
		pstmt.executeUpdate();
		f=true;
	}catch(Exception e) {
		e.printStackTrace();
	}
		return f;
		
	}

	public static void showAllStudent() {
		boolean f=false;
		try {
		Connection con=ConnectionProvider.createC();
		String q="select * from Student";
		Statement stmt=con.createStatement();
		ResultSet set=stmt.executeQuery(q);
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String phone=set.getString(3);
			String city=set.getString(4);
			System.out.println("ID:"+id);
			System.out.println("Name:"+name);
			System.out.println("Phone:"+phone);
			System.out.println("city:"+city);
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
	}
}
