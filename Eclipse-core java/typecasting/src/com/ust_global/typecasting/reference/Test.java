package com.ust_global.typecasting.reference;

public class Test {
	public static void main(String[] args) {
		
		Pen p = new Marker();
		System.out.println(p.cost);
		p.write();
//		System.out.println(p.size);         not possible
//		p.color;           not possible
		
		Marker m = (Marker) p;//Downcast
		System.out.println(m.size);
		m.color();
		m.write();
		
	}
}
