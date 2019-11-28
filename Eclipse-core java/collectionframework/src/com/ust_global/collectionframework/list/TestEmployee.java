package com.ust_global.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class TestEmployee {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		Employee s1 = new Employee("salman",10,89000.99);
		Employee s2 = new Employee("Shah rukh", 20, 98000.6);
		Employee s3 = new Employee("amir", 30, 99000.9);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		
		System.out.println("-------Using for loop--------");
		
		for (int i = 0; i < al.size(); i++) {
			Employee s = al.get(i);
			
			System.out.println("id is "+s.id);
			System.out.println("name is "+s.name);
			System.out.println("percentage is "+s.salary);
			
		}
		
		System.out.println("----------for each-------");
		
		for (Employee e : al) {
			System.out.println(e);
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
