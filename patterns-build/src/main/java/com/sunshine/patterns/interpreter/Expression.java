package com.sunshine.patterns.interpreter;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/6/22.
 * 解释器模式——抽象表达式
 */
public abstract class Expression {
	
	public abstract int interpreter(Context context);
}
