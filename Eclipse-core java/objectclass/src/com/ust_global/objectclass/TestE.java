package com.ust_global.objectclass;

public class TestE {
	public static void main(String[] args) {
		
		Cow c1 = new Cow(10, "Ganga", 120000);
		Cow c2 = new Cow(20, "Tunga", 130000);
		Cow c3 = new Cow(10, "Ganga", 120000);
		Cow c4 =c3;
		
		boolean isEqual = c1.equals(c2);
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c4));
		System.out.println(isEqual);
		
		Employee e1 = new Employee(10, "Raju", 100000);
		Employee e2 = new Employee(20, "Kaju", 200000);
		
		System.out.println(e1.equals(e2));
	}
}
