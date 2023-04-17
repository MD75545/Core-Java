package com.test.program;

public class Circle {
	int r;
	float a,p;
	public void accept()
	{
		r=7;
		p=3.14f;
	}
	public void display()
	{
		a=p*r*r;
		System.out.println("Area of circlr = "+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Circle obj=new Circle();
         obj.accept();
         obj.display();
	}

}
