package com.sp.maxsat.satisfaction.formulas;

public class WeightedFormula extends Formula {
    private int weight;

    public WeightedFormula(int first, int second, int third, int weight) {
        super(first, second, third);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
