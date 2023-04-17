package com.test.program;

public class Date {
	private int day,month,year; //data members
	Date()
	{
		day=1;
		month=10;
		year=2000;
		
	}
    Date(int d,int m,int y)  //parametrized constructor
    {
    	day=d;
    	month=m;
    	year=y;
    }
    public int getDay() //access method
    {
    	return day;
    }
    public int getmonth()
    {
    	return month;
    }
    public int getyear()
    {
    	return year;
    }
    
    public void setDay(int val)       //mutator method
    {
    	day=val;
    }
    public void setmonth(int m)      
    {
    	month=m;
    }
    public void setyear(int y)      
    {
    	year=y;
    }
    public void display()
    {
    	System.out.println("Date="+day+"/"+month+"/"+year);
    }
    public static void main(String [] args)
    {
    	Date obj1=new Date();
    	obj1.display();
    	
    	Date obj=new Date(12,12,2012);
    			obj.display();
    			
    			int v=obj.getDay();
    			System.out.println("Day="+v);
    			
    			int m=obj.getmonth();
    			System.out.println("month="+m);
    			
    			int y=obj.getyear();
    			System.out.println("year="+y);
    			
    			obj.setDay(26);
    			obj.display();
    			
    			obj.setmonth(10);
    			obj.display();
    			
    			obj.setyear(2000);
    			obj.display();
    }
}
