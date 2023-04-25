package com.test.main;

import java.util.Optional;
import java.util.Scanner;


public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[5];
		System.out.println("Enter strings");
		Scanner scan =new Scanner(System.in);
		for( int i=0;i<5;i++)
		{
		str[i]=scan.next();
		}
		
		Optional<String> String=Optional.ofNullable(str[4]);
		
	if(String.isPresent())
		{
			String word=str[2].toLowerCase();
			System.out.println("String="+word);
		}
		else
	{
		System.out.println("String is not available");					}
	}

}
