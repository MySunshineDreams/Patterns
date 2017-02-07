package com.sunshine.patterns.status;

/**
 * Created by <sunshine> mysunshinedreams@163.com on 2017/1/23.
 */
public class OverdraftStatus extends Status {
    public OverdraftStatus(Account account) {
        super(account);
    }

    @Override
    public void deposit(Double amount) {
        System.out.println("depositing, the number is ".concat(String.valueOf(amount)));
        account.setAmount(account.getAmount() + amount);
        checkStatus();
    }

    @Override
    public void withdrawal(Double amount) {
        System.out.println("withdrawaling, the number is ".concat(String.valueOf(amount)));
        account.setAmount(account.getAmount() - amount);
        checkStatus();
    }

    @Override
    public void checkStatus() {
        if (account.getAmount() > 0) {
            account.setStatus(new NormalStatus(account));
        } else if (account.getAmount() < -10000) {
            account.setStatus(new ForbidStatus(account));
        }
    }
}
