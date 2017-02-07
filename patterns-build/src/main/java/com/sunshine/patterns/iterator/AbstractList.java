package com.sunshine.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/25.
 * 迭代器模式——抽象聚合
 */
public abstract class AbstractList {
    protected List<Object> list = new ArrayList<Object>();

    public AbstractList(List list) {
        this.list = list;
    }

    public void add(Object o) {
        this.list.add(o);
    }

    public void remove(Object o) {
        this.list.remove(o);
    }

    public void remove(int i) {
        this.list.remove(i);
    }

    public Object get(int i) {
        return this.list.get(i);
    }

    public List<Object> all() {
        return list;
    }

    public abstract AbstractIterator iterator();
}
