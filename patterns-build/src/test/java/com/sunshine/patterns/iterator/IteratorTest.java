package com.sunshine.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/2/9 0009.
 * 迭代器模式测试
 */
public class IteratorTest {
	public static void main(String[] args) {
		iteratorTest();
	}
	
	private static void iteratorTest() {
		try {
 			AbstractList abstractList = new MessageList(new ArrayList<Object>());
			abstractList.add("Hi");
			abstractList.add("This is the testing for Iterator");
			abstractList.add(4396);
			AbstractIterator abstractIterator = abstractList.iterator();
			System.out.println(abstractList.get(2));
			abstractList.remove(2);
			System.out.println(abstractIterator.next());
			System.out.println(abstractIterator.previous());
			System.out.println(abstractIterator.isFirst());
			abstractIterator.next();
			System.out.println(abstractIterator.isLast());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
