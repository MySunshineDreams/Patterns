package com.sunshine.patterns.factory.abstractFactory;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 抽象工厂模式——具体产品
 */
public class AppointPush extends Push {
	@Override
	public void send() {
		System.out.println("appint push task");
	}
}
