package com.sunshine.patterns.visitor;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/31.
 * 访问者模式——抽象访问者
 */
public abstract class Vistor {
    public abstract void visit(Lending lending);
    public abstract void visit(Returning returning);
}
