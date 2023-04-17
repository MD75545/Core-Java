package com.test.program;

public class Student1 {
	private int roll_no;
	float percentage;
    
	Student1()
	{
		roll_no=57;
		percentage=89.6f;
	}
	Student1(int i,float p)
	{
		roll_no=i;
		percentage=p;
	}
	public void setroll_no(int val)
	{
	roll_no=val;
	}
	public void setpercentage(float p)
	{
	percentage=p;
	}
	public void display()
	{
		System.out.println("Student roll no is "+roll_no+"percentage is "+percentage);
		
	}
	public static void main(String[] args)
	{
		Student Obj=new Student();
		Obj.display();
		
		Student Obj2=new Student();
		Obj.display();
		
			Obj.setroll_no(86);
			Obj.display();
			
			Obj.setpercentage(94.3f);
			Obj.display();
			
		
	}
	
}
