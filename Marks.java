package com.te.javabasics.collection;

import java.util.Comparator;

public class Marks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentMarks - o2.studentMarks;
	}

}
