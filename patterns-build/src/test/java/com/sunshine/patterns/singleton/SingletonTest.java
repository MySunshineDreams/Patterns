package com.sunshine.patterns.singleton;

import javax.swing.text.DefaultEditorKit;
import java.lang.reflect.Field;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/10 0010.
 */
public class SingletonTest {

	public static void main(String[] args) {
		//lazySingletonTest();
		//hungrySingletonTest();
		innerSingletonTest();
	}

	private static void lazySingletonTest() {
		try {
			LazySingleton lazySingleton = LazySingleton.getInstantce();
			System.out.println(LazySingleton.getLazySingleton());
			Field[] fields = lazySingleton.getClass().getDeclaredFields();
			for (Field field : fields) {
				field.setAccessible(true);
				System.out.println(field.getName());
				field.set("lazySingleton", null);
			}
			System.out.println(LazySingleton.getLazySingleton());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void hungrySingletonTest() {
		try {
			HungrySingleton hungrySingleton = HungrySingleton.getInstance();
			System.out.println(HungrySingleton.getInstance());
			Field[] fields = HungrySingleton.class.getFields();
			for (Field field : fields) {
				field.setAccessible(true);
				System.out.println(field.getName());
			}
			System.out.println(HungrySingleton.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void innerSingletonTest() {
		try {
			InnerSingleton innerSingleton = InnerSingleton.getInstance();
			System.out.println(innerSingleton);
			Class<?>[] classes = innerSingleton.getClass().getDeclaredClasses();
			for (Class<?> clazz : classes) {
				if (clazz.getName().equals("Singleton")) {
					Field[] fields = clazz.getDeclaredFields();
					for (Field field : fields) {
						field.setAccessible(true);
						System.out.println(field.getName());
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
