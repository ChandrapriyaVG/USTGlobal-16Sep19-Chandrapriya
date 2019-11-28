package com.ust_global.beanobject.bean;

public class Student {
	private String name;
	private int rollno;
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName( ) {
		return name;
	}
	
	public void setRollNo(int rollno) {
		this.rollno = rollno;
	}
	
	public int getRollNo() {
		return rollno;
	}
}
