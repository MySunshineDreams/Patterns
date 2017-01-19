package com.sunshine.patterns.combine.transparent;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/19 0019.
 * 组合模式——透明组合模式——叶子构件
 */
public class Ant extends Notification {
	
	private String name;
	
	public Ant(String name) {
		this.name = name;
	}
	
	@Override
	public void notification() {
		System.out.println("notifying employees".concat(this.name).concat(" in transparency"));
	}
	
	@Override
	public Notification getChild(int i) {
		System.out.println("invalid");
		return null;
	}
	
	@Override
	public void add(Notification notification) {
		System.out.println("invalid");
	}
	
	@Override
	public void remove(Notification notification) {
		System.out.println("invalid");
	}
}
