package com.sunshine.patterns.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/6/22.
 * 解释器模式——环境类
 */
public class Context {
	private Map<String, Integer> values = new HashMap<String, Integer>();
	
	public void put(String key, Integer value) {
		values.put(key, value);
	}
	
	public Integer get(String key) {
		if (values.containsKey(key)) {
			return values.get(key);
		}
		return 0;
	}
}
