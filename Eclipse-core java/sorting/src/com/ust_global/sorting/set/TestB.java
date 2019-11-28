package com.ust_global.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Vijay");
		hs.add("Ajay");
		hs.add("Sujay");
		hs.add("Bujay");
		hs.add("Enjay");
		
		System.out.println("======Using For each======");
		
		for (String st : hs) {
			System.out.println(st);
		}
		System.out.println("=====using iterator======");
		 
		Iterator<String> it = hs.iterator();
		
		while(it.hasNext()) {
			String p = it.next();
			System.out.println(p);
		}
	}
}
