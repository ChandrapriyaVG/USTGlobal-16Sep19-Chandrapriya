package com.ust_global.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestK {

	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(25.5);
		al.add(65.36);
		al.add(56.79);
		al.add(69.98);
		al.add(25.5);
		al.add(null);
		al.add(null);
		
		System.out.println(al);
		
		al.add(2, 89.98);
		System.out.println("after adding in 2nd index"+al);
		al.remove(4);
		System.out.println("after removing 4th element"+al);
		al.remove(null);
		System.out.println("After removing null"+al);
		Double val = al.get(4);
		System.out.println("Object at 4th index"+val);
		al.set(2, 58.63);
		System.out.println("After replacing 2nd index"+al);
		al.clear();
		System.out.println("After clear method"+al);
		al.contains(54.6);
		
		List<Double> al1 = new ArrayList<Double>();
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);
		
		al.addAll(al1);
		System.out.println("after add all method "+al);
		
		boolean contain = al.containsAll(al1);
		System.out.println("Contains all of al1 "+contain);
		
		boolean res = al.removeAll(al1);
		System.out.println("Removed all of all "+res);
		System.out.println("After remove "+al);
	}
}
