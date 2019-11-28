package com.ust_global.lambdaexpression;

public class TestMultiply {
	public static void main(String[] args) {
		
		MultiplyInterface multi = (a,b) -> a*b;
		int product = multi.multiply(20, 30);    //lambda expression can be held only into functional interface
		System.out.println("Product is "+product);
	}
}
