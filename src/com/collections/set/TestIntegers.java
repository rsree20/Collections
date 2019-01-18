package com.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TestIntegers {
	
	public static void main(String[] args) {
		
		
		Set<Integer> set = new TreeSet<>(new IntegerDescendingSorting());
		set.add(10);
		set.add(30);
		set.add(50);
		set.add(40);
		set.add(70);
		set.add(80);
		
		System.out.println(set);
	}

}
