package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student name is Divya");
	}
	public void studentDept() {
		System.out.println("Student belongs to IT department");
	}
	public void studentId() {
		System.out.println("5006");
	}
	public static void main(String[] args) {
		Student stu1=new Student();
		stu1.collegeCode();
		stu1.collegeName();
		stu1.collegeRank();
		stu1.deptName();
		stu1.studentName();
		stu1.studentDept();
		stu1.studentId();
		
	}
}
