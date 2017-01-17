package com.sunshine.patterns.adapter;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 适配器模式——适配器
 */
public class SelfMessageAdapter implements Message {
	
	private SchemeMessageAdaptee schemeMessageAdaptee;
	private ExtrasMessageAdaptee extrasMessageAdaptee;
	
	public SelfMessageAdapter() {
		schemeMessageAdaptee = new SchemeMessageAdaptee();
		extrasMessageAdaptee = new ExtrasMessageAdaptee();
	}
	
	@Override
	public void push() {
		schemeMessageAdaptee.addScheme();
		extrasMessageAdaptee.addExtras();
		System.out.println("load the message body");
	}
}
