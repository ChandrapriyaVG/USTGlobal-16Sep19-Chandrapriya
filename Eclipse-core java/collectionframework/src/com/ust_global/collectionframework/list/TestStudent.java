package com.ust_global.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class TestStudent {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student("salman",10,89.99);
		Student s2 = new Student("Shah rukh", 20, 98.6);
		Student s3 = new Student("amir", 30, 99.9);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		System.out.println("-------Using for loop--------");
		
		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			
		}
		
		System.out.println("----------for each-------");
		
		for (Student stu : al) {
			System.out.println(stu);
		}
		
		System.out.println("----------using iterator-------");
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("--------using list iterator-------");
		
		ListIterator li = al.listIterator();
		
		while (li.hasNext()) {
			Object o1 = li.next();
			System.out.println(o1);
		}
	}
}
