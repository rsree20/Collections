package com.collections.practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PracticeSet {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>(new IntegerCustomization());
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(15);
		set.add(7);
		
		System.out.println(set);
	}

}

class IntegerCustomization implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		System.out.println(o1+" compared with "+o2);
		return o1.compareTo(o2);
	}
}
/*int x = 10<5? 1000:500;
System.out.println(x);
*/
/*Set<StringBuffer> set = new TreeSet<>(new SBCustomization());
set.add(new StringBuffer("hello"));
set.add(new StringBuffer("hi"));
set.add(new StringBuffer("bye"));
set.add(new StringBuffer("java"));

System.out.println(set);
*/	

class SBCustomization implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer sb1, StringBuffer sb2) {
		
		return -sb1.toString().compareTo(sb2.toString());
	}
	
	
}