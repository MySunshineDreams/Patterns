package com.sunshine.patterns.decorator;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 装饰模式——具体装饰
 */
public class MessageMessage extends Message {
	public MessageMessage(Push push) {
		super(push);
	}
	
	@Override
	public void send() {
		this.setMessageMessage();
		super.send();
	}
	
	private void setMessageMessage() {
		System.out.println("append title to message's body");
		System.out.println("append content to message's body");
	}
}
