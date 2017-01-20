package com.sunshine.patterns.status;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 状态模式——抽象状态
 */
public abstract class State {
	public abstract void deposit(Double value);
	
	public abstract void withdrawal(Double value);
}
