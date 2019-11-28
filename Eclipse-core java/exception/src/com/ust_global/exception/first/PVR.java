package com.ust_global.exception.first;

public class PVR {
	
	void book(){
		System.out.println("Booking started");
		
		try {
			
			System.out.println(10/0);
			System.out.println("Booking logic");
			System.out.println("Booing confirmed");
		}
		catch (ArithmeticException ae) {	
			System.out.println("Booking failed");
			throw ae;
		}
		
	}
}
