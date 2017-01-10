package com.sunshine.patterns.strategy.ConcreteStrategy;

import com.sunshine.patterns.strategy.Strategy.Push;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/10 0010.
 */
public class DistrictPush implements Push {

	@Override
	public void push() {
		System.out.println("District push task");
	}
}
