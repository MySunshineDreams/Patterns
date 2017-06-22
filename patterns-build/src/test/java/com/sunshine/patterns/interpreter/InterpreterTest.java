package com.sunshine.patterns.interpreter;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/6/22.
 * 解释器模式测试
 */
public class InterpreterTest {
	public static void main(String[] args) {
		Context context = new Context();
		context.put("a", 9);
		context.put("b", 8);
		context.put("c", 7);
		context.put("d", 6);
		context.put("e", 5);
		
		// (9 + 8 - 7) * 6 / 5
		Expression addOperationExpression = new AddOperationExpression(new ValueExpression(context.get("a")), new ValueExpression(context.get("b")));
		Expression minusOperationExpression = new MinusOperationExpression(addOperationExpression, new ValueExpression(context.get("c")));
		Expression multiplyOperationExpression = new MultiplyOperationExpression(minusOperationExpression, new ValueExpression(context.get("d")));
		Expression divideOperationExpression = new DivideOperationExpression(multiplyOperationExpression, new ValueExpression(context.get("e")));
		System.out.println(divideOperationExpression.interpreter(context));
	}
}
