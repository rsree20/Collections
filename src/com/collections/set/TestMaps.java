package com.collections.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public class TestMaps {
	
	public static void main(String[] args) {
		
		
		
		Map<StringBuffer, String> map = new WeakHashMap<>();
		
		map.put(new StringBuffer("hello"), "100");
		map.put(new StringBuffer("hi"), "101");
		
		System.gc();
		
		System.out.println(map);
		
		
		/*Map<Integer, String> map = new Hashtable<>();
		
		map.put(101, null);
		map.put(102, "Prem");
		map.put(103, "Sandeep");
		map.put(104, "Santosh");
		
		
		
		System.out.println(map);
		*/
		/*
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		for (Entry<Integer, String> entry : entrySet) {
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
*/		
		/*Collection<String> values = map.values();
		
		for (String value : values) {
			System.out.println(value);
		}
		*/
		/*Set<Integer> keySet = map.keySet();
		
		for (Integer key : keySet) {
			
			System.out.println(key);
		}*/
	}

}
