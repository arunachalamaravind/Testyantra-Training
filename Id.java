package com.te.javabasics.collection;

import java.util.Comparator;

public class Id implements Comparator<Student> {
	
	public int compare( Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (o1.studentId-o2.studentId);
	}
}
