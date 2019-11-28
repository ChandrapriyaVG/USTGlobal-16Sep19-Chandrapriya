package com.ust_global.sorting.set;

import java.util.Comparator;

public class SortByName implements Comparator<Bank> {

	@Override
	public int compare(Bank o1, Bank o2) {
//		String s = o1.name;
//		String t = o2.name;
//		return s.compareTo(t);
		
		return o1.name.compareTo(o2.name);
	}
	
}
