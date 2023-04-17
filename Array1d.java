package Test.Java.Day2;
import java.util.Scanner;
public class Array1d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("\n enter values");
			arr[i]=sc.nextInt();
		}
		System.out.println("Display array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
	}

}
