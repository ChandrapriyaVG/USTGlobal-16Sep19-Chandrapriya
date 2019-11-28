package com.ust_global.customizeduncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Validator v = new Validator();
		
		try {
		v.verify(2);
		}
		catch (InvalidAgeException ie) {
			System.out.println("Exception occured");
		}
		v.verify(14);
		
		System.out.println("Main ended");
	}
}
