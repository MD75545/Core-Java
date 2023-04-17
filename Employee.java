package com.statictest.program;

public class Employee {
	private static int empid;
	private String ename;
	private static String company;
	private int salary;

 	static
 	{
 		empid=100;
 		company="Seed";
 	}
 	public Employee()
 	{
 		ename="crisR7";
 	}
 	public  Employee (String ename,int s)
 	{
 		empid=++empid;
 		this.ename=ename;
 		salary=s;
 	}
 	static public int getempid()
 	{
 		return empid;
 	}
 	public void display()
 	{
 		System.out.println(empid+"ename"+ename+""+company+""+salary);
 		}
 	}