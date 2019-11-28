package com.ust_global.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("Bangalore ",560068);   //sorting is done based on key
		tm.put("Patna", 880000);
		tm.put("Haryana", 534303);

//		lh.put(null, 65664);  //cant add null (NullPointerException)

		for(Map.Entry<String, Integer> m : tm.entrySet() ) {
			
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key);
			System.out.println("Value is "+value);
			System.out.println("===========================");
		}
		
	}
}
