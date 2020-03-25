package com.company;

public class Main {

    public static void main(String[] args) {

        MojKalkulator mojKalkulator = new MojKalkulator();

        System.out.println(mojKalkulator.dodaj(10, 20));
        System.out.println(mojKalkulator.odejmij(20, 20));
        System.out.println(mojKalkulator.sinus(10));

        Kalkulator nowyKalkulator = new MojKalkulator();

        System.out.println(nowyKalkulator.dodaj(10,20));
        System.out.println(nowyKalkulator.odejmij(20,20));

    }

}