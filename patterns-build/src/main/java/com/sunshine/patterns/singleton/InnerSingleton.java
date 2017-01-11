package com.sunshine.patterns.singleton;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/11 0011.
 * 单例模式——内部实现
 */
public class InnerSingleton {

	private InnerSingleton() {

	}

	public static InnerSingleton getInstance() {
		return Singleton.innerSingleton;
	}

	private static class Singleton {
		private final static InnerSingleton innerSingleton = new InnerSingleton();
	}

}
