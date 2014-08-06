package com.tw.bootcamp.lenin_mani;

import java.util.HashMap;

/**
 * Created by leninraj on 8/5/14.
 */
public class Length {

    private Double value;
    private Unit unit;

    public static enum Unit {
        INCH("inch"), FOOT("foot"), YARD("yard");
        private String name;

        Unit(String name) {

            this.name = name;

        }
    }

    private static HashMap<Unit, Double> lengthConversions;

    public Length(Double value, Unit unit) {
        this.value = value;
        this.unit = unit;
        initializeConversions();
    }

    private static void initializeConversions() {
        lengthConversions = new HashMap<Unit, Double>(3);
        lengthConversions.put(Unit.INCH, 1d);
        lengthConversions.put(Unit.FOOT, 12d);
        lengthConversions.put(Unit.YARD, 1200d);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        if (unit != length.unit) return false;
        if (value != null ? !value.equals(length.value) : length.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

    public Length convertTo(Unit targetUnit) {
        convertFromLowestUnit(targetUnit);
        return new Length(value, targetUnit);
    }

    private void convertToLowestUnit() {
        value = value * lengthConversions.get(unit);
    }

    private void convertFromLowestUnit(Unit unit) {

        convertToLowestUnit();
        value = value / lengthConversions.get(unit);
    }
}
