package com.sunbin.designtest.kaiBiYuanZe;

public class CalculationArea implements ICalculationArea {
    private final static double pi = 3.14D;

    @Override
    public double rectangle(double x, double y) {
        return x * y;
    }

    @Override
    public double triangle(double x, double y, double z) {
        double p = (x + y + z) / 2;
        return Math.sqrt(p * (p - x) * (p - y) * (p - z));
    }

    @Override
    public double circular(double r) {
        return pi * r * r;
    }
}
