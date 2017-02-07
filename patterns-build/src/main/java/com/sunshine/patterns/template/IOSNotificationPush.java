package com.sunshine.patterns.template;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/31.
 * 模板方法模式——具体模板
 */
public class IOSNotificationPush extends Template {
    @Override
    public void message() {
        super.message();
    }

    @Override
    public void title() {
        if (isNotification()) {
            System.out.println("IOS notification;s title building");
        }
    }

    @Override
    public void content() {
        System.out.println("IOS notification's contents building");
    }

    @Override
    public void extraFileds() {
        System.out.println("IOS notification's extra fields building");
    }

    @Override
    public boolean isTimingPush() {
        return true;
    }

    @Override
    public boolean isNotification() {
        return true;
    }
}
