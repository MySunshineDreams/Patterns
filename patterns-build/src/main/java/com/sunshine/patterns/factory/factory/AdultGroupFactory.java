package com.sunshine.patterns.factory.factory;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 工厂模式——具体工厂
 */
public class AdultGroupFactory extends GroupFactory {
	@Override
	public Group getGroup() {
		return new AdultGroup();
	}
}
