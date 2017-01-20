package com.sunshine.patterns.decorator;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 装饰模式——抽象装饰
 */
public abstract class Message extends Push {
	
	private Push push;
	
	public Message(Push push) {
		this.push = push;
	}
	
	@Override
	public void send() {
		push.send();
	}
}
