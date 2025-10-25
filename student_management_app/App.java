package com.student_management_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Student Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Press 1 for Add Student");
			System.out.println("Press 2 for Delete Students ");
			System.out.println("Press 3 for Display Student");
			System.out.println("Press 4 to Exit app");
			int c=Integer.parseInt(br.readLine());
			if(c==1) {
				//Add Student
				System.out.println("Enter user name:");
				String name=br.readLine();
				System.out.println("Enter user Phone:");
				String phone=br.readLine();
				System.out.println("Enter user city");
				String city=br.readLine();
				Student st=new Student(name,phone,city);
				boolean ans=StudentDao.insertStudentToDB(st);
				if(ans) {
					System.out.println("Successfully Added");
				}else {
					System.out.println("Something went Wrong");
				}
				System.out.println(st);
			}else if(c==2) {
				//Delete Student
				System.out.println("Enter student id to delete");
				int userId=Integer.parseInt(br.readLine());
				boolean f=StudentDao.deleteStudent(userId);
				if(f) {
					System.out.println("Record Deleted Successfully");
				}else {
					System.out.println("Something went Wrong record not deleted");
				}
				
			}else if(c==3) {
				//Display Student
				StudentDao.showAllStudent();
				
			}else if(c==4) {
				//exit
				break;
			}else {
				
			}
			System.out.println("Thank You for using the App!");
		}
		
	}

}
