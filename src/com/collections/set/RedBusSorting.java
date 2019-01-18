package com.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class RedBusSorting {
	
	public static void main(String[] args) {
		
		RedBus bus1 =  new RedBus(3001, "Kesineni",   "8pm",    "5.30am", "1000");
		RedBus bus2 =  new RedBus(2001, "Orange",     "9pm",    "6.30am", "1200");
		RedBus bus3 =  new RedBus(1001, "Jabbar",     "7pm",    "5.30am", "1000");
		RedBus bus4 =  new RedBus(4001, "SriKrishna", "8.30pm", "8am",     "1500");
		
		
		Set<RedBus> set = new TreeSet<>(new ArrivalTimeSorting());
		
		set.add(bus1);
		set.add(bus2);
		set.add(bus3);
		set.add(bus4);
		
		System.out.println(set);
	}

}
