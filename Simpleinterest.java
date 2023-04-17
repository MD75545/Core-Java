package com.test.program;

public class Simpleinterest {
	int p,n;
	float r,s;
	public void accept()
	{
		p=5000000;
		r=9.6f;
		n=20;
	}
	public void display()
	{
		s=p*r*n/100;
		System.out.println("Simple interest is"+s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simpleinterest obj1=new Simpleinterest();
		obj1.accept();
		obj1.display();
	
	}

}
