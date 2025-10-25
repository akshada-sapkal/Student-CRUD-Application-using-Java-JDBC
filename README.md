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

## **Setup Instructions**

1. **Clone the repository**
```bash
git clone <your-repo-url>
cd student-management-app

---

2. **Create MySQL Database**

CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    course VARCHAR(50)
);

---

3. **Update DB credentials in ConnectionProvider.java:**

String url = "jdbc:mysql://localhost:3306/studentdb";
String username = "root";
String password = "your_password";

---

4. **Compile & Run**

javac App.java
java App
