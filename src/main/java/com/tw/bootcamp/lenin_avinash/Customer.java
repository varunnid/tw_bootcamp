package com.tw.bootcamp.lenin_avinash;

/**
 * Created by leninraj on 8/5/14.
 */
public class Customer {

    private Wallet wallet;

    public Customer(Double value) {
        this.wallet = new Wallet(new Money(value));
    }

    public Double getBalance() {
        return wallet.money.getValue();
    }

    public void giveMoneyToAgent() {
        try {
            this.wallet.takeMoney(1000.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient Balance in your wallet");
        }
    }

}
