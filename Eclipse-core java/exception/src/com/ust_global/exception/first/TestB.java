package com.ust_global.exception.first;

public class TestB {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		int a = 10;
		int b= 0;
		try {
//			b  = a/2;
			b = a/0;
			System.out.println(b);
			System.out.println("hello");
			System.out.println("Happy diwali");
		}
		catch (ArithmeticException e) {
			System.out.println("number is divided by zero");
		}
		System.out.println(b);
		System.out.println("Main ended");
	}
}
