package com.sunshine.patterns.factory.abstractFactory;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 抽象工厂模式——抽象工厂
 */
public abstract class PushFactory {
	public abstract Push getFullAmountPushTask();

	public abstract Push getAppointPushTask();

	public abstract Push getDistrictPushTask();
}
