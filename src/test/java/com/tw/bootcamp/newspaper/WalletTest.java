package com.tw.bootcamp.newspaper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/5/14
 * Time: 11:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class WalletTest {

    @Test
    public void shouldCreditAmount(){
        Money money = new Money(50F);
        Wallet wallet = new Wallet(money);
        assertEquals(new Money(70F) , wallet.credit(new Money(20F)));
    }

    @Test
    public void shouldDebitAmount(){
        Money money = new Money(50F);
        try {
            assertEquals(new Money(30F) , money.debit(new Money(20F)));
        } catch (InsufficientFundException e) {
            e.printStackTrace();
            assert(false);
        }
    }
}
