package com.company;

public class Wyszukiwanie {

    int szukaj(int[] a, int szukany, Sprawdzenie sprawdzenie){
        for(int i=0; i < a.length; i++) {
            if ( sprawdzenie.porownaj(a[i], szukany) ) {
                return i; } }
                return -1;
    }
    }
