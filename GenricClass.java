package com.test.code;

public class GenricClass <T>{
	T num1,num2;
	public void getData(T n1,T n2)
	{
		num1=n1;
		num2=n2;
	}
	public void display() {
		System.out.println("num1="+num1+"\n num2="+num2);
	}
	

}
