package com.ust_global.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		
		hm.put("Kuku", 456556);
		hm.put("Mala",7987545);
		hm.put("Sheela",751368);
		
		System.out.println("Data "+hm);
		hm.put("Mala", 1111111);
		System.out.println("After modifying "+hm);
		
		hm.put("Bala",1111111);
		System.out.println("After bala adding dup value "+hm);
		
		hm.put(null ,7548487);
		System.out.println("after null "+hm);
		
		hm.put(null ,7548000);
		System.out.println("After 2nd null "+hm);
		
		hm.put("Lala",null );
		System.out.println("after null value "+hm);
		
		System.out.println("==================================================================");
		Object phone = hm.get("Sheela");
		System.out.println("value "+phone);
		
		System.out.println("===================================");
		
		Object phone1 = hm.get("la");
		System.out.println("value "+phone1);
		
		System.out.println("===================================");
		
		hm.remove("Sheela");
		System.out.println("After remove "+hm);
	}
}
