package com.test.collection;

import java.util.Objects;

public class Student implements Comparable<Student>{
	int roll_no;
	String name;
	double per;
	
	public Student()
	{
		roll_no=20;
		name="Nimish";
		per=90.67;
	}
	
	public Student(int r,String n,double p)
	{
		roll_no=r;
		name=n;
		per=p;
	}
	
	public void display()
	{
		System.out.println("\n Student Details are:");
		System.out.printf("\n Roll no:"+roll_no);
		System.out.printf("\n Name:"+name);
		System.out.printf("\n Percentage:"+per);
	}

	/*public void getRollno()                //Accessor Method
	{
		roll_no=10;
		
	}
	
	public void getName()
	{
		name="Ajinkya";
		
	}
	
	public void getPerc()
	{
		per=87.56;
		
	}*/
	
	public int getRollno()                //Accessor Method
	{
		return roll_no;
		
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public double getPerc()
	{
		return per;
		
	}
	
	public void setRollno(int r)       //Mutator
	{
		roll_no=r;
	}
	
	public void setName(String n)
	{
		name=n;
	}
	
	public void setPerc(int p)
	{
		per=p;
	}
	
	public String toString()
	 {
		return "Rollno="+roll_no+"\n Name="+name+"\n Per="+per;
	 }
	 
	
	@Override
	public boolean equals(Object obj)
	{
		if(this==obj)
			return true;
		
		if(obj==null);
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(per,name);
		
	}
	
	public int compareTo(Student obj)
	{
		if(this.roll_no>obj.roll_no)
			return 1;
		else if(this.roll_no<obj.roll_no)
			return -1;
		else
			return 0;
		
	}

}

