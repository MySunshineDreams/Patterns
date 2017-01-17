package com.sunshine.patterns.builder;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 建造者模式测试
 */
public class builderTest {
	
	public static void main(String[] args) {
		buidlerTest();
	}
	
	private static void buidlerTest() {
		try {
			Director director = new Director(new FullAmountMessageBuilder());
			director.construct();
			director = new Director(new AppointMessageBuilder());
			director.construct();
			director = new Director(new DistrictMessageBuilder());
			director.construct();
			FullAmountDiretor fullAmountDiretor = new FullAmountDiretor();
			AppointDirector appointDirector = new AppointDirector();
			DistrictDirector districtDirector = new DistrictDirector();
			fullAmountDiretor.construct();
			appointDirector.construct();
			districtDirector.construct();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
