package com.sunshine.patterns.interpreter;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/6/22.
 * 解释器模式——抽象非终结表达式
 */
public abstract class OperationExpression extends Expression {
	protected Expression left;
	protected Expression right;
	
	public OperationExpression() {
	
	}
	
	public OperationExpression(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}
}
