package com.sunshine.patterns.facade.abstractFacde;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 外观模式——子系统
 */
public class Send {

	public void send(String type) {
		switch (type) {
			case "personal":
				System.out.println("send message by personal channel");
				break;
			case "third":
				System.out.println("send message by the third party");
				break;
			case "apns":
				System.out.println("send message by the apns");
				break;
			default:
				break;
		}

	}
}
