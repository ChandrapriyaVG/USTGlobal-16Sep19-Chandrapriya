package com.ust_global.threads.pausing;

public class TestJoin {
	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		MyjoinThread t =new MyjoinThread();
		t.start();
		try {
			t.join(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}
		System.out.println("main ended");
	}
}

