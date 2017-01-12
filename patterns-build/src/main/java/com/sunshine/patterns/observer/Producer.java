package com.sunshine.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/12 0012.
 * 观察者模式——抽象主题
 */
public abstract class Producer {

	protected List<Consumer> observerList = new ArrayList<Consumer>();

	public void addObserver(Consumer consumer) {
		observerList.add(consumer);
	}

	public void removeObserver(Consumer consumer) {
		observerList.remove(consumer);
	}

	public abstract void produce();
}
