package com.sunshine.patterns.chain;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 责任链模式——具体处理者
 */
public class MessageProcessor extends Processor {

	@Override
	public void processRequest(Request request) {
		if((StringUtils.isNotBlank(request.getChannel())) && (StringUtils.isBlank(request.getMessage()))) {
			request.setMessage("message loading...");
			System.out.println("2017年春运大幕正式开启");
		}
		this.processor.processRequest(request);
	}
}
