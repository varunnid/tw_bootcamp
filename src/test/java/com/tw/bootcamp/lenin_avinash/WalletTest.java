package com.tw.bootcamp.lenin_avinash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    @Test
    public void shouldAddMoney() {
        Wallet wallet = new Wallet(new Money(100d));
        Money addedMoney = wallet.addMoney(200d);
        assertEquals(300d,addedMoney.getValue(),0);
    }

    @Test(expected=IllegalArgumentException.class)
    public void shouldNotTakeMoneyIfAskedForExcess() throws InsufficientBalanceException {
        Wallet wallet = new Wallet(new Money(100d));
        wallet.takeMoney(200d);
    }

    @Test
    public void shouldTakeMoney() throws InsufficientBalanceException {
        Wallet wallet = new Wallet(new Money(200d));
        Money takenMoney = wallet.takeMoney(100d);
        assertEquals(100d,takenMoney.getValue(),0);
    }
}