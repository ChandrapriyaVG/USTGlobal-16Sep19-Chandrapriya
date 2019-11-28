package com.ust_global.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestM {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("priya");
		al.add("riya");
		al.add("kiran");
		al.add("girija");
		
		System.out.println("Befor sort---> "+al);
		Collections.sort(al);
		System.out.println("After sorting---> "+al);
	}
}
