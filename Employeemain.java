package com.test.program;
import com.statictest.program.Employee;
public class Employeemain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee st1 =new Employee();
		st1.display();
		Employee st2 = new Employee("Ronaldo",10000);
		st2.display();
		int eid=Employee.getempid();
		System.out.println("eid"+eid);

}
}