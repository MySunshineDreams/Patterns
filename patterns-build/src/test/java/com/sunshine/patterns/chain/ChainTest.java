package com.sunshine.patterns.chain;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 责任链模式测试
 */
public class ChainTest {
	public static void main(String[] args) {
		chainTest();
	}

	private static void chainTest() {
		try {
			Processor channel, message, system;
			channel = new ChannelProcessor();
			message = new MessageProcessor();
			system = new SystemProcessor();

			// 创建责任链
			channel.setProcessor(message);
			message.setProcessor(system);

			Request requestOne = new Request("", "", "");
			channel.processRequest(requestOne);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
