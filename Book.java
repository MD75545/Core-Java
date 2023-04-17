package com.test.program;

public class Book {
	private int id,price;
    String name;
	
	Book()
	{
		id=95;
		name="Ronaldo the genious";
		price=1000;
	}
    Book(int i,String n,int p)
    {
    	id=i;
    	name=n;
    	price=p;
    }
    public void display()
    {
    	System.out.println("Book id is "+id+" book name is "+name+" and price is "+price);
    }
    public static void main(String[] args)
    {
    	Book obj1=new Book();
    	obj1.display();
    	
    	Book obj2=new Book(91,"Lionel Andreas Messi",1250);
    			obj2.display();
    }
    
}
