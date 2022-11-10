package com.te.javabasics.collection;

public class ArrayListdemo2 {
	private Object []objects;
	private int position;
	public ArrayListdemo2(int value) {
		this.objects = new Object[value];
	}

	public void add(Object  element) {
		if(this.position >=  objects.length) {
			growArray();
		}
		this.objects[position++] = element; 
	}
	
	public Object get (int index) {
		return this.objects[index];
	}
	
	public int size () {
		return this.position;
	}
	
	private void growArray() {
		Object [] temp = new  Object[this.objects.length+5];
		System.arraycopy(objects, 0 , temp, 0, this.objects.length);
		objects = temp;
	}		
		
	}

