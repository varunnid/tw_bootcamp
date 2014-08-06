package com.tw.bootcamp.lenin_mani_measurement;

/**
 * Created by leninraj on 8/5/14.
 */
public class Unit {

    private String type;
    private String name;
    private Double conversionRatio;

    public static final Object LENGTH = new Object();

    public static final Unit inch = new Unit("LENGTH", "INCH", 1d);
    public static final Unit feet = new Unit("LENGTH", "FEET", 12d);
    public static final Unit yard = new Unit("LENGTH", "YARD", 1200d);

    public Unit(String type, String name, Double conversionRatio) {
        this.type = type;
        this.name = name;
        this.conversionRatio = conversionRatio;
    }

    public Double convertTo(Unit unit,Double value) {
        if(!canConvert(unit)) {
            throw new IllegalArgumentException("Cannot convert from " + this.type + " to " + unit.type);
        }
        return this.conversionRatio / unit.conversionRatio * value;
    }

    public boolean canConvert(Unit unit) {
        return this.type.equals(unit.type);
    }

}
