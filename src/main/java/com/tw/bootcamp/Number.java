package com.tw.bootcamp;

public class Number {
    private Integer value;

    public Number(Integer value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }
}
