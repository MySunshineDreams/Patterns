package com.sunshine.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 享元模式——工厂
 */
public class MacbookFactory {
	private static MacbookFactory macbook = new MacbookFactory();
	private static Map<String, Macbook> macbookMap;
	
	private MacbookFactory() {
		macbookMap = new HashMap<String, Macbook>();
		Macbook fifteenSizeMacbook = new FifteenSizeMacbook("15");
		Macbook thirteenSizeMacbook = new ThirteenSizeMacbook("13");
		macbookMap.put("13", thirteenSizeMacbook);
		macbookMap.put("15", fifteenSizeMacbook);
	}
	
	public static MacbookFactory getInstance() {
		return macbook;
	}
	
	public static Macbook getMacbook(String size) {
		return macbookMap.get(size);
	}
}
