package com.sunshine.patterns.strategy.ConcreteStrategy;

import com.sunshine.patterns.strategy.Strategy.Push;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/10 0010.
 * 策略模式——具体策略
 */
public class FullAmountPush implements Push{

	@Override
	public void push() {
		System.out.println("Full amount push task");
	}
}
