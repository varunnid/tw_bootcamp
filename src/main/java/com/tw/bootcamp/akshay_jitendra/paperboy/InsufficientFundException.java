package com.tw.bootcamp.akshay_jitendra.paperboy;

/**
 * Created by akshaydewan on 05/08/14.
 */
public class InsufficientFundException extends Exception {

    public InsufficientFundException() {
    }

    public InsufficientFundException(String s) {
        super(s);
    }

    public InsufficientFundException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public InsufficientFundException(Throwable throwable) {
        super(throwable);
    }
}
