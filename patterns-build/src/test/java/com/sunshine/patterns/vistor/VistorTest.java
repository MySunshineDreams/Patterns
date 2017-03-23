package com.sunshine.patterns.vistor;

import com.sunshine.patterns.visitor.*;

import java.util.Date;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/3/19.
 * 访问者模式测试
 */
public class VistorTest {
    public static void main(String[] args) {
        vistorTest();
    }

    private static void vistorTest() {
        try {
            Vistor administrator = new LibraryAdministrator();
            Vistor reader = new PrivateAdministrator();
            Book lending = new Lending(001, "《Head First设计模式》", new Date());
            Book returning = new Returning(001, "《Head First设计模式》", new Date());
            lending.accept(administrator);
            returning.accept(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
