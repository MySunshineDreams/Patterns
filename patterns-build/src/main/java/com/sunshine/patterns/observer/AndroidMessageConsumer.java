package com.sunshine.patterns.observer;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 观察者模式——具体观察者
 */
public class AndroidMessageConsumer extends Consumer {
	@Override
	public void send() {
		System.out.println("Channel is sending the message");
	}
}
