package com.sunshine.patterns.observer;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 */
public class ObserverTest {
	public static void main(String[] args) {
		observerTest();
	}

	private static void observerTest() {
		try {
			Consumer consumerOne = new AndroidMessageConsumer();
			Consumer consumerTwo = new IOSMessageConsumer();
			Producer producer = new MessageProducer();
			producer.addObserver(consumerOne);
			producer.addObserver(consumerTwo);
			producer.produce();
			producer.removeObserver(consumerTwo);
			producer.produce();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
