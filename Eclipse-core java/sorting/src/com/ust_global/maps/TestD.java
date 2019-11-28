package com.ust_global.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Bangalore ",560068);
		lh.put("Patna", 880000);
		lh.put("Haryana", 534303);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is "+key+"----"+"Value "+value);
			System.out.println("====================================");
		}
	}
}
