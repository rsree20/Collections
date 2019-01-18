package com.collections.set;

import com.collections.set.Outer.Inner;

public class Test {
	
	public static void main(String[] args) {
		Outer out =new Outer();
		
		Inner i = out.new Inner();
		System.out.println(i.y);
	}
	
}


class Outer {

	int x = 10;

	class Inner {

		int y = 20;
	}

}