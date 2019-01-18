package com.collections.set;

import java.util.Comparator;

public class IntegerDescendingSorting implements Comparator<Integer>{

	@Override
	public int compare(Integer x, Integer y) {
		// TODO Auto-generated method stub
		// return (x < y) ? 1 : ((x == y) ? 0 : -1);
		
		if(x >50 && y>50) {
		return -x.compareTo(y);
		}else
		{
			return x.compareTo(y);	
		}
	}
	

}
