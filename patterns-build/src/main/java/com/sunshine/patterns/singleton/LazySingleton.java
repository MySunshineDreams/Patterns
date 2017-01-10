package com.sunshine.patterns.singleton;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/10 0010.
 * 单例模式——懒汉模式
 */
public class LazySingleton {

	private static LazySingleton lazySingleton;

	private LazySingleton() {

	}

	public static LazySingleton getInstantce() {
		if(null == lazySingleton) {
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}

	public static LazySingleton getLazySingleton() {
		return lazySingleton;
	}
}
