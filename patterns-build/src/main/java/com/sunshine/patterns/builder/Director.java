package com.sunshine.patterns.builder;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 建造者模式——指挥者
 */
public class Director {
	
	private MessageBuilder messageBuilder;
	
	public Director(MessageBuilder messageBuilder) {
		this.messageBuilder = messageBuilder;
	}
	
	public MessageBuilder construct() {
		messageBuilder.buildTitle();
		messageBuilder.buildContent();
		messageBuilder.buildOs();
		messageBuilder.buildMethod();
		return messageBuilder;
	}
}
