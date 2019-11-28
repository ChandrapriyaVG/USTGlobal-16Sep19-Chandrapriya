package com.ust_global.accessmodifiers.pkg1;

import com.ust_global.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {

		Demo d = new Demo();

		/* System.out.println(d.a);
		 * Not possible */
		/*
		 * //Default Sample s =new Sample(); System.out.println(s.b); s.sub();   //not possible
		 */
		
		//Protected
		Sample s1 = new Sample();
		System.out.println(s1.c);
		s1.mul();
		
		//Public
		System.out.println(d.name);
		d.div();
	}
}