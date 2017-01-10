package com.sunshine.patterns.singleton;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/10 0010.
 * 单例模式——饿汉模式
 */
public class HungrySingleton {

	private static HungrySingleton hungrySingleton = new HungrySingleton();

	private HungrySingleton() {

	}

	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}
}
