package com.collections.set;

import java.util.Set;
import java.util.TreeSet;

import com.collections.list.Employee;

public class TestTree {
	
	public static void main(String[] args) {
		
		
		
		Set<Employee> set = new TreeSet<>();
		
		set.add(new Employee(50, "Anil", "50K"));
		set.add(new Employee(20, "Rajkumar", "60K"));
		set.add(new Employee(30, "Praveen", "70K"));
		set.add(new Employee(50, "Praveen", "60K"));
	
		System.out.println(set);
	}

}
