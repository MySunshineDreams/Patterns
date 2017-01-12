package com.sunshine.patterns.factory;

import com.sunshine.patterns.factory.simple.Group;
import com.sunshine.patterns.factory.simple.GroupFactory;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 简单抽象工厂模式测试
 */
public class SimpleFactoryTest {

	public static void main(String[] args) {
		simpleFactoryTest();
	}

	private static void simpleFactoryTest() {
		try {
			Group group = GroupFactory.getGroup("teenage");
			group.before();
			group.select();
			group.after();
			group = GroupFactory.getGroup("adult");
			group.before();
			group.select();
			group.after();
			group = GroupFactory.getGroup("elder");
			group.before();
			group.select();
			group.after();
			group = GroupFactory.getGroup("child");
			group.before();
			group.select();
			group.after();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
