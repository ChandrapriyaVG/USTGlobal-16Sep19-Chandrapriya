package com.ust_global.lambdaexpression;

public class TestGreet {
	public static void main(String[] args) {
		
		GreetInterface grt = (message) -> {
			System.out.println(message);
			return message;
			};
		String msg = grt.greet("Hello");
		System.out.println(msg);
}
}