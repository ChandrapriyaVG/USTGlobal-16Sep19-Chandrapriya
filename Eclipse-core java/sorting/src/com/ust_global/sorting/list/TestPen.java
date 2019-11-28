package com.ust_global.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPen {

	public static void main(String[] args) {
		
		ArrayList<Pen> al = new ArrayList<Pen>();
		
		Pen p1 =new Pen(98,"cello");
		al.add(p1);
		al.add(new Pen(99, "reynolds"));
		al.add(new Pen(100,"parker"));
		al.add(new Pen(200,"Airmail"));
		
		
		System.out.println("Before sorting ====> ");
		displayPenDetails(al);
		System.out.println("After sorting====>");
		Collections.sort(al);	
		displayPenDetails(al);
	}
	static void displayPenDetails(ArrayList<Pen> al) {
		
		Iterator<Pen> it = al.iterator();
		
		while(it.hasNext()) {
			Pen p = it.next();
		
		System.out.println("Pen price is "+p.price);
		System.out.println("Brand is "+p.brand);
		
		}
		
	}
	
}
