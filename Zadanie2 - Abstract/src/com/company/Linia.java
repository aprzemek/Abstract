package com.company;

public class Linia extends Grafika{


    @Override
    public void rysuj() {

        System.out.printf("Rysuj Linie od (%d, %d) do (%d, %d) %n", x1, y1, x2, y2);
    }
}
