package com.ust_global.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestA {

	public static void main(String[] args) {
		
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(45);
		al.add(78);
		al.add(68);
		al.add(7);
		al.add(82);
		al.add(99);
		
		List<Integer> l = al.stream().filter(i -> i % 2 == 0 ).collect(Collectors.toList());
		System.out.println(l);
		
		List<Integer> l1 = al.stream().filter(i -> i % 3 == 0 ).collect(Collectors.toList());
		System.out.println("Number divisible by 3 are "+l1);
		
		for (Integer in : l) {
			System.out.println(in);
		}
	}
}
