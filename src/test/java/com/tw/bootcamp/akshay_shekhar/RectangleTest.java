package com.tw.bootcamp.akshay_shekhar;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by akshaydewan on 04/08/14.
 */
public class RectangleTest {
//    private  Rectangle rect;
//    @Before
//    public void setup(){
//         rect = new Rectangle(1,1);
//    }

    @Test
    public void shouldCalculateArea(){

        Rectangle rect = new Rectangle(6,2);
        assertEquals(12, rect.calcArea(), 0);
    }
}
