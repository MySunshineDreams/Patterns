package com.sunshine.patterns.chain;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 责任链模式——请求类
 */
public class Request {
	private String message;
	private String channel;
	private String system;

	public Request(String message, String channel, String system) {
		this.message = message;
		this.channel = channel;
		this.system = system;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String toString() {
		return "channel: " + channel + ", message: " + message + "system: " + system;
	}
}
