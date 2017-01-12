package com.sunshine.patterns.factory;

import com.sunshine.patterns.factory.abstractFactory.AndroidPushFactory;
import com.sunshine.patterns.factory.abstractFactory.IOSPushFactory;
import com.sunshine.patterns.factory.abstractFactory.Push;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 抽象工厂模式测试
 */
public class AbstractFactoryTest {

	public static void main(String[] args) {
		abstractFactoryTest();
	}

	private static void abstractFactoryTest() {
		try {
			Push push = null;
			AndroidPushFactory androidPushFactory = new AndroidPushFactory();
			push = androidPushFactory.getFullAmountPushTask();
			push.send();
			push = androidPushFactory.getAppointPushTask();
			push.send();
			push = androidPushFactory.getDistrictPushTask();
			push.send();
			IOSPushFactory iOSPshFactory = new IOSPushFactory();
			push = iOSPshFactory.getFullAmountPushTask();
			push.send();
			push = iOSPshFactory.getAppointPushTask();
			push.send();
			push = iOSPshFactory.getDistrictPushTask();
			push.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
