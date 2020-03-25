package com.company;

public class WyszukiwanieNierownych extends Wyszukiwanie {
    @Override
    public boolean porownaj(int arg1, int arg2) {
        if(arg1!=arg2) {return true;
        }
        return false;
    }
}
