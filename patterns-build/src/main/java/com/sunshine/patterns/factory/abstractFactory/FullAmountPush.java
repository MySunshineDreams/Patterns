package com.sunshine.patterns.factory.abstractFactory;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 */
public class FullAmountPush extends Push {
	@Override
	public void send() {
		System.out.println("full amount push task");
	}
}
