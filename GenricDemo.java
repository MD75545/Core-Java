package com.test.main;

import com.test.code.GenricClass;

public class GenricDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenricClass<String> obj1=new GenricClass();
		obj1.getData("seed","101");
		obj1.display();
		
		GenricClass<Integer> obj2=new GenricClass();
		obj2.getData(100,200);
		obj2.display();
		
	}

}
