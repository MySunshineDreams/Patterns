package com.sunshine.patterns.facade.abstractFacde;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 */
public class PersonaliseGroup {

	public void group(String type) {
		switch (type) {
			case "teenage":
				System.out.println("teenage level");
				break;
			case "adult":
				System.out.println("adult level");
				break;
			case "elder":
				System.out.println("elder level");
				break;
			default:
				break;
		}
	}
}
