package com.sp.maxsat.satisfaction.formulas;


public abstract class Formula {
    private int first;
    private int second;
    private int third;

    public Formula(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public int getThird() {
        return third;
    }

    public int getSecond() {
        return second;
    }

    public int getFirst() {
        return first;
    }
}
