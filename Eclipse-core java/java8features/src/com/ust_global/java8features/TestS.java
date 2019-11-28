package com.ust_global.java8features;

import java.util.ArrayList;

public class TestS {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(1,"Nobita",64));
		al.add(new Student(2,"Dora",78));
		al.add(new Student(3,"Sizuka", 36));
		al.add(new Student(4,"Dekisuki", 99));
		al.add(new Student(5,"Jian", 88));
		
		Helper h1 = new Helper();
//		h1.displayAllStudent(al);
//		h1.displayFailedStudents(al);
		h1.displayPassedStudents(al);
		h1.displayTopper(al);
	}
}
