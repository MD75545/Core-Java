package com.test.program;

public class EvenOdd {
	int a;
	public void accept()
	{
		a=10;
	}
	public void display()
	{
		if(a%2==0)
		{
				System.out.println("A is even");
		  }
		else 
		{
			System.out.println("A id odd");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd obj1=new EvenOdd();
		obj1.accept();
		obj1.display();
	
	}

}



