package com.sunshine.patterns.proxy;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/11 0011.
 * 代理模式——代理
 */
public class AppointPushProxy implements Push {

	private AppointPush appointPush = new AppointPush();

	@Override
	public void push() {
		System.out.println("gain the device info");
		appointPush.push();
		System.out.println("push task has done");
	}
}
