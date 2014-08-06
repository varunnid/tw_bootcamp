package com.tw.bootcamp.lenin_mani_measurement;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/6/14
 * Time: 9:36 AM
 * To change this template use File | Settings | File Templates.
 */
public class Measurement {
    double value;
    Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;

        if (Double.compare(that.value, value) != 0) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = value != +0.0d ? Double.doubleToLongBits(value) : 0L;
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

    public Measurement convertTo(Unit inputUnit){
        return new Measurement(unit.convertTo(inputUnit, value), inputUnit);
    }
}
