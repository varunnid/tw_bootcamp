package com.tw.bootcamp.lenin_ashish;

public class Quadrilateral {
    private double length, breadth;

    public double getArea() {
        return this.length * this.breadth;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.breadth);
    }

}
