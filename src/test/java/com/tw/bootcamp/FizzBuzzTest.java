package com.tw.bootcamp;

import org.junit.Before;
import org.junit.Test;

import static com.tw.bootcamp.FizzBuzz.FizzBuzzResults;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){

        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldPrintNumberIfNotFizzBuzz() {
        assertEquals(FizzBuzzResults.Unknown, fizzBuzz.play(1));
    }

    @Test
    public void shouldPrintFizzIfDivisibleByThree() {
        assertEquals(FizzBuzzResults.Fizz, fizzBuzz.play(3));
    }

    @Test
    public void shouldPrintBuzzIfDivisibleByFive(){
        assertEquals(FizzBuzzResults.Buzz, fizzBuzz.play(5));
    }

    @Test
    public void shouldPrintFizzBuzzIfDivisibleByFifteen() {
        assertEquals(FizzBuzzResults.FizzBuzz, fizzBuzz.play(15));
    }
}