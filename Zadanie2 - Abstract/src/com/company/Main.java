package com.company;

public class Main {

    public static void main(String[] args) {


        Grafika linia = new Linia();
        Grafika prostokat = new Prostokat();

        rysujUtil(30, 30, 40, 40, linia);
        rysujUtil(50, 50, 60, 60, prostokat);
    }
    public static void rysujUtil(int x1, int y1, int x2,int y2, Grafika g ){
        g.setPcczatek(x1,y1);
        g.setKoniec(x2,y2);
        g.rysuj();

        }




}
