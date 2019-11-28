package com.ust_global.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank {

	public static void main(String[] args) {

		SortByName sn = new SortByName(); 
		SortByPin sp = new SortByPin();
		SortByMicr sm = new SortByMicr();
		
		TreeSet<Bank> ts = new TreeSet<Bank>(sn);
		
		Bank b1 = new Bank("SBI",585103,5659469);
		Bank b2 = new Bank("ICICI", 560032, 8795465);
		Bank b3 =  new Bank("DHFL", 568870,6989468);
		Bank b4 = new Bank("Syndicate", 64646, 6436597);
		Bank b5 = new Bank("Syndicate", 64646, 6436597);

		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);

		System.out.println("=====using iterator=====");
		Iterator<Bank> it = ts.iterator();

		while(it.hasNext()) {
			Bank s = it.next();
			System.out.println(s.pincode);
			System.out.println(s.name);
			System.out.println(s.micr);
			System.out.println("----------------");
		}
	}
}
