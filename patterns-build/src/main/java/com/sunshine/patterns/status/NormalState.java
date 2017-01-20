package com.sunshine.patterns.status;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 状态模式——具体状态
 */
public class NormalState extends State {
	@Override
	public void deposit(Double value) {
		System.out.println("depositing, the amount is " + value);
	}
	
	@Override
	public void withdrawal(Double value) {
		System.out.println("withdrawaling, the amount is " + value);
	}
}
