package com.sunshine.patterns.template;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/31.
 * 模板方法模式——具体模板
 */
public class AndroidMessagePush extends Template {
    @Override
    public void message() {
        super.message();
    }

    @Override
    public void title() {
        if (isNotification()) {
            System.out.println("Android message's title is building");
        }
    }

    @Override
    public void content() {
        System.out.println("Android message's contents building");
    }

    @Override
    public void extraFileds() {
        System.out.println("Android message's extra fields building");
    }

    @Override
    public boolean isTimingPush() {
        return false;
    }

    @Override
    public boolean isNotification() {
        return false;
    }
}
