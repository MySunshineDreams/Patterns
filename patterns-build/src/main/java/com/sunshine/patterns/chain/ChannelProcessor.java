package com.sunshine.patterns.chain;


import org.apache.commons.lang3.StringUtils;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 责任链模式——具体处理者
 */
public class ChannelProcessor extends Processor {
	@Override
	public void processRequest(Request request) {
		if ((StringUtils.isBlank(request.getMessage())) && (StringUtils.isBlank(request.getSystem()))) {
			request.setChannel("the third party");
			System.out.println("channel selecting...");
		}
		this.processor.processRequest(request);
	}
}
