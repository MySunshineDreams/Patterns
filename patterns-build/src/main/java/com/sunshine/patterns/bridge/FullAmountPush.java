package com.sunshine.patterns.bridge;

/**
 * Created by sks on 2017/1/17 0017.
 * 桥接模式——扩展抽象类
 */
public class FullAmountPush extends Push {
	@Override
	public void push() {
		System.out.println("full amount push to the group which the name is ".concat(group.group()));
	}
}
