package com.sunshine.patterns.mediator;


/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/29.
 * 中介者模式——抽象同事
 */
public abstract class Person {
    protected Mediator mediator;
    protected String name;
    protected String message;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public abstract void lease(String request);

    public abstract void looking(String request);
}
