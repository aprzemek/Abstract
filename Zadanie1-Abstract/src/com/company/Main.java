package com.company;

public class Main {

    public static void main(String[] args) {


        Podstawowa b = new Pochodna1();

        b.f();
        b.g();
        b.h();

        Pochodna d = new Pochodna1();

        d.f();
        d.g();
        d.h();

        Pochodna1 d1 = new Pochodna1();

        d1.f();
        d1.g();
        d1.h();
    }
}
