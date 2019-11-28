package com.ust_global.collectionframework.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {

	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(15);
		l.add(36);
		l.add(45);
		l.add(5);

		System.out.println("Before sorting "+l);
		Collections.sort(l);    //should'nt pass non generic type(ClassCastException) and null
		System.out.println("After sorting "+l);
		
		Collections.reverse(l);      //does'nt return anything return type is void it just affects the list
		System.out.println("After reverse "+l);
		
		Collections.shuffle(l);
		System.out.println("After shuffle "+l);
	}
}