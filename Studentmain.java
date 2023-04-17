package com.test.program;

import com.statictest.program.Student;

public class Studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.display();
    Student st1=new Student("Sagar ",88.8f );
    st1.display();
    
    Student st2=new Student("OM ",96.07f );
    st2.display();
    
    Student st3=new Student("Alan ",95.07f );
    st3.display();
     
    int rno=Student.getrollno();
    System.out.println("Rollno="+rno);
    
	}

}
