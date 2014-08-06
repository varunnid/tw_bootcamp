package com.tw.bootcamp.lenin_mani_measurement;

import org.junit.Test;

import static com.tw.bootcamp.lenin_mani_measurement.Unit.inch;
import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/6/14
 * Time: 9:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class AddableMeasurementTest {

    @Test
    public void shouldAddInches(){
        AddableMeasurement addableMeasurement1 = new AddableMeasurement(5d, inch);
        AddableMeasurement addableMeasurement2 = new AddableMeasurement(7d, inch);
        assertEquals(new Measurement(12d, inch),addableMeasurement1.add(addableMeasurement2));
    }
}
