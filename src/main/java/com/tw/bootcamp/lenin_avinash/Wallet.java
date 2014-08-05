package com.tw.bootcamp.lenin_avinash;

/**
 * Created by leninraj on 8/5/14.
 */
public class Wallet {

    public Wallet(Money money){
        this.money = money;
    }
    public Money takeMoney(Double value) throws InsufficientBalanceException {
        if(money.getValue() < value)
            throw new InsufficientBalanceException("Insufficient Balance in your wallet!");
        money = new Money(money.getValue() - value);
        return money;
    }

    public Money addMoney(Double value) {
        money = new Money(money.getValue() + value);
        return money;
    }


    public Money money;
}

