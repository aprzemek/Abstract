package com.company;

public class Kwadrat implements Ksztalt{

    double dlugoscBoku;

    public Kwadrat(double dlugoscBoku) {
    }


    @Override
    public double obliczPowierzchnie() {
        return dlugoscBoku*dlugoscBoku;
    }

    @Override
    public double obliczObwod() {
        return dlugoscBoku*4;
    }




}
