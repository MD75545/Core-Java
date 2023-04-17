package Test.Java.Day2;

import java.util.Scanner;

public class Arraysquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The array elements");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println("\n Enter values");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display array elements are");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print("\t"+(arr[i][j]));
				int sum;
				sum=arr[i][j]*arr[i][j];
			
			System.out.print("\t"+sum);
}
			System.out.println();
}
}

	}


