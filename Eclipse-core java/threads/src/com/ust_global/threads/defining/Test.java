package com.ust_global.threads.defining;

public class Test {
	public static void main(String[] args) {

		System.out.println("Main STARTED");

		MyThreads t1 = new MyThreads();
		
		/*
		 * Don't call the run(),it behaves like a normal program Allprogram will be
		 * executed in the main thread only
		 */		
//		t1.run();
	
		t1.start();
//		t1.start();    Thorws IllegalThreadStateExcepton
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}

		System.out.println("Main ENDED");
	}
}
