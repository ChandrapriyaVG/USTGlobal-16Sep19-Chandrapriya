package com.ust_global.sorting.set;

import java.util.Comparator;

public class SortByPin implements Comparator<Bank>{
	@Override
	public int compare(Bank o1, Bank o2) {
		Integer s = o1.pincode;
		Integer t = o2.pincode;
		return s.compareTo(t);
		

	}
}
