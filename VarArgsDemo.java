package Test.Java.Day2;

public class VarArgsDemo {
	public void add(int...var)
	{
		int sum=0;
		for(int i=0;i<var.length;i++)
		{
			sum=sum+var[i];
		}
		System.out.println("Addition="+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsDemo obj=new VarArgsDemo();
		obj.add(100,200);
		obj.add(100,200,300);
		obj.add(10,20,30,40);
	}

}
