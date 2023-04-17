package com.statictest.program;

public class Student {
	private static int rollno; // static variable
	private String name;
	private float per;
	private static String college; //static variable
	 
	static //static block
	{
		rollno=100;
		college="Eight";
	}
	public Student()
	{
		name="unknown";
	}
	public Student (String name,float p)
	{
		rollno=++rollno;
		this.name=name;
		per=p;
	}
	
	static public int getrollno() //static method
	{
		return rollno;
	}
	public void display() {
		System.out.println(rollno+""+name+""+per+""+college);
	}

}


