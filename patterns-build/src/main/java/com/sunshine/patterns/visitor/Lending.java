package com.sunshine.patterns.visitor;

import java.util.Date;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/31.
 * 访问者模式——具体元素
 */
public class Lending extends Book {
    public Lending(Integer bookNo, String bookName, Date date) {
        super(bookNo, bookName, date);
    }

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }
}
