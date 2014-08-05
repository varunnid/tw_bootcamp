package com.tw.bootcamp.lenin_avinash;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void shouldHaveValidWallet() {
        Customer customer = new Customer(1200d);
        customer.giveMoneyToAgent();
        assertEquals(200d,customer.getBalance(),0);
    }

}