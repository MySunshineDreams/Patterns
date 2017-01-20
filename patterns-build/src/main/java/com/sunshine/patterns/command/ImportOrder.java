package com.sunshine.patterns.command;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 命令模式——具体命令
 */
public class ImportOrder extends Order {
	private ImportGoods importGoods;
	
	public ImportOrder() {
		this.importGoods = new ImportGoods("macbook 15'", 24000.0);
	}
	
	@Override
	public void execute() {
		importGoods.importGoods();
	}
}
