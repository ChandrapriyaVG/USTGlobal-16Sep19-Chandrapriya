package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(11);
		ts.add(22);
		ts.add(33);
		ts.add(44);		//no duplicates
		ts.add(44);     //elements are auto sorted in ascending 
//		ts.add("deepu");   //only generics supported
//		ts.add(null);     //NullPointerException
		
		System.out.println("====using for each====");
		for (Object o : ts) {
			System.out.println(o);
		}
		System.out.println("=======using iteartor======");
		Iterator it = ts.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}
}
