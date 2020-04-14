package com.company;

public class SprawdzenieRownych implements Sprawdzenie{
    @Override
    public boolean porownaj(int pierwszy, int drugi) {
        if (pierwszy == drugi) {
            return true;
        } else {
            return false;
        }

    }
}
