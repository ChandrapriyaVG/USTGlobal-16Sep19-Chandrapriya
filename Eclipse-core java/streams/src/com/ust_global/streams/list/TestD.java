package com.ust_global.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestD {

	public static void main(String[] args) {
		
		ArrayList<Integer> marks =new ArrayList<Integer>();
		marks.add(35);
		marks.add(78);
		marks.add(68);
		marks.add(7);
		marks.add(82);
		marks.add(99);
		
		Comparator<Integer> cmp = (m1,m2)->{
			
			if(m1>m2) {
				return 1;
			}else if(m1<m2) {
				return -1;
			}else {
				return 0;
			}
		};
		
		
		 
	  long noOfFailedStudents =	marks.stream().filter(i -> i<35).count();
	  System.out.println(noOfFailedStudents);
	  System.out.println("-------------------------------------");
	  
	  Integer  i = marks.stream().min(cmp).get();
	  System.out.println("Min value is "+i);
	  System.out.println("-------------------------------------");
		 
	  Integer i1 = marks.stream().max(cmp).get();
	  System.out.println("Max value is "+i1);
	}
	
}
