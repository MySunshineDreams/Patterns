package com.sunshine.patterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/29.
 * 中介者模式——抽象中介
 */
public abstract class Mediator {
    protected List<Person> personList = new ArrayList<Person>();

    public void register(Person person) {
        personList.add(person);
        person.setMediator(this);
    }
    public abstract void notification(String request);
}
