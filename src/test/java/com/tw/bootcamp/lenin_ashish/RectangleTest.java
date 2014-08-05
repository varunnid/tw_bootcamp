package com.tw.bootcamp.lenin_ashish;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void shouldReturnArea() {
        Rectangle rectangle = new Rectangle(10.24, 20.01);
        assertEquals(new Float(rectangle.getArea()), new Float(204.9024));
    }

    @Test
    public void shouldReturnPerimeter() {
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(new Float(rectangle.getPerimeter()), new Float(60.0));
    }


}