package com.ust_global.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("a is "+a);
		Integer i = a;  // Boxing or Auto Boxing
		System.out.println("i is "+i);
		
		Integer x = 10;
		Integer z = new Integer(20);
		System.out.println("x is "+x);
		int y = x;   //unboxing or auto un boxing
		System.out.println("y is "+y);
	
		int value = Integer.parseInt("1236");
		System.out.println("Value is "+value);
		
		int value1 = Integer.parseInt("aaa1236");
		System.out.println("Value is "+value1);
		
		
		boolean result = Boolean.parseBoolean("123true");
		System.out.println("result is "+result);
		
		
	}
}
