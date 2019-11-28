package com.ust_global.arrays;

public class TestC {
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "tums", 86.65);
		Student s2 = new Student(20, "dums", 65.36);
		Student s3 = new Student(30, "mums", 89.36);
		
		Student[] students = new Student[3];
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for (Student s : students) {
			System.out.println(s);
		}
		receive(students);
	}
	static void receive(Student[] stu) {
		for (Student student : stu) {
			System.out.println(student);
		}
	}
}
