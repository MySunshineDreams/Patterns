package com.sunshine.patterns.builder;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 建造者模式——具体建造者
 */
public class DistrictMessageBuilder extends MessageBuilder {
	@Override
	public void buildTitle() {
		System.out.println("the title of district message");
	}
	
	@Override
	public void buildContent() {
		System.out.println("the content of district message");
	}
	
	@Override
	public void buildOs() {
		System.out.println("the operate system of district message");
	}
	
	@Override
	public void buildMethod() {
		System.out.println("the push method of district message");
	}
}
