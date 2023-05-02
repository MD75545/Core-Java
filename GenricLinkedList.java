package comparatorinterface;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import com.test.collection.Student;

public class GenricLinkedList {

	public static void main(String[] args) {
		LinkedList<Student>List=new LinkedList<>();
		List.add(new Student(104,"seed",78));
		List.add(new Student(103,"jay",55));
		System.out.println("List elements are");
		for(Student str:List)
		{
			System.out.println(str);
		}
		Collections.sort(List);//
		System.out.println("After sorting list elements acciording to rollno");
		for(Student str:List)
		{
			System.out.println(str);
		}
		Collections.sort(List,new NameComparator());//sortdata according to comparator
		System.out.println("After sorting elements acccording to name");
		for(Student str:List)
		{
			System.out.println(str);
		}

	}
}
