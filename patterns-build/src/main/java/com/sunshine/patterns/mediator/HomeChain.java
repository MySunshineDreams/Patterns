package com.sunshine.patterns.mediator;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/29.
 */
public class HomeChain extends Mediator {
    @Override
    public void notification(String request) {
        System.out.println("Matching...");
        for (Person person : personList) {
            if ((null != person.getMessage()) && (person.getMessage().contains(request))) {
                System.out.println("Dear " + person.getName() + ", a quality housing is meeting your requirements, the address has already send to your telephone.");
            }
        }
    }
}
