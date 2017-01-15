package com.sunshine.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/11 0011.
 * 代理模式——代理
 */
public class JDKPushProxy implements InvocationHandler{

	private Push target;

	public JDKPushProxy(Push target) {
		this.target = target;
	}

	@Override
	public Push invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Push result = (Push) method.invoke(target, args);
		return result;
	}

	public Push getProxy() {
		ClassLoader classLoader = target.getClass().getClassLoader();
		// 需要具体的主题角色实现接口
		Class<?>[] interfaces = target.getClass().getInterfaces();
		return (Push) Proxy.newProxyInstance(classLoader, interfaces, this);
	}
}
