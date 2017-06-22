package com.sunshine.patterns.template;


/**
 * Created by sunshine on 2017/6/20.
 * 模板方法模式测试
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template androidMessagePush = new AndroidMessagePush();
        androidMessagePush.message();
        Template iOSNotificationPush = new IOSNotificationPush();
        iOSNotificationPush.message();
    }
}
