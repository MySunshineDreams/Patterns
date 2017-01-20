package com.sunshine.patterns.decorator;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 装饰模式——具体构件
 */
public class FullAmountPush extends Push {
	@Override
	public void send() {
		System.out.println("full amount push task");
	}
}
