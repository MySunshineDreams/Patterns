package com.sunshine.patterns.factory.simple;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 简单抽象工厂模式——具体产品
 */
public class WholeGroup extends Group {
	@Override
	public void select() {
		System.out.println("Focusing on group failed, change to whole group");
	}
}
