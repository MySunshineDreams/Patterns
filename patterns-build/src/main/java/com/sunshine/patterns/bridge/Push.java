package com.sunshine.patterns.bridge;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 桥接模式——抽象类
 */
public abstract class Push {
	protected Group group;
	
	public void setGroup(Group group) {
		this.group = group;
	}
	
	public abstract void push();
}
