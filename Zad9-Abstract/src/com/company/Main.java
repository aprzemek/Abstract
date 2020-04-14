package com.company;

public class Main {

    public static void main(String[] args) {

    int[] tablica = {10, 20, 30, 10, 20};

    int szukany = 30;

    Wyszukiwanie wyszukiwanie = new Wyszukiwanie();

        int index = wyszukiwanie.szukaj(tablica, szukany, new SprawdzenieRownych());
        if (index == -1) {
            System.out.println("Nie znaleziono");
        } else {
            System.out.println("Znaleziono w indeksie numer: " + index);
        }
    }
}