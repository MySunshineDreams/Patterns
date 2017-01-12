package com.sunshine.patterns.factory.simple;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 简单工厂模式——生产工厂
 */
public class GroupFactory {

	public static Group getGroup(String type) {
		Group group;
		switch (type) {
			case "teenage" :
				group = new TeenageGroup();
				break;
			case "adult" :
				group = new AdultGroup();
				break;
			case "elder" :
				group = new ElderGroup();
				break;
			default:
				group = new WholeGroup();
				break;
		}
		return group;
	}
}
