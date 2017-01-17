package com.sunshine.patterns.bridge;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 桥接模式测试
 */
public class BridgeTest {
	public static void main(String[] args) {
		bridgeTest();
	}
	
	private static void bridgeTest() {
		try {
			Group group = new TeenageGroup();
			Push fullAmountPush = new FullAmountPush();
			Push appointPush = new AppointPush();
			Push districtPush = new DistrictPush();
			// teeanage group测试
			fullAmountPush.setGroup(group);
			appointPush.setGroup(group);
			districtPush.setGroup(group);
			fullAmountPush.push();
			appointPush.push();
			districtPush.push();
			// adult group测试
			group = new AdultGroup();
			fullAmountPush.setGroup(group);
			appointPush.setGroup(group);
			districtPush.setGroup(group);
			fullAmountPush.push();
			appointPush.push();
			districtPush.push();
			// elder group测试
			group = new ElderGroup();
			fullAmountPush.setGroup(group);
			appointPush.setGroup(group);
			districtPush.setGroup(group);
			fullAmountPush.push();
			appointPush.push();
			districtPush.push();
 		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
