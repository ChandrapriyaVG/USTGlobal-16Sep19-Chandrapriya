package com.ust_global.hasarelation.weak;

public class TestA {
	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();
		System.out.println("________________________");
		p.m.write();			//HasA relation
		System.out.println(p.m.name);
		
		System.out.println("**********************************************");
		
		Car c = new Car();
		System.out.println(c.brand);
		c.move();
		System.out.println("-------------------------------------------");
		c.m.playSong();
	}
}
