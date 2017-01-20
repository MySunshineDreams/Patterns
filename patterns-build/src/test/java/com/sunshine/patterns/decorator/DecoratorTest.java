package com.sunshine.patterns.decorator;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 装饰模式测试
 */
public class DecoratorTest {
	public static void main(String[] args) {
		decoratorTest();
	}
	
	private static void decoratorTest() {
		try {
			Message notificationMessage = new NotificationMessage(new FullAmountPush());
			notificationMessage.send();
			Message messageMessage = new MessageMessage(new FullAmountPush());
			messageMessage.send();
			notificationMessage = new NotificationMessage(new AppointPush());
			notificationMessage.send();
			messageMessage = new MessageMessage(new AppointPush());
			messageMessage.send();
		} catch (Exception e) {
			e.printStackTrace();
		}
 	}
}
