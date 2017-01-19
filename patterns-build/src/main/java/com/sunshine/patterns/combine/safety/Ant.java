package com.sunshine.patterns.combine.safety;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/19 0019.
 * 组合模式——安全组合模式——叶子构件
 */
public class Ant extends Notification {
	
	private String name;
	
	public Ant(String name) {
		this.name = name;
	}
	
	@Override
	public void notification() {
		System.out.println("has notified ".concat(this.name).concat(" safe"));
	}
}
