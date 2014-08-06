package com.tw.bootcamp.lenin_mani;

import org.junit.Test;

import static com.tw.bootcamp.lenin_mani.Length.Unit.INCH;
import static org.junit.Assert.assertEquals;

public class LengthTest {

    @Test
    public void shouldStoreInInch(){
        Length length = new Length(12d, INCH);
        assertEquals(new Length(12d,INCH),length);
    }

    @Test
    public void shouldStoreInYard(){
        Length length = new Length(12d, INCH);
        assertEquals(new Length(122d,INCH),length);
    }

}