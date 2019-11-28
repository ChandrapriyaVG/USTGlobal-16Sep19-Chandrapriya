package com.ust_global.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestMarker {

	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker(123,"blue"));
		al.add(new Marker(456, "red"));
		al.add(new Marker(789, "green"));
		al.add(new Marker(369,"black"));
		
		System.out.println("=======Before sorting======");
		displayMarkerDetails(al);
		
//		SortByPrice sb =new SortByPrice();
		SortByColor sc = new SortByColor();
		Collections.sort(al,sc);
		System.out.println("=====After sorting====");
		displayMarkerDetails(al);
	}
	
	static void displayMarkerDetails(ArrayList<Marker> al) {
		
		Iterator<Marker> it = al.iterator();
		
		while(it.hasNext()) {
			Marker m = it.next();
		System.out.println("Price is "+m.price);
		System.out.println("Color is "+m.color);
		System.out.println("========================================================");
		}
		
	}
}
