package com.collections.list;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class PracticeHashSet {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		set.add(10);
		set.add(25);
		set.add(15);
		set.add(5);
		
		System.out.println(set);
		
	/*	HashSet<Employee> set = new HashSet<>();
		set.add(new Employee(10, "Anil", "50K"));
		set.add(new Employee(20, "Anil", "50K"));
		set.add(new Employee(30, "Prashanth", "70K"));
		set.add(new Employee(10, "Anil", "50K"));
		set.add(new Employee(10, "Anil", "50K"));
			
		System.out.println(set);*/
	}

}
