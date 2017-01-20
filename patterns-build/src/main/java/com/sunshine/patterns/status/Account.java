package com.sunshine.patterns.status;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/20 0020.
 * 状态模式——环境类
 */
public class Account {
	private State state;
	private double amount;
	
	public Account() {
		this.state = new NormalState();
	}
	
	public void deposit(Double cash) {
		
	}
	
	public void switchState(String accountState) {
		switch (accountState) {
			case Inner.ACCOUNT_NORMAL :
				
				break;
			case Inner.ACCOUNT_OVERDRAFT :
				break;
			case Inner.ACCOUNT_FORBID :
				break;
			default:
				break;
		}
	}
	
	public static class Inner {
		public final static String ACCOUNT_NORMAL = "normal";
		public final static String ACCOUNT_OVERDRAFT = "overdraft";
		public final static String ACCOUNT_FORBID = "forbid";
	}
}
