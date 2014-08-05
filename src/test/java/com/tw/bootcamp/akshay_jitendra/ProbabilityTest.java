package com.tw.bootcamp.akshay_jitendra;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by akshaydewan on 04/08/14.
 */
public class ProbabilityTest {

    private static final float delta = 0.0001f;

    @Test
    public void testEquals() {
        Probability p1 = new Probability(0.3f);
        Probability p2 = new Probability(0.3f);
        assertTrue(p1.equals(p2));
    }

    @Test
    public void shouldCalculateInverse() {
        Probability p1 = new Probability(0.2f);
        Probability result = p1.inverse();
        assertEquals(0.8, result.getValue(), delta);
    }

    @Test
    public void shouldCalculateAnd() {
        Probability p1 = new Probability(0.2f);
        Probability p2 = new Probability(0.2f);
        Probability result = p1.and(p2);
        assertEquals(0.04, result.getValue(), delta);
    }

    @Test
    public void shouldCalculateOr() {
        Probability p1 = new Probability(0.2f);
        Probability p2 = new Probability(0.5f);
        Probability result = p1.or(p2);
        assertEquals(0.6, result.getValue(), delta);
    }
}
