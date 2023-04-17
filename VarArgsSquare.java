package Test.Java.Day2;

public class VarArgsSquare {
	public void add(int...var)
	{
		int sum=0;
		for(int i=0;i<var.length;i++)
		{
			sum=sum+var[i];
			
		}
		System.out.println("Sum of square of argument"+(sum*sum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarArgsSquare obj=new VarArgsSquare();
		obj.add(12,22);
	}

}
