package com.sunshine.patterns.builder;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 建造者模式——指挥者
 */
public class FullAmountDiretor {
	
	private FullAmountMessageBuilder fullAmountMessageBuilder = new FullAmountMessageBuilder();
	
	
	public FullAmountMessageBuilder construct() {
		fullAmountMessageBuilder.buildTitle();
		fullAmountMessageBuilder.buildContent();
		fullAmountMessageBuilder.buildOs();
		fullAmountMessageBuilder.buildMethod();
		return fullAmountMessageBuilder;
	}
}
