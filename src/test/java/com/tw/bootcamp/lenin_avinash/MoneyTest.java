package com.tw.bootcamp.lenin_avinash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void shouldCreateMoney() {
        Money money = new Money(100d);
        assertEquals(100d,money.getValue(),0);
    }


}