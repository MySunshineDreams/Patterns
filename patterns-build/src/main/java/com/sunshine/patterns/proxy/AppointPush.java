package com.sunshine.patterns.proxy;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/11 0011.
 */
public class AppointPush implements Push{

	@Override
	public void push() {
		System.out.println("appoint push task");
	}
}
