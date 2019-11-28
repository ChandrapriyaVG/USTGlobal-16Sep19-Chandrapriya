package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Deepu");
		ts.add("Seepu");
		ts.add("munni");
		ts.add("Meena");
		
		System.out.println("=====using foreach====");
		for (String str : ts) {
			System.out.println(str);
		}
		System.out.println("====using iterator=====");
		Iterator<String> it = ts.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
	}
}
