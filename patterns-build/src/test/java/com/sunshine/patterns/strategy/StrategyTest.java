package com.sunshine.patterns.strategy;

import com.sunshine.patterns.strategy.ConcreteStrategy.AppointPush;
import com.sunshine.patterns.strategy.ConcreteStrategy.DistrictPush;
import com.sunshine.patterns.strategy.ConcreteStrategy.FullAmountPush;
import com.sunshine.patterns.strategy.Context.PushContext;
import com.sunshine.patterns.strategy.Strategy.Push;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/10 0010.
 */
public class StrategyTest {

	public static void main(String[] args) {
		Push push = new FullAmountPush();
		PushContext pushContext = new PushContext(push);
		pushContext.messagePush();
		push = new AppointPush();
		pushContext = new PushContext(push);
		pushContext.messagePush();
		push = new DistrictPush();
		pushContext = new PushContext(push);
		pushContext.messagePush();
	}
}
