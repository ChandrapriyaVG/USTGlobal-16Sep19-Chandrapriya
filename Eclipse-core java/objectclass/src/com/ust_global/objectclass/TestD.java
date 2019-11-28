package com.ust_global.objectclass;

public class TestD {
	public static void main(String[] args) {
		
		Car c1 = new Car("Maserati", "black", 1200000);
		
		System.out.println(c1.hashCode());
		System.out.println(c1.toString());
	}
}
	