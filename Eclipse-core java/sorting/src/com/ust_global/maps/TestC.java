package com.ust_global.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Bangalore ",560068);
		lh.put("Patna", 880000);
		lh.put("Haryana", 534303);
		
		System.out.println("Pincodes "+lh);
		
		Set<String> s = lh.keySet();
		
		for (String key : s) {
			System.out.println("key "+key);
		}
		
		System.out.println("===========================");
		
		Collection<Integer> c = lh.values();
		
		for (Integer value : c) {
			System.out.println("value "+value);
			
			
		}
	}
}
