package com.tw.bootcamp.akshay_jitendra.paperboy;

/**
 * Created by akshaydewan on 05/08/14.
 */
public class Wallet {

    private int value;

    public Wallet(int value) {
        this.value = value;
    }

    public boolean isEmpty() {
        return this.value == 0;
    }

    public int deposit(int amount) {
        this.value += amount;
        return value;
    }

    public int withdraw(int withdrawAmount) throws InsufficientFundException {
        if(this.value < withdrawAmount) {
            throw new InsufficientFundException("Insufficient funds: " + this.value);
        }
        this.value=this.value-withdrawAmount;
        return  this.value;
    }
}
