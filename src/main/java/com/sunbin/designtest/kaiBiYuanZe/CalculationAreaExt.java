package com.sunbin.designtest.kaiBiYuanZe;

public class CalculationAreaExt extends CalculationArea {
    private final static double pi = 3.1415926D;

    @Override
    public double circular(double r) {
        return pi * r * r;
    }
}
