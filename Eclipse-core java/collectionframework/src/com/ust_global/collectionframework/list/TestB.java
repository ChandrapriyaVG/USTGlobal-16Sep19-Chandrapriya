package com.ust_global.collectionframework.list;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.naming.LimitExceededException;

public class TestB {
	public static void main(String[] args) {
		
		ArrayList al  = new ArrayList();
		al.add(10);
		al.add(29.72);
		al.add("chinna");
		al.add(true);
		
		for(Object o : al) {
			System.out.println(o);
		}
		
		ListIterator li = al.listIterator();
		System.out.println("---forward----");
		
		while(li.hasNext()) {
			Object o1 = li.next();
			System.out.println(o1);
		}
		System.out.println("----toward----");
		while(li.hasPrevious()) {
			
			Object o2 = li.previous();
			System.out.println(o2);
		}
		}
}
