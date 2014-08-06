package com.tw.bootcamp.lenin_mani_measurement;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/6/14
 * Time: 9:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class AddableMeasurement extends Measurement implements Addable {

    public AddableMeasurement(double value, Unit unit) {
        super(value, unit);
    }

    @Override
    public AddableMeasurement add(AddableMeasurement addableMeasurement) {
        addableMeasurement = (AddableMeasurement) addableMeasurement.convertTo(this.unit);
        return new AddableMeasurement(this.value + addableMeasurement.value, this.unit);
    }
}
