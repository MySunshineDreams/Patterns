package com.sunshine.patterns.status;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/23.
 * 状态模式——环境类
 */
public class Account {
    private Status status;
    private double amount;

    public Account() {

    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(Double amount) {
        status.deposit(amount);
        System.out.println("The account's amount is ".concat(String.valueOf(amount)).concat(" now."));
        System.out.println("The account's status is ".concat(this.status.getClass().getName()));
    }

    public void withdrawal(Double amount) {
        status.withdrawal(amount);
        System.out.println("The account's amount is ".concat(String.valueOf(amount)).concat(" now."));
        System.out.println("The account's status is ".concat(this.status.getClass().getName()));
    }
}
