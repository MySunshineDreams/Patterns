package com.sunshine.patterns.builder;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/17 0017.
 * 建造者模式——产品角色
 */
public class Message {
	
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String content;
	/**
	 * 操作系统
	 */
	private String os;
	/**
	 * 推送方法
	 */
	private String method;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getOs() {
		return os;
	}
	
	public void setOs(String os) {
		this.os = os;
	}
	
	public String getMethod() {
		return method;
	}
	
	public void setMethod(String method) {
		this.method = method;
	}
}
