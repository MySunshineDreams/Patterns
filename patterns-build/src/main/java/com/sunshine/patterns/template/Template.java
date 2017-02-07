package com.sunshine.patterns.template;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/31.
 * 模板方法模式——抽象模板
 */
public abstract class Template {
    /**
     * 调用模板方法
     */
    public void message() {
        title();
        content();
        extraFileds();
        if (isTimingPush()) {
            System.out.println("The message will be sent in the future");
        } else {
            System.out.println("The message is sending");
        }
    }

    public abstract void title();
    public abstract void content();
    public abstract void extraFileds();
    public abstract boolean isTimingPush();
    public abstract boolean isNotification();
}
