package com.collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TestConcurrent extends Thread {

	static Map<Integer, String> map = new ConcurrentHashMap<>();

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int key = 1000; key <= 1010; key++) {
			map.put(key, "hello");
			System.out.println("added.. " + key);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		map.put(50, "hi");
		map.put(57, "hello");
		map.put(52, "raju");
		map.put(55, "prem");

		TestConcurrent test = new TestConcurrent();
		test.start();

		Set<Entry<Integer, String>> entrySet = map.entrySet();

		for (Entry<Integer, String> entry : entrySet) {

			System.out.println("read.. "+entry.getKey());
			Thread.sleep(1000 * 5);
		}

	}

}
