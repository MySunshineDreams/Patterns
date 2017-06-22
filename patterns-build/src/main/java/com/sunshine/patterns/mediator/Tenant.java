package com.sunshine.patterns.mediator;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/29.
 */
public class Tenant extends Person {
    @Override
    public void lease(String request) {
		
    }

    @Override
    public void looking(String request) {
        this.message = request;
    }
}
