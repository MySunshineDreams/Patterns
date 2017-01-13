package com.sunshine.patterns.facade.abstractFacde;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/13 0013.
 * 外观模式——抽象外观类
 */
public abstract class AbstractPushFacade {

	public abstract void setGroup(String type);

	public abstract void setMessage(String type);

	public abstract void setSend(String type);
}
