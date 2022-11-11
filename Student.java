package com.te.javabasics.collection;

public class Student {
		
	public int studentId;
	public String studentName;
	public int age;
	public int studentMarks;
	
	public Student(int studentId, String studentName, int age, int studentMarks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.studentMarks = studentMarks;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", studentMarks="
				+ studentMarks + "]";
	}



	
	
}
