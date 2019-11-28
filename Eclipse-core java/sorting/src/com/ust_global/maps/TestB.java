package com.ust_global.maps;

import java.util.HashMap;

public class TestB {

	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("Kuku", 456556);
		hm.put("Mala",7987545);
		hm.put("Sheela",751368);

		HashMap hm1 = new HashMap();
		hm1.put("Deepu", 45655006);
		hm1.put("Chipu",798700545);
		hm1.put("Shipu",75001368);

		boolean hasKey = hm.containsKey("Mala");
		System.out.println("Mala is present "+hasKey);
		
		System.out.println("=================================");
		
		boolean hasValue = hm.containsValue(456556);
		System.out.println("Value present "+hasValue);
		
		System.out.println("=================================");
		
		hm.putAll(hm1);
		System.out.println("After put all  "+hm);   //values added to hm from hm1
		
		System.out.println(hm.size());
		
		boolean isEmpty = hm1.isEmpty();
		System.out.println("hm1 is empty? - "+isEmpty);
		
		hm.clear();
		System.out.println("Ater clear "+hm);

	}
}