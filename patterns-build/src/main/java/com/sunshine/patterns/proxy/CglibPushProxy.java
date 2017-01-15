package com.sunshine.patterns.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/11 0011.
 * 代理模式——代理
 */
public class CglibPushProxy implements MethodInterceptor {

	private Enhancer enhancer = new Enhancer();

	public Push intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		return (Push) methodProxy.invokeSuper(o, objects);
	}

	public Push getProxy(Class<?> clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return (Push) enhancer.create();
	}
}
