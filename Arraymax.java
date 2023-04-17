package Test.Java.Day2;
import java.util.Scanner;
public class Arraymax {

	public static void main(String[] args) {
		int i;
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter array elements");
		for(i=0;i<arr.length;i++)
			arr[i]=scan.nextInt();
		int max=arr[0];
		{
			if(arr[i]>max)
				max=arr[i];
		
			{
				System.out.println("Max array is "+max);
		}
	}

}
}
