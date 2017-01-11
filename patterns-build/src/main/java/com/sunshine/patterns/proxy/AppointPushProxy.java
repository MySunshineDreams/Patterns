package com.sunshine.patterns.proxy;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/11 0011.
 * 精准推送代理
 */
public class AppointPushProxy {

	private AppointPush appointPush;

	public AppointPushProxy(AppointPush appointPush) {
		this.appointPush = appointPush;
	}

	public void appintPush(){
		System.out.println("gain the device info");
		appointPush.push();
		System.out.println("push task has done");
	}
}
