package com.sunshine.patterns.command;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 命令模式——具体命令
 */
public class ExportOrder extends Order {
	
	private ExportGoods exportGoods;
	
	public ExportOrder() {
		this.exportGoods = new ExportGoods("macbook 15'", 30000.0);
	}
	
	@Override
	public void execute() {
		exportGoods.exportGoods();
	}
}
