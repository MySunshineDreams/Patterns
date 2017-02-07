package com.sunshine.patterns.iterator;

import java.util.List;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/25.
 * 迭代器模式——具体聚合
 */
public class MessageList extends AbstractList {
    public MessageList(List list) {
        super(list);
    }

    @Override
    public AbstractIterator iterator() {
        return new MessageIterator(this);
    }
}
