package com.sunshine.patterns.proxy;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/11 0011.
 * 代理模式——具体主题
 */
public class DistrictPush implements Push {

	@Override
	public void push() {
		System.out.println("district push task");
	}
}
