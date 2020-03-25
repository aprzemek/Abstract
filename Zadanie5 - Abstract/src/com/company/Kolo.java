package com.company;

public class Kolo implements Ksztalt {
    public Kolo(double promien) {
    }

    @Override
    public double obliczPowierzchnie() {
        return Math.PI * promien * promien;
    }

    @Override
    public double obliczObwod() {
        return 2 * Math.PI * promien;
    }

    double promien;
}
