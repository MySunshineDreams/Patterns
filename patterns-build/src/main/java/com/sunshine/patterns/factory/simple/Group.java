package com.sunshine.patterns.factory.simple;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 简单工厂模式——抽象产品
 */
public abstract class Group {

	public void before() {
		System.out.println("Selecting group...");
	}

	public void after() {
		System.out.println("done");
	}

	public abstract void select();
}
