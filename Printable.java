package com.test.code;

public interface Printable {
	void show(); //abstract method
	void print();//abstract method
	 
	default void display()
	{
		System.out.println("default method called");
	}
}
