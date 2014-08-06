package com.tw.bootcamp.lenin_mani_measurement;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static com.tw.bootcamp.lenin_mani_measurement.Unit.*;
import static org.junit.Assert.assertEquals;

public class UnitTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Test
    public void shouldConvertFeetToInch() {
        assertEquals(60d, feet.convertTo(inch, 5d), 0);
    }

    @Test
    public void shouldConvertYardToInch() {
        assertEquals(6000d, yard.convertTo(inch, 5d), 0);
    }

    @Test
    public void shouldConvertFeetToYard() {
        assertEquals(0.05d, feet.convertTo(yard, 5d), 0);
    }

    @Test
    public void shouldConvertInchToInch() {
        assertEquals(5d, inch.convertTo(inch, 5d), 0);
    }

    @Test
    public void shouldConvertFeetToDummy() {
        Unit dummy = new Unit("DUMMY", "DUMMY", 12d);
        exception.expect(IllegalArgumentException.class);
        dummy.convertTo(inch, 5d);
    }

}