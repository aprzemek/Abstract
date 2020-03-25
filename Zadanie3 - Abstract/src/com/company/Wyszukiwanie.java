package com.company;

public abstract class Wyszukiwanie {

    public abstract boolean porownaj(int arg1, int arg2);


    public int szukaj(int a[], int ele) {

        for (int i = 0; i < a.length; i++) {
            if (porownaj(a[i], ele)) {
                return i;
            }
        }
        return -1;


    }



}

