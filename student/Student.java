package org.student;

import org.department.Department;

public class Student extends Department{
		public void studentName() {
			System.out.println("Student Name : Sai");
		}
		public void studentDept() {
			System.out.println("Student Department : Computers");
		}
		public void studentId() {
			System.out.println("Student Id : 5555");
		}

	public static void main(String[] args) {
		Student stu = new Student();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		

	}

}
