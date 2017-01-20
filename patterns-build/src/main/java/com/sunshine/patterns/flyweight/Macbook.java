package com.sunshine.patterns.flyweight;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 享元模式——抽象享元
 */
public abstract class Macbook {
	protected String size;
	
	public Macbook(String size) {
		this.size = size;
	}
	
	public void produceMacbook(String color) {
		System.out.println("produce macbook which size is ".concat(this.size).concat(" and size is ".concat(color)));
	}
}
