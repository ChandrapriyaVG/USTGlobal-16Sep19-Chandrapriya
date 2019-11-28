package com.ust_global.collectionframework.list;

public class Teacher {
	String name;
	int yop;
	double salary;
	public Teacher(String name, int yop, double salary) {
		super();
		this.name = name;
		this.yop = yop;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", yop=" + yop + ", salary=" + salary + "]";
	}
	
	
}
