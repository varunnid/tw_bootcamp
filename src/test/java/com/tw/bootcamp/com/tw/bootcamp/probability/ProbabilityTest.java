package com.tw.bootcamp.com.tw.bootcamp.probability;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/4/14
 * Time: 5:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProbabilityTest {

    @Test
    public void testAndValid() throws Exception {
    Probability  probabilityA = new Probability(0.4);
    Probability  probabilityB = new Probability(0.5);
    assertEquals(Double.valueOf(0.2), Double.valueOf(probabilityA.and(probabilityB).getProbability()));
    }

    @Test
    public void testOrValid() throws Exception {
        Probability  probabilityA = new Probability(0.4);
        Probability  probabilityB = new Probability(0.5);
        assertEquals(Double.valueOf(0.7), Double.valueOf(probabilityA.or(probabilityB).getProbability()));
    }

    @Test
    public void testAndInvalid() throws Exception {
        Probability  probabilityA = new Probability(0.4);
        Probability  probabilityB = new Probability(0.5);
        assertNotEquals(Double.valueOf(0.9), Double.valueOf(probabilityA.and(probabilityB).getProbability()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowInvalidArgumentException() {
      Probability probabilityA = new Probability(9.7);
    }

    @Test
    public void testNotValid() throws Exception {
    Probability probabilityA = new Probability(0.1);
    assertEquals(Double.valueOf(0.9),Double.valueOf(probabilityA.not().getProbability()));
    }

    @Test
    public void testNotInvalid() throws Exception {
        Probability probabilityA = new Probability(0.1);
        assertNotEquals(Double.valueOf(0.4),Double.valueOf(probabilityA.not().getProbability()));
    }
}
