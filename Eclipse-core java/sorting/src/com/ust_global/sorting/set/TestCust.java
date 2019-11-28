package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestCust {

	public static void main(String[] args) {

		SortByCustName sc = new SortByCustName();

		TreeSet<Customer> ts = new TreeSet<Customer>(sc);
		ts.add(new Customer("Navuu", 45,456300));
		ts.add(new Customer("Raju",37,120000));
		ts.add(new Customer("Kaju",99, 320000));
		ts.add(new Customer("Micheal", 59, 450000));

		System.out.println("=====using iterator=====");
		Iterator<Customer> it = ts.iterator();

		while(it.hasNext()) {
			Customer s = it.next();
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.salary);
			System.out.println("----------------");
		}
	}
}

