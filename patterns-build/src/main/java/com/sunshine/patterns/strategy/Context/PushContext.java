package com.sunshine.patterns.strategy.Context;

import com.sunshine.patterns.strategy.Strategy.Push;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/10 0010.
 * 策略模式——环境类
 */
public class PushContext {
	/**
	 * 生产推送对象
	 */
	private Push push;

	public PushContext(Push push){
		this.push = push;
	}

	/**
	 * 消息推送，环境类无需关注推送类型
	 */
	public void messagePush() {
		push.push();
	}
}
