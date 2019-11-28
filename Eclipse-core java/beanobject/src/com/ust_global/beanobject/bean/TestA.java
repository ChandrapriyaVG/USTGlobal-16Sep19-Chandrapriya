package com.ust_global.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(10);
		s.setName("Shivagami");
		s.setRollNo(123);
		
		Database d = new Database();
		d.receive(s);
		
		
		Employee e = new Employee();
		e.setId(007);
		e.setName("James Bond");
		e.setDept(1);
		e.setSalary(123456);
		e.setDesignation("Secret Agent");
		
		d.save(e);
	}
}
