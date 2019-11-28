package com.ust_global.immutable;

public class TestString {
	 public static void main(String[] args) {
		
		MyString ms = new MyString(20, "Ram");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms);
		
		ms.changeContent(60,"Krishna");
		
		System.out.println(ms.getName());
		System.out.println(ms.getRollNo());
		System.out.println(ms);
		
		System.out.println("------------------------------------------");
		
		MyString ms1 = new MyString(30,"Sony");
		System.out.println(ms1.getName());
		System.out.println(ms1.getRollNo());
		System.out.println(ms1);
	}
	 
}
