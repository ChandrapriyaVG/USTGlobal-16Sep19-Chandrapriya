package com.ust_global.lambdaexpression;

public class TestSq {
	public static void main(String[] args) {
		
		SquareInterface sq = x -> x*x;
		int sqr = sq.square(5);
		System.out.println("Square is "+sqr);
	}
}
