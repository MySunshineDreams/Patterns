package com.sunshine.patterns.bridge;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 桥接模式——具体接口类
 */
public class ElderGroup implements Group {
	@Override
	public String group() {
		return "elder group";
	}
}
