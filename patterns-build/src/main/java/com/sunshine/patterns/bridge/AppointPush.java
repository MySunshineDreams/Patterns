package com.sunshine.patterns.bridge;

/**
 * Created by <sunshine> mysunshinedreams@163.com 2017/1/17 0017.
 * 桥接模式——扩展抽象类
 */
public class AppointPush  extends Push {
	@Override
	public void push() {
		System.out.println("appoint push to the group which the name is ".concat(group.group()));
	}
}
