package com.tw.bootcamp;

public class FizzBuzz {
    public enum FizzBuzzResults {
        Fizz, Buzz, FizzBuzz, Unknown
    }

    public FizzBuzzResults play(int number) {
        if(number % 15 == 0) {
            return FizzBuzzResults.FizzBuzz;
        }
        if (number % 3 == 0) {
            return FizzBuzzResults.Fizz;
        }
        if (number % 5 == 0) {
            return FizzBuzzResults.Buzz;
        }
        return FizzBuzzResults.Unknown;
    }
}
