package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestCopyList extends Thread {
	
	static List<Integer> list = new CopyOnWriteArrayList<>();
	@Override
	public void run() {
		
		try {
			Thread.sleep(1*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=100;i<=150;i++) {
			list.add(i);
			System.out.println("added "+i);
		}
	}
	
	public static void main(String[] args) {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		TestCopyList test = new TestCopyList();
		test.start();
		
		for (Integer value : list) {
			
			System.out.println("read "+value);
			
			try {
				Thread.sleep(4*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
