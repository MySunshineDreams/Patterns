package com.sunshine.patterns.visitor;

import java.util.Date;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/31.
 * 访问者模式——抽象元素
 */
public abstract class Book {
    protected Integer bookNo;
    protected String bookName;
    protected Date date;

    public Book(Integer bookNo, String bookName, Date date) {
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.date = date;
    }

    public Integer getBookNo() {
        return bookNo;
    }

    public void setBookNo(Integer bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract void accept(Vistor vistor);
}
