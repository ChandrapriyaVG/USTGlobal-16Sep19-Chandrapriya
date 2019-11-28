package com.ust_global.lambdaexpression;

public class TestFact {
	public static void main(String[] args) {
		
		FactorialInterface fi = (n)->{
			int fact = 1;
			for (int i = 2;i<=n;i++) {
				fact=fact+i;
			}
			return fact;
	};
	int factoril = fi.factorial(7);
	System.out.println("Factorial is "+factoril);
	}
}
