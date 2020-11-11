package com.sp.maxsat.satisfaction;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Formula {
    private int first;
    private int second;
    private int third;

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
