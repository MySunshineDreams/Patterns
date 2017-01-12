package com.sunshine.patterns.factory.abstractFactory;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 抽象工厂模式——具体工厂
 */
public class AndroidPushFactory extends PushFactory {
	@Override
	public Push getFullAmountPushTask() {
		getAndroidPushFactory();
		return new FullAmountPush();
	}

	@Override
	public Push getAppointPushTask() {
		getAndroidPushFactory();
		return new AppointPush();
	}

	@Override
	public Push getDistrictPushTask() {
		getAndroidPushFactory();
		return new DistrictPush();
	}

	private void getAndroidPushFactory() {
		System.out.println("get Android push factory");
	}
}
