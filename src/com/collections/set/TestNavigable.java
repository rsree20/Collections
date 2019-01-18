package com.collections.set;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class TestNavigable {
	
	public static void main(String[] args) {
		
		
		Vector<String> vector = new Vector<>();
		
		vector.add("cts");
		vector.add("jda");
		vector.add("prokarma");
		vector.add("L&T");
		vector.add("tcs");
		
		
		/*ListIterator<String> listIterator = vector.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}*/
		
	/*	Iterator<String> iterator = vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			iterator.remove();
		}
		
		System.out.println(vector);
	*/	
		/*Enumeration<String> elements = vector.elements();
		
		while(elements.hasMoreElements()) {
			
			System.out.println(elements.nextElement());
		}*/
		
		
/*		for (String value : vector) {
			System.out.println(value);
		}
*/		
		//System.out.println(vector);
		
		
		/*TreeSet<Integer> set = new TreeSet<>();
		
		set.add(15);
		set.add(10);
		set.add(25);
		set.add(7);
		set.add(35);
		set.add(1);
		set.add(12);
		
		System.out.println(set);
		
		System.out.println(set.headSet(15,false));
*/		
		
	}

}
