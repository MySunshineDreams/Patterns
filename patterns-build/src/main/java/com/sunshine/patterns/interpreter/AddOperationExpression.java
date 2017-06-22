package com.sunshine.patterns.interpreter;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/6/22.
 * 解释器模式——非终结具体表达式
 */
public class AddOperationExpression extends OperationExpression {
	
	public AddOperationExpression(Expression left, Expression right) {
		super(left, right);
	}
	
	@Override
	public int interpreter(Context context) {
		return this.left.interpreter(context) + this.right.interpreter(context);
	}
}
