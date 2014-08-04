package com.tw.bootcamp.akshay_shekhar;

/**
 * Created by akshaydewan on 04/08/14.
 */
public class Rectangle {


    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    private double length;
    private double breadth;


    public double calcArea() {
        return length * breadth;
    }
}
