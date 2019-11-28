package com.ust_global.arrays;

public class TestB {
	public static void main(String[] args) {

		int[] nums = {10,20,30,40};
		
//		System.out.println(nums[10]);    // java.lang.ArrayIndexOutOfBoundsException
		
		receive(nums);
		
		System.out.println("------------------------");
		
		int[] values = getArray();
		
		System.out.println(getArray());
		
		
		String[] val = strngArray();
		System.out.println(strngArray());
	}
	static void receive(int[] numbers) {       //we can pass array as parameters
		
		for (int num : numbers) {
			System.out.println(num);  
		}
	}
	
	static int[] getArray() {
		int[] values = {10,20,30,40,50};
		return values;
	}
	
	static String[] strngArray() {
		String[] val = {"rama","shama","mama"};
		return val;
	}
	
}
