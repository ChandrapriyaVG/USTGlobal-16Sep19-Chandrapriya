package com.ust_global.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestE {

	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(45);
		al.add(78);
		al.add(68);
		al.add(7);
		al.add(82);
		al.add(99);
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		Iterator<Integer> it = al.iterator();
		System.out.println("Sorted === ");
		while(it.hasNext()) {
			Integer i = it.next();
			
			System.out.println(i);
		}
	}
}
