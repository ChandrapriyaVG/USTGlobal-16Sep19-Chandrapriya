package com.ust_global.sorting.set;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		Long s= o1.micr;
		Long t= o2.micr;
		return s.compareTo(t);
	}
}
