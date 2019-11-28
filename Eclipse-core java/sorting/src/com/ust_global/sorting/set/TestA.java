package com.ust_global.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestA {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(12);
		hs.add(56);
		hs.add("Deepa");
		hs.add(96.69);
		hs.add(56);    //duplicate are not allowed, no index
		hs.add(null);
		hs.add(null);
		
		System.out.println("=======using for each=========");
		for (Object obj : hs) {
			System.out.println(obj);
		}
		
		System.out.println("======using Iterator========== ");
		Iterator it = hs.iterator();
		
		while(it.hasNext()) {
			 
			Object o = it.next();
			
			System.out.println(o);
			
		}
	}
}
