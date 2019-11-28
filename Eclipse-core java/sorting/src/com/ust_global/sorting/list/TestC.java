package com.ust_global.sorting.list;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		
		Integer peekElement = l.peek();
		System.out.println("Peek element "+peekElement);
		Integer peekFirst = l.peekFirst();
		System.out.println("Peek First element "+peekFirst);
		Integer peekLast = l.peekLast();
		System.out.println("Peek last element "+peekLast);
		System.out.println("Aftter peek=====> "+l);
		
		
		System.out.println("==============================");
		
		Integer pollElement = l.poll();
		System.out.println("Poll element "+pollElement);
		Integer pollFirst = l.pollFirst();
		System.out.println("Poll First element "+pollFirst);
		Integer pollLast = l.pollLast();
		System.out.println("Poll last element "+pollLast);
		System.out.println("Aftter poll=====> "+l);
		
		l.push(12);
		System.out.println("After push----> "+l);
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("After pop-------------"+l);
	}
}
