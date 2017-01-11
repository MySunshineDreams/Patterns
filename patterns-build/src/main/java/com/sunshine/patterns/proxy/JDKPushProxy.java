package com.sunshine.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/11 0011.
 */
public class JDKPushProxy implements InvocationHandler{

	private Object target;

	public JDKPushProxy(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(target, args);
		return result;
	}

	public Object getProxy() {
		ClassLoader classLoader = target.getClass().getClassLoader();
		// 需要具体的主题角色实现接口
		Class<?>[] interfaces = target.getClass().getInterfaces();
		return Proxy.newProxyInstance(classLoader, interfaces, this);
	}
}
