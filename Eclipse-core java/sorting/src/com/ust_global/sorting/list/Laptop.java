package com.ust_global.sorting.list;

public class Laptop implements Comparable<Laptop>{

	double price;
	int ram;
	String name;
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}
	
//	@Override
//	public int compareTo(Laptop o) {
//		Integer p = this.ram;
//		Integer q = o.ram;
//		return p.compareTo(q);
//	}
//	
	
	@Override
	public int compareTo(Laptop o) {
		Double p = this.price;
		Double q = o.price;
		return p.compareTo(q);
	}
}
