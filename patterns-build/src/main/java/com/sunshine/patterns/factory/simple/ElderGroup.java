package com.sunshine.patterns.factory.simple;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 简单工厂模式——具体产品
 */
public class ElderGroup extends Group {

	@Override
	public void select() {
		System.out.println("focus on elder");
	}
}
