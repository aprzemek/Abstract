package com.company;

public class Main {

    public static void main(String[] args) {


        Kwadrat kwadrat = new Kwadrat(50);
        System.out.println(kwadrat.obliczObwod());
        System.out.println(kwadrat.obliczPowierzchnie());
        

        Kolo kolo = new Kolo(50);
        kolo.obliczObwod();
        kolo.obliczPowierzchnie();

    }
}
