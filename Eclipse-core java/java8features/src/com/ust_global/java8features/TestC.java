package com.ust_global.java8features;

import java.util.function.Function;

public class TestC {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i*i;
		
		Integer p = f.apply(6);
		System.out.println(p);
		
		Integer q = f.apply(9);
		System.out.println(q);
	}
}
