package com.sunshine.patterns.factory.factory;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 */
public class ElderGroupFactory extends GroupFactory {
	@Override
	public Group getGroup() {
		return new ElderGroup();
	}
}