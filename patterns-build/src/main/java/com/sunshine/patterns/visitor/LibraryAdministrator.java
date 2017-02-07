package com.sunshine.patterns.visitor;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/31.
 * 访问者模式——具体访问者
 */
public class LibraryAdministrator extends Vistor {
    @Override
    public void visit(Lending lending) {
        System.out.println("The book " + lending.getBookName() + " will be lent, book's number is " + lending.getBookNo() + " and borrowing date is " + lending.getDate());
        System.out.println("Borrowing period is one month");
    }

    @Override
    public void visit(Returning returning) {
        System.out.println("The book " + returning.getBookName() + " will be returned, book's number is " + returning.getBookNo() + " and returning date is " + returning.getDate());
        System.out.println("No need to pay");
    }
}
