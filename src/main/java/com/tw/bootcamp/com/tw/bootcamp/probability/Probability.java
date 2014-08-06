package com.tw.bootcamp.com.tw.bootcamp.probability;

/**
 * Created with IntelliJ IDEA.
 * User: maniarav
 * Date: 8/4/14
 * Time: 5:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Probability {
    private double probability;

    double getProbability(){
        return probability;
    }
    public Probability(double probability){
        if(probability >=0 && probability <= 1){
            this.probability = probability;
        }
        else{
            throw new IllegalArgumentException("Invalid Probability");
        }
    }         // !(!A && !B)

    public Probability or(Probability inputProbability){
         return new Probability(this.probability + inputProbability.probability - this.and(inputProbability).probability);
    }

    public Probability and(Probability inputProbability){
        return new Probability(this.probability * inputProbability.probability);
    }

    public Probability not (){
        return new Probability(1 - this.probability);
    }

}
