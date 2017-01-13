package com.sunshine.patterns.clone;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 原型模式测试
 */
public class CloneTest {
	public static void main(String[] args) {
		cloneTest();
	}

	private static void cloneTest() {
		Message evening = null;
		try {
			Message model = new Message();
			model.setTitle("早间新闻");
			model.setContent("XXX");
			model.setData("2017-01-13");
			Message noon = model.clone();
			noon.setTitle("午间新闻");
			evening = model.clone();
			evening.setTitle("晚间新闻");
			model.message();
			noon.message();
			evening.message();
			System.out.println(model == noon);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
