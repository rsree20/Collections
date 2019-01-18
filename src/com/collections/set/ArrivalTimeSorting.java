package com.collections.set;

import java.util.Comparator;

public class ArrivalTimeSorting implements Comparator<RedBus>{

	@Override
	public int compare(RedBus bus1, RedBus bus2) {
		// TODO Auto-generated method stub
		int arrivalTimeBasedResult = bus1.getArrivalTime().compareTo(bus2.getArrivalTime());
		
		if(arrivalTimeBasedResult == 0) {
			return bus1.getServiceNo().compareTo(bus2.getServiceNo());
		}else {
			return arrivalTimeBasedResult;
		}
	}
	
	

}
