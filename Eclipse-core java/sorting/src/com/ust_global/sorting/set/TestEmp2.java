package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestEmp2 {

	public static void main(String[] args) {
		
		TreeSet<Employee> ts = new TreeSet<Employee>();   //sorts only comparable classes
		Employee e1 = new Employee(10,"Siri",56000.23);		
		Employee e2 = new Employee(20,"Bixby", 96000);
		Employee e3 = new Employee(30,"Alexa",89000);
		Employee e4 = new Employee(40,"Cortana", 45000);
		Employee e5 = new Employee(40,"Cortana", 45000);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		
		System.out.println("======using iterator=====");
		Iterator<Employee> it = ts.iterator();
		
		while(it.hasNext()) {
			Employee s = it.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.salary);
			System.out.println("----------------");
		}
	}
}
