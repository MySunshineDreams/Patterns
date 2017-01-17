package com.sunshine.patterns.builder;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 建造者模式——指挥者
 */
public class DistrictDirector {
	
	private DistrictMessageBuilder districtMessageBuilder = new DistrictMessageBuilder();
	
	public DistrictMessageBuilder construct() {
		districtMessageBuilder.buildTitle();
		districtMessageBuilder.buildContent();
		districtMessageBuilder.buildOs();
		districtMessageBuilder.buildMethod();
		return districtMessageBuilder;
	}
}
