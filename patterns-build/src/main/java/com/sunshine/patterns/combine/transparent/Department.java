package com.sunshine.patterns.combine.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/19 0019.
 * 组合模式——透明组合模式——容器构件
 */
public class Department extends Notification {
	
	private String name;
	private List<Notification> antList = new ArrayList<Notification>();
	
	public Department(String name) {
		this.name = name;
	}
	
	@Override
	public void notification() {
		System.out.println("Notifying each employees of Department ".concat(this.name).concat(" in transparency"));
		for(Notification notification : antList) {
			notification.notification();
		}
	}
	
	@Override
	public Notification getChild(int i) {
		return antList.get(i);
	}
	
	@Override
	public void add(Notification notification) {
		antList.add(notification);
	}
	
	@Override
	public void remove(Notification notification) {
		antList.remove(notification);
	}
}
