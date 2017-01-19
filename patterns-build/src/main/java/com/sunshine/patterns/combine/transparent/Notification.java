package com.sunshine.patterns.combine.transparent;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/19 0019.
 * 组合模式——透明组合模式——抽象构件
 */
public abstract class Notification {
	
	public abstract void notification();
	public abstract Notification getChild(int i);
	public abstract void add(Notification notification);
	public abstract void remove(Notification notification);
}
