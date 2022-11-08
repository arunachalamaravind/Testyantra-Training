package com.te.javabasics.interfaces;

public interface Car {
	
	void brakes();

	void gear();

	void accelerate();
	
	default void power() {
		System.out.println("very good Location");
	}
	
	default void gps() {
		System.out.println("very good gps");

}
}