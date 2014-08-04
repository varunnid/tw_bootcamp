package com.tw.bootcamp.rg;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void shouldReturnAreaGreaterThanZero() {
        Rectangle rectangle = new Rectangle(1.0, 1.0);
        assertEquals(1.0, rectangle.area(), 0);
    }

    @Test
    public void shouldReturnPerimeterGreaterThanZero() {
        Rectangle rectangle = new Rectangle(1.0, 1.0);
        assertEquals(4.0, rectangle.perimeter(), 0);
    }

}