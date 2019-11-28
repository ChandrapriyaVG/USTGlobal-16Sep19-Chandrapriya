package com.ust_global.arrays;

public class TestA {
	public static void main(String[] args) {
		
		int [] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("-----for each-----");
		
		for (int i : numbers) {
			System.out.println(i);
		}
		
		System.out.println("==================================");
		char[] ch = {'a','b','c','d'};
		for (int i = 0; i < ch.length; i++) {
			System.out.println(i);
		}
		for (char c : ch) {
			System.out.println(c);
		}
		System.out.println("=========================================");
		byte[] by = {12,11,10,6,7,8};
		for (int i = 0; i < by.length; i++) {
			System.out.println(i);
		}
		for (byte b : by) {
			System.out.println(b);
		}
		System.out.println("============================================");
		boolean[] bo = {true,true,false,true,false};
		for (int i = 0; i < bo.length; i++) {
			System.out.println(i);
		}
		for (boolean b : bo) {
			System.out.println(b);
		}
		System.out.println("==========================================");
		double[] dl = {1.23,23.45,34.56,1.90};
		for (int i = 0; i < dl.length; i++) {
			System.out.println(i);
		}
		for (double d : dl) {
			System.out.println(d);
		}
		System.out.println("====================================");
		String[] st = {"raju","kaju","sonu","monu"};
		for (int i = 0; i < st.length; i++) {
			System.out.println(i);
		}
		for (String string : st) {
			System.out.println(string);
		}
	}
}
