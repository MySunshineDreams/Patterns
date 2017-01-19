package com.sunshine.patterns.combine;


import com.sunshine.patterns.combine.transparent.Ant;
import com.sunshine.patterns.combine.transparent.Department;
import com.sunshine.patterns.combine.transparent.Notification;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/19 0019.
 * 组合模式测试
 */
public class CombineTest {
	public static void main(String[] args) {
		transparentCombineTest();
		safeCombineTest();
	}
	
	private static void transparentCombineTest() {
		try {
			Notification employeeOne = new Ant("sunshine_6324");
			Notification employeeTwo = new Ant("sunshine_443");
			Notification employeeThree = new Ant("sunshine_4396");
			Notification department = new Department("Director");
			department.add(employeeOne);
			department.add(employeeTwo);
			department.notification();
			employeeThree.notification();
			department.add(employeeThree);
			department.notification();
			department.remove(employeeOne);
			department.notification();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void safeCombineTest() {
		try {
			com.sunshine.patterns.combine.safety.Ant employeeOne = new com.sunshine.patterns.combine.safety.Ant("sunshine_6324");
			com.sunshine.patterns.combine.safety.Ant employeeTwo = new com.sunshine.patterns.combine.safety.Ant("sunshine_443");
			com.sunshine.patterns.combine.safety.Ant employeeThree = new com.sunshine.patterns.combine.safety.Ant("sunshine_4396");
			com.sunshine.patterns.combine.safety.Department department = new com.sunshine.patterns.combine.safety.Department("Director");
			department.add(employeeOne);
			department.add(employeeTwo);
			department.notification();
			employeeThree.notification();
			department.add(employeeThree);
			department.notification();
			department.remove(employeeOne);
			department.notification();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
