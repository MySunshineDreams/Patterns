package com.sunshine.patterns.memento;

import java.util.Stack;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/30.
 * 备忘录模式——负责人
 */
public class Responsibility {
    private Stack<Memento> mementoStack = new Stack<Memento>();

    public Memento getMemento() {
        if (mementoStack.capacity() == 1) {
            System.out.println("undo forbidden");
            return new Memento("begin", 0, 0);
        } else {
            mementoStack.pop();
            return mementoStack.pop();
        }
    }

    public void setMemento(Memento memento) {
        mementoStack.push(memento);
    }
}
