package com.sunshine.patterns.interpreter;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/6/22.
 * 解释器模式——终结表达式
 */
public class ValueExpression extends Expression{

	private Integer i;
	
	public Integer getI() {
		return i;
	}
	
	public void setI(Integer i) {
		this.i = i;
	}
	
	public ValueExpression(Integer i) {
		this.i = i;
	}
	
	@Override
	public int interpreter(Context context) {
		return this.i;
	}
}
