package com.sunshine.patterns.clone;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 */
public class Message implements Cloneable {
	private String title;
	private String content;
	private String date;

	public Message clone() {
		Object obj;
		try {
			obj = super.clone();
			return (Message) obj;
		} catch (CloneNotSupportedException e) {
			System.out.println("消息暂时不支持复制");
			return null;
		}

	}

	public void message() {
		System.out.println("title: " + title + "content: " + content + "date: " + date);
	}

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

	public String getDate() {
		return date;
	}

	public void setData(String date) {
		this.date = date;
	}
}
