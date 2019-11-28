package com.ust_global.collectionframework.list;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestTeacher2 {

	public static void main(String[] args) {
		
		LinkedList<Teacher> al = new LinkedList<Teacher>();
		
		Teacher t1 = new Teacher("Akki", 7,1200000);
		Teacher t2 = new Teacher("Ranbir", 5, 530000);
		Teacher t3 = new Teacher("Ranvir", 5, 360000);
	
		al.add(t1);
		al.add(t2);
		al.add(t3);
		
		System.out.println("-----for loop-----");
		
		for (int i = 0; i <al.size(); i++) {
			Teacher t = al.get(i);
			
			System.out.println("name is "+t.name);
			System.out.println("yop is "+t.yop);
			System.out.println("salary is "+t.salary);
			
		}
		System.out.println("-----for each loop----");
		
		for (Teacher tea : al) {
			System.out.println(tea);
		}
		System.out.println("-----using iterator-----");
		
		Iterator<Teacher> it = al.iterator();
		
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
		
		System.out.println("--------using list iterator-------");
		
		ListIterator li = al.listIterator();
		
		while (li.hasNext()) {
			Object o1 = li.next();
			System.out.println(o1);
		}
	}
}

		
	
