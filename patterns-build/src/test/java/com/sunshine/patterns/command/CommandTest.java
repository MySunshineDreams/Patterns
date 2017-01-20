package com.sunshine.patterns.command;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 命令模式测试
 */
public class CommandTest {
	public static void main(String[] args) {
		commandTest();
	}
	
	private static void commandTest() {
		try {
			Order importOrder = new ImportOrder();
			Order exportOrder = new ExportOrder();
			Invoker invoker = new Invoker();
			invoker.addOrder(importOrder);
			invoker.addOrder(exportOrder);
			invoker.executeOrders();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
