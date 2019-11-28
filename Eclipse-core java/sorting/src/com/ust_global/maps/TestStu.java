package com.ust_global.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestStu {

	public static void main(String[] args) {
		
		Student s1 = new Student(1,"Divya",56.66);
		Student s2 = new Student(2,"Ambi",36.63);
		Student s3 = new Student(3,"Gombi",88.88);
		Student s4 = new Student(4,"Dummi",66.66);
		Student s5 = new Student(5,"Tummi",55.55);
		Student s6 = new Student(6,"Chinnu",44.44);
		Student s7 = new Student(7,"Tinnu",33.33);
		Student s8= new Student(8,"Motu",22.22);
		Student s9= new Student(9,"Chotu",11.11);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		hm.put("First",al);
		hm.put("Second", al1);
		hm.put("Third", al2);
		
		ArrayList<Student> first = hm.get("Second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
		Student s = it.next();
		System.out.println("Id is "+s.id);
		System.out.println("Name is "+s.name);
		System.out.println("Percentage is "+s.percentage);
		System.out.println("====================================");
		}
	}
}
