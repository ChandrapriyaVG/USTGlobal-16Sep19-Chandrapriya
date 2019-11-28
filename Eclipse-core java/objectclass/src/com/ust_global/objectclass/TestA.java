package com.ust_global.objectclass;

public class TestA {
	public static void main(String[] args) {
		
		Pen p = new Pen();
		int pHashCode = p.hashCode();
		System.out.println("HashCode of p "+pHashCode);
		
		Pen q = new Pen();
		int qHashCode = q.hashCode();
		System.out.println("HashCode of q "+qHashCode);
	
	}
}
