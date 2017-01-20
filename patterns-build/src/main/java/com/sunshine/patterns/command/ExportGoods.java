package com.sunshine.patterns.command;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 命令模式——请求接收
 */
public class ExportGoods {
	private String name;
	private Double price;
	
	public ExportGoods(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public void exportGoods() {
		System.out.println("The commodity's name is ".concat(this.name).concat(" and the price is ").concat(String.valueOf(this.price)));
	}
}
