package com.ust_global.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestC {

	public static void main(String[] args) {

		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(45);
		al.add(78);
		al.add(68);
		al.add(7);
		al.add(82);
		al.add(99);
		
		List<Integer> l = al.stream().map(i -> i+50).collect(Collectors.toList());
		System.out.println(l);
		
		for (Integer in : l) {
			System.out.println(in);
		}
			}
}
