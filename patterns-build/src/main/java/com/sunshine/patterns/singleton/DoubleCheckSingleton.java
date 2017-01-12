package com.sunshine.patterns.singleton;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/11 0011.
 * 单例模式——双重校验锁
 */
public class DoubleCheckSingleton {

	private volatile static DoubleCheckSingleton doubleCheckSingleton;

	private DoubleCheckSingleton() {

	}

	public static DoubleCheckSingleton getInstance() {
		if (doubleCheckSingleton == null) {
			synchronized (doubleCheckSingleton) {
				if (doubleCheckSingleton == null) {
					doubleCheckSingleton = new DoubleCheckSingleton();
				}
			}
		}
		return doubleCheckSingleton;
	}

	public DoubleCheckSingleton getDoubleCheckSingleton() {
		return doubleCheckSingleton;
	}
}
