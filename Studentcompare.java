package com.te.javabasics.collection;

import java.util.Comparator;

public class Studentcompare implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return o1.studentId-o2.studentId;
	}

}
