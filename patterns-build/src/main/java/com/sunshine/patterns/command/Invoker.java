package com.sunshine.patterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 命令模式——请求发送
 */
public class Invoker {
	
	private List<Order> orderList = new ArrayList<Order>();
	
	public void addOrder(Order order) {
		orderList.add(order);
	}
	
	public void executeOrders() {
		System.out.println("Orders are handling");
		for (Order order : orderList) {
			order.execute();
		}
		System.out.println("Orders have handled");
	}
}
