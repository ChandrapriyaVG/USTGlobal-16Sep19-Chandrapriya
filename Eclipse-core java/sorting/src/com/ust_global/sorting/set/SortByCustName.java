package com.ust_global.sorting.set;

import java.util.Comparator;

public class SortByCustName implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.name.compareTo(o2.name);
	}
}
