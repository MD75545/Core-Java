package com.test.main;

import java.util.Optional;

public class OptionalClassMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="seed";
		String str2=null;
		
		Optional<String>s3=Optional.of("Infotech");
		Optional<String>s1=Optional.ofNullable(str1);
		Optional<String>s2=Optional.ofNullable(str2);
		
		System.out.println(s1.orElse("N/A"));
		System.out.println(s2.orElse("N/A"));
		System.out.println(s3.orElse("N/A"));
		}

}
