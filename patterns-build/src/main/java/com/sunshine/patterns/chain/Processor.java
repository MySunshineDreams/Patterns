package com.sunshine.patterns.chain;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 责任链模式——抽象处理者
 */
public abstract class Processor {

	protected Processor processor;

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public abstract void processRequest(Request request);
}
