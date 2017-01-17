package com.sunshine.patterns.builder;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 建造者模式——指挥者
 */
public class AppointDirector {
	
	private AppointMessageBuilder appointMessageBuilder = new AppointMessageBuilder();
	
	public AppointMessageBuilder construct() {
		appointMessageBuilder.buildTitle();
		appointMessageBuilder.buildContent();
		appointMessageBuilder.buildOs();
		appointMessageBuilder.buildMethod();
		return appointMessageBuilder;
	}
}
