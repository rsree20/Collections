package com.collections.set;

import java.util.Comparator;

public class NameBasedSorting implements Comparator<RedBus>{

	@Override
	public int compare(RedBus bus1, RedBus bus2) {
		// TODO Auto-generated method stub
		int nameBasedResult = bus1.getServiceName().compareTo(bus2.getServiceName());
		
		if(nameBasedResult == 0) {
			return bus1.getServiceNo().compareTo(bus2.getServiceNo());
		}else {
			return nameBasedResult;
		}
	}
	
	

}
