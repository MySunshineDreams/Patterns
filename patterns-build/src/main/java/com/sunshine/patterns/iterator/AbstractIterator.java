package com.sunshine.patterns.iterator;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/25.
 * 迭代器模式——抽象迭代
 */
public interface AbstractIterator {
    public Object next();

    public boolean isLast();

    public Object previous();

    public boolean isFirst();
}