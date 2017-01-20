package com.sunshine.patterns.decorator;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 装饰模式——具体装饰
 */
public class NotificationMessage extends Message {
	
	public NotificationMessage(Push push) {
		super(push);
	}
	
	@Override
	public void send() {
		this.setNotificationMessage();
		super.send();
	}
	
	private void setNotificationMessage() {
		System.out.println("append title to notification's body");
		System.out.println("append content to notification's body");
	}
}
