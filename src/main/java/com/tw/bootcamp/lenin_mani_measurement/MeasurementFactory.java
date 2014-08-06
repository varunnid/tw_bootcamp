package com.tw.bootcamp.lenin_mani_measurement;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/6/14
 * Time: 10:24 AM
 * To change this template use File | Settings | File Templates.
 */
public class MeasurementFactory {

    public static Measurement createInstance(double value, Unit unit) {
        if (unit == Unit.inch) {
            return new AddableMeasurement(value, Unit.inch);
        }
        return null;
    }
}
