package com.ust_global.threads.defining;

public class MyThreads extends Thread {
	
	public void run () {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}
}
