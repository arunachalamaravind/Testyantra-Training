package com.te.javabasics.collection;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
	
//	public int compareTo(Employee o) {
//		// TODO Auto-generated method stub
//		return this.namecompareTo(o.id);
//	}

	
	arrayList.add(new Student(1, "Surya ", 45, 25));
	arrayList.add(new Student(3, "praveen", 65, 35));
	arrayList.add(new Student(2, "siva ", 35, 55));
	arrayList.add(new Student(5, "Anand", 55, 45));
	 arrayList.add(new Student(4, "raju ", 15, 75));
	arrayList.add(new Student(6, "padapanathan", 25, 85));
	

}
