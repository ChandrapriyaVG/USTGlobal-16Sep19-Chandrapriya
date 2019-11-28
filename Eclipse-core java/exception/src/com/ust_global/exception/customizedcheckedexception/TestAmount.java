package com.ust_global.exception.customizedcheckedexception;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		ValidateAmount va = new ValidateAmount();
		
		try {
			va.checkAmount(90000);
			System.out.println("Withdraw your cash");
		} 
		catch (InvalidAmountException e) {
			System.err.println(e.getMessage());
			
		}
		
		
		System.out.println("main ended");
	}
}
