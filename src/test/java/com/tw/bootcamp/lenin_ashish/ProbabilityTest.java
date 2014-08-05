package com.tw.bootcamp.lenin_ashish;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProbabilityTest {

//    @Test
//    public void shouldDoAndOperation() {
//        Probability probability = Probability.andOperation(0.5,0.6);
//        assertEquals(0.3, probability.getProbability(), 0);
//    }

    @Test
    public void shouldDoOrOperation() {
        Probability p1 = new Probability(.5d);
        Double p = new Probability(0.6d).orOperation(p1);
        assertEquals(0.8,p,0);
    }

//    @Test
//    public void shouldDoNotOperation() {
//        Probability probability = Probability.notOperation(0.6);
//        assertEquals(0.4,probability.getProbability(),0);
//    }

    @Test
    public void shouldReturnZeroForInvalidProbability() {
        assertEquals(0,new Probability(1.1).getProbability(),0);
    }


}