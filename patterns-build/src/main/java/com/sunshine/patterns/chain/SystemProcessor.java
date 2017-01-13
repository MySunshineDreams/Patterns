package com.sunshine.patterns.chain;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 */
public class SystemProcessor extends Processor {
	@Override
	public void processRequest(Request request) {
		if((StringUtils.isNotBlank(request.getChannel())) && (StringUtils.isNotBlank(request.getMessage()))){
			request.setSystem("all");
			System.out.println("system choosing...");
			System.out.println("sending");
			System.out.println("success, over");
		}
	}
}
