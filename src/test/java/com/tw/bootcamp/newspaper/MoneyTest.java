package com.tw.bootcamp.newspaper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/5/14
 * Time: 10:59 AM
 * To change this template use File | Settings | File Templates.
 */
public class MoneyTest {

    @Test (expected =  IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentException() {
           Money money = new Money(-45F);
    }

    @Test
    public void shouldCreditAmount(){
        Money money = new Money(50F);
        assertEquals(new Money(70F) , money.credit(new Money(20F)));
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
