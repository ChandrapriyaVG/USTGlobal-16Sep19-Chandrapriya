package com.ust_global.maps;

import java.util.Hashtable;

public class TestG {

	public static void main(String[] args) {
		
		Hashtable<Integer , String> ht =new Hashtable<Integer, String>();
		ht.put(800,"Ajay");
		ht.put(101,"Vijay");
		ht.put(203,"Sonu");
		ht.put(4,"Monu");
		
		System.out.println("Data "+ht);
		
		ht.put(101,"SriRam");
		
		System.out.println("Data "+ht);
		
//		ht.put(null,"sdfgh");  // no null allowed for key
		
//		ht.put(105, null );    // no null allowed for value
		
		System.out.println("Data "+ht);

		
		
		
	}
}
