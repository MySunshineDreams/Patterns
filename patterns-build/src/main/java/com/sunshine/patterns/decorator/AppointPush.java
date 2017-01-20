package com.sunshine.patterns.decorator;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 装饰模式——具体构件
 */
public class AppointPush extends Push {
	@Override
	public void send() {
		System.out.println("appoint push task");
	}
}
