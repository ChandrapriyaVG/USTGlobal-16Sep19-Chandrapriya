package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJ {

	public static void main(String[] args) {
		
		PriorityQueue pq = new PriorityQueue();
		pq.add(12);
		pq.add(45);
//		pq.add("helloooo");   // can add only generic type(class cast exception ) 
//		pq.add(null);  //cannot add null
		pq.offer(69);
		
		System.out.println("Before poll====");
		System.out.println(pq);
		System.out.println("=====using iterator====");
		Iterator it = pq.iterator();
		
		while(it.hasNext()) {
			System.out.println(pq.poll());
		}
		System.out.println("Afterr poll "+pq);
		
		
	}
}
