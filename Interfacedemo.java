package com.test.main;

import com.test.code.Date;
import com.test.code.Myinterface;
import com.test.code.Student;

public class Interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt=new Date();
		dt.show();
		dt.print();
		
		Myinterface dt2= new Student();
		dt2.show();
		dt2.print();
	}

}
