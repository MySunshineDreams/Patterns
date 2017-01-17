package com.sunshine.patterns.builder;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 建造者模式——抽象建造者
 */
public abstract class MessageBuilder {
	protected Message message = new Message();
	
	public abstract void buildTitle();
	public abstract void buildContent();
	public abstract void buildOs();
	public abstract void buildMethod();
	
	public Message message() {
		return message();
	}
}
