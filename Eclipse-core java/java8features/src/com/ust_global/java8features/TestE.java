package com.ust_global.java8features;

import java.util.function.Supplier;

public class TestE {

	public static void main(String[] args) {
		
		Supplier<Student> s = ()->new Student(10,"Vj",66);
		
		Student s1 = s.get();
		System.out.println("Id is "+s1.id);
		System.out.println("Name is "+s1.name);;
		System.out.println("Percentage is "+s1.percentage);
		
		Supplier<Integer> i = ()->25;
		int val = i.get();
		System.out.println("Age is "+val);
		
		Supplier<String> st = ()->"Food Evening";
		String str = st.get();
		System.out.println(str);
	}
}
