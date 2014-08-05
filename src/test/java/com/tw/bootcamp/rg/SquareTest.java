package com.tw.bootcamp.rg;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void shouldReturnAreaGreaterThanZero() {
        Square square = new Square(1.0);
        assertEquals(1.0, square.area(), 0);
    }

    @Test
    public void shouldReturnPerimeterGreaterThanZero() {
        Square square = new Square(1.0);
        assertEquals(4.0, square.perimeter(), 0);
    }

}