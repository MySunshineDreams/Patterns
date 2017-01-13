package com.sunshine.patterns.facade.abstractFacde;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 外观模式——子系统
 */
public class Message {

	public void message(String type) {
		switch (type) {
			case "Android":
				System.out.println("It is a message belongs to android");
				break;
			case "iOS":
				System.out.println("It is a message belongs to iOS");
				break;
			case "winPhone":
				System.out.println("It is a message belongs to winPhone");
				break;
			default:
				break;
		}
	}
}
