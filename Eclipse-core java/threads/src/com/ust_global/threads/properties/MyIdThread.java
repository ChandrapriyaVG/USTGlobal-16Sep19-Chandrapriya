package com.ust_global.threads.properties;
						
public class MyIdThread extends Thread{

	public static void main(String[] args) {
		
		System.out.println("Main started");
		
		System.out.println(Thread.currentThread().getId());
		
		MyIdThread mi = new MyIdThread();
		System.out.println("myid thread "+mi.getId());
		
		System.out.println("priority "+Thread.currentThread().getPriority());
		
//		Thread.currentThread().setPriority(16);   // java.lang.IllegalArgumentException  if priority not in range
		
		System.out.println("Main ended");
		
	}
}
