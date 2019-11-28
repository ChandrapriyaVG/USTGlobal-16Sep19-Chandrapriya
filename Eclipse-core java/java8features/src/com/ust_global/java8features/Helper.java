package com.ust_global.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Helper {

	void displayAllStudent(ArrayList<Student> al) {
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage);
			System.out.println("--------------------------------");
			
		}
	}
	
		void displayFailedStudents(ArrayList<Student> al) {
		
			List<Student> l =al.stream().filter(student -> student.percentage < 40).collect(Collectors.toList());
			
			Iterator<Student> it = l.iterator();
			while(it.hasNext()) {
				Student s = it.next();
				System.out.println("Id is "+s.id);
				System.out.println("Name is "+s.name);
				System.out.println("Percentage is "+s.percentage);
				System.out.println("--------------------------------");
			}
		}	
			
			void displayPassedStudents(ArrayList<Student> al) {
				
				List<Student> l =al.stream().filter(student -> student.percentage > 40).collect(Collectors.toList());
				
				Iterator<Student> it = l.iterator();
				while(it.hasNext()) {
					Student s = it.next();
					System.out.println("Id is "+s.id);
					System.out.println("Name is "+s.name);
					System.out.println("Percentage is "+s.percentage);
					System.out.println("--------------------------------");
					
				}
			}
				
				void displayTopper(ArrayList<Student> al){
					
					Comparator<Student> cmp = (o1,o2) -> {
						if(o1.percentage > o2.percentage) {
							return 1;
						}else if (o1.percentage < o2 .percentage) {
							return -1;
						}else {
							return 0 ;
						}
					};
					System.out.println("====Topper======");
					
					Student s = al.stream().max(cmp).get();
					
					System.out.println("Name is "+s.name);
					System.out.println("Id is "+s.id);
					System.out.println("Percentage is "+s.percentage);
				}

		}
	
	

