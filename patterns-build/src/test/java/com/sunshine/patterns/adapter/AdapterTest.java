package com.sunshine.patterns.adapter;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 */
public class AdapterTest {
	
	public static void main(String[] args) {
		adapterTest();
	}
	
	private static void adapterTest() {
		try {
			SelfMessageAdapter selfMessageAdapter = new SelfMessageAdapter();
			selfMessageAdapter.push();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
