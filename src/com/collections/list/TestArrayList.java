package com.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		 Vector<Integer> vector = new Vector<>();
		 
		 System.out.println(vector.capacity());
		 
		 for(int i=1000; i<=10000; i=i+1000) {
		 vector.add(i);
		 }
		 
		 vector.add(15000);
		 System.out.println(vector.capacity());
		
		 System.out.println(vector);
		
      /*  List<Integer> list = new LinkedList<>();
		
		for(int i=1;i<=1000;i++) {
			list.add(i);
		}
		
		
		Integer value = list.get(998);
		
		System.out.println(value);
		*/
		
		
		
		
		/*List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<=50_00_000;i++) {
			list.add(0,i);
		}
		
		
		long beforeReading = System.currentTimeMillis();
		
		Integer value = list.get(3999999);
		
		long afterReading = System.currentTimeMillis();
		
		System.out.println("time diff in millis "+(afterReading-beforeReading));
		
		System.out.println("output is: "+value);
		*///System.out.println(list);
		
   /* List<Integer> linkedList = new LinkedList<>();
		818
		
		for(int i=1;i<=10000;i++) {
			linkedList.add(0, i);
		}
	*/	
		
		/*List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(5);
		list.add(7);
		list.add(8);
		
		Set<Integer> set = new TreeSet<>();
		set.addAll(list);
		
		List<Integer> unmodifiableList = Collections.unmodifiableList(list);
		System.out.println(unmodifiableList);
		unmodifiableList.add(105);
		*/
		
		/*List<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("gdmrng");
		list.add("hey");
		list.add("hi");
		list.add("java");
		list.add(2, "hibernate");
		
		
		
		List<String> list2 = new ArrayList<>();
		list2.addAll(list);
		
		System.out.println(list2);
		list2.removeAll(list);
		
		System.out.println(list2);
		*/
		
	}

}
