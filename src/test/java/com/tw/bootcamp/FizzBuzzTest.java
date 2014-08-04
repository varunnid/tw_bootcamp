package com.tw.bootcamp;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){

        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldPrintNumberIfNotFizzBuzz() {
        assertEquals("1", fizzBuzz.play(1));
    }

    @Test
    public void shouldPrintFizzIfDivisibleByThree() {
        assertEquals("Fizz", fizzBuzz.play(3));
    }

    @Test
    public void shouldPrintBuzzIfDivisibleByFive(){
        assertEquals("Buzz", fizzBuzz.play(5));
    }

    @Test
    public void shouldPrintFizzBuzzIfDivisibleByFifteen() {
        assertEquals("FizzBuzz", fizzBuzz.play(15));
    }
}