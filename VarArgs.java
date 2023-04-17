package Test.Java.Day2;

public class VarArgs {
	public void add(float v,int...var)
	{
		int sum=0;
		for(int i=0;i<var.length;i++)
		{
			sum=sum+var[i];
		}
		System.out.println("Addition ="+(sum+v));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgs obj=new VarArgs();
		obj.add(100,200);
		obj.add(100,200,300);
		obj.add(100.05f,200,300);
	}

}
