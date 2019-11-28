package com.ust_global.lambdaexpression;

public class TestSayHi {
	public static void main(String[] args) {
		
		SayHiInterface sh = ()->{
			
			return "hi";
		};
		String st = sh.sayHi();
		System.out.println(st);
	}
	
}
