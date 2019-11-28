package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<Double>();
		ls.add(56.69);
		ls.add(99.99);
		ls.add(66.66);
		ls.add(88.88);
		ls.add(88.88);
		
		System.out.println("====using for each====");
		for (Double d : ls) {
			System.out.println(d);
		}
		System.out.println("====using iterator====");
		Iterator<Double> it = ls.iterator();
		
		while(it.hasNext()) {
			Double db = it.next();
			System.out.println(db);
		}
	}
}
