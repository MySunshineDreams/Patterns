package com.sunshine.patterns.pattern;

import com.sunshine.patterns.proxy.*;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/11 0011.
 * 代理模式测试
 */
public class ProxyTest {

	public static void main(String[] args) {
		staticProxyTest();
		jdkProxyTest();
		cglibProxyTest();
	}

	/**
	 * 静态代理模式测试
	 */
	private static void staticProxyTest() {
		AppointPush appointPush = new AppointPush();
		AppointPushProxy appointPushProxy = new AppointPushProxy(appointPush);
		appointPushProxy.appintPush();
	}

	/**
	 * JDK动态代理
	 */
	private static void jdkProxyTest() {
		Push push = new FullAmountPush();
		JDKPushProxy proxy = new JDKPushProxy(push);
		Push pushProxy = (Push) proxy.getProxy();
		pushProxy.push();
		proxy = new JDKPushProxy(new DistrictPush());
		pushProxy = (Push) proxy.getProxy();
		pushProxy.push();
	}

	/**
	 * CGLIB动态代理
	 */
	private static void cglibProxyTest() {
		CglibPushProxy proxy = new CglibPushProxy();
		WebspherePush webspherePush = (WebspherePush) proxy.getProxy(WebspherePush.class);
		webspherePush.push();
		FullAmountPush fullAmountPush = (FullAmountPush) proxy.getProxy(FullAmountPush.class);
		fullAmountPush.push();
	}
}
