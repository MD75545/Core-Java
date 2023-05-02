package com.test.collection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
	HashSet<Student> hs=new HashSet<>();
	hs.add(new Student(104,"seed",78));
	hs.add(new Student(102,"om",65));
	hs.add(new Student(103,"rahul",55));
	hs.add(new Student(101,"seed",78));
	hs.add(new Student(104,"sai",40));
	hs.add(new Student(104,"seed",88));
	System.out.println("Data of hashtable");
	
	Iterator<Student> itr=hs.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	}

}
