package com.sunshine.patterns.combine.safety;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/19 0019.
 * 组合模式——安全组合模式——容器构件
 */
public class Department extends Notification {
	
	private String name;
	private List<Notification> antList;
	
	public Department(String name) {
		this.name = name;
		antList = new ArrayList<Notification>();
	}
	
	@Override
	public void notification() {
		System.out.println("Notifying each employee of Department ".concat(this.name).concat(" safe"));
		for (Notification notification : antList) {
			notification.notification();
		}
	}
	
	public void add(Notification notification) {
		antList.add(notification);
	}
	
	public void remove(Notification notification) {
		antList.remove(notification);
	}
	
	public Notification getChild(int i) {
		return antList.get(i);
	}
}
