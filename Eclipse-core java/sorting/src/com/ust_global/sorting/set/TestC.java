package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(25);
		ls.add("nikki");
		ls.add(89.9);
		ls.add(67);
		ls.add("bhavyaa");
		ls.add("bhavyaa");     //no duplicates
		ls.add(null);
		ls.add(null);
		
		System.out.println("=====using foreach=====");
		
		for (Object obj : ls) {
			System.out.println(obj);
		}
		System.out.println("=========using iterator=====");
		
		Iterator it = ls.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}
}
