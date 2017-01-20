package com.sunshine.patterns.status;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 抽象状态——具体状态
 */
public class OverdraftState extends State {
	@Override
	public void deposit(Double value) {
		System.out.println("deposting, the amount is " + value);
	}
	
	@Override
	public void withdrawal(Double value) {
		System.out.println("withdrawaling, the amount is " + value);
	}
}
