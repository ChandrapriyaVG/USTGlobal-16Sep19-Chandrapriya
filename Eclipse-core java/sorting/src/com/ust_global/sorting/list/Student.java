package com.ust_global.sorting.list;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double percentage;
	
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	
//	@Override
//	public int compareTo(Student s) {
//		if(this.id>s.id) {
//			
//			return 1;
//			
//		}else if(this.id<s.id) {
//			
//			return -1;
//			
//		}else {
//			
//			return 0;
//		}
//	}
	
	@Override
	public int compareTo(Student s) {
		
		Integer i = this.id;
		Integer j = s.id;
		return i.compareTo(j);
	}
}
	
	//@Override
	//	public int compareTo(Student o) {
	//		
	//		if(this.percentage > o.percentage) {
	//		
	//			return 1;
	//		
	//		}else if(this.percentage < o.percentage) {
	//		
	//			return -1;
	//		
	//		}else {
	//			
	//		return 0;
	//		
	//		}	
	//	}
	
//	@Override
//	public int compareTo(Student s) {
//		
//		String p = this.name.toUpperCase();
//		String q = s.name.toUpperCase();
//		return p.compareTo(q);
//		}	
//	}
//	
	

