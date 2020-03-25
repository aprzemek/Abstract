package com.company;

public abstract class Grafika {

    protected int x1, y1, x2, y2;


    public void setPcczatek(int arg1, int arg2) {
        x1 = arg1;
        y1 = arg2;
    }

    public void setKoniec(int arg2, int arg3) {
        x2 = arg2;
        y2 = arg3;
    }

    public abstract void rysuj();

}
