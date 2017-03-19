package com.sunshine.patterns.status;

/**
 * Created by <sunshine> mysunshinedreams@163.com 2017/1/24.
 * 状态模式测试
 */
public class StatusTest {
    public static void main(String[] args) {
        statusTest();
    }

    private static void statusTest() {
        try {
            Account account = new Account();
            account.setAmount(0);
            account.setStatus(new NormalStatus(account));
            account.deposit(2000.0);
            account.withdrawal(20000.0);
            account.withdrawal(1000.0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
