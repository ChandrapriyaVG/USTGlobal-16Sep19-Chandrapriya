package com.ust_global.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLaptop {
	public static void main(String[] args) {
		
		LinkedList<Laptop> ll = new LinkedList<Laptop>();
		Laptop l1 = new Laptop(65000,3,"HP");
		Laptop l2 = new Laptop(60000,6,"Dell");
		Laptop l3= new Laptop(96000,16,"Apple");
		Laptop l4 = new Laptop(50000,8,"Asus");
		
		ll.add(l1);
		ll.add(l2);
		ll.add(l3);
		ll.add(l4);
		ll.add(new Laptop(78000,9,"Acer"));
		
		
		System.out.println("--------Before sorting----");
		displayLaptopDetails(ll);
		System.out.println("---------After Sort-----");
		Collections.sort(ll);
		displayLaptopDetails(ll);
		
		
	}
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		
		Iterator<Laptop> it =l.iterator();
		
		while(it.hasNext()) {
			
			Laptop lp = it.next();
			
			System.out.println("Brand is "+lp.name);
			System.out.println("RAM is "+lp.ram);
			System.out.println("Price is "+lp.price);
		}
	}
}
