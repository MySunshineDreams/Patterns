package com.sunshine.patterns.factory.abstractFactory;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 抽象工厂模式——具体工厂
 */
public class IOSPushFactory extends PushFactory {
	@Override
	public Push getFullAmountPushTask() {
		getIOSPushFactory();
		return new FullAmountPush();
	}

	@Override
	public Push getAppointPushTask() {
		getIOSPushFactory();
		return new AppointPush();
	}

	@Override
	public Push getDistrictPushTask() {
		getIOSPushFactory();
		return new DistrictPush();
	}

	private void getIOSPushFactory() {
		System.out.println("get iOS push factory");
	}
}
