package com.ust_global.sorting.list;

public class Pen implements Comparable<Pen> {

	double price;
	String brand;
	public Pen(double price, String brand) {
		super();
		this.price = price;
		this.brand = brand;
	}
	
	@Override
	public int compareTo(Pen o) {
		
		if (this.price > o.price) {
			
			return -1;
			
		}else if (this.price < o.price) {
			
			return 1;
		}else {
				return 0;
	}
	}
	
}
