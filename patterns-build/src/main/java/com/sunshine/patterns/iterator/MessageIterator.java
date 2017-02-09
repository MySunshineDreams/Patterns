package com.sunshine.patterns.iterator;

import java.util.List;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/25.
 * 迭代器模式——具体迭代
 */
public class MessageIterator implements AbstractIterator {
    private MessageList messageList;
    private List messages;
    private int head;
    private int tail;

    public MessageIterator(MessageList messageList) {
        this.messageList = messageList;
        this.messages = messageList.all();
        this.head = -1;
        this.tail = messages.size() - 1;
    }

    @Override
    public Object next() {
        if (head < messages.size()) {
            head++;
        }
        return messageList.get(head);
    }

    @Override
    public boolean isLast() {
        return (head == messages.size() - 1);
    }

    @Override
    public Object previous() {
        if (tail > -1) {
            tail--;
        }
        return messageList.get(tail);
    }

    @Override
    public boolean isFirst() {
        return (tail == 0);
    }
}
