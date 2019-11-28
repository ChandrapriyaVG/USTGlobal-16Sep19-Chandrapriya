package com.ust_global.threads.properties;

public class MyPriorityThread extends Thread{
	public static void main(String[] args) {
		
		System.out.println("Main started");
		int p = Thread.currentThread().getPriority();
		System.out.println("Main Thread priority "+p);    //DEFAULT Priority is 5 
		
		Thread.currentThread().setPriority(7);
		System.out.println("Main thread priority "+Thread.currentThread().getPriority());
		
		MyPriorityThread t = new MyPriorityThread();
		int q = t.getPriority();
		System.out.println("Myprioritythread priority "+q);

		t.setPriority(9);
		System.out.println("Myprioritythread priority "+t.getPriority());
		System.out.println("Main ended");
	}
}
