package com.sunshine.patterns.facade.abstractFacde;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 外观模式——子系统
 */
public class Group {

	public void group(String type) {
		switch (type) {
			case "full" :
				System.out.println("full amount push task");
				break;
			case "appoint" :
				System.out.println("appiont push task");
				break;
			case "district" :
				System.out.println("district push task");
				break;
			case "label" :
				System.out.println("label push task");
				break;
			default :
				break;
		}
	}
}
