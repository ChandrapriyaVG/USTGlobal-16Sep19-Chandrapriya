package com.ust_global.beanobject.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Scanner class");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Are you from mars?");
		Boolean b = sc.nextBoolean();
		System.out.println(b);
		
		System.out.println("Enter your salary");
		Double d = sc.nextDouble();
		System.out.println(d);
		
		System.out.println("write a sentence");
		String s = sc.nextLine();
		System.out.println(s);
	}
}
