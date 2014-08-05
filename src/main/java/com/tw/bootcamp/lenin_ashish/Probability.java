package com.tw.bootcamp.lenin_ashish;

/**
 * Created by leninraj on 8/4/14.
 */
public class Probability {

    private Double probabilityResult;

    public Probability(Double p) {
        if (p >= 0 && p <= 1) {
            this.probabilityResult = p;
        } else {
            this.probabilityResult = 0d;
        }
    }

    public Double getProbability() {
        return probabilityResult;
    }

    public Double andOperation(Probability otherProbability) {

        return probabilityResult * otherProbability.getProbability();
    }

    public Double orOperation(Probability otherProbability) {
        return probabilityResult + otherProbability.getProbability() - andOperation(otherProbability);
    }

//    public Double notOperation(double pA) {
//        return new Probability(1.0 - pA);
//    }

}
