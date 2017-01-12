package com.sunshine.patterns.observer;

/**
 * Created by sks on 2017/1/12 0012.
 * 观察者模式——具体主题
 */
public class MessageProducer extends Producer {
	@Override
	public void produce() {
		for (Consumer consumer : observerList) {
			consumer.send();
		}
	}
}
