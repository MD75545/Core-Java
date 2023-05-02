package com.test.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key and value");
		map.put(sc.nextInt(),sc.next());
		map.put(100,"seed");
		map.put(200,"yash");
		map.put(300,"jash");
		map.put(400,"om");
		System.out.println("Data inside map: ");
		System.out.println(map);
		System.out.println("Display data using iterator");
		
		Iterator<Integer> itr =map.keySet().iterator();
		while(itr.hasNext())
		{
			Integer key=itr.next();
			System.out.println(key+""+map.get(key));
			
		}
		
	}

}
