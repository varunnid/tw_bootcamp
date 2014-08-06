package com.tw.bootcamp.akshay_jitendra.paperboy;

/**
 * Created by akshaydewan on 05/08/14.
 */
public class Customer {
    private  Wallet wallet;
    private  String name;

    public Customer(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public boolean pay(int fee) {
        try {
            wallet.withdraw(fee);
            return  true;
        } catch (InsufficientFundException e) {
            return  false;
        }
    }
}
