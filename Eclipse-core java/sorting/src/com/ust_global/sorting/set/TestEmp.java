package com.ust_global.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestEmp {

	public static void main(String[] args) {
		
		HashSet<Employee> hs = new HashSet<Employee>();   //allows duplicate therefore you have to override hashcode and equals method
		Employee e1 = new Employee(10,"Siri",56000.23);
		Employee e2 = new Employee(20,"Bixby", 96000);
		Employee e3 = new Employee(30,"Alexa",89000);
		Employee e4 = new Employee(40,"Cortana", 45000);
		Employee e5 = new Employee(40,"Cortana", 45000);
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);
		hs.add(e5);
		
		
		System.out.println("======using iterator=====");
		Iterator<Employee> it = hs.iterator();
		
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.salary);
			System.out.println("----------------");
		}
	}
}
