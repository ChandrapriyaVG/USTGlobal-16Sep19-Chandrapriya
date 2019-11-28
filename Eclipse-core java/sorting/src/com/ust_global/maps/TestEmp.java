package com.ust_global.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestEmp {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(1,"Rama",11111));
		al.add(new Employee(2,"Sham",22222));
		al.add(new Employee(3,"Bhama",33333));

		ArrayList<Employee> al1 =new ArrayList<Employee>();
		al.add(new Employee(4,"Tim",44444));
		al.add(new Employee(5,"Kim",55555));
		al.add(new Employee(6,"Jim",666666));

		ArrayList< Employee> al2 =new ArrayList<Employee>();
		al.add(new Employee(7,"Ajay",77777));
		al.add(new Employee(8,"Vijay",88888));
		al.add(new Employee(9,"Jay",99999));

		HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
		hm.put("Anuj",al);
		hm.put("Tanuj",al1);
		hm.put("Manoj",al2);
		
		

		ArrayList<Employee> second = hm.get("Tanuj");
		Iterator<Employee> it1 = second.iterator();
		System.out.println("=====Team Tanuj=====");
		while(it1.hasNext()) {
			Employee e1 = it1.next();
			System.out.println("Id is "+e1.id);
			System.out.println("Name is "+e1.name);
			System.out.println("Salary is "+e1.salary);
			System.out.println("-----------------------------------------");
		}
		
		
		

		ArrayList<Employee> first = hm.get("Anuj");
		
		Iterator<Employee> it = first.iterator();
		System.out.println("=======Team Anuj========");
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Salary is "+e.salary);
			System.out.println("-----------------------------------------");
		}
			
		
			
			
			ArrayList<Employee> third = hm.get("Manoj");
			Iterator<Employee> it2 = third.iterator();
			System.out.println("=====Team Manoj=====");
			while(it2.hasNext()) {
					Employee e2 = it2.next();
					System.out.println("Id is "+e2.id);
					System.out.println("Name is "+e2.name);
					System.out.println("Salary is "+e2.salary);
					System.out.println("-----------------------------------------");
				}
	}
	
}




		
	
