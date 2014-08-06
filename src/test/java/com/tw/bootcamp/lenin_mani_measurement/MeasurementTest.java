package com.tw.bootcamp.lenin_mani_measurement;

import org.junit.Test;

import static com.tw.bootcamp.lenin_mani_measurement.Unit.feet;
import static com.tw.bootcamp.lenin_mani_measurement.Unit.inch;
import static com.tw.bootcamp.lenin_mani_measurement.Unit.yard;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/6/14
 * Time: 9:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class MeasurementTest {

    @Test
    public void shouldConvertFeetToInch() {
        Measurement measurement = new Measurement(5d, feet);
        assertEquals(new Measurement(60d, inch), measurement.convertTo(inch));
    }

}
