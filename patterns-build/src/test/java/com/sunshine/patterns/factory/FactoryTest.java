package com.sunshine.patterns.factory;

import com.sunshine.patterns.factory.factory.*;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 工厂模式测试
 */
public class FactoryTest {

	public static void main(String[] args) {
		factoryTest();
	}

	private static void factoryTest() {
		try {
			GroupFactory factory = null;
			Group group = null;
			factory = new TeenageGroupFactory();
			group = factory.getGroup();
			group.before();
			group.select();
			group.after();
			factory = new AdultGroupFactory();
			group = factory.getGroup();
			group.before();
			group.select();
			group.after();
			factory = new ElderGroupFactory();
			group = factory.getGroup();
			group.before();
			group.select();
			group.after();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
