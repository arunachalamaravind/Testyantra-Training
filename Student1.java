package com.te.javabasics.collection;

import java.util.Objects;

public class Student1 {
		
	public int studentId;
	public String studentName;
	public int studentAge;
	public int studentMarks;
	
	public Student1(int studentId, String studentName, int studentAge, int studentMarks) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
	}


	@Override
	public String toString() {
		return "Student1 [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentMarks=" + studentMarks + "]";
	}


	@Override
	public int hashCode() {
//		if(studentId==this.studentId) {
//			System.out.println("enter value is wron");
//		}
	//	return Objects.hash(this.studentId);
//		return Objects.hash(this.studentId , this.age);
		return studentId;
	}

	@Override
	public boolean equals(Object obj) {
		
		Student1 other = (Student1) obj;
		if (studentId != other.studentId) {
			return false;
		}
		if (studentId == other.studentId) {
			try {
		throw new DuplicateException("Enter value is duplicate");
			}catch(DuplicateException e) {
				System.out.println(e.getMessage());
			}
				
			}
	
		
		return true;
	}

	

	
	
}
