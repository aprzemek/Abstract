package com.company;

public class MojKalkulator implements Kalkulator {


    @Override
    public double dodaj(double arg1, double arg2) {
        return arg1+arg2;
    }

    @Override
    public double odejmij(double arg1, double arg2) {
        return arg1-arg2;
    }

    public double sinus(double kat){

        double radians = Math.toRadians(kat);
        return Math.sin(radians);
    }

}

