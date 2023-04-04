package day1.testing.java;

public class MethodOverloadingDemo {
	void add(int x,int y,int z)
	{
		System.out.println("Addition"+(x+y+z));
	}
	void add(int x,int y)
	{
		System.out.println("Addition"+(x+y));
	}
	void add(float x,int y,int z)
	{
		System.out.println("Addition"+(x+y+z));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo obj1=new MethodOverloadingDemo  ();
		obj1.add(10,20,30);
		obj1.add(1.2f,55,66);
		obj1.add(22,44);
	}

}
