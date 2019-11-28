package com.ust_global.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class TestStudent2 {
	public static void main(String[] args) {
		
		LinkedList<Student> ll = new LinkedList<Student>();
		
		Student s1 = new Student("sllman",10,89.99);
		Student s2 = new Student("Shah rukh", 20, 98.6);
		Student s3 = new Student("amir", 30, 99.9);
		
		ll.add(s1);
		ll.add(s2);
		ll.add(s3);
		
		System.out.println("-------Using for loop--------");
		
		for (int i = 0; i < ll.size(); i++) {
			Student s = ll.get(i);
			
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.percentage);
			
		}
		
		System.out.println("----------for each-------");
		
		for (Student stu : ll) {
			System.out.println(stu);
		}
		
		System.out.println("----------using iterator-------");
		
		Iterator it = ll.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("--------using list iterator-------");
		
		ListIterator li = ll.listIterator();
		
		while (li.hasNext()) {
			Object o1 = li.next();
			System.out.println(o1);
		}
	}
}
