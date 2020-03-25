package com.company;

public class Main {

    public static void main(String[] args) {

        int[] tablica = {10, 20, 30, 10, 20};
        int szukany = 30;

        Wyszukiwanie wyszukiwanie = new WyszukiwanieRownych();

        var index = wyszukiwanie.szukaj(tablica, szukany);
        if (index == -1) {System.out.printf("Nie znaleziono");}
        System.out.printf("Znaleziono w indeksie numer " + index);
    }
}
