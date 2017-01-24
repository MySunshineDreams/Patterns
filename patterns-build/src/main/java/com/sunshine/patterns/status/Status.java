package com.sunshine.patterns.status;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/23.
 * 状态模式——抽象状态
 */
public abstract class Status {
    protected Account account;

    public Status(Account account) {
        this.account = account;
    }

    public abstract void deposit(Double amount);
    public abstract void withdrawal(Double amount);
    public abstract void checkStatus();
}
