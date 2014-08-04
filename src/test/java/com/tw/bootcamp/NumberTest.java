package com.tw.bootcamp;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void shouldReturnTrueIfTheNumberIsEven() {
        Number number = new Number(0);
        assertTrue(number.isEven());
    }

    @Test
    public void shouldReturnFalseIfTheNumberIsOdd() {
        Number number = new Number(1);
        assertFalse(number.isEven());
    }

}