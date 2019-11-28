package com.ust_global.threads.pausing;

public class MyjoinThread extends Thread {
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
			try {
				Thread.sleep(2000);     //throes InterruptedException   should specify the tim
			} catch (InterruptedException e) {
				e.printStackTrace();
			}    
		}
	
	}
	
}
