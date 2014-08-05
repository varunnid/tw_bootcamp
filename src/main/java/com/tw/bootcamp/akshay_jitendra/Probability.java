package com.tw.bootcamp.akshay_jitendra;

/**
 * Created by akshaydewan on 04/08/14.
 */
public class Probability {

    private final float value;

    public Probability(float value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        if (Float.compare(that.value, value) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (value != +0.0f ? Float.floatToIntBits(value) : 0);
    }

    public float getValue() {
        return this.value;
    }

    public Probability inverse() {
        return new Probability(1 - value);
    }

    public Probability and(Probability other) {
        float result =  this.getValue() * other.getValue();
        return new Probability(result);
    }

    public Probability or(Probability other) {
//        return new Probability(this.value+other.value
//                -(this.and(other)).value);
        return this.inverse().and(other.inverse()).inverse();
    }
}
