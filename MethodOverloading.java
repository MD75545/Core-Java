package day1.testing.java;

public class MethodOverloading {
	void Area(float P,int r)
	{
		System.out.println("Area of circle= "+(r*r*P));
	}
	void Area(int P,int r)
	{
		System.out.println("Area of circle= "+(P*r));
	}
	void Area(double P,double r)
	{
		System.out.println("Area of circle= "+(P*r/2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj=new MethodOverloading();
		obj.Area(3.14f,8);
		obj.Area(55,26);
		obj.Area(52,20);
		
	}

}
