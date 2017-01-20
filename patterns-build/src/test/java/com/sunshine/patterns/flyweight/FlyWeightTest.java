package com.sunshine.patterns.flyweight;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 享元模式测试
 */
public class FlyWeightTest {
	public static void main(String[] args) {
		flyWeightTest();
	}
	
	private static void flyWeightTest() {
		try {
			MacbookFactory factory = MacbookFactory.getInstance();
			// 获取两个13寸的macbook
			Macbook thirteenSizeMacbookOne = MacbookFactory.getMacbook("13");
			Macbook thirteenSizeMacbookTwo = MacbookFactory.getMacbook("13");
			// 获取两个15寸的macbook
			Macbook fifteenSizeMacbookOne = MacbookFactory.getMacbook("15");
			Macbook fifteenSizeMacbookTwo = MacbookFactory.getMacbook("15");
			// 两两比较对象
			System.out.println(thirteenSizeMacbookOne == thirteenSizeMacbookTwo);
			System.out.println(fifteenSizeMacbookOne == fifteenSizeMacbookTwo);
			// 生产
			thirteenSizeMacbookOne.produceMacbook("grey");
			thirteenSizeMacbookTwo.produceMacbook("silver");
			fifteenSizeMacbookOne.produceMacbook("grey");
			fifteenSizeMacbookTwo.produceMacbook("silver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
