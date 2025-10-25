# Student-CRUD-Application-using-Java-JDBC
A Java console-based Student Management App performing CRUD operations using JDBC and MySQL.
---

## **Features**
- Add new students
- Delete existing students
- Display all students
- Exit the application

---

## **Menu**
- Welcome to Student Management App
- Press 1 for Add Student
- Press 2 for Delete Students
- Press 3 for Display Student
- Press 4 to Exit app

---

## **Database Setup**

**Create MySQL Database**

CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    course VARCHAR(50)
);

